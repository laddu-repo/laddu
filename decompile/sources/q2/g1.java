package q2;

import a2.c2;
import android.net.Uri;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 implements a0, u2.j {
    public final o5.e0 A;
    public final b2.k B;
    public final k1 C;
    public final ArrayList D = new ArrayList();
    public final long E;
    public final u2.o F;
    public final r1.q G;
    public final boolean H;
    public boolean I;
    public byte[] J;
    public int K;

    /* renamed from: x, reason: collision with root package name */
    public final w1.l f10884x;

    /* renamed from: y, reason: collision with root package name */
    public final w1.g f10885y;

    /* renamed from: z, reason: collision with root package name */
    public final w1.a0 f10886z;

    public g1(w1.l lVar, w1.g gVar, w1.a0 a0Var, r1.q qVar, long j, o5.e0 e0Var, b2.k kVar, boolean z10, v2.a aVar) {
        u2.o oVar;
        this.f10884x = lVar;
        this.f10885y = gVar;
        this.f10886z = a0Var;
        this.G = qVar;
        this.E = j;
        this.A = e0Var;
        this.B = kVar;
        this.H = z10;
        this.C = new k1(new r1.e1(HttpUrl.FRAGMENT_ENCODE_SET, qVar));
        if (aVar != null) {
            oVar = new u2.o(aVar);
        } else {
            oVar = new u2.o("SingleSampleMediaPeriod");
        }
        this.F = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    @Override // u2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ef.g C(u2.l r15, long r16, long r18, java.io.IOException r20, int r21) {
        /*
            r14 = this;
            r11 = r20
            r0 = r21
            q2.f1 r15 = (q2.f1) r15
            w1.z r15 = r15.f10879y
            q2.u r1 = new q2.u
            android.net.Uri r15 = r15.f13560z
            r2 = r18
            r1.<init>(r2)
            java.lang.String r15 = u1.a0.f12750a
            o5.e0 r15 = r14.A
            r15.getClass()
            boolean r15 = r11 instanceof r1.l0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r15 != 0) goto L51
            boolean r15 = r11 instanceof java.io.FileNotFoundException
            if (r15 != 0) goto L51
            boolean r15 = r11 instanceof w1.s
            if (r15 != 0) goto L51
            boolean r15 = r11 instanceof u2.n
            if (r15 != 0) goto L51
            int r15 = w1.j.f13537y
            r15 = r11
        L30:
            if (r15 == 0) goto L45
            boolean r4 = r15 instanceof w1.j
            if (r4 == 0) goto L40
            r4 = r15
            w1.j r4 = (w1.j) r4
            int r4 = r4.f13538x
            r5 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r5) goto L40
            goto L51
        L40:
            java.lang.Throwable r15 = r15.getCause()
            goto L30
        L45:
            int r15 = r0 + (-1)
            int r15 = r15 * 1000
            r4 = 5000(0x1388, float:7.006E-42)
            int r15 = java.lang.Math.min(r15, r4)
            long r4 = (long) r15
            goto L52
        L51:
            r4 = r2
        L52:
            r15 = 1
            r6 = 0
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L5e
            r2 = 3
            if (r0 < r2) goto L5c
            goto L5e
        L5c:
            r0 = 0
            goto L5f
        L5e:
            r0 = 1
        L5f:
            boolean r2 = r14.H
            if (r2 == 0) goto L72
            if (r0 == 0) goto L72
            java.lang.String r0 = "SingleSampleMediaPeriod"
            java.lang.String r2 = "Loading failed, treating as end-of-stream."
            u1.a.q(r0, r2, r11)
            r14.I = r15
            ef.g r0 = u2.o.B
        L70:
            r13 = r0
            goto L7d
        L72:
            if (r7 == 0) goto L7a
            ef.g r0 = new ef.g
            r0.<init>(r6, r4, r6)
            goto L70
        L7a:
            ef.g r0 = u2.o.C
            goto L70
        L7d:
            boolean r0 = r13.a()
            r12 = r0 ^ 1
            r7 = 0
            long r9 = r14.E
            b2.k r0 = r14.B
            r2 = 1
            r3 = -1
            r1.q r4 = r14.G
            r5 = 0
            r6 = 0
            r0.q(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.g1.C(u2.l, long, long, java.io.IOException, int):ef.g");
    }

    @Override // q2.b1
    public final boolean a() {
        return this.F.d();
    }

    @Override // q2.b1
    public final long e() {
        if (!this.I && !this.F.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        if (!this.I) {
            u2.o oVar = this.F;
            if (!oVar.d() && !oVar.c()) {
                w1.h c10 = this.f10885y.c();
                w1.a0 a0Var = this.f10886z;
                if (a0Var != null) {
                    c10.q(a0Var);
                }
                f1 f1Var = new f1(c10, this.f10884x);
                this.A.getClass();
                oVar.f(f1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // q2.a0
    public final long h(long j) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i6 < arrayList.size()) {
                e1 e1Var = (e1) arrayList.get(i6);
                if (e1Var.f10868x == 2) {
                    e1Var.f10868x = 1;
                }
                i6++;
            } else {
                return j;
            }
        }
    }

    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        f1 f1Var = (f1) lVar;
        this.K = (int) f1Var.f10879y.f13559y;
        byte[] bArr = f1Var.f10880z;
        bArr.getClass();
        this.J = bArr;
        this.I = true;
        Uri uri = f1Var.f10879y.f13560z;
        u uVar = new u(j10);
        this.A.getClass();
        this.B.p(uVar, 1, -1, this.G, 0, null, 0L, this.E);
    }

    @Override // q2.a0
    public final void l(z zVar, long j) {
        zVar.k(this);
    }

    @Override // q2.a0
    public final long m() {
        return -9223372036854775807L;
    }

    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        Uri uri = ((f1) lVar).f10879y.f13560z;
        u uVar = new u(j10);
        this.A.getClass();
        this.B.n(uVar, 1, -1, null, 0, null, 0L, this.E);
    }

    @Override // q2.a0
    public final long p(t2.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j) {
        for (int i6 = 0; i6 < sVarArr.length; i6++) {
            z0 z0Var = z0VarArr[i6];
            ArrayList arrayList = this.D;
            if (z0Var != null && (sVarArr[i6] == null || !zArr[i6])) {
                arrayList.remove(z0Var);
                z0VarArr[i6] = null;
            }
            if (z0VarArr[i6] == null && sVarArr[i6] != null) {
                e1 e1Var = new e1(this);
                arrayList.add(e1Var);
                z0VarArr[i6] = e1Var;
                zArr2[i6] = true;
            }
        }
        return j;
    }

    @Override // q2.a0
    public final k1 q() {
        return this.C;
    }

    @Override // q2.b1
    public final long r() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // u2.j
    public final void z(u2.l lVar, long j, long j10, int i6) {
        u uVar;
        f1 f1Var = (f1) lVar;
        w1.z zVar = f1Var.f10879y;
        if (i6 == 0) {
            uVar = new u(f1Var.f10878x);
        } else {
            Uri uri = zVar.f13560z;
            uVar = new u(j10);
        }
        this.B.s(uVar, 1, -1, this.G, 0, null, 0L, this.E, i6);
    }

    @Override // q2.a0
    public final void g() {
    }

    @Override // q2.a0
    public final void i(long j) {
    }

    @Override // q2.b1
    public final void s(long j) {
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        return j;
    }
}
