package a2;

import android.app.ApplicationExitInfo;
import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo f(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder h(db.c1 c1Var) {
        return new RouteDiscoveryPreference.Builder(c1Var, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int i6, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i6, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void y() {
    }
}
