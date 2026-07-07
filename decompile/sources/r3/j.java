package r3;

import c2.w1;
import cf.m;
import java.util.ArrayList;
import java.util.Arrays;
import k8.k4;
import t1.e0;
import t1.g0;
import t1.n;
import t1.o;
import w1.t;
import w2.y;
import y9.f0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f11169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f11172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k4 f11173r;

    @Override // r3.i
    public final void a(long j8) {
        this.f11163g = j8;
        this.f11171p = j8 != 0;
        y yVar = this.f11172q;
        this.f11170o = yVar != null ? yVar.f13884e : 0;
    }

    @Override // r3.i
    public final long b(t tVar) {
        byte b9 = tVar.f13738a[0];
        if ((b9 & 1) == 1) {
            return -1L;
        }
        m mVar = this.f11169n;
        w1.a.k(mVar);
        int i = mVar.f2328w;
        y yVar = (y) mVar.f2329x;
        int i10 = !((w1[]) mVar.A)[(b9 >> 1) & (255 >>> (8 - i))].f1989w ? yVar.f13884e : yVar.f;
        long j8 = this.f11171p ? (this.f11170o + i10) / 4 : 0;
        byte[] bArr = tVar.f13738a;
        int length = bArr.length;
        int i11 = tVar.f13740c + 4;
        if (length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            tVar.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            tVar.I(i11);
        }
        byte[] bArr2 = tVar.f13738a;
        int i12 = tVar.f13740c;
        bArr2[i12 - 4] = (byte) (j8 & 255);
        bArr2[i12 - 3] = (byte) ((j8 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j8 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j8 >>> 24) & 255);
        this.f11171p = true;
        this.f11170o = i10;
        return j8;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // r3.i
    public final boolean c(t tVar, long j8, ob.d dVar) throws g0 {
        m mVar;
        if (this.f11169n != null) {
            ((o) dVar.f10105w).getClass();
            return false;
        }
        y yVar = this.f11172q;
        int i = 4;
        if (yVar == null) {
            w2.b.x(1, tVar, false);
            tVar.p();
            int iX = tVar.x();
            int iP = tVar.p();
            int iL = tVar.l();
            if (iL <= 0) {
                iL = -1;
            }
            int iL2 = tVar.l();
            int i10 = iL2 > 0 ? iL2 : -1;
            tVar.l();
            int iX2 = tVar.x();
            int iPow = (int) Math.pow(2.0d, iX2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iX2 & 240) >> 4);
            tVar.x();
            ?? CopyOf = Arrays.copyOf(tVar.f13738a, tVar.f13740c);
            y yVar2 = new y();
            yVar2.f13880a = iX;
            yVar2.f13881b = iP;
            yVar2.f13882c = iL;
            yVar2.f13883d = i10;
            yVar2.f13884e = iPow;
            yVar2.f = iPow2;
            yVar2.f13885g = CopyOf;
            this.f11172q = yVar2;
        } else {
            k4 k4Var = this.f11173r;
            if (k4Var == null) {
                this.f11173r = w2.b.v(tVar, true, true);
            } else {
                int i11 = tVar.f13740c;
                byte[] bArr = new byte[i11];
                System.arraycopy(tVar.f13738a, 0, bArr, 0, i11);
                int i12 = yVar.f13880a;
                int i13 = 5;
                w2.b.x(5, tVar, false);
                int iX3 = tVar.x() + 1;
                u3.f fVar = new u3.f(tVar.f13738a);
                int i14 = 8;
                fVar.t(tVar.f13739b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 < iX3) {
                        int i17 = i14;
                        if (fVar.i(24) != 5653314) {
                            throw g0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.f12870d * 8) + fVar.f12871e));
                        }
                        int i18 = fVar.i(16);
                        int i19 = fVar.i(24);
                        if (fVar.h()) {
                            fVar.t(i13);
                            int i20 = 0;
                            while (i20 < i19) {
                                int i21 = 0;
                                for (int i22 = i19 - i20; i22 > 0; i22 >>>= 1) {
                                    i21++;
                                }
                                i20 += fVar.i(i21);
                            }
                        } else {
                            boolean zH = fVar.h();
                            for (int i23 = 0; i23 < i19; i23++) {
                                if (!zH) {
                                    fVar.t(i13);
                                } else if (fVar.h()) {
                                    fVar.t(i13);
                                }
                            }
                        }
                        int i24 = fVar.i(4);
                        if (i24 > 2) {
                            throw g0.a(null, "lookup type greater than 2 not decodable: " + i24);
                        }
                        if (i24 == 1 || i24 == 2) {
                            fVar.t(32);
                            fVar.t(32);
                            int i25 = fVar.i(4) + 1;
                            fVar.t(1);
                            fVar.t((int) ((i24 == 1 ? i18 != 0 ? (long) Math.floor(Math.pow(i19, 1.0d / ((double) i18))) : 0L : ((long) i19) * ((long) i18)) * ((long) i25)));
                        }
                        i15++;
                        i14 = i17;
                        i13 = 5;
                    } else {
                        int i26 = i14;
                        int i27 = 6;
                        int i28 = fVar.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (fVar.i(16) != 0) {
                                throw g0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i30 = 1;
                        int i31 = fVar.i(6) + 1;
                        int i32 = 0;
                        while (true) {
                            int i33 = 3;
                            if (i32 < i31) {
                                int i34 = fVar.i(i16);
                                if (i34 == 0) {
                                    int i35 = i26;
                                    fVar.t(i35);
                                    fVar.t(16);
                                    fVar.t(16);
                                    fVar.t(6);
                                    fVar.t(i35);
                                    int i36 = fVar.i(4) + 1;
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        fVar.t(i35);
                                        i37++;
                                        i35 = 8;
                                    }
                                } else {
                                    if (i34 != i30) {
                                        throw g0.a(null, "floor type greater than 1 not decodable: " + i34);
                                    }
                                    int i38 = fVar.i(5);
                                    int[] iArr = new int[i38];
                                    int i39 = -1;
                                    for (int i40 = 0; i40 < i38; i40++) {
                                        int i41 = fVar.i(i);
                                        iArr[i40] = i41;
                                        if (i41 > i39) {
                                            i39 = i41;
                                        }
                                    }
                                    int i42 = i39 + 1;
                                    int[] iArr2 = new int[i42];
                                    int i43 = 0;
                                    while (i43 < i42) {
                                        iArr2[i43] = fVar.i(i33) + 1;
                                        int i44 = fVar.i(2);
                                        int i45 = i26;
                                        if (i44 > 0) {
                                            fVar.t(i45);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i46 = 0;
                                        for (int i47 = 1; i46 < (i47 << i44); i47 = 1) {
                                            fVar.t(i45);
                                            i46++;
                                            i45 = 8;
                                        }
                                        i43++;
                                        iArr2 = iArr3;
                                        i26 = 8;
                                        i33 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    fVar.t(2);
                                    int i48 = fVar.i(4);
                                    int i49 = 0;
                                    int i50 = 0;
                                    for (int i51 = 0; i51 < i38; i51++) {
                                        i49 += iArr4[iArr[i51]];
                                        while (i50 < i49) {
                                            fVar.t(i48);
                                            i50++;
                                        }
                                    }
                                }
                                i32++;
                                i26 = 8;
                                i27 = 6;
                                i = 4;
                                i16 = 16;
                                i30 = 1;
                            } else {
                                int i52 = fVar.i(i27) + 1;
                                int i53 = 0;
                                while (i53 < i52) {
                                    if (fVar.i(16) > 2) {
                                        throw g0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    fVar.t(24);
                                    fVar.t(24);
                                    fVar.t(24);
                                    int i54 = fVar.i(i27) + 1;
                                    int i55 = 8;
                                    fVar.t(8);
                                    int[] iArr5 = new int[i54];
                                    for (int i56 = 0; i56 < i54; i56++) {
                                        iArr5[i56] = ((fVar.h() ? fVar.i(5) : 0) * 8) + fVar.i(3);
                                    }
                                    int i57 = 0;
                                    while (i57 < i54) {
                                        int i58 = 0;
                                        while (i58 < i55) {
                                            if ((iArr5[i57] & (1 << i58)) != 0) {
                                                fVar.t(i55);
                                            }
                                            i58++;
                                            i55 = 8;
                                        }
                                        i57++;
                                        i55 = 8;
                                    }
                                    i53++;
                                    i27 = 6;
                                }
                                int i59 = fVar.i(i27) + 1;
                                for (int i60 = 0; i60 < i59; i60++) {
                                    int i61 = fVar.i(16);
                                    if (i61 != 0) {
                                        w1.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i61);
                                    } else {
                                        int i62 = fVar.h() ? fVar.i(4) + 1 : 1;
                                        if (fVar.h()) {
                                            int i63 = fVar.i(8) + 1;
                                            for (int i64 = 0; i64 < i63; i64++) {
                                                int i65 = i12 - 1;
                                                int i66 = 0;
                                                for (int i67 = i65; i67 > 0; i67 >>>= 1) {
                                                    i66++;
                                                }
                                                fVar.t(i66);
                                                int i68 = 0;
                                                while (i65 > 0) {
                                                    i68++;
                                                    i65 >>>= 1;
                                                }
                                                fVar.t(i68);
                                            }
                                        }
                                        if (fVar.i(2) != 0) {
                                            throw g0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i62 > 1) {
                                            for (int i69 = 0; i69 < i12; i69++) {
                                                fVar.t(4);
                                            }
                                        }
                                        for (int i70 = 0; i70 < i62; i70++) {
                                            fVar.t(8);
                                            fVar.t(8);
                                            fVar.t(8);
                                        }
                                    }
                                }
                                int i71 = fVar.i(6);
                                int i72 = i71 + 1;
                                w1[] w1VarArr = new w1[i72];
                                for (int i73 = 0; i73 < i72; i73++) {
                                    boolean zH2 = fVar.h();
                                    fVar.i(16);
                                    fVar.i(16);
                                    fVar.i(8);
                                    w1VarArr[i73] = new w1(4, zH2);
                                }
                                if (!fVar.h()) {
                                    throw g0.a(null, "framing bit after modes not set as expected");
                                }
                                int i74 = 0;
                                while (i71 > 0) {
                                    i74++;
                                    i71 >>>= 1;
                                }
                                mVar = new m(yVar, k4Var, bArr, w1VarArr, i74);
                            }
                        }
                    }
                }
            }
        }
        mVar = null;
        this.f11169n = mVar;
        if (mVar == null) {
            return true;
        }
        y yVar3 = (y) mVar.f2329x;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) yVar3.f13885g);
        arrayList.add((byte[]) mVar.f2331z);
        e0 e0VarR = w2.b.r(f0.n((String[]) ((k4) mVar.f2330y).f7607v));
        n nVar = new n();
        nVar.f12035l = t1.f0.p("audio/ogg");
        nVar.f12036m = t1.f0.p("audio/vorbis");
        nVar.f12032h = yVar3.f13883d;
        nVar.i = yVar3.f13882c;
        nVar.E = yVar3.f13880a;
        nVar.F = yVar3.f13881b;
        nVar.f12039p = arrayList;
        nVar.f12034k = e0VarR;
        dVar.f10105w = new o(nVar);
        return true;
    }

    @Override // r3.i
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f11169n = null;
            this.f11172q = null;
            this.f11173r = null;
        }
        this.f11170o = 0;
        this.f11171p = false;
    }
}
