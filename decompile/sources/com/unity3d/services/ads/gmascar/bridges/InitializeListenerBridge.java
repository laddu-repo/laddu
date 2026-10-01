package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class InitializeListenerBridge extends GenericBridge {
    private static final String initializationCompleteMethodName = "onInitializationComplete";
    private IInitializationStatusListener _initializationStatusListener;

    public InitializeListenerBridge() {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.1
            {
                try {
                    put(InitializeListenerBridge.initializationCompleteMethodName, new Class[]{Class.forName("com.google.android.gms.ads.initialization.InitializationStatus")});
                } catch (ClassNotFoundException e10) {
                    DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e10.getLocalizedMessage());
                }
            }
        });
    }

    public Object createInitializeListenerProxy() {
        try {
            return Proxy.newProxyInstance(classForName().getClassLoader(), new Class[]{classForName()}, new InvocationHandler() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.2
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(InitializeListenerBridge.initializationCompleteMethodName) && InitializeListenerBridge.this._initializationStatusListener != null) {
                        InitializeListenerBridge.this._initializationStatusListener.onInitializationComplete(objArr[0]);
                        return null;
                    }
                    return null;
                }
            });
        } catch (Exception unused) {
            DeviceLog.debug("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    public void setStatusListener(IInitializationStatusListener iInitializationStatusListener) {
        this._initializationStatusListener = iInitializationStatusListener;
    }
}
