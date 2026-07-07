package n9;

import android.os.Handler;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.h0 f9424d;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f9425a;

    /* renamed from: b, reason: collision with root package name */
    public final hb.s f9426b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f9427c;

    public p(v1 v1Var) {
        w8.x.g(v1Var);
        this.f9425a = v1Var;
        this.f9426b = new hb.s(this, v1Var, 11, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            v1 v1Var = this.f9425a;
            v1Var.D0().getClass();
            this.f9427c = System.currentTimeMillis();
            if (!d().postDelayed(this.f9426b, j)) {
                v1Var.r().D.b(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }

    public final void c() {
        this.f9427c = 0L;
        d().removeCallbacks(this.f9426b);
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.h0 h0Var;
        if (f9424d != null) {
            return f9424d;
        }
        synchronized (p.class) {
            try {
                if (f9424d == null) {
                    f9424d = new com.google.android.gms.internal.measurement.h0(this.f9425a.o0().getMainLooper(), 0);
                }
                h0Var = f9424d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h0Var;
    }
}
