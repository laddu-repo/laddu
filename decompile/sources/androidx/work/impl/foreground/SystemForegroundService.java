package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.i0;
import androidx.lifecycle.j1;
import d6.b;
import d6.c;
import f6.a;
import java.util.UUID;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SystemForegroundService extends i0 {
    public static final String C = o.h("SystemFgService");
    public c A;
    public NotificationManager B;

    /* renamed from: y, reason: collision with root package name */
    public Handler f1206y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1207z;

    public final void a() {
        this.f1206y = new Handler(Looper.getMainLooper());
        this.B = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.A = cVar;
        if (cVar.F != null) {
            o.f().e(c.G, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.F = this;
        }
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.i0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.A.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        super.onStartCommand(intent, i6, i10);
        boolean z10 = this.f1207z;
        String str = C;
        int i11 = 0;
        if (z10) {
            o.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.A.g();
            a();
            this.f1207z = false;
        }
        if (intent != null) {
            c cVar = this.A;
            l lVar = cVar.f3824x;
            String str2 = c.G;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                o.f().g(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                ((j1) cVar.f3825y).k(new b(cVar, lVar.f14113c, stringExtra, i11));
                cVar.f(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                cVar.f(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                o.f().g(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                    UUID fromString = UUID.fromString(stringExtra2);
                    lVar.getClass();
                    lVar.f14114d.k(new a(lVar, fromString));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                o.f().g(str2, "Stopping foreground service", new Throwable[0]);
                SystemForegroundService systemForegroundService = cVar.F;
                if (systemForegroundService != null) {
                    systemForegroundService.f1207z = true;
                    o.f().b(str, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
