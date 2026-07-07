package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.j1;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k4;
import e6.d;
import e6.i;
import e6.j;
import j4.b0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import v5.c;
import v5.f;
import v5.m;
import v5.o;
import w5.l;
import x4.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: y, reason: collision with root package name */
    public static final String f1212y = o.h("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String c(b0 b0Var, b0 b0Var2, j1 j1Var, ArrayList arrayList) {
        String str;
        Integer num;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb2.append("\n Id \t Class Name\t " + str + "\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            i iVar = (i) obj;
            d n10 = j1Var.n(iVar.f4371a);
            if (n10 != null) {
                num = Integer.valueOf(n10.f4364b);
            } else {
                num = null;
            }
            String str3 = iVar.f4371a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) b0Var.f7158x;
            z d10 = z.d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str3 == null) {
                d10.c(1);
            } else {
                d10.i(1, str3);
            }
            workDatabase_Impl.b();
            Cursor r10 = j5.r(workDatabase_Impl, d10);
            try {
                ArrayList arrayList2 = new ArrayList(r10.getCount());
                while (r10.moveToNext()) {
                    arrayList2.add(r10.getString(0));
                }
                r10.close();
                d10.f();
                ArrayList s = b0Var2.s(iVar.f4371a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", s);
                String str4 = iVar.f4371a;
                String str5 = iVar.f4373c;
                switch (iVar.f4372b) {
                    case 1:
                        str2 = "ENQUEUED";
                        break;
                    case 2:
                        str2 = "RUNNING";
                        break;
                    case 3:
                        str2 = "SUCCEEDED";
                        break;
                    case 4:
                        str2 = "FAILED";
                        break;
                    case 5:
                        str2 = "BLOCKED";
                        break;
                    case 6:
                        str2 = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sb2.append("\n" + str4 + "\t " + str5 + "\t " + num + "\t " + str2 + "\t " + join + "\t " + join2 + "\t");
            } catch (Throwable th) {
                r10.close();
                d10.f();
                throw th;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final m b() {
        z zVar;
        int i6;
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
        j1 j1Var;
        b0 b0Var;
        b0 b0Var2;
        int i20;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase workDatabase = l.c(getApplicationContext()).f14113c;
        j y9 = workDatabase.y();
        b0 w10 = workDatabase.w();
        b0 z15 = workDatabase.z();
        j1 v10 = workDatabase.v();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        y9.getClass();
        z d10 = z.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        d10.b(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) y9.f4388a;
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            i6 = k4.i(r10, "required_network_type");
            i10 = k4.i(r10, "requires_charging");
            i11 = k4.i(r10, "requires_device_idle");
            i12 = k4.i(r10, "requires_battery_not_low");
            i13 = k4.i(r10, "requires_storage_not_low");
            i14 = k4.i(r10, "trigger_content_update_delay");
            i15 = k4.i(r10, "trigger_max_content_delay");
            i16 = k4.i(r10, "content_uri_triggers");
            i17 = k4.i(r10, "id");
            i18 = k4.i(r10, "state");
            i19 = k4.i(r10, "worker_class_name");
            zVar = d10;
        } catch (Throwable th) {
            th = th;
            zVar = d10;
        }
        try {
            int i21 = k4.i(r10, "input_merger_class_name");
            int i22 = k4.i(r10, "input");
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
                String string = r10.getString(i17);
                int i36 = i17;
                String string2 = r10.getString(i19);
                int i37 = i19;
                c cVar = new c();
                int i38 = i6;
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
                int i39 = i10;
                int i40 = i11;
                cVar.f13311f = r10.getLong(i14);
                cVar.f13312g = r10.getLong(i15);
                cVar.f13313h = a4.d(r10.getBlob(i16));
                i iVar = new i(string, string2);
                iVar.f4372b = a4.m(r10.getInt(i18));
                iVar.f4374d = r10.getString(i21);
                iVar.f4375e = f.a(r10.getBlob(i22));
                int i41 = i35;
                iVar.f4376f = f.a(r10.getBlob(i41));
                int i42 = i18;
                int i43 = i24;
                iVar.f4377g = r10.getLong(i43);
                int i44 = i25;
                int i45 = i21;
                iVar.f4378h = r10.getLong(i44);
                int i46 = i12;
                int i47 = i26;
                iVar.f4379i = r10.getLong(i47);
                int i48 = i27;
                iVar.f4380k = r10.getInt(i48);
                int i49 = i28;
                int i50 = i22;
                iVar.f4381l = a4.j(r10.getInt(i49));
                int i51 = i29;
                iVar.f4382m = r10.getLong(i51);
                int i52 = i30;
                iVar.f4383n = r10.getLong(i52);
                int i53 = i31;
                iVar.f4384o = r10.getLong(i53);
                int i54 = i32;
                iVar.f4385p = r10.getLong(i54);
                int i55 = i33;
                if (r10.getInt(i55) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                iVar.f4386q = z14;
                int i56 = i34;
                iVar.f4387r = a4.l(r10.getInt(i56));
                iVar.j = cVar;
                arrayList.add(iVar);
                i27 = i48;
                i21 = i45;
                i25 = i44;
                i30 = i52;
                i12 = i46;
                i35 = i41;
                i33 = i55;
                i10 = i39;
                i24 = i43;
                i22 = i50;
                i26 = i47;
                i28 = i49;
                i31 = i53;
                i29 = i51;
                i19 = i37;
                i6 = i38;
                i34 = i56;
                i32 = i54;
                i18 = i42;
                i17 = i36;
                i11 = i40;
            }
            r10.close();
            zVar.f();
            ArrayList c10 = y9.c();
            ArrayList a10 = y9.a();
            boolean isEmpty = arrayList.isEmpty();
            String str = f1212y;
            if (!isEmpty) {
                i20 = 0;
                o.f().g(str, "Recently completed work:\n\n", new Throwable[0]);
                j1Var = v10;
                b0Var = w10;
                b0Var2 = z15;
                o.f().g(str, c(b0Var, b0Var2, j1Var, arrayList), new Throwable[0]);
            } else {
                j1Var = v10;
                b0Var = w10;
                b0Var2 = z15;
                i20 = 0;
            }
            if (!c10.isEmpty()) {
                o.f().g(str, "Running work:\n\n", new Throwable[i20]);
                o.f().g(str, c(b0Var, b0Var2, j1Var, c10), new Throwable[i20]);
            }
            if (!a10.isEmpty()) {
                o.f().g(str, "Enqueued work:\n\n", new Throwable[i20]);
                o.f().g(str, c(b0Var, b0Var2, j1Var, a10), new Throwable[i20]);
            }
            return new m(f.f13318c);
        } catch (Throwable th2) {
            th = th2;
            r10.close();
            zVar.f();
            throw th;
        }
    }
}
