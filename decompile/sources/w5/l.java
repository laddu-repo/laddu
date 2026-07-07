package w5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.j1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.playfy.tv.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v5.o;
import v5.u;
import x4.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends u {
    public static l j;

    /* renamed from: k, reason: collision with root package name */
    public static l f14109k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f14110l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14111a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.b f14112b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f14113c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f14114d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14115e;

    /* renamed from: f, reason: collision with root package name */
    public final c f14116f;

    /* renamed from: g, reason: collision with root package name */
    public final f6.f f14117g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14118h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f14119i;

    static {
        o.h("WorkManagerImpl");
        j = null;
        f14109k = null;
        f14110l = new Object();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [g8.j, java.lang.Object] */
    public l(Context context, v5.b bVar, j1 j1Var) {
        t c10;
        d dVar;
        boolean isDeviceProtectedStorage;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        f6.i executor = (f6.i) j1Var.f949y;
        int i6 = WorkDatabase.f1190m;
        d dVar2 = null;
        if (z10) {
            kotlin.jvm.internal.k.e(context2, "context");
            c10 = new t(context2, WorkDatabase.class, null);
            c10.f14649i = true;
        } else {
            String str = k.f14107a;
            c10 = x4.c.c(context2, WorkDatabase.class, "androidx.work.workdb");
            ?? obj = new Object();
            obj.f5542x = context2;
            c10.f14648h = obj;
        }
        kotlin.jvm.internal.k.e(executor, "executor");
        c10.f14646f = executor;
        c10.f14644d.add(new Object());
        c10.a(j.f14100a);
        c10.a(new i(context2, 2, 3));
        c10.a(j.f14101b);
        c10.a(j.f14102c);
        c10.a(new i(context2, 5, 6));
        c10.a(j.f14103d);
        c10.a(j.f14104e);
        c10.a(j.f14105f);
        c10.a(new i(context2));
        c10.a(new i(context2, 10, 11));
        c10.a(j.f14106g);
        c10.f14655p = false;
        c10.f14656q = true;
        WorkDatabase workDatabase = (WorkDatabase) c10.b();
        Context applicationContext = context.getApplicationContext();
        o oVar = new o(bVar.f13302f);
        synchronized (o.class) {
            o.f13329y = oVar;
        }
        String str2 = e.f14090a;
        if (Build.VERSION.SDK_INT >= 23) {
            dVar = new z5.c(applicationContext, this);
            f6.g.a(applicationContext, SystemJobService.class, true);
            o.f().b(str2, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        } else {
            try {
                d dVar3 = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext);
                o.f().b(str2, "Created androidx.work.impl.background.gcm.GcmScheduler", new Throwable[0]);
                dVar2 = dVar3;
            } catch (Throwable th) {
                o.f().b(str2, "Unable to create GCM Scheduler", th);
            }
            if (dVar2 == null) {
                dVar = new y5.h(applicationContext);
                f6.g.a(applicationContext, SystemAlarmService.class, true);
                o.f().b(str2, "Created SystemAlarmScheduler", new Throwable[0]);
            } else {
                dVar = dVar2;
            }
        }
        List asList = Arrays.asList(dVar, new x5.b(applicationContext, bVar, j1Var, this));
        c cVar = new c(context, bVar, j1Var, workDatabase, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.f14111a = applicationContext2;
        this.f14112b = bVar;
        this.f14114d = j1Var;
        this.f14113c = workDatabase;
        this.f14115e = asList;
        this.f14116f = cVar;
        this.f14117g = new f6.f(workDatabase);
        this.f14118h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext2.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        this.f14114d.k(new f6.e(applicationContext2, this));
    }

    public static l b() {
        synchronized (f14110l) {
            try {
                l lVar = j;
                if (lVar != null) {
                    return lVar;
                }
                return f14109k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static l c(Context context) {
        l b10;
        synchronized (f14110l) {
            try {
                b10 = b();
                if (b10 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b10;
    }

    public final void d() {
        synchronized (f14110l) {
            try {
                this.f14118h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f14119i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f14119i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList e10;
        if (Build.VERSION.SDK_INT >= 23) {
            String str = z5.c.B;
            Context context = this.f14111a;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (e10 = z5.c.e(context, jobScheduler)) != null && !e10.isEmpty()) {
                int size = e10.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = e10.get(i6);
                    i6++;
                    z5.c.a(jobScheduler, ((JobInfo) obj).getId());
                }
            }
        }
        WorkDatabase workDatabase = this.f14113c;
        e6.j y9 = workDatabase.y();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) y9.f4388a;
        workDatabase_Impl.b();
        e6.e eVar = (e6.e) y9.f4396i;
        i5.j a10 = eVar.a();
        workDatabase_Impl.c();
        try {
            a10.d();
            workDatabase_Impl.r();
            workDatabase_Impl.h();
            eVar.c(a10);
            e.a(this.f14112b, workDatabase, this.f14115e);
        } catch (Throwable th) {
            workDatabase_Impl.h();
            eVar.c(a10);
            throw th;
        }
    }

    public final void f(String str, n9.j jVar) {
        d6.b bVar = new d6.b(1);
        bVar.f3823z = this;
        bVar.f3822y = str;
        bVar.A = jVar;
        this.f14114d.k(bVar);
    }

    public final void g(String str) {
        this.f14114d.k(new f6.j(this, str, false));
    }
}
