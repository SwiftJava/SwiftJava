
/// interface java.lang.reflect.InvocationHandler ///

package org.swiftjava.java_lang;

@SuppressWarnings("JniMissingFunction")
public class InvocationHandlerProxy implements java.lang.reflect.InvocationHandler {

    long __swiftObject;

    InvocationHandlerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract java.lang.Object java.lang.reflect.InvocationHandler.invoke(java.lang.Object,java.lang.reflect.Method,java.lang.Object[]) throws java.lang.Throwable

    public native java.lang.Object __invoke( long __swiftObject, java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args );

    public java.lang.Object invoke( java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args ) throws java.lang.Throwable {
        return __invoke( __swiftObject, proxy, method, args );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
