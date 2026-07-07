package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import v5.o;
import w5.l;
import y5.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1199a = o.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.f().b(f1199a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                l c10 = l.c(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (l.f14110l) {
                    try {
                        c10.f14119i = goAsync;
                        if (c10.f14118h) {
                            goAsync.finish();
                            c10.f14119i = null;
                        }
                    } finally {
                    }
                }
                return;
            } catch (IllegalStateException e10) {
                o.f().e(f1199a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
                return;
            }
        }
        String str = b.A;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
