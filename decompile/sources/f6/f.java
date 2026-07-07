package f6;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f5036a;

    public /* synthetic */ f(WorkDatabase workDatabase) {
        this.f5036a = workDatabase;
    }

    public int a(int i6) {
        WorkDatabase workDatabase;
        int i10;
        int i11;
        int i12;
        synchronized (f.class) {
            try {
                workDatabase = this.f5036a;
                workDatabase.c();
                Long r10 = workDatabase.u().r("next_job_scheduler_id");
                i10 = 0;
                if (r10 != null) {
                    i11 = r10.intValue();
                } else {
                    i11 = 0;
                }
                if (i11 == Integer.MAX_VALUE) {
                    i12 = 0;
                } else {
                    i12 = i11 + 1;
                }
                workDatabase.u().u(new e6.c("next_job_scheduler_id", i12));
                workDatabase.r();
                workDatabase.h();
                if (i11 >= 0 && i11 <= i6) {
                    i10 = i11;
                }
                this.f5036a.u().u(new e6.c("next_job_scheduler_id", 1));
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            } finally {
            }
        }
        return i10;
    }
}
