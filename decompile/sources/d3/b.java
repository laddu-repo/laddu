package d3;

import a2.e0;
import b2.k;
import db.c1;
import db.i0;
import db.k0;
import java.util.Arrays;
import java.util.List;
import mc.i;
import r1.j0;
import r1.l0;
import u1.a0;
import u1.t;
import y1.c;
import y2.e;
import y2.f;
import y2.f0;
import y2.j;
import y2.l;
import y2.o;
import y2.p;
import y2.q;
import y2.s;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: e, reason: collision with root package name */
    public q f3771e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f3772f;

    /* renamed from: h, reason: collision with root package name */
    public j0 f3774h;

    /* renamed from: i, reason: collision with root package name */
    public s f3775i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3776k;

    /* renamed from: l, reason: collision with root package name */
    public a f3777l;

    /* renamed from: m, reason: collision with root package name */
    public int f3778m;

    /* renamed from: n, reason: collision with root package name */
    public long f3779n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3767a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final t f3768b = new t(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3769c = false;

    /* renamed from: d, reason: collision with root package name */
    public final i f3770d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public int f3773g = 0;

    @Override // y2.o
    public final void c(long j, long j10) {
        long j11 = 0;
        if (j == 0) {
            this.f3773g = 0;
        } else {
            a aVar = this.f3777l;
            if (aVar != null) {
                aVar.A(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f3779n = j11;
        this.f3778m = 0;
        this.f3768b.H(0);
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        y2.a.w(pVar, false);
        t tVar = new t(4);
        ((l) pVar).k(tVar.f12811a, 0, 4, false);
        if (tVar.A() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Type inference failed for: r16v3, types: [y2.j, d3.a] */
    @Override // y2.o
    public final int i(p pVar, i iVar) {
        s sVar;
        int i6;
        z bVar;
        k kVar;
        long j;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        int i10 = this.f3773g;
        boolean z12 = true;
        if (i10 != 0) {
            byte[] bArr = this.f3767a;
            if (i10 != 1) {
                int i11 = 4;
                int i12 = 3;
                if (i10 != 2) {
                    int i13 = 7;
                    int i14 = 6;
                    if (i10 != 3) {
                        int i15 = 16;
                        long j12 = 0;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f3772f.getClass();
                                this.f3775i.getClass();
                                a aVar = this.f3777l;
                                if (aVar != null && ((f) aVar.f14916e) != null) {
                                    return aVar.t(pVar, iVar);
                                }
                                if (this.f3779n == -1) {
                                    s sVar2 = this.f3775i;
                                    pVar.v();
                                    pVar.o(1);
                                    byte[] bArr2 = new byte[1];
                                    pVar.C(bArr2, 0, 1);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    pVar.o(2);
                                    if (!z11) {
                                        i13 = 6;
                                    }
                                    t tVar = new t(i13);
                                    byte[] bArr3 = tVar.f12811a;
                                    int i16 = 0;
                                    while (i16 < i13) {
                                        int r10 = pVar.r(bArr3, i16, i13 - i16);
                                        if (r10 == -1) {
                                            break;
                                        }
                                        i16 += r10;
                                    }
                                    tVar.J(i16);
                                    pVar.v();
                                    try {
                                        long F = tVar.F();
                                        if (!z11) {
                                            F *= sVar2.f14932b;
                                        }
                                        j12 = F;
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f3779n = j12;
                                    } else {
                                        throw l0.a(null, null);
                                    }
                                } else {
                                    t tVar2 = this.f3768b;
                                    int i17 = tVar2.f12813c;
                                    if (i17 < 32768) {
                                        int read = pVar.read(tVar2.f12811a, i17, 32768 - i17);
                                        if (read != -1) {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            tVar2.J(i17 + read);
                                        } else if (tVar2.a() == 0) {
                                            long j13 = this.f3779n * 1000000;
                                            s sVar3 = this.f3775i;
                                            String str = a0.f12750a;
                                            this.f3772f.c(j13 / sVar3.f14935e, 1, this.f3778m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    int i18 = tVar2.f12812b;
                                    int i19 = this.f3778m;
                                    int i20 = this.j;
                                    if (i19 < i20) {
                                        tVar2.L(Math.min(i20 - i19, tVar2.a()));
                                    }
                                    this.f3775i.getClass();
                                    int i21 = tVar2.f12812b;
                                    while (true) {
                                        int i22 = tVar2.f12813c - 16;
                                        i iVar2 = this.f3770d;
                                        if (i21 <= i22) {
                                            tVar2.K(i21);
                                            if (y2.a.d(tVar2, this.f3775i, this.f3776k, iVar2)) {
                                                tVar2.K(i21);
                                                j11 = iVar2.f8812a;
                                                break;
                                            }
                                            i21++;
                                        } else {
                                            if (z12) {
                                                while (true) {
                                                    int i23 = tVar2.f12813c;
                                                    if (i21 <= i23 - this.j) {
                                                        tVar2.K(i21);
                                                        try {
                                                            z10 = y2.a.d(tVar2, this.f3775i, this.f3776k, iVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z10 = false;
                                                        }
                                                        if (tVar2.f12812b > tVar2.f12813c) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            tVar2.K(i21);
                                                            j11 = iVar2.f8812a;
                                                            break;
                                                        }
                                                        i21++;
                                                    } else {
                                                        tVar2.K(i23);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                tVar2.K(i21);
                                            }
                                            j11 = -1;
                                        }
                                    }
                                    int i24 = tVar2.f12812b - i18;
                                    tVar2.K(i18);
                                    this.f3772f.a(i24, tVar2);
                                    int i25 = this.f3778m + i24;
                                    this.f3778m = i25;
                                    if (j11 != -1) {
                                        long j14 = this.f3779n * 1000000;
                                        s sVar4 = this.f3775i;
                                        String str2 = a0.f12750a;
                                        this.f3772f.c(j14 / sVar4.f14935e, 1, i25, 0, null);
                                        this.f3778m = 0;
                                        this.f3779n = j11;
                                    }
                                    int length = tVar2.f12811a.length - tVar2.f12813c;
                                    if (tVar2.a() < 16 && length < 16) {
                                        int a10 = tVar2.a();
                                        byte[] bArr4 = tVar2.f12811a;
                                        System.arraycopy(bArr4, tVar2.f12812b, bArr4, 0, a10);
                                        tVar2.K(0);
                                        tVar2.J(a10);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        pVar.v();
                        t tVar3 = new t(2);
                        pVar.C(tVar3.f12811a, 0, 2);
                        int E = tVar3.E();
                        if ((E >> 2) == 16382) {
                            pVar.v();
                            this.f3776k = E;
                            q qVar = this.f3771e;
                            String str3 = a0.f12750a;
                            long position = pVar.getPosition();
                            long length2 = pVar.getLength();
                            this.f3775i.getClass();
                            s sVar5 = this.f3775i;
                            c cVar = sVar5.f14940k;
                            if (cVar != null && ((long[]) cVar.f14799a).length > 0) {
                                bVar = new a3.b(sVar5, position, 1);
                                i6 = 0;
                            } else if (length2 != -1 && sVar5.j > 0) {
                                int i26 = this.f3776k;
                                int i27 = sVar5.f14933c;
                                e0 e0Var = new e0(sVar5, i15);
                                k kVar2 = new k(sVar5, i26);
                                long b10 = sVar5.b();
                                long j15 = sVar5.j;
                                int i28 = sVar5.f14934d;
                                if (i28 > 0) {
                                    kVar = kVar2;
                                    i6 = 0;
                                    j10 = ((i28 + i27) / 2) + 1;
                                } else {
                                    kVar = kVar2;
                                    i6 = 0;
                                    int i29 = sVar5.f14931a;
                                    if (i29 == sVar5.f14932b && i29 > 0) {
                                        j = i29;
                                    } else {
                                        j = 4096;
                                    }
                                    j10 = 64 + (((j * sVar5.f14937g) * sVar5.f14938h) / 8);
                                }
                                ?? jVar = new j(e0Var, kVar, b10, j15, position, length2, j10, Math.max(6, i27));
                                this.f3777l = jVar;
                                bVar = (e) jVar.f14914c;
                            } else {
                                i6 = 0;
                                bVar = new a3.b(sVar5.b());
                            }
                            qVar.n(bVar);
                            this.f3773g = 5;
                            return i6;
                        }
                        pVar.v();
                        throw l0.a(null, "First frame does not start with sync code.");
                    }
                    s sVar6 = this.f3775i;
                    boolean z13 = false;
                    while (!z13) {
                        pVar.v();
                        byte[] bArr5 = new byte[i11];
                        u1.s sVar7 = new u1.s(i11, bArr5);
                        pVar.C(bArr5, 0, i11);
                        boolean h4 = sVar7.h();
                        int i30 = sVar7.i(i13);
                        int i31 = sVar7.i(24) + i11;
                        if (i30 == 0) {
                            byte[] bArr6 = new byte[38];
                            pVar.readFully(bArr6, 0, 38);
                            sVar6 = new s(i11, bArr6);
                        } else if (sVar6 != null) {
                            j0 j0Var = sVar6.f14941l;
                            if (i30 == i12) {
                                t tVar4 = new t(i31);
                                pVar.readFully(tVar4.f12811a, 0, i31);
                                sVar6 = new s(sVar6.f14931a, sVar6.f14932b, sVar6.f14933c, sVar6.f14934d, sVar6.f14935e, sVar6.f14937g, sVar6.f14938h, sVar6.j, y2.a.y(tVar4), sVar6.f14941l);
                            } else {
                                if (i30 == i11) {
                                    t tVar5 = new t(i31);
                                    pVar.readFully(tVar5.f12811a, 0, i31);
                                    tVar5.L(i11);
                                    j0 v10 = y2.a.v(Arrays.asList((String[]) y2.a.z(tVar5, false, false).f13479x));
                                    if (j0Var != null) {
                                        v10 = j0Var.b(v10);
                                    }
                                    sVar = new s(sVar6.f14931a, sVar6.f14932b, sVar6.f14933c, sVar6.f14934d, sVar6.f14935e, sVar6.f14937g, sVar6.f14938h, sVar6.j, sVar6.f14940k, v10);
                                } else if (i30 == i14) {
                                    t tVar6 = new t(i31);
                                    pVar.readFully(tVar6.f12811a, 0, i31);
                                    tVar6.L(4);
                                    j0 j0Var2 = new j0(k0.o(k3.a.d(tVar6)));
                                    if (j0Var != null) {
                                        j0Var2 = j0Var.b(j0Var2);
                                    }
                                    sVar = new s(sVar6.f14931a, sVar6.f14932b, sVar6.f14933c, sVar6.f14934d, sVar6.f14935e, sVar6.f14937g, sVar6.f14938h, sVar6.j, sVar6.f14940k, j0Var2);
                                } else {
                                    pVar.w(i31);
                                }
                                sVar6 = sVar;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        String str4 = a0.f12750a;
                        this.f3775i = sVar6;
                        z13 = h4;
                        i11 = 4;
                        i12 = 3;
                        i13 = 7;
                        i14 = 6;
                    }
                    this.f3775i.getClass();
                    this.j = Math.max(this.f3775i.f14933c, 6);
                    r1.q c10 = this.f3775i.c(bArr, this.f3774h);
                    f0 f0Var = this.f3772f;
                    r1.p a11 = c10.a();
                    a11.f11610l = r1.k0.p("audio/flac");
                    r4.a.v(a11, f0Var);
                    f0 f0Var2 = this.f3772f;
                    this.f3775i.b();
                    f0Var2.getClass();
                    this.f3773g = 4;
                    return 0;
                }
                t tVar7 = new t(4);
                pVar.readFully(tVar7.f12811a, 0, 4);
                if (tVar7.A() == 1716281667) {
                    this.f3773g = 3;
                    return 0;
                }
                throw l0.a(null, "Failed to read FLAC stream marker.");
            }
            pVar.C(bArr, 0, bArr.length);
            pVar.v();
            this.f3773g = 2;
            return 0;
        }
        boolean z14 = !this.f3769c;
        pVar.v();
        long l10 = pVar.l();
        j0 w10 = y2.a.w(pVar, z14);
        pVar.w((int) (pVar.l() - l10));
        this.f3774h = w10;
        this.f3773g = 1;
        return 0;
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f3771e = qVar;
        this.f3772f = qVar.A(0, 1);
        qVar.t();
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
