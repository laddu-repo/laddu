package f4;

import android.util.SparseArray;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.UnityAdsConstants;
import db.c1;
import db.k0;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 implements y2.o {

    /* renamed from: e, reason: collision with root package name */
    public boolean f4699e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4700f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4701g;

    /* renamed from: h, reason: collision with root package name */
    public long f4702h;

    /* renamed from: i, reason: collision with root package name */
    public d3.a f4703i;
    public y2.q j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4704k;

    /* renamed from: a, reason: collision with root package name */
    public final u1.y f4695a = new u1.y(0);

    /* renamed from: c, reason: collision with root package name */
    public final u1.t f4697c = new u1.t(CodedOutputStream.DEFAULT_BUFFER_SIZE);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f4696b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f4698d = new y(0);

    @Override // y2.o
    public final void c(long j, long j10) {
        boolean z10;
        u1.y yVar = this.f4695a;
        boolean z11 = true;
        if (yVar.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d10 = yVar.d();
            if (d10 == -9223372036854775807L || d10 == 0 || d10 == j10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            yVar.g(j10);
        }
        d3.a aVar = this.f4703i;
        if (aVar != null) {
            aVar.A(j10);
        }
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.f4696b;
            if (i6 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i6);
                zVar.f5014f = false;
                zVar.f5009a.c();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // y2.o
    public final boolean f(y2.p pVar) {
        byte[] bArr = new byte[14];
        y2.l lVar = (y2.l) pVar;
        lVar.k(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            lVar.b(bArr[13] & 7, false);
            lVar.k(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // y2.o
    public final List h() {
        db.i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [y2.j, d3.a] */
    /* JADX WARN: Type inference failed for: r5v8, types: [y2.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [y2.i, java.lang.Object, j4.b0] */
    @Override // y2.o
    public final int i(y2.p pVar, mc.i iVar) {
        int i6;
        long j;
        long j10;
        long j11;
        i iVar2;
        long j12;
        long j13;
        u1.c.h(this.j);
        long length = pVar.getLength();
        y yVar = this.f4698d;
        if (length != -1 && !yVar.f5003d) {
            u1.y yVar2 = yVar.f5001b;
            u1.t tVar = yVar.f5002c;
            if (!yVar.f5005f) {
                long length2 = pVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j14 = length2 - min;
                if (pVar.getPosition() != j14) {
                    iVar.f8812a = j14;
                    return 1;
                }
                tVar.H(min);
                pVar.v();
                pVar.C(tVar.f12811a, 0, min);
                int i10 = tVar.f12812b;
                int i11 = tVar.f12813c - 4;
                while (true) {
                    if (i11 >= i10) {
                        if (y.b(i11, tVar.f12811a) == 442) {
                            tVar.K(i11 + 4);
                            long c10 = y.c(tVar);
                            if (c10 != -9223372036854775807L) {
                                j13 = c10;
                                break;
                            }
                        }
                        i11--;
                    } else {
                        j13 = -9223372036854775807L;
                        break;
                    }
                }
                yVar.f5007h = j13;
                yVar.f5005f = true;
                return 0;
            }
            if (yVar.f5007h == -9223372036854775807L) {
                yVar.a(pVar);
                return 0;
            }
            if (!yVar.f5004e) {
                int min2 = (int) Math.min(20000L, pVar.getLength());
                long j15 = 0;
                if (pVar.getPosition() != j15) {
                    iVar.f8812a = j15;
                    return 1;
                }
                tVar.H(min2);
                pVar.v();
                pVar.C(tVar.f12811a, 0, min2);
                int i12 = tVar.f12812b;
                int i13 = tVar.f12813c;
                while (true) {
                    if (i12 < i13 - 3) {
                        if (y.b(i12, tVar.f12811a) == 442) {
                            tVar.K(i12 + 4);
                            long c11 = y.c(tVar);
                            if (c11 != -9223372036854775807L) {
                                j12 = c11;
                                break;
                            }
                        }
                        i12++;
                    } else {
                        j12 = -9223372036854775807L;
                        break;
                    }
                }
                yVar.f5006g = j12;
                yVar.f5004e = true;
                return 0;
            }
            long j16 = yVar.f5006g;
            if (j16 == -9223372036854775807L) {
                yVar.a(pVar);
                return 0;
            }
            yVar.f5008i = yVar2.c(yVar.f5007h) - yVar2.b(j16);
            yVar.a(pVar);
            return 0;
        }
        if (!this.f4704k) {
            this.f4704k = true;
            long j17 = yVar.f5008i;
            if (j17 != -9223372036854775807L) {
                u1.y yVar3 = yVar.f5001b;
                ?? obj = new Object();
                ?? obj2 = new Object();
                obj2.f7158x = yVar3;
                obj2.f7159y = new u1.t();
                long j18 = 1 + j17;
                i6 = 4;
                ?? jVar = new y2.j(obj, obj2, j17, j18, 0L, length, 188L, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
                this.f4703i = jVar;
                this.j.n((y2.e) jVar.f14914c);
            } else {
                i6 = 4;
                this.j.n(new a3.b(j17));
            }
        } else {
            i6 = 4;
        }
        d3.a aVar = this.f4703i;
        if (aVar != null && ((y2.f) aVar.f14916e) != null) {
            return aVar.t(pVar, iVar);
        }
        pVar.v();
        if (length != -1) {
            j = length - pVar.l();
        } else {
            j = -1;
        }
        if (j == -1 || j >= 4) {
            u1.t tVar2 = this.f4697c;
            if (pVar.k(tVar2.f12811a, 0, i6, true)) {
                tVar2.K(0);
                int k8 = tVar2.k();
                if (k8 == 441) {
                    return -1;
                }
                if (k8 == 442) {
                    pVar.C(tVar2.f12811a, 0, 10);
                    tVar2.K(9);
                    pVar.w((tVar2.y() & 7) + 14);
                    return 0;
                }
                if (k8 == 443) {
                    pVar.C(tVar2.f12811a, 0, 2);
                    tVar2.K(0);
                    pVar.w(tVar2.E() + 6);
                    return 0;
                }
                if (((k8 & (-256)) >> 8) != 1) {
                    pVar.w(1);
                    return 0;
                }
                int i14 = k8 & 255;
                SparseArray sparseArray = this.f4696b;
                z zVar = (z) sparseArray.get(i14);
                if (!this.f4699e) {
                    if (zVar == null) {
                        if (i14 == 189) {
                            iVar2 = new b("video/mp2p");
                            this.f4700f = true;
                            this.f4702h = pVar.getPosition();
                        } else if ((k8 & 224) == 192) {
                            iVar2 = new u(null, 0, "video/mp2p");
                            this.f4700f = true;
                            this.f4702h = pVar.getPosition();
                        } else if ((k8 & 240) == 224) {
                            iVar2 = new k(null, "video/mp2p");
                            this.f4701g = true;
                            this.f4702h = pVar.getPosition();
                        } else {
                            iVar2 = null;
                        }
                        if (iVar2 != null) {
                            iVar2.f(this.j, new h0(i14, 256));
                            zVar = new z(iVar2, this.f4695a);
                            sparseArray.put(i14, zVar);
                        }
                    }
                    if (this.f4700f && this.f4701g) {
                        j11 = this.f4702h + 8192;
                    } else {
                        j11 = 1048576;
                    }
                    if (pVar.getPosition() > j11) {
                        this.f4699e = true;
                        this.j.t();
                    }
                }
                pVar.C(tVar2.f12811a, 0, 2);
                tVar2.K(0);
                int E = tVar2.E() + 6;
                if (zVar == null) {
                    pVar.w(E);
                    return 0;
                }
                tVar2.H(E);
                pVar.readFully(tVar2.f12811a, 0, E);
                tVar2.K(6);
                i iVar3 = zVar.f5009a;
                u1.s sVar = zVar.f5011c;
                tVar2.i(sVar.f12804b, 0, 3);
                sVar.q(0);
                sVar.t(8);
                zVar.f5012d = sVar.h();
                zVar.f5013e = sVar.h();
                sVar.t(6);
                tVar2.i(sVar.f12804b, 0, sVar.i(8));
                sVar.q(0);
                u1.y yVar4 = zVar.f5010b;
                zVar.f5015g = 0L;
                if (zVar.f5012d) {
                    sVar.t(4);
                    sVar.t(1);
                    sVar.t(1);
                    long i15 = (sVar.i(3) << 30) | (sVar.i(15) << 15) | sVar.i(15);
                    sVar.t(1);
                    if (!zVar.f5014f && zVar.f5013e) {
                        sVar.t(4);
                        sVar.t(1);
                        sVar.t(1);
                        sVar.t(1);
                        yVar4.b((sVar.i(15) << 15) | (sVar.i(3) << 30) | sVar.i(15));
                        zVar.f5014f = true;
                        j10 = i15;
                    } else {
                        j10 = i15;
                    }
                    zVar.f5015g = yVar4.b(j10);
                }
                iVar3.e(4, zVar.f5015g);
                iVar3.a(tVar2);
                iVar3.d(false);
                tVar2.J(tVar2.f12811a.length);
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override // y2.o
    public final void l(y2.q qVar) {
        this.j = qVar;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final y2.o d() {
        return this;
    }
}
