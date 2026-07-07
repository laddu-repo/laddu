package n9;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9200x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l4 f9201y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h3 f9202z;

    public /* synthetic */ c3(h3 h3Var, l4 l4Var, int i6) {
        this.f9200x = i6;
        this.f9201y = l4Var;
        this.f9202z = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9200x) {
            case 0:
                h3 h3Var = this.f9202z;
                h0 h0Var = h3Var.B;
                n1 n1Var = (n1) h3Var.f4301y;
                if (h0Var == null) {
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.D.a("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        h0Var.x(this.f9201y);
                    } catch (RemoteException e10) {
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.D.b(e10, "Failed to reset data on the service: remote exception");
                    }
                    h3Var.q1();
                    return;
                }
            case 1:
                h3 h3Var2 = this.f9202z;
                h0 h0Var2 = h3Var2.B;
                n1 n1Var2 = (n1) h3Var2.f4301y;
                if (h0Var2 == null) {
                    u0 u0Var3 = n1Var2.C;
                    n1.g(u0Var3);
                    u0Var3.D.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    l4 l4Var = this.f9201y;
                    g gVar = n1Var2.A;
                    d0 d0Var = e0.f9236d1;
                    if (gVar.n1(null, d0Var)) {
                        h3Var2.v1(h0Var2, null, l4Var);
                    }
                    h0Var2.l(l4Var);
                    n1Var2.i().i1();
                    n1Var2.A.n1(null, d0Var);
                    h3Var2.v1(h0Var2, null, l4Var);
                    h3Var2.q1();
                    return;
                } catch (RemoteException e11) {
                    u0 u0Var4 = n1Var2.C;
                    n1.g(u0Var4);
                    u0Var4.D.b(e11, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                h3 h3Var3 = this.f9202z;
                h0 h0Var3 = h3Var3.B;
                n1 n1Var3 = (n1) h3Var3.f4301y;
                if (h0Var3 == null) {
                    u0 u0Var5 = n1Var3.C;
                    n1.g(u0Var5);
                    u0Var5.G.a("Failed to send app backgrounded");
                    return;
                }
                try {
                    h0Var3.D(this.f9201y);
                    h3Var3.q1();
                    return;
                } catch (RemoteException e12) {
                    u0 u0Var6 = n1Var3.C;
                    n1.g(u0Var6);
                    u0Var6.D.b(e12, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                h3 h3Var4 = this.f9202z;
                h0 h0Var4 = h3Var4.B;
                n1 n1Var4 = (n1) h3Var4.f4301y;
                if (h0Var4 == null) {
                    u0 u0Var7 = n1Var4.C;
                    n1.g(u0Var7);
                    u0Var7.D.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    h0Var4.r(this.f9201y);
                    h3Var4.q1();
                    return;
                } catch (RemoteException e13) {
                    u0 u0Var8 = n1Var4.C;
                    n1.g(u0Var8);
                    u0Var8.D.b(e13, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                h3 h3Var5 = this.f9202z;
                h0 h0Var5 = h3Var5.B;
                n1 n1Var5 = (n1) h3Var5.f4301y;
                if (h0Var5 == null) {
                    u0 u0Var9 = n1Var5.C;
                    n1.g(u0Var9);
                    u0Var9.D.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    h0Var5.F(this.f9201y);
                    h3Var5.q1();
                    return;
                } catch (RemoteException e14) {
                    u0 u0Var10 = n1Var5.C;
                    n1.g(u0Var10);
                    u0Var10.D.b(e14, "Failed to send consent settings to the service");
                    return;
                }
        }
    }

    public c3(h3 h3Var, l4 l4Var) {
        this.f9200x = 4;
        this.f9201y = l4Var;
        Objects.requireNonNull(h3Var);
        this.f9202z = h3Var;
    }
}
