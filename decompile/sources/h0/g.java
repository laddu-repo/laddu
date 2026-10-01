package h0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager b(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static void c(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void d(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
