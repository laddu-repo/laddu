package d4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.k2;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements w2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1.t f4103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f4104e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t3.k f4105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f4106h;
    public final SparseBooleanArray i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f4107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f4108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b3.b f4109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w2.q f4110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h0 f4115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4117t;

    public e0(int i, int i10, t3.k kVar, w1.y yVar, f fVar) {
        this.f = fVar;
        this.f4100a = i;
        this.f4101b = i10;
        this.f4105g = kVar;
        if (i == 1 || i == 2) {
            this.f4102c = Collections.singletonList(yVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f4102c = arrayList;
            arrayList.add(yVar);
        }
        this.f4103d = new w1.t(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.f4107j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f4106h = sparseArray;
        this.f4104e = new SparseIntArray();
        this.f4108k = new y(1);
        this.f4110m = w2.q.f13846u;
        this.f4117t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (h0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new c0(new k2(this)));
        this.f4115r = null;
    }

    @Override // w2.o
    public final void c(w2.q qVar) {
        if ((this.f4101b & 1) == 0) {
            qVar = new c2.b(qVar, this.f4105g);
        }
        this.f4110m = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // w2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(w2.p r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            w1.t r0 = r6.f4103d
            byte[] r0 = r0.f13738a
            w2.l r7 = (w2.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.v(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.q(r2, r1)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e0.e(w2.p):boolean");
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        b3.b bVar;
        w1.a.j(this.f4100a != 2);
        List list = this.f4102c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w1.y yVar = (w1.y) list.get(i);
            boolean z2 = yVar.e() == -9223372036854775807L;
            if (!z2) {
                long jD = yVar.d();
                z2 = (jD == -9223372036854775807L || jD == 0 || jD == j9) ? false : true;
            }
            if (z2) {
                yVar.g(j9);
            }
        }
        if (j9 != 0 && (bVar = this.f4109l) != null) {
            bVar.d(j9);
        }
        this.f4103d.G(0);
        this.f4104e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f4106h;
            if (i10 >= sparseArray.size()) {
                this.f4116s = 0;
                return;
            } else {
                ((h0) sparseArray.valueAt(i10)).a();
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [d4.h0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // w2.o
    public final int g(w2.p pVar, t1.r rVar) throws t1.g0 {
        w2.p pVar2;
        ?? r12;
        int i;
        int i10;
        int i11;
        int i12;
        boolean z2;
        long length = pVar.getLength();
        int i13 = this.f4100a;
        boolean z10 = i13 == 2;
        if (this.f4112o) {
            long j8 = -9223372036854775807L;
            y yVar = this.f4108k;
            if (length != -1 && !z10 && !yVar.f4325d) {
                int i14 = this.f4117t;
                w1.y yVar2 = yVar.f4323b;
                w1.t tVar = yVar.f4324c;
                if (i14 <= 0) {
                    yVar.a(pVar);
                    return 0;
                }
                if (yVar.f) {
                    if (yVar.f4328h == -9223372036854775807L) {
                        yVar.a(pVar);
                        return 0;
                    }
                    if (yVar.f4326e) {
                        long j9 = yVar.f4327g;
                        if (j9 == -9223372036854775807L) {
                            yVar.a(pVar);
                            return 0;
                        }
                        yVar.i = yVar2.c(yVar.f4328h) - yVar2.b(j9);
                        yVar.a(pVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, pVar.getLength());
                    long j10 = 0;
                    if (pVar.getPosition() != j10) {
                        rVar.f12092a = j10;
                        return 1;
                    }
                    tVar.G(iMin);
                    pVar.l();
                    pVar.A(tVar.f13738a, 0, iMin);
                    int i15 = tVar.f13739b;
                    int i16 = tVar.f13740c;
                    while (true) {
                        if (i15 >= i16) {
                            break;
                        }
                        if (tVar.f13738a[i15] == 71) {
                            long J = com.bumptech.glide.f.J(tVar, i15, i14);
                            if (J != -9223372036854775807L) {
                                j8 = J;
                                break;
                            }
                        }
                        i15++;
                    }
                    yVar.f4327g = j8;
                    yVar.f4326e = true;
                    return 0;
                }
                long length2 = pVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j11 = length2 - ((long) iMin2);
                if (pVar.getPosition() != j11) {
                    rVar.f12092a = j11;
                    return 1;
                }
                tVar.G(iMin2);
                pVar.l();
                pVar.A(tVar.f13738a, 0, iMin2);
                int i17 = tVar.f13739b;
                int i18 = tVar.f13740c;
                int i19 = i18 - 188;
                while (true) {
                    if (i19 < i17) {
                        break;
                    }
                    byte[] bArr = tVar.f13738a;
                    int i20 = -4;
                    int i21 = 0;
                    while (true) {
                        if (i20 > 4) {
                            break;
                        }
                        int i22 = (i20 * 188) + i19;
                        if (i22 < i17 || i22 >= i18 || bArr[i22] != 71) {
                            i21 = 0;
                        } else {
                            i21++;
                            if (i21 == 5) {
                                long J2 = com.bumptech.glide.f.J(tVar, i19, i14);
                                if (J2 != -9223372036854775807L) {
                                    j8 = J2;
                                    break;
                                }
                            }
                        }
                        i20++;
                    }
                    i19--;
                }
                yVar.f4328h = j8;
                yVar.f = true;
                return 0;
            }
            if (this.f4113p) {
                i = 1;
                z2 = false;
                i10 = i13;
            } else {
                this.f4113p = true;
                long j12 = yVar.i;
                if (j12 != -9223372036854775807L) {
                    i = 1;
                    z2 = false;
                    i10 = i13;
                    b3.b bVar = new b3.b(new w2.f(), new b3.a(this.f4117t, yVar.f4323b), j12, 1 + j12, 0L, length, 188L, 940);
                    this.f4109l = bVar;
                    this.f4110m.k(bVar.f1531a);
                } else {
                    i = 1;
                    z2 = false;
                    i10 = i13;
                    this.f4110m.k(new w2.s(j12));
                }
            }
            if (this.f4114q) {
                this.f4114q = z2;
                f(0L, 0L);
                if (pVar.getPosition() != 0) {
                    rVar.f12092a = 0L;
                    return i;
                }
            }
            b3.b bVar2 = this.f4109l;
            if (bVar2 != null && bVar2.f1533c != null) {
                return bVar2.b(pVar, rVar);
            }
            pVar2 = pVar;
            r12 = z2;
        } else {
            pVar2 = pVar;
            r12 = 0;
            i = 1;
            i10 = i13;
        }
        w1.t tVar2 = this.f4103d;
        byte[] bArr2 = tVar2.f13738a;
        if (9400 - tVar2.f13739b < 188) {
            int iA = tVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, tVar2.f13739b, bArr2, r12, iA);
            }
            tVar2.H(iA, bArr2);
        }
        while (true) {
            int iA2 = tVar2.a();
            ?? r72 = this.f4106h;
            if (iA2 >= 188) {
                int i23 = tVar2.f13739b;
                int i24 = tVar2.f13740c;
                byte[] bArr3 = tVar2.f13738a;
                int i25 = i23;
                while (i25 < i24 && bArr3[i25] != 71) {
                    i25++;
                }
                tVar2.J(i25);
                int i26 = i25 + 188;
                if (i26 > i24) {
                    int i27 = (i25 - i23) + this.f4116s;
                    this.f4116s = i27;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i27 > 376) {
                        throw t1.g0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f4116s = r12;
                }
                int i28 = tVar2.f13740c;
                if (i26 > i28) {
                    return r12;
                }
                int iJ = tVar2.j();
                if ((8388608 & iJ) != 0) {
                    tVar2.J(i26);
                    return r12;
                }
                ?? r92 = (4194304 & iJ) != 0 ? 1 : r12;
                int i29 = (2096896 & iJ) >> 8;
                ?? r11 = (iJ & 32) != 0 ? 1 : r12;
                ?? r82 = (iJ & 16) != 0 ? (h0) r72.get(i29) : 0;
                if (r82 == 0) {
                    tVar2.J(i26);
                    return r12;
                }
                if (i11 != i12) {
                    int i30 = iJ & 15;
                    SparseIntArray sparseIntArray = this.f4104e;
                    int i31 = sparseIntArray.get(i29, i30 - 1);
                    sparseIntArray.put(i29, i30);
                    if (i31 == i30) {
                        tVar2.J(i26);
                        return r12;
                    }
                    if (i30 != ((i31 + 1) & 15)) {
                        r82.a();
                    }
                }
                if (r11 != 0) {
                    int iX = tVar2.x();
                    r92 = (r92 == true ? 1 : 0) | ((tVar2.x() & 64) != 0 ? i12 : r12);
                    tVar2.K(iX - 1);
                }
                boolean z11 = this.f4112o;
                if (i11 == i12 || z11 || !this.f4107j.get(i29, r12)) {
                    tVar2.I(i26);
                    r82.b(r92, tVar2);
                    tVar2.I(i28);
                }
                if (i11 != i12 && !z11 && this.f4112o && length != -1) {
                    this.f4114q = true;
                }
                tVar2.J(i26);
                return r12;
            }
            int i32 = tVar2.f13740c;
            int i33 = pVar2.read(bArr2, i32, 9400 - i32);
            if (i33 == -1) {
                for (?? r42 = r12; r42 < r72.size(); r42++) {
                    h0 h0Var = (h0) r72.valueAt(r42);
                    if (h0Var instanceof x) {
                        x xVar = (x) h0Var;
                        ?? r32 = (!z10 || xVar.e()) ? i : r12;
                        if (xVar.f4314c == 3 && xVar.f4319j == -1 && ((!z10 || !(xVar.f4312a instanceof k)) && r32 != 0)) {
                            xVar.b(i, new w1.t());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            tVar2.I(i32 + i33);
            i = 1;
        }
    }

    @Override // w2.o
    public final List h() {
        y9.c0 c0Var = y9.f0.f14553w;
        return z0.f14637z;
    }

    @Override // w2.o
    public final w2.o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
