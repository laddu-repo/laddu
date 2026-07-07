package k8;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f7630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u2 f7631x;

    public m2(u2 u2Var, long j8, int i) {
        this.f7629v = i;
        switch (i) {
            case 1:
                this.f7630w = j8;
                this.f7631x = u2Var;
                break;
            default:
                this.f7630w = j8;
                Objects.requireNonNull(u2Var);
                this.f7631x = u2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7629v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p1 p1Var = (p1) this.f7631x.f2053w;
                d1 d1Var = p1Var.f7696z;
                p1.j(d1Var);
                c2.v1 v1Var = d1Var.G;
                long j8 = this.f7630w;
                v1Var.h(j8);
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.I.b(Long.valueOf(j8), "Session timeout duration set");
                break;
            default:
                u2 u2Var = this.f7631x;
                u2Var.D();
                u2Var.E();
                p1 p1Var2 = (p1) u2Var.f2053w;
                v0 v0Var2 = p1Var2.A;
                p1.l(v0Var2);
                v0Var2.I.a("Resetting analytics data (FE)");
                x3 x3Var = p1Var2.C;
                p1.k(x3Var);
                x3Var.D();
                w3 w3Var = x3Var.B;
                ((v3) w3Var.f7822x).c();
                ((p1) ((x3) w3Var.f7823y).f2053w).F.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                w3Var.f7820v = jElapsedRealtime;
                w3Var.f7821w = jElapsedRealtime;
                p1Var2.q().I();
                boolean z2 = !p1Var2.b();
                d1 d1Var2 = p1Var2.f7696z;
                p1.j(d1Var2);
                d1Var2.B.h(this.f7630w);
                p1 p1Var3 = (p1) d1Var2.f2053w;
                d1 d1Var3 = p1Var3.f7696z;
                p1.j(d1Var3);
                if (!TextUtils.isEmpty(d1Var3.R.s())) {
                    d1Var2.R.t(null);
                }
                d1Var2.L.h(0L);
                d1Var2.M.h(0L);
                if (!p1Var3.f7695y.R()) {
                    d1Var2.L(z2);
                }
                d1Var2.S.t(null);
                d1Var2.T.h(0L);
                d1Var2.U.J(null);
                p3 p3VarO = p1Var2.o();
                p3VarO.D();
                p3VarO.E();
                v4 v4VarT = p3VarO.T(false);
                p3VarO.P();
                ((p1) p3VarO.f2053w).n().H();
                p3VarO.R(new k3(p3VarO, v4VarT, 0));
                p1.k(x3Var);
                x3Var.A.Q();
                u2Var.N = z2;
                p1Var2.o().H(new AtomicReference());
                break;
        }
    }
}
