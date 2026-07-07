package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class x6 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f2522a;

    public x6(Unsafe unsafe) {
        this.f2522a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b10);

    public abstract boolean b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z10);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, float f3);

    public abstract double f(long j, Object obj);

    public abstract void g(Object obj, long j, double d10);
}
