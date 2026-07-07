package t5;

import android.graphics.Rect;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ob.d f12293a = ob.d.f("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ob.d f12294b = ob.d.f("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ob.d f12295c = ob.d.f("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ob.d f12296d = ob.d.f("cm", "tm", "dr");

    public static j5.j a(u5.c cVar) throws a6.c, EOFException {
        float f;
        float f4;
        float f10;
        float f11;
        float f12;
        float f13;
        float fC = v5.i.c();
        v.g gVar = new v.g();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        v.j jVar = new v.j();
        j5.j jVar2 = new j5.j();
        cVar.i();
        float fG = 0.0f;
        int iG = 0;
        int iG2 = 0;
        float fG2 = 0.0f;
        float fG3 = 0.0f;
        while (cVar.B()) {
            float f14 = fC;
            switch (cVar.n0(f12293a)) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    f = fG;
                    iG = (int) cVar.G();
                    fC = f14;
                    fG = f;
                    break;
                case 1:
                    f = fG;
                    iG2 = (int) cVar.G();
                    fC = f14;
                    fG = f;
                    break;
                case 2:
                    f = fG;
                    fG2 = (float) cVar.G();
                    fC = f14;
                    fG = f;
                    break;
                case 3:
                    f = fG;
                    fG3 = ((float) cVar.G()) - 0.01f;
                    fC = f14;
                    fG = f;
                    break;
                case g1.g.LONG_FIELD_NUMBER /* 4 */:
                    fG = (float) cVar.G();
                    fC = f14;
                    break;
                case g1.g.STRING_FIELD_NUMBER /* 5 */:
                    f = fG;
                    f4 = fG2;
                    f10 = fG3;
                    String[] strArrSplit = cVar.I().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    int i11 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i10 < 4 || (i10 <= 4 && i11 < 0)))) {
                        jVar2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
                case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    f = fG;
                    f4 = fG2;
                    f10 = fG3;
                    cVar.a();
                    int i12 = 0;
                    while (cVar.B()) {
                        r5.d dVarA = q.a(cVar, jVar2);
                        if (dVarA.f11268e == 3) {
                            i12++;
                        }
                        arrayList.add(dVarA);
                        gVar.h(dVarA.f11267d, dVarA);
                        if (i12 > 4) {
                            v5.c.b("You have " + i12 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    cVar.l();
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
                case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    f = fG;
                    f4 = fG2;
                    f10 = fG3;
                    cVar.a();
                    while (cVar.B()) {
                        ArrayList arrayList3 = new ArrayList();
                        v.g gVar2 = new v.g();
                        cVar.i();
                        String strI = null;
                        String strI2 = null;
                        String strI3 = null;
                        int iH = 0;
                        int iH2 = 0;
                        while (cVar.B()) {
                            int iN0 = cVar.n0(f12294b);
                            if (iN0 == 0) {
                                strI = cVar.I();
                            } else if (iN0 == 1) {
                                cVar.a();
                                while (cVar.B()) {
                                    r5.d dVarA2 = q.a(cVar, jVar2);
                                    gVar2.h(dVarA2.f11267d, dVarA2);
                                    arrayList3.add(dVarA2);
                                }
                                cVar.l();
                            } else if (iN0 == 2) {
                                iH = cVar.H();
                            } else if (iN0 == 3) {
                                iH2 = cVar.H();
                            } else if (iN0 == 4) {
                                strI2 = cVar.I();
                            } else if (iN0 != 5) {
                                cVar.o0();
                                cVar.p0();
                            } else {
                                strI3 = cVar.I();
                            }
                        }
                        cVar.m();
                        if (strI2 != null) {
                            map2.put(strI, new j5.y(iH, iH2, strI, strI2, strI3));
                        } else {
                            map.put(strI, arrayList3);
                        }
                    }
                    cVar.l();
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
                case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                    f = fG;
                    f4 = fG2;
                    float f15 = fG3;
                    cVar.i();
                    while (cVar.B()) {
                        if (cVar.n0(f12295c) != 0) {
                            cVar.o0();
                            cVar.p0();
                        } else {
                            cVar.a();
                            while (cVar.B()) {
                                ob.d dVar = k.f12278a;
                                cVar.i();
                                String strI4 = null;
                                String strI5 = null;
                                String strI6 = null;
                                while (cVar.B()) {
                                    int iN02 = cVar.n0(k.f12278a);
                                    if (iN02 != 0) {
                                        float f16 = f15;
                                        if (iN02 == 1) {
                                            strI5 = cVar.I();
                                        } else if (iN02 == 2) {
                                            strI6 = cVar.I();
                                        } else if (iN02 != 3) {
                                            cVar.o0();
                                            cVar.p0();
                                        } else {
                                            cVar.G();
                                        }
                                        f15 = f16;
                                    } else {
                                        strI4 = cVar.I();
                                    }
                                }
                                cVar.m();
                                map3.put(strI5, new o5.c(strI4, strI5, strI6));
                                f15 = f15;
                            }
                            cVar.l();
                        }
                    }
                    f10 = f15;
                    cVar.m();
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
                case 9:
                    f = fG;
                    f4 = fG2;
                    f11 = fG3;
                    cVar.a();
                    while (cVar.B()) {
                        ob.d dVar2 = j.f12276a;
                        ArrayList arrayList4 = new ArrayList();
                        cVar.i();
                        double dG = 0.0d;
                        String strI7 = null;
                        String strI8 = null;
                        char cCharAt = 0;
                        while (cVar.B()) {
                            int iN03 = cVar.n0(j.f12276a);
                            if (iN03 == 0) {
                                cCharAt = cVar.I().charAt(0);
                            } else if (iN03 == 1) {
                                cVar.G();
                            } else if (iN03 == 2) {
                                dG = cVar.G();
                            } else if (iN03 == 3) {
                                strI7 = cVar.I();
                            } else if (iN03 == 4) {
                                strI8 = cVar.I();
                            } else if (iN03 != 5) {
                                cVar.o0();
                                cVar.p0();
                            } else {
                                cVar.i();
                                while (cVar.B()) {
                                    if (cVar.n0(j.f12277b) != 0) {
                                        cVar.o0();
                                        cVar.p0();
                                    } else {
                                        cVar.a();
                                        while (cVar.B()) {
                                            arrayList4.add((q5.m) g.a(cVar, jVar2));
                                        }
                                        cVar.l();
                                    }
                                }
                                cVar.m();
                            }
                        }
                        cVar.m();
                        o5.d dVar3 = new o5.d(arrayList4, cCharAt, dG, strI7, strI8);
                        jVar.d(dVar3.hashCode(), dVar3);
                    }
                    cVar.l();
                    f10 = f11;
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
                case 10:
                    cVar.a();
                    while (cVar.B()) {
                        cVar.i();
                        String strI9 = null;
                        float fG4 = 0.0f;
                        float fG5 = 0.0f;
                        while (cVar.B()) {
                            int iN04 = cVar.n0(f12296d);
                            if (iN04 != 0) {
                                f12 = fG;
                                if (iN04 == 1) {
                                    f13 = fG2;
                                    fG3 = fG3;
                                    fG4 = (float) cVar.G();
                                } else if (iN04 != 2) {
                                    cVar.o0();
                                    cVar.p0();
                                } else {
                                    f13 = fG2;
                                    fG3 = fG3;
                                    fG5 = (float) cVar.G();
                                }
                                fG = f12;
                                fG2 = f13;
                            } else {
                                f12 = fG;
                                strI9 = cVar.I();
                            }
                            fG = f12;
                        }
                        cVar.m();
                        arrayList2.add(new o5.h(strI9, fG4, fG5));
                        fG3 = fG3;
                        fG2 = fG2;
                        fG = fG;
                    }
                    f = fG;
                    f4 = fG2;
                    f11 = fG3;
                    cVar.l();
                    f10 = f11;
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
                default:
                    cVar.o0();
                    cVar.p0();
                    f = fG;
                    f4 = fG2;
                    f10 = fG3;
                    fC = f14;
                    fG2 = f4;
                    fG3 = f10;
                    fG = f;
                    break;
            }
        }
        float f17 = fC;
        float f18 = fG;
        Rect rect = new Rect(0, 0, (int) (iG * f17), (int) (iG2 * f17));
        float fC2 = v5.i.c();
        jVar2.f6852k = rect;
        jVar2.f6853l = fG2;
        jVar2.f6854m = fG3;
        jVar2.f6855n = f18;
        jVar2.f6851j = arrayList;
        jVar2.i = gVar;
        jVar2.f6846c = map;
        jVar2.f6847d = map2;
        jVar2.f6848e = fC2;
        jVar2.f6850h = jVar;
        jVar2.f = map3;
        jVar2.f6849g = arrayList2;
        return jVar2;
    }
}
