package n2;

import db.n0;
import m2.l;
import r1.l0;
import u1.a0;
import u1.s;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f8991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8992b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f8993c;

    /* renamed from: d, reason: collision with root package name */
    public long f8994d;

    /* renamed from: e, reason: collision with root package name */
    public int f8995e;

    /* renamed from: f, reason: collision with root package name */
    public int f8996f;

    /* renamed from: g, reason: collision with root package name */
    public long f8997g;

    /* renamed from: h, reason: collision with root package name */
    public long f8998h;

    public f(l lVar) {
        this.f8991a = lVar;
        try {
            this.f8992b = a(lVar.f8519d);
            this.f8994d = -9223372036854775807L;
            this.f8995e = -1;
            this.f8996f = 0;
            this.f8997g = 0L;
            this.f8998h = -9223372036854775807L;
        } catch (l0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(n0 n0Var) {
        boolean z10;
        boolean z11;
        String str = (String) n0Var.get("config");
        int i6 = 0;
        boolean z12 = false;
        i6 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] t10 = a0.t(str);
            s sVar = new s(t10.length, t10);
            int i10 = sVar.i(1);
            if (i10 == 0) {
                if (sVar.i(1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.a("Only supports allStreamsSameTimeFraming.", z10);
                int i11 = sVar.i(6);
                if (sVar.i(4) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u1.c.a("Only suppors one program.", z11);
                if (sVar.i(3) == 0) {
                    z12 = true;
                }
                u1.c.a("Only suppors one layer.", z12);
                i6 = i11;
            } else {
                throw new l0(h8.c.i(i10, "unsupported audio mux version: "), null, true, 0);
            }
        }
        return i6 + 1;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f8994d = j;
        this.f8996f = 0;
        this.f8997g = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        boolean z10;
        if (this.f8994d == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.f8994d = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 2);
        this.f8993c = A;
        String str = a0.f12750a;
        A.f(this.f8991a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        u1.c.h(this.f8993c);
        int a10 = m2.i.a(this.f8995e);
        if (this.f8996f > 0 && a10 < i6) {
            f0 f0Var = this.f8993c;
            f0Var.getClass();
            f0Var.c(this.f8998h, 1, this.f8996f, 0, null);
            this.f8996f = 0;
            this.f8998h = -9223372036854775807L;
        }
        for (int i10 = 0; i10 < this.f8992b; i10++) {
            int i11 = 0;
            while (tVar.f12812b < tVar.f12813c) {
                int y9 = tVar.y();
                i11 += y9;
                if (y9 != 255) {
                    break;
                }
            }
            this.f8993c.a(i11, tVar);
            this.f8996f += i11;
        }
        this.f8998h = a8.d.o(this.f8997g, j, this.f8994d, this.f8991a.f8517b);
        if (z10) {
            f0 f0Var2 = this.f8993c;
            f0Var2.getClass();
            f0Var2.c(this.f8998h, 1, this.f8996f, 0, null);
            this.f8996f = 0;
            this.f8998h = -9223372036854775807L;
        }
        this.f8995e = i6;
    }
}
