package n9;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z0 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* renamed from: a, reason: collision with root package name */
    public final n1 f9545a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9546b;

    /* renamed from: c, reason: collision with root package name */
    public String f9547c;

    /* renamed from: d, reason: collision with root package name */
    public String f9548d;

    /* renamed from: e, reason: collision with root package name */
    public String f9549e;

    /* renamed from: f, reason: collision with root package name */
    public String f9550f;

    /* renamed from: g, reason: collision with root package name */
    public long f9551g;

    /* renamed from: h, reason: collision with root package name */
    public long f9552h;

    /* renamed from: i, reason: collision with root package name */
    public long f9553i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public long f9554k;

    /* renamed from: l, reason: collision with root package name */
    public String f9555l;

    /* renamed from: m, reason: collision with root package name */
    public long f9556m;

    /* renamed from: n, reason: collision with root package name */
    public long f9557n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9558o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9559p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f9560q;

    /* renamed from: r, reason: collision with root package name */
    public long f9561r;
    public ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public String f9562t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9563u;

    /* renamed from: v, reason: collision with root package name */
    public long f9564v;

    /* renamed from: w, reason: collision with root package name */
    public long f9565w;

    /* renamed from: x, reason: collision with root package name */
    public int f9566x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9567y;

    /* renamed from: z, reason: collision with root package name */
    public Long f9568z;

    public z0(n1 n1Var, String str) {
        w8.x.g(n1Var);
        w8.x.d(str);
        this.f9545a = n1Var;
        this.f9546b = str;
        l1 l1Var = n1Var.D;
        n1.g(l1Var);
        l1Var.d1();
    }

    public final void A(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9565w != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9565w = j;
    }

    public final void B(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.B != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.B = j;
    }

    public final String C() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.C;
    }

    public final String D() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9546b;
    }

    public final String E() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9547c;
    }

    public final void F(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        this.Q |= !Objects.equals(this.f9547c, str);
        this.f9547c = str;
    }

    public final String G() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9548d;
    }

    public final void H(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f9548d, str);
        this.f9548d = str;
    }

    public final void I(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        this.Q |= !Objects.equals(this.f9549e, str);
        this.f9549e = str;
    }

    public final String J() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9550f;
    }

    public final void K(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        this.Q |= !Objects.equals(this.f9550f, str);
        this.f9550f = str;
    }

    public final void L(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9552h != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9552h = j;
    }

    public final void M(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9553i != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9553i = j;
    }

    public final String N() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.j;
    }

    public final void O(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        this.Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9554k;
    }

    public final void Q(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9554k != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9554k = j;
    }

    public final void R(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        this.Q |= !Objects.equals(this.f9555l, str);
        this.f9555l = str;
    }

    public final void S(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9556m != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9556m = j;
    }

    public final void a(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9557n != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9557n = j;
    }

    public final long b() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9561r;
    }

    public final void c(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9561r != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9561r = j;
    }

    public final void d(boolean z10) {
        boolean z11;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z12 = this.Q;
        if (this.f9558o != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Q = z12 | z11;
        this.f9558o = z10;
    }

    public final void e(long j) {
        boolean z10;
        boolean z11 = false;
        if (j >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w8.x.b(z10);
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z12 = this.Q;
        if (this.f9551g != j) {
            z11 = true;
        }
        this.Q = z12 | z11;
        this.f9551g = j;
    }

    public final void f(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.R != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.R = j;
    }

    public final void g(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.S != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.S = j;
    }

    public final void h(long j) {
        n1 n1Var = this.f9545a;
        l1 l1Var = n1Var.D;
        u0 u0Var = n1Var.C;
        n1.g(l1Var);
        l1Var.d1();
        long j10 = this.f9551g + j;
        String str = this.f9546b;
        if (j10 > 2147483647L) {
            n1.g(u0Var);
            u0Var.G.b(u0.l1(str), "Bundle index overflow. appId");
            j10 = (-1) + j;
        }
        long j11 = this.F + 1;
        if (j11 > 2147483647L) {
            n1.g(u0Var);
            u0Var.G.b(u0.l1(str), "Delivery index overflow. appId");
            j11 = 0;
        }
        this.Q = true;
        this.f9551g = j10;
        this.F = j11;
    }

    public final void i(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.J != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.J = j;
    }

    public final void j(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.K != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.K = j;
    }

    public final void k(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.L != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.L = j;
    }

    public final void l(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.M != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.M = j;
    }

    public final void m(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.O != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.O = j;
    }

    public final void n(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.N != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.N = j;
    }

    public final boolean o() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.Q;
    }

    public final void p(int i6) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.D != i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.D = i6;
    }

    public final void q(int i6) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.E != i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.E = i6;
    }

    public final void r(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.F != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.F = j;
    }

    public final String s() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.G;
    }

    public final int t() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.I;
    }

    public final String u() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        String str = this.P;
        v(null);
        return str;
    }

    public final void v(String str) {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final Boolean w() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9560q;
    }

    public final void x(List list) {
        ArrayList arrayList;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        if (!Objects.equals(this.s, list)) {
            this.Q = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.s = arrayList;
        }
    }

    public final boolean y() {
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        return this.f9563u;
    }

    public final void z(long j) {
        boolean z10;
        l1 l1Var = this.f9545a.D;
        n1.g(l1Var);
        l1Var.d1();
        boolean z11 = this.Q;
        if (this.f9564v != j) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z11 | z10;
        this.f9564v = j;
    }
}
