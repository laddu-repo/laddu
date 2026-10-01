package i0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public static Intent a(Context context, c2.g gVar, IntentFilter intentFilter) {
        return context.registerReceiver(gVar, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, c2.g gVar, IntentFilter intentFilter) {
        return context.registerReceiver(gVar, intentFilter, null, null, 2);
    }

    public static void c(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
