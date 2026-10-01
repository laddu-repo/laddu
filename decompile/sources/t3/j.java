package t3;

import a2.e2;
import db.k0;
import f4.e0;
import java.util.ArrayList;
import java.util.Arrays;
import r1.j0;
import r1.l0;
import r1.p;
import r1.q;
import s8.l;
import u1.s;
import u1.t;
import y2.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    public e0 f12603n;

    /* renamed from: o, reason: collision with root package name */
    public int f12604o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12605p;

    /* renamed from: q, reason: collision with root package name */
    public x f12606q;

    /* renamed from: r, reason: collision with root package name */
    public v9.b f12607r;

    @Override // t3.i
    public final void a(long j) {
        boolean z10;
        this.f12597g = j;
        int i6 = 0;
        if (j != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12605p = z10;
        x xVar = this.f12606q;
        if (xVar != null) {
            i6 = xVar.f14967e;
        }
        this.f12604o = i6;
    }

    @Override // t3.i
    public final long b(t tVar) {
        int i6;
        int i10 = 0;
        byte b10 = tVar.f12811a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        e0 e0Var = this.f12603n;
        u1.c.h(e0Var);
        int i11 = e0Var.f4763x;
        x xVar = (x) e0Var.f4764y;
        if (!((e2[]) e0Var.B)[(b10 >> 1) & (255 >>> (8 - i11))].f217b) {
            i6 = xVar.f14967e;
        } else {
            i6 = xVar.f14968f;
        }
        if (this.f12605p) {
            i10 = (this.f12604o + i6) / 4;
        }
        long j = i10;
        byte[] bArr = tVar.f12811a;
        int length = bArr.length;
        int i12 = tVar.f12813c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            tVar.I(copyOf.length, copyOf);
        } else {
            tVar.J(i12);
        }
        byte[] bArr2 = tVar.f12811a;
        int i13 = tVar.f12813c;
        bArr2[i13 - 4] = (byte) (j & 255);
        bArr2[i13 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j >>> 24) & 255);
        this.f12605p = true;
        this.f12604o = i6;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [y2.x, java.lang.Object] */
    @Override // t3.i
    public final boolean c(t tVar, long j, l lVar) {
        e0 e0Var;
        int i6;
        int i10;
        long j10;
        if (this.f12603n != null) {
            ((q) lVar.f12251y).getClass();
            return false;
        }
        x xVar = this.f12606q;
        int i11 = 4;
        int i12 = -1;
        if (xVar == null) {
            y2.a.B(1, tVar, false);
            tVar.q();
            int y9 = tVar.y();
            int q9 = tVar.q();
            int m9 = tVar.m();
            if (m9 <= 0) {
                m9 = -1;
            }
            int m10 = tVar.m();
            if (m10 > 0) {
                i12 = m10;
            }
            tVar.m();
            int y10 = tVar.y();
            int pow = (int) Math.pow(2.0d, y10 & 15);
            int pow2 = (int) Math.pow(2.0d, (y10 & 240) >> 4);
            tVar.y();
            ?? copyOf = Arrays.copyOf(tVar.f12811a, tVar.f12813c);
            ?? obj = new Object();
            obj.f14963a = y9;
            obj.f14964b = q9;
            obj.f14965c = m9;
            obj.f14966d = i12;
            obj.f14967e = pow;
            obj.f14968f = pow2;
            obj.f14969g = copyOf;
            this.f12606q = obj;
        } else {
            v9.b bVar = this.f12607r;
            if (bVar == null) {
                this.f12607r = y2.a.z(tVar, true, true);
            } else {
                int i13 = tVar.f12813c;
                byte[] bArr = new byte[i13];
                System.arraycopy(tVar.f12811a, 0, bArr, 0, i13);
                int i14 = xVar.f14963a;
                int i15 = 5;
                y2.a.B(5, tVar, false);
                int y11 = tVar.y() + 1;
                s sVar = new s(tVar.f12811a);
                sVar.t(tVar.f12812b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 16;
                    if (i16 < y11) {
                        if (sVar.i(24) == 5653314) {
                            int i18 = sVar.i(16);
                            int i19 = sVar.i(24);
                            if (!sVar.h()) {
                                boolean h4 = sVar.h();
                                for (int i20 = 0; i20 < i19; i20++) {
                                    if (h4) {
                                        if (sVar.h()) {
                                            sVar.t(i15);
                                        }
                                    } else {
                                        sVar.t(i15);
                                    }
                                }
                            } else {
                                sVar.t(i15);
                                int i21 = 0;
                                while (i21 < i19) {
                                    int i22 = 0;
                                    for (int i23 = i19 - i21; i23 > 0; i23 >>>= 1) {
                                        i22++;
                                    }
                                    i21 += sVar.i(i22);
                                }
                            }
                            int i24 = sVar.i(4);
                            if (i24 <= 2) {
                                if (i24 == 1 || i24 == 2) {
                                    sVar.t(32);
                                    sVar.t(32);
                                    int i25 = sVar.i(4) + 1;
                                    sVar.t(1);
                                    if (i24 == 1) {
                                        if (i18 != 0) {
                                            j10 = (long) Math.floor(Math.pow(i19, 1.0d / i18));
                                        } else {
                                            j10 = 0;
                                        }
                                    } else {
                                        j10 = i19 * i18;
                                    }
                                    sVar.t((int) (j10 * i25));
                                }
                                i16++;
                                i15 = 5;
                            } else {
                                throw l0.a(null, "lookup type greater than 2 not decodable: " + i24);
                            }
                        } else {
                            throw l0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((sVar.f12806d * 8) + sVar.f12807e));
                        }
                    } else {
                        int i26 = 6;
                        int i27 = sVar.i(6) + 1;
                        for (int i28 = 0; i28 < i27; i28++) {
                            if (sVar.i(16) != 0) {
                                throw l0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i29 = 1;
                        int i30 = sVar.i(6) + 1;
                        int i31 = 0;
                        while (true) {
                            int i32 = 3;
                            if (i31 < i30) {
                                int i33 = sVar.i(i17);
                                if (i33 != 0) {
                                    if (i33 == i29) {
                                        int i34 = sVar.i(5);
                                        int[] iArr = new int[i34];
                                        int i35 = -1;
                                        for (int i36 = 0; i36 < i34; i36++) {
                                            int i37 = sVar.i(i11);
                                            iArr[i36] = i37;
                                            if (i37 > i35) {
                                                i35 = i37;
                                            }
                                        }
                                        int i38 = i35 + 1;
                                        int[] iArr2 = new int[i38];
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            iArr2[i39] = sVar.i(i32) + 1;
                                            int i40 = sVar.i(2);
                                            int i41 = 8;
                                            if (i40 > 0) {
                                                sVar.t(8);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i42 = 0;
                                            for (int i43 = 1; i42 < (i43 << i40); i43 = 1) {
                                                sVar.t(i41);
                                                i42++;
                                                i41 = 8;
                                            }
                                            i39++;
                                            iArr2 = iArr3;
                                            i32 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        sVar.t(2);
                                        int i44 = sVar.i(4);
                                        int i45 = 0;
                                        int i46 = 0;
                                        for (int i47 = 0; i47 < i34; i47++) {
                                            i45 += iArr4[iArr[i47]];
                                            while (i46 < i45) {
                                                sVar.t(i44);
                                                i46++;
                                            }
                                        }
                                    } else {
                                        throw l0.a(null, "floor type greater than 1 not decodable: " + i33);
                                    }
                                } else {
                                    int i48 = 8;
                                    sVar.t(8);
                                    sVar.t(16);
                                    sVar.t(16);
                                    sVar.t(6);
                                    sVar.t(8);
                                    int i49 = sVar.i(4) + 1;
                                    int i50 = 0;
                                    while (i50 < i49) {
                                        sVar.t(i48);
                                        i50++;
                                        i48 = 8;
                                    }
                                }
                                i31++;
                                i26 = 6;
                                i11 = 4;
                                i17 = 16;
                                i29 = 1;
                            } else {
                                int i51 = sVar.i(i26) + 1;
                                int i52 = 0;
                                while (i52 < i51) {
                                    if (sVar.i(16) <= 2) {
                                        sVar.t(24);
                                        sVar.t(24);
                                        sVar.t(24);
                                        int i53 = sVar.i(i26) + 1;
                                        int i54 = 8;
                                        sVar.t(8);
                                        int[] iArr5 = new int[i53];
                                        for (int i55 = 0; i55 < i53; i55++) {
                                            int i56 = sVar.i(3);
                                            if (sVar.h()) {
                                                i10 = sVar.i(5);
                                            } else {
                                                i10 = 0;
                                            }
                                            iArr5[i55] = (i10 * 8) + i56;
                                        }
                                        int i57 = 0;
                                        while (i57 < i53) {
                                            int i58 = 0;
                                            while (i58 < i54) {
                                                if ((iArr5[i57] & (1 << i58)) != 0) {
                                                    sVar.t(i54);
                                                }
                                                i58++;
                                                i54 = 8;
                                            }
                                            i57++;
                                            i54 = 8;
                                        }
                                        i52++;
                                        i26 = 6;
                                    } else {
                                        throw l0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int i59 = sVar.i(i26) + 1;
                                for (int i60 = 0; i60 < i59; i60++) {
                                    int i61 = sVar.i(16);
                                    if (i61 != 0) {
                                        u1.a.g("VorbisUtil", "mapping type other than 0 not supported: " + i61);
                                    } else {
                                        if (sVar.h()) {
                                            i6 = sVar.i(4) + 1;
                                        } else {
                                            i6 = 1;
                                        }
                                        if (sVar.h()) {
                                            int i62 = sVar.i(8) + 1;
                                            for (int i63 = 0; i63 < i62; i63++) {
                                                int i64 = i14 - 1;
                                                int i65 = 0;
                                                for (int i66 = i64; i66 > 0; i66 >>>= 1) {
                                                    i65++;
                                                }
                                                sVar.t(i65);
                                                int i67 = 0;
                                                while (i64 > 0) {
                                                    i67++;
                                                    i64 >>>= 1;
                                                }
                                                sVar.t(i67);
                                            }
                                        }
                                        if (sVar.i(2) == 0) {
                                            if (i6 > 1) {
                                                for (int i68 = 0; i68 < i14; i68++) {
                                                    sVar.t(4);
                                                }
                                            }
                                            for (int i69 = 0; i69 < i6; i69++) {
                                                sVar.t(8);
                                                sVar.t(8);
                                                sVar.t(8);
                                            }
                                        } else {
                                            throw l0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int i70 = sVar.i(6);
                                int i71 = i70 + 1;
                                e2[] e2VarArr = new e2[i71];
                                for (int i72 = 0; i72 < i71; i72++) {
                                    boolean h10 = sVar.h();
                                    sVar.i(16);
                                    sVar.i(16);
                                    sVar.i(8);
                                    e2VarArr[i72] = new e2(6, h10);
                                }
                                if (sVar.h()) {
                                    int i73 = 0;
                                    while (i70 > 0) {
                                        i73++;
                                        i70 >>>= 1;
                                    }
                                    e0Var = new e0(xVar, bVar, bArr, e2VarArr, i73);
                                } else {
                                    throw l0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        e0Var = null;
        this.f12603n = e0Var;
        if (e0Var == null) {
            return true;
        }
        x xVar2 = (x) e0Var.f4764y;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) xVar2.f14969g);
        arrayList.add((byte[]) e0Var.A);
        j0 v10 = y2.a.v(k0.l((String[]) ((v9.b) e0Var.f4765z).f13479x));
        p pVar = new p();
        pVar.f11610l = r1.k0.p("audio/ogg");
        pVar.f11611m = r1.k0.p("audio/vorbis");
        pVar.f11607h = xVar2.f14966d;
        pVar.f11608i = xVar2.f14965c;
        pVar.E = xVar2.f14963a;
        pVar.F = xVar2.f14964b;
        pVar.f11614p = arrayList;
        pVar.f11609k = v10;
        lVar.f12251y = new q(pVar);
        return true;
    }

    @Override // t3.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f12603n = null;
            this.f12606q = null;
            this.f12607r = null;
        }
        this.f12604o = 0;
        this.f12605p = false;
    }
}
