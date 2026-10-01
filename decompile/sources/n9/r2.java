package n9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r2 extends g0 {
    public JobScheduler A;

    @Override // n9.g0
    public final boolean g1() {
        return true;
    }

    public final void h1(long j) {
        String str;
        JobInfo pendingJob;
        n1 n1Var = (n1) this.f4301y;
        e1();
        d1();
        JobScheduler jobScheduler = this.A;
        if (jobScheduler != null) {
            pendingJob = jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(n1Var.f9413x.getPackageName())).hashCode());
            if (pendingJob != null) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.L.a("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        int i12 = i1();
        if (i12 == 2) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.L.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
            JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(n1Var.f9413x.getPackageName())).hashCode(), new ComponentName(n1Var.f9413x, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
            JobScheduler jobScheduler2 = this.A;
            w8.x.g(jobScheduler2);
            int schedule = jobScheduler2.schedule(build);
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            s0 s0Var = u0Var3.L;
            if (schedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            s0Var.b(str, "[sgtm] Scion upload job scheduled with result");
            return;
        }
        u0 u0Var4 = n1Var.C;
        n1.g(u0Var4);
        u0Var4.L.b(r4.a.y(i12), "[sgtm] Not eligible for Scion upload");
    }

    public final int i1() {
        boolean booleanValue;
        n1 n1Var = (n1) this.f4301y;
        e1();
        d1();
        if (this.A != null) {
            Boolean p12 = n1Var.A.p1("google_analytics_sgtm_upload_enabled");
            if (p12 == null) {
                booleanValue = false;
            } else {
                booleanValue = p12.booleanValue();
            }
            if (booleanValue) {
                if (n1Var.l().H >= 119000) {
                    if (!j4.x1(n1Var.f9413x, "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        return 3;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (!n1Var.j().k1()) {
                            return 5;
                        }
                        return 2;
                    }
                    return 4;
                }
                return 6;
            }
            return 8;
        }
        return 7;
    }
}
