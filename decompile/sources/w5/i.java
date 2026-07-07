package w5;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends b5.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14098c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f14099d;

    public i(Context context, int i6, int i10) {
        super(i6, i10);
        this.f14099d = context;
    }

    @Override // b5.a
    public final void a(h5.b bVar) {
        int i6 = this.f14098c;
        Context context = this.f14099d;
        switch (i6) {
            case 0:
                if (this.f1473b >= 10) {
                    bVar.A(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    bVar.e();
                    try {
                        bVar.A(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        bVar.A(new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferences.edit().clear().apply();
                        bVar.B();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.e();
                    try {
                        bVar.A(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        bVar.A(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.B();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public i(Context context) {
        super(9, 10);
        this.f14099d = context;
    }
}
