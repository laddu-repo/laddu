package n9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.t8;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends SQLiteOpenHelper {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9406x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3.e f9407y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Context context) {
        this(context, "google_app_measurement.db");
        this.f9406x = 0;
        this.f9407y = oVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f9406x) {
            case 0:
                o oVar = (o) this.f9407y;
                n1 n1Var = (n1) oVar.f4301y;
                n1 n1Var2 = (n1) oVar.f4301y;
                n1Var.getClass();
                d2.i iVar = oVar.C;
                if (iVar.f3732y != 0) {
                    ((a9.a) iVar.f3733z).getClass();
                    if (SystemClock.elapsedRealtime() - iVar.f3732y < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((a9.a) iVar.f3733z).getClass();
                    iVar.f3732y = SystemClock.elapsedRealtime();
                    u0 u0Var = n1Var2.C;
                    n1.g(u0Var);
                    u0Var.D.a("Opening the database failed, dropping and recreating it");
                    if (!n1Var2.f9413x.getDatabasePath("google_app_measurement.db").delete()) {
                        u0 u0Var2 = n1Var2.C;
                        n1.g(u0Var2);
                        u0Var2.D.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        iVar.f3732y = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e10) {
                        u0 u0Var3 = n1Var2.C;
                        n1.g(u0Var3);
                        u0Var3.D.b(e10, "Failed to open freshly created database");
                        throw e10;
                    }
                }
            default:
                o0 o0Var = (o0) this.f9407y;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e11) {
                    throw e11;
                } catch (SQLiteException unused2) {
                    n1 n1Var3 = (n1) o0Var.f4301y;
                    u0 u0Var4 = n1Var3.C;
                    n1.g(u0Var4);
                    u0Var4.D.a("Opening the local database failed, dropping and recreating it");
                    if (!n1Var3.f9413x.getDatabasePath("google_app_measurement_local.db").delete()) {
                        u0 u0Var5 = n1Var3.C;
                        n1.g(u0Var5);
                        u0Var5.D.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e12) {
                        u0 u0Var6 = ((n1) o0Var.f4301y).C;
                        n1.g(u0Var6);
                        u0Var6.D.b(e12, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f9406x) {
            case 0:
                u0 u0Var = ((n1) ((o) this.f9407y).f4301y).C;
                n1.g(u0Var);
                a2.f(u0Var, sQLiteDatabase);
                return;
            default:
                u0 u0Var2 = ((n1) ((o0) this.f9407y).f4301y).C;
                n1.g(u0Var2);
                a2.f(u0Var2, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        int i11 = this.f9406x;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f9406x) {
            case 0:
                n1 n1Var = (n1) ((o) this.f9407y).f4301y;
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                a2.d(u0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", o.D);
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", o.F);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", o.G);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", o.I);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", o.H);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", o.J);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", o.K);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", o.L);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", o.M);
                t8.a();
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", o.N);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", o.E);
                n1.g(u0Var2);
                a2.d(u0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                return;
            default:
                u0 u0Var3 = ((n1) ((o0) this.f9407y).f4301y).C;
                n1.g(u0Var3);
                a2.d(u0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", o0.C);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        int i11 = this.f9406x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(o0 o0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f9406x = 1;
        this.f9407y = o0Var;
    }

    public n(Context context, String str) {
        super(context, true == str.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    private final void m(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }
}
