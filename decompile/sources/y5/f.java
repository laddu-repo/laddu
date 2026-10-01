package y5;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.j1;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f6.i;
import f6.k;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14996x;

    /* renamed from: y, reason: collision with root package name */
    public final g f14997y;

    public /* synthetic */ f(g gVar, int i6) {
        this.f14996x = i6;
        this.f14997y = gVar;
    }

    private final void a() {
        g gVar;
        f fVar;
        synchronized (this.f14997y.E) {
            g gVar2 = this.f14997y;
            gVar2.F = (Intent) gVar2.E.get(0);
        }
        Intent intent = this.f14997y.F;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f14997y.F.getIntExtra("KEY_START_ID", 0);
            o f3 = o.f();
            String str = g.H;
            int i6 = 1;
            f3.b(str, String.format("Processing command %s, %s", this.f14997y.F, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock a10 = k.a(this.f14997y.f14998x, action + " (" + intExtra + ")");
            try {
                o.f().b(str, "Acquiring operation wake lock (" + action + ") " + a10, new Throwable[0]);
                a10.acquire();
                g gVar3 = this.f14997y;
                gVar3.C.e(gVar3.F, intExtra, gVar3);
                o.f().b(str, "Releasing operation wake lock (" + action + ") " + a10, new Throwable[0]);
                a10.release();
                gVar = this.f14997y;
                fVar = new f(gVar, i6);
            } catch (Throwable th) {
                try {
                    o f10 = o.f();
                    String str2 = g.H;
                    f10.e(str2, "Unexpected error in onHandleIntent", th);
                    o.f().b(str2, "Releasing operation wake lock (" + action + ") " + a10, new Throwable[0]);
                    a10.release();
                    gVar = this.f14997y;
                    fVar = new f(gVar, i6);
                } catch (Throwable th2) {
                    o.f().b(g.H, "Releasing operation wake lock (" + action + ") " + a10, new Throwable[0]);
                    a10.release();
                    g gVar4 = this.f14997y;
                    gVar4.f(new f(gVar4, i6));
                    throw th2;
                }
            }
            gVar.f(fVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14996x) {
            case 0:
                a();
                return;
            default:
                g gVar = this.f14997y;
                o f3 = o.f();
                String str = g.H;
                f3.b(str, "Checking if commands are complete.", new Throwable[0]);
                gVar.b();
                synchronized (gVar.E) {
                    try {
                        if (gVar.F != null) {
                            o.f().b(str, String.format("Removing command %s", gVar.F), new Throwable[0]);
                            if (((Intent) gVar.E.remove(0)).equals(gVar.F)) {
                                gVar.F = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        i iVar = (i) ((j1) gVar.f14999y).f949y;
                        if (!gVar.C.d() && gVar.E.isEmpty() && !iVar.a()) {
                            o.f().b(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = gVar.G;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!gVar.E.isEmpty()) {
                            gVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
