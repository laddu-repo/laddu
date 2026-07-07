package k8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c3.e f7624w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        this(context, "google_app_measurement.db");
        this.f7623v = 0;
        this.f7624w = nVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f7623v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                n nVar = (n) this.f7624w;
                p1 p1Var = (p1) nVar.f2053w;
                p1 p1Var2 = (p1) nVar.f2053w;
                p1Var.getClass();
                e3.c cVar = nVar.A;
                if (cVar.f4744w != 0) {
                    ((x7.a) cVar.f4745x).getClass();
                    if (SystemClock.elapsedRealtime() - cVar.f4744w < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((x7.a) cVar.f4745x).getClass();
                    cVar.f4744w = SystemClock.elapsedRealtime();
                    v0 v0Var = p1Var2.A;
                    p1.l(v0Var);
                    v0Var.B.a("Opening the database failed, dropping and recreating it");
                    if (!p1Var2.f7692v.getDatabasePath("google_app_measurement.db").delete()) {
                        v0 v0Var2 = p1Var2.A;
                        p1.l(v0Var2);
                        v0Var2.B.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        cVar.f4744w = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e7) {
                        v0 v0Var3 = p1Var2.A;
                        p1.l(v0Var3);
                        v0Var3.B.b(e7, "Failed to open freshly created database");
                        throw e7;
                    }
                }
            default:
                p0 p0Var = (p0) this.f7624w;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e10) {
                    throw e10;
                } catch (SQLiteException unused2) {
                    p1 p1Var3 = (p1) p0Var.f2053w;
                    v0 v0Var4 = p1Var3.A;
                    p1.l(v0Var4);
                    v0Var4.B.a("Opening the local database failed, dropping and recreating it");
                    if (!p1Var3.f7692v.getDatabasePath("google_app_measurement_local.db").delete()) {
                        v0 v0Var5 = p1Var3.A;
                        p1.l(v0Var5);
                        v0Var5.B.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e11) {
                        v0 v0Var6 = ((p1) p0Var.f2053w).A;
                        p1.l(v0Var6);
                        v0Var6.B.b(e11, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f7623v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                v0 v0Var = ((p1) ((n) this.f7624w).f2053w).A;
                p1.l(v0Var);
                e2.f(v0Var, sQLiteDatabase);
                break;
            default:
                v0 v0Var2 = ((p1) ((p0) this.f7624w).f2053w).A;
                p1.l(v0Var2);
                e2.f(v0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        int i11 = this.f7623v;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f7623v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p1 p1Var = (p1) ((n) this.f7624w).f2053w;
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                e2.d(v0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", n.B);
                v0 v0Var2 = p1Var.A;
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", n.D);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", n.E);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", n.G);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", n.F);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", n.H);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", n.I);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", n.J);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", n.K);
                com.google.android.gms.internal.measurement.t4.a();
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", n.L);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", n.C);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                p1.l(v0Var2);
                e2.d(v0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                v0 v0Var3 = ((p1) ((p0) this.f7624w).f2053w).A;
                p1.l(v0Var3);
                e2.d(v0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", p0.A);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        int i11 = this.f7623v;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(p0 p0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f7623v = 1;
        this.f7624w = p0Var;
    }

    public m(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void i(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void m(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }
}
