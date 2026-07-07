package n2;

import m2.l;
import u1.a0;
import u1.s;
import u1.t;
import y2.f0;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f8954a;

    /* renamed from: c, reason: collision with root package name */
    public f0 f8956c;

    /* renamed from: d, reason: collision with root package name */
    public int f8957d;

    /* renamed from: f, reason: collision with root package name */
    public long f8959f;

    /* renamed from: g, reason: collision with root package name */
    public long f8960g;

    /* renamed from: b, reason: collision with root package name */
    public final s f8955b = new s();

    /* renamed from: e, reason: collision with root package name */
    public long f8958e = -9223372036854775807L;

    public b(l lVar) {
        this.f8954a = lVar;
    }

    @Override // n2.i
    public final void c(long j, long j10) {
        this.f8958e = j;
        this.f8960g = j10;
    }

    @Override // n2.i
    public final void d(long j) {
        boolean z10;
        if (this.f8958e == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.f8958e = j;
    }

    @Override // n2.i
    public final void e(q qVar, int i6) {
        f0 A = qVar.A(i6, 1);
        this.f8956c = A;
        A.f(this.f8954a.f8518c);
    }

    @Override // n2.i
    public final void f(t tVar, long j, int i6, boolean z10) {
        int y9 = tVar.y() & 3;
        int y10 = tVar.y() & 255;
        long o10 = a8.d.o(this.f8960g, j, this.f8958e, this.f8954a.f8517b);
        if (y9 != 0) {
            if (y9 != 1 && y9 != 2) {
                if (y9 != 3) {
                    throw new IllegalArgumentException(String.valueOf(y9));
                }
            } else {
                int i10 = this.f8957d;
                if (i10 > 0) {
                    f0 f0Var = this.f8956c;
                    String str = a0.f12750a;
                    f0Var.c(this.f8959f, 1, i10, 0, null);
                    this.f8957d = 0;
                }
            }
            int a10 = tVar.a();
            f0 f0Var2 = this.f8956c;
            f0Var2.getClass();
            f0Var2.a(a10, tVar);
            int i11 = this.f8957d + a10;
            this.f8957d = i11;
            this.f8959f = o10;
            if (z10 && y9 == 3) {
                f0 f0Var3 = this.f8956c;
                String str2 = a0.f12750a;
                f0Var3.c(o10, 1, i11, 0, null);
                this.f8957d = 0;
                return;
            }
            return;
        }
        int i12 = this.f8957d;
        if (i12 > 0) {
            f0 f0Var4 = this.f8956c;
            String str3 = a0.f12750a;
            f0Var4.c(this.f8959f, 1, i12, 0, null);
            this.f8957d = 0;
        }
        if (y10 == 1) {
            int a11 = tVar.a();
            f0 f0Var5 = this.f8956c;
            f0Var5.getClass();
            f0Var5.a(a11, tVar);
            f0 f0Var6 = this.f8956c;
            String str4 = a0.f12750a;
            f0Var6.c(o10, 1, a11, 0, null);
            return;
        }
        byte[] bArr = tVar.f12811a;
        s sVar = this.f8955b;
        sVar.getClass();
        sVar.o(bArr.length, bArr);
        sVar.u(2);
        long j10 = o10;
        for (int i13 = 0; i13 < y10; i13++) {
            y2.b p10 = y2.a.p(sVar);
            int i14 = p10.f14855d;
            f0 f0Var7 = this.f8956c;
            f0Var7.getClass();
            f0Var7.a(i14, tVar);
            f0 f0Var8 = this.f8956c;
            String str5 = a0.f12750a;
            f0Var8.c(j10, 1, p10.f14855d, 0, null);
            j10 += (p10.f14856e / p10.f14853b) * 1000000;
            sVar.u(i14);
        }
    }
}
