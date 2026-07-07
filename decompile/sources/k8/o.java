package k8;

import android.os.Handler;
import com.google.android.gms.internal.measurement.t6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile t6 f7661d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f7662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.m0 f7663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f7664c;

    public o(z1 z1Var) {
        t7.y.g(z1Var);
        this.f7662a = z1Var;
        this.f7663b = new da.m0(this, z1Var, false, 7);
    }

    public abstract void a();

    public final void b(long j8) {
        c();
        if (j8 >= 0) {
            z1 z1Var = this.f7662a;
            z1Var.g().getClass();
            this.f7664c = System.currentTimeMillis();
            if (d().postDelayed(this.f7663b, j8)) {
                return;
            }
            z1Var.c().B.b(Long.valueOf(j8), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f7664c = 0L;
        d().removeCallbacks(this.f7663b);
    }

    public final Handler d() {
        t6 t6Var;
        if (f7661d != null) {
            return f7661d;
        }
        synchronized (o.class) {
            try {
                if (f7661d == null) {
                    f7661d = new t6(this.f7662a.e().getMainLooper(), 0);
                }
                t6Var = f7661d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t6Var;
    }
}
