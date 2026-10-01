package gc;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.livxow.tv.activities.PlayerActivity;
import com.livxow.tv.app.App;
import java.util.List;
import t1.c0;
import t1.d1;
import t1.e0;
import t1.h0;
import t1.i0;
import t1.j0;
import t1.k0;
import t1.l0;
import t1.m0;
import t1.x0;
import t1.z;
import t1.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements l0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5816w;

    public /* synthetic */ l(int i, Object obj) {
        this.f5815v = i;
        this.f5816w = obj;
    }

    @Override // t1.l0
    public final /* synthetic */ void A(boolean z2) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void B(int i, int i10) {
        int i11 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void C(z zVar, int i) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void D(h0 h0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void E(j0 j0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void G(e0 e0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void I(v1.c cVar) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void J(int i, m0 m0Var, m0 m0Var2) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void K(c0 c0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void L(boolean z2) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void a(boolean z2) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void b(d1 d1Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void c(int i) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void e(int i) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void g(int i) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void j(int i) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void m(boolean z2) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void n() {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final void o(h0 h0Var) {
        switch (this.f5815v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                PlayerActivity playerActivity = (PlayerActivity) this.f5816w;
                jc.a aVar = playerActivity.X;
                if (aVar != null) {
                    int i = h0Var.f12000v;
                    if (i == 1002) {
                        c2.j0 j0Var = playerActivity.f3643d0;
                        j0Var.getClass();
                        j0Var.y(j0Var.K(), -9223372036854775807L, false);
                        playerActivity.f3643d0.a0();
                        playerActivity.f3643d0.x();
                    } else if (i != 2004 || playerActivity.A0 || playerActivity.f3661w0 >= 3) {
                        playerActivity.f3652m0 = true;
                        ((ProgressBar) aVar.f7014m).setVisibility(8);
                        playerActivity.Y.f7043h.setVisibility(8);
                        playerActivity.Y.i.setVisibility(0);
                        playerActivity.A();
                    } else {
                        c2.j0 j0Var2 = playerActivity.f3643d0;
                        j0Var2.getClass();
                        j0Var2.y(j0Var2.K(), -9223372036854775807L, false);
                        playerActivity.f3643d0.a0();
                        playerActivity.f3643d0.x();
                        playerActivity.f3661w0++;
                    }
                    break;
                }
                break;
            default:
                uc.g gVar = (uc.g) this.f5816w;
                int i10 = h0Var.f12000v;
                if (i10 == 1002) {
                    c2.j0 j0Var3 = gVar.f;
                    j0Var3.getClass();
                    j0Var3.y(j0Var3.K(), -9223372036854775807L, false);
                    gVar.f.a0();
                    gVar.f.x();
                } else if (i10 != 2004 || gVar.f12971w || gVar.f12968t >= 3) {
                    gVar.f12969u = true;
                    gVar.e();
                    jc.e eVar = gVar.f12954d;
                    if (eVar != null) {
                        eVar.i.setVisibility(0);
                        gVar.f12954d.f7054h.setVisibility(8);
                    }
                } else {
                    c2.j0 j0Var4 = gVar.f;
                    j0Var4.getClass();
                    j0Var4.y(j0Var4.K(), -9223372036854775807L, false);
                    gVar.f.a0();
                    gVar.f.x();
                    gVar.f12968t++;
                }
                break;
        }
    }

    @Override // t1.l0
    public final /* synthetic */ void p(List list) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void q(int i, boolean z2) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void s(int i, boolean z2) {
        int i10 = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void t(x0 x0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void u(float f) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final void w(int i) {
        switch (this.f5815v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                PlayerActivity playerActivity = (PlayerActivity) this.f5816w;
                jc.a aVar = playerActivity.X;
                if (aVar != null) {
                    if (i == 3) {
                        playerActivity.f3661w0 = 0;
                        playerActivity.A0 = false;
                        ((TextView) aVar.i).setVisibility(0);
                    }
                    ((ProgressBar) playerActivity.X.f7014m).setVisibility(i != 2 ? 8 : 0);
                }
                break;
            default:
                if (i == 3) {
                    uc.g gVar = (uc.g) this.f5816w;
                    gVar.f12968t = 0;
                    gVar.f12971w = false;
                    if (App.P.f3687x != null) {
                        ((TextView) gVar.f12953c.f480x).setVisibility(0);
                    }
                }
                break;
        }
    }

    @Override // t1.l0
    public final /* synthetic */ void x(z0 z0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void y(i0 i0Var) {
        int i = this.f5815v;
    }

    @Override // t1.l0
    public final /* synthetic */ void z(k0 k0Var) {
        int i = this.f5815v;
    }

    private final /* synthetic */ void i0() {
    }

    private final /* synthetic */ void j0() {
    }

    private final /* synthetic */ void A0(float f) {
    }

    private final /* synthetic */ void B0(float f) {
    }

    private final /* synthetic */ void F(k0 k0Var) {
    }

    private final /* synthetic */ void H(k0 k0Var) {
    }

    private final /* synthetic */ void M(boolean z2) {
    }

    private final /* synthetic */ void N(boolean z2) {
    }

    private final /* synthetic */ void O(boolean z2) {
    }

    private final /* synthetic */ void P(boolean z2) {
    }

    private final /* synthetic */ void S(c0 c0Var) {
    }

    private final /* synthetic */ void T(c0 c0Var) {
    }

    private final /* synthetic */ void U(e0 e0Var) {
    }

    private final /* synthetic */ void V(e0 e0Var) {
    }

    private final /* synthetic */ void Y(i0 i0Var) {
    }

    private final /* synthetic */ void Z(i0 i0Var) {
    }

    private final /* synthetic */ void a0(int i) {
    }

    private final /* synthetic */ void b0(int i) {
    }

    private final /* synthetic */ void c0(h0 h0Var) {
    }

    private final /* synthetic */ void d(int i) {
    }

    private final /* synthetic */ void d0(h0 h0Var) {
    }

    private final /* synthetic */ void f(int i) {
    }

    private final /* synthetic */ void h(j0 j0Var) {
    }

    private final /* synthetic */ void i(j0 j0Var) {
    }

    private final /* synthetic */ void k(List list) {
    }

    private final /* synthetic */ void k0(int i) {
    }

    private final /* synthetic */ void l(v1.c cVar) {
    }

    private final /* synthetic */ void l0(int i) {
    }

    private final /* synthetic */ void m0(boolean z2) {
    }

    private final /* synthetic */ void n0(boolean z2) {
    }

    private final /* synthetic */ void o0(boolean z2) {
    }

    private final /* synthetic */ void p0(boolean z2) {
    }

    private final /* synthetic */ void r(List list) {
    }

    private final /* synthetic */ void s0(int i) {
    }

    private final /* synthetic */ void t0(int i) {
    }

    private final /* synthetic */ void u0(x0 x0Var) {
    }

    private final /* synthetic */ void v(v1.c cVar) {
    }

    private final /* synthetic */ void v0(x0 x0Var) {
    }

    private final /* synthetic */ void w0(z0 z0Var) {
    }

    private final /* synthetic */ void x0(z0 z0Var) {
    }

    private final /* synthetic */ void y0(d1 d1Var) {
    }

    private final /* synthetic */ void z0(d1 d1Var) {
    }

    private final /* synthetic */ void Q(z zVar, int i) {
    }

    private final /* synthetic */ void R(z zVar, int i) {
    }

    private final /* synthetic */ void W(int i, boolean z2) {
    }

    private final /* synthetic */ void X(int i, boolean z2) {
    }

    private final /* synthetic */ void e0(int i, boolean z2) {
    }

    private final /* synthetic */ void f0(int i, boolean z2) {
    }

    private final /* synthetic */ void q0(int i, int i10) {
    }

    private final /* synthetic */ void r0(int i, int i10) {
    }

    private final /* synthetic */ void g0(int i, m0 m0Var, m0 m0Var2) {
    }

    private final /* synthetic */ void h0(int i, m0 m0Var, m0 m0Var2) {
    }
}
