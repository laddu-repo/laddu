package o7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import b7.j;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f10012a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10013b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10014c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f10015d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f10016e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f10017f;

    /* renamed from: g, reason: collision with root package name */
    public final float f10018g;

    /* renamed from: h, reason: collision with root package name */
    public Float f10019h;

    /* renamed from: i, reason: collision with root package name */
    public float f10020i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f10021k;

    /* renamed from: l, reason: collision with root package name */
    public int f10022l;

    /* renamed from: m, reason: collision with root package name */
    public float f10023m;

    /* renamed from: n, reason: collision with root package name */
    public float f10024n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f10025o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f10026p;

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, float f3, Float f10) {
        this.f10020i = -3987645.8f;
        this.j = -3987645.8f;
        this.f10021k = 784923401;
        this.f10022l = 784923401;
        this.f10023m = Float.MIN_VALUE;
        this.f10024n = Float.MIN_VALUE;
        this.f10025o = null;
        this.f10026p = null;
        this.f10012a = jVar;
        this.f10013b = obj;
        this.f10014c = obj2;
        this.f10015d = interpolator;
        this.f10016e = null;
        this.f10017f = null;
        this.f10018g = f3;
        this.f10019h = f10;
    }

    public final float a() {
        if (this.f10012a == null) {
            return 1.0f;
        }
        if (this.f10024n == Float.MIN_VALUE) {
            if (this.f10019h == null) {
                this.f10024n = 1.0f;
            } else {
                this.f10024n = (float) (b() + ((this.f10019h.floatValue() - this.f10018g) / (r1.f1553m - r1.f1552l)));
            }
        }
        return this.f10024n;
    }

    public final float b() {
        j jVar = this.f10012a;
        if (jVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.f10023m == Float.MIN_VALUE) {
            float f3 = jVar.f1552l;
            this.f10023m = (this.f10018g - f3) / (jVar.f1553m - f3);
        }
        return this.f10023m;
    }

    public final boolean c() {
        if (this.f10015d == null && this.f10016e == null && this.f10017f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f10013b + ", endValue=" + this.f10014c + ", startFrame=" + this.f10018g + ", endFrame=" + this.f10019h + ", interpolator=" + this.f10015d + '}';
    }

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f3) {
        this.f10020i = -3987645.8f;
        this.j = -3987645.8f;
        this.f10021k = 784923401;
        this.f10022l = 784923401;
        this.f10023m = Float.MIN_VALUE;
        this.f10024n = Float.MIN_VALUE;
        this.f10025o = null;
        this.f10026p = null;
        this.f10012a = jVar;
        this.f10013b = obj;
        this.f10014c = obj2;
        this.f10015d = null;
        this.f10016e = interpolator;
        this.f10017f = interpolator2;
        this.f10018g = f3;
        this.f10019h = null;
    }

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f3, Float f10) {
        this.f10020i = -3987645.8f;
        this.j = -3987645.8f;
        this.f10021k = 784923401;
        this.f10022l = 784923401;
        this.f10023m = Float.MIN_VALUE;
        this.f10024n = Float.MIN_VALUE;
        this.f10025o = null;
        this.f10026p = null;
        this.f10012a = jVar;
        this.f10013b = obj;
        this.f10014c = obj2;
        this.f10015d = interpolator;
        this.f10016e = interpolator2;
        this.f10017f = interpolator3;
        this.f10018g = f3;
        this.f10019h = f10;
    }

    public a(Object obj) {
        this.f10020i = -3987645.8f;
        this.j = -3987645.8f;
        this.f10021k = 784923401;
        this.f10022l = 784923401;
        this.f10023m = Float.MIN_VALUE;
        this.f10024n = Float.MIN_VALUE;
        this.f10025o = null;
        this.f10026p = null;
        this.f10012a = null;
        this.f10013b = obj;
        this.f10014c = obj;
        this.f10015d = null;
        this.f10016e = null;
        this.f10017f = null;
        this.f10018g = Float.MIN_VALUE;
        this.f10019h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(i7.c cVar, i7.c cVar2) {
        this.f10020i = -3987645.8f;
        this.j = -3987645.8f;
        this.f10021k = 784923401;
        this.f10022l = 784923401;
        this.f10023m = Float.MIN_VALUE;
        this.f10024n = Float.MIN_VALUE;
        this.f10025o = null;
        this.f10026p = null;
        this.f10012a = null;
        this.f10013b = cVar;
        this.f10014c = cVar2;
        this.f10015d = null;
        this.f10016e = null;
        this.f10017f = null;
        this.f10018g = Float.MIN_VALUE;
        this.f10019h = Float.valueOf(Float.MAX_VALUE);
    }
}
