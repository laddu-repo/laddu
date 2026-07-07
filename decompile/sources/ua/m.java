package ua;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: m, reason: collision with root package name */
    public static final j f13014m = new j(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public k6.e f13015a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public k6.e f13016b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public k6.e f13017c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public k6.e f13018d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public d f13019e = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: f, reason: collision with root package name */
    public d f13020f = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: g, reason: collision with root package name */
    public d f13021g = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: h, reason: collision with root package name */
    public d f13022h = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: i, reason: collision with root package name */
    public f f13023i;
    public f j;

    /* renamed from: k, reason: collision with root package name */
    public f f13024k;

    /* renamed from: l, reason: collision with root package name */
    public f f13025l;

    /* JADX WARN: Type inference failed for: r0v0, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k6.e, java.lang.Object] */
    public m() {
        int i6 = 0;
        this.f13023i = new f(i6);
        this.j = new f(i6);
        this.f13024k = new f(i6);
        this.f13025l = new f(i6);
    }

    public static l a(Context context, int i6, int i10) {
        return b(context, i6, i10, new a(0));
    }

    public static l b(Context context, int i6, int i10, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i6);
        if (i10 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i10, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(t9.a.J);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            d d10 = d(obtainStyledAttributes, 5, dVar);
            d d11 = d(obtainStyledAttributes, 8, d10);
            d d12 = d(obtainStyledAttributes, 9, d10);
            d d13 = d(obtainStyledAttributes, 7, d10);
            d d14 = d(obtainStyledAttributes, 6, d10);
            l lVar = new l();
            lVar.f13003a = lg.c.f(i12);
            lVar.f13007e = d11;
            lVar.f13004b = lg.c.f(i13);
            lVar.f13008f = d12;
            lVar.f13005c = lg.c.f(i14);
            lVar.f13009g = d13;
            lVar.f13006d = lg.c.f(i15);
            lVar.f13010h = d14;
            return lVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static l c(Context context, AttributeSet attributeSet, int i6, int i10) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.C, i6, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i6, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i6);
        if (peekValue != null) {
            int i10 = peekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new j(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        if ((this.f13016b instanceof k) && (this.f13015a instanceof k) && (this.f13017c instanceof k) && (this.f13018d instanceof k)) {
            return true;
        }
        return false;
    }

    public final boolean f(RectF rectF) {
        boolean z10;
        boolean z11;
        if (this.f13025l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.f13023i.getClass().equals(f.class) && this.f13024k.getClass().equals(f.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f13019e.a(rectF);
        if (this.f13020f.a(rectF) == a10 && this.f13022h.a(rectF) == a10 && this.f13021g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11 || !e()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ua.l] */
    public final l g() {
        ?? obj = new Object();
        obj.f13003a = this.f13015a;
        obj.f13004b = this.f13016b;
        obj.f13005c = this.f13017c;
        obj.f13006d = this.f13018d;
        obj.f13007e = this.f13019e;
        obj.f13008f = this.f13020f;
        obj.f13009g = this.f13021g;
        obj.f13010h = this.f13022h;
        obj.f13011i = this.f13023i;
        obj.j = this.j;
        obj.f13012k = this.f13024k;
        obj.f13013l = this.f13025l;
        return obj;
    }

    public final String toString() {
        return "[" + this.f13019e + ", " + this.f13020f + ", " + this.f13021g + ", " + this.f13022h + "]";
    }
}
