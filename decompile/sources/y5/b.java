package y5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.j1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e6.i;
import java.util.ArrayList;
import java.util.HashMap;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements w5.b {
    public static final String A = o.h("CommandHandler");

    /* renamed from: x, reason: collision with root package name */
    public final Context f14986x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f14987y = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public final Object f14988z = new Object();

    public b(Context context) {
        this.f14986x = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // w5.b
    public final void c(String str, boolean z10) {
        synchronized (this.f14988z) {
            try {
                w5.b bVar = (w5.b) this.f14987y.remove(str);
                if (bVar != null) {
                    bVar.c(str, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f14988z) {
            z10 = !this.f14987y.isEmpty();
        }
        return z10;
    }

    public final void e(Intent intent, int i6, g gVar) {
        boolean z10;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.f().b(A, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f14986x;
            d dVar = new d(context, i6, gVar);
            a6.c cVar = dVar.f14992b;
            ArrayList d10 = gVar.B.f14113c.y().d();
            String str = c.f14989a;
            int size = d10.size();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = d10.get(i10);
                i10++;
                v5.c cVar2 = ((i) obj).j;
                z11 |= cVar2.f13309d;
                z12 |= cVar2.f13307b;
                z13 |= cVar2.f13310e;
                if (cVar2.f13306a != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z14 |= z10;
                if (z11 && z12 && z13 && z14) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1198a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
            context.sendBroadcast(intent2);
            cVar.c(d10);
            ArrayList arrayList = new ArrayList(d10.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = d10.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = d10.get(i11);
                i11++;
                i iVar = (i) obj2;
                String str3 = iVar.f4371a;
                if (currentTimeMillis >= iVar.a() && (!iVar.b() || cVar.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                String str4 = ((i) obj3).f4371a;
                Intent a10 = a(context, str4);
                o.f().b(d.f14990c, h8.c.m("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.f(new d6.e(gVar, a10, dVar.f14991a, 3));
            }
            cVar.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.f().b(A, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i6)), new Throwable[0]);
            gVar.B.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                Context context2 = this.f14986x;
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                o f3 = o.f();
                String str5 = A;
                f3.b(str5, r4.a.k("Handling schedule work for ", string), new Throwable[0]);
                l lVar = gVar.B;
                WorkDatabase workDatabase = lVar.f14113c;
                workDatabase.c();
                try {
                    i g10 = workDatabase.y().g(string);
                    if (g10 == null) {
                        o.f().i(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                        return;
                    }
                    if (h8.c.e(g10.f4372b)) {
                        o.f().i(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                        return;
                    }
                    long a11 = g10.a();
                    if (!g10.b()) {
                        o.f().b(str5, "Setting up Alarms for " + string + " at " + a11, new Throwable[0]);
                        a.b(context2, lVar, string, a11);
                    } else {
                        o.f().b(str5, "Opportunistically setting an alarm for " + string + " at " + a11, new Throwable[0]);
                        a.b(context2, lVar, string, a11);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        gVar.f(new d6.e(gVar, intent3, i6, 3));
                    }
                    workDatabase.r();
                    return;
                } finally {
                    workDatabase.h();
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f14988z) {
                    try {
                        String string2 = extras2.getString("KEY_WORKSPEC_ID");
                        o f10 = o.f();
                        String str6 = A;
                        f10.b(str6, "Handing delay met for " + string2, new Throwable[0]);
                        if (!this.f14987y.containsKey(string2)) {
                            e eVar = new e(this.f14986x, i6, string2, gVar);
                            this.f14987y.put(string2, eVar);
                            eVar.d();
                        } else {
                            o.f().b(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        }
                    } finally {
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                o.f().b(A, r4.a.k("Handing stopWork work for ", string3), new Throwable[0]);
                gVar.B.g(string3);
                Context context3 = this.f14986x;
                l lVar2 = gVar.B;
                String str7 = a.f14985a;
                j1 v10 = lVar2.f14113c.v();
                e6.d n10 = v10.n(string3);
                if (n10 != null) {
                    a.a(n10.f4364b, context3, string3);
                    o.f().b(a.f14985a, h8.c.m("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                    v10.A(string3);
                }
                gVar.c(string3, false);
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z15 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                o.f().b(A, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i6)), new Throwable[0]);
                c(string4, z15);
                return;
            }
            o.f().i(A, String.format("Ignoring intent %s", intent), new Throwable[0]);
            return;
        }
        o.f().e(A, h8.c.m("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
    }
}
