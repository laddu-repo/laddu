package wb;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f14010e = new Date(-1);
    public static final Date f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14012b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14013c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14014d = new Object();

    public l(SharedPreferences sharedPreferences) {
        this.f14011a = sharedPreferences;
    }

    public final k a() {
        k kVar;
        synchronized (this.f14013c) {
            int i = this.f14011a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f14011a.getLong("backoff_end_time_in_millis", -1L));
            kVar = new k();
            kVar.f14008a = i;
            kVar.f14009b = date;
        }
        return kVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f14011a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final k c() {
        k kVar;
        synchronized (this.f14014d) {
            int i = this.f14011a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f14011a.getLong("realtime_backoff_end_time_in_millis", -1L));
            kVar = new k();
            kVar.f14008a = i;
            kVar.f14009b = date;
        }
        return kVar;
    }

    public final void d(int i, Date date) {
        synchronized (this.f14013c) {
            this.f14011a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.f14012b) {
            this.f14011a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(Date date) {
        synchronized (this.f14014d) {
            this.f14011a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g(int i, Date date) {
        synchronized (this.f14014d) {
            this.f14011a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void h() {
        synchronized (this.f14012b) {
            this.f14011a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void i() {
        synchronized (this.f14012b) {
            this.f14011a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
