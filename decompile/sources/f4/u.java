package f4;

import com.google.protobuf.CodedOutputStream;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements i {

    /* renamed from: a, reason: collision with root package name */
    public final u1.t f4954a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.x f4955b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4957d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4958e;

    /* renamed from: f, reason: collision with root package name */
    public y2.f0 f4959f;

    /* renamed from: g, reason: collision with root package name */
    public String f4960g;

    /* renamed from: h, reason: collision with root package name */
    public int f4961h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f4962i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4963k;

    /* renamed from: l, reason: collision with root package name */
    public long f4964l;

    /* renamed from: m, reason: collision with root package name */
    public int f4965m;

    /* renamed from: n, reason: collision with root package name */
    public long f4966n;

    /* JADX WARN: Type inference failed for: r0v1, types: [y2.x, java.lang.Object] */
    public u(String str, int i6, String str2) {
        u1.t tVar = new u1.t(4);
        this.f4954a = tVar;
        tVar.f12811a[0] = -1;
        this.f4955b = new Object();
        this.f4966n = -9223372036854775807L;
        this.f4956c = str;
        this.f4957d = i6;
        this.f4958e = str2;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        boolean z10;
        boolean z11;
        u1.c.h(this.f4959f);
        while (tVar.a() > 0) {
            int i6 = this.f4961h;
            u1.t tVar2 = this.f4954a;
            boolean z12 = true;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int min = Math.min(tVar.a(), this.f4965m - this.f4962i);
                        this.f4959f.a(min, tVar);
                        int i10 = this.f4962i + min;
                        this.f4962i = i10;
                        if (i10 >= this.f4965m) {
                            if (this.f4966n == -9223372036854775807L) {
                                z12 = false;
                            }
                            u1.c.g(z12);
                            this.f4959f.c(this.f4966n, 1, this.f4965m, 0, null);
                            this.f4966n += this.f4964l;
                            this.f4962i = 0;
                            this.f4961h = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(tVar.a(), 4 - this.f4962i);
                    tVar.i(tVar2.f12811a, this.f4962i, min2);
                    int i11 = this.f4962i + min2;
                    this.f4962i = i11;
                    if (i11 >= 4) {
                        tVar2.K(0);
                        int k8 = tVar2.k();
                        y2.x xVar = this.f4955b;
                        if (!xVar.a(k8)) {
                            this.f4962i = 0;
                            this.f4961h = 1;
                        } else {
                            this.f4965m = xVar.f14964b;
                            if (!this.j) {
                                this.f4964l = (xVar.f14968f * 1000000) / xVar.f14965c;
                                r1.p pVar = new r1.p();
                                pVar.f11600a = this.f4960g;
                                pVar.f11610l = k0.p(this.f4958e);
                                pVar.f11611m = k0.p((String) xVar.f14969g);
                                pVar.f11612n = CodedOutputStream.DEFAULT_BUFFER_SIZE;
                                pVar.E = xVar.f14966d;
                                pVar.F = xVar.f14965c;
                                pVar.f11603d = this.f4956c;
                                pVar.f11605f = this.f4957d;
                                this.f4959f.f(new r1.q(pVar));
                                this.j = true;
                            }
                            tVar2.K(0);
                            this.f4959f.a(4, tVar2);
                            this.f4961h = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = tVar.f12811a;
                int i12 = tVar.f12812b;
                int i13 = tVar.f12813c;
                while (true) {
                    if (i12 < i13) {
                        byte b10 = bArr[i12];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f4963k && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f4963k = z10;
                        if (z11) {
                            tVar.K(i12 + 1);
                            this.f4963k = false;
                            tVar2.f12811a[1] = bArr[i12];
                            this.f4962i = 2;
                            this.f4961h = 1;
                            break;
                        }
                        i12++;
                    } else {
                        tVar.K(i13);
                        break;
                    }
                }
            }
        }
    }

    @Override // f4.i
    public final void c() {
        this.f4961h = 0;
        this.f4962i = 0;
        this.f4963k = false;
        this.f4966n = -9223372036854775807L;
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4966n = j;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4960g = h0Var.f4815e;
        h0Var.b();
        this.f4959f = qVar.A(h0Var.f4814d, 1);
    }

    @Override // f4.i
    public final void d(boolean z10) {
    }
}
