package d;

import android.app.ActivityOptions;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i6) {
        return velocityTracker.getAxisVelocity(i6);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i6, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i6, i10, i11);
    }

    public static int f(ViewConfiguration viewConfiguration, int i6, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i6, i10, i11);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float h(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void i(TextView textView, int i6, float f3) {
        textView.setLineHeight(i6, f3);
    }

    public static void j(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static int k(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float l(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float m(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
