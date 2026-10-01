package androidx.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.z0;
import com.playfy.tv.R;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x0 {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable b(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(int i6, int i10, int i11) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i6, i10, i11);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ MediaSession f(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* bridge */ /* synthetic */ List h(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        return videoCapabilities.getSupportedPerformancePoints();
    }

    public static /* synthetic */ void i() {
    }

    public static /* bridge */ /* synthetic */ void j(Activity activity, z0.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static /* bridge */ /* synthetic */ void s(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, R.attr.coordinatorLayoutStyle, 0);
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean x(MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint2) {
        return performancePoint.covers(performancePoint2);
    }
}
