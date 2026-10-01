package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends g1 {
    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(long j8, Object obj) {
        return this.f770a.getBoolean(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final double d(long j8, Object obj) {
        return this.f770a.getDouble(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final float e(long j8, Object obj) {
        return this.f770a.getFloat(obj, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void j(Object obj, long j8, boolean z2) {
        this.f770a.putBoolean(obj, j8, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void k(Object obj, long j8, byte b9) {
        this.f770a.putByte(obj, j8, b9);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void l(Object obj, long j8, double d10) {
        this.f770a.putDouble(obj, j8, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void m(Object obj, long j8, float f) {
        this.f770a.putFloat(obj, j8, f);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f770a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            h1.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean r() {
        Unsafe unsafe = this.f770a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (h1.g() != null) {
                    try {
                        Class<?> cls3 = this.f770a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        h1.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                h1.a(th2);
            }
        }
        return false;
    }
}
