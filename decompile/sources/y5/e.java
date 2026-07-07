package y5;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e6.i;
import f6.k;
import f6.s;
import java.util.Collections;
import java.util.List;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e implements a6.b, w5.b, s {
    public static final String G = o.h("DelayMetCommandHandler");
    public final g A;
    public final a6.c B;
    public PowerManager.WakeLock E;

    /* renamed from: x, reason: collision with root package name */
    public final Context f14993x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14994y;

    /* renamed from: z, reason: collision with root package name */
    public final String f14995z;
    public boolean F = false;
    public int D = 0;
    public final Object C = new Object();

    public e(Context context, int i6, String str, g gVar) {
        this.f14993x = context;
        this.f14994y = i6;
        this.A = gVar;
        this.f14995z = str;
        this.B = new a6.c(context, gVar.f14999y, this);
    }

    @Override // a6.b
    public final void a(List list) {
        f();
    }

    public final void b() {
        synchronized (this.C) {
            try {
                this.B.d();
                this.A.f15000z.b(this.f14995z);
                PowerManager.WakeLock wakeLock = this.E;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.f().b(G, "Releasing wakelock " + this.E + " for WorkSpec " + this.f14995z, new Throwable[0]);
                    this.E.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w5.b
    public final void c(String str, boolean z10) {
        o.f().b(G, "onExecuted " + str + ", " + z10, new Throwable[0]);
        b();
        int i6 = this.f14994y;
        g gVar = this.A;
        Context context = this.f14993x;
        if (z10) {
            gVar.f(new d6.e(gVar, b.b(context, this.f14995z), i6, 3));
        }
        if (this.F) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.f(new d6.e(gVar, intent, i6, 3));
        }
    }

    public final void d() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f14995z;
        sb2.append(str);
        sb2.append(" (");
        sb2.append(this.f14994y);
        sb2.append(")");
        this.E = k.a(this.f14993x, sb2.toString());
        o f3 = o.f();
        PowerManager.WakeLock wakeLock = this.E;
        String str2 = G;
        f3.b(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.E.acquire();
        i g10 = this.A.B.f14113c.y().g(str);
        if (g10 == null) {
            f();
            return;
        }
        boolean b10 = g10.b();
        this.F = b10;
        if (!b10) {
            o.f().b(str2, r4.a.k("No constraints for ", str), new Throwable[0]);
            e(Collections.singletonList(str));
        } else {
            this.B.c(Collections.singletonList(g10));
        }
    }

    @Override // a6.b
    public final void e(List list) {
        if (!list.contains(this.f14995z)) {
            return;
        }
        synchronized (this.C) {
            try {
                if (this.D == 0) {
                    this.D = 1;
                    o.f().b(G, "onAllConstraintsMet for " + this.f14995z, new Throwable[0]);
                    if (this.A.A.h(this.f14995z, null)) {
                        this.A.f15000z.a(this.f14995z, this);
                    } else {
                        b();
                    }
                } else {
                    o.f().b(G, "Already started work for " + this.f14995z, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.C) {
            try {
                if (this.D < 2) {
                    this.D = 2;
                    o f3 = o.f();
                    String str = G;
                    f3.b(str, "Stopping work for WorkSpec " + this.f14995z, new Throwable[0]);
                    Context context = this.f14993x;
                    String str2 = this.f14995z;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.A;
                    gVar.f(new d6.e(gVar, intent, this.f14994y, 3));
                    if (this.A.A.e(this.f14995z)) {
                        o.f().b(str, "WorkSpec " + this.f14995z + " needs to be rescheduled", new Throwable[0]);
                        Intent b10 = b.b(this.f14993x, this.f14995z);
                        g gVar2 = this.A;
                        gVar2.f(new d6.e(gVar2, b10, this.f14994y, 3));
                    } else {
                        o.f().b(str, "Processor does not have WorkSpec " + this.f14995z + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    o.f().b(G, "Already stopped work for " + this.f14995z, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
