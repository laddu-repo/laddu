package y5;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f6.k;
import f6.u;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements w5.b {
    public static final String H = o.h("SystemAlarmDispatcher");
    public final w5.c A;
    public final l B;
    public final b C;
    public final Handler D;
    public final ArrayList E;
    public Intent F;
    public SystemAlarmService G;

    /* renamed from: x, reason: collision with root package name */
    public final Context f14998x;

    /* renamed from: y, reason: collision with root package name */
    public final h6.a f14999y;

    /* renamed from: z, reason: collision with root package name */
    public final u f15000z;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f14998x = applicationContext;
        this.C = new b(applicationContext);
        this.f15000z = new u();
        l c10 = l.c(systemAlarmService);
        this.B = c10;
        w5.c cVar = c10.f14116f;
        this.A = cVar;
        this.f14999y = c10.f14114d;
        cVar.a(this);
        this.E = new ArrayList();
        this.F = null;
        this.D = new Handler(Looper.getMainLooper());
    }

    public final void a(int i6, Intent intent) {
        o f3 = o.f();
        String str = H;
        f3.b(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i6)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.f().i(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i6);
        synchronized (this.E) {
            try {
                boolean isEmpty = this.E.isEmpty();
                this.E.add(intent);
                if (isEmpty) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.D.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // w5.b
    public final void c(String str, boolean z10) {
        String str2 = b.A;
        Intent intent = new Intent(this.f14998x, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        f(new d6.e(this, intent, 0, 3));
    }

    public final boolean d() {
        b();
        synchronized (this.E) {
            try {
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        o.f().b(H, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.A.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f15000z.f5069a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.G = null;
    }

    public final void f(Runnable runnable) {
        this.D.post(runnable);
    }

    public final void g() {
        b();
        PowerManager.WakeLock a10 = k.a(this.f14998x, "ProcessCommand");
        try {
            a10.acquire();
            this.B.f14114d.k(new f(this, 0));
        } finally {
            a10.release();
        }
    }
}
