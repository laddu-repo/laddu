package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import v5.o;
import w5.b;
import w5.l;
import w8.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: z, reason: collision with root package name */
    public static final String f1202z = o.h("SystemJobService");

    /* renamed from: x, reason: collision with root package name */
    public l f1203x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f1204y = new HashMap();

    @Override // w5.b
    public final void c(String str, boolean z10) {
        JobParameters jobParameters;
        o.f().b(f1202z, k.c(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f1204y) {
            jobParameters = (JobParameters) this.f1204y.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l c10 = l.c(getApplicationContext());
            this.f1203x = c10;
            c10.f14116f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                o.f().i(f1202z, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f1203x;
        if (lVar != null) {
            lVar.f14116f.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            w5.l r2 = r9.f1203x
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            v5.o r0 = v5.o.f()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f1202z
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.b(r1, r2, r5)
            r9.jobFinished(r10, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            r5 = 0
            android.os.PersistableBundle r6 = r10.getExtras()     // Catch: java.lang.NullPointerException -> L2f
            if (r6 == 0) goto L30
            boolean r7 = r6.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2f
            if (r7 == 0) goto L30
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.NullPointerException -> L2f
            goto L31
        L2f:
        L30:
            r2 = r5
        L31:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L45
            v5.o r10 = v5.o.f()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f1202z
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r10.e(r0, r1, r2)
            return r4
        L45:
            java.util.HashMap r6 = r9.f1204y
            monitor-enter(r6)
            java.util.HashMap r7 = r9.f1204y     // Catch: java.lang.Throwable -> L69
            boolean r7 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L6b
            v5.o r10 = v5.o.f()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f1202z     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L69
            r3.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L69
            r10.b(r0, r1, r2)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            return r4
        L69:
            r10 = move-exception
            goto Lc3
        L6b:
            v5.o r1 = v5.o.f()     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.f1202z     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r8.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L69
            r1.b(r7, r0, r4)     // Catch: java.lang.Throwable -> L69
            java.util.HashMap r0 = r9.f1204y     // Catch: java.lang.Throwable -> L69
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lbd
            n9.j r5 = new n9.j
            r5.<init>()
            android.net.Uri[] r1 = z5.a.e(r10)
            if (r1 == 0) goto La3
            android.net.Uri[] r1 = z5.a.e(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.f9356z = r1
        La3:
            java.lang.String[] r1 = z5.a.f(r10)
            if (r1 == 0) goto Lb3
            java.lang.String[] r1 = z5.a.f(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.f9355y = r1
        Lb3:
            r1 = 28
            if (r0 < r1) goto Lbd
            android.net.Network r10 = u5.k.a(r10)
            r5.A = r10
        Lbd:
            w5.l r10 = r9.f1203x
            r10.f(r2, r5)
            return r3
        Lc3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            w5.l r0 = r5.f1203x
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            v5.o r6 = v5.o.f()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f1202z
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r6.b(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r6 == 0) goto L27
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3c
            v5.o r6 = v5.o.f()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f1202z
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.e(r0, r1, r3)
            return r2
        L3c:
            v5.o r0 = v5.o.f()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f1202z
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = r4.a.k(r4, r6)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.b(r3, r4, r2)
            java.util.HashMap r0 = r5.f1204y
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f1204y     // Catch: java.lang.Throwable -> L65
            r2.remove(r6)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            w5.l r0 = r5.f1203x
            r0.g(r6)
            w5.l r0 = r5.f1203x
            w5.c r0 = r0.f14116f
            boolean r6 = r0.d(r6)
            r6 = r6 ^ r1
            return r6
        L65:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
