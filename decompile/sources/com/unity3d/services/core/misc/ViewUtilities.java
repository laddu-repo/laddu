package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.core.log.DeviceLog;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ViewUtilities {
    public static float dpFromPx(Context context, float f3) {
        return f3 / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(Context context, float f3) {
        return f3 * context.getResources().getDisplayMetrics().density;
    }

    public static void removeViewFromParent(View view) {
        if (view != null && view.getParent() != null) {
            try {
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception e10) {
                DeviceLog.exception("Error while removing view from it's parent", e10);
            }
        }
    }

    public static void setBackground(View view, Drawable drawable) {
        try {
            View.class.getMethod("setBackground", Drawable.class).invoke(view, drawable);
        } catch (Exception e10) {
            DeviceLog.exception("Couldn't run".concat("setBackground"), e10);
        }
    }
}
