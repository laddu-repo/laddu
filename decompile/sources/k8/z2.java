package k8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends h0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public JobScheduler f7859y;

    @Override // k8.h0
    public final boolean G() {
        return true;
    }

    public final void H(long j8) {
        p1 p1Var = (p1) this.f2053w;
        E();
        D();
        JobScheduler jobScheduler = this.f7859y;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(p1Var.f7692v.getPackageName())).hashCode()) != null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int I = I();
        if (I != 2) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.J.b(j4.a.v(I), "[sgtm] Not eligible for Scion upload");
            return;
        }
        v0 v0Var3 = p1Var.A;
        p1.l(v0Var3);
        v0Var3.J.b(Long.valueOf(j8), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(p1Var.f7692v.getPackageName())).hashCode(), new ComponentName(p1Var.f7692v, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j8).setOverrideDeadline(j8 + j8).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f7859y;
        t7.y.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        v0 v0Var4 = p1Var.A;
        p1.l(v0Var4);
        v0Var4.J.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int I() {
        p1 p1Var = (p1) this.f2053w;
        E();
        D();
        if (this.f7859y == null) {
            return 7;
        }
        Boolean boolQ = p1Var.f7695y.Q("google_analytics_sgtm_upload_enabled");
        if (!(boolQ == null ? false : boolQ.booleanValue())) {
            return 8;
        }
        if (p1Var.q().F < 119000) {
            return 6;
        }
        if (!t4.Z(p1Var.f7692v, "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return !p1Var.o().K() ? 5 : 2;
        }
        return 4;
    }
}
