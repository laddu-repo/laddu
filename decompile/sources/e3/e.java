package e3;

import a2.n0;
import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import c6.h;
import cf.m;
import com.unity3d.services.UnityAdsConstants;
import db.k0;
import j1.a1;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.k;
import n9.l1;
import n9.n1;
import n9.v1;
import r1.c1;
import r1.d1;
import r1.e0;
import r1.h0;
import r1.j;
import r1.j1;
import r1.o0;
import r1.p1;
import r1.q0;
import r1.r;
import r1.s0;
import r1.u0;
import u1.a0;
import w8.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e implements h7.e, v1, u0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4300x;

    /* renamed from: y, reason: collision with root package name */
    public Object f4301y;

    public /* synthetic */ e(Object obj, int i6) {
        this.f4300x = i6;
        this.f4301y = obj;
    }

    @Override // r1.u0
    public void A() {
        switch (this.f4300x) {
            case 5:
                c1(6);
                return;
            default:
                ((u0) this.f4301y).A();
                return;
        }
    }

    public void A0(j1 j1Var) {
        ((u0) this.f4301y).A0(j1Var);
    }

    @Override // r1.u0
    public void B() {
        switch (this.f4300x) {
            case 5:
                a1(((n0) this).m0(), -9223372036854775807L, false);
                return;
            default:
                ((u0) this.f4301y).B();
                return;
        }
    }

    public Looper B0() {
        return ((u0) this.f4301y).B0();
    }

    public r1.d C() {
        return ((u0) this.f4301y).C();
    }

    public void C0(r1.d dVar, boolean z10) {
        ((u0) this.f4301y).C0(dVar, z10);
    }

    @Override // n9.v1
    public l1 D() {
        throw null;
    }

    @Override // n9.v1
    public a9.a D0() {
        throw null;
    }

    public void E(int i6, boolean z10) {
        ((u0) this.f4301y).E(i6, z10);
    }

    public void E0() {
        ((u0) this.f4301y).E0();
    }

    public void F() {
        ((u0) this.f4301y).F();
    }

    public boolean F0() {
        return ((u0) this.f4301y).F0();
    }

    public void G(int i6, int i10) {
        ((u0) this.f4301y).G(i6, i10);
    }

    public void H(int i6) {
        ((u0) this.f4301y).H(i6);
    }

    public j1 H0() {
        return ((u0) this.f4301y).H0();
    }

    public int I() {
        return ((u0) this.f4301y).I();
    }

    public long I0() {
        return ((u0) this.f4301y).I0();
    }

    public void J(SurfaceView surfaceView) {
        ((u0) this.f4301y).J(surfaceView);
    }

    public void J0(int i6) {
        ((u0) this.f4301y).J0(i6);
    }

    public void K(int i6, int i10, List list) {
        ((u0) this.f4301y).K(i6, i10, list);
    }

    @Override // r1.u0
    public void K0() {
        int e10;
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                if (!n0Var.y0().p() && !n0Var.h()) {
                    if (W0()) {
                        d1 y02 = n0Var.y0();
                        if (y02.p()) {
                            e10 = -1;
                        } else {
                            int m02 = n0Var.m0();
                            n0Var.F1();
                            int i6 = n0Var.f329d0;
                            if (i6 == 1) {
                                i6 = 0;
                            }
                            n0Var.F1();
                            e10 = y02.e(n0Var.f330e0, m02, i6);
                        }
                        if (e10 == -1) {
                            Y0();
                            return;
                        } else if (e10 == n0Var.m0()) {
                            a1(n0Var.m0(), -9223372036854775807L, true);
                            return;
                        } else {
                            a1(e10, -9223372036854775807L, false);
                            return;
                        }
                    }
                    if (S0() && u0()) {
                        a1(n0Var.m0(), -9223372036854775807L, false);
                        return;
                    } else {
                        Y0();
                        return;
                    }
                }
                Y0();
                return;
            default:
                ((u0) this.f4301y).K0();
                return;
        }
    }

    @Override // r1.u0
    public void L(int i6) {
        switch (this.f4300x) {
            case 5:
                ((n0) this).N(i6, i6 + 1);
                return;
            default:
                ((u0) this.f4301y).L(i6);
                return;
        }
    }

    @Override // r1.u0
    public void L0() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                n0Var.F1();
                b1(12, n0Var.U);
                return;
            default:
                ((u0) this.f4301y).L0();
                return;
        }
    }

    @Override // r1.u0
    public void M(long j) {
        switch (this.f4300x) {
            case 5:
                a1(((n0) this).m0(), j, false);
                return;
            default:
                ((u0) this.f4301y).M(j);
                return;
        }
    }

    public void M0(TextureView textureView) {
        ((u0) this.f4301y).M0(textureView);
    }

    public void N(int i6, int i10) {
        ((u0) this.f4301y).N(i6, i10);
    }

    @Override // r1.u0
    public void N0() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                n0Var.F1();
                b1(11, -n0Var.T);
                return;
            default:
                ((u0) this.f4301y).N0();
                return;
        }
    }

    public void O(float f3) {
        ((u0) this.f4301y).O(f3);
    }

    public h0 O0() {
        return ((u0) this.f4301y).O0();
    }

    @Override // r1.u0
    public void P() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                if (!n0Var.y0().p() && !n0Var.h()) {
                    boolean X0 = X0();
                    if (S0() && !b0()) {
                        if (X0) {
                            c1(7);
                            return;
                        } else {
                            Y0();
                            return;
                        }
                    }
                    if (X0) {
                        long currentPosition = n0Var.getCurrentPosition();
                        n0Var.F1();
                        if (currentPosition <= n0Var.V) {
                            c1(7);
                            return;
                        }
                    }
                    a1(n0Var.m0(), 0L, false);
                    return;
                }
                Y0();
                return;
            default:
                ((u0) this.f4301y).P();
                return;
        }
    }

    public void P0(List list) {
        ((u0) this.f4301y).P0(list);
    }

    @Override // n9.v1
    public l Q() {
        throw null;
    }

    @Override // h7.e
    public List Q0() {
        return (List) this.f4301y;
    }

    public void R(List list, int i6, long j) {
        ((u0) this.f4301y).R(list, i6, j);
    }

    public long R0() {
        return ((u0) this.f4301y).R0();
    }

    public r1.n0 S() {
        return ((u0) this.f4301y).S();
    }

    @Override // r1.u0
    public boolean S0() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (!y02.p() && y02.m(n0Var.m0(), (c1) this.f4301y, 0L).a()) {
                    return true;
                }
                return false;
            default:
                return ((u0) this.f4301y).S0();
        }
    }

    public void T(boolean z10) {
        ((u0) this.f4301y).T(z10);
    }

    @Override // h7.e
    public boolean T0() {
        List list = (List) this.f4301y;
        if (list.isEmpty() || (list.size() == 1 && ((o7.a) list.get(0)).c())) {
            return true;
        }
        return false;
    }

    public void U(s0 s0Var) {
        ((u0) this.f4301y).U(new r(this, s0Var));
    }

    public abstract void U0(h hVar);

    public void V(h0 h0Var) {
        ((u0) this.f4301y).V(h0Var);
    }

    public abstract String V0();

    @Override // r1.u0
    public void W(int i6) {
        switch (this.f4300x) {
            case 5:
                a1(i6, -9223372036854775807L, false);
                return;
            default:
                ((u0) this.f4301y).W(i6);
                return;
        }
    }

    public boolean W0() {
        int e10;
        n0 n0Var = (n0) this;
        d1 y02 = n0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int m02 = n0Var.m0();
            n0Var.F1();
            int i6 = n0Var.f329d0;
            if (i6 == 1) {
                i6 = 0;
            }
            n0Var.F1();
            e10 = y02.e(n0Var.f330e0, m02, i6);
        }
        if (e10 == -1) {
            return false;
        }
        return true;
    }

    public long X() {
        return ((u0) this.f4301y).X();
    }

    public boolean X0() {
        int k8;
        n0 n0Var = (n0) this;
        d1 y02 = n0Var.y0();
        if (y02.p()) {
            k8 = -1;
        } else {
            int m02 = n0Var.m0();
            n0Var.F1();
            int i6 = n0Var.f329d0;
            if (i6 == 1) {
                i6 = 0;
            }
            n0Var.F1();
            k8 = y02.k(n0Var.f330e0, m02, i6);
        }
        if (k8 == -1) {
            return false;
        }
        return true;
    }

    public long Y() {
        return ((u0) this.f4301y).Y();
    }

    public void Y0() {
        ((n0) this).F1();
    }

    public void Z(int i6, List list) {
        ((u0) this.f4301y).Z(i6, list);
    }

    public boolean Z0() {
        int i6;
        a1 a1Var = (a1) this.f4301y;
        View view = a1Var.f6876c.f7024g0;
        if (view != null) {
            i6 = 4;
            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i6 = 3;
                        } else {
                            throw new IllegalArgumentException(h8.c.i(visibility, "Unknown visibility "));
                        }
                    }
                } else {
                    i6 = 2;
                }
            }
        } else {
            i6 = 0;
        }
        int i10 = a1Var.f6874a;
        if (i6 != i10) {
            if (i6 == 2 || i10 == 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean a() {
        return ((u0) this.f4301y).a();
    }

    public long a0() {
        return ((u0) this.f4301y).a0();
    }

    public abstract void a1(int i6, long j, boolean z10);

    @Override // r1.u0
    public void b(float f3) {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                n0Var.e(new o0(f3, n0Var.d().f11597b));
                return;
            default:
                ((u0) this.f4301y).b(f3);
                return;
        }
    }

    @Override // r1.u0
    public boolean b0() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (!y02.p() && y02.m(n0Var.m0(), (c1) this.f4301y, 0L).f11334h) {
                    return true;
                }
                return false;
            default:
                return ((u0) this.f4301y).b0();
        }
    }

    public void b1(int i6, long j) {
        n0 n0Var = (n0) this;
        long currentPosition = n0Var.getCurrentPosition() + j;
        long duration = n0Var.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a1(n0Var.m0(), Math.max(currentPosition, 0L), false);
    }

    public void c() {
        ((u0) this.f4301y).c();
    }

    public void c1(int i6) {
        int k8;
        n0 n0Var = (n0) this;
        d1 y02 = n0Var.y0();
        if (y02.p()) {
            k8 = -1;
        } else {
            int m02 = n0Var.m0();
            n0Var.F1();
            int i10 = n0Var.f329d0;
            if (i10 == 1) {
                i10 = 0;
            }
            n0Var.F1();
            k8 = y02.k(n0Var.f330e0, m02, i10);
        }
        if (k8 == -1) {
            Y0();
        } else if (k8 == n0Var.m0()) {
            a1(n0Var.m0(), -9223372036854775807L, true);
        } else {
            a1(k8, -9223372036854775807L, false);
        }
    }

    public o0 d() {
        return ((u0) this.f4301y).d();
    }

    @Override // r1.u0
    public void d0() {
        int e10;
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (y02.p()) {
                    e10 = -1;
                } else {
                    int m02 = n0Var.m0();
                    n0Var.F1();
                    int i6 = n0Var.f329d0;
                    if (i6 == 1) {
                        i6 = 0;
                    }
                    n0Var.F1();
                    e10 = y02.e(n0Var.f330e0, m02, i6);
                }
                if (e10 == -1) {
                    Y0();
                    return;
                } else if (e10 == n0Var.m0()) {
                    a1(n0Var.m0(), -9223372036854775807L, true);
                    return;
                } else {
                    a1(e10, -9223372036854775807L, false);
                    return;
                }
            default:
                ((u0) this.f4301y).d0();
                return;
        }
    }

    public void d1() {
        l1 l1Var = ((n1) this.f4301y).D;
        n1.g(l1Var);
        l1Var.d1();
    }

    public void e(o0 o0Var) {
        ((u0) this.f4301y).e(o0Var);
    }

    public int e0() {
        return ((u0) this.f4301y).e0();
    }

    public int f() {
        return ((u0) this.f4301y).f();
    }

    public void f0(int i6) {
        ((u0) this.f4301y).f0(i6);
    }

    public void g(Surface surface) {
        ((u0) this.f4301y).g(surface);
    }

    public r1.l1 g0() {
        return ((u0) this.f4301y).g0();
    }

    public long getCurrentPosition() {
        return ((u0) this.f4301y).getCurrentPosition();
    }

    public j getDeviceInfo() {
        return ((u0) this.f4301y).getDeviceInfo();
    }

    public long getDuration() {
        return ((u0) this.f4301y).getDuration();
    }

    public float getVolume() {
        return ((u0) this.f4301y).getVolume();
    }

    public boolean h() {
        return ((u0) this.f4301y).h();
    }

    public h0 h0() {
        return ((u0) this.f4301y).h0();
    }

    @Override // r1.u0
    public long i() {
        switch (this.f4300x) {
            case 5:
                c1 c1Var = (c1) this.f4301y;
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (y02.p() || y02.m(n0Var.m0(), c1Var, 0L).f11332f == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                return (a0.A(c1Var.f11333g) - c1Var.f11332f) - n0Var.Y();
            default:
                return ((u0) this.f4301y).i();
        }
    }

    public t1.c i0() {
        return ((u0) this.f4301y).i0();
    }

    @Override // r1.u0
    public boolean isPlaying() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                if (n0Var.e0() == 3 && n0Var.m() && n0Var.v0() == 0) {
                    return true;
                }
                return false;
            default:
                return ((u0) this.f4301y).isPlaying();
        }
    }

    public long j() {
        return ((u0) this.f4301y).j();
    }

    @Override // r1.u0
    public void j0() {
        switch (this.f4300x) {
            case 5:
                ((n0) this).T(true);
                return;
            default:
                ((u0) this.f4301y).j0();
                return;
        }
    }

    @Override // r1.u0
    public void k(int i6, long j) {
        switch (this.f4300x) {
            case 5:
                a1(i6, j, false);
                return;
            default:
                ((u0) this.f4301y).k(i6, j);
                return;
        }
    }

    public int k0() {
        return ((u0) this.f4301y).k0();
    }

    public q0 l() {
        return ((u0) this.f4301y).l();
    }

    @Override // r1.u0
    public void l0(int i6, e0 e0Var) {
        switch (this.f4300x) {
            case 5:
                ((n0) this).K(i6, i6 + 1, k0.o(e0Var));
                return;
            default:
                ((u0) this.f4301y).l0(i6, e0Var);
                return;
        }
    }

    public boolean m() {
        return ((u0) this.f4301y).m();
    }

    public int m0() {
        return ((u0) this.f4301y).m0();
    }

    @Override // r1.u0
    public void n() {
        switch (this.f4300x) {
            case 5:
                ((n0) this).N(0, Integer.MAX_VALUE);
                return;
            default:
                ((u0) this.f4301y).n();
                return;
        }
    }

    @Override // r1.u0
    public boolean n0(int i6) {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                n0Var.F1();
                return n0Var.f338m0.a(i6);
            default:
                return ((u0) this.f4301y).n0(i6);
        }
    }

    @Override // r1.u0
    public void o(e0 e0Var, long j) {
        switch (this.f4300x) {
            case 5:
                ((n0) this).R(k0.o(e0Var), 0, j);
                return;
            default:
                ((u0) this.f4301y).o(e0Var, j);
                return;
        }
    }

    @Override // n9.v1
    public Context o0() {
        throw null;
    }

    @Override // r1.u0
    public e0 p() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (y02.p()) {
                    return null;
                }
                return y02.m(n0Var.m0(), (c1) this.f4301y, 0L).f11329c;
            default:
                return ((u0) this.f4301y).p();
        }
    }

    public void p0(int i6) {
        ((u0) this.f4301y).p0(i6);
    }

    @Override // r1.u0
    public void pause() {
        switch (this.f4300x) {
            case 5:
                ((n0) this).T(false);
                return;
            default:
                ((u0) this.f4301y).pause();
                return;
        }
    }

    public void q(boolean z10) {
        ((u0) this.f4301y).q(z10);
    }

    public void q0(boolean z10) {
        ((u0) this.f4301y).q0(z10);
    }

    @Override // n9.v1
    public n9.u0 r() {
        throw null;
    }

    public void r0(SurfaceView surfaceView) {
        ((u0) this.f4301y).r0(surfaceView);
    }

    @Override // r1.u0
    public int s() {
        long j;
        n0 n0Var = (n0) this;
        long a02 = n0Var.a0();
        long duration = n0Var.getDuration();
        if (a02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = a0.f12750a;
        long B = m.B(a02, 100L);
        if (B != Long.MAX_VALUE && B != Long.MIN_VALUE) {
            j = B / duration;
        } else {
            j = a02 / (duration / 100);
        }
        return a0.i(a8.f.G(j), 0, 100);
    }

    @Override // r1.u0
    public void s0(int i6, int i10) {
        switch (this.f4300x) {
            case 5:
                if (i6 != i10) {
                    ((n0) this).t0(i6, i6 + 1, i10);
                    return;
                }
                return;
            default:
                ((u0) this.f4301y).s0(i6, i10);
                return;
        }
    }

    public void stop() {
        ((u0) this.f4301y).stop();
    }

    public void t(s0 s0Var) {
        ((u0) this.f4301y).t(new r(this, s0Var));
    }

    public void t0(int i6, int i10, int i11) {
        ((u0) this.f4301y).t0(i6, i10, i11);
    }

    public String toString() {
        switch (this.f4300x) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f4301y;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public long u() {
        return ((u0) this.f4301y).u();
    }

    @Override // r1.u0
    public boolean u0() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (!y02.p() && y02.m(n0Var.m0(), (c1) this.f4301y, 0L).f11335i) {
                    return true;
                }
                return false;
            default:
                return ((u0) this.f4301y).u0();
        }
    }

    @Override // r1.u0
    public long v() {
        switch (this.f4300x) {
            case 5:
                n0 n0Var = (n0) this;
                d1 y02 = n0Var.y0();
                if (y02.p()) {
                    return -9223372036854775807L;
                }
                return a0.e0(y02.m(n0Var.m0(), (c1) this.f4301y, 0L).f11338m);
            default:
                return ((u0) this.f4301y).v();
        }
    }

    public int v0() {
        return ((u0) this.f4301y).v0();
    }

    public int w() {
        return ((u0) this.f4301y).w();
    }

    @Override // r1.u0
    public void w0(List list) {
        switch (this.f4300x) {
            case 5:
                ((n0) this).Z(Integer.MAX_VALUE, list);
                return;
            default:
                ((u0) this.f4301y).w0(list);
                return;
        }
    }

    public void x(TextureView textureView) {
        ((u0) this.f4301y).x(textureView);
    }

    public int x0() {
        return ((u0) this.f4301y).x0();
    }

    public p1 y() {
        return ((u0) this.f4301y).y();
    }

    public d1 y0() {
        return ((u0) this.f4301y).y0();
    }

    @Override // r1.u0
    public void z(e0 e0Var) {
        switch (this.f4300x) {
            case 5:
                ((n0) this).P0(k0.o(e0Var));
                return;
            default:
                ((u0) this.f4301y).z(e0Var);
                return;
        }
    }

    public boolean z0() {
        return ((u0) this.f4301y).z0();
    }

    public e(n1 n1Var) {
        this.f4300x = 4;
        x.g(n1Var);
        this.f4301y = n1Var;
    }

    public e(int i6) {
        this.f4300x = i6;
        switch (i6) {
            case 5:
                this.f4301y = new c1();
                return;
            default:
                return;
        }
    }

    public e(a1 operation) {
        this.f4300x = 3;
        k.e(operation, "operation");
        this.f4301y = operation;
    }
}
