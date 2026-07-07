package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i1 implements Runnable {
    public final /* synthetic */ l1 A;

    /* renamed from: x, reason: collision with root package name */
    public final long f2254x;

    /* renamed from: y, reason: collision with root package name */
    public final long f2255y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2256z;

    public i1(l1 l1Var, boolean z10) {
        Objects.requireNonNull(l1Var);
        this.A = l1Var;
        this.f2254x = System.currentTimeMillis();
        this.f2255y = SystemClock.elapsedRealtime();
        this.f2256z = z10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.A;
        if (l1Var.f2332d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            l1Var.d(e10, false, this.f2256z);
            b();
        }
    }

    public void b() {
    }
}
