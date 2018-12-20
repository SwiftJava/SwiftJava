//
//  AppDelegate.swift
//  SwiftJava
//
//  Created by John Holdsworth on 13/07/2016.
//  Copyright (c) 2016 John Holdsworth. All rights reserved.
//

import Cocoa

import java_lang
import java_sql

@NSApplicationMain
class AppDelegate: NSObject, NSApplicationDelegate, NSTableViewDataSource, NSTableViewDelegate {

    @IBOutlet weak var window: NSWindow!
    @IBOutlet weak var tableView: NSTableView!

    @IBOutlet weak var classPath: NSTextField!
    @IBOutlet weak var driverClass: NSTextField!
    @IBOutlet weak var connectionURL: NSTextField!
    @IBOutlet weak var username: NSTextField!
    @IBOutlet weak var password: NSTextField!
    @IBOutlet weak var SQL: NSTextField!

    class Model {
        var columnNames = [String]()
        var indexByColumn = [NSTableColumn:Int]()
        var data = [[String]]()
    }

    var model: Model!

    func applicationDidFinishLaunching(_ aNotification: Notification) {
        // Insert code here to initialize your application
        tableView.rowHeight = 22
    }

    func alert( _ msg: String ) {
        DispatchQueue.main.async {
            print( "Alert: \(msg)" )
            let alert = NSAlert()
            alert.messageText = "JDBC Example"
            alert.informativeText = msg
            alert.runModal()
        }
    }

    @IBAction func fetch( sender: AnyObject ) {

        let home = String( cString: getenv("HOME") )
        let classPath = self.classPath.stringValue.replacingOccurrences( of: "~", with: home )

        classPath.withCString {
            _ = setenv( "CLASSPATH", $0, 1 )
        }

        if model == nil && !JNI.initJVM() {
            alert( "Could not initialise JVM" )
            return
        }

        // Use Thread class to run in background to get the correct class loader & classpath
        JavaThread( {

            do {
                if try JavaClass.forName( self.driverClass.stringValue ) == nil {
                    return self.alert( "Could not load driver class" );
                }

//                let cl = Object().getClass().getClassLoader()
//                _ = try cl?.loadClass( self.driverClass.stringValue ).newInstance()

                guard let connection = try DriverManager.getConnection( self.connectionURL.stringValue,
                                                                        self.username.stringValue, self.password.stringValue )
                    else { return self.alert( "Unable to connect using information supplied, consult console" ) }

                let statement = try connection.createStatement()!
                if !(try statement.execute( sql: self.SQL.stringValue )) {
                    return self.alert( "Could not execute SQL: \(self.SQL.stringValue)" );
                }

                let model = Model()

                repeat {

                    if let result = try statement.getResultSet(), let md = try result.getMetaData() {
                        let ncols = try md.getColumnCount()
                        for i in 1...ncols {
                            model.columnNames.append( try md.getColumnName(column: i) ?? "Column \(i)" )
                        }

                        while try result.next() {
                            var row = [String]()
                            for i in 1...ncols {
                                row.append( try result.getString( columnIndex: i ) ?? "null" )
                            }
                            model.data.append( row )
                        }
                    }

                } while try statement.getMoreResults()

                try connection.close()

                DispatchQueue.main.async {
                    for column in self.tableView.tableColumns {
                        self.tableView.removeTableColumn( column )
                    }

                    self.model = model
                    self.tableView.noteNumberOfRowsChanged()

                    for i in 0..<model.columnNames.count {
                        let columnName = model.columnNames[i]
                        let column = NSTableColumn(identifier: NSUserInterfaceItemIdentifier(rawValue: columnName))
                        column.title = columnName
                        model.indexByColumn[column] = i
                        self.tableView.addTableColumn(column)
                    }

                    self.tableView.reloadData()
                    System.gc()
                }
            }
            catch let e as Exception {
                self.alert( "\(e.className): \(e.getMessage()!)" )
                e.printStackTrace()
            }
            catch {
                self.alert("Some other error")
            }
        } ).start()
    }

    func numberOfRows(in tableView: NSTableView) -> Int {
        return model?.data.count ?? 0
    }

    func tableView(_ tableView: NSTableView, viewFor tableColumn: NSTableColumn?, row: Int) -> NSView? {
        let view = NSTextField()
        view.stringValue = model.data[row][model.indexByColumn[tableColumn!]!]
        return view
    }

    func applicationWillTerminate(_ aNotification: Notification) {
        // Insert code here to tear down your application
    }

}

