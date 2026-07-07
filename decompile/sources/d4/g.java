package d4;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.t f4122a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4125d;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w2.g0 f4127g;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t1.o f4131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4133n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4128h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4136q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4123b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4134o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4135p = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4126e = "video/mp2t";

    public g(int i, int i10, String str) {
        this.f4122a = new w1.t(new byte[i10]);
        this.f4124c = str;
        this.f4125d = i;
    }

    @Override // d4.i
    public final void a() {
        this.f4128h = 0;
        this.i = 0;
        this.f4129j = 0;
        this.f4136q = -9223372036854775807L;
        this.f4123b.set(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04bb  */
    @Override // d4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w1.t r40) throws t1.g0 {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.g.b(w1.t):void");
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        this.f4136q = j8;
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f = g0Var.f4141e;
        g0Var.b();
        this.f4127g = qVar.r(g0Var.f4140d, 1);
    }

    public final boolean f(w1.t tVar, byte[] bArr, int i) {
        int iMin = Math.min(tVar.a(), i - this.i);
        tVar.h(bArr, this.i, iMin);
        int i10 = this.i + iMin;
        this.i = i10;
        return i10 == i;
    }

    public final void g(w2.a aVar) {
        int i = aVar.f13753b;
        String str = aVar.f13752a;
        int i10 = aVar.f13754c;
        if (i == -2147483647 || i10 == -1) {
            return;
        }
        t1.o oVar = this.f4131l;
        if (oVar != null && i10 == oVar.F && i == oVar.G && str.equals(oVar.f12061n)) {
            return;
        }
        t1.o oVar2 = this.f4131l;
        t1.n nVar = oVar2 == null ? new t1.n() : oVar2.a();
        nVar.f12026a = this.f;
        nVar.f12035l = t1.f0.p(this.f4126e);
        nVar.f12036m = t1.f0.p(str);
        nVar.E = i10;
        nVar.F = i;
        nVar.f12029d = this.f4124c;
        nVar.f = this.f4125d;
        t1.o oVar3 = new t1.o(nVar);
        this.f4131l = oVar3;
        this.f4127g.c(oVar3);
    }

    @Override // d4.i
    public final void c(boolean z2) {
    }
}
