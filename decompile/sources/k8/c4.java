package k8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.internal.measurement.r6;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends h4 {
    public v3 A;
    public Integer B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AlarmManager f7433z;

    public c4(n4 n4Var) {
        super(n4Var);
        this.f7433z = (AlarmManager) ((p1) this.f2053w).f7692v.getSystemService("alarm");
    }

    @Override // k8.h4
    public final void G() {
        AlarmManager alarmManager = this.f7433z;
        if (alarmManager != null) {
            alarmManager.cancel(L());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            J();
        }
    }

    public final o H() {
        if (this.A == null) {
            this.A = new v3(this, this.f7447x.G, 1);
        }
        return this.A;
    }

    public final void I() {
        E();
        v0 v0Var = ((p1) this.f2053w).A;
        p1.l(v0Var);
        v0Var.J.a("Unscheduling upload");
        AlarmManager alarmManager = this.f7433z;
        if (alarmManager != null) {
            alarmManager.cancel(L());
        }
        H().c();
        if (Build.VERSION.SDK_INT >= 24) {
            J();
        }
    }

    public final void J() {
        JobScheduler jobScheduler = (JobScheduler) ((p1) this.f2053w).f7692v.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(K());
        }
    }

    public final int K() {
        if (this.B == null) {
            this.B = Integer.valueOf("measurement".concat(String.valueOf(((p1) this.f2053w).f7692v.getPackageName())).hashCode());
        }
        return this.B.intValue();
    }

    public final PendingIntent L() {
        Context context = ((p1) this.f2053w).f7692v;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), r6.f3042a);
    }
}
