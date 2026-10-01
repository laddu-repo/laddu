package w4;

import android.app.UiModeManager;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.a4;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13822a;

    public /* synthetic */ c(Object obj) {
        this.f13822a = obj;
    }

    public static void d(i5.c cVar) {
        cVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static r8.a f(i5.c cVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new d5.e(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new d5.e(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new d5.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new d5.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d5.g("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new d5.g("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        d5.h hVar = new d5.h("Dependency", hashMap, hashSet, hashSet2);
        d5.h a10 = d5.h.a(cVar, "Dependency");
        if (!hVar.equals(a10)) {
            return new r8.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + hVar + "\n Found:\n" + a10, 3);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new d5.e(1, 1, "id", "TEXT", null, true));
        hashMap2.put("state", new d5.e(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new d5.e(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new d5.e(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new d5.e(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new d5.e(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new d5.e(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new d5.e(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new d5.e(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new d5.e(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new d5.e(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new d5.e(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("period_start_time", new d5.e(0, 1, "period_start_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new d5.e(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new d5.e(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new d5.e(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new d5.e(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("required_network_type", new d5.e(0, 1, "required_network_type", "INTEGER", null, false));
        hashMap2.put("requires_charging", new d5.e(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new d5.e(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new d5.e(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new d5.e(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new d5.e(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new d5.e(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new d5.e(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d5.g("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new d5.g("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        d5.h hVar2 = new d5.h("WorkSpec", hashMap2, hashSet3, hashSet4);
        d5.h a11 = d5.h.a(cVar, "WorkSpec");
        if (!hVar2.equals(a11)) {
            return new r8.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + hVar2 + "\n Found:\n" + a11, 3);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new d5.e(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new d5.e(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new d5.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d5.g("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        d5.h hVar3 = new d5.h("WorkTag", hashMap3, hashSet5, hashSet6);
        d5.h a12 = d5.h.a(cVar, "WorkTag");
        if (!hVar3.equals(a12)) {
            return new r8.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + hVar3 + "\n Found:\n" + a12, 3);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new d5.e(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("system_id", new d5.e(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new d5.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        d5.h hVar4 = new d5.h("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        d5.h a13 = d5.h.a(cVar, "SystemIdInfo");
        if (!hVar4.equals(a13)) {
            return new r8.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + hVar4 + "\n Found:\n" + a13, 3);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put(MediationMetaData.KEY_NAME, new d5.e(1, 1, MediationMetaData.KEY_NAME, "TEXT", null, true));
        hashMap5.put("work_spec_id", new d5.e(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new d5.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d5.g("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        d5.h hVar5 = new d5.h("WorkName", hashMap5, hashSet8, hashSet9);
        d5.h a14 = d5.h.a(cVar, "WorkName");
        if (!hVar5.equals(a14)) {
            return new r8.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + hVar5 + "\n Found:\n" + a14, 3);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new d5.e(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new d5.e(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new d5.f("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        d5.h hVar6 = new d5.h("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        d5.h a15 = d5.h.a(cVar, "WorkProgress");
        if (!hVar6.equals(a15)) {
            return new r8.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + hVar6 + "\n Found:\n" + a15, 3);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new d5.e(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new d5.e(0, 1, "long_value", "INTEGER", null, false));
        d5.h hVar7 = new d5.h("Preference", hashMap7, new HashSet(0), new HashSet(0));
        d5.h a16 = d5.h.a(cVar, "Preference");
        if (!hVar7.equals(a16)) {
            return new r8.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + hVar7 + "\n Found:\n" + a16, 3);
        }
        return new r8.a(true, (String) null, 3);
    }

    public JSONObject a(View view) {
        int i6;
        int currentModeType;
        boolean z10 = false;
        JSONObject a10 = zc.b.a(0, 0, 0, 0);
        UiModeManager uiModeManager = c9.a.f1988c;
        if (uiModeManager != null && (currentModeType = uiModeManager.getCurrentModeType()) != 1 && currentModeType == 4) {
            i6 = a4.f2142d;
        } else {
            i6 = 2;
        }
        if (zc.a.f15328a[y.e.c(i6)] == 1) {
            z10 = true;
        }
        try {
            a10.put("noOutputDevice", z10);
            return a10;
        } catch (JSONException e10) {
            Log.e("OMIDLIB", "Error with setting output device status", e10);
            return a10;
        }
    }

    public boolean b(int i6, int i10) {
        d dVar = (d) this.f13822a;
        Object obj = dVar.f13845x.get(i6);
        Object obj2 = dVar.f13846y.get(i10);
        if (obj != null && obj2 != null) {
            return ((b) dVar.B.f13851b.f12252z).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean c(int i6, int i10) {
        d dVar = (d) this.f13822a;
        Object obj = dVar.f13845x.get(i6);
        Object obj2 = dVar.f13846y.get(i10);
        if (obj != null && obj2 != null) {
            return ((b) dVar.B.f13851b.f12252z).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    public Object e(int i6, int i10) {
        d dVar = (d) this.f13822a;
        Object obj = dVar.f13845x.get(i6);
        Object obj2 = dVar.f13846y.get(i10);
        if (obj != null && obj2 != null) {
            return ((b) dVar.B.f13851b.f12252z).f(obj, obj2);
        }
        throw new AssertionError();
    }
}
