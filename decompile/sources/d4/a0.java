package d4;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements w2.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4041e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4043h;
    public b3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w2.q f4044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4045k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.y f4037a = new w1.y(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4039c = new w1.t(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f4038b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f4040d = new y(0);

    @Override // w2.o
    public final void c(w2.q qVar) {
        this.f4044j = qVar;
    }

    @Override // w2.o
    public final boolean e(w2.p pVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        w2.l lVar = (w2.l) pVar;
        lVar.v(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.b(bArr[13] & 7, false);
            lVar.v(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // w2.o
    public final void f(long j8, long j9) {
        w1.y yVar = this.f4037a;
        boolean z2 = yVar.e() == -9223372036854775807L;
        if (!z2) {
            long jD = yVar.d();
            z2 = (jD == -9223372036854775807L || jD == 0 || jD == j9) ? false : true;
        }
        if (z2) {
            yVar.g(j9);
        }
        b3.b bVar = this.i;
        if (bVar != null) {
            bVar.d(j9);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f4038b;
            if (i >= sparseArray.size()) {
                return;
            }
            z zVar = (z) sparseArray.valueAt(i);
            zVar.f = false;
            zVar.f4329a.a();
            i++;
        }
    }

    @Override // w2.o
    public final int g(w2.p pVar, t1.r rVar) {
        int i;
        int i10;
        long j8;
        i kVar;
        long j9;
        w1.a.k(this.f4044j);
        long length = pVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j10 = -9223372036854775807L;
        y yVar = this.f4040d;
        if (i11 != 0 && !yVar.f4325d) {
            w1.y yVar2 = yVar.f4323b;
            w1.t tVar = yVar.f4324c;
            if (!yVar.f) {
                long length2 = pVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j11 = length2 - ((long) iMin);
                if (pVar.getPosition() != j11) {
                    rVar.f12092a = j11;
                    return 1;
                }
                tVar.G(iMin);
                pVar.l();
                pVar.A(tVar.f13738a, 0, iMin);
                int i12 = tVar.f13739b;
                int i13 = tVar.f13740c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (y.b(i13, tVar.f13738a) == 442) {
                        tVar.J(i13 + 4);
                        long jC = y.c(tVar);
                        if (jC != -9223372036854775807L) {
                            j10 = jC;
                            break;
                        }
                    }
                    i13--;
                }
                yVar.f4328h = j10;
                yVar.f = true;
                return 0;
            }
            if (yVar.f4328h == -9223372036854775807L) {
                yVar.a(pVar);
                return 0;
            }
            if (yVar.f4326e) {
                long j12 = yVar.f4327g;
                if (j12 == -9223372036854775807L) {
                    yVar.a(pVar);
                    return 0;
                }
                yVar.i = yVar2.c(yVar.f4328h) - yVar2.b(j12);
                yVar.a(pVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, pVar.getLength());
            long j13 = 0;
            if (pVar.getPosition() != j13) {
                rVar.f12092a = j13;
                return 1;
            }
            tVar.G(iMin2);
            pVar.l();
            pVar.A(tVar.f13738a, 0, iMin2);
            int i14 = tVar.f13739b;
            int i15 = tVar.f13740c;
            while (true) {
                if (i14 >= i15 - 3) {
                    j9 = -9223372036854775807L;
                    break;
                }
                if (y.b(i14, tVar.f13738a) == 442) {
                    tVar.J(i14 + 4);
                    long jC2 = y.c(tVar);
                    if (jC2 != -9223372036854775807L) {
                        j9 = jC2;
                        break;
                    }
                }
                i14++;
            }
            yVar.f4327g = j9;
            yVar.f4326e = true;
            return 0;
        }
        if (this.f4045k) {
            i = i11;
            i10 = 4;
        } else {
            this.f4045k = true;
            long j14 = yVar.i;
            if (j14 != -9223372036854775807L) {
                i = i11;
                i10 = 4;
                b3.b bVar = new b3.b(new w2.f(), new sc.b(yVar.f4323b), j14, j14 + 1, 0L, length, 188L, 1000);
                this.i = bVar;
                this.f4044j.k(bVar.f1531a);
            } else {
                i = i11;
                i10 = 4;
                this.f4044j.k(new w2.s(j14));
            }
        }
        b3.b bVar2 = this.i;
        if (bVar2 != null && bVar2.f1533c != null) {
            return bVar2.b(pVar, rVar);
        }
        pVar.l();
        long jW = i != 0 ? length - pVar.w() : -1L;
        if (jW != -1 && jW < 4) {
            return -1;
        }
        w1.t tVar2 = this.f4039c;
        if (!pVar.v(tVar2.f13738a, 0, i10, true)) {
            return -1;
        }
        tVar2.J(0);
        int iJ = tVar2.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            pVar.A(tVar2.f13738a, 0, 10);
            tVar2.J(9);
            pVar.p((tVar2.x() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            pVar.A(tVar2.f13738a, 0, 2);
            tVar2.J(0);
            pVar.p(tVar2.D() + 6);
            return 0;
        }
        if (((iJ & (-256)) >> 8) != 1) {
            pVar.p(1);
            return 0;
        }
        int i16 = iJ & 255;
        SparseArray sparseArray = this.f4038b;
        z zVar = (z) sparseArray.get(i16);
        if (!this.f4041e) {
            if (zVar == null) {
                if (i16 == 189) {
                    kVar = new b("video/mp2p");
                    this.f = true;
                    this.f4043h = pVar.getPosition();
                } else if ((iJ & 224) == 192) {
                    kVar = new u(0, null, "video/mp2p");
                    this.f = true;
                    this.f4043h = pVar.getPosition();
                } else if ((iJ & 240) == 224) {
                    kVar = new k(null, "video/mp2p");
                    this.f4042g = true;
                    this.f4043h = pVar.getPosition();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.e(this.f4044j, new g0(i16, 256));
                    zVar = new z(kVar, this.f4037a);
                    sparseArray.put(i16, zVar);
                }
            }
            if (pVar.getPosition() > ((this.f && this.f4042g) ? this.f4043h + 8192 : 1048576L)) {
                this.f4041e = true;
                this.f4044j.e();
            }
        }
        pVar.A(tVar2.f13738a, 0, 2);
        tVar2.J(0);
        int iD = tVar2.D() + 6;
        if (zVar == null) {
            pVar.p(iD);
            return 0;
        }
        tVar2.G(iD);
        pVar.readFully(tVar2.f13738a, 0, iD);
        tVar2.J(6);
        i iVar = zVar.f4329a;
        u3.f fVar = zVar.f4331c;
        tVar2.h(fVar.f12868b, 0, 3);
        fVar.q(0);
        fVar.t(8);
        zVar.f4332d = fVar.h();
        zVar.f4333e = fVar.h();
        fVar.t(6);
        tVar2.h(fVar.f12868b, 0, fVar.i(8));
        fVar.q(0);
        w1.y yVar3 = zVar.f4330b;
        zVar.f4334g = 0L;
        if (zVar.f4332d) {
            fVar.t(4);
            long jI = ((long) fVar.i(3)) << 30;
            fVar.t(1);
            long jI2 = jI | ((long) (fVar.i(15) << 15));
            fVar.t(1);
            long jI3 = jI2 | ((long) fVar.i(15));
            fVar.t(1);
            if (zVar.f || !zVar.f4333e) {
                j8 = jI3;
            } else {
                fVar.t(4);
                long jI4 = ((long) fVar.i(3)) << 30;
                fVar.t(1);
                long jI5 = ((long) (fVar.i(15) << 15)) | jI4;
                fVar.t(1);
                long jI6 = jI5 | ((long) fVar.i(15));
                fVar.t(1);
                yVar3.b(jI6);
                zVar.f = true;
                j8 = jI3;
            }
            zVar.f4334g = yVar3.b(j8);
        }
        iVar.d(4, zVar.f4334g);
        iVar.b(tVar2);
        iVar.c(false);
        tVar2.I(tVar2.f13738a.length);
        return 0;
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
