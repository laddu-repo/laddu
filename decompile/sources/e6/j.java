package e6;

import android.content.Context;
import android.database.Cursor;
import androidx.lifecycle.j1;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k4;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import x4.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4388a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4389b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4390c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4391d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4392e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4393f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4394g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4395h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4396i;

    public j(WorkDatabase_Impl workDatabase_Impl) {
        this.f4388a = workDatabase_Impl;
        this.f4389b = new b(workDatabase_Impl, 5);
        this.f4390c = new e(workDatabase_Impl, 3);
        this.f4391d = new e(workDatabase_Impl, 4);
        this.f4392e = new e(workDatabase_Impl, 5);
        this.f4393f = new e(workDatabase_Impl, 6);
        this.f4394g = new e(workDatabase_Impl, 7);
        this.f4395h = new e(workDatabase_Impl, 8);
        this.f4396i = new e(workDatabase_Impl, 9);
        new e(workDatabase_Impl, 10);
    }

    public ArrayList a() {
        z zVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        z d10 = z.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        d10.b(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            int i6 = k4.i(r10, "required_network_type");
            int i10 = k4.i(r10, "requires_charging");
            int i11 = k4.i(r10, "requires_device_idle");
            int i12 = k4.i(r10, "requires_battery_not_low");
            int i13 = k4.i(r10, "requires_storage_not_low");
            int i14 = k4.i(r10, "trigger_content_update_delay");
            int i15 = k4.i(r10, "trigger_max_content_delay");
            int i16 = k4.i(r10, "content_uri_triggers");
            int i17 = k4.i(r10, "id");
            int i18 = k4.i(r10, "state");
            int i19 = k4.i(r10, "worker_class_name");
            int i20 = k4.i(r10, "input_merger_class_name");
            int i21 = k4.i(r10, "input");
            zVar = d10;
            try {
                int i22 = k4.i(r10, "output");
                int i23 = k4.i(r10, "initial_delay");
                int i24 = k4.i(r10, "interval_duration");
                int i25 = k4.i(r10, "flex_duration");
                int i26 = k4.i(r10, "run_attempt_count");
                int i27 = k4.i(r10, "backoff_policy");
                int i28 = k4.i(r10, "backoff_delay_duration");
                int i29 = k4.i(r10, "period_start_time");
                int i30 = k4.i(r10, "minimum_retention_duration");
                int i31 = k4.i(r10, "schedule_requested_at");
                int i32 = k4.i(r10, "run_in_foreground");
                int i33 = k4.i(r10, "out_of_quota_policy");
                int i34 = i22;
                ArrayList arrayList = new ArrayList(r10.getCount());
                while (r10.moveToNext()) {
                    String string = r10.getString(i17);
                    int i35 = i17;
                    String string2 = r10.getString(i19);
                    int i36 = i19;
                    v5.c cVar = new v5.c();
                    int i37 = i6;
                    cVar.f13306a = a4.k(r10.getInt(i6));
                    if (r10.getInt(i10) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f13307b = z10;
                    if (r10.getInt(i11) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f13308c = z11;
                    if (r10.getInt(i12) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.f13309d = z12;
                    if (r10.getInt(i13) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.f13310e = z13;
                    int i38 = i10;
                    cVar.f13311f = r10.getLong(i14);
                    cVar.f13312g = r10.getLong(i15);
                    cVar.f13313h = a4.d(r10.getBlob(i16));
                    i iVar = new i(string, string2);
                    iVar.f4372b = a4.m(r10.getInt(i18));
                    iVar.f4374d = r10.getString(i20);
                    iVar.f4375e = v5.f.a(r10.getBlob(i21));
                    int i39 = i34;
                    iVar.f4376f = v5.f.a(r10.getBlob(i39));
                    int i40 = i21;
                    i34 = i39;
                    int i41 = i23;
                    iVar.f4377g = r10.getLong(i41);
                    i23 = i41;
                    int i42 = i11;
                    int i43 = i24;
                    iVar.f4378h = r10.getLong(i43);
                    i24 = i43;
                    int i44 = i25;
                    iVar.f4379i = r10.getLong(i44);
                    int i45 = i26;
                    iVar.f4380k = r10.getInt(i45);
                    int i46 = i27;
                    i26 = i45;
                    iVar.f4381l = a4.j(r10.getInt(i46));
                    i25 = i44;
                    int i47 = i28;
                    iVar.f4382m = r10.getLong(i47);
                    i28 = i47;
                    int i48 = i29;
                    iVar.f4383n = r10.getLong(i48);
                    i29 = i48;
                    int i49 = i30;
                    iVar.f4384o = r10.getLong(i49);
                    i30 = i49;
                    int i50 = i31;
                    iVar.f4385p = r10.getLong(i50);
                    int i51 = i32;
                    if (r10.getInt(i51) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    iVar.f4386q = z14;
                    int i52 = i33;
                    i32 = i51;
                    iVar.f4387r = a4.l(r10.getInt(i52));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i27 = i46;
                    i11 = i42;
                    i33 = i52;
                    i31 = i50;
                    i21 = i40;
                    i17 = i35;
                    i19 = i36;
                    i6 = i37;
                    i10 = i38;
                }
                r10.close();
                zVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                r10.close();
                zVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = d10;
        }
    }

    public ArrayList b(int i6) {
        z zVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        z d10 = z.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        d10.b(1, i6);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            i10 = k4.i(r10, "required_network_type");
            i11 = k4.i(r10, "requires_charging");
            i12 = k4.i(r10, "requires_device_idle");
            i13 = k4.i(r10, "requires_battery_not_low");
            i14 = k4.i(r10, "requires_storage_not_low");
            i15 = k4.i(r10, "trigger_content_update_delay");
            i16 = k4.i(r10, "trigger_max_content_delay");
            i17 = k4.i(r10, "content_uri_triggers");
            i18 = k4.i(r10, "id");
            i19 = k4.i(r10, "state");
            i20 = k4.i(r10, "worker_class_name");
            i21 = k4.i(r10, "input_merger_class_name");
            i22 = k4.i(r10, "input");
            zVar = d10;
        } catch (Throwable th) {
            th = th;
            zVar = d10;
        }
        try {
            int i23 = k4.i(r10, "output");
            int i24 = k4.i(r10, "initial_delay");
            int i25 = k4.i(r10, "interval_duration");
            int i26 = k4.i(r10, "flex_duration");
            int i27 = k4.i(r10, "run_attempt_count");
            int i28 = k4.i(r10, "backoff_policy");
            int i29 = k4.i(r10, "backoff_delay_duration");
            int i30 = k4.i(r10, "period_start_time");
            int i31 = k4.i(r10, "minimum_retention_duration");
            int i32 = k4.i(r10, "schedule_requested_at");
            int i33 = k4.i(r10, "run_in_foreground");
            int i34 = k4.i(r10, "out_of_quota_policy");
            int i35 = i23;
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                String string = r10.getString(i18);
                int i36 = i18;
                String string2 = r10.getString(i20);
                int i37 = i20;
                v5.c cVar = new v5.c();
                int i38 = i10;
                cVar.f13306a = a4.k(r10.getInt(i10));
                if (r10.getInt(i11) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f13307b = z10;
                if (r10.getInt(i12) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cVar.f13308c = z11;
                if (r10.getInt(i13) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                cVar.f13309d = z12;
                if (r10.getInt(i14) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                cVar.f13310e = z13;
                int i39 = i11;
                cVar.f13311f = r10.getLong(i15);
                cVar.f13312g = r10.getLong(i16);
                cVar.f13313h = a4.d(r10.getBlob(i17));
                i iVar = new i(string, string2);
                iVar.f4372b = a4.m(r10.getInt(i19));
                iVar.f4374d = r10.getString(i21);
                iVar.f4375e = v5.f.a(r10.getBlob(i22));
                int i40 = i35;
                iVar.f4376f = v5.f.a(r10.getBlob(i40));
                int i41 = i24;
                int i42 = i22;
                i35 = i40;
                iVar.f4377g = r10.getLong(i41);
                int i43 = i12;
                int i44 = i25;
                iVar.f4378h = r10.getLong(i44);
                i25 = i44;
                int i45 = i26;
                iVar.f4379i = r10.getLong(i45);
                int i46 = i27;
                iVar.f4380k = r10.getInt(i46);
                int i47 = i28;
                i27 = i46;
                iVar.f4381l = a4.j(r10.getInt(i47));
                i26 = i45;
                int i48 = i29;
                iVar.f4382m = r10.getLong(i48);
                i29 = i48;
                int i49 = i30;
                iVar.f4383n = r10.getLong(i49);
                i30 = i49;
                int i50 = i31;
                iVar.f4384o = r10.getLong(i50);
                i31 = i50;
                int i51 = i32;
                iVar.f4385p = r10.getLong(i51);
                int i52 = i33;
                if (r10.getInt(i52) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                iVar.f4386q = z14;
                int i53 = i34;
                i33 = i52;
                iVar.f4387r = a4.l(r10.getInt(i53));
                iVar.j = cVar;
                arrayList.add(iVar);
                i28 = i47;
                i12 = i43;
                i22 = i42;
                i34 = i53;
                i32 = i51;
                i24 = i41;
                i18 = i36;
                i20 = i37;
                i10 = i38;
                i11 = i39;
            }
            r10.close();
            zVar.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            r10.close();
            zVar.f();
            throw th;
        }
    }

    public ArrayList c() {
        z zVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        z d10 = z.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            int i6 = k4.i(r10, "required_network_type");
            int i10 = k4.i(r10, "requires_charging");
            int i11 = k4.i(r10, "requires_device_idle");
            int i12 = k4.i(r10, "requires_battery_not_low");
            int i13 = k4.i(r10, "requires_storage_not_low");
            int i14 = k4.i(r10, "trigger_content_update_delay");
            int i15 = k4.i(r10, "trigger_max_content_delay");
            int i16 = k4.i(r10, "content_uri_triggers");
            int i17 = k4.i(r10, "id");
            int i18 = k4.i(r10, "state");
            int i19 = k4.i(r10, "worker_class_name");
            int i20 = k4.i(r10, "input_merger_class_name");
            int i21 = k4.i(r10, "input");
            zVar = d10;
            try {
                int i22 = k4.i(r10, "output");
                int i23 = k4.i(r10, "initial_delay");
                int i24 = k4.i(r10, "interval_duration");
                int i25 = k4.i(r10, "flex_duration");
                int i26 = k4.i(r10, "run_attempt_count");
                int i27 = k4.i(r10, "backoff_policy");
                int i28 = k4.i(r10, "backoff_delay_duration");
                int i29 = k4.i(r10, "period_start_time");
                int i30 = k4.i(r10, "minimum_retention_duration");
                int i31 = k4.i(r10, "schedule_requested_at");
                int i32 = k4.i(r10, "run_in_foreground");
                int i33 = k4.i(r10, "out_of_quota_policy");
                int i34 = i22;
                ArrayList arrayList = new ArrayList(r10.getCount());
                while (r10.moveToNext()) {
                    String string = r10.getString(i17);
                    int i35 = i17;
                    String string2 = r10.getString(i19);
                    int i36 = i19;
                    v5.c cVar = new v5.c();
                    int i37 = i6;
                    cVar.f13306a = a4.k(r10.getInt(i6));
                    if (r10.getInt(i10) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f13307b = z10;
                    if (r10.getInt(i11) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f13308c = z11;
                    if (r10.getInt(i12) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.f13309d = z12;
                    if (r10.getInt(i13) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.f13310e = z13;
                    int i38 = i10;
                    cVar.f13311f = r10.getLong(i14);
                    cVar.f13312g = r10.getLong(i15);
                    cVar.f13313h = a4.d(r10.getBlob(i16));
                    i iVar = new i(string, string2);
                    iVar.f4372b = a4.m(r10.getInt(i18));
                    iVar.f4374d = r10.getString(i20);
                    iVar.f4375e = v5.f.a(r10.getBlob(i21));
                    int i39 = i34;
                    iVar.f4376f = v5.f.a(r10.getBlob(i39));
                    int i40 = i21;
                    i34 = i39;
                    int i41 = i23;
                    iVar.f4377g = r10.getLong(i41);
                    i23 = i41;
                    int i42 = i11;
                    int i43 = i24;
                    iVar.f4378h = r10.getLong(i43);
                    i24 = i43;
                    int i44 = i25;
                    iVar.f4379i = r10.getLong(i44);
                    int i45 = i26;
                    iVar.f4380k = r10.getInt(i45);
                    int i46 = i27;
                    i26 = i45;
                    iVar.f4381l = a4.j(r10.getInt(i46));
                    i25 = i44;
                    int i47 = i28;
                    iVar.f4382m = r10.getLong(i47);
                    i28 = i47;
                    int i48 = i29;
                    iVar.f4383n = r10.getLong(i48);
                    i29 = i48;
                    int i49 = i30;
                    iVar.f4384o = r10.getLong(i49);
                    i30 = i49;
                    int i50 = i31;
                    iVar.f4385p = r10.getLong(i50);
                    int i51 = i32;
                    if (r10.getInt(i51) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    iVar.f4386q = z14;
                    int i52 = i33;
                    i32 = i51;
                    iVar.f4387r = a4.l(r10.getInt(i52));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i27 = i46;
                    i11 = i42;
                    i33 = i52;
                    i31 = i50;
                    i21 = i40;
                    i17 = i35;
                    i19 = i36;
                    i6 = i37;
                    i10 = i38;
                }
                r10.close();
                zVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                r10.close();
                zVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = d10;
        }
    }

    public ArrayList d() {
        z zVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        z d10 = z.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            int i6 = k4.i(r10, "required_network_type");
            int i10 = k4.i(r10, "requires_charging");
            int i11 = k4.i(r10, "requires_device_idle");
            int i12 = k4.i(r10, "requires_battery_not_low");
            int i13 = k4.i(r10, "requires_storage_not_low");
            int i14 = k4.i(r10, "trigger_content_update_delay");
            int i15 = k4.i(r10, "trigger_max_content_delay");
            int i16 = k4.i(r10, "content_uri_triggers");
            int i17 = k4.i(r10, "id");
            int i18 = k4.i(r10, "state");
            int i19 = k4.i(r10, "worker_class_name");
            int i20 = k4.i(r10, "input_merger_class_name");
            int i21 = k4.i(r10, "input");
            zVar = d10;
            try {
                int i22 = k4.i(r10, "output");
                int i23 = k4.i(r10, "initial_delay");
                int i24 = k4.i(r10, "interval_duration");
                int i25 = k4.i(r10, "flex_duration");
                int i26 = k4.i(r10, "run_attempt_count");
                int i27 = k4.i(r10, "backoff_policy");
                int i28 = k4.i(r10, "backoff_delay_duration");
                int i29 = k4.i(r10, "period_start_time");
                int i30 = k4.i(r10, "minimum_retention_duration");
                int i31 = k4.i(r10, "schedule_requested_at");
                int i32 = k4.i(r10, "run_in_foreground");
                int i33 = k4.i(r10, "out_of_quota_policy");
                int i34 = i22;
                ArrayList arrayList = new ArrayList(r10.getCount());
                while (r10.moveToNext()) {
                    String string = r10.getString(i17);
                    int i35 = i17;
                    String string2 = r10.getString(i19);
                    int i36 = i19;
                    v5.c cVar = new v5.c();
                    int i37 = i6;
                    cVar.f13306a = a4.k(r10.getInt(i6));
                    if (r10.getInt(i10) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f13307b = z10;
                    if (r10.getInt(i11) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f13308c = z11;
                    if (r10.getInt(i12) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.f13309d = z12;
                    if (r10.getInt(i13) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.f13310e = z13;
                    int i38 = i10;
                    cVar.f13311f = r10.getLong(i14);
                    cVar.f13312g = r10.getLong(i15);
                    cVar.f13313h = a4.d(r10.getBlob(i16));
                    i iVar = new i(string, string2);
                    iVar.f4372b = a4.m(r10.getInt(i18));
                    iVar.f4374d = r10.getString(i20);
                    iVar.f4375e = v5.f.a(r10.getBlob(i21));
                    int i39 = i34;
                    iVar.f4376f = v5.f.a(r10.getBlob(i39));
                    int i40 = i21;
                    i34 = i39;
                    int i41 = i23;
                    iVar.f4377g = r10.getLong(i41);
                    i23 = i41;
                    int i42 = i11;
                    int i43 = i24;
                    iVar.f4378h = r10.getLong(i43);
                    i24 = i43;
                    int i44 = i25;
                    iVar.f4379i = r10.getLong(i44);
                    int i45 = i26;
                    iVar.f4380k = r10.getInt(i45);
                    int i46 = i27;
                    i26 = i45;
                    iVar.f4381l = a4.j(r10.getInt(i46));
                    i25 = i44;
                    int i47 = i28;
                    iVar.f4382m = r10.getLong(i47);
                    i28 = i47;
                    int i48 = i29;
                    iVar.f4383n = r10.getLong(i48);
                    i29 = i48;
                    int i49 = i30;
                    iVar.f4384o = r10.getLong(i49);
                    i30 = i49;
                    int i50 = i31;
                    iVar.f4385p = r10.getLong(i50);
                    int i51 = i32;
                    if (r10.getInt(i51) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    iVar.f4386q = z14;
                    int i52 = i33;
                    i32 = i51;
                    iVar.f4387r = a4.l(r10.getInt(i52));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    i27 = i46;
                    i11 = i42;
                    i33 = i52;
                    i31 = i50;
                    i21 = i40;
                    i17 = i35;
                    i19 = i36;
                    i6 = i37;
                    i10 = i38;
                }
                r10.close();
                zVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                r10.close();
                zVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = d10;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        z d10 = z.d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            d10.c(1);
        } else {
            d10.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            int i6 = 0;
            if (r10.moveToFirst()) {
                i6 = a4.m(r10.getInt(0));
            }
            return i6;
        } finally {
            r10.close();
            d10.f();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        z d10 = z.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        d10.c(1);
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                arrayList.add(r10.getString(0));
            }
            return arrayList;
        } finally {
            r10.close();
            d10.f();
        }
    }

    public i g(String str) {
        z zVar;
        i iVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        z d10 = z.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            d10.c(1);
        } else {
            d10.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            int i6 = k4.i(r10, "required_network_type");
            int i10 = k4.i(r10, "requires_charging");
            int i11 = k4.i(r10, "requires_device_idle");
            int i12 = k4.i(r10, "requires_battery_not_low");
            int i13 = k4.i(r10, "requires_storage_not_low");
            int i14 = k4.i(r10, "trigger_content_update_delay");
            int i15 = k4.i(r10, "trigger_max_content_delay");
            int i16 = k4.i(r10, "content_uri_triggers");
            int i17 = k4.i(r10, "id");
            int i18 = k4.i(r10, "state");
            int i19 = k4.i(r10, "worker_class_name");
            int i20 = k4.i(r10, "input_merger_class_name");
            int i21 = k4.i(r10, "input");
            int i22 = k4.i(r10, "output");
            zVar = d10;
            try {
                int i23 = k4.i(r10, "initial_delay");
                int i24 = k4.i(r10, "interval_duration");
                int i25 = k4.i(r10, "flex_duration");
                int i26 = k4.i(r10, "run_attempt_count");
                int i27 = k4.i(r10, "backoff_policy");
                int i28 = k4.i(r10, "backoff_delay_duration");
                int i29 = k4.i(r10, "period_start_time");
                int i30 = k4.i(r10, "minimum_retention_duration");
                int i31 = k4.i(r10, "schedule_requested_at");
                int i32 = k4.i(r10, "run_in_foreground");
                int i33 = k4.i(r10, "out_of_quota_policy");
                if (r10.moveToFirst()) {
                    String string = r10.getString(i17);
                    String string2 = r10.getString(i19);
                    v5.c cVar = new v5.c();
                    cVar.f13306a = a4.k(r10.getInt(i6));
                    if (r10.getInt(i10) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f13307b = z10;
                    if (r10.getInt(i11) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f13308c = z11;
                    if (r10.getInt(i12) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.f13309d = z12;
                    if (r10.getInt(i13) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.f13310e = z13;
                    cVar.f13311f = r10.getLong(i14);
                    cVar.f13312g = r10.getLong(i15);
                    cVar.f13313h = a4.d(r10.getBlob(i16));
                    iVar = new i(string, string2);
                    iVar.f4372b = a4.m(r10.getInt(i18));
                    iVar.f4374d = r10.getString(i20);
                    iVar.f4375e = v5.f.a(r10.getBlob(i21));
                    iVar.f4376f = v5.f.a(r10.getBlob(i22));
                    iVar.f4377g = r10.getLong(i23);
                    iVar.f4378h = r10.getLong(i24);
                    iVar.f4379i = r10.getLong(i25);
                    iVar.f4380k = r10.getInt(i26);
                    iVar.f4381l = a4.j(r10.getInt(i27));
                    iVar.f4382m = r10.getLong(i28);
                    iVar.f4383n = r10.getLong(i29);
                    iVar.f4384o = r10.getLong(i30);
                    iVar.f4385p = r10.getLong(i31);
                    if (r10.getInt(i32) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    iVar.f4386q = z14;
                    iVar.f4387r = a4.l(r10.getInt(i33));
                    iVar.j = cVar;
                } else {
                    iVar = null;
                }
                r10.close();
                zVar.f();
                return iVar;
            } catch (Throwable th) {
                th = th;
                r10.close();
                zVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = d10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v21, types: [p.q3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [p.q3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.lifecycle.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(g8.i r46, int r47) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.h(g8.i, int):void");
    }

    public void i(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        e eVar = (e) this.f4395h;
        i5.j a10 = eVar.a();
        a10.b(1, j);
        if (str == null) {
            a10.c(2);
        } else {
            a10.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.d();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
            eVar.c(a10);
        }
    }

    public void j(String str, v5.f fVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        e eVar = (e) this.f4391d;
        i5.j a10 = eVar.a();
        byte[] b10 = v5.f.b(fVar);
        if (b10 == null) {
            a10.c(1);
        } else {
            a10.D(1, b10);
        }
        if (str == null) {
            a10.c(2);
        } else {
            a10.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.d();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
            eVar.c(a10);
        }
    }

    public void k(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        e eVar = (e) this.f4392e;
        i5.j a10 = eVar.a();
        a10.b(1, j);
        if (str == null) {
            a10.c(2);
        } else {
            a10.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.d();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
            eVar.c(a10);
        }
    }

    public void l(String[] strArr, int i6) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4388a;
        workDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("?");
            if (i10 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        String sql = sb2.toString();
        kotlin.jvm.internal.k.e(sql, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        i5.j k8 = workDatabase_Impl.k().G().k(sql);
        k8.b(1, a4.q(i6));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                k8.c(i11);
            } else {
                k8.i(i11, str);
            }
            i11++;
        }
        workDatabase_Impl.c();
        try {
            k8.d();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public j(Context context, h8.e eVar, n8.d dVar, j1 j1Var, Executor executor, o8.c cVar, p8.a aVar, p8.a aVar2, n8.c cVar2) {
        this.f4388a = context;
        this.f4389b = eVar;
        this.f4390c = dVar;
        this.f4391d = j1Var;
        this.f4392e = executor;
        this.f4393f = cVar;
        this.f4394g = aVar;
        this.f4395h = aVar2;
        this.f4396i = cVar2;
    }
}
