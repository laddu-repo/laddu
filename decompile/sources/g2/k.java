package g2;

import a2.a1;
import a2.a2;
import a2.c0;
import a2.c2;
import a2.z0;
import android.net.Uri;
import android.util.SparseArray;
import db.c1;
import db.i0;
import db.k0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o5.e0;
import q2.a0;
import q2.k1;
import q2.z;
import r1.j0;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements a0, h2.t {
    public final w1.a0 A;
    public final f2.o B;
    public final f2.l C;
    public final e0 D;
    public final b2.k E;
    public final u2.e F;
    public final IdentityHashMap G;
    public final a2 H;
    public final e0 I;
    public final boolean J;
    public final int K;
    public final b2.m L;
    public final u5.r M = new u5.r(this, 8);
    public z N;
    public int O;
    public k1 P;
    public q[] Q;
    public q[] R;
    public int S;
    public q2.n T;

    /* renamed from: x, reason: collision with root package name */
    public final c f5345x;

    /* renamed from: y, reason: collision with root package name */
    public final h2.c f5346y;

    /* renamed from: z, reason: collision with root package name */
    public final k7.d f5347z;

    public k(c cVar, h2.c cVar2, k7.d dVar, w1.a0 a0Var, f2.o oVar, f2.l lVar, e0 e0Var, b2.k kVar, u2.e eVar, e0 e0Var2, boolean z10, int i6, b2.m mVar) {
        this.f5345x = cVar;
        this.f5346y = cVar2;
        this.f5347z = dVar;
        this.A = a0Var;
        this.B = oVar;
        this.C = lVar;
        this.D = e0Var;
        this.E = kVar;
        this.F = eVar;
        this.I = e0Var2;
        this.J = z10;
        this.K = i6;
        this.L = mVar;
        e0Var2.getClass();
        i0 i0Var = k0.f4008y;
        c1 c1Var = c1.B;
        this.T = new q2.n(c1Var, c1Var);
        this.G = new IdentityHashMap();
        this.H = new a2(7);
        this.Q = new q[0];
        this.R = new q[0];
    }

    public static r1.q k(r1.q qVar, r1.q qVar2, boolean z10) {
        j0 j0Var;
        int i6;
        String str;
        String str2;
        k0 k0Var;
        String str3;
        int i10;
        int i11;
        int i12;
        i0 i0Var = k0.f4008y;
        c1 c1Var = c1.B;
        int i13 = -1;
        if (qVar2 != null) {
            str2 = qVar2.f11667k;
            j0Var = qVar2.f11668l;
            i10 = qVar2.F;
            i6 = qVar2.f11662e;
            i11 = qVar2.f11663f;
            str = qVar2.f11661d;
            str3 = qVar2.f11659b;
            k0Var = qVar2.f11660c;
        } else {
            String v10 = u1.a0.v(1, qVar.f11667k);
            j0Var = qVar.f11668l;
            if (z10) {
                i10 = qVar.F;
                i6 = qVar.f11662e;
                i11 = qVar.f11663f;
                str = qVar.f11661d;
                str3 = qVar.f11659b;
                str2 = v10;
                k0Var = qVar.f11660c;
            } else {
                i6 = 0;
                str = null;
                str2 = v10;
                k0Var = c1Var;
                str3 = null;
                i10 = -1;
                i11 = 0;
            }
        }
        String e10 = r1.k0.e(str2);
        if (z10) {
            i12 = qVar.f11665h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = qVar.f11666i;
        }
        r1.p pVar = new r1.p();
        pVar.f11600a = qVar.f11658a;
        pVar.f11601b = str3;
        pVar.f11602c = k0.k(k0Var);
        pVar.f11610l = r1.k0.p(qVar.f11669m);
        pVar.f11611m = r1.k0.p(e10);
        pVar.j = str2;
        pVar.f11609k = j0Var;
        pVar.f11607h = i12;
        pVar.f11608i = i13;
        pVar.E = i10;
        pVar.f11604e = i6;
        pVar.f11605f = i11;
        pVar.f11603d = str;
        return new r1.q(pVar);
    }

    @Override // q2.b1
    public final boolean a() {
        return this.T.a();
    }

    @Override // h2.t
    public final void b() {
        k0 k0Var;
        long j;
        for (q qVar : this.Q) {
            u2.o oVar = qVar.G;
            i iVar = qVar.A;
            ArrayList arrayList = qVar.K;
            if (!arrayList.isEmpty()) {
                j jVar = (j) db.r.l(arrayList);
                int b10 = iVar.b(jVar);
                int i6 = jVar.L;
                boolean z10 = true;
                if (b10 == 1) {
                    if (!jVar.f()) {
                        if (i6 == -1) {
                            z10 = false;
                        }
                        u1.c.g(z10);
                        h2.l a10 = iVar.f5324g.a(false, iVar.f5322e[iVar.f5325h.a(jVar.A)]);
                        a10.getClass();
                        k0 k0Var2 = a10.f5923r;
                        int i10 = (int) (jVar.G - a10.f5916k);
                        if (i10 < 0) {
                            j = 0;
                        } else {
                            if (i10 < k0Var2.size()) {
                                k0Var = ((h2.i) k0Var2.get(i10)).J;
                            } else {
                                k0Var = a10.s;
                            }
                            j = ((h2.g) k0Var.get(i6)).f5904z;
                        }
                        jVar.f5343h0 = j;
                    }
                } else if (b10 == 0) {
                    qVar.O.post(new c0(16, qVar, jVar));
                } else if (b10 == 2 && !qVar.f5376q0 && oVar.d()) {
                    oVar.a();
                }
            }
        }
        this.N.j(this);
    }

    @Override // q2.a0
    public final long c(long j, c2 c2Var) {
        h2.l lVar;
        long j10;
        q[] qVarArr = this.R;
        int length = qVarArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            q qVar = qVarArr[i6];
            if (qVar.X == 2) {
                i iVar = qVar.A;
                h2.c cVar = iVar.f5324g;
                int d10 = iVar.f5334r.d();
                Uri[] uriArr = iVar.f5322e;
                if (d10 < uriArr.length && d10 != -1) {
                    lVar = cVar.a(true, uriArr[iVar.f5334r.m()]);
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    k0 k0Var = lVar.f5923r;
                    if (!k0Var.isEmpty()) {
                        long j11 = lVar.f5914h - cVar.K;
                        long j12 = j - j11;
                        int c10 = u1.a0.c(k0Var, Long.valueOf(j12), true);
                        long j13 = ((h2.i) k0Var.get(c10)).B;
                        if (lVar.f5949c && c10 != k0Var.size() - 1) {
                            j10 = ((h2.i) k0Var.get(c10 + 1)).B;
                        } else {
                            j10 = j13;
                        }
                        return c2Var.a(j12, j13, j10) + j11;
                    }
                }
            } else {
                i6++;
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056 A[SYNTHETIC] */
    @Override // h2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.net.Uri r18, j2.y r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            g2.q[] r2 = r0.Q
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L8f
            r8 = r2[r6]
            g2.i r9 = r8.A
            android.net.Uri[] r10 = r9.f5322e
            boolean r11 = u1.a0.l(r10, r1)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L8a
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            o5.e0 r8 = r8.F
            t2.s r13 = r9.f5334r
            u2.h r13 = a8.f.I(r13)
            r8.getClass()
            r8 = r19
            ef.g r13 = o5.e0.e(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.f4580a
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.f4581b
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = -1
        L57:
            if (r15 != r5) goto L5a
            goto L87
        L5a:
            t2.s r4 = r9.f5334r
            int r4 = r4.u(r15)
            if (r4 != r5) goto L63
            goto L87
        L63:
            r9.f5331o = r1
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L89
            t2.s r5 = r9.f5334r
            boolean r4 = r5.p(r4, r13)
            if (r4 == 0) goto L89
            h2.c r4 = r9.f5324g
            java.util.HashMap r4 = r4.A
            java.lang.Object r4 = r4.get(r1)
            h2.b r4 = (h2.b) r4
            if (r4 == 0) goto L84
            boolean r4 = h2.b.a(r4, r13)
            r4 = r4 ^ 1
            goto L85
        L84:
            r4 = 0
        L85:
            if (r4 == 0) goto L89
        L87:
            r4 = 1
            goto L8a
        L89:
            r4 = 0
        L8a:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L8f:
            q2.z r1 = r0.N
            r1.j(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k.d(android.net.Uri, j2.y, boolean):boolean");
    }

    @Override // q2.b1
    public final long e() {
        return this.T.e();
    }

    @Override // q2.b1
    public final boolean f(a1 a1Var) {
        if (this.P == null) {
            for (q qVar : this.Q) {
                if (!qVar.f5361a0) {
                    z0 z0Var = new z0();
                    z0Var.f509a = qVar.f5373m0;
                    qVar.f(new a1(z0Var));
                }
            }
            return false;
        }
        return this.T.f(a1Var);
    }

    @Override // q2.a0
    public final void g() {
        for (q qVar : this.Q) {
            qVar.G();
            if (qVar.f5376q0 && !qVar.f5361a0) {
                throw l0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // q2.a0
    public final long h(long j) {
        q[] qVarArr = this.R;
        if (qVarArr.length > 0) {
            boolean J = qVarArr[0].J(false, j);
            int i6 = 1;
            while (true) {
                q[] qVarArr2 = this.R;
                if (i6 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i6].J(J, j);
                i6++;
            }
            if (J) {
                ((SparseArray) this.H.f162y).clear();
            }
        }
        return j;
    }

    @Override // q2.a0
    public final void i(long j) {
        for (q qVar : this.R) {
            if (qVar.Z && !qVar.E()) {
                int length = qVar.S.length;
                for (int i6 = 0; i6 < length; i6++) {
                    qVar.S[i6].j(qVar.f5371k0[i6], j);
                }
            }
        }
    }

    public final q j(String str, int i6, Uri[] uriArr, r1.q[] qVarArr, r1.q qVar, List list, Map map, long j) {
        return new q(str, i6, this.M, new i(this.f5345x, this.f5346y, uriArr, qVarArr, this.f5347z, this.A, this.H, list, this.L), map, this.F, j, qVar, this.B, this.C, this.D, this.E, this.K);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    @Override // q2.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(q2.z r26, long r27) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k.l(q2.z, long):void");
    }

    @Override // q2.a0
    public final long m() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x011b, code lost:
    
        if (r44 != r3.f5373m0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // q2.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p(t2.s[] r40, boolean[] r41, q2.z0[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k.p(t2.s[], boolean[], q2.z0[], boolean[], long):long");
    }

    @Override // q2.a0
    public final k1 q() {
        k1 k1Var = this.P;
        k1Var.getClass();
        return k1Var;
    }

    @Override // q2.b1
    public final long r() {
        return this.T.r();
    }

    @Override // q2.b1
    public final void s(long j) {
        this.T.s(j);
    }
}
