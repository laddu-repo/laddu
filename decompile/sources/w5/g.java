package w5;

import androidx.work.impl.WorkDatabase;
import x4.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends u {
    @Override // x4.u
    public final void a(h5.b db2) {
        kotlin.jvm.internal.k.e(db2, "db");
        db2.e();
        try {
            int i6 = WorkDatabase.f1190m;
            db2.h("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f1189l) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db2.B();
        } finally {
            db2.J();
        }
    }
}
