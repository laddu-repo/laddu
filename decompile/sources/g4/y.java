package g4;

import android.view.TextureView;
import android.view.View;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.List;
import t1.d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y implements t1.l0, View.OnLayoutChangeListener, View.OnClickListener, q, h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t1.q0 f5632v = new t1.q0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f5633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PlayerView f5634x;

    public y(PlayerView playerView) {
        this.f5634x = playerView;
    }

    @Override // t1.l0
    public final void I(v1.c cVar) {
        SubtitleView subtitleView = this.f5634x.B;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f13071a);
        }
    }

    @Override // t1.l0
    public final void J(int i, t1.m0 m0Var, t1.m0 m0Var2) {
        int i10 = PlayerView.U;
        PlayerView playerView = this.f5634x;
        if (playerView.c() && playerView.S) {
            playerView.b();
        }
    }

    @Override // t1.l0
    public final void b(d1 d1Var) {
        PlayerView playerView;
        t1.n0 n0Var;
        if (d1Var.equals(d1.f11975d) || (n0Var = (playerView = this.f5634x).H) == null || ((c2.j0) n0Var).S() == 1) {
            return;
        }
        playerView.i();
    }

    @Override // t1.l0
    public final void n() {
        View view = this.f5634x.f1345x;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.U;
        this.f5634x.h();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        PlayerView.a((TextureView) view);
    }

    @Override // t1.l0
    public final void s(int i, boolean z2) {
        int i10 = PlayerView.U;
        PlayerView playerView = this.f5634x;
        playerView.j();
        if (playerView.c() && playerView.S) {
            playerView.b();
        } else {
            playerView.d(false);
        }
    }

    @Override // t1.l0
    public final void w(int i) {
        int i10 = PlayerView.U;
        PlayerView playerView = this.f5634x;
        playerView.j();
        playerView.l();
        if (playerView.c() && playerView.S) {
            playerView.b();
        } else {
            playerView.d(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // t1.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(t1.z0 r8) {
        /*
            r7 = this;
            androidx.media3.ui.PlayerView r8 = r7.f5634x
            t1.n0 r0 = r8.H
            r0.getClass()
            r1 = r0
            c3.e r1 = (c3.e) r1
            r2 = 17
            boolean r2 = r1.n(r2)
            if (r2 == 0) goto L1a
            r2 = r0
            c2.j0 r2 = (c2.j0) r2
            t1.s0 r2 = r2.N()
            goto L1c
        L1a:
            t1.p0 r2 = t1.s0.f12110a
        L1c:
            boolean r3 = r2.p()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L27
            r7.f5633w = r5
            goto L81
        L27:
            r3 = 30
            boolean r1 = r1.n(r3)
            t1.q0 r3 = r7.f5632v
            if (r1 == 0) goto L65
            r1 = r0
            c2.j0 r1 = (c2.j0) r1
            t1.z0 r6 = r1.O()
            y9.f0 r6 = r6.f12184a
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L65
            r1.q0()
            c2.l1 r0 = r1.E0
            t1.s0 r0 = r0.f1840a
            boolean r0 = r0.p()
            if (r0 == 0) goto L4f
            r0 = r4
            goto L5b
        L4f:
            c2.l1 r0 = r1.E0
            t1.s0 r1 = r0.f1840a
            o2.d0 r0 = r0.f1841b
            java.lang.Object r0 = r0.f9404a
            int r0 = r1.b(r0)
        L5b:
            r1 = 1
            t1.q0 r0 = r2.f(r0, r3, r1)
            java.lang.Object r0 = r0.f12087b
            r7.f5633w = r0
            goto L81
        L65:
            java.lang.Object r1 = r7.f5633w
            if (r1 == 0) goto L81
            int r1 = r2.b(r1)
            r6 = -1
            if (r1 == r6) goto L7f
            t1.q0 r1 = r2.f(r1, r3, r4)
            int r1 = r1.f12088c
            c2.j0 r0 = (c2.j0) r0
            int r0 = r0.K()
            if (r0 != r1) goto L7f
            return
        L7f:
            r7.f5633w = r5
        L81:
            r8.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.y.x(t1.z0):void");
    }

    @Override // t1.l0
    public final /* synthetic */ void A(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void D(t1.h0 h0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void E(t1.j0 j0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void G(t1.e0 e0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void K(t1.c0 c0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void L(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void a(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void c(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void e(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void g(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void j(int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void m(boolean z2) {
    }

    @Override // t1.l0
    public final /* synthetic */ void o(t1.h0 h0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void p(List list) {
    }

    @Override // t1.l0
    public final /* synthetic */ void t(t1.x0 x0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void u(float f) {
    }

    @Override // t1.l0
    public final /* synthetic */ void y(t1.i0 i0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void z(t1.k0 k0Var) {
    }

    @Override // t1.l0
    public final /* synthetic */ void B(int i, int i10) {
    }

    @Override // t1.l0
    public final /* synthetic */ void C(t1.z zVar, int i) {
    }

    @Override // t1.l0
    public final /* synthetic */ void q(int i, boolean z2) {
    }
}
