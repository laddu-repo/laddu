package h0;

import android.app.Notification;
import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void b(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void c(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void d(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void e(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void f(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
