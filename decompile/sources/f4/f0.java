package f4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import db.c1;
import db.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 implements y2.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f4768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4769b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4770c;

    /* renamed from: d, reason: collision with root package name */
    public final u1.t f4771d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f4772e;

    /* renamed from: f, reason: collision with root package name */
    public final f f4773f;

    /* renamed from: g, reason: collision with root package name */
    public final v3.k f4774g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f4775h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f4776i;
    public final SparseBooleanArray j;

    /* renamed from: k, reason: collision with root package name */
    public final y f4777k;

    /* renamed from: l, reason: collision with root package name */
    public d3.a f4778l;

    /* renamed from: m, reason: collision with root package name */
    public y2.q f4779m;

    /* renamed from: n, reason: collision with root package name */
    public int f4780n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4781o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4782p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4783q;

    /* renamed from: r, reason: collision with root package name */
    public i0 f4784r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f4785t;

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, f4.b0, j4.b0] */
    public f0(int i6, int i10, v3.k kVar, u1.y yVar, f fVar) {
        this.f4773f = fVar;
        this.f4768a = i6;
        this.f4769b = i10;
        this.f4774g = kVar;
        if (i6 != 1 && i6 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f4770c = arrayList;
            arrayList.add(yVar);
        } else {
            this.f4770c = Collections.singletonList(yVar);
        }
        this.f4771d = new u1.t(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4776i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f4775h = sparseArray;
        this.f4772e = new SparseIntArray();
        this.f4777k = new y(1);
        this.f4779m = y2.q.f14930w;
        this.f4785t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (i0) sparseArray2.valueAt(i11));
        }
        ?? obj = new Object();
        obj.f7159y = this;
        obj.f7158x = new u1.s(4, new byte[4]);
        sparseArray.put(0, new c0(obj));
        this.f4784r = null;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        boolean z10;
        d3.a aVar;
        boolean z11;
        if (this.f4768a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        List list = this.f4770c;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            u1.y yVar = (u1.y) list.get(i6);
            if (yVar.e() == -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long d10 = yVar.d();
                if (d10 != -9223372036854775807L && d10 != 0 && d10 != j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                yVar.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.f4778l) != null) {
            aVar.A(j10);
        }
        this.f4771d.H(0);
        this.f4772e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f4775h;
            if (i10 < sparseArray.size()) {
                ((i0) sparseArray.valueAt(i10)).c();
                i10++;
            } else {
                this.s = 0;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(y2.p r7) {
        /*
            r6 = this;
            u1.t r0 = r6.f4771d
            byte[] r0 = r0.f12811a
            y2.l r7 = (y2.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.k(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
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
            r7.j(r2, r1)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f0.f(y2.p):boolean");
    }

    @Override // y2.o
    public final List h() {
        db.i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v18, types: [y2.j, d3.a] */
    /* JADX WARN: Type inference failed for: r4v15, types: [y2.g, java.lang.Object] */
    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        boolean z10;
        y2.p pVar2;
        int i6;
        ?? r12;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        int i14;
        long length = pVar.getLength();
        int i15 = this.f4768a;
        if (i15 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4781o) {
            long j = -9223372036854775807L;
            y yVar = this.f4777k;
            if (length != -1 && !z10 && !yVar.f5003d) {
                int i16 = this.f4785t;
                u1.y yVar2 = yVar.f5001b;
                u1.t tVar = yVar.f5002c;
                if (i16 <= 0) {
                    yVar.a(pVar);
                    return 0;
                }
                if (!yVar.f5005f) {
                    long length2 = pVar.getLength();
                    int min = (int) Math.min(112800, length2);
                    long j10 = length2 - min;
                    if (pVar.getPosition() != j10) {
                        iVar.f8812a = j10;
                        return 1;
                    }
                    tVar.H(min);
                    pVar.v();
                    pVar.C(tVar.f12811a, 0, min);
                    int i17 = tVar.f12812b;
                    int i18 = tVar.f12813c;
                    int i19 = i18 - 188;
                    while (true) {
                        if (i19 < i17) {
                            break;
                        }
                        byte[] bArr = tVar.f12811a;
                        int i20 = -4;
                        int i21 = 0;
                        while (true) {
                            if (i20 > 4) {
                                break;
                            }
                            int i22 = (i20 * 188) + i19;
                            if (i22 >= i17 && i22 < i18 && bArr[i22] == 71) {
                                i21++;
                                if (i21 == 5) {
                                    long h4 = e9.f.h(tVar, i19, i16);
                                    if (h4 != -9223372036854775807L) {
                                        j = h4;
                                        break;
                                    }
                                }
                            } else {
                                i21 = 0;
                            }
                            i20++;
                        }
                        i19--;
                    }
                    yVar.f5007h = j;
                    yVar.f5005f = true;
                    return 0;
                }
                if (yVar.f5007h == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                }
                if (!yVar.f5004e) {
                    int min2 = (int) Math.min(112800, pVar.getLength());
                    long j11 = 0;
                    if (pVar.getPosition() != j11) {
                        iVar.f8812a = j11;
                        return 1;
                    }
                    tVar.H(min2);
                    pVar.v();
                    pVar.C(tVar.f12811a, 0, min2);
                    int i23 = tVar.f12812b;
                    int i24 = tVar.f12813c;
                    while (true) {
                        if (i23 >= i24) {
                            break;
                        }
                        if (tVar.f12811a[i23] == 71) {
                            long h10 = e9.f.h(tVar, i23, i16);
                            if (h10 != -9223372036854775807L) {
                                j = h10;
                                break;
                            }
                        }
                        i23++;
                    }
                    yVar.f5006g = j;
                    yVar.f5004e = true;
                    return 0;
                }
                long j12 = yVar.f5006g;
                if (j12 == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                }
                yVar.f5008i = yVar2.c(yVar.f5007h) - yVar2.b(j12);
                yVar.a(pVar);
                return 0;
            }
            if (!this.f4782p) {
                this.f4782p = true;
                long j13 = yVar.f5008i;
                if (j13 != -9223372036854775807L) {
                    i6 = i15;
                    z13 = false;
                    i14 = 1;
                    ?? jVar = new y2.j(new Object(), new b2.k(this.f4785t, yVar.f5001b), j13, j13 + 1, 0L, length, 188L, 940);
                    this.f4778l = jVar;
                    this.f4779m.n((y2.e) jVar.f14914c);
                } else {
                    i6 = i15;
                    z13 = false;
                    i14 = 1;
                    this.f4779m.n(new a3.b(j13));
                }
            } else {
                i6 = i15;
                z13 = false;
                i14 = 1;
            }
            if (this.f4783q) {
                this.f4783q = z13;
                c(0L, 0L);
                if (pVar.getPosition() != 0) {
                    iVar.f8812a = 0L;
                    return i14;
                }
            }
            d3.a aVar = this.f4778l;
            if (aVar != null && ((y2.f) aVar.f14916e) != null) {
                return aVar.t(pVar, iVar);
            }
            pVar2 = pVar;
            r12 = z13;
        } else {
            pVar2 = pVar;
            i6 = i15;
            r12 = 0;
        }
        u1.t tVar2 = this.f4771d;
        byte[] bArr2 = tVar2.f12811a;
        if (9400 - tVar2.f12812b < 188) {
            int a10 = tVar2.a();
            if (a10 > 0) {
                System.arraycopy(bArr2, tVar2.f12812b, bArr2, r12, a10);
            }
            tVar2.I(a10, bArr2);
        }
        while (true) {
            int a11 = tVar2.a();
            SparseArray sparseArray = this.f4775h;
            if (a11 < 188) {
                int i25 = tVar2.f12813c;
                int read = pVar2.read(bArr2, i25, 9400 - i25);
                if (read == -1) {
                    for (int i26 = 0; i26 < sparseArray.size(); i26++) {
                        i0 i0Var = (i0) sparseArray.valueAt(i26);
                        if (i0Var instanceof x) {
                            x xVar = (x) i0Var;
                            if (z10 && !xVar.e()) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (xVar.f4991c == 3 && xVar.j == -1 && ((!z10 || !(xVar.f4989a instanceof k)) && z12)) {
                                xVar.a(1, new u1.t());
                            }
                        }
                    }
                    return -1;
                }
                tVar2.J(i25 + read);
            } else {
                int i27 = tVar2.f12812b;
                int i28 = tVar2.f12813c;
                byte[] bArr3 = tVar2.f12811a;
                int i29 = i27;
                while (i29 < i28 && bArr3[i29] != 71) {
                    i29++;
                }
                tVar2.K(i29);
                int i30 = i29 + 188;
                i0 i0Var2 = null;
                if (i30 > i28) {
                    int i31 = (i29 - i27) + this.s;
                    this.s = i31;
                    i10 = i6;
                    i11 = 2;
                    if (i10 == 2 && i31 > 376) {
                        throw l0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i10 = i6;
                    i11 = 2;
                    this.s = r12;
                }
                int i32 = tVar2.f12813c;
                if (i30 > i32) {
                    return r12;
                }
                int k8 = tVar2.k();
                if ((8388608 & k8) != 0) {
                    tVar2.K(i30);
                    return r12;
                }
                if ((4194304 & k8) != 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i33 = (2096896 & k8) >> 8;
                if ((k8 & 32) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((k8 & 16) != 0) {
                    i0Var2 = (i0) sparseArray.get(i33);
                }
                if (i0Var2 == null) {
                    tVar2.K(i30);
                    return r12;
                }
                if (i10 != i11) {
                    int i34 = k8 & 15;
                    SparseIntArray sparseIntArray = this.f4772e;
                    int i35 = sparseIntArray.get(i33, i34 - 1);
                    sparseIntArray.put(i33, i34);
                    if (i35 == i34) {
                        tVar2.K(i30);
                        return r12;
                    }
                    if (i34 != ((i35 + 1) & 15)) {
                        i0Var2.c();
                    }
                }
                if (z11) {
                    int y9 = tVar2.y();
                    if ((tVar2.y() & 64) != 0) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    i12 |= i13;
                    tVar2.L(y9 - 1);
                }
                boolean z14 = this.f4781o;
                if (i10 == i11 || z14 || !this.j.get(i33, r12)) {
                    tVar2.J(i30);
                    i0Var2.a(i12, tVar2);
                    tVar2.J(i32);
                }
                if (i10 != i11 && !z14 && this.f4781o && length != -1) {
                    this.f4783q = true;
                }
                tVar2.K(i30);
                return r12;
            }
        }
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        if ((this.f4769b & 1) == 0) {
            qVar = new a2.c(qVar, this.f4774g);
        }
        this.f4779m = qVar;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
