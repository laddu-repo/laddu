package b3;

import androidx.fragment.app.d1;
import d0.d;
import java.util.Arrays;
import java.util.List;
import t1.e0;
import t1.n;
import t1.r;
import u3.f;
import w1.b0;
import w2.a0;
import w2.g0;
import w2.l;
import w2.o;
import w2.p;
import w2.q;
import w2.s;
import w2.t;
import y9.c0;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f1539e;
    public g0 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f1541h;
    public t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f1544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1546n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1535a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.t f1536b = new w1.t(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1537c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f1538d = new r();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1540g = 0;

    @Override // w2.o
    public final void c(q qVar) {
        this.f1539e = qVar;
        this.f = qVar.r(0, 1);
        qVar.e();
    }

    @Override // w2.o
    public final boolean e(p pVar) throws Throwable {
        w2.b.s(pVar, false);
        w1.t tVar = new w1.t(4);
        ((l) pVar).v(tVar.f13738a, 0, 4, false);
        return tVar.z() == 1716281667;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        if (j8 == 0) {
            this.f1540g = 0;
        } else {
            b bVar = this.f1544l;
            if (bVar != null) {
                bVar.d(j9);
            }
        }
        this.f1546n = j9 != 0 ? -1L : 0L;
        this.f1545m = 0;
        this.f1536b.G(0);
    }

    @Override // w2.o
    public final int g(p pVar, r rVar) throws Throwable {
        t tVar;
        int i;
        a0 sVar;
        long j8;
        long j9;
        boolean zB;
        int i10 = this.f1540g;
        if (i10 == 0) {
            boolean z2 = !this.f1537c;
            pVar.l();
            long jW = pVar.w();
            e0 e0VarS = w2.b.s(pVar, z2);
            pVar.p((int) (pVar.w() - jW));
            this.f1541h = e0VarS;
            this.f1540g = 1;
            return 0;
        }
        byte[] bArr = this.f1535a;
        if (i10 == 1) {
            pVar.A(bArr, 0, bArr.length);
            pVar.l();
            this.f1540g = 2;
            return 0;
        }
        int i11 = 4;
        int i12 = 3;
        if (i10 == 2) {
            w1.t tVar2 = new w1.t(4);
            pVar.readFully(tVar2.f13738a, 0, 4);
            if (tVar2.z() != 1716281667) {
                throw t1.g0.a(null, "Failed to read FLAC stream marker.");
            }
            this.f1540g = 3;
            return 0;
        }
        int i13 = 6;
        if (i10 == 3) {
            int i14 = 0;
            t tVar3 = this.i;
            boolean z10 = false;
            while (!z10) {
                pVar.l();
                byte[] bArr2 = new byte[i11];
                f fVar = new f(i11, bArr2);
                int i15 = i14;
                pVar.A(bArr2, i15, i11);
                boolean zH = fVar.h();
                int i16 = fVar.i(i);
                int i17 = fVar.i(24) + i11;
                if (i16 == 0) {
                    byte[] bArr3 = new byte[38];
                    pVar.readFully(bArr3, i15, 38);
                    tVar3 = new t(i11, bArr3);
                } else {
                    if (tVar3 == null) {
                        throw new IllegalArgumentException();
                    }
                    e0 e0Var = tVar3.f13859l;
                    if (i16 == i12) {
                        w1.t tVar4 = new w1.t(i17);
                        pVar.readFully(tVar4.f13738a, i15, i17);
                        tVar3 = new t(tVar3.f13850a, tVar3.f13851b, tVar3.f13852c, tVar3.f13853d, tVar3.f13854e, tVar3.f13855g, tVar3.f13856h, tVar3.f13857j, w2.b.u(tVar4), tVar3.f13859l);
                    } else {
                        if (i16 == i11) {
                            w1.t tVar5 = new w1.t(i17);
                            pVar.readFully(tVar5.f13738a, 0, i17);
                            tVar5.K(i11);
                            e0 e0VarR = w2.b.r(Arrays.asList((String[]) w2.b.v(tVar5, false, false).f7607v));
                            if (e0Var != null) {
                                e0VarR = e0Var.b(e0VarR);
                            }
                            tVar = new t(tVar3.f13850a, tVar3.f13851b, tVar3.f13852c, tVar3.f13853d, tVar3.f13854e, tVar3.f13855g, tVar3.f13856h, tVar3.f13857j, tVar3.f13858k, e0VarR);
                        } else if (i16 == i13) {
                            w1.t tVar6 = new w1.t(i17);
                            pVar.readFully(tVar6.f13738a, 0, i17);
                            tVar6.K(4);
                            e0 e0Var2 = new e0(f0.q(i3.a.d(tVar6)));
                            if (e0Var != null) {
                                e0Var2 = e0Var.b(e0Var2);
                            }
                            tVar = new t(tVar3.f13850a, tVar3.f13851b, tVar3.f13852c, tVar3.f13853d, tVar3.f13854e, tVar3.f13855g, tVar3.f13856h, tVar3.f13857j, tVar3.f13858k, e0Var2);
                        } else {
                            pVar.p(i17);
                        }
                        tVar3 = tVar;
                    }
                }
                int i18 = b0.f13686a;
                this.i = tVar3;
                z10 = zH;
                i11 = 4;
                i12 = 3;
                i = 7;
                i13 = 6;
                i14 = 0;
            }
            this.i.getClass();
            this.f1542j = Math.max(this.i.f13852c, 6);
            t1.o oVarC = this.i.c(bArr, this.f1541h);
            g0 g0Var = this.f;
            n nVarA = oVarC.a();
            nVarA.f12035l = t1.f0.p("audio/flac");
            d.r(nVarA, g0Var);
            g0 g0Var2 = this.f;
            this.i.b();
            g0Var2.getClass();
            this.f1540g = 4;
            return 0;
        }
        long j10 = 0;
        if (i10 == 4) {
            pVar.l();
            w1.t tVar7 = new w1.t(2);
            pVar.A(tVar7.f13738a, 0, 2);
            int iD = tVar7.D();
            if ((iD >> 2) != 16382) {
                pVar.l();
                throw t1.g0.a(null, "First frame does not start with sync code.");
            }
            pVar.l();
            this.f1543k = iD;
            q qVar = this.f1539e;
            int i19 = b0.f13686a;
            long position = pVar.getPosition();
            long length = pVar.getLength();
            this.i.getClass();
            t tVar8 = this.i;
            ob.d dVar = tVar8.f13858k;
            if (dVar != null && ((long[]) dVar.f10105w).length > 0) {
                sVar = new s(tVar8, position, 0);
                i = 0;
            } else if (length == -1 || tVar8.f13857j <= 0) {
                i = 0;
                sVar = new s(tVar8.b());
            } else {
                int i20 = this.f1543k;
                int i21 = tVar8.f13852c;
                d1 d1Var = new d1(2, tVar8);
                a aVar = new a(tVar8, i20);
                long jB = tVar8.b();
                long j11 = tVar8.f13857j;
                int i22 = tVar8.f13853d;
                if (i22 > 0) {
                    i = 0;
                    j8 = ((((long) i22) + ((long) i21)) / 2) + 1;
                } else {
                    i = 0;
                    int i23 = tVar8.f13850a;
                    j8 = 64 + (((((i23 != tVar8.f13851b || i23 <= 0) ? 4096L : i23) * ((long) tVar8.f13855g)) * ((long) tVar8.f13856h)) / 8);
                }
                b bVar = new b(d1Var, aVar, jB, j11, position, length, j8, Math.max(6, i21));
                this.f1544l = bVar;
                sVar = bVar.f1531a;
            }
            qVar.k(sVar);
            this.f1540g = 5;
            return i;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        b bVar2 = this.f1544l;
        if (bVar2 != null && bVar2.f1533c != null) {
            return bVar2.b(pVar, rVar);
        }
        if (this.f1546n == -1) {
            t tVar9 = this.i;
            pVar.l();
            pVar.B(1);
            byte[] bArr4 = new byte[1];
            pVar.A(bArr4, 0, 1);
            boolean z11 = (bArr4[0] & 1) == 1;
            pVar.B(2);
            i = z11 ? 7 : 6;
            w1.t tVar10 = new w1.t(i);
            byte[] bArr5 = tVar10.f13738a;
            int i24 = 0;
            while (i24 < i) {
                int i25 = pVar.i(bArr5, i24, i - i24);
                if (i25 == -1) {
                    break;
                }
                i24 += i25;
            }
            tVar10.I(i24);
            pVar.l();
            try {
                long jE = tVar10.E();
                if (!z11) {
                    jE *= (long) tVar9.f13851b;
                }
                j10 = jE;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw t1.g0.a(null, null);
            }
            this.f1546n = j10;
        } else {
            w1.t tVar11 = this.f1536b;
            int i26 = tVar11.f13740c;
            if (i26 < 32768) {
                int i27 = pVar.read(tVar11.f13738a, i26, 32768 - i26);
                z = i27 == -1;
                if (!z) {
                    tVar11.I(i26 + i27);
                } else if (tVar11.a() == 0) {
                    long j12 = this.f1546n * 1000000;
                    t tVar12 = this.i;
                    int i28 = b0.f13686a;
                    this.f.a(j12 / ((long) tVar12.f13854e), 1, this.f1545m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i29 = tVar11.f13739b;
            int i30 = this.f1545m;
            int i31 = this.f1542j;
            if (i30 < i31) {
                tVar11.K(Math.min(i31 - i30, tVar11.a()));
            }
            this.i.getClass();
            int i32 = tVar11.f13739b;
            while (true) {
                int i33 = tVar11.f13740c - 16;
                r rVar2 = this.f1538d;
                if (i32 <= i33) {
                    tVar11.J(i32);
                    if (w2.b.b(tVar11, this.i, this.f1543k, rVar2)) {
                        tVar11.J(i32);
                        j9 = rVar2.f12092a;
                        break;
                    }
                    i32++;
                } else {
                    if (z) {
                        while (true) {
                            int i34 = tVar11.f13740c;
                            if (i32 > i34 - this.f1542j) {
                                tVar11.J(i34);
                                break;
                            }
                            tVar11.J(i32);
                            try {
                                zB = w2.b.b(tVar11, this.i, this.f1543k, rVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zB = false;
                            }
                            if (tVar11.f13739b > tVar11.f13740c) {
                                zB = false;
                            }
                            if (zB) {
                                tVar11.J(i32);
                                j9 = rVar2.f12092a;
                                break;
                            }
                            i32++;
                        }
                    } else {
                        tVar11.J(i32);
                    }
                    j9 = -1;
                }
            }
            int i35 = tVar11.f13739b - i29;
            tVar11.J(i29);
            this.f.d(i35, tVar11);
            int i36 = this.f1545m + i35;
            this.f1545m = i36;
            if (j9 != -1) {
                long j13 = this.f1546n * 1000000;
                t tVar13 = this.i;
                int i37 = b0.f13686a;
                this.f.a(j13 / ((long) tVar13.f13854e), 1, i36, 0, null);
                this.f1545m = 0;
                this.f1546n = j9;
            }
            int length2 = tVar11.f13738a.length - tVar11.f13740c;
            if (tVar11.a() < 16 && length2 < 16) {
                int iA = tVar11.a();
                byte[] bArr6 = tVar11.f13738a;
                System.arraycopy(bArr6, tVar11.f13739b, bArr6, 0, iA);
                tVar11.J(0);
                tVar11.I(iA);
            }
        }
        return 0;
    }

    @Override // w2.o
    public final List h() {
        c0 c0Var = f0.f14553w;
        return z0.f14637z;
    }

    @Override // w2.o
    public final o a() {
        return this;
    }

    @Override // w2.o
    public final void release() {
    }
}
