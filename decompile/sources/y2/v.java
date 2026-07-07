package y2;

import db.k0;
import java.util.Collections;
import java.util.List;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f14946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14948c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14949d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14951f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14952g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14953h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14954i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14955k;

    /* renamed from: l, reason: collision with root package name */
    public final float f14956l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14957m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14958n;

    /* renamed from: o, reason: collision with root package name */
    public final ic.s f14959o;

    public v(List list, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f3, int i19, String str, ic.s sVar) {
        this.f14946a = list;
        this.f14947b = i6;
        this.f14948c = i10;
        this.f14949d = i11;
        this.f14950e = i12;
        this.f14951f = i13;
        this.f14952g = i14;
        this.f14953h = i15;
        this.f14954i = i16;
        this.j = i17;
        this.f14955k = i18;
        this.f14956l = f3;
        this.f14957m = i19;
        this.f14958n = str;
        this.f14959o = sVar;
    }

    public static v a(u1.t tVar, boolean z10, ic.s sVar) {
        String str;
        List singletonList;
        v5.o g10;
        int i6;
        int i10 = 4;
        try {
            if (z10) {
                tVar.L(4);
            } else {
                tVar.L(21);
            }
            int y9 = tVar.y() & 3;
            int y10 = tVar.y();
            int i11 = tVar.f12812b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < y10; i14++) {
                tVar.L(1);
                int E = tVar.E();
                for (int i15 = 0; i15 < E; i15++) {
                    int E2 = tVar.E();
                    i13 += E2 + 4;
                    tVar.L(E2);
                }
            }
            tVar.K(i11);
            byte[] bArr = new byte[i13];
            ic.s sVar2 = sVar;
            String str2 = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            float f3 = 1.0f;
            int i27 = -1;
            while (i16 < y10) {
                int y11 = tVar.y() & 63;
                int E3 = tVar.E();
                ic.s sVar3 = sVar2;
                int i28 = 0;
                while (i28 < E3) {
                    int E4 = tVar.E();
                    int i29 = y9;
                    System.arraycopy(v1.o.f13247a, i12, bArr, i17, i10);
                    int i30 = i17 + 4;
                    System.arraycopy(tVar.f12811a, tVar.f12812b, bArr, i30, E4);
                    if (y11 == 32 && i28 == 0) {
                        sVar3 = v1.o.i(bArr, i30, i30 + E4);
                    } else {
                        if (y11 == 33 && i28 == 0) {
                            v1.k h4 = v1.o.h(bArr, i30, i30 + E4, sVar3);
                            i18 = h4.f13213a + 1;
                            i19 = h4.f13219g;
                            int i31 = h4.f13220h;
                            i21 = h4.f13215c + 8;
                            i22 = h4.f13216d + 8;
                            int i32 = h4.f13222k;
                            i20 = i31;
                            int i33 = h4.f13223l;
                            int i34 = h4.f13224m;
                            float f10 = h4.f13221i;
                            int i35 = h4.j;
                            v1.h hVar = h4.f13214b;
                            if (hVar != null) {
                                i6 = i35;
                                str2 = u1.d.b(hVar.f13200a, hVar.f13201b, hVar.f13202c, hVar.f13203d, hVar.f13204e, hVar.f13205f);
                            } else {
                                i6 = i35;
                            }
                            i27 = i6;
                            f3 = f10;
                            i25 = i34;
                            i24 = i33;
                            i23 = i32;
                        } else if (y11 == 39 && i28 == 0 && (g10 = v1.o.g(bArr, i30, i30 + E4)) != null && sVar3 != null) {
                            i12 = 0;
                            if (g10.f13330x == ((v1.g) ((k0) sVar3.f6781x).get(0)).f13199b) {
                                i26 = 4;
                            } else {
                                i26 = 5;
                            }
                        }
                        i12 = 0;
                    }
                    i17 = i30 + E4;
                    tVar.L(E4);
                    i28++;
                    y9 = i29;
                    i10 = 4;
                }
                i16++;
                sVar2 = sVar3;
                i10 = 4;
            }
            int i36 = y9;
            if (i13 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new v(singletonList, i36 + 1, i18, i19, i20, i21, i22, i23, i24, i25, i26, f3, i27, str2, sVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            if (z10) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw l0.a(e10, "Error parsing".concat(str));
        }
    }
}
