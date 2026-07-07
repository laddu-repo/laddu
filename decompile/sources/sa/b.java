package sa;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f12281a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f12282b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f12283c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f12284d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f12285e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f12286f = b.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int i6;
        if (colorStateList != null) {
            i6 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i6 = 0;
        }
        return l0.b.d(i6, Math.min(Color.alpha(i6) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 22 && i6 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f12285e, 0)) != 0) {
                Log.w(f12286f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }
}
