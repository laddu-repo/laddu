package com.unity3d.services.core.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class GenericListenerProxy implements InvocationHandler {
    public abstract Class<?> getProxyClass();

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(getProxyClass().getClassLoader(), new Class[]{getProxyClass()}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return method.invoke(this, objArr);
    }
}
