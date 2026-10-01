package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f3116a;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        } finally {
            f3116a = method;
        }
    }
}
