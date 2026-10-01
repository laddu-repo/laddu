package k4;

import a2.e1;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.List;
import r1.a1;
import r1.d1;
import r1.j1;
import r1.l1;
import r1.n0;
import r1.o0;
import r1.p1;
import r1.q0;
import r1.r0;
import r1.s0;
import r1.t0;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements s0, View.OnClickListener, p, h {

    /* renamed from: x, reason: collision with root package name */
    public final a1 f7726x = new a1();

    /* renamed from: y, reason: collision with root package name */
    public Object f7727y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ PlayerView f7728z;

    public w(PlayerView playerView) {
        this.f7728z = playerView;
    }

    @Override // r1.s0
    public final void F() {
        PlayerView playerView = this.f7728z;
        View view = playerView.f1101z;
        if (view != null) {
            view.setVisibility(4);
            if (playerView.b()) {
                ImageView imageView = playerView.D;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            playerView.c();
        }
    }

    @Override // r1.s0
    public final void I(int i6, t0 t0Var, t0 t0Var2) {
        int i10 = PlayerView.f1091h0;
        PlayerView playerView = this.f7728z;
        if (playerView.e() && playerView.f1096e0) {
            playerView.d();
        }
    }

    @Override // r1.s0
    public final void N(int i6, int i10) {
        PlayerView playerView = this.f7728z;
        View view = playerView.A;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.f1098g0) {
            lc.c cVar = playerView.C;
            cVar.getClass();
            playerView.L.post(new e1(cVar, (SurfaceView) view, new j2.h(playerView, 4), 12));
        }
    }

    @Override // r1.s0
    public final void b(p1 p1Var) {
        PlayerView playerView;
        u0 u0Var;
        if (!p1Var.equals(p1.f11626d) && (u0Var = (playerView = this.f7728z).P) != null && u0Var.e0() != 1) {
            playerView.k();
        }
    }

    @Override // r1.s0
    public final void i(l1 l1Var) {
        d1 d1Var;
        PlayerView playerView = this.f7728z;
        u0 u0Var = playerView.P;
        u0Var.getClass();
        if (u0Var.n0(17)) {
            d1Var = u0Var.y0();
        } else {
            d1Var = d1.f11368a;
        }
        if (d1Var.p()) {
            this.f7727y = null;
        } else {
            boolean n02 = u0Var.n0(30);
            a1 a1Var = this.f7726x;
            if (n02 && !u0Var.g0().f11582a.isEmpty()) {
                this.f7727y = d1Var.f(u0Var.w(), a1Var, true).f11296b;
            } else {
                Object obj = this.f7727y;
                if (obj != null) {
                    int b10 = d1Var.b(obj);
                    if (b10 != -1) {
                        if (u0Var.m0() == d1Var.f(b10, a1Var, false).f11297c) {
                            return;
                        }
                    }
                    this.f7727y = null;
                }
            }
        }
        playerView.o(false);
    }

    @Override // r1.s0
    public final void o(int i6, boolean z10) {
        int i10 = PlayerView.f1091h0;
        PlayerView playerView = this.f7728z;
        playerView.l();
        if (playerView.e() && playerView.f1096e0) {
            playerView.d();
        } else {
            playerView.f(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = PlayerView.f1091h0;
        this.f7728z.j();
    }

    @Override // r1.s0
    public final void r(int i6) {
        int i10 = PlayerView.f1091h0;
        PlayerView playerView = this.f7728z;
        playerView.l();
        playerView.n();
        if (playerView.e() && playerView.f1096e0) {
            playerView.d();
        } else {
            playerView.f(false);
        }
    }

    @Override // r1.s0
    public final void y(t1.c cVar) {
        SubtitleView subtitleView = this.f7728z.F;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f12479a);
        }
    }

    @Override // r1.s0
    public final /* synthetic */ void C(r1.d dVar) {
    }

    @Override // r1.s0
    public final /* synthetic */ void D(n0 n0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void E(r1.j0 j0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void G(List list) {
    }

    @Override // r1.s0
    public final /* synthetic */ void J(o0 o0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void O(n0 n0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void P(r1.h0 h0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void Q(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void a(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void c(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void d(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void e(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void g(int i6) {
    }

    @Override // r1.s0
    public final /* synthetic */ void k(j1 j1Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void m(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void p(q0 q0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void q(float f3) {
    }

    @Override // r1.s0
    public final /* synthetic */ void s(r1.h0 h0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void t(r0 r0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void x(boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void A(int i6, r1.e0 e0Var) {
    }

    @Override // r1.s0
    public final /* synthetic */ void H(int i6, boolean z10) {
    }

    @Override // r1.s0
    public final /* synthetic */ void h(d1 d1Var, int i6) {
    }
}
