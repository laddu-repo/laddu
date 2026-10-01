package n9;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e3 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9290x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h0 f9291y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g3 f9292z;

    public /* synthetic */ e3(g3 g3Var, h0 h0Var, int i6) {
        this.f9290x = i6;
        this.f9291y = h0Var;
        this.f9292z = g3Var;
    }

    private final void a() {
        g3 g3Var = this.f9292z;
        synchronized (g3Var) {
            try {
                g3Var.f9328x = false;
                h3 h3Var = g3Var.f9330z;
                if (!h3Var.u1()) {
                    u0 u0Var = ((n1) h3Var.f4301y).C;
                    n1.g(u0Var);
                    u0Var.L.a("Connected to service");
                    h0 h0Var = this.f9291y;
                    h3Var.d1();
                    h3Var.B = h0Var;
                    h3Var.q1();
                    h3Var.s1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9290x) {
            case 0:
                a();
                return;
            default:
                g3 g3Var = this.f9292z;
                synchronized (g3Var) {
                    try {
                        g3Var.f9328x = false;
                        h3 h3Var = g3Var.f9330z;
                        if (!h3Var.u1()) {
                            u0 u0Var = ((n1) h3Var.f4301y).C;
                            n1.g(u0Var);
                            u0Var.K.a("Connected to remote service");
                            h0 h0Var = this.f9291y;
                            h3Var.d1();
                            h3Var.B = h0Var;
                            h3Var.q1();
                            h3Var.s1();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                h3 h3Var2 = this.f9292z.f9330z;
                ScheduledExecutorService scheduledExecutorService = h3Var2.E;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    h3Var2.E = null;
                    return;
                }
                return;
        }
    }
}
