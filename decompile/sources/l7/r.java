package l7;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8297a = f0.V("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f8298b = f0.V("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f8299c = f0.V("list");

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f8300d = f0.V("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0047. Please report as an issue. */
    public static b7.j a(m7.b bVar) {
        float f3;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float c10 = n7.i.c();
        v.i iVar = new v.i();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        v.m mVar = new v.m(0);
        b7.j jVar = new b7.j();
        bVar.f();
        float f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i6 = 0;
        int i10 = 0;
        float f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (bVar.K()) {
            float f20 = c10;
            switch (bVar.h0(f8297a)) {
                case 0:
                    f3 = f17;
                    i6 = (int) bVar.S();
                    c10 = f20;
                    f17 = f3;
                    break;
                case 1:
                    f10 = f18;
                    i10 = (int) bVar.S();
                    c10 = f20;
                    f18 = f10;
                    break;
                case 2:
                    f11 = f19;
                    f18 = (float) bVar.S();
                    c10 = f20;
                    f19 = f11;
                    break;
                case 3:
                    f10 = f18;
                    f19 = ((float) bVar.S()) - 0.01f;
                    c10 = f20;
                    f18 = f10;
                    break;
                case 4:
                    f11 = f19;
                    f17 = (float) bVar.S();
                    c10 = f20;
                    f18 = f18;
                    f19 = f11;
                    break;
                case 5:
                    f3 = f17;
                    f12 = f18;
                    f13 = f19;
                    String[] split = bVar.b0().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        jVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
                case 6:
                    f3 = f17;
                    f12 = f18;
                    f13 = f19;
                    bVar.d();
                    int i11 = 0;
                    while (bVar.K()) {
                        j7.d a10 = q.a(bVar, jVar);
                        if (a10.f7270e == 3) {
                            i11++;
                        }
                        arrayList.add(a10);
                        iVar.h(a10.f7269d, a10);
                        if (i11 > 4) {
                            n7.c.b("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    bVar.l();
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
                case 7:
                    f3 = f17;
                    f12 = f18;
                    f13 = f19;
                    bVar.d();
                    while (bVar.K()) {
                        ArrayList arrayList3 = new ArrayList();
                        v.i iVar2 = new v.i();
                        bVar.f();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i12 = 0;
                        int i13 = 0;
                        while (bVar.K()) {
                            int h02 = bVar.h0(f8298b);
                            if (h02 != 0) {
                                if (h02 != 1) {
                                    if (h02 != 2) {
                                        if (h02 != 3) {
                                            if (h02 != 4) {
                                                if (h02 != 5) {
                                                    bVar.i0();
                                                    bVar.j0();
                                                } else {
                                                    str3 = bVar.b0();
                                                }
                                            } else {
                                                str2 = bVar.b0();
                                            }
                                        } else {
                                            i13 = bVar.a0();
                                        }
                                    } else {
                                        i12 = bVar.a0();
                                    }
                                } else {
                                    bVar.d();
                                    while (bVar.K()) {
                                        j7.d a11 = q.a(bVar, jVar);
                                        iVar2.h(a11.f7269d, a11);
                                        arrayList3.add(a11);
                                    }
                                    bVar.l();
                                }
                            } else {
                                str = bVar.b0();
                            }
                        }
                        bVar.m();
                        if (str2 != null) {
                            hashMap2.put(str, new b7.a0(i12, i13, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList3);
                        }
                    }
                    bVar.l();
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
                case 8:
                    f3 = f17;
                    f12 = f18;
                    float f21 = f19;
                    bVar.f();
                    while (bVar.K()) {
                        if (bVar.h0(f8299c) != 0) {
                            bVar.i0();
                            bVar.j0();
                        } else {
                            bVar.d();
                            while (bVar.K()) {
                                f0 f0Var = k.f8282a;
                                bVar.f();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (bVar.K()) {
                                    int h03 = bVar.h0(k.f8282a);
                                    if (h03 != 0) {
                                        float f22 = f21;
                                        if (h03 != 1) {
                                            if (h03 != 2) {
                                                if (h03 != 3) {
                                                    bVar.i0();
                                                    bVar.j0();
                                                } else {
                                                    bVar.S();
                                                }
                                            } else {
                                                str6 = bVar.b0();
                                            }
                                        } else {
                                            str5 = bVar.b0();
                                        }
                                        f21 = f22;
                                    } else {
                                        str4 = bVar.b0();
                                    }
                                }
                                bVar.m();
                                hashMap3.put(str5, new g7.c(str4, str5, str6));
                                f21 = f21;
                            }
                            bVar.l();
                        }
                    }
                    f13 = f21;
                    bVar.m();
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
                case 9:
                    f3 = f17;
                    f12 = f18;
                    f14 = f19;
                    bVar.d();
                    while (bVar.K()) {
                        f0 f0Var2 = j.f8280a;
                        ArrayList arrayList4 = new ArrayList();
                        bVar.f();
                        double d10 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c11 = 0;
                        while (bVar.K()) {
                            int h04 = bVar.h0(j.f8280a);
                            if (h04 != 0) {
                                if (h04 != 1) {
                                    if (h04 != 2) {
                                        if (h04 != 3) {
                                            if (h04 != 4) {
                                                if (h04 != 5) {
                                                    bVar.i0();
                                                    bVar.j0();
                                                } else {
                                                    bVar.f();
                                                    while (bVar.K()) {
                                                        if (bVar.h0(j.f8281b) != 0) {
                                                            bVar.i0();
                                                            bVar.j0();
                                                        } else {
                                                            bVar.d();
                                                            while (bVar.K()) {
                                                                arrayList4.add((i7.m) g.a(bVar, jVar));
                                                            }
                                                            bVar.l();
                                                        }
                                                    }
                                                    bVar.m();
                                                }
                                            } else {
                                                str8 = bVar.b0();
                                            }
                                        } else {
                                            str7 = bVar.b0();
                                        }
                                    } else {
                                        d10 = bVar.S();
                                    }
                                } else {
                                    bVar.S();
                                }
                            } else {
                                c11 = bVar.b0().charAt(0);
                            }
                        }
                        bVar.m();
                        g7.d dVar = new g7.d(arrayList4, c11, d10, str7, str8);
                        mVar.e(dVar.hashCode(), dVar);
                    }
                    bVar.l();
                    f13 = f14;
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
                case 10:
                    bVar.d();
                    while (bVar.K()) {
                        bVar.f();
                        String str9 = null;
                        float f23 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f24 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (bVar.K()) {
                            int h05 = bVar.h0(f8300d);
                            if (h05 != 0) {
                                f15 = f17;
                                if (h05 != 1) {
                                    if (h05 != 2) {
                                        bVar.i0();
                                        bVar.j0();
                                    } else {
                                        f16 = f18;
                                        f19 = f19;
                                        f24 = (float) bVar.S();
                                    }
                                } else {
                                    f16 = f18;
                                    f19 = f19;
                                    f23 = (float) bVar.S();
                                }
                                f17 = f15;
                                f18 = f16;
                            } else {
                                f15 = f17;
                                str9 = bVar.b0();
                            }
                            f17 = f15;
                        }
                        bVar.m();
                        arrayList2.add(new g7.h(str9, f23, f24));
                        f19 = f19;
                        f18 = f18;
                        f17 = f17;
                    }
                    f3 = f17;
                    f12 = f18;
                    f14 = f19;
                    bVar.l();
                    f13 = f14;
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
                default:
                    bVar.i0();
                    bVar.j0();
                    f3 = f17;
                    f12 = f18;
                    f13 = f19;
                    c10 = f20;
                    f18 = f12;
                    f19 = f13;
                    f17 = f3;
                    break;
            }
        }
        float f25 = c10;
        Rect rect = new Rect(0, 0, (int) (i6 * f25), (int) (i10 * f25));
        float c12 = n7.i.c();
        jVar.f1551k = rect;
        jVar.f1552l = f18;
        jVar.f1553m = f19;
        jVar.f1554n = f17;
        jVar.j = arrayList;
        jVar.f1550i = iVar;
        jVar.f1544c = hashMap;
        jVar.f1545d = hashMap2;
        jVar.f1546e = c12;
        jVar.f1549h = mVar;
        jVar.f1547f = hashMap3;
        jVar.f1548g = arrayList2;
        return jVar;
    }
}
