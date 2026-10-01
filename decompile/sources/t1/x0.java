package t1;

import y9.e1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12158e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12160h;
    public final y9.f0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y9.f0 f12161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y9.f0 f12162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y9.f0 f12165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v0 f12166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y9.f0 f12167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f12168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e1 f12171t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y9.i0 f12172u;

    static {
        new x0(new w0());
        w1.b0.H(1);
        w1.b0.H(2);
        w1.b0.H(3);
        w1.b0.H(4);
        d0.d.p(5, 6, 7, 8, 9);
        d0.d.p(10, 11, 12, 13, 14);
        d0.d.p(15, 16, 17, 18, 19);
        d0.d.p(20, 21, 22, 23, 24);
        d0.d.p(25, 26, 27, 28, 29);
        d0.d.p(30, 31, 32, 33, 34);
    }

    public x0(w0 w0Var) {
        this.f12154a = w0Var.f12134a;
        this.f12155b = w0Var.f12135b;
        this.f12156c = w0Var.f12136c;
        this.f12157d = w0Var.f12137d;
        this.f12158e = w0Var.f12138e;
        this.f = w0Var.f;
        this.f12159g = w0Var.f12139g;
        this.f12160h = w0Var.f12140h;
        this.i = w0Var.i;
        this.f12161j = w0Var.f12141j;
        this.f12162k = w0Var.f12142k;
        this.f12163l = w0Var.f12143l;
        this.f12164m = w0Var.f12144m;
        this.f12165n = w0Var.f12145n;
        this.f12166o = w0Var.f12146o;
        this.f12167p = w0Var.f12147p;
        this.f12168q = w0Var.f12148q;
        this.f12169r = w0Var.f12149r;
        this.f12170s = w0Var.f12150s;
        this.f12171t = e1.b(w0Var.f12151t);
        this.f12172u = y9.i0.k(w0Var.f12152u);
    }

    public w0 a() {
        w0 w0Var = new w0();
        w0Var.c(this);
        return w0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f12154a != x0Var.f12154a || this.f12155b != x0Var.f12155b || this.f12156c != x0Var.f12156c || this.f12157d != x0Var.f12157d || this.f12160h != x0Var.f12160h || this.f12158e != x0Var.f12158e || this.f != x0Var.f || this.f12159g != x0Var.f12159g || !this.i.equals(x0Var.i) || !this.f12161j.equals(x0Var.f12161j) || !this.f12162k.equals(x0Var.f12162k) || this.f12163l != x0Var.f12163l || this.f12164m != x0Var.f12164m || !this.f12165n.equals(x0Var.f12165n) || !this.f12166o.equals(x0Var.f12166o) || !this.f12167p.equals(x0Var.f12167p) || this.f12168q != x0Var.f12168q || this.f12169r != x0Var.f12169r || this.f12170s != x0Var.f12170s) {
            return false;
        }
        e1 e1Var = x0Var.f12171t;
        e1 e1Var2 = this.f12171t;
        e1Var2.getClass();
        return y9.p.h(e1Var2, e1Var) && this.f12172u.equals(x0Var.f12172u);
    }

    public int hashCode() {
        int iHashCode = (this.f12165n.hashCode() + ((((((this.f12162k.hashCode() + ((this.f12161j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.f12154a + 31) * 31) + this.f12155b) * 31) + this.f12156c) * 31) + this.f12157d) * 28629151) + (this.f12160h ? 1 : 0)) * 31) + this.f12158e) * 31) + this.f) * 31) + (this.f12159g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.f12163l) * 31) + this.f12164m) * 31)) * 31;
        this.f12166o.getClass();
        return this.f12172u.hashCode() + ((this.f12171t.hashCode() + ((((((((this.f12167p.hashCode() + ((iHashCode + 29791) * 31)) * 961) + (this.f12168q ? 1 : 0)) * 31) + this.f12169r) * 29791) + (this.f12170s ? 1 : 0)) * 961)) * 31);
    }
}
