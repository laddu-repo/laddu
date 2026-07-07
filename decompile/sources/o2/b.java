package o2;

import a2.c2;
import b2.k;
import com.google.android.gms.internal.measurement.j4;
import db.c1;
import db.i0;
import db.r;
import f2.l;
import f2.o;
import i4.u0;
import java.util.AbstractList;
import java.util.ArrayList;
import o5.e0;
import okhttp3.HttpUrl;
import q2.a0;
import q2.a1;
import q2.b1;
import q2.k1;
import q2.n;
import q2.z;
import q2.z0;
import r1.e1;
import r1.k0;
import r1.q;
import r2.h;
import t2.s;
import u2.e;
import u2.p;
import w1.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements a0, a1 {
    public final o A;
    public final l B;
    public final e0 C;
    public final k D;
    public final e E;
    public final k1 F;
    public final e0 G;
    public z H;
    public p2.c I;
    public h[] J;
    public n K;

    /* renamed from: x, reason: collision with root package name */
    public final j4 f9860x;

    /* renamed from: y, reason: collision with root package name */
    public final w1.a0 f9861y;

    /* renamed from: z, reason: collision with root package name */
    public final p f9862z;

    public b(p2.c cVar, j4 j4Var, w1.a0 a0Var, e0 e0Var, o oVar, l lVar, e0 e0Var2, k kVar, p pVar, e eVar) {
        String str;
        this.I = cVar;
        this.f9860x = j4Var;
        this.f9861y = a0Var;
        this.f9862z = pVar;
        this.A = oVar;
        this.B = lVar;
        this.C = e0Var2;
        this.D = kVar;
        this.E = eVar;
        this.G = e0Var;
        e1[] e1VarArr = new e1[cVar.f10479f.length];
        int i6 = 0;
        while (true) {
            p2.b[] bVarArr = cVar.f10479f;
            if (i6 < bVarArr.length) {
                q[] qVarArr = bVarArr[i6].j;
                q[] qVarArr2 = new q[qVarArr.length];
                for (int i10 = 0; i10 < qVarArr.length; i10++) {
                    q qVar = qVarArr[i10];
                    r1.p a10 = qVar.a();
                    a10.N = oVar.l(qVar);
                    q qVar2 = new q(a10);
                    if (j4Var.f2310y && ((p.l) j4Var.A).g(qVar2)) {
                        r1.p a11 = qVar2.a();
                        a11.f11611m = k0.p("application/x-media3-cues");
                        a11.K = ((p.l) j4Var.A).o(qVar2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(qVar2.f11670n);
                        String str2 = qVar2.f11667k;
                        if (str2 != null) {
                            str = " ".concat(str2);
                        } else {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        sb2.append(str);
                        a11.j = sb2.toString();
                        a11.f11616r = Long.MAX_VALUE;
                        qVar2 = new q(a11);
                    }
                    qVarArr2[i10] = qVar2;
                }
                e1VarArr[i6] = new e1(Integer.toString(i6), qVarArr2);
                i6++;
            } else {
                this.F = new k1(e1VarArr);
                this.J = new h[0];
                e0Var.getClass();
                i0 i0Var = db.k0.f4008y;
                c1 c1Var = c1.B;
                this.K = new n(c1Var, c1Var);
                return;
            }
        }
    }

    @Override // q2.b1
    public final boolean a() {
        return this.K.a();
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        for (h hVar : this.J) {
            if (hVar.f11791x == 2) {
                return hVar.B.c(j, c2Var);
            }
        }
        return j;
    }

    @Override // q2.b1
    public final long e() {
        return this.K.e();
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        return this.K.f(a1Var);
    }

    @Override // q2.a0
    public final void g() {
        this.f9862z.b();
    }

    @Override // q2.a0
    public final long h(long j) {
        for (h hVar : this.J) {
            hVar.B(j);
        }
        return j;
    }

    @Override // q2.a0
    public final void i(long j) {
        for (h hVar : this.J) {
            hVar.i(j);
        }
    }

    @Override // q2.a1
    public final void j(b1 b1Var) {
        z zVar = this.H;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        this.H = zVar;
        zVar.k(this);
    }

    @Override // q2.a0
    public final long m() {
        return -9223372036854775807L;
    }

    @Override // q2.a0
    public final long p(s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        int i6;
        s sVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < sVarArr.length) {
            z0 z0Var = z0VarArr[i10];
            if (z0Var != null) {
                h hVar = (h) z0Var;
                s sVar2 = sVarArr[i10];
                if (sVar2 != null && zArr[i10]) {
                    ((a) hVar.B).f9856e = sVar2;
                    arrayList.add(hVar);
                } else {
                    hVar.A(null);
                    z0VarArr[i10] = null;
                }
            }
            if (z0VarArr[i10] == null && (sVar = sVarArr[i10]) != null) {
                int b10 = this.F.b(sVar.c());
                p2.c cVar = this.I;
                j4 j4Var = this.f9860x;
                w1.h c10 = ((g) j4Var.f2311z).c();
                w1.a0 a0Var = this.f9861y;
                if (a0Var != null) {
                    c10.q(a0Var);
                }
                i6 = i10;
                h hVar2 = new h(this.I.f10479f[b10].f10459a, null, null, new a(this.f9862z, cVar, b10, sVar, c10, (p.l) j4Var.A, j4Var.f2310y), this, this.E, j, this.A, this.B, this.C, this.D, false);
                arrayList.add(hVar2);
                z0VarArr[i6] = hVar2;
                zArr2[i6] = true;
            } else {
                i6 = i10;
            }
            i10 = i6 + 1;
        }
        h[] hVarArr = new h[arrayList.size()];
        this.J = hVarArr;
        arrayList.toArray(hVarArr);
        AbstractList w10 = r.w(arrayList, new u0(27));
        this.G.getClass();
        this.K = new n(arrayList, w10);
        return j;
    }

    @Override // q2.a0
    public final k1 q() {
        return this.F;
    }

    @Override // q2.b1
    public final long r() {
        return this.K.r();
    }

    @Override // q2.b1
    public final void s(long j) {
        this.K.s(j);
    }
}
