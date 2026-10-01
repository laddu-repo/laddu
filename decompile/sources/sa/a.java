package sa;

import a8.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.playfy.tv.R;
import i0.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    public static Drawable b(Context context, int i6) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i6, i6, i6, i6);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue o10 = g.o(context, R.attr.colorControlHighlight);
        if (o10 != null) {
            int i10 = o10.resourceId;
            if (i10 != 0) {
                colorStateList = f.d(context, i10);
            } else {
                colorStateList = ColorStateList.valueOf(o10.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, null, insetDrawable);
    }
}
