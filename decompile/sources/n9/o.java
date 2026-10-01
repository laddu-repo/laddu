package n9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t8;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends z3 {
    public static final String[] D = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] E = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] F = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] G = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] H = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] I = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] J = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] K = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] L = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] M = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] N = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final n B;
    public final d2.i C;

    public o(e4 e4Var) {
        super(e4Var);
        this.C = new d2.i(((n1) this.f4301y).H);
        ((n1) this.f4301y).getClass();
        this.B = new n(this, ((n1) this.f4301y).f9413x);
    }

    public static final String I1(List list) {
        if (list.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return h8.c.m(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void Q1(ContentValues contentValues, Object obj) {
        w8.x.d("value");
        w8.x.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final long A1(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = U1().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e10) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                u0Var.D.c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String B1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = U1().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return HttpUrl.FRAGMENT_ENCODE_SET;
            } catch (SQLiteException e10) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                u0Var.D.c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void C1(ContentValues contentValues) {
        n1 n1Var = (n1) this.f4301y;
        try {
            SQLiteDatabase U1 = U1();
            if (contentValues.getAsString("app_id") == null) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.F.b(u0.l1("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (U1.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && U1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.D.c(u0.l1("consent_settings"), u0.l1("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e10) {
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            u0Var3.D.d("Error storing into table. key", u0.l1("consent_settings"), u0.l1("app_id"), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.s D1(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.D1(java.lang.String, java.lang.String, java.lang.String):n9.s");
    }

    public final void E1(String str, s sVar) {
        Long l10;
        n1 n1Var = (n1) this.f4301y;
        w8.x.g(sVar);
        d1();
        e1();
        ContentValues contentValues = new ContentValues();
        String str2 = sVar.f9459a;
        contentValues.put("app_id", str2);
        contentValues.put(MediationMetaData.KEY_NAME, sVar.f9460b);
        contentValues.put("lifetime_count", Long.valueOf(sVar.f9461c));
        contentValues.put("current_bundle_count", Long.valueOf(sVar.f9462d));
        contentValues.put("last_fire_timestamp", Long.valueOf(sVar.f9464f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(sVar.f9465g));
        contentValues.put("last_bundled_day", sVar.f9466h);
        contentValues.put("last_sampled_complex_event_id", sVar.f9467i);
        contentValues.put("last_sampling_rate", sVar.j);
        contentValues.put("current_session_count", Long.valueOf(sVar.f9463e));
        Boolean bool = sVar.f9468k;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (U1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.D.b(u0.l1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.c(u0.l1(str2), e10, "Error storing event aggregates. appId");
        }
    }

    public final void F1(String str, String str2) {
        w8.x.d(str2);
        d1();
        e1();
        try {
            U1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.c(u0.l1(str2), e10, "Error deleting snapshot. appId");
        }
    }

    public final f4 G1(String str, long j, byte[] bArr, String str2, String str3, int i6, int i10, long j10, long j11, long j12) {
        t2 t2Var;
        n1 n1Var = (n1) this.f4301y;
        if (TextUtils.isEmpty(str2)) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.K.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) y0.Q1(com.google.android.gms.internal.measurement.i3.w(), bArr);
            t2[] values = t2.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    t2Var = values[i11];
                    if (t2Var.f9488x == i6) {
                        break;
                    }
                    i11++;
                } else {
                    t2Var = t2.UNKNOWN;
                    break;
                }
            }
            if (t2Var != t2.GOOGLE_SIGNAL && t2Var != t2.GOOGLE_SIGNAL_PENDING && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var.f2337y).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.j3 j3Var = (com.google.android.gms.internal.measurement.j3) ((com.google.android.gms.internal.measurement.k3) it.next()).i();
                    j3Var.b();
                    ((com.google.android.gms.internal.measurement.k3) j3Var.f2337y).T0(i10);
                    arrayList.add((com.google.android.gms.internal.measurement.k3) j3Var.e());
                }
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.f2337y).B();
                h3Var.b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.f2337y).A(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.D.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            return new f4(j, (com.google.android.gms.internal.measurement.i3) h3Var.e(), str2, hashMap, t2Var, j10, j11, j12, i10);
        } catch (IOException e10) {
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            u0Var3.D.c(str, e10, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String H1() {
        ((n1) this.f4301y).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) e0.T.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l10 + ")";
        long longValue = ((Long) e0.S.a(null)).longValue();
        StringBuilder sb2 = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
        sb2.append(currentTimeMillis);
        sb2.append(") > ");
        String m9 = r4.a.m(sb2, longValue, ")");
        StringBuilder sb3 = new StringBuilder(str.length() + 5 + m9.length() + 1);
        r4.a.u(sb3, "(", str, " OR ", m9);
        sb3.append(")");
        return sb3.toString();
    }

    public final void J1(String str, t3 t3Var) {
        d1();
        e1();
        w8.x.d(str);
        n1 n1Var = (n1) this.f4301y;
        a9.a aVar = n1Var.H;
        u0 u0Var = n1Var.C;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        d0 d0Var = e0.f9278w0;
        long longValue = currentTimeMillis - ((Long) d0Var.a(null)).longValue();
        long j = t3Var.f9490y;
        if (j < longValue || j > ((Long) d0Var.a(null)).longValue() + currentTimeMillis) {
            n1.g(u0Var);
            u0Var.G.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", u0.l1(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        n1.g(u0Var);
        u0Var.L.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", t3Var.f9489x);
        contentValues.put("source", Integer.valueOf(t3Var.f9491z));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (U1().insert("trigger_uris", null, contentValues) == -1) {
                n1.g(u0Var);
                u0Var.D.b(u0.l1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e10) {
            n1.g(u0Var);
            u0Var.D.c(u0.l1(str), e10, "Error storing trigger URI. appId");
        }
    }

    public final void K1(String str, z1 z1Var) {
        w8.x.g(str);
        w8.x.g(z1Var);
        d1();
        e1();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", z1Var.g());
        contentValues.put("consent_source", Integer.valueOf(z1Var.f9571b));
        C1(contentValues);
    }

    public final void L1(String str, z1 z1Var) {
        w8.x.g(str);
        d1();
        e1();
        K1(str, y1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", z1Var.g());
        C1(contentValues);
    }

    public final z1 M1(String str) {
        w8.x.g(str);
        d1();
        e1();
        return z1.c(100, B1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final s N1(String str, com.google.android.gms.internal.measurement.c3 c3Var, String str2) {
        s D1 = D1("events", str, c3Var.s());
        if (D1 == null) {
            n1 n1Var = (n1) this.f4301y;
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.c(u0.l1(str), n1Var.G.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
            return new s(str, c3Var.s(), 1L, 1L, 1L, c3Var.u(), 0L, null, null, null, null);
        }
        long j = D1.f9463e + 1;
        long j10 = D1.f9462d + 1;
        return new s(D1.f9459a, D1.f9460b, D1.f9461c + 1, j10, j, D1.f9464f, D1.f9465g, D1.f9466h, D1.f9467i, D1.j, D1.f9468k);
    }

    public final boolean O1() {
        return ((n1) this.f4301y).f9413x.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ee A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P1(java.lang.String r20, long r21, long r23, i4.m0 r25) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.P1(java.lang.String, long, long, i4.m0):void");
    }

    public final void R1() {
        e1();
        U1().beginTransaction();
    }

    public final void S1() {
        e1();
        U1().setTransactionSuccessful();
    }

    public final void T1() {
        e1();
        U1().endTransaction();
    }

    public final SQLiteDatabase U1() {
        d1();
        try {
            return this.B.getWritableDatabase();
        } catch (SQLiteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.G.b(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r1 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = D1("events", r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        E1("events_snapshot", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V1(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.F1(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.U1()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L61
        L2f:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            java.lang.String r3 = "events"
            n9.s r1 = r12.D1(r3, r13, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            r12.E1(r0, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            goto L46
        L41:
            r0 = move-exception
            r13 = r0
            goto L67
        L44:
            r0 = move-exception
            goto L4d
        L46:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 != 0) goto L2f
            goto L61
        L4d:
            java.lang.Object r1 = r12.f4301y     // Catch: java.lang.Throwable -> L41
            n9.n1 r1 = (n9.n1) r1     // Catch: java.lang.Throwable -> L41
            n9.u0 r1 = r1.C     // Catch: java.lang.Throwable -> L41
            n9.n1.g(r1)     // Catch: java.lang.Throwable -> L41
            n9.s0 r1 = r1.D     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Error creating snapshot. appId"
            n9.t0 r13 = n9.u0.l1(r13)     // Catch: java.lang.Throwable -> L41
            r1.c(r13, r0, r3)     // Catch: java.lang.Throwable -> L41
        L61:
            if (r2 == 0) goto L66
            r2.close()
        L66:
            return
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.V1(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        E1("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W1(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.W1(java.lang.String):void");
    }

    public final void X1(String str, String str2) {
        w8.x.d(str);
        w8.x.d(str2);
        d1();
        e1();
        try {
            U1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            n1 n1Var = (n1) this.f4301y;
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.d("Error deleting user property. appId", u0.l1(str), n1Var.G.c(str2), e10);
        }
    }

    public final boolean Y1(h4 h4Var) {
        n1 n1Var = (n1) this.f4301y;
        String str = h4Var.f9341b;
        d1();
        e1();
        String str2 = h4Var.f9340a;
        String str3 = h4Var.f9342c;
        if (Z1(str2, str3) == null) {
            if (j4.c2(str3)) {
                if (z1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(n1Var.A.l1(str2, e0.W), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long z12 = z1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                n1Var.getClass();
                if (z12 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put(MediationMetaData.KEY_NAME, str3);
        contentValues.put("set_timestamp", Long.valueOf(h4Var.f9343d));
        Q1(contentValues, h4Var.f9344e);
        try {
            if (U1().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.D.b(u0.l1(str2), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.c(u0.l1(str2), e10, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.h4 Z1(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4301y
            r1 = r0
            n9.n1 r1 = (n9.n1) r1
            w8.x.d(r12)
            w8.x.d(r13)
            r11.d1()
            r11.e1()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.U1()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
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
            java.lang.Object r10 = r11.q1(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            n9.h4 r4 = new n9.h4     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            n9.u0 r12 = r1.C     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            n9.n1.g(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            n9.s0 r12 = r12.D     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            n9.t0 r0 = n9.u0.l1(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
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
            n9.u0 r13 = r1.C     // Catch: java.lang.Throwable -> L67
            n9.n1.g(r13)     // Catch: java.lang.Throwable -> L67
            n9.s0 r13 = r13.D     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            n9.t0 r4 = n9.u0.l1(r5)     // Catch: java.lang.Throwable -> L67
            n9.p0 r1 = r1.G     // Catch: java.lang.Throwable -> L67
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
        throw new UnsupportedOperationException("Method not decompiled: n9.o.Z1(java.lang.String, java.lang.String):n9.h4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a2(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f4301y
            r1 = r0
            n9.n1 r1 = (n9.n1) r1
            w8.x.d(r13)
            r12.d1()
            r12.e1()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.U1()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 == 0) goto L9c
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L52
        L4f:
            r0 = move-exception
            r4 = r13
            goto L8a
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 3
            java.lang.Object r9 = r12.q1(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            n9.u0 r2 = r1.C     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            n9.n1.g(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            n9.s0 r2 = r2.D     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            n9.t0 r4 = n9.u0.l1(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.b(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            n9.h4 r3 = new n9.h4     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9c
        L83:
            r13 = r4
            goto L3f
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            r4 = r13
            r13 = r0
        L8a:
            n9.u0 r13 = r1.C     // Catch: java.lang.Throwable -> L70
            n9.n1.g(r13)     // Catch: java.lang.Throwable -> L70
            n9.s0 r13 = r13.D     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            n9.t0 r2 = n9.u0.l1(r4)     // Catch: java.lang.Throwable -> L70
            r13.c(r2, r0, r1)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r0
        La2:
            if (r11 == 0) goto La7
            r11.close()
        La7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.a2(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        n9.n1.g(r13);
        r13.D.b(java.lang.Integer.valueOf(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b2(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.b2(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean c2(e eVar) {
        n1 n1Var = (n1) this.f4301y;
        d1();
        e1();
        String str = eVar.f9223x;
        w8.x.g(str);
        if (Z1(str, eVar.f9225z.f9332y) == null) {
            long z12 = z1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            n1Var.getClass();
            if (z12 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f9224y);
        contentValues.put(MediationMetaData.KEY_NAME, eVar.f9225z.f9332y);
        Object a10 = eVar.f9225z.a();
        w8.x.g(a10);
        Q1(contentValues, a10);
        contentValues.put("active", Boolean.valueOf(eVar.B));
        contentValues.put("trigger_event_name", eVar.C);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.E));
        v vVar = eVar.D;
        j4 j4Var = n1Var.F;
        u0 u0Var = n1Var.C;
        n1.e(j4Var);
        contentValues.put("timed_out_event", j4.I1(vVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.A));
        n1.e(j4Var);
        contentValues.put("triggered_event", j4.I1(eVar.F));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f9225z.f9333z));
        contentValues.put("time_to_live", Long.valueOf(eVar.G));
        contentValues.put("expired_event", j4.I1(eVar.H));
        try {
            if (U1().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                n1.g(u0Var);
                u0Var.D.b(u0.l1(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            n1.g(u0Var);
            u0Var.D.c(u0.l1(str), e10, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.e d2(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.d2(java.lang.String, java.lang.String):n9.e");
    }

    public final void e2(String str, String str2) {
        w8.x.d(str);
        w8.x.d(str2);
        d1();
        e1();
        try {
            U1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            n1 n1Var = (n1) this.f4301y;
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.d("Error deleting conditional property", u0.l1(str), n1Var.G.c(str2), e10);
        }
    }

    public final List f2(String str, String str2, String str3) {
        w8.x.d(str);
        d1();
        e1();
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
        return g2(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r20 = r12.getString(5);
        r22 = r12.getLong(6);
        r3 = r28.f9511z.D;
        n9.e4.P(r3);
        r4 = r12.getBlob(7);
        r5 = n9.v.CREATOR;
        r21 = (n9.v) r3.I1(r4, r5);
        r17 = r12.getLong(8);
        n9.e4.P(r3);
        r24 = (n9.v) r3.I1(r12.getBlob(9), r5);
        r6 = r12.getLong(10);
        r25 = r12.getLong(11);
        n9.e4.P(r3);
        r0.add(new n9.e(r14, r15, new n9.g4(r6, r8, r9, r15), r17, r19, r20, r21, r22, r24, r25, (n9.v) r3.I1(r12.getBlob(12), r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f9, code lost:
    
        if (r12.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.C;
        n9.n1.g(r3);
        r3.D.b(java.lang.Integer.valueOf(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (r12.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.size() < 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        r14 = r12.getString(0);
        r15 = r12.getString(1);
        r9 = r12.getString(2);
        r8 = q1(r12, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r12.getInt(4) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List g2(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.g2(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final long h1(String str, com.google.android.gms.internal.measurement.i3 i3Var, String str2, Map map, t2 t2Var, Long l10) {
        int delete;
        n1 n1Var = (n1) this.f4301y;
        d1();
        e1();
        w8.x.g(i3Var);
        w8.x.d(str);
        d1();
        e1();
        if (O1()) {
            e4 e4Var = this.f9511z;
            long c10 = e4Var.F.D.c();
            a9.a aVar = n1Var.H;
            u0 u0Var = n1Var.C;
            aVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - c10) > ((Long) e0.N.a(null)).longValue()) {
                e4Var.F.D.h(elapsedRealtime);
                d1();
                e1();
                if (O1() && (delete = U1().delete("upload_queue", H1(), new String[0])) > 0) {
                    n1.g(u0Var);
                    u0Var.L.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                w8.x.d(str);
                d1();
                e1();
                try {
                    int l12 = n1Var.A.l1(str, e0.A);
                    if (l12 > 0) {
                        U1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(l12)});
                    }
                } catch (SQLiteException e10) {
                    n1.g(u0Var);
                    u0Var.D.c(u0.l1(str), e10, "Error deleting over the limit queued batches. appId");
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
        byte[] a10 = i3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", a10);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(t2Var.f9488x));
        a9.a aVar2 = n1Var.H;
        u0 u0Var2 = n1Var.C;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long insert = U1().insert("upload_queue", null, contentValues);
            if (insert == -1) {
                n1.g(u0Var2);
                u0Var2.D.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                return -1L;
            }
            return insert;
        } catch (SQLiteException e11) {
            n1.g(u0Var2);
            u0Var2.D.c(str, e11, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.z0 h2(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.h2(java.lang.String):n9.z0");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List i1(java.lang.String r19, n9.x3 r20, int r21) {
        /*
            r18 = this;
            w8.x.d(r19)
            r18.d1()
            r18.e1()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.U1()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r6 = r20
            java.util.List r6 = r6.f9529x     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = I1(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.H1()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r6.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L66
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = r0
            goto L67
        L66:
            r11 = r2
        L67:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
        L72:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto Lb9
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r3 = r18
            r4 = r19
            n9.f4 r1 = r3.G1(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto L72
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto L72
        Lb5:
            r0 = move-exception
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Lbf
        Lb9:
            r3 = r18
            goto Ld5
        Lbc:
            r3 = r18
            goto Ldc
        Lbf:
            r3 = r18
            java.lang.Object r1 = r3.f4301y     // Catch: java.lang.Throwable -> Ldb
            n9.n1 r1 = (n9.n1) r1     // Catch: java.lang.Throwable -> Ldb
            n9.u0 r1 = r1.C     // Catch: java.lang.Throwable -> Ldb
            n9.n1.g(r1)     // Catch: java.lang.Throwable -> Ldb
            n9.s0 r1 = r1.D     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.c(r5, r0, r4)     // Catch: java.lang.Throwable -> Ldb
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r2 == 0) goto Lda
            r2.close()
        Lda:
            return r0
        Ldb:
            r0 = move-exception
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.i1(java.lang.String, n9.x3, int):java.util.List");
    }

    public final void i2(z0 z0Var, boolean z10) {
        n1 n1Var = (n1) this.f4301y;
        n1 n1Var2 = z0Var.f9545a;
        d1();
        e1();
        String D2 = z0Var.D();
        w8.x.g(D2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", D2);
        y1 y1Var = y1.ANALYTICS_STORAGE;
        e4 e4Var = this.f9511z;
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (e4Var.a(D2).i(y1Var)) {
            contentValues.put("app_instance_id", z0Var.E());
        }
        contentValues.put("gmp_app_id", z0Var.G());
        if (e4Var.a(D2).i(y1.AD_STORAGE)) {
            l1 l1Var = n1Var2.D;
            n1.g(l1Var);
            l1Var.d1();
            contentValues.put("resettable_device_id_hash", z0Var.f9549e);
        }
        l1 l1Var2 = n1Var2.D;
        n1.g(l1Var2);
        l1Var2.d1();
        contentValues.put("last_bundle_index", Long.valueOf(z0Var.f9551g));
        l1 l1Var3 = n1Var2.D;
        n1.g(l1Var3);
        l1Var3.d1();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(z0Var.f9552h));
        l1 l1Var4 = n1Var2.D;
        n1.g(l1Var4);
        l1Var4.d1();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(z0Var.f9553i));
        contentValues.put("app_version", z0Var.N());
        l1 l1Var5 = n1Var2.D;
        n1.g(l1Var5);
        l1Var5.d1();
        contentValues.put("app_store", z0Var.f9555l);
        l1 l1Var6 = n1Var2.D;
        n1.g(l1Var6);
        l1Var6.d1();
        contentValues.put("gmp_version", Long.valueOf(z0Var.f9556m));
        l1 l1Var7 = n1Var2.D;
        n1.g(l1Var7);
        l1Var7.d1();
        contentValues.put("dev_cert_hash", Long.valueOf(z0Var.f9557n));
        l1 l1Var8 = n1Var2.D;
        n1.g(l1Var8);
        l1Var8.d1();
        contentValues.put("measurement_enabled", Boolean.valueOf(z0Var.f9558o));
        l1 l1Var9 = n1Var2.D;
        l1 l1Var10 = n1Var2.D;
        n1.g(l1Var9);
        l1Var9.d1();
        contentValues.put("day", Long.valueOf(z0Var.J));
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("daily_public_events_count", Long.valueOf(z0Var.K));
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("daily_events_count", Long.valueOf(z0Var.L));
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("daily_conversions_count", Long.valueOf(z0Var.M));
        l1 l1Var11 = n1Var2.D;
        n1.g(l1Var11);
        l1Var11.d1();
        contentValues.put("config_fetched_time", Long.valueOf(z0Var.R));
        l1 l1Var12 = n1Var2.D;
        n1.g(l1Var12);
        l1Var12.d1();
        contentValues.put("failed_config_fetch_time", Long.valueOf(z0Var.S));
        contentValues.put("app_version_int", Long.valueOf(z0Var.P()));
        contentValues.put("firebase_instance_id", z0Var.J());
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("daily_error_events_count", Long.valueOf(z0Var.N));
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("daily_realtime_events_count", Long.valueOf(z0Var.O));
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("health_monitor_sample", z0Var.P);
        contentValues.put("android_id", (Long) 0L);
        l1 l1Var13 = n1Var2.D;
        n1.g(l1Var13);
        l1Var13.d1();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(z0Var.f9559p));
        contentValues.put("dynamite_version", Long.valueOf(z0Var.b()));
        if (e4Var.a(D2).i(y1Var)) {
            l1 l1Var14 = n1Var2.D;
            n1.g(l1Var14);
            l1Var14.d1();
            contentValues.put("session_stitching_token", z0Var.f9562t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(z0Var.y()));
        l1 l1Var15 = n1Var2.D;
        n1.g(l1Var15);
        l1Var15.d1();
        contentValues.put("target_os_version", Long.valueOf(z0Var.f9564v));
        l1 l1Var16 = n1Var2.D;
        n1.g(l1Var16);
        l1Var16.d1();
        contentValues.put("session_stitching_token_hash", Long.valueOf(z0Var.f9565w));
        t8.a();
        g gVar = n1Var.A;
        u0 u0Var = n1Var.C;
        if (gVar.n1(D2, e0.Q0)) {
            l1 l1Var17 = n1Var2.D;
            n1.g(l1Var17);
            l1Var17.d1();
            contentValues.put("ad_services_version", Integer.valueOf(z0Var.f9566x));
            l1 l1Var18 = n1Var2.D;
            n1.g(l1Var18);
            l1Var18.d1();
            contentValues.put("attribution_eligibility_status", Long.valueOf(z0Var.B));
        }
        l1 l1Var19 = n1Var2.D;
        n1.g(l1Var19);
        l1Var19.d1();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(z0Var.f9567y));
        contentValues.put("npa_metadata_value", z0Var.w());
        l1 l1Var20 = n1Var2.D;
        n1.g(l1Var20);
        l1Var20.d1();
        contentValues.put("bundle_delivery_index", Long.valueOf(z0Var.F));
        contentValues.put("sgtm_preview_key", z0Var.C());
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("dma_consent_state", Integer.valueOf(z0Var.D));
        n1.g(l1Var10);
        l1Var10.d1();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(z0Var.E));
        contentValues.put("serialized_npa_metadata", z0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(z0Var.t()));
        l1 l1Var21 = n1Var2.D;
        n1.g(l1Var21);
        l1Var21.d1();
        ArrayList arrayList = z0Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                n1.g(u0Var);
                u0Var.G.b(D2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (n1Var.A.n1(null, e0.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        l1 l1Var22 = n1Var2.D;
        n1.g(l1Var22);
        l1Var22.d1();
        contentValues.put("unmatched_pfo", z0Var.f9568z);
        l1 l1Var23 = n1Var2.D;
        n1.g(l1Var23);
        l1Var23.d1();
        contentValues.put("unmatched_uwa", z0Var.A);
        l1 l1Var24 = n1Var2.D;
        n1.g(l1Var24);
        l1Var24.d1();
        contentValues.put("ad_campaign_info", z0Var.H);
        try {
            SQLiteDatabase U1 = U1();
            if (U1.update("apps", contentValues, "app_id = ?", new String[]{D2}) == 0 && U1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                n1.g(u0Var);
                u0Var.D.b(u0.l1(D2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            n1.g(u0Var);
            u0Var.D.c(u0.l1(D2), e10, "Error storing app. appId");
        }
    }

    public final boolean j1(String str) {
        t2[] t2VarArr = {t2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(t2VarArr[0].f9488x));
        String I1 = I1(arrayList);
        String H1 = H1();
        StringBuilder sb2 = new StringBuilder(I1.length() + 61 + H1.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(I1);
        sb2.append(" AND NOT ");
        sb2.append(H1);
        if (z1(sb2.toString(), new String[]{str}) != 0) {
            return true;
        }
        return false;
    }

    public final k j2(long j, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return k2(j, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    public final void k1(Long l10) {
        n1 n1Var = (n1) this.f4301y;
        d1();
        e1();
        try {
            if (U1().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.G.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.b(e10, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e10;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n9.k] */
    public final k k2(long j, String str, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        n1 n1Var = (n1) this.f4301y;
        w8.x.d(str);
        d1();
        e1();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase U1 = U1();
                cursor = U1.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    u0 u0Var = n1Var.C;
                    n1.g(u0Var);
                    u0Var.G.b(u0.l1(str), "Not updating daily counts, app is not known. appId");
                } else {
                    if (cursor.getLong(0) == j) {
                        obj.f9364b = cursor.getLong(1);
                        obj.f9363a = cursor.getLong(2);
                        obj.f9365c = cursor.getLong(3);
                        obj.f9366d = cursor.getLong(4);
                        obj.f9367e = cursor.getLong(5);
                        obj.f9368f = cursor.getLong(6);
                        obj.f9369g = cursor.getLong(7);
                    }
                    if (z10) {
                        obj.f9364b += j10;
                    }
                    if (z11) {
                        obj.f9363a += j10;
                    }
                    if (z12) {
                        obj.f9365c += j10;
                    }
                    if (z13) {
                        obj.f9366d += j10;
                    }
                    if (z14) {
                        obj.f9367e += j10;
                    }
                    if (z15) {
                        obj.f9368f += j10;
                    }
                    if (z16) {
                        obj.f9369g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.f9363a));
                    contentValues.put("daily_events_count", Long.valueOf(obj.f9364b));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.f9365c));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.f9366d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.f9367e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f9368f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.f9369g));
                    U1.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e10) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.D.c(u0.l1(str), e10, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l1() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.U1()
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
            java.lang.Object r3 = r6.f4301y     // Catch: java.lang.Throwable -> L1a
            n9.n1 r3 = (n9.n1) r3     // Catch: java.lang.Throwable -> L1a
            n9.u0 r3 = r3.C     // Catch: java.lang.Throwable -> L1a
            n9.n1.g(r3)     // Catch: java.lang.Throwable -> L1a
            n9.s0 r3 = r3.D     // Catch: java.lang.Throwable -> L1a
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
        throw new UnsupportedOperationException("Method not decompiled: n9.o.l1():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:27:0x006b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.j l2(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4301y
            r1 = r0
            n9.n1 r1 = (n9.n1) r1
            w8.x.d(r12)
            r11.d1()
            r11.e1()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.U1()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L82
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            n9.u0 r6 = r1.C     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            n9.n1.g(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            n9.s0 r6 = r6.D     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            n9.t0 r8 = n9.u0.l1(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.b(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6b
        L5c:
            r0 = move-exception
            goto L72
        L5e:
            if (r0 != 0) goto L61
            goto L82
        L61:
            n9.j r6 = new n9.j     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6b:
            r2 = r3
            goto L88
        L6d:
            r0 = move-exception
            r12 = r0
            goto L88
        L70:
            r0 = move-exception
            r3 = r2
        L72:
            n9.u0 r1 = r1.C     // Catch: java.lang.Throwable -> L59
            n9.n1.g(r1)     // Catch: java.lang.Throwable -> L59
            n9.s0 r1 = r1.D     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            n9.t0 r12 = n9.u0.l1(r12)     // Catch: java.lang.Throwable -> L59
            r1.c(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
        L82:
            if (r3 == 0) goto L87
            r3.close()
        L87:
            return r2
        L88:
            if (r2 == 0) goto L8d
            r2.close()
        L8d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.l2(java.lang.String):n9.j");
    }

    public final void m1(long j) {
        d1();
        e1();
        try {
            if (U1().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.b(e10, "Failed to delete a bundle in a queue table");
            throw e10;
        }
    }

    public final void m2(com.google.android.gms.internal.measurement.k3 k3Var, boolean z10) {
        d1();
        e1();
        w8.x.d(k3Var.p());
        if (k3Var.b2()) {
            n1();
            n1 n1Var = (n1) this.f4301y;
            a9.a aVar = n1Var.H;
            u0 u0Var = n1Var.C;
            aVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long c22 = k3Var.c2();
            d0 d0Var = e0.S;
            if (c22 < currentTimeMillis - ((Long) d0Var.a(null)).longValue() || k3Var.c2() > ((Long) d0Var.a(null)).longValue() + currentTimeMillis) {
                n1.g(u0Var);
                u0Var.G.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", u0.l1(k3Var.p()), Long.valueOf(currentTimeMillis), Long.valueOf(k3Var.c2()));
            }
            byte[] a10 = k3Var.a();
            try {
                y0 y0Var = this.f9511z.D;
                e4.P(y0Var);
                byte[] P1 = y0Var.P1(a10);
                n1.g(u0Var);
                u0Var.L.b(Integer.valueOf(P1.length), "Saving bundle, size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", k3Var.p());
                contentValues.put("bundle_end_timestamp", Long.valueOf(k3Var.c2()));
                contentValues.put(JsonStorageKeyNames.DATA_KEY, P1);
                contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
                if (k3Var.p0()) {
                    contentValues.put("retry_count", Integer.valueOf(k3Var.q0()));
                }
                try {
                    if (U1().insert("queue", null, contentValues) == -1) {
                        n1.g(u0Var);
                        u0Var.D.b(u0.l1(k3Var.p()), "Failed to insert bundle (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e10) {
                    n1.g(u0Var);
                    u0Var.D.c(u0.l1(k3Var.p()), e10, "Error storing bundle. appId");
                    return;
                }
            } catch (IOException e11) {
                n1.g(u0Var);
                u0Var.D.c(u0.l1(k3Var.p()), e11, "Data loss. Failed to serialize bundle. appId");
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void n1() {
        d1();
        e1();
        if (O1()) {
            e4 e4Var = this.f9511z;
            long c10 = e4Var.F.C.c();
            n1 n1Var = (n1) this.f4301y;
            n1Var.H.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - c10) > ((Long) e0.N.a(null)).longValue()) {
                e4Var.F.C.h(elapsedRealtime);
                d1();
                e1();
                if (O1()) {
                    SQLiteDatabase U1 = U1();
                    n1Var.H.getClass();
                    int delete = U1.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) e0.S.a(null)).longValue())});
                    if (delete > 0) {
                        u0 u0Var = n1Var.C;
                        n1.g(u0Var);
                        u0Var.L.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void o1(ArrayList arrayList) {
        n1 n1Var = (n1) this.f4301y;
        d1();
        e1();
        w8.x.g(arrayList);
        if (arrayList.size() != 0) {
            if (!O1()) {
                return;
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (z1(sb4.toString(), null) > 0) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.G.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase U1 = U1();
                StringBuilder sb5 = new StringBuilder(sb3.length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                U1.execSQL(sb5.toString());
                return;
            } catch (SQLiteException e10) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.D.b(e10, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final void p1(Long l10) {
        n1 n1Var = (n1) this.f4301y;
        d1();
        e1();
        if (!O1()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
        sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        sb2.append(l10);
        sb2.append(" AND retry_count =  2147483647 LIMIT 1");
        if (z1(sb2.toString(), null) > 0) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase U1 = U1();
            n1Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb3 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
            sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
            sb3.append(currentTimeMillis);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l10.toString().length() + 29);
            sb5.append("UPDATE upload_queue");
            sb5.append(sb4);
            sb5.append(" WHERE rowid = ");
            sb5.append(l10);
            sb5.append(" AND retry_count < 2147483647");
            U1.execSQL(sb5.toString());
        } catch (SQLiteException e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.D.b(e10, "Error incrementing retry count. error");
        }
    }

    public final Object q1(Cursor cursor, int i6) {
        n1 n1Var = (n1) this.f4301y;
        int type = cursor.getType(i6);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            u0 u0Var = n1Var.C;
                            n1.g(u0Var);
                            u0Var.D.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.D.a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i6);
                }
                return Double.valueOf(cursor.getDouble(i6));
            }
            return Long.valueOf(cursor.getLong(i6));
        }
        u0 u0Var3 = n1Var.C;
        n1.g(u0Var3);
        u0Var3.D.a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|4|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.C;
        n9.n1.g(r0);
        r0.D.d("Error inserting column. appId", n9.u0.l1(r15), "first_open_count", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r1(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f4301y
            n9.n1 r0 = (n9.n1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            w8.x.d(r15)
            java.lang.String r2 = "first_open_count"
            w8.x.d(r2)
            r14.d1()
            r14.e1()
            android.database.sqlite.SQLiteDatabase r3 = r14.U1()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r14.A1(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = "app2"
            java.lang.String r6 = "app_id"
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L72
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9.put(r6, r15)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r10 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9.put(r2, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r11 = "previous_install_count"
            r9.put(r11, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r10 = 0
            r11 = 5
            long r9 = r3.insertWithOnConflict(r1, r10, r9, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L71
            n9.u0 r1 = r0.C     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            n9.n1.g(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            n9.s0 r1 = r1.D     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            n9.t0 r9 = n9.u0.l1(r15)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.c(r9, r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r15 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11.put(r6, r15)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r12 = 1
            long r12 = r12 + r9
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11.put(r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r1, r11, r6, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            n9.u0 r1 = r0.C     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            n9.n1.g(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            n9.s0 r1 = r1.D     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            n9.t0 r5 = n9.u0.l1(r15)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
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
            n9.u0 r0 = r0.C     // Catch: java.lang.Throwable -> L6d
            n9.n1.g(r0)     // Catch: java.lang.Throwable -> L6d
            n9.s0 r0 = r0.D     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            n9.t0 r15 = n9.u0.l1(r15)     // Catch: java.lang.Throwable -> L6d
            r0.d(r6, r15, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.r1(java.lang.String):long");
    }

    public final boolean s1(String str, String str2) {
        if (z1("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void t1(List list) {
        w8.x.g(list);
        d1();
        e1();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (i6 != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) list.get(i6)).longValue());
        }
        sb2.append(")");
        int delete = U1().delete("raw_events", sb2.toString(), null);
        if (delete != list.size()) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.c(Integer.valueOf(delete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final void u1(String str) {
        try {
            U1().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e10) {
            u0 u0Var = ((n1) this.f4301y).C;
            n1.g(u0Var);
            u0Var.D.c(u0.l1(str), e10, "Failed to remove unused event metadata. appId");
        }
    }

    public final long v1(String str) {
        w8.x.d(str);
        return A1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void w1(String str, Long l10, long j, com.google.android.gms.internal.measurement.c3 c3Var) {
        d1();
        e1();
        w8.x.g(c3Var);
        w8.x.d(str);
        n1 n1Var = (n1) this.f4301y;
        byte[] a10 = c3Var.a();
        u0 u0Var = n1Var.C;
        u0 u0Var2 = n1Var.C;
        n1.g(u0Var);
        u0Var.L.c(n1Var.G.a(str), Integer.valueOf(a10.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a10);
        try {
            if (U1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                n1.g(u0Var2);
                u0Var2.D.b(u0.l1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            n1.g(u0Var2);
            u0Var2.D.c(u0.l1(str), e10, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029c A[Catch: SQLiteException -> 0x02b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02b8, blocks: (B:78:0x0281, B:80:0x029c), top: B:77:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x1(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.x1(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
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
    public final n9.z1 y1(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4301y
            n9.n1 r0 = (n9.n1) r0
            w8.x.g(r5)
            r4.d1()
            r4.e1()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.U1()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            n9.u0 r1 = r0.C     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            n9.n1.g(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            n9.s0 r1 = r1.L     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
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
            n9.z1 r2 = n9.z1.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
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
            n9.u0 r0 = r0.C     // Catch: java.lang.Throwable -> L32
            n9.n1.g(r0)     // Catch: java.lang.Throwable -> L32
            n9.s0 r0 = r0.D     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.b(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            n9.z1 r5 = n9.z1.f9569c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.y1(java.lang.String):n9.z1");
    }

    public final long z1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = U1().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                u0Var.D.c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // n9.z3
    public final void g1() {
    }
}
