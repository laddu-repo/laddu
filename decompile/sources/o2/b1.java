package o2;

import android.util.SparseArray;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.util.Objects;
import k8.w3;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements w2.g0 {
    public t1.o A;
    public t1.o B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f9372a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2.n f9375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h2.k f9376e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t1.o f9377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h2.h f9378h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9388s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9392w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9395z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2.f f9373b = new k2.f();
    public int i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f9379j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f9380k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f9383n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f9382m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f9381l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w2.f0[] f9384o = new w2.f0[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b3.a f9374c = new b3.a(new ma.p(6));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9389t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9390u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9391v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9394y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9393x = true;
    public boolean D = true;

    public b1(s2.e eVar, h2.n nVar, h2.k kVar) {
        this.f9375d = nVar;
        this.f9376e = kVar;
        this.f9372a = new y0(eVar);
    }

    public final void A(t1.o oVar, sc.b bVar) {
        t1.o oVar2;
        t1.o oVar3 = this.f9377g;
        boolean z2 = oVar3 == null;
        t1.k kVar = oVar3 == null ? null : oVar3.f12065r;
        this.f9377g = oVar;
        t1.k kVar2 = oVar.f12065r;
        h2.n nVar = this.f9375d;
        if (nVar != null) {
            int iC = nVar.c(oVar);
            t1.n nVarA = oVar.a();
            nVarA.N = iC;
            oVar2 = new t1.o(nVarA);
        } else {
            oVar2 = oVar;
        }
        bVar.f11787x = oVar2;
        bVar.f11786w = this.f9378h;
        if (nVar == null) {
            return;
        }
        if (z2 || !Objects.equals(kVar, kVar2)) {
            h2.h hVar = this.f9378h;
            h2.k kVar3 = this.f9376e;
            h2.h hVarE = nVar.e(kVar3, oVar);
            this.f9378h = hVarE;
            bVar.f11786w = hVarE;
            if (hVar != null) {
                hVar.d(kVar3);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f9388s != this.f9385p ? this.f9379j[u(this.f9388s)] : this.C;
    }

    public final int C(sc.b bVar, DecoderInputBuffer decoderInputBuffer, int i, boolean z2) {
        int i10;
        boolean z10 = (i & 2) != 0;
        k2.f fVar = this.f9373b;
        synchronized (this) {
            try {
                decoderInputBuffer.waitingForKeys = false;
                i10 = -3;
                if (this.f9388s != this.f9385p) {
                    t1.o oVar = ((z0) this.f9374c.g(t())).f9596a;
                    if (!z10 && oVar == this.f9377g) {
                        int iU = u(this.f9388s);
                        if (y(iU)) {
                            decoderInputBuffer.setFlags(this.f9382m[iU]);
                            if (this.f9388s == this.f9385p - 1 && (z2 || this.f9392w)) {
                                decoderInputBuffer.addFlag(536870912);
                            }
                            decoderInputBuffer.timeUs = this.f9383n[iU];
                            fVar.f7285a = this.f9381l[iU];
                            fVar.f7286b = this.f9380k[iU];
                            fVar.f7287c = this.f9384o[iU];
                            i10 = -4;
                        } else {
                            decoderInputBuffer.waitingForKeys = true;
                        }
                    }
                    A(oVar, bVar);
                    i10 = -5;
                } else {
                    if (!z2 && !this.f9392w) {
                        t1.o oVar2 = this.B;
                        if (oVar2 == null || (!z10 && oVar2 == this.f9377g)) {
                        }
                        A(oVar2, bVar);
                        i10 = -5;
                    }
                    decoderInputBuffer.setFlags(4);
                    decoderInputBuffer.timeUs = Long.MIN_VALUE;
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z11 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z11) {
                    y0 y0Var = this.f9372a;
                    y0.f(y0Var.f9588e, decoderInputBuffer, this.f9373b, y0Var.f9586c);
                } else {
                    y0 y0Var2 = this.f9372a;
                    y0Var2.f9588e = y0.f(y0Var2.f9588e, decoderInputBuffer, this.f9373b, y0Var2.f9586c);
                }
            }
            if (!z11) {
                this.f9388s++;
            }
        }
        return i10;
    }

    public final void D(boolean z2) {
        y0 y0Var = this.f9372a;
        y0Var.a(y0Var.f9587d);
        w3 w3Var = y0Var.f9587d;
        int i = y0Var.f9585b;
        w1.a.j(((s2.a) w3Var.f7822x) == null);
        w3Var.f7820v = 0L;
        w3Var.f7821w = i;
        w3 w3Var2 = y0Var.f9587d;
        y0Var.f9588e = w3Var2;
        y0Var.f = w3Var2;
        y0Var.f9589g = 0L;
        y0Var.f9584a.c();
        this.f9385p = 0;
        this.f9386q = 0;
        this.f9387r = 0;
        this.f9388s = 0;
        this.f9393x = true;
        this.f9389t = Long.MIN_VALUE;
        this.f9390u = Long.MIN_VALUE;
        this.f9391v = Long.MIN_VALUE;
        this.f9392w = false;
        b3.a aVar = this.f9374c;
        SparseArray sparseArray = (SparseArray) aVar.f1529x;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((ma.p) aVar.f1530y).accept(sparseArray.valueAt(i10));
        }
        aVar.f1528w = -1;
        sparseArray.clear();
        if (z2) {
            this.A = null;
            this.B = null;
            this.f9394y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.f9388s = 0;
        y0 y0Var = this.f9372a;
        y0Var.f9588e = y0Var.f9587d;
    }

    public final synchronized boolean F(int i) {
        E();
        int i10 = this.f9386q;
        if (i >= i10 && i <= this.f9385p + i10) {
            this.f9389t = Long.MIN_VALUE;
            this.f9388s = i - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(boolean z2, long j8) throws Throwable {
        Throwable th;
        b1 b1Var;
        long j9;
        int iO;
        try {
            try {
                E();
                int iU = u(this.f9388s);
                int i = this.f9388s;
                int i10 = this.f9385p;
                if (!(i != i10) || j8 < this.f9383n[iU] || (j8 > this.f9391v && !z2)) {
                    return false;
                }
                if (this.D) {
                    int i11 = i10 - i;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            try {
                                if (this.f9383n[iU] >= j8) {
                                    i11 = i12;
                                    break;
                                }
                                iU++;
                                if (iU == this.i) {
                                    iU = 0;
                                }
                                i12++;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else if (!z2) {
                            i11 = -1;
                        }
                    }
                    j9 = j8;
                    iO = i11;
                    b1Var = this;
                } else {
                    int i13 = i10 - i;
                    b1Var = this;
                    j9 = j8;
                    iO = b1Var.o(iU, i13, j9, true);
                }
                if (iO == -1) {
                    return false;
                }
                b1Var.f9389t = j9;
                b1Var.f9388s += iO;
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void H(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f9388s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f9385p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            w1.a.d(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f9388s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f9388s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b1.H(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // w2.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r13, int r15, int r16, int r17, w2.f0 r18) {
        /*
            r12 = this;
            boolean r0 = r12.f9395z
            if (r0 == 0) goto Lc
            t1.o r0 = r12.A
            w1.a.k(r0)
            r12.c(r0)
        Lc:
            r0 = r15 & 1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r4 = r3
            goto L15
        L14:
            r4 = r2
        L15:
            boolean r5 = r12.f9393x
            if (r5 == 0) goto L1f
            if (r4 != 0) goto L1d
            goto L83
        L1d:
            r12.f9393x = r2
        L1f:
            long r5 = r12.F
            long r5 = r5 + r13
            boolean r7 = r12.D
            if (r7 == 0) goto L4d
            long r7 = r12.f9389t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2d
            goto L83
        L2d:
            if (r0 != 0) goto L4d
            boolean r0 = r12.E
            if (r0 != 0) goto L4a
            java.lang.String r0 = "SampleQueue"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            r7.<init>(r8)
            t1.o r8 = r12.B
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            w1.a.C(r0, r7)
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
            int r4 = r12.f9385p     // Catch: java.lang.Throwable -> L63
            if (r4 != 0) goto L65
            long r7 = r12.f9390u     // Catch: java.lang.Throwable -> L63
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L60
            goto L61
        L60:
            r3 = r2
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
            r3 = r2
            goto L7b
        L70:
            int r4 = r12.h(r5)     // Catch: java.lang.Throwable -> L63
            int r7 = r12.f9386q     // Catch: java.lang.Throwable -> L63
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
            o2.y0 r2 = r12.f9372a
            long r2 = r2.f9589g
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
        throw new UnsupportedOperationException("Method not decompiled: o2.b1.a(long, int, int, int, w2.f0):void");
    }

    @Override // w2.g0
    public final int b(t1.g gVar, int i, boolean z2) throws EOFException {
        y0 y0Var = this.f9372a;
        int iC = y0Var.c(i);
        w3 w3Var = y0Var.f;
        s2.a aVar = (s2.a) w3Var.f7822x;
        int i10 = gVar.read(aVar.f11421a, ((int) (y0Var.f9589g - w3Var.f7820v)) + aVar.f11422b, iC);
        if (i10 == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        long j8 = y0Var.f9589g + ((long) i10);
        y0Var.f9589g = j8;
        w3 w3Var2 = y0Var.f;
        if (j8 == w3Var2.f7821w) {
            y0Var.f = (w3) w3Var2.f7823y;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, o2.a1] */
    @Override // w2.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(t1.o r5) {
        /*
            r4 = this;
            t1.o r0 = r4.p(r5)
            r1 = 0
            r4.f9395z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.f9394y = r1     // Catch: java.lang.Throwable -> L57
            t1.o r5 = r4.B     // Catch: java.lang.Throwable -> L57
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L6e
        L16:
            b3.a r5 = r4.f9374c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f1529x     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L57
            r2 = 1
            if (r5 != 0) goto L25
            r5 = r2
            goto L26
        L25:
            r5 = r1
        L26:
            if (r5 != 0) goto L59
            b3.a r5 = r4.f9374c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f1529x     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L57
            o2.z0 r5 = (o2.z0) r5     // Catch: java.lang.Throwable -> L57
            t1.o r5 = r5.f9596a     // Catch: java.lang.Throwable -> L57
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L59
            b3.a r5 = r4.f9374c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f1529x     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L57
            o2.z0 r5 = (o2.z0) r5     // Catch: java.lang.Throwable -> L57
            t1.o r5 = r5.f9596a     // Catch: java.lang.Throwable -> L57
            r4.B = r5     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r5 = move-exception
            goto L78
        L59:
            r4.B = r0     // Catch: java.lang.Throwable -> L57
        L5b:
            boolean r5 = r4.D     // Catch: java.lang.Throwable -> L57
            t1.o r0 = r4.B     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r0.f12061n     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.f12058k     // Catch: java.lang.Throwable -> L57
            boolean r0 = t1.f0.a(r3, r0)     // Catch: java.lang.Throwable -> L57
            r5 = r5 & r0
            r4.D = r5     // Catch: java.lang.Throwable -> L57
            r4.E = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            r1 = r2
        L6e:
            java.lang.Object r5 = r4.f
            if (r5 == 0) goto L77
            if (r1 == 0) goto L77
            r5.a()
        L77:
            return
        L78:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b1.c(t1.o):void");
    }

    @Override // w2.g0
    public final /* synthetic */ void d(int i, w1.t tVar) {
        u5.a.a(this, tVar, i);
    }

    @Override // w2.g0
    public final int e(t1.g gVar, int i, boolean z2) {
        return b(gVar, i, z2);
    }

    @Override // w2.g0
    public final void f(w1.t tVar, int i, int i10) {
        while (true) {
            y0 y0Var = this.f9372a;
            if (i <= 0) {
                y0Var.getClass();
                return;
            }
            int iC = y0Var.c(i);
            w3 w3Var = y0Var.f;
            s2.a aVar = (s2.a) w3Var.f7822x;
            tVar.h(aVar.f11421a, ((int) (y0Var.f9589g - w3Var.f7820v)) + aVar.f11422b, iC);
            i -= iC;
            long j8 = y0Var.f9589g + ((long) iC);
            y0Var.f9589g = j8;
            w3 w3Var2 = y0Var.f;
            if (j8 == w3Var2.f7821w) {
                y0Var.f = (w3) w3Var2.f7823y;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, w2.f0 r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b1.g(long, int, long, int, w2.f0):void");
    }

    public final int h(long j8) {
        int i = this.f9385p;
        int iU = u(i - 1);
        while (i > this.f9388s && this.f9383n[iU] >= j8) {
            i--;
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.f9390u = Math.max(this.f9390u, s(i));
        this.f9385p -= i;
        int i10 = this.f9386q + i;
        this.f9386q = i10;
        int i11 = this.f9387r + i;
        this.f9387r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.f9387r = i11 - i12;
        }
        int i13 = this.f9388s - i;
        this.f9388s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f9388s = 0;
        }
        b3.a aVar = this.f9374c;
        SparseArray sparseArray = (SparseArray) aVar.f1529x;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((ma.p) aVar.f1530y).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = aVar.f1528w;
            if (i16 > 0) {
                aVar.f1528w = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f9385p != 0) {
            return this.f9380k[this.f9387r];
        }
        int i17 = this.f9387r;
        if (i17 == 0) {
            i17 = this.i;
        }
        int i18 = i17 - 1;
        return this.f9380k[i18] + ((long) this.f9381l[i18]);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r12, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            r11 = this;
            o2.y0 r0 = r11.f9372a
            monitor-enter(r11)
            int r1 = r11.f9385p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f9383n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f9387r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.f9388s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r8 = r12
            r10 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.o(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.i(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.b(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b1.j(long, boolean, boolean):void");
    }

    public final void k() {
        long jI;
        y0 y0Var = this.f9372a;
        synchronized (this) {
            int i = this.f9385p;
            jI = i == 0 ? -1L : i(i);
        }
        y0Var.b(jI);
    }

    public final void l(long j8) {
        if (this.f9385p == 0) {
            return;
        }
        w1.a.d(j8 > r());
        n(this.f9386q + h(j8));
    }

    public final long m(int i) {
        int i10 = this.f9386q;
        int i11 = this.f9385p;
        int i12 = (i10 + i11) - i;
        boolean z2 = false;
        w1.a.d(i12 >= 0 && i12 <= i11 - this.f9388s);
        int i13 = this.f9385p - i12;
        this.f9385p = i13;
        this.f9391v = Math.max(this.f9390u, s(i13));
        if (i12 == 0 && this.f9392w) {
            z2 = true;
        }
        this.f9392w = z2;
        b3.a aVar = this.f9374c;
        SparseArray sparseArray = (SparseArray) aVar.f1529x;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((ma.p) aVar.f1530y).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        aVar.f1528w = sparseArray.size() > 0 ? Math.min(aVar.f1528w, sparseArray.size() - 1) : -1;
        int i14 = this.f9385p;
        if (i14 == 0) {
            return 0L;
        }
        int iU = u(i14 - 1);
        return this.f9380k[iU] + ((long) this.f9381l[iU]);
    }

    public final void n(int i) {
        long jM = m(i);
        y0 y0Var = this.f9372a;
        int i10 = y0Var.f9585b;
        w1.a.d(jM <= y0Var.f9589g);
        y0Var.f9589g = jM;
        if (jM != 0) {
            w3 w3Var = y0Var.f9587d;
            if (jM != w3Var.f7820v) {
                while (y0Var.f9589g > w3Var.f7821w) {
                    w3Var = (w3) w3Var.f7823y;
                }
                w3 w3Var2 = (w3) w3Var.f7823y;
                w3Var2.getClass();
                y0Var.a(w3Var2);
                w3 w3Var3 = new w3(i10, w3Var.f7821w);
                w3Var.f7823y = w3Var3;
                if (y0Var.f9589g == w3Var.f7821w) {
                    w3Var = w3Var3;
                }
                y0Var.f = w3Var;
                if (y0Var.f9588e == w3Var2) {
                    y0Var.f9588e = w3Var3;
                    return;
                }
                return;
            }
        }
        y0Var.a(y0Var.f9587d);
        w3 w3Var4 = new w3(i10, y0Var.f9589g);
        y0Var.f9587d = w3Var4;
        y0Var.f9588e = w3Var4;
        y0Var.f = w3Var4;
    }

    public final int o(int i, int i10, long j8, boolean z2) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j9 = this.f9383n[i];
            if (j9 > j8) {
                break;
            }
            if (!z2 || (this.f9382m[i] & 1) != 0) {
                if (j9 == j8) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i11;
    }

    public t1.o p(t1.o oVar) {
        if (this.F == 0 || oVar.f12066s == Long.MAX_VALUE) {
            return oVar;
        }
        t1.n nVarA = oVar.a();
        nVarA.f12041r = oVar.f12066s + this.F;
        return new t1.o(nVarA);
    }

    public final synchronized long q() {
        return this.f9391v;
    }

    public final synchronized long r() {
        return Math.max(this.f9390u, s(this.f9388s));
    }

    public final long s(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iU = u(i - 1);
        for (int i10 = 0; i10 < i; i10++) {
            jMax = Math.max(jMax, this.f9383n[iU]);
            if ((this.f9382m[iU] & 1) != 0) {
                return jMax;
            }
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return jMax;
    }

    public final int t() {
        return this.f9386q + this.f9388s;
    }

    public final int u(int i) {
        int i10 = this.f9387r + i;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int v(boolean z2, long j8) throws Throwable {
        try {
            try {
                int iU = u(this.f9388s);
                int i = this.f9388s;
                int i10 = this.f9385p;
                if (!(i != i10) || j8 < this.f9383n[iU]) {
                    return 0;
                }
                if (j8 > this.f9391v && z2) {
                    return i10 - i;
                }
                int iO = o(iU, i10 - i, j8, true);
                if (iO == -1) {
                    return 0;
                }
                return iO;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized t1.o w() {
        return this.f9394y ? null : this.B;
    }

    public final synchronized boolean x(boolean z2) {
        t1.o oVar;
        boolean z10 = false;
        if (this.f9388s != this.f9385p) {
            if (((z0) this.f9374c.g(t())).f9596a != this.f9377g) {
                return true;
            }
            return y(u(this.f9388s));
        }
        if (z2 || this.f9392w || ((oVar = this.B) != null && oVar != this.f9377g)) {
            z10 = true;
        }
        return z10;
    }

    public final boolean y(int i) {
        h2.h hVar = this.f9378h;
        if (hVar == null || hVar.getState() == 4) {
            return true;
        }
        return (this.f9382m[i] & 1073741824) == 0 && this.f9378h.b();
    }

    public final void z() throws h2.g {
        h2.h hVar = this.f9378h;
        if (hVar == null || hVar.getState() != 1) {
            return;
        }
        h2.g gVarF = this.f9378h.f();
        gVarF.getClass();
        throw gVarF;
    }
}
