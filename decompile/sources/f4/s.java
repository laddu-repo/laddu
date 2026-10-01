package f4;

import a2.t0;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;
import r1.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f4921a;

    /* renamed from: b, reason: collision with root package name */
    public String f4922b;

    /* renamed from: c, reason: collision with root package name */
    public y2.f0 f4923c;

    /* renamed from: d, reason: collision with root package name */
    public r f4924d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4925e;

    /* renamed from: l, reason: collision with root package name */
    public long f4931l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f4926f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final t0 f4927g = new t0(32);

    /* renamed from: h, reason: collision with root package name */
    public final t0 f4928h = new t0(33);

    /* renamed from: i, reason: collision with root package name */
    public final t0 f4929i = new t0(34);
    public final t0 j = new t0(39);

    /* renamed from: k, reason: collision with root package name */
    public final t0 f4930k = new t0(40);

    /* renamed from: m, reason: collision with root package name */
    public long f4932m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final u1.t f4933n = new u1.t();

    public s(d0 d0Var) {
        this.f4921a = d0Var;
    }

    @Override // f4.i
    public final void a(u1.t tVar) {
        int i6;
        int i10;
        u1.c.h(this.f4923c);
        String str = u1.a0.f12750a;
        while (tVar.a() > 0) {
            int i11 = tVar.f12812b;
            int i12 = tVar.f12813c;
            byte[] bArr = tVar.f12811a;
            this.f4931l += tVar.a();
            this.f4923c.a(tVar.a(), tVar);
            while (i11 < i12) {
                int b10 = v1.o.b(bArr, i11, i12, this.f4926f);
                if (b10 == i12) {
                    g(bArr, i11, i12);
                    return;
                }
                int i13 = (bArr[b10 + 3] & 126) >> 1;
                if (b10 > 0 && bArr[b10 - 1] == 0) {
                    b10--;
                    i6 = 4;
                } else {
                    i6 = 3;
                }
                int i14 = b10;
                int i15 = i14 - i11;
                if (i15 > 0) {
                    g(bArr, i11, i14);
                }
                int i16 = i12 - i14;
                long j = this.f4931l - i16;
                if (i15 < 0) {
                    i10 = -i15;
                } else {
                    i10 = 0;
                }
                b(i16, i10, j, this.f4932m);
                h(i16, i13, j, this.f4932m);
                i11 = i14 + i6;
            }
        }
    }

    public final void b(int i6, int i10, long j, long j10) {
        o4.j jVar = this.f4921a.f4740d;
        r rVar = this.f4924d;
        boolean z10 = this.f4925e;
        if (rVar.j && rVar.f4915g) {
            rVar.f4920m = rVar.f4911c;
            rVar.j = false;
        } else if (rVar.f4916h || rVar.f4915g) {
            if (z10 && rVar.f4917i) {
                rVar.a(i6 + ((int) (j - rVar.f4910b)));
            }
            rVar.f4918k = rVar.f4910b;
            rVar.f4919l = rVar.f4913e;
            rVar.f4920m = rVar.f4911c;
            rVar.f4917i = true;
        }
        if (!this.f4925e) {
            t0 t0Var = this.f4927g;
            t0Var.e(i10);
            t0 t0Var2 = this.f4928h;
            t0Var2.e(i10);
            t0 t0Var3 = this.f4929i;
            t0Var3.e(i10);
            if (t0Var.f416d && t0Var2.f416d && t0Var3.f416d) {
                String str = this.f4922b;
                int i11 = t0Var.f417e;
                byte[] bArr = new byte[t0Var2.f417e + i11 + t0Var3.f417e];
                System.arraycopy((byte[]) t0Var.f418f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) t0Var2.f418f, 0, bArr, t0Var.f417e, t0Var2.f417e);
                System.arraycopy((byte[]) t0Var3.f418f, 0, bArr, t0Var.f417e + t0Var2.f417e, t0Var3.f417e);
                String str2 = null;
                v1.k h4 = v1.o.h((byte[]) t0Var2.f418f, 3, t0Var2.f417e, null);
                v1.h hVar = h4.f13214b;
                if (hVar != null) {
                    str2 = u1.d.b(hVar.f13200a, hVar.f13201b, hVar.f13202c, hVar.f13203d, hVar.f13204e, hVar.f13205f);
                }
                r1.p pVar = new r1.p();
                pVar.f11600a = str;
                pVar.f11610l = k0.p("video/mp2t");
                pVar.f11611m = k0.p(MimeTypes.VIDEO_H265);
                pVar.j = str2;
                pVar.f11617t = h4.f13217e;
                pVar.f11618u = h4.f13218f;
                pVar.f11619v = h4.f13219g;
                pVar.f11620w = h4.f13220h;
                pVar.C = new r1.h(h4.f13222k, h4.f13223l, h4.f13224m, null, h4.f13215c + 8, h4.f13216d + 8);
                pVar.f11623z = h4.f13221i;
                pVar.f11613o = h4.j;
                pVar.D = h4.f13213a + 1;
                pVar.f11614p = Collections.singletonList(bArr);
                r1.q qVar = new r1.q(pVar);
                this.f4923c.f(qVar);
                int i12 = qVar.f11672p;
                if (i12 != -1) {
                    jVar.v(i12);
                    this.f4925e = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        t0 t0Var4 = this.j;
        boolean e10 = t0Var4.e(i10);
        u1.t tVar = this.f4933n;
        if (e10) {
            tVar.I(v1.o.m(t0Var4.f417e, (byte[]) t0Var4.f418f), (byte[]) t0Var4.f418f);
            tVar.L(5);
            jVar.a(j10, tVar);
        }
        t0 t0Var5 = this.f4930k;
        if (t0Var5.e(i10)) {
            tVar.I(v1.o.m(t0Var5.f417e, (byte[]) t0Var5.f418f), (byte[]) t0Var5.f418f);
            tVar.L(5);
            jVar.a(j10, tVar);
        }
    }

    @Override // f4.i
    public final void c() {
        this.f4931l = 0L;
        this.f4932m = -9223372036854775807L;
        v1.o.a(this.f4926f);
        this.f4927g.g();
        this.f4928h.g();
        this.f4929i.g();
        this.j.g();
        this.f4930k.g();
        this.f4921a.f4740d.i(0);
        r rVar = this.f4924d;
        if (rVar != null) {
            rVar.f4914f = false;
            rVar.f4915g = false;
            rVar.f4916h = false;
            rVar.f4917i = false;
            rVar.j = false;
        }
    }

    @Override // f4.i
    public final void d(boolean z10) {
        u1.c.h(this.f4923c);
        String str = u1.a0.f12750a;
        if (z10) {
            this.f4921a.f4740d.i(0);
            b(0, 0, this.f4931l, this.f4932m);
            h(0, 48, this.f4931l, this.f4932m);
        }
    }

    @Override // f4.i
    public final void e(int i6, long j) {
        this.f4932m = j;
    }

    @Override // f4.i
    public final void f(y2.q qVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f4922b = h0Var.f4815e;
        h0Var.b();
        y2.f0 A = qVar.A(h0Var.f4814d, 2);
        this.f4923c = A;
        this.f4924d = new r(A);
        this.f4921a.b(qVar, h0Var);
    }

    public final void g(byte[] bArr, int i6, int i10) {
        boolean z10;
        r rVar = this.f4924d;
        if (rVar.f4914f) {
            int i11 = rVar.f4912d;
            int i12 = (i6 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f4915g = z10;
                rVar.f4914f = false;
            } else {
                rVar.f4912d = (i10 - i6) + i11;
            }
        }
        if (!this.f4925e) {
            this.f4927g.a(bArr, i6, i10);
            this.f4928h.a(bArr, i6, i10);
            this.f4929i.a(bArr, i6, i10);
        }
        this.j.a(bArr, i6, i10);
        this.f4930k.a(bArr, i6, i10);
    }

    public final void h(int i6, int i10, long j, long j10) {
        boolean z10;
        r rVar = this.f4924d;
        boolean z11 = this.f4925e;
        boolean z12 = false;
        rVar.f4915g = false;
        rVar.f4916h = false;
        rVar.f4913e = j10;
        rVar.f4912d = 0;
        rVar.f4910b = j;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.f4917i && !rVar.j) {
                if (z11) {
                    rVar.a(i6);
                }
                rVar.f4917i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.f4916h = !rVar.j;
                rVar.j = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.f4911c = z10;
        if (z10 || i10 <= 9) {
            z12 = true;
        }
        rVar.f4914f = z12;
        if (!this.f4925e) {
            this.f4927g.h(i10);
            this.f4928h.h(i10);
            this.f4929i.h(i10);
        }
        this.j.h(i10);
        this.f4930k.h(i10);
    }
}
