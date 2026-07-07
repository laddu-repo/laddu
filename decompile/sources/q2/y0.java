package q2;

import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.util.Objects;
import n9.o3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class y0 implements y2.f0 {
    public r1.q A;
    public r1.q B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f10987a;

    /* renamed from: d, reason: collision with root package name */
    public final f2.o f10990d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.l f10991e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f10992f;

    /* renamed from: g, reason: collision with root package name */
    public r1.q f10993g;

    /* renamed from: h, reason: collision with root package name */
    public f2.i f10994h;

    /* renamed from: p, reason: collision with root package name */
    public int f11001p;

    /* renamed from: q, reason: collision with root package name */
    public int f11002q;

    /* renamed from: r, reason: collision with root package name */
    public int f11003r;
    public int s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11007w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11010z;

    /* renamed from: b, reason: collision with root package name */
    public final e8.b f10988b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f10995i = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
    public long[] j = new long[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: k, reason: collision with root package name */
    public long[] f10996k = new long[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: n, reason: collision with root package name */
    public long[] f10999n = new long[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: m, reason: collision with root package name */
    public int[] f10998m = new int[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: l, reason: collision with root package name */
    public int[] f10997l = new int[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: o, reason: collision with root package name */
    public y2.e0[] f11000o = new y2.e0[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];

    /* renamed from: c, reason: collision with root package name */
    public final b2.k f10989c = new b2.k(new o5.p(5));

    /* renamed from: t, reason: collision with root package name */
    public long f11004t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f11005u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f11006v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11009y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11008x = true;
    public boolean D = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [e8.b, java.lang.Object] */
    public y0(u2.e eVar, f2.o oVar, f2.l lVar) {
        this.f10990d = oVar;
        this.f10991e = lVar;
        this.f10987a = new v0(eVar);
    }

    public final void A(r1.q qVar, j4.b0 b0Var) {
        boolean z10;
        r1.m mVar;
        r1.q qVar2;
        r1.q qVar3 = this.f10993g;
        if (qVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar3 == null) {
            mVar = null;
        } else {
            mVar = qVar3.f11674r;
        }
        this.f10993g = qVar;
        r1.m mVar2 = qVar.f11674r;
        f2.o oVar = this.f10990d;
        if (oVar != null) {
            int l10 = oVar.l(qVar);
            r1.p a10 = qVar.a();
            a10.N = l10;
            qVar2 = new r1.q(a10);
        } else {
            qVar2 = qVar;
        }
        b0Var.f7159y = qVar2;
        b0Var.f7158x = this.f10994h;
        if (oVar != null) {
            if (z10 || !Objects.equals(mVar, mVar2)) {
                f2.i iVar = this.f10994h;
                f2.l lVar = this.f10991e;
                f2.i g10 = oVar.g(lVar, qVar);
                this.f10994h = g10;
                b0Var.f7158x = g10;
                if (iVar != null) {
                    iVar.d(lVar);
                }
            }
        }
    }

    public final synchronized long B() {
        boolean z10;
        long j;
        try {
            int u3 = u(this.s);
            if (this.s != this.f11001p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j = this.j[u3];
            } else {
                j = this.C;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final int C(j4.b0 b0Var, y1.h hVar, int i6, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13 = false;
        if ((i6 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e8.b bVar = this.f10988b;
        synchronized (this) {
            try {
                hVar.A = false;
                if (this.s != this.f11001p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i10 = -3;
                if (!z12) {
                    if (!z10 && !this.f11007w) {
                        r1.q qVar = this.B;
                        if (qVar == null || (!z11 && qVar == this.f10993g)) {
                        }
                        A(qVar, b0Var);
                        i10 = -5;
                    }
                    hVar.setFlags(4);
                    hVar.B = Long.MIN_VALUE;
                    i10 = -4;
                } else {
                    r1.q qVar2 = ((w0) this.f10989c.j(t())).f10984a;
                    if (!z11 && qVar2 == this.f10993g) {
                        int u3 = u(this.s);
                        if (!y(u3)) {
                            hVar.A = true;
                        } else {
                            hVar.setFlags(this.f10998m[u3]);
                            if (this.s == this.f11001p - 1 && (z10 || this.f11007w)) {
                                hVar.addFlag(536870912);
                            }
                            hVar.B = this.f10999n[u3];
                            bVar.f4468a = this.f10997l[u3];
                            bVar.f4469b = this.f10996k[u3];
                            bVar.f4470c = this.f11000o[u3];
                            i10 = -4;
                        }
                    }
                    A(qVar2, b0Var);
                    i10 = -5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !hVar.isEndOfStream()) {
            if ((i6 & 1) != 0) {
                z13 = true;
            }
            if ((i6 & 4) == 0) {
                if (z13) {
                    v0 v0Var = this.f10987a;
                    v0.f(v0Var.f10978e, hVar, this.f10988b, v0Var.f10976c);
                } else {
                    v0 v0Var2 = this.f10987a;
                    v0Var2.f10978e = v0.f(v0Var2.f10978e, hVar, this.f10988b, v0Var2.f10976c);
                }
            }
            if (!z13) {
                this.s++;
            }
        }
        return i10;
    }

    public final void D() {
        E(true);
        f2.i iVar = this.f10994h;
        if (iVar != null) {
            iVar.d(this.f10991e);
            this.f10994h = null;
            this.f10993g = null;
        }
    }

    public final void E(boolean z10) {
        boolean z11;
        v0 v0Var = this.f10987a;
        v0Var.a(v0Var.f10977d);
        o3 o3Var = v0Var.f10977d;
        int i6 = v0Var.f10975b;
        if (((u2.a) o3Var.f9423z) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.g(z11);
        o3Var.f9421x = 0L;
        o3Var.f9422y = i6;
        o3 o3Var2 = v0Var.f10977d;
        v0Var.f10978e = o3Var2;
        v0Var.f10979f = o3Var2;
        v0Var.f10980g = 0L;
        v0Var.f10974a.b();
        this.f11001p = 0;
        this.f11002q = 0;
        this.f11003r = 0;
        this.s = 0;
        this.f11008x = true;
        this.f11004t = Long.MIN_VALUE;
        this.f11005u = Long.MIN_VALUE;
        this.f11006v = Long.MIN_VALUE;
        this.f11007w = false;
        b2.k kVar = this.f10989c;
        SparseArray sparseArray = (SparseArray) kVar.f1384z;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((o5.p) kVar.A).accept(sparseArray.valueAt(i10));
        }
        kVar.f1383y = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f11009y = true;
            this.D = true;
        }
    }

    public final synchronized void F() {
        this.s = 0;
        v0 v0Var = this.f10987a;
        v0Var.f10978e = v0Var.f10977d;
    }

    public final synchronized boolean G(int i6) {
        F();
        int i10 = this.f11002q;
        if (i6 >= i10 && i6 <= this.f11001p + i10) {
            this.f11004t = Long.MIN_VALUE;
            this.s = i6 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean H(boolean z10, long j) {
        Throwable th;
        boolean z11;
        y0 y0Var;
        long j10;
        int o10;
        try {
            try {
                F();
                int u3 = u(this.s);
                int i6 = this.s;
                int i10 = this.f11001p;
                if (i6 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j < this.f10999n[u3] || (j > this.f11006v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i11 = i10 - i6;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            try {
                                if (this.f10999n[u3] >= j) {
                                    i11 = i12;
                                    break;
                                }
                                u3++;
                                if (u3 == this.f10995i) {
                                    u3 = 0;
                                }
                                i12++;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else if (!z10) {
                            i11 = -1;
                        }
                    }
                    j10 = j;
                    o10 = i11;
                    y0Var = this;
                } else {
                    int i13 = i10 - i6;
                    y0Var = this;
                    j10 = j;
                    o10 = y0Var.o(u3, i13, j10, true);
                }
                if (o10 == -1) {
                    return false;
                }
                y0Var.f11004t = j10;
                y0Var.s += o10;
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void I(int i6) {
        boolean z10;
        if (i6 >= 0) {
            try {
                if (this.s + i6 <= this.f11001p) {
                    z10 = true;
                    u1.c.b(z10);
                    this.s += i6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        u1.c.b(z10);
        this.s += i6;
    }

    @Override // y2.f0
    public final /* synthetic */ void a(int i6, u1.t tVar) {
        w8.k.a(this, tVar, i6);
    }

    @Override // y2.f0
    public final void b(u1.t tVar, int i6, int i10) {
        while (true) {
            v0 v0Var = this.f10987a;
            if (i6 > 0) {
                int c10 = v0Var.c(i6);
                o3 o3Var = v0Var.f10979f;
                u2.a aVar = (u2.a) o3Var.f9423z;
                tVar.i(aVar.f12825a, ((int) (v0Var.f10980g - o3Var.f9421x)) + aVar.f12826b, c10);
                i6 -= c10;
                long j = v0Var.f10980g + c10;
                v0Var.f10980g = j;
                o3 o3Var2 = v0Var.f10979f;
                if (j == o3Var2.f9422y) {
                    v0Var.f10979f = (o3) o3Var2.A;
                }
            } else {
                v0Var.getClass();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // y2.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(long r13, int r15, int r16, int r17, y2.e0 r18) {
        /*
            r12 = this;
            boolean r0 = r12.f11010z
            if (r0 == 0) goto Lc
            r1.q r0 = r12.A
            u1.c.h(r0)
            r12.f(r0)
        Lc:
            r0 = r15 & 1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            boolean r5 = r12.f11008x
            if (r5 == 0) goto L1f
            if (r4 != 0) goto L1d
            goto L83
        L1d:
            r12.f11008x = r2
        L1f:
            long r5 = r12.F
            long r5 = r5 + r13
            boolean r7 = r12.D
            if (r7 == 0) goto L4d
            long r7 = r12.f11004t
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2d
            goto L83
        L2d:
            if (r0 != 0) goto L4d
            boolean r0 = r12.E
            if (r0 != 0) goto L4a
            java.lang.String r0 = "SampleQueue"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            r7.<init>(r8)
            r1.q r8 = r12.B
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            u1.a.p(r0, r7)
            r12.E = r3
        L4a:
            r0 = r15 | 1
            goto L4e
        L4d:
            r0 = r15
        L4e:
            boolean r7 = r12.G
            if (r7 == 0) goto L84
            if (r4 == 0) goto L83
            monitor-enter(r12)
            int r4 = r12.f11001p     // Catch: java.lang.Throwable -> L63
            if (r4 != 0) goto L65
            long r7 = r12.f11005u     // Catch: java.lang.Throwable -> L63
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            monitor-exit(r12)
            goto L7b
        L63:
            r0 = move-exception
            goto L81
        L65:
            long r7 = r12.r()     // Catch: java.lang.Throwable -> L63
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto L70
            monitor-exit(r12)
            r3 = 0
            goto L7b
        L70:
            int r4 = r12.h(r5)     // Catch: java.lang.Throwable -> L63
            int r7 = r12.f11002q     // Catch: java.lang.Throwable -> L63
            int r7 = r7 + r4
            r12.m(r7)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r12)
        L7b:
            if (r3 != 0) goto L7e
            goto L83
        L7e:
            r12.G = r2
            goto L84
        L81:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L63
            throw r0
        L83:
            return
        L84:
            q2.v0 r2 = r12.f10987a
            long r2 = r2.f10980g
            r7 = r16
            long r8 = (long) r7
            long r2 = r2 - r8
            r4 = r17
            long r8 = (long) r4
            long r2 = r2 - r8
            r10 = r5
            r5 = r2
            r2 = r10
            r1 = r12
            r8 = r18
            r4 = r0
            r1.g(r2, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.y0.c(long, int, int, int, y2.e0):void");
    }

    @Override // y2.f0
    public final int d(r1.i iVar, int i6, boolean z10) {
        v0 v0Var = this.f10987a;
        int c10 = v0Var.c(i6);
        o3 o3Var = v0Var.f10979f;
        u2.a aVar = (u2.a) o3Var.f9423z;
        int read = iVar.read(aVar.f12825a, ((int) (v0Var.f10980g - o3Var.f9421x)) + aVar.f12826b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j = v0Var.f10980g + read;
        v0Var.f10980g = j;
        o3 o3Var2 = v0Var.f10979f;
        if (j == o3Var2.f9422y) {
            v0Var.f10979f = (o3) o3Var2.A;
        }
        return read;
    }

    @Override // y2.f0
    public final int e(r1.i iVar, int i6, boolean z10) {
        return d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final void f(r1.q qVar) {
        boolean z10;
        r1.q p10 = p(qVar);
        boolean z11 = false;
        this.f11010z = false;
        this.A = qVar;
        synchronized (this) {
            try {
                this.f11009y = false;
                if (!Objects.equals(p10, this.B)) {
                    if (((SparseArray) this.f10989c.f1384z).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f10989c.f1384z;
                        if (((w0) sparseArray.valueAt(sparseArray.size() - 1)).f10984a.equals(p10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f10989c.f1384z;
                            this.B = ((w0) sparseArray2.valueAt(sparseArray2.size() - 1)).f10984a;
                            boolean z12 = this.D;
                            r1.q qVar2 = this.B;
                            this.D = z12 & r1.k0.a(qVar2.f11670n, qVar2.f11667k);
                            this.E = false;
                            z11 = true;
                        }
                    }
                    this.B = p10;
                    boolean z122 = this.D;
                    r1.q qVar22 = this.B;
                    this.D = z122 & r1.k0.a(qVar22.f11670n, qVar22.f11667k);
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x0 x0Var = this.f10992f;
        if (x0Var != null && z11) {
            x0Var.D();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (((q2.w0) r9.valueAt(r9.size() - 1)).f10984a.equals(r8.B) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, y2.e0 r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.y0.g(long, int, long, int, y2.e0):void");
    }

    public final int h(long j) {
        int i6 = this.f11001p;
        int u3 = u(i6 - 1);
        while (i6 > this.s && this.f10999n[u3] >= j) {
            i6--;
            u3--;
            if (u3 == -1) {
                u3 = this.f10995i - 1;
            }
        }
        return i6;
    }

    public final long i(int i6) {
        this.f11005u = Math.max(this.f11005u, s(i6));
        this.f11001p -= i6;
        int i10 = this.f11002q + i6;
        this.f11002q = i10;
        int i11 = this.f11003r + i6;
        this.f11003r = i11;
        int i12 = this.f10995i;
        if (i11 >= i12) {
            this.f11003r = i11 - i12;
        }
        int i13 = this.s - i6;
        this.s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.s = 0;
        }
        b2.k kVar = this.f10989c;
        SparseArray sparseArray = (SparseArray) kVar.f1384z;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((o5.p) kVar.A).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = kVar.f1383y;
            if (i16 > 0) {
                kVar.f1383y = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f11001p == 0) {
            int i17 = this.f11003r;
            if (i17 == 0) {
                i17 = this.f10995i;
            }
            return this.f10996k[i17 - 1] + this.f10997l[r7];
        }
        return this.f10996k[this.f11003r];
    }

    public final void j(boolean z10, long j) {
        Throwable th;
        v0 v0Var = this.f10987a;
        synchronized (this) {
            try {
                try {
                    int i6 = this.f11001p;
                    long j10 = -1;
                    if (i6 != 0) {
                        long[] jArr = this.f10999n;
                        int i10 = this.f11003r;
                        if (j >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.s;
                                    if (i11 != i6) {
                                        i6 = i11 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int o10 = o(i10, i6, j, false);
                            if (o10 != -1) {
                                j10 = i(o10);
                            }
                            v0Var.b(j10);
                        }
                    }
                    v0Var.b(j10);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void k() {
        long i6;
        v0 v0Var = this.f10987a;
        synchronized (this) {
            int i10 = this.f11001p;
            if (i10 == 0) {
                i6 = -1;
            } else {
                i6 = i(i10);
            }
        }
        v0Var.b(i6);
    }

    public final void l(long j) {
        boolean z10;
        if (this.f11001p == 0) {
            return;
        }
        if (j > r()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        n(this.f11002q + h(j));
    }

    public final long m(int i6) {
        boolean z10;
        int i10;
        int i11 = this.f11002q;
        int i12 = this.f11001p;
        int i13 = (i11 + i12) - i6;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.s) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        int i14 = this.f11001p - i13;
        this.f11001p = i14;
        this.f11006v = Math.max(this.f11005u, s(i14));
        if (i13 == 0 && this.f11007w) {
            z11 = true;
        }
        this.f11007w = z11;
        b2.k kVar = this.f10989c;
        SparseArray sparseArray = (SparseArray) kVar.f1384z;
        for (int size = sparseArray.size() - 1; size >= 0 && i6 < sparseArray.keyAt(size); size--) {
            ((o5.p) kVar.A).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i10 = Math.min(kVar.f1383y, sparseArray.size() - 1);
        } else {
            i10 = -1;
        }
        kVar.f1383y = i10;
        int i15 = this.f11001p;
        if (i15 != 0) {
            return this.f10996k[u(i15 - 1)] + this.f10997l[r9];
        }
        return 0L;
    }

    public final void n(int i6) {
        boolean z10;
        long m9 = m(i6);
        v0 v0Var = this.f10987a;
        int i10 = v0Var.f10975b;
        if (m9 <= v0Var.f10980g) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        v0Var.f10980g = m9;
        if (m9 != 0) {
            o3 o3Var = v0Var.f10977d;
            if (m9 != o3Var.f9421x) {
                while (v0Var.f10980g > o3Var.f9422y) {
                    o3Var = (o3) o3Var.A;
                }
                o3 o3Var2 = (o3) o3Var.A;
                o3Var2.getClass();
                v0Var.a(o3Var2);
                o3 o3Var3 = new o3(o3Var.f9422y, i10);
                o3Var.A = o3Var3;
                if (v0Var.f10980g == o3Var.f9422y) {
                    o3Var = o3Var3;
                }
                v0Var.f10979f = o3Var;
                if (v0Var.f10978e == o3Var2) {
                    v0Var.f10978e = o3Var3;
                    return;
                }
                return;
            }
        }
        v0Var.a(v0Var.f10977d);
        o3 o3Var4 = new o3(v0Var.f10980g, i10);
        v0Var.f10977d = o3Var4;
        v0Var.f10978e = o3Var4;
        v0Var.f10979f = o3Var4;
    }

    public final int o(int i6, int i10, long j, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f10999n[i6];
            if (j10 > j) {
                break;
            }
            if (!z10 || (this.f10998m[i6] & 1) != 0) {
                if (j10 == j) {
                    return i12;
                }
                i11 = i12;
            }
            i6++;
            if (i6 == this.f10995i) {
                i6 = 0;
            }
        }
        return i11;
    }

    public r1.q p(r1.q qVar) {
        if (this.F != 0 && qVar.s != Long.MAX_VALUE) {
            r1.p a10 = qVar.a();
            a10.f11616r = qVar.s + this.F;
            return new r1.q(a10);
        }
        return qVar;
    }

    public final synchronized long q() {
        return this.f11006v;
    }

    public final synchronized long r() {
        return Math.max(this.f11005u, s(this.s));
    }

    public final long s(int i6) {
        long j = Long.MIN_VALUE;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int u3 = u(i6 - 1);
        for (int i10 = 0; i10 < i6; i10++) {
            j = Math.max(j, this.f10999n[u3]);
            if ((this.f10998m[u3] & 1) != 0) {
                return j;
            }
            u3--;
            if (u3 == -1) {
                u3 = this.f10995i - 1;
            }
        }
        return j;
    }

    public final int t() {
        return this.f11002q + this.s;
    }

    public final int u(int i6) {
        int i10 = this.f11003r + i6;
        int i11 = this.f10995i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int v(boolean z10, long j) {
        boolean z11;
        try {
            try {
                int u3 = u(this.s);
                int i6 = this.s;
                int i10 = this.f11001p;
                if (i6 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j < this.f10999n[u3]) {
                    return 0;
                }
                if (j > this.f11006v && z10) {
                    return i10 - i6;
                }
                int o10 = o(u3, i10 - i6, j, true);
                if (o10 == -1) {
                    return 0;
                }
                return o10;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized r1.q w() {
        r1.q qVar;
        if (this.f11009y) {
            qVar = null;
        } else {
            qVar = this.B;
        }
        return qVar;
    }

    public final synchronized boolean x(boolean z10) {
        boolean z11;
        r1.q qVar;
        boolean z12 = false;
        if (this.s != this.f11001p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f11007w || ((qVar = this.B) != null && qVar != this.f10993g)) {
                z12 = true;
            }
            return z12;
        }
        if (((w0) this.f10989c.j(t())).f10984a != this.f10993g) {
            return true;
        }
        return y(u(this.s));
    }

    public final boolean y(int i6) {
        f2.i iVar = this.f10994h;
        if (iVar != null && iVar.getState() != 4) {
            if ((this.f10998m[i6] & 1073741824) != 0 || !this.f10994h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void z() {
        f2.i iVar = this.f10994h;
        if (iVar != null && iVar.getState() == 1) {
            f2.h error = this.f10994h.getError();
            error.getClass();
            throw error;
        }
    }
}
