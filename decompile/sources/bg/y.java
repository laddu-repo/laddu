package bg;

import android.app.NotificationChannel;
import android.app.PictureInPictureParams;
import android.content.res.Configuration;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static /* synthetic */ NotificationChannel B(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* bridge */ /* synthetic */ int a(Configuration configuration) {
        return configuration.colorMode;
    }

    public static /* synthetic */ NotificationChannel f(String str) {
        return new NotificationChannel("com.playfy.tv-channel", str, 4);
    }

    public static /* synthetic */ PictureInPictureParams.Builder h() {
        return new PictureInPictureParams.Builder();
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void r(Configuration configuration, int i6) {
        configuration.colorMode = i6;
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
