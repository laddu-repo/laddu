package r2;

import android.net.Uri;
import com.google.android.gms.internal.measurement.p4;
import j1.f0;
import j4.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o5.e0;
import q2.a1;
import q2.b1;
import q2.u;
import q2.y0;
import q2.z0;
import r1.k0;
import r1.q;
import u1.a0;
import u2.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements z0, b1, u2.j, u2.m {
    public final boolean[] A;
    public final i B;
    public final Object C;
    public final b2.k D;
    public final e0 E;
    public final o F;
    public final p4 G;
    public final ArrayList H;
    public final List I;
    public final y0 J;
    public final y0[] K;
    public final f0 L;
    public e M;
    public q N;
    public g O;
    public long P;
    public long Q;
    public int R;
    public a S;
    public boolean T;
    public boolean U;
    public boolean V;

    /* renamed from: x, reason: collision with root package name */
    public final int f11791x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f11792y;

    /* renamed from: z, reason: collision with root package name */
    public final q[] f11793z;

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.measurement.p4, java.lang.Object] */
    public h(int i6, int[] iArr, q[] qVarArr, i iVar, a1 a1Var, u2.e eVar, long j, f2.o oVar, f2.l lVar, e0 e0Var, b2.k kVar, boolean z10) {
        this.f11791x = i6;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f11792y = iArr;
        this.f11793z = qVarArr == null ? new q[0] : qVarArr;
        this.B = iVar;
        this.C = a1Var;
        this.D = kVar;
        this.E = e0Var;
        this.T = z10;
        this.F = new o("ChunkSampleStream");
        this.G = new Object();
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.K = new y0[length];
        this.A = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        y0[] y0VarArr = new y0[i11];
        oVar.getClass();
        y0 y0Var = new y0(eVar, oVar, lVar);
        this.J = y0Var;
        iArr2[0] = i6;
        y0VarArr[0] = y0Var;
        while (i10 < length) {
            y0 y0Var2 = new y0(eVar, null, null);
            this.K[i10] = y0Var2;
            int i12 = i10 + 1;
            y0VarArr[i12] = y0Var2;
            iArr2[i12] = this.f11792y[i10];
            i10 = i12;
        }
        this.L = new f0(28, iArr2, y0VarArr);
        this.P = j;
        this.Q = j;
    }

    public final void A(d2.c cVar) {
        this.O = cVar;
        y0 y0Var = this.J;
        y0Var.k();
        f2.i iVar = y0Var.f10994h;
        if (iVar != null) {
            iVar.d(y0Var.f10991e);
            y0Var.f10994h = null;
            y0Var.f10993g = null;
        }
        for (y0 y0Var2 : this.K) {
            y0Var2.k();
            f2.i iVar2 = y0Var2.f10994h;
            if (iVar2 != null) {
                iVar2.d(y0Var2.f10991e);
                y0Var2.f10994h = null;
                y0Var2.f10993g = null;
            }
        }
        this.F.e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(long r12) {
        /*
            r11 = this;
            r11.Q = r12
            r0 = 0
            r11.T = r0
            boolean r1 = r11.w()
            if (r1 == 0) goto Le
            r11.P = r12
            return
        Le:
            r1 = 0
        Lf:
            java.util.ArrayList r2 = r11.H
            int r3 = r2.size()
            r4 = 0
            if (r1 >= r3) goto L36
            java.lang.Object r3 = r2.get(r1)
            r2.a r3 = (r2.a) r3
            long r5 = r3.D
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 != 0) goto L30
            long r5 = r3.H
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L30
            goto L37
        L30:
            if (r7 <= 0) goto L33
            goto L36
        L33:
            int r1 = r1 + 1
            goto Lf
        L36:
            r3 = r4
        L37:
            q2.y0 r1 = r11.J
            r5 = 1
            if (r3 == 0) goto L45
            int r3 = r3.c(r0)
            boolean r3 = r1.G(r3)
            goto L5b
        L45:
            long r6 = r11.e()
            r8 = -9223372036854775808
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L56
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 >= 0) goto L54
            goto L56
        L54:
            r3 = 0
            goto L57
        L56:
            r3 = 1
        L57:
            boolean r3 = r1.H(r3, r12)
        L5b:
            q2.y0[] r6 = r11.K
            if (r3 == 0) goto L74
            int r1 = r1.t()
            int r1 = r11.y(r1, r0)
            r11.R = r1
            int r1 = r6.length
        L6a:
            if (r0 >= r1) goto La8
            r2 = r6[r0]
            r2.H(r5, r12)
            int r0 = r0 + 1
            goto L6a
        L74:
            r11.P = r12
            r11.V = r0
            r2.clear()
            r11.R = r0
            u2.o r12 = r11.F
            boolean r13 = r12.d()
            if (r13 == 0) goto L97
            r1.k()
            int r13 = r6.length
        L89:
            if (r0 >= r13) goto L93
            r1 = r6[r0]
            r1.k()
            int r0 = r0 + 1
            goto L89
        L93:
            r12.a()
            return
        L97:
            r12.f12870z = r4
            r1.E(r0)
            int r12 = r6.length
            r13 = 0
        L9e:
            if (r13 >= r12) goto La8
            r1 = r6[r13]
            r1.E(r0)
            int r13 = r13 + 1
            goto L9e
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.h.B(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Type inference failed for: r1v3, types: [q2.a1, java.lang.Object] */
    @Override // u2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ef.g C(u2.l r25, long r26, long r28, java.io.IOException r30, int r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2.e r1 = (r2.e) r1
            w1.z r2 = r1.F
            long r2 = r2.f13559y
            boolean r4 = r1 instanceof r2.a
            java.util.ArrayList r5 = r0.H
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            r10 = 0
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.v(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            q2.u r12 = new q2.u
            w1.z r3 = r1.F
            android.net.Uri r3 = r3.f13560z
            r8 = r28
            r12.<init>(r8)
            long r8 = r1.D
            u1.a0.e0(r8)
            long r8 = r1.E
            u1.a0.e0(r8)
            j2.y r3 = new j2.y
            r8 = 6
            r9 = r30
            r11 = r31
            r3.<init>(r11, r8, r9)
            r2.i r8 = r0.B
            o5.e0 r11 = r0.E
            boolean r8 = r8.h(r1, r2, r3, r11)
            r13 = 0
            if (r8 == 0) goto L74
            if (r2 == 0) goto L6d
            if (r4 == 0) goto L6a
            r2.a r2 = r0.t(r6)
            if (r2 != r1) goto L5c
            goto L5d
        L5c:
            r7 = 0
        L5d:
            u1.c.g(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L6a
            long r4 = r0.Q
            r0.P = r4
        L6a:
            ef.g r2 = u2.o.B
            goto L75
        L6d:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            u1.a.p(r2, r4)
        L74:
            r2 = r13
        L75:
            if (r2 != 0) goto L91
            r11.getClass()
            long r2 = o5.e0.h(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L8f
            ef.g r4 = new ef.g
            r5 = 0
            r4.<init>(r10, r2, r5)
            r2 = r4
            goto L91
        L8f:
            ef.g r2 = u2.o.C
        L91:
            boolean r3 = r2.a()
            r23 = r3 ^ 1
            r4 = r13
            int r13 = r1.f11787z
            r1.q r15 = r1.A
            int r5 = r1.B
            java.lang.Object r6 = r1.C
            long r7 = r1.D
            r16 = r5
            long r4 = r1.E
            r1 = r11
            b2.k r11 = r0.D
            int r14 = r0.f11791x
            r20 = r4
            r17 = r6
            r18 = r7
            r22 = r9
            r4 = 0
            r11.q(r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            if (r3 != 0) goto Lc3
            r0.M = r4
            r1.getClass()
            java.lang.Object r1 = r0.C
            r1.j(r0)
        Lc3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.h.C(u2.l, long, long, java.io.IOException, int):ef.g");
    }

    @Override // q2.b1
    public final boolean a() {
        return this.F.d();
    }

    @Override // q2.z0
    public final void b() {
        o oVar = this.F;
        oVar.b();
        this.J.z();
        if (!oVar.d()) {
            this.B.b();
        }
    }

    @Override // u2.m
    public final void d() {
        this.J.D();
        for (y0 y0Var : this.K) {
            y0Var.D();
        }
        this.B.a();
        g gVar = this.O;
        if (gVar != null) {
            d2.c cVar = (d2.c) gVar;
            synchronized (cVar) {
                d2.o oVar = (d2.o) cVar.K.remove(this);
                if (oVar != null) {
                    oVar.f3759a.D();
                }
            }
        }
    }

    @Override // q2.b1
    public final long e() {
        if (w()) {
            return this.P;
        }
        if (this.V) {
            return Long.MIN_VALUE;
        }
        return u().E;
    }

    @Override // q2.b1
    public final boolean f(a2.a1 a1Var) {
        long j;
        List list;
        if (!this.V) {
            o oVar = this.F;
            if (!oVar.d() && !oVar.c()) {
                boolean w10 = w();
                if (w10) {
                    list = Collections.EMPTY_LIST;
                    j = this.P;
                } else {
                    j = u().E;
                    list = this.I;
                }
                this.B.e(a1Var, j, list, this.G);
                p4 p4Var = this.G;
                boolean z10 = p4Var.f2388a;
                e eVar = (e) p4Var.f2389b;
                p4Var.f2389b = null;
                p4Var.f2388a = false;
                if (z10) {
                    this.P = -9223372036854775807L;
                    this.V = true;
                    return true;
                }
                if (eVar != null) {
                    this.M = eVar;
                    boolean z11 = eVar instanceof a;
                    f0 f0Var = this.L;
                    if (z11) {
                        a aVar = (a) eVar;
                        if (w10) {
                            long j10 = aVar.D;
                            long j11 = this.P;
                            if (j10 < j11) {
                                this.J.f11004t = j11;
                                for (y0 y0Var : this.K) {
                                    y0Var.f11004t = this.P;
                                }
                                if (this.T) {
                                    q qVar = aVar.A;
                                    this.U = !k0.a(qVar.f11670n, qVar.f11667k);
                                }
                            }
                            this.T = false;
                            this.P = -9223372036854775807L;
                        }
                        aVar.J = f0Var;
                        y0[] y0VarArr = (y0[]) f0Var.f6908z;
                        int[] iArr = new int[y0VarArr.length];
                        for (int i6 = 0; i6 < y0VarArr.length; i6++) {
                            y0 y0Var2 = y0VarArr[i6];
                            iArr[i6] = y0Var2.f11002q + y0Var2.f11001p;
                        }
                        aVar.K = iArr;
                        this.H.add(aVar);
                    } else if (eVar instanceof k) {
                        ((k) eVar).H = f0Var;
                    }
                    oVar.f(eVar, this, this.E.f(eVar.f11787z));
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(long j) {
        long j10;
        if (!w()) {
            y0 y0Var = this.J;
            int i6 = y0Var.f11002q;
            y0Var.j(true, j);
            y0 y0Var2 = this.J;
            int i10 = y0Var2.f11002q;
            if (i10 > i6) {
                synchronized (y0Var2) {
                    if (y0Var2.f11001p == 0) {
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = y0Var2.f10999n[y0Var2.f11003r];
                    }
                }
                int i11 = 0;
                while (true) {
                    y0[] y0VarArr = this.K;
                    if (i11 >= y0VarArr.length) {
                        break;
                    }
                    y0VarArr[i11].j(this.A[i11], j10);
                    i11++;
                }
            }
            int min = Math.min(y(i10, 0), this.R);
            if (min > 0) {
                a0.V(this.H, 0, min);
                this.R -= min;
            }
        }
    }

    @Override // q2.z0
    public final boolean isReady() {
        if (!w() && this.J.x(this.V)) {
            return true;
        }
        return false;
    }

    @Override // q2.z0
    public final int j(long j) {
        if (w()) {
            return 0;
        }
        boolean z10 = this.V;
        y0 y0Var = this.J;
        int v10 = y0Var.v(z10, j);
        a aVar = this.S;
        if (aVar != null) {
            v10 = Math.min(v10, aVar.c(0) - y0Var.t());
        }
        y0Var.I(v10);
        x();
        return v10;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [q2.a1, java.lang.Object] */
    @Override // u2.j
    public final void k(u2.l lVar, long j, long j10) {
        e eVar = (e) lVar;
        this.M = null;
        this.B.d(eVar);
        long j11 = eVar.f11785x;
        Uri uri = eVar.F.f13560z;
        u uVar = new u(j10);
        this.E.getClass();
        this.D.p(uVar, eVar.f11787z, this.f11791x, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E);
        this.C.j(this);
    }

    @Override // q2.z0
    public final int n(b0 b0Var, y1.h hVar, int i6) {
        if (!w()) {
            a aVar = this.S;
            y0 y0Var = this.J;
            if (aVar != null && aVar.c(0) <= y0Var.t()) {
                return -3;
            }
            x();
            return y0Var.C(b0Var, hVar, i6, this.V);
        }
        return -3;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [q2.a1, java.lang.Object] */
    @Override // u2.j
    public final void o(u2.l lVar, long j, long j10, boolean z10) {
        e eVar = (e) lVar;
        this.M = null;
        this.S = null;
        long j11 = eVar.f11785x;
        Uri uri = eVar.F.f13560z;
        u uVar = new u(j10);
        this.E.getClass();
        this.D.n(uVar, eVar.f11787z, this.f11791x, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E);
        if (!z10) {
            if (w()) {
                this.J.E(false);
                for (y0 y0Var : this.K) {
                    y0Var.E(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.H;
                t(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.P = this.Q;
                }
            }
            this.C.j(this);
        }
    }

    @Override // q2.b1
    public final long r() {
        if (this.V) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.P;
        }
        long j = this.Q;
        a u3 = u();
        if (!u3.b()) {
            ArrayList arrayList = this.H;
            if (arrayList.size() > 1) {
                u3 = (a) arrayList.get(arrayList.size() - 2);
            } else {
                u3 = null;
            }
        }
        if (u3 != null) {
            j = Math.max(j, u3.E);
        }
        return Math.max(j, this.J.q());
    }

    @Override // q2.b1
    public final void s(long j) {
        o oVar = this.F;
        if (!oVar.c() && !w()) {
            boolean d10 = oVar.d();
            List list = this.I;
            i iVar = this.B;
            ArrayList arrayList = this.H;
            if (d10) {
                e eVar = this.M;
                eVar.getClass();
                boolean z10 = eVar instanceof a;
                if ((!z10 || !v(arrayList.size() - 1)) && iVar.g(j, eVar, list)) {
                    oVar.a();
                    if (z10) {
                        this.S = (a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int f3 = iVar.f(j, list);
            if (f3 < arrayList.size()) {
                u1.c.g(!oVar.d());
                int size = arrayList.size();
                while (true) {
                    if (f3 < size) {
                        if (!v(f3)) {
                            break;
                        } else {
                            f3++;
                        }
                    } else {
                        f3 = -1;
                        break;
                    }
                }
                if (f3 != -1) {
                    long j10 = u().E;
                    a t10 = t(f3);
                    if (arrayList.isEmpty()) {
                        this.P = this.Q;
                    }
                    this.V = false;
                    this.D.C(this.f11791x, t10.D, j10);
                }
            }
        }
    }

    public final a t(int i6) {
        ArrayList arrayList = this.H;
        a aVar = (a) arrayList.get(i6);
        a0.V(arrayList, i6, arrayList.size());
        this.R = Math.max(this.R, arrayList.size());
        int i10 = 0;
        this.J.n(aVar.c(0));
        while (true) {
            y0[] y0VarArr = this.K;
            if (i10 < y0VarArr.length) {
                y0 y0Var = y0VarArr[i10];
                i10++;
                y0Var.n(aVar.c(i10));
            } else {
                return aVar;
            }
        }
    }

    public final a u() {
        return (a) this.H.get(r0.size() - 1);
    }

    public final boolean v(int i6) {
        int t10;
        a aVar = (a) this.H.get(i6);
        if (this.J.t() > aVar.c(0)) {
            return true;
        }
        int i10 = 0;
        do {
            y0[] y0VarArr = this.K;
            if (i10 >= y0VarArr.length) {
                return false;
            }
            t10 = y0VarArr[i10].t();
            i10++;
        } while (t10 <= aVar.c(i10));
        return true;
    }

    public final boolean w() {
        if (this.P != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void x() {
        int y9 = y(this.J.t(), this.R - 1);
        while (true) {
            int i6 = this.R;
            if (i6 <= y9) {
                this.R = i6 + 1;
                a aVar = (a) this.H.get(i6);
                q qVar = aVar.A;
                if (!qVar.equals(this.N)) {
                    this.D.h(this.f11791x, qVar, aVar.B, aVar.C, aVar.D);
                }
                this.N = qVar;
            } else {
                return;
            }
        }
    }

    public final int y(int i6, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).c(0) <= i6);
        return i10 - 1;
    }

    @Override // u2.j
    public final void z(u2.l lVar, long j, long j10, int i6) {
        u uVar;
        e eVar = (e) lVar;
        if (i6 == 0) {
            long j11 = eVar.f11785x;
            uVar = new u(eVar.f11786y);
        } else {
            long j12 = eVar.f11785x;
            Uri uri = eVar.F.f13560z;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.D.s(uVar2, eVar.f11787z, this.f11791x, eVar.A, eVar.B, eVar.C, eVar.D, eVar.E, i6);
    }
}
