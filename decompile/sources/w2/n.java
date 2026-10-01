package w2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public k0 f13678a;

    /* renamed from: b, reason: collision with root package name */
    public r1.q f13679b;

    /* renamed from: c, reason: collision with root package name */
    public long f13680c;

    /* renamed from: d, reason: collision with root package name */
    public long f13681d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f13682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f13683f;

    public n(r rVar, Context context) {
        this.f13683f = rVar;
        u1.a0.M(context);
        i0 i0Var = k0.f4008y;
        this.f13678a = c1.B;
        this.f13681d = -9223372036854775807L;
        this.f13682e = r.f13685p;
    }

    @Override // w2.h0
    public final void a() {
        r rVar = this.f13683f;
        if (rVar.f13696l == 2) {
            return;
        }
        u1.x xVar = rVar.f13694i;
        if (xVar != null) {
            xVar.f12820a.removeCallbacksAndMessages(null);
        }
        rVar.j = null;
        rVar.f13696l = 2;
    }

    @Override // w2.h0
    public final void b(float f3) {
        this.f13683f.f13690e.b(f3);
    }

    @Override // w2.h0
    public final boolean c() {
        return false;
    }

    @Override // w2.h0
    public final Surface d() {
        u1.c.g(false);
        throw null;
    }

    @Override // w2.h0
    public final void e(v vVar) {
        this.f13683f.f13690e.f13619i = vVar;
    }

    @Override // w2.h0
    public final void f(u5.r rVar) {
        this.f13682e = hb.q.f6029x;
    }

    @Override // w2.h0
    public final void g() {
        r rVar = this.f13683f;
        if (rVar.f13689d) {
            rVar.f13690e.g();
        }
    }

    @Override // w2.h0
    public final void h() {
        r rVar = this.f13683f;
        if (rVar.f13689d) {
            rVar.f13690e.h();
        }
    }

    @Override // w2.h0
    public final void i(long j) {
        this.f13680c = j;
    }

    @Override // w2.h0
    public final boolean isInitialized() {
        return false;
    }

    @Override // w2.h0
    public final void j() {
        long j = this.f13681d;
        r rVar = this.f13683f;
        if (rVar.f13697m >= j) {
            rVar.f13690e.j();
            rVar.f13698n = true;
        }
    }

    @Override // w2.h0
    public final void k(int i6) {
        this.f13683f.f13690e.k(i6);
    }

    @Override // w2.h0
    public final boolean l(r1.q qVar) {
        boolean z10;
        boolean z11 = true;
        u1.c.g(!false);
        r rVar = this.f13683f;
        if (rVar.f13696l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        r1.h hVar = qVar.D;
        if (hVar == null || !hVar.d()) {
            hVar = r1.h.f11431h;
        }
        int i6 = hVar.f11439c;
        if (i6 == 7) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34 && i10 >= 33 && u1.a.l("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    u1.v vVar = rVar.f13691f;
                    Looper myLooper = Looper.myLooper();
                    u1.c.h(myLooper);
                    rVar.f13694i = vVar.a(myLooper, null);
                    rVar.f13687b.a();
                    throw null;
                }
            } catch (u1.j e10) {
                throw new g0(e10, qVar);
            }
        }
        if (i6 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !u1.a.l("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z11 = false;
            }
        } else if (i6 == 7) {
            z11 = u1.a.l("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z11 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            u1.a.p("PlaybackVidGraphWrapper", "Color transfer " + i6 + " is not supported. Falling back to OpenGl tone mapping.");
            r1.h hVar2 = r1.h.f11431h;
        }
        u1.v vVar2 = rVar.f13691f;
        Looper myLooper2 = Looper.myLooper();
        u1.c.h(myLooper2);
        rVar.f13694i = vVar2.a(myLooper2, null);
        rVar.f13687b.a();
        throw null;
    }

    @Override // w2.h0
    public final void m() {
        int i6 = u1.u.f12814c.f12815a;
        this.f13683f.j = null;
    }

    @Override // w2.h0
    public final void n(r1.q qVar, long j, int i6, List list) {
        u1.c.g(false);
        this.f13678a = k0.k(list);
        this.f13679b = qVar;
        this.f13683f.f13698n = false;
        r1.p a10 = qVar.a();
        r1.h hVar = qVar.D;
        if (hVar == null || !hVar.d()) {
            hVar = r1.h.f11431h;
        }
        a10.C = hVar;
        a10.a();
        throw null;
    }

    @Override // w2.h0
    public final void o(boolean z10) {
        this.f13681d = -9223372036854775807L;
        r rVar = this.f13683f;
        d dVar = rVar.f13690e;
        if (rVar.f13696l == 1) {
            rVar.f13695k++;
            dVar.o(z10);
            while (rVar.f13693h.h() > 1) {
                rVar.f13693h.e();
            }
            if (rVar.f13693h.h() != 1) {
                rVar.f13697m = -9223372036854775807L;
                rVar.f13698n = false;
                u1.x xVar = rVar.f13694i;
                u1.c.h(xVar);
                xVar.c(new j2.h(rVar, 15));
                return;
            }
            ((q) rVar.f13693h.e()).getClass();
            throw null;
        }
    }

    @Override // w2.h0
    public final void p(List list) {
        if (!this.f13678a.equals(list)) {
            this.f13678a = k0.k(list);
            r1.q qVar = this.f13679b;
            if (qVar == null) {
                return;
            }
            r1.p a10 = qVar.a();
            r1.h hVar = qVar.D;
            if (hVar == null || !hVar.d()) {
                hVar = r1.h.f11431h;
            }
            a10.C = hVar;
            a10.a();
            throw null;
        }
    }

    @Override // w2.h0
    public final void q(long j, long j10) {
        this.f13683f.f13690e.q(j + this.f13680c, j10);
    }

    @Override // w2.h0
    public final void r(boolean z10) {
        r rVar = this.f13683f;
        if (rVar.f13689d) {
            rVar.f13690e.r(z10);
        }
    }

    @Override // w2.h0
    public final boolean s(boolean z10) {
        return this.f13683f.f13690e.f13611a.b(false);
    }

    @Override // w2.h0
    public final boolean u(long j, h hVar) {
        u1.c.g(false);
        int i6 = this.f13683f.f13699o;
        if (i6 != -1 && i6 == 0) {
            throw null;
        }
        return false;
    }

    @Override // w2.h0
    public final void v(Surface surface, u1.u uVar) {
        r rVar = this.f13683f;
        Pair pair = rVar.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((u1.u) rVar.j.second).equals(uVar)) {
            return;
        }
        rVar.j = Pair.create(surface, uVar);
        int i6 = uVar.f12815a;
    }

    @Override // w2.h0
    public final void w() {
        r rVar = this.f13683f;
        if (rVar.f13693h.h() == 0) {
            rVar.f13690e.w();
            return;
        }
        s3.c cVar = new s3.c();
        if (rVar.f13693h.h() <= 0) {
            rVar.f13693h = cVar;
        } else {
            ((q) rVar.f13693h.e()).getClass();
            throw null;
        }
    }

    @Override // w2.h0
    public final void t() {
    }
}
