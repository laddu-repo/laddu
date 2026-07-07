package k8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.b8;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.w9;
import com.google.android.gms.internal.measurement.x9;
import com.google.android.gms.internal.measurement.y9;
import com.google.android.gms.internal.measurement.z9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends h4 {
    public static final String[] B = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] C = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] D = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] E = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] F = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] G = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] H = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] I = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] J = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] K = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] L = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final e3.c A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m f7638z;

    public n(n4 n4Var) {
        super(n4Var);
        this.A = new e3.c(((p1) this.f2053w).F);
        ((p1) this.f2053w).getClass();
        this.f7638z = new m(this, ((p1) this.f2053w).f7692v);
    }

    public static final String i0(List list) {
        return list.isEmpty() ? "" : d0.d.l(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void q0(ContentValues contentValues, Object obj) {
        t7.y.d("value");
        t7.y.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List A0(String str) {
        String str2;
        p1 p1Var = (p1) this.f2053w;
        t7.y.d(str);
        D();
        E();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                p1Var.getClass();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j8 = cursorQuery.getLong(2);
                            Object objQ = Q(cursorQuery, 3);
                            if (objQ == null) {
                                v0 v0Var = p1Var.A;
                                p1.l(v0Var);
                                v0Var.B.b(v0.L(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new r4(str2, str3, string, j8, objQ));
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    v0 v0Var2 = p1Var.A;
                                    p1.l(v0Var2);
                                    v0Var2.B.c(v0.L(str2), e, "Error querying user properties. appId");
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str2 = str;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str2 = str;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        k8.p1.l(r13);
        r13.B.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List B0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.B0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean C0(e eVar) {
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        String str = eVar.f7448v;
        t7.y.g(str);
        if (z0(str, eVar.f7450x.f7721w) == null) {
            long jZ = Z("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            p1Var.getClass();
            if (jZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f7449w);
        contentValues.put("name", eVar.f7450x.f7721w);
        Object objA = eVar.f7450x.a();
        t7.y.g(objA);
        q0(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(eVar.f7452z));
        contentValues.put("trigger_event_name", eVar.A);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.C));
        v vVar = eVar.B;
        t4 t4Var = p1Var.D;
        v0 v0Var = p1Var.A;
        p1.j(t4Var);
        contentValues.put("timed_out_event", t4.n0(vVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f7451y));
        p1.j(t4Var);
        contentValues.put("triggered_event", t4.n0(eVar.D));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f7450x.f7722x));
        contentValues.put("time_to_live", Long.valueOf(eVar.E));
        contentValues.put("expired_event", t4.n0(eVar.F));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            p1.l(v0Var);
            v0Var.B.b(v0.L(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e7) {
            p1.l(v0Var);
            v0Var.B.c(v0.L(str), e7, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.e D0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.D0(java.lang.String, java.lang.String):k8.e");
    }

    public final void E0(String str, String str2) {
        t7.y.d(str);
        t7.y.d(str2);
        D();
        E();
        try {
            u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            p1 p1Var = (p1) this.f2053w;
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.d("Error deleting conditional property", v0.L(str), p1Var.E.c(str2), e7);
        }
    }

    public final List F0(String str, String str2, String str3) {
        t7.y.d(str);
        D();
        E();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return G0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // k8.h4
    public final void G() {
        p1 p1Var = (p1) this.f2053w;
        if (p1Var.f7695y.O(null, f0.f7493f1)) {
            n1 n1Var = p1Var.B;
            p1.l(n1Var);
            n1Var.M(new androidx.fragment.app.m(10, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.A;
        k8.p1.l(r3);
        r3.B.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List G0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.G0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final long H(String str, x9 x9Var, String str2, Map map, b3 b3Var, Long l10) {
        int iDelete;
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        t7.y.g(x9Var);
        t7.y.d(str);
        D();
        E();
        if (o0()) {
            n4 n4Var = this.f7447x;
            long jG = n4Var.D.B.g();
            x7.a aVar = p1Var.F;
            v0 v0Var = p1Var.A;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jG) > ((Long) f0.N.a(null)).longValue()) {
                n4Var.D.B.h(jElapsedRealtime);
                D();
                E();
                if (o0() && (iDelete = u0().delete("upload_queue", h0(), new String[0])) > 0) {
                    p1.l(v0Var);
                    v0Var.J.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                t7.y.d(str);
                D();
                E();
                try {
                    int iM = p1Var.f7695y.M(str, f0.A);
                    if (iM > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM)});
                    }
                } catch (SQLiteException e7) {
                    p1.l(v0Var);
                    v0Var.B.c(v0.L(str), e7, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = x9Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(b3Var.f7407v));
        x7.a aVar2 = p1Var.F;
        v0 v0Var2 = p1Var.A;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            p1.l(v0Var2);
            v0Var2.B.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            p1.l(v0Var2);
            v0Var2.B.c(str, e10, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.a1 H0(java.lang.String r54) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.H0(java.lang.String):k8.a1");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I(java.lang.String r19, k8.f4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.I(java.lang.String, k8.f4, int):java.util.List");
    }

    public final void I0(a1 a1Var, boolean z2) {
        p1 p1Var = (p1) this.f2053w;
        p1 p1Var2 = a1Var.f7349a;
        D();
        E();
        String strE = a1Var.E();
        t7.y.g(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        c2 c2Var = c2.f7423x;
        n4 n4Var = this.f7447x;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (n4Var.b(strE).i(c2Var)) {
            contentValues.put("app_instance_id", a1Var.F());
        }
        contentValues.put("gmp_app_id", a1Var.H());
        if (n4Var.b(strE).i(c2.f7422w)) {
            n1 n1Var = p1Var2.B;
            p1.l(n1Var);
            n1Var.D();
            contentValues.put("resettable_device_id_hash", a1Var.f7353e);
        }
        n1 n1Var2 = p1Var2.B;
        p1.l(n1Var2);
        n1Var2.D();
        contentValues.put("last_bundle_index", Long.valueOf(a1Var.f7354g));
        n1 n1Var3 = p1Var2.B;
        p1.l(n1Var3);
        n1Var3.D();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(a1Var.f7355h));
        n1 n1Var4 = p1Var2.B;
        p1.l(n1Var4);
        n1Var4.D();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(a1Var.i));
        contentValues.put("app_version", a1Var.O());
        n1 n1Var5 = p1Var2.B;
        p1.l(n1Var5);
        n1Var5.D();
        contentValues.put("app_store", a1Var.f7358l);
        n1 n1Var6 = p1Var2.B;
        p1.l(n1Var6);
        n1Var6.D();
        contentValues.put("gmp_version", Long.valueOf(a1Var.f7359m));
        n1 n1Var7 = p1Var2.B;
        p1.l(n1Var7);
        n1Var7.D();
        contentValues.put("dev_cert_hash", Long.valueOf(a1Var.f7360n));
        n1 n1Var8 = p1Var2.B;
        p1.l(n1Var8);
        n1Var8.D();
        contentValues.put("measurement_enabled", Boolean.valueOf(a1Var.f7361o));
        n1 n1Var9 = p1Var2.B;
        n1 n1Var10 = p1Var2.B;
        p1.l(n1Var9);
        n1Var9.D();
        contentValues.put("day", Long.valueOf(a1Var.K));
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("daily_public_events_count", Long.valueOf(a1Var.L));
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("daily_events_count", Long.valueOf(a1Var.M));
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("daily_conversions_count", Long.valueOf(a1Var.N));
        n1 n1Var11 = p1Var2.B;
        p1.l(n1Var11);
        n1Var11.D();
        contentValues.put("config_fetched_time", Long.valueOf(a1Var.S));
        n1 n1Var12 = p1Var2.B;
        p1.l(n1Var12);
        n1Var12.D();
        contentValues.put("failed_config_fetch_time", Long.valueOf(a1Var.T));
        contentValues.put("app_version_int", Long.valueOf(a1Var.Q()));
        contentValues.put("firebase_instance_id", a1Var.K());
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("daily_error_events_count", Long.valueOf(a1Var.O));
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("daily_realtime_events_count", Long.valueOf(a1Var.P));
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("health_monitor_sample", a1Var.Q);
        contentValues.put("android_id", (Long) 0L);
        n1 n1Var13 = p1Var2.B;
        p1.l(n1Var13);
        n1Var13.D();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(a1Var.f7362p));
        contentValues.put("dynamite_version", Long.valueOf(a1Var.b()));
        if (n4Var.b(strE).i(c2Var)) {
            n1 n1Var14 = p1Var2.B;
            p1.l(n1Var14);
            n1Var14.D();
            contentValues.put("session_stitching_token", a1Var.f7366t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(a1Var.z()));
        n1 n1Var15 = p1Var2.B;
        p1.l(n1Var15);
        n1Var15.D();
        contentValues.put("target_os_version", Long.valueOf(a1Var.f7368v));
        n1 n1Var16 = p1Var2.B;
        p1.l(n1Var16);
        n1Var16.D();
        contentValues.put("session_stitching_token_hash", Long.valueOf(a1Var.f7369w));
        com.google.android.gms.internal.measurement.t4.a();
        g gVar = p1Var.f7695y;
        v0 v0Var = p1Var.A;
        if (gVar.O(strE, f0.P0)) {
            n1 n1Var17 = p1Var2.B;
            p1.l(n1Var17);
            n1Var17.D();
            contentValues.put("ad_services_version", Integer.valueOf(a1Var.f7370x));
            n1 n1Var18 = p1Var2.B;
            p1.l(n1Var18);
            n1Var18.D();
            contentValues.put("attribution_eligibility_status", Long.valueOf(a1Var.B));
        }
        n1 n1Var19 = p1Var2.B;
        p1.l(n1Var19);
        n1Var19.D();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(a1Var.f7371y));
        contentValues.put("npa_metadata_value", a1Var.x());
        n1 n1Var20 = p1Var2.B;
        p1.l(n1Var20);
        n1Var20.D();
        contentValues.put("bundle_delivery_index", Long.valueOf(a1Var.F));
        contentValues.put("sgtm_preview_key", a1Var.D());
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("dma_consent_state", Integer.valueOf(a1Var.D));
        p1.l(n1Var10);
        n1Var10.D();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(a1Var.E));
        contentValues.put("serialized_npa_metadata", a1Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(a1Var.t()));
        n1 n1Var21 = p1Var2.B;
        p1.l(n1Var21);
        n1Var21.D();
        ArrayList arrayList = a1Var.f7365s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                p1.l(v0Var);
                v0Var.E.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (gVar.O(null, f0.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        n1 n1Var22 = p1Var2.B;
        p1.l(n1Var22);
        n1Var22.D();
        contentValues.put("unmatched_pfo", a1Var.f7372z);
        n1 n1Var23 = p1Var2.B;
        p1.l(n1Var23);
        n1Var23.D();
        contentValues.put("unmatched_uwa", a1Var.A);
        n1 n1Var24 = p1Var2.B;
        p1.l(n1Var24);
        n1Var24.D();
        contentValues.put("ad_campaign_info", a1Var.H);
        if (gVar.O(strE, f0.f7507k1)) {
            n1 n1Var25 = p1Var2.B;
            p1.l(n1Var25);
            n1Var25.D();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(a1Var.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (sQLiteDatabaseU0.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                p1.l(v0Var);
                v0Var.B.b(v0.L(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e7) {
            p1.l(v0Var);
            v0Var.B.c(v0.L(strE), e7, "Error storing app. appId");
        }
    }

    public final boolean J(String str) {
        b3[] b3VarArr = {b3.f7404x};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(b3VarArr[0].f7407v));
        String strI0 = i0(arrayList);
        String strH0 = h0();
        StringBuilder sb2 = new StringBuilder(strI0.length() + 61 + strH0.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strI0);
        sb2.append(" AND NOT ");
        sb2.append(strH0);
        return Z(sb2.toString(), new String[]{str}) != 0;
    }

    public final j J0(long j8, String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        return K0(j8, str, 1L, false, false, z2, false, z10, z11, z12);
    }

    public final void K(Long l10) {
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.E.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.b(e7, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e7;
        }
    }

    public final j K0(long j8, String str, long j9, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        p1 p1Var = (p1) this.f2053w;
        t7.y.d(str);
        D();
        E();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                cursorQuery = sQLiteDatabaseU0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j8) {
                        jVar.f7583b = cursorQuery.getLong(1);
                        jVar.f7582a = cursorQuery.getLong(2);
                        jVar.f7584c = cursorQuery.getLong(3);
                        jVar.f7585d = cursorQuery.getLong(4);
                        jVar.f7586e = cursorQuery.getLong(5);
                        jVar.f = cursorQuery.getLong(6);
                        jVar.f7587g = cursorQuery.getLong(7);
                    }
                    if (z2) {
                        jVar.f7583b += j9;
                    }
                    if (z10) {
                        jVar.f7582a += j9;
                    }
                    if (z11) {
                        jVar.f7584c += j9;
                    }
                    if (z12) {
                        jVar.f7585d += j9;
                    }
                    if (z13) {
                        jVar.f7586e += j9;
                    }
                    if (z14) {
                        jVar.f += j9;
                    }
                    if (z15) {
                        jVar.f7587g += j9;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j8));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f7582a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f7583b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f7584c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f7585d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f7586e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.f7587g));
                    sQLiteDatabaseU0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    v0 v0Var = p1Var.A;
                    p1.l(v0Var);
                    v0Var.E.b(v0.L(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e7) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.B.c(v0.L(str), e7, "Error updating daily counts. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return jVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String L() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f2053w     // Catch: java.lang.Throwable -> L1a
            k8.p1 r3 = (k8.p1) r3     // Catch: java.lang.Throwable -> L1a
            k8.v0 r3 = r3.A     // Catch: java.lang.Throwable -> L1a
            k8.p1.l(r3)     // Catch: java.lang.Throwable -> L1a
            k8.t0 r3 = r3.B     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.L():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hd.a L0(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f2053w
            r1 = r0
            k8.p1 r1 = (k8.p1) r1
            t7.y.d(r12)
            r11.D()
            r11.E()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.u0()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            k8.v0 r6 = r1.A     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            k8.p1.l(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            k8.t0 r6 = r6.B     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            k8.u0 r8 = k8.v0.L(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.b(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            hd.a r6 = new hd.a     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 10
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            k8.v0 r1 = r1.A     // Catch: java.lang.Throwable -> L59
            k8.p1.l(r1)     // Catch: java.lang.Throwable -> L59
            k8.t0 r1 = r1.B     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            k8.u0 r12 = k8.v0.L(r12)     // Catch: java.lang.Throwable -> L59
            r1.c(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.L0(java.lang.String):hd.a");
    }

    public final void M(long j8) {
        D();
        E();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j8)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.b(e7, "Failed to delete a bundle in a queue table");
            throw e7;
        }
    }

    public final void M0(z9 z9Var, boolean z2) {
        D();
        E();
        t7.y.d(z9Var.u());
        if (!z9Var.h2()) {
            throw new IllegalStateException();
        }
        N();
        p1 p1Var = (p1) this.f2053w;
        x7.a aVar = p1Var.F;
        v0 v0Var = p1Var.A;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI2 = z9Var.i2();
        e0 e0Var = f0.S;
        if (jI2 < jCurrentTimeMillis - ((Long) e0Var.a(null)).longValue() || z9Var.i2() > ((Long) e0Var.a(null)).longValue() + jCurrentTimeMillis) {
            p1.l(v0Var);
            v0Var.E.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", v0.L(z9Var.u()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(z9Var.i2()));
        }
        byte[] bArrA = z9Var.a();
        try {
            p4 p4Var = this.f7447x.B;
            n4.T(p4Var);
            byte[] bArrN0 = p4Var.n0(bArrA);
            p1.l(v0Var);
            v0Var.J.b(Integer.valueOf(bArrN0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", z9Var.u());
            contentValues.put("bundle_end_timestamp", Long.valueOf(z9Var.i2()));
            contentValues.put("data", bArrN0);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (z9Var.u0()) {
                contentValues.put("retry_count", Integer.valueOf(z9Var.v0()));
            }
            try {
                if (u0().insert("queue", null, contentValues) == -1) {
                    p1.l(v0Var);
                    v0Var.B.b(v0.L(z9Var.u()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e7) {
                p1.l(v0Var);
                v0Var.B.c(v0.L(z9Var.u()), e7, "Error storing bundle. appId");
            }
        } catch (IOException e10) {
            p1.l(v0Var);
            v0Var.B.c(v0.L(z9Var.u()), e10, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void N() {
        D();
        E();
        if (o0()) {
            n4 n4Var = this.f7447x;
            long jG = n4Var.D.A.g();
            p1 p1Var = (p1) this.f2053w;
            p1Var.F.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jG) > ((Long) f0.N.a(null)).longValue()) {
                n4Var.D.A.h(jElapsedRealtime);
                D();
                E();
                if (o0()) {
                    SQLiteDatabase sQLiteDatabaseU0 = u0();
                    p1Var.F.getClass();
                    int iDelete = sQLiteDatabaseU0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) f0.S.a(null)).longValue())});
                    if (iDelete > 0) {
                        v0 v0Var = p1Var.A;
                        p1.l(v0Var);
                        v0Var.J.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void O(ArrayList arrayList) {
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        t7.y.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (o0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strN = d0.d.n(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (Z(d0.d.n(new StringBuilder(strN.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strN, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.E.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                StringBuilder sb2 = new StringBuilder(strN.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strN);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseU0.execSQL(sb2.toString());
            } catch (SQLiteException e7) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.B.b(e7, "Error incrementing retry count. error");
            }
        }
    }

    public final void P(Long l10) {
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        if (o0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (Z(sb2.toString(), null) > 0) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.E.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                p1Var.F.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e7) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.B.b(e7, "Error incrementing retry count. error");
            }
        }
    }

    public final Object Q(Cursor cursor, int i) {
        p1 p1Var = (p1) this.f2053w;
        int type = cursor.getType(i);
        if (type == 0) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        v0 v0Var3 = p1Var.A;
        p1.l(v0Var3);
        v0Var3.B.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long R(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2053w
            k8.p1 r0 = (k8.p1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            t7.y.d(r14)
            java.lang.String r2 = "first_open_count"
            t7.y.d(r2)
            r13.D()
            r13.E()
            android.database.sqlite.SQLiteDatabase r3 = r13.u0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.a0(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            k8.v0 r1 = r0.A     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            k8.p1.l(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            k8.t0 r1 = r1.B     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            k8.u0 r9 = k8.v0.L(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.c(r9, r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            k8.v0 r1 = r0.A     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            k8.p1.l(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            k8.t0 r1 = r1.B     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            k8.u0 r5 = k8.v0.L(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.c(r5, r2, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            k8.v0 r0 = r0.A     // Catch: java.lang.Throwable -> L6d
            k8.p1.l(r0)     // Catch: java.lang.Throwable -> L6d
            k8.t0 r0 = r0.B     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            k8.u0 r14 = k8.v0.L(r14)     // Catch: java.lang.Throwable -> L6d
            r0.d(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.R(java.lang.String):long");
    }

    public final boolean S(String str, String str2) {
        return Z("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void T(List list) {
        t7.y.g(list);
        D();
        E();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) list.get(i)).longValue());
        }
        sb2.append(")");
        int iDelete = u0().delete("raw_events", sb2.toString(), null);
        if (iDelete != list.size()) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long U(String str) {
        t7.y.d(str);
        return a0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void V(String str, Long l10, long j8, r9 r9Var) {
        D();
        E();
        t7.y.g(r9Var);
        t7.y.d(str);
        p1 p1Var = (p1) this.f2053w;
        byte[] bArrA = r9Var.a();
        v0 v0Var = p1Var.A;
        v0 v0Var2 = p1Var.A;
        p1.l(v0Var);
        v0Var.J.c(p1Var.E.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", bArrA);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                p1.l(v0Var2);
                v0Var2.B.b(v0.L(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e7) {
            p1.l(v0Var2);
            v0Var2.B.c(v0.L(str), e7, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.W(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.d2 X(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2053w
            k8.p1 r0 = (k8.p1) r0
            t7.y.g(r5)
            r4.D()
            r4.E()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.u0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            k8.v0 r1 = r0.A     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            k8.p1.l(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            k8.t0 r1 = r1.J     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.a(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            k8.d2 r2 = k8.d2.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            k8.v0 r0 = r0.A     // Catch: java.lang.Throwable -> L32
            k8.p1.l(r0)     // Catch: java.lang.Throwable -> L32
            k8.t0 r0 = r0.B     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.b(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            k8.d2 r5 = k8.d2.f7439c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.X(java.lang.String):k8.d2");
    }

    public final void Y(String str, b4 b4Var) {
        D();
        E();
        t7.y.d(str);
        p1 p1Var = (p1) this.f2053w;
        x7.a aVar = p1Var.F;
        v0 v0Var = p1Var.A;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e0 e0Var = f0.f7528v0;
        long jLongValue = jCurrentTimeMillis - ((Long) e0Var.a(null)).longValue();
        long j8 = b4Var.f7409w;
        if (j8 < jLongValue || j8 > ((Long) e0Var.a(null)).longValue() + jCurrentTimeMillis) {
            p1.l(v0Var);
            v0Var.E.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", v0.L(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j8));
        }
        p1.l(v0Var);
        v0Var.J.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b4Var.f7408v);
        contentValues.put("source", Integer.valueOf(b4Var.f7410x));
        contentValues.put("timestamp_millis", Long.valueOf(j8));
        try {
            if (u0().insert("trigger_uris", null, contentValues) == -1) {
                p1.l(v0Var);
                v0Var.B.b(v0.L(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e7) {
            p1.l(v0Var);
            v0Var.B.c(v0.L(str), e7, "Error storing trigger URI. appId");
        }
    }

    public final long Z(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e7) {
                v0 v0Var = ((p1) this.f2053w).A;
                p1.l(v0Var);
                v0Var.B.c(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long a0(String str, String[] strArr, long j8) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j8 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e7) {
                v0 v0Var = ((p1) this.f2053w).A;
                p1.l(v0Var);
                v0Var.B.c(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b0(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.u0()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r5 == 0) goto L18
            r5 = 0
            java.lang.String r4 = r1.getString(r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r1.close()
            return r4
        L18:
            r1.close()
            java.lang.String r4 = ""
            return r4
        L1e:
            r4 = move-exception
            goto L32
        L20:
            r5 = move-exception
            java.lang.Object r0 = r3.f2053w     // Catch: java.lang.Throwable -> L1e
            k8.p1 r0 = (k8.p1) r0     // Catch: java.lang.Throwable -> L1e
            k8.v0 r0 = r0.A     // Catch: java.lang.Throwable -> L1e
            k8.p1.l(r0)     // Catch: java.lang.Throwable -> L1e
            k8.t0 r0 = r0.B     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Database error"
            r0.c(r4, r5, r2)     // Catch: java.lang.Throwable -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1e
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.b0(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final void c0(ContentValues contentValues) {
        p1 p1Var = (p1) this.f2053w;
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (contentValues.getAsString("app_id") == null) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.D.b(v0.L("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseU0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                v0Var2.B.c(v0.L("consent_settings"), v0.L("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e7) {
            v0 v0Var3 = p1Var.A;
            p1.l(v0Var3);
            v0Var3.B.d("Error storing into table. key", v0.L("consent_settings"), v0.L("app_id"), e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.s d0(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.d0(java.lang.String, java.lang.String, java.lang.String):k8.s");
    }

    public final void e0(String str, s sVar) {
        p1 p1Var = (p1) this.f2053w;
        t7.y.g(sVar);
        D();
        E();
        ContentValues contentValues = new ContentValues();
        String str2 = sVar.f7742a;
        contentValues.put("app_id", str2);
        contentValues.put("name", sVar.f7743b);
        contentValues.put("lifetime_count", Long.valueOf(sVar.f7744c));
        contentValues.put("current_bundle_count", Long.valueOf(sVar.f7745d));
        contentValues.put("last_fire_timestamp", Long.valueOf(sVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(sVar.f7747g));
        contentValues.put("last_bundled_day", sVar.f7748h);
        contentValues.put("last_sampled_complex_event_id", sVar.i);
        contentValues.put("last_sampling_rate", sVar.f7749j);
        contentValues.put("current_session_count", Long.valueOf(sVar.f7746e));
        Boolean bool = sVar.f7750k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.B.b(v0.L(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.c(v0.L(str2), e7, "Error storing event aggregates. appId");
        }
    }

    public final void f0(String str, String str2) {
        t7.y.d(str2);
        D();
        E();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.c(v0.L(str2), e7, "Error deleting snapshot. appId");
        }
    }

    public final o4 g0(String str, long j8, byte[] bArr, String str2, String str3, int i, int i10, long j9, long j10, long j11) {
        b3 b3Var;
        p1 p1Var = (p1) this.f2053w;
        if (TextUtils.isEmpty(str2)) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.I.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            w9 w9Var = (w9) p4.o0(x9.B(), bArr);
            b3[] b3VarArrValues = b3.values();
            int length = b3VarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    b3Var = b3.B;
                    break;
                }
                b3Var = b3VarArrValues[i11];
                if (b3Var.f7407v == i) {
                    break;
                }
                i11++;
            }
            if (b3Var != b3.f7404x && b3Var != b3.A && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((x9) w9Var.f2653w).u()).iterator();
                while (it.hasNext()) {
                    y9 y9Var = (y9) ((z9) it.next()).l();
                    y9Var.b();
                    ((z9) y9Var.f2653w).Y0(i10);
                    arrayList.add((z9) y9Var.e());
                }
                w9Var.b();
                ((x9) w9Var.f2653w).G();
                w9Var.b();
                ((x9) w9Var.f2653w).F(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        v0 v0Var2 = p1Var.A;
                        p1.l(v0Var2);
                        v0Var2.B.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            return new o4(j8, (x9) w9Var.e(), str2, map, b3Var, j9, j10, j11, i10);
        } catch (IOException e7) {
            v0 v0Var3 = p1Var.A;
            p1.l(v0Var3);
            v0Var3.B.c(str, e7, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String h0() {
        ((p1) this.f2053w).F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) f0.T.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l10 + ")";
        long jLongValue = ((Long) f0.S.a(null)).longValue();
        StringBuilder sb2 = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(") > ");
        String strM = j4.a.m(sb2, jLongValue, ")");
        StringBuilder sb3 = new StringBuilder(str.length() + 5 + strM.length() + 1);
        j4.a.s(sb3, "(", str, " OR ", strM);
        sb3.append(")");
        return sb3.toString();
    }

    public final void j0(String str, d2 d2Var) {
        t7.y.g(str);
        t7.y.g(d2Var);
        D();
        E();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", d2Var.g());
        contentValues.put("consent_source", Integer.valueOf(d2Var.f7441b));
        c0(contentValues);
    }

    public final List k0(String str) {
        List list;
        String string;
        p1 p1Var = (p1) this.f2053w;
        D();
        E();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            sQLiteDatabaseU0.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseU0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                t7.y.g(string);
                            }
                            if (string2 == null) {
                                v0 v0Var = p1Var.A;
                                p1.l(v0Var);
                                v0Var.B.b(v0.L(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j8 = cursorQuery.getLong(2);
                                a8 a8VarU = b8.u();
                                a8VarU.b();
                                ((b8) a8VarU.f2653w).v(string2);
                                a8VarU.b();
                                ((b8) a8VarU.f2653w).y(j8);
                                a8VarU.b();
                                ((b8) a8VarU.f2653w).x(string);
                                if (zIsEmpty) {
                                    a8VarU.b();
                                    ((b8) a8VarU.f2653w).w();
                                }
                                arrayList.add((b8) a8VarU.e());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseU0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseU0.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseU0.setTransactionSuccessful();
                        list = arrayList;
                    }
                } catch (SQLiteException e7) {
                    v0 v0Var2 = p1Var.A;
                    p1.l(v0Var2);
                    v0Var2.B.c(v0.L(str), e7, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabaseU0.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseU0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e10) {
            v0 v0Var3 = p1Var.A;
            p1.l(v0Var3);
            v0Var3.B.c(v0.L(str), e10, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void l0(String str, d2 d2Var) {
        t7.y.g(str);
        D();
        E();
        j0(str, X(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", d2Var.g());
        c0(contentValues);
    }

    public final d2 m0(String str) {
        t7.y.g(str);
        D();
        E();
        return d2.c(100, b0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final s n0(String str, r9 r9Var, String str2) {
        s sVarD0 = d0("events", str, r9Var.z());
        if (sVarD0 != null) {
            long j8 = sVarD0.f7746e + 1;
            long j9 = sVarD0.f7745d + 1;
            return new s(sVarD0.f7742a, sVarD0.f7743b, sVarD0.f7744c + 1, j9, j8, sVarD0.f, sVarD0.f7747g, sVarD0.f7748h, sVarD0.i, sVarD0.f7749j, sVarD0.f7750k);
        }
        p1 p1Var = (p1) this.f2053w;
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.E.c(v0.L(str), p1Var.E.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new s(str, r9Var.z(), 1L, 1L, 1L, r9Var.B(), 0L, null, null, null, null);
    }

    public final boolean o0() {
        return ((p1) this.f2053w).f7692v.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d A[Catch: all -> 0x007a, SQLiteException -> 0x007d, LOOP:0: B:66:0x018d->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00f0, B:43:0x0102, B:44:0x0106, B:45:0x0116, B:47:0x011c, B:48:0x012c, B:60:0x015a, B:63:0x0162, B:64:0x016d, B:66:0x018d, B:67:0x019b, B:68:0x01a5, B:73:0x01e3, B:72:0x01d3, B:76:0x01ea, B:53:0x0147, B:78:0x01fc, B:82:0x020f, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:89:0x0018 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(java.lang.String r21, long r22, long r24, e6.c r26) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.p0(java.lang.String, long, long, e6.c):void");
    }

    public final void r0() {
        E();
        u0().beginTransaction();
    }

    public final void s0() {
        E();
        u0().setTransactionSuccessful();
    }

    public final void t0() {
        E();
        u0().endTransaction();
    }

    public final SQLiteDatabase u0() {
        D();
        try {
            return this.f7638z.getWritableDatabase();
        } catch (SQLiteException e7) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.E.b(e7, "Error opening database");
            throw e7;
        }
    }

    public final void v0(String str) {
        s sVarD0;
        f0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (sVarD0 = d0("events", str, string)) != null) {
                            e0("events_snapshot", sVarD0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e7) {
                v0 v0Var = ((p1) this.f2053w).A;
                p1.l(v0Var);
                v0Var.B.c(v0.L(str), e7, "Error creating snapshot. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.w0(java.lang.String):void");
    }

    public final void x0(String str, String str2) {
        t7.y.d(str);
        t7.y.d(str2);
        D();
        E();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            p1 p1Var = (p1) this.f2053w;
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.d("Error deleting user property. appId", v0.L(str), p1Var.E.c(str2), e7);
        }
    }

    public final boolean y0(r4 r4Var) {
        p1 p1Var = (p1) this.f2053w;
        String str = r4Var.f7738b;
        D();
        E();
        String str2 = r4Var.f7737a;
        String str3 = r4Var.f7739c;
        if (z0(str2, str3) == null) {
            if (t4.E0(str3)) {
                if (Z("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(p1Var.f7695y.M(str2, f0.W), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jZ = Z("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                p1Var.getClass();
                if (jZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(r4Var.f7740d));
        q0(contentValues, r4Var.f7741e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.b(v0.L(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.B.c(v0.L(str2), e7, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.r4 z0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f2053w
            r1 = r0
            k8.p1 r1 = (k8.p1) r1
            t7.y.d(r12)
            t7.y.d(r13)
            r11.D()
            r11.E()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.u0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.Q(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            k8.r4 r4 = new k8.r4     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            k8.v0 r12 = r1.A     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            k8.p1.l(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            k8.t0 r12 = r12.B     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            k8.u0 r0 = k8.v0.L(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.b(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            k8.v0 r13 = r1.A     // Catch: java.lang.Throwable -> L67
            k8.p1.l(r13)     // Catch: java.lang.Throwable -> L67
            k8.t0 r13 = r13.B     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            k8.u0 r4 = k8.v0.L(r5)     // Catch: java.lang.Throwable -> L67
            k8.q0 r1 = r1.E     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r13.d(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.z0(java.lang.String, java.lang.String):k8.r4");
    }
}
