package com.google.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o4 extends p4 {
    @Override // com.google.protobuf.p4
    public final void c(long j, byte[] bArr, long j10, long j11) {
        this.f3019a.copyMemory((Object) null, j, bArr, q4.f3027f + j10, j11);
    }

    @Override // com.google.protobuf.p4
    public final void d(byte[] bArr, long j, long j10, long j11) {
        this.f3019a.copyMemory(bArr, q4.f3027f + j, (Object) null, j10, j11);
    }

    @Override // com.google.protobuf.p4
    public final boolean e(long j, Object obj) {
        return this.f3019a.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.p4
    public final byte f(long j) {
        return this.f3019a.getByte(j);
    }

    @Override // com.google.protobuf.p4
    public final byte g(long j, Object obj) {
        return this.f3019a.getByte(obj, j);
    }

    @Override // com.google.protobuf.p4
    public final double h(long j, Object obj) {
        return this.f3019a.getDouble(obj, j);
    }

    @Override // com.google.protobuf.p4
    public final float i(long j, Object obj) {
        return this.f3019a.getFloat(obj, j);
    }

    @Override // com.google.protobuf.p4
    public final long k(long j) {
        return this.f3019a.getLong(j);
    }

    @Override // com.google.protobuf.p4
    public final void o(Object obj, long j, boolean z10) {
        this.f3019a.putBoolean(obj, j, z10);
    }

    @Override // com.google.protobuf.p4
    public final void p(long j, byte b10) {
        this.f3019a.putByte(j, b10);
    }

    @Override // com.google.protobuf.p4
    public final void q(Object obj, long j, byte b10) {
        this.f3019a.putByte(obj, j, b10);
    }

    @Override // com.google.protobuf.p4
    public final void r(Object obj, long j, double d10) {
        this.f3019a.putDouble(obj, j, d10);
    }

    @Override // com.google.protobuf.p4
    public final void s(Object obj, long j, float f3) {
        this.f3019a.putFloat(obj, j, f3);
    }

    @Override // com.google.protobuf.p4
    public final boolean w() {
        if (!super.w()) {
            return false;
        }
        try {
            Class<?> cls = this.f3019a.getClass();
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
            q4.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.p4
    public final boolean x() {
        Unsafe unsafe = this.f3019a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (q4.f() != null) {
                    try {
                        Class<?> cls3 = this.f3019a.getClass();
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
                        q4.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                q4.a(th2);
            }
        }
        return false;
    }
}
