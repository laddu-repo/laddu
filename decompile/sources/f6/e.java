package f6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public static final String A = v5.o.h("ForceStopRunnable");
    public static final long B = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: x, reason: collision with root package name */
    public final Context f5033x;

    /* renamed from: y, reason: collision with root package name */
    public final w5.l f5034y;

    /* renamed from: z, reason: collision with root package name */
    public int f5035z = 0;

    public e(Context context, w5.l lVar) {
        this.f5033x = context.getApplicationContext();
        this.f5034y = lVar;
    }

    public static void c(Context context) {
        int i6;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (p0.a.a()) {
            i6 = 167772160;
        } else {
            i6 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
        long currentTimeMillis = System.currentTimeMillis() + B;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.e.a():void");
    }

    public final boolean b() {
        v5.b bVar = this.f5034y.f14112b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = A;
        if (isEmpty) {
            v5.o.f().b(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = h.a(this.f5033x, bVar);
        v5.o.f().b(str, "Is default app process = " + a10, new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = A;
        w5.l lVar = this.f5034y;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                w5.k.a(this.f5033x);
                v5.o.f().b(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i6 = this.f5035z + 1;
                    this.f5035z = i6;
                    if (i6 < 3) {
                        long j = i6 * 300;
                        v5.o.f().b(str, "Retrying after " + j, e10);
                        try {
                            Thread.sleep(this.f5035z * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        v5.o.f().e(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        lVar.f14112b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            lVar.d();
        }
    }
}
