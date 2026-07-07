package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10215a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10216b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10217c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10218d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10219e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f10220f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f10221g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(h.a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i6) {
        ColorStateList d10 = d(context, i6);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f10216b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f10215a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        return l0.b.d(c(context, i6), Math.round(Color.alpha(r4) * f3));
    }

    public static int c(Context context, int i6) {
        int[] iArr = f10221g;
        iArr[0] = i6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i6) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f10221g;
        iArr[0] = i6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = i0.f.d(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
