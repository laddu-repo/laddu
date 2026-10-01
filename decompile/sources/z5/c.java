package z5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import e6.i;
import f6.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import v5.o;
import w5.d;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements d {
    public static final String B = o.h("SystemJobScheduler");
    public final b A;

    /* renamed from: x, reason: collision with root package name */
    public final Context f15218x;

    /* renamed from: y, reason: collision with root package name */
    public final JobScheduler f15219y;

    /* renamed from: z, reason: collision with root package name */
    public final l f15220z;

    public c(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b bVar = new b(context);
        this.f15218x = context;
        this.f15220z = lVar;
        this.f15219y = jobScheduler;
        this.A = bVar;
    }

    public static void a(JobScheduler jobScheduler, int i6) {
        try {
            jobScheduler.cancel(i6);
        } catch (Throwable th) {
            o.f().e(B, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i6)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.content.Context r7, android.app.job.JobScheduler r8, java.lang.String r9) {
        /*
            java.util.ArrayList r7 = e(r7, r8)
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L44
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r4 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r3.getExtras()
            if (r5 == 0) goto L31
            boolean r6 = r5.containsKey(r4)     // Catch: java.lang.NullPointerException -> L30
            if (r6 == 0) goto L31
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.NullPointerException -> L30
            goto L32
        L30:
        L31:
            r4 = r8
        L32:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L13
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            goto L13
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.c(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.f().e(B, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // w5.d
    public final boolean b() {
        return true;
    }

    @Override // w5.d
    public final void d(String str) {
        Context context = this.f15218x;
        JobScheduler jobScheduler = this.f15219y;
        ArrayList c10 = c(context, jobScheduler, str);
        if (c10 != null && !c10.isEmpty()) {
            int size = c10.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = c10.get(i6);
                i6++;
                a(jobScheduler, ((Integer) obj).intValue());
            }
            this.f15220z.f14113c.v().A(str);
        }
    }

    @Override // w5.d
    public final void f(i... iVarArr) {
        int a10;
        ArrayList c10;
        int a11;
        l lVar = this.f15220z;
        WorkDatabase workDatabase = lVar.f14113c;
        f fVar = new f(workDatabase);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i g10 = workDatabase.y().g(iVar.f4371a);
                String str = B;
                if (g10 == null) {
                    o.f().i(str, "Skipping scheduling " + iVar.f4371a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.r();
                } else if (g10.f4372b != 1) {
                    o.f().i(str, "Skipping scheduling " + iVar.f4371a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.r();
                } else {
                    e6.d n10 = workDatabase.v().n(iVar.f4371a);
                    if (n10 != null) {
                        a10 = n10.f4364b;
                    } else {
                        lVar.f14112b.getClass();
                        a10 = fVar.a(lVar.f14112b.f13303g);
                    }
                    if (n10 == null) {
                        lVar.f14113c.v().u(new e6.d(iVar.f4371a, a10));
                    }
                    g(iVar, a10);
                    if (Build.VERSION.SDK_INT == 23 && (c10 = c(this.f15218x, this.f15219y, iVar.f4371a)) != null) {
                        int indexOf = c10.indexOf(Integer.valueOf(a10));
                        if (indexOf >= 0) {
                            c10.remove(indexOf);
                        }
                        if (!c10.isEmpty()) {
                            a11 = ((Integer) c10.get(0)).intValue();
                        } else {
                            lVar.f14112b.getClass();
                            a11 = fVar.a(lVar.f14112b.f13303g);
                        }
                        g(iVar, a11);
                    }
                    workDatabase.r();
                }
            } finally {
                workDatabase.h();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x006f, code lost:
    
        if (r7 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(e6.i r19, int r20) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.g(e6.i, int):void");
    }
}
