package l7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static v.m f8290b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f8289a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f8291c = f0.V("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f8292d = f0.V("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        int i6;
        WeakReference weakReference;
        Interpolator interpolator;
        Interpolator linearInterpolator;
        pointF.x = n7.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = n7.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = n7.g.b(pointF2.x, -1.0f, 1.0f);
        float b10 = n7.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        float f3 = pointF.x;
        float f10 = pointF.y;
        float f11 = pointF2.x;
        Matrix matrix = n7.i.f9124a;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i6 = (int) (527 * f3);
        } else {
            i6 = 17;
        }
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i6 = (int) (i6 * 31 * f10);
        }
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i6 = (int) (i6 * 31 * f11);
        }
        if (b10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i6 = (int) (i6 * 31 * b10);
        }
        synchronized (o.class) {
            if (f8290b == null) {
                f8290b = new v.m(0);
            }
            weakReference = (WeakReference) f8290b.c(i6);
        }
        if (weakReference != null) {
            interpolator = (Interpolator) weakReference.get();
        } else {
            interpolator = null;
        }
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        try {
            c(i6, new WeakReference(linearInterpolator));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return linearInterpolator;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    public static o7.a b(m7.a aVar, b7.j jVar, float f3, d0 d0Var, boolean z10, boolean z11) {
        Object obj;
        LinearInterpolator a10;
        Interpolator a11;
        Interpolator a12;
        Object obj2;
        o7.a aVar2;
        f0 f0Var;
        f0 f0Var2;
        PointF pointF;
        f0 f0Var3 = f8291c;
        LinearInterpolator linearInterpolator = f8289a;
        if (z10 && z11) {
            aVar.f();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            boolean z12 = false;
            PointF pointF5 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            Object obj3 = null;
            PointF pointF8 = null;
            PointF pointF9 = null;
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Object obj4 = null;
            while (aVar.K()) {
                int h02 = aVar.h0(f0Var3);
                f0 f0Var4 = f8292d;
                LinearInterpolator linearInterpolator2 = linearInterpolator;
                switch (h02) {
                    case 0:
                        f0Var = f0Var3;
                        f10 = (float) aVar.S();
                        linearInterpolator = linearInterpolator2;
                        f0Var3 = f0Var;
                        break;
                    case 1:
                        f0Var = f0Var3;
                        obj3 = d0Var.a(aVar, f3);
                        linearInterpolator = linearInterpolator2;
                        f0Var3 = f0Var;
                        break;
                    case 2:
                        f0Var = f0Var3;
                        obj4 = d0Var.a(aVar, f3);
                        linearInterpolator = linearInterpolator2;
                        f0Var3 = f0Var;
                        break;
                    case 3:
                        f0Var = f0Var3;
                        boolean z13 = z12;
                        Object obj5 = obj3;
                        PointF pointF10 = pointF8;
                        if (aVar.f0() == 3) {
                            aVar.f();
                            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            while (aVar.K()) {
                                int h03 = aVar.h0(f0Var4);
                                if (h03 != 0) {
                                    if (h03 != 1) {
                                        aVar.j0();
                                    } else if (aVar.f0() == 7) {
                                        f14 = (float) aVar.S();
                                        f12 = f14;
                                    } else {
                                        aVar.d();
                                        f12 = (float) aVar.S();
                                        if (aVar.f0() == 7) {
                                            f14 = (float) aVar.S();
                                        } else {
                                            f14 = f12;
                                        }
                                        aVar.l();
                                    }
                                } else if (aVar.f0() == 7) {
                                    f13 = (float) aVar.S();
                                    f11 = f13;
                                } else {
                                    aVar.d();
                                    f11 = (float) aVar.S();
                                    if (aVar.f0() == 7) {
                                        f13 = (float) aVar.S();
                                    } else {
                                        f13 = f11;
                                    }
                                    aVar.l();
                                }
                            }
                            PointF pointF11 = new PointF(f11, f12);
                            pointF8 = new PointF(f13, f14);
                            aVar.m();
                            pointF7 = pointF11;
                        } else {
                            pointF5 = n.b(aVar, f3);
                            pointF8 = pointF10;
                        }
                        z12 = z13;
                        linearInterpolator = linearInterpolator2;
                        obj3 = obj5;
                        f0Var3 = f0Var;
                        break;
                    case 4:
                        boolean z14 = z12;
                        if (aVar.f0() == 3) {
                            aVar.f();
                            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            while (aVar.K()) {
                                Object obj6 = obj3;
                                int h04 = aVar.h0(f0Var4);
                                if (h04 != 0) {
                                    f0Var2 = f0Var3;
                                    if (h04 != 1) {
                                        aVar.j0();
                                    } else if (aVar.f0() == 7) {
                                        f18 = (float) aVar.S();
                                        pointF8 = pointF8;
                                        f16 = f18;
                                    } else {
                                        pointF = pointF8;
                                        aVar.d();
                                        f16 = (float) aVar.S();
                                        if (aVar.f0() == 7) {
                                            f18 = (float) aVar.S();
                                        } else {
                                            f18 = f16;
                                        }
                                        aVar.l();
                                        pointF8 = pointF;
                                    }
                                } else {
                                    f0Var2 = f0Var3;
                                    pointF = pointF8;
                                    if (aVar.f0() == 7) {
                                        f17 = (float) aVar.S();
                                        pointF8 = pointF;
                                        f15 = f17;
                                    } else {
                                        aVar.d();
                                        f15 = (float) aVar.S();
                                        if (aVar.f0() == 7) {
                                            f17 = (float) aVar.S();
                                        } else {
                                            f17 = f15;
                                        }
                                        aVar.l();
                                        pointF8 = pointF;
                                    }
                                }
                                obj3 = obj6;
                                f0Var3 = f0Var2;
                            }
                            f0Var = f0Var3;
                            PointF pointF12 = new PointF(f15, f16);
                            pointF2 = new PointF(f17, f18);
                            aVar.m();
                            pointF9 = pointF12;
                        } else {
                            f0Var = f0Var3;
                            pointF6 = n.b(aVar, f3);
                        }
                        z12 = z14;
                        linearInterpolator = linearInterpolator2;
                        f0Var3 = f0Var;
                        break;
                    case 5:
                        if (aVar.a0() == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 6:
                        pointF3 = n.b(aVar, f3);
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 7:
                        pointF4 = n.b(aVar, f3);
                        linearInterpolator = linearInterpolator2;
                        break;
                    default:
                        aVar.j0();
                        linearInterpolator = linearInterpolator2;
                        break;
                }
            }
            LinearInterpolator linearInterpolator3 = linearInterpolator;
            boolean z15 = z12;
            Object obj7 = obj3;
            PointF pointF13 = pointF8;
            aVar.m();
            if (z15) {
                obj2 = obj7;
            } else {
                if (pointF5 != null && pointF6 != null) {
                    linearInterpolator3 = a(pointF5, pointF6);
                } else if (pointF7 != null && pointF13 != null && pointF9 != null && pointF2 != null) {
                    a11 = a(pointF7, pointF9);
                    a12 = a(pointF13, pointF2);
                    obj2 = obj4;
                    linearInterpolator3 = null;
                    if (a11 == null && a12 != null) {
                        aVar2 = new o7.a(jVar, obj7, obj2, a11, a12, f10);
                    } else {
                        aVar2 = new o7.a(jVar, obj7, obj2, linearInterpolator3, f10, (Float) null);
                    }
                    aVar2.f10025o = pointF3;
                    aVar2.f10026p = pointF4;
                    return aVar2;
                }
                obj2 = obj4;
            }
            a11 = null;
            a12 = null;
            if (a11 == null) {
            }
            aVar2 = new o7.a(jVar, obj7, obj2, linearInterpolator3, f10, (Float) null);
            aVar2.f10025o = pointF3;
            aVar2.f10026p = pointF4;
            return aVar2;
        }
        f0 f0Var5 = f0Var3;
        if (z10) {
            aVar.f();
            PointF pointF14 = null;
            PointF pointF15 = null;
            PointF pointF16 = null;
            PointF pointF17 = null;
            boolean z16 = false;
            Object obj8 = null;
            float f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Object obj9 = null;
            while (aVar.K()) {
                f0 f0Var6 = f0Var5;
                switch (aVar.h0(f0Var6)) {
                    case 0:
                        f0Var5 = f0Var6;
                        f19 = (float) aVar.S();
                        continue;
                    case 1:
                        obj8 = d0Var.a(aVar, f3);
                        break;
                    case 2:
                        obj9 = d0Var.a(aVar, f3);
                        break;
                    case 3:
                        pointF17 = n.b(aVar, 1.0f);
                        break;
                    case 4:
                        pointF14 = n.b(aVar, 1.0f);
                        break;
                    case 5:
                        if (aVar.a0() == 1) {
                            z16 = true;
                            break;
                        } else {
                            z16 = false;
                            break;
                        }
                    case 6:
                        pointF15 = n.b(aVar, f3);
                        break;
                    case 7:
                        pointF16 = n.b(aVar, f3);
                        break;
                    default:
                        aVar.j0();
                        break;
                }
                f0Var5 = f0Var6;
            }
            aVar.m();
            if (z16) {
                obj = obj8;
            } else {
                if (pointF17 != null && pointF14 != null) {
                    a10 = a(pointF17, pointF14);
                    obj = obj9;
                    o7.a aVar3 = new o7.a(jVar, obj8, obj, a10, f19, (Float) null);
                    aVar3.f10025o = pointF15;
                    aVar3.f10026p = pointF16;
                    return aVar3;
                }
                obj = obj9;
            }
            a10 = linearInterpolator;
            o7.a aVar32 = new o7.a(jVar, obj8, obj, a10, f19, (Float) null);
            aVar32.f10025o = pointF15;
            aVar32.f10026p = pointF16;
            return aVar32;
        }
        return new o7.a(d0Var.a(aVar, f3));
    }

    public static void c(int i6, WeakReference weakReference) {
        synchronized (o.class) {
            f8290b.e(i6, weakReference);
        }
    }
}
