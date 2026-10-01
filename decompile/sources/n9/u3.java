package n9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u3 extends z3 {
    public final AlarmManager B;
    public n3 C;
    public Integer D;

    public u3(e4 e4Var) {
        super(e4Var);
        this.B = (AlarmManager) ((n1) this.f4301y).f9413x.getSystemService("alarm");
    }

    @Override // n9.z3
    public final void g1() {
        AlarmManager alarmManager = this.B;
        if (alarmManager != null) {
            alarmManager.cancel(l1());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            j1();
        }
    }

    public final void h1() {
        e1();
        u0 u0Var = ((n1) this.f4301y).C;
        n1.g(u0Var);
        u0Var.L.a("Unscheduling upload");
        AlarmManager alarmManager = this.B;
        if (alarmManager != null) {
            alarmManager.cancel(l1());
        }
        i1().c();
        if (Build.VERSION.SDK_INT >= 24) {
            j1();
        }
    }

    public final p i1() {
        if (this.C == null) {
            this.C = new n3(this, this.f9511z.I, 1);
        }
        return this.C;
    }

    public final void j1() {
        JobScheduler jobScheduler = (JobScheduler) ((n1) this.f4301y).f9413x.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(k1());
        }
    }

    public final int k1() {
        if (this.D == null) {
            this.D = Integer.valueOf("measurement".concat(String.valueOf(((n1) this.f4301y).f9413x.getPackageName())).hashCode());
        }
        return this.D.intValue();
    }

    public final PendingIntent l1() {
        Context context = ((n1) this.f4301y).f9413x;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f2203a);
    }
}
