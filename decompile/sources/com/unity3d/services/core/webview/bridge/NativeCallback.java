package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class NativeCallback {
    private static AtomicInteger _callbackCount = new AtomicInteger(0);
    private Method _callback;
    private String _id;
    private final INativeCallbackSubject _nativeCallbackSubject;

    public NativeCallback(Method method) {
        this(method, SharedInstances.INSTANCE.getWebViewAppNativeCallbackSubject());
    }

    public String getId() {
        return this._id;
    }

    public void invoke(String str, Object... objArr) {
        Object[] array;
        try {
            CallbackStatus valueOf = CallbackStatus.valueOf(str);
            if (objArr == null) {
                array = new Object[]{valueOf};
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
                arrayList.add(0, valueOf);
                array = arrayList.toArray();
            }
            this._callback.invoke(null, array);
            this._nativeCallbackSubject.remove(this);
        } catch (Exception e10) {
            DeviceLog.error("Illegal status");
            this._nativeCallbackSubject.remove(this);
            throw e10;
        }
    }

    public NativeCallback(Method method, INativeCallbackSubject iNativeCallbackSubject) {
        this._callback = method;
        this._id = this._callback.getName().toUpperCase(Locale.US) + "_" + _callbackCount.getAndIncrement();
        this._nativeCallbackSubject = iNativeCallbackSubject;
    }
}
