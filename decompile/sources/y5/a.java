package y5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.j1;
import androidx.work.impl.WorkDatabase;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14985a = o.h("Alarms");

    public static void a(int i6, Context context, String str) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent a10 = b.a(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 603979776;
        } else {
            i10 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i6, a10, i10);
        if (service != null && alarmManager != null) {
            o.f().b(f14985a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i6 + ")", new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, l lVar, String str, long j) {
        int i6;
        WorkDatabase workDatabase = lVar.f14113c;
        j1 v10 = workDatabase.v();
        e6.d n10 = v10.n(str);
        if (n10 != null) {
            a(n10.f4364b, context, str);
            c(context, str, n10.f4364b, j);
            return;
        }
        synchronized (f6.f.class) {
            workDatabase.c();
            try {
                Long r10 = workDatabase.u().r("next_alarm_manager_id");
                int i10 = 0;
                if (r10 != null) {
                    i6 = r10.intValue();
                } else {
                    i6 = 0;
                }
                if (i6 != Integer.MAX_VALUE) {
                    i10 = i6 + 1;
                }
                workDatabase.u().u(new e6.c("next_alarm_manager_id", i10));
                workDatabase.r();
                workDatabase.h();
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            }
        }
        v10.u(new e6.d(str, i6));
        c(context, str, i6, j);
    }

    public static void c(Context context, String str, int i6, long j) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i6, b.a(context, str), i10);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
