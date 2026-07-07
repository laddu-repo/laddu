package n9;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9287x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9288y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m2 f9289z;

    public e2(m2 m2Var, long j, int i6) {
        this.f9287x = i6;
        switch (i6) {
            case 1:
                this.f9288y = j;
                Objects.requireNonNull(m2Var);
                this.f9289z = m2Var;
                return;
            default:
                this.f9288y = j;
                Objects.requireNonNull(m2Var);
                this.f9289z = m2Var;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9287x) {
            case 0:
                n1 n1Var = (n1) this.f9289z.f4301y;
                c1 c1Var = n1Var.B;
                n1.e(c1Var);
                a2.d2 d2Var = c1Var.I;
                long j = this.f9288y;
                d2Var.h(j);
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.K.b(Long.valueOf(j), "Session timeout duration set");
                return;
            default:
                m2 m2Var = this.f9289z;
                m2Var.d1();
                m2Var.e1();
                n1 n1Var2 = (n1) m2Var.f4301y;
                u0 u0Var2 = n1Var2.C;
                n1.g(u0Var2);
                u0Var2.K.a("Resetting analytics data (FE)");
                p3 p3Var = n1Var2.E;
                n1.f(p3Var);
                p3Var.d1();
                o3 o3Var = p3Var.D;
                ((n3) o3Var.f9423z).c();
                ((n1) ((p3) o3Var.A).f4301y).H.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                o3Var.f9421x = elapsedRealtime;
                o3Var.f9422y = elapsedRealtime;
                n1Var2.l().i1();
                boolean z10 = !n1Var2.a();
                c1 c1Var2 = n1Var2.B;
                n1.e(c1Var2);
                c1Var2.D.h(this.f9288y);
                n1 n1Var3 = (n1) c1Var2.f4301y;
                c1 c1Var3 = n1Var3.B;
                n1.e(c1Var3);
                if (!TextUtils.isEmpty(c1Var3.T.l())) {
                    c1Var2.T.m(null);
                }
                c1Var2.N.h(0L);
                c1Var2.O.h(0L);
                if (!n1Var3.A.q1()) {
                    c1Var2.m1(z10);
                }
                c1Var2.U.m(null);
                c1Var2.V.h(0L);
                c1Var2.W.E(null);
                h3 j10 = n1Var2.j();
                j10.d1();
                j10.e1();
                l4 t12 = j10.t1(false);
                j10.p1();
                ((n1) j10.f4301y).i().h1();
                j10.r1(new c3(j10, t12, 0));
                n1.f(p3Var);
                p3Var.C.T();
                m2Var.Q = z10;
                n1Var2.j().h1(new AtomicReference());
                return;
        }
    }
}
