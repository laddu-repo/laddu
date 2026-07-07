package n9;

import android.os.RemoteException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9310x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h3 f9311y;

    public /* synthetic */ f3(h3 h3Var, int i6) {
        this.f9310x = i6;
        this.f9311y = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9310x) {
            case 0:
                this.f9311y.j1();
                return;
            case 1:
                h3 h3Var = this.f9311y;
                n1 n1Var = (n1) h3Var.f4301y;
                h0 h0Var = h3Var.B;
                if (h0Var == null) {
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.D.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    h0Var.v(h3Var.t1(false));
                    h3Var.q1();
                    return;
                } catch (RemoteException e10) {
                    u0 u0Var2 = n1Var.C;
                    n1.g(u0Var2);
                    u0Var2.D.b(e10, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                h3 h3Var2 = this.f9311y;
                n1 n1Var2 = (n1) h3Var2.f4301y;
                h0 h0Var2 = h3Var2.B;
                if (h0Var2 == null) {
                    u0 u0Var3 = n1Var2.C;
                    n1.g(u0Var3);
                    u0Var3.D.a("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    h0Var2.o(h3Var2.t1(false));
                    h3Var2.q1();
                    return;
                } catch (RemoteException e11) {
                    u0 u0Var4 = n1Var2.C;
                    n1.g(u0Var4);
                    u0Var4.D.b(e11, "Failed to send storage consent settings to the service");
                    return;
                }
        }
    }
}
