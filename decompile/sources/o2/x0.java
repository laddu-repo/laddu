package o2;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y1.g f9565h;
    public final androidx.fragment.app.d1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h2.n f9566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k8.c0 f9567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1.o f9569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9570n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9571o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y1.z f9574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t1.z f9575s;

    public x0(t1.z zVar, y1.g gVar, androidx.fragment.app.d1 d1Var, h2.n nVar, k8.c0 c0Var, int i, t1.o oVar) {
        this.f9575s = zVar;
        this.f9565h = gVar;
        this.i = d1Var;
        this.f9566j = nVar;
        this.f9567k = c0Var;
        this.f9568l = i;
        this.f9569m = oVar;
    }

    @Override // o2.a
    public final b0 b(d0 d0Var, s2.e eVar, long j8) {
        y1.h hVarC = this.f9565h.c();
        y1.z zVar = this.f9574r;
        if (zVar != null) {
            hVarC.a(zVar);
        }
        t1.w wVar = h().f12179b;
        wVar.getClass();
        Uri uri = wVar.f12129a;
        w1.a.k(this.f9371g);
        return new u0(uri, hVarC, new hd.a((w2.r) this.i.f1006w), this.f9566j, new h2.k(this.f9369d.f6097c, 0, d0Var), this.f9567k, a(d0Var), this, eVar, this.f9568l, this.f9569m, w1.b0.M(wVar.f), null);
    }

    @Override // o2.a
    public final synchronized t1.z h() {
        return this.f9575s;
    }

    @Override // o2.a
    public final void l(y1.z zVar) {
        this.f9574r = zVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        d2.l lVar = this.f9371g;
        w1.a.k(lVar);
        h2.n nVar = this.f9566j;
        nVar.d(looperMyLooper, lVar);
        nVar.h();
        t();
    }

    @Override // o2.a
    public final void n(b0 b0Var) {
        u0 u0Var = (u0) b0Var;
        if (u0Var.R) {
            for (b1 b1Var : u0Var.O) {
                b1Var.k();
                h2.h hVar = b1Var.f9378h;
                if (hVar != null) {
                    hVar.d(b1Var.f9376e);
                    b1Var.f9378h = null;
                    b1Var.f9377g = null;
                }
            }
        }
        u0Var.G.e(u0Var);
        u0Var.L.removeCallbacksAndMessages(null);
        u0Var.M = null;
        u0Var.f9545j0 = true;
    }

    @Override // o2.a
    public final void p() {
        this.f9566j.release();
    }

    @Override // o2.a
    public final synchronized void s(t1.z zVar) {
        this.f9575s = zVar;
    }

    public final void t() {
        long j8 = this.f9571o;
        boolean z2 = this.f9572p;
        boolean z10 = this.f9573q;
        t1.z zVarH = h();
        t1.s0 g1Var = new g1(-9223372036854775807L, -9223372036854775807L, j8, j8, 0L, 0L, z2, false, false, null, zVarH, z10 ? zVarH.f12180c : null);
        if (this.f9570n) {
            g1Var = new v0(g1Var);
        }
        m(g1Var);
    }

    public final void u(long j8, w2.a0 a0Var, boolean z2) {
        if (j8 == -9223372036854775807L) {
            j8 = this.f9571o;
        }
        boolean zI = a0Var.i();
        if (!this.f9570n && this.f9571o == j8 && this.f9572p == zI && this.f9573q == z2) {
            return;
        }
        this.f9571o = j8;
        this.f9572p = zI;
        this.f9573q = z2;
        this.f9570n = false;
        t();
    }

    @Override // o2.a
    public final void j() {
    }
}
