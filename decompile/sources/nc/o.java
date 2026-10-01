package nc;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f9664e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f9665f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f9666a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9667b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f9668c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f9669d = new Object();

    public o(SharedPreferences sharedPreferences) {
        this.f9666a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nc.n, java.lang.Object] */
    public final n a() {
        ?? obj;
        synchronized (this.f9668c) {
            int i6 = this.f9666a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f9666a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f9662a = i6;
            obj.f9663b = date;
        }
        return obj;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f9666a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nc.n, java.lang.Object] */
    public final n c() {
        ?? obj;
        synchronized (this.f9669d) {
            int i6 = this.f9666a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f9666a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f9662a = i6;
            obj.f9663b = date;
        }
        return obj;
    }

    public final void d(int i6, Date date) {
        synchronized (this.f9668c) {
            this.f9666a.edit().putInt("num_failed_fetches", i6).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.f9667b) {
            this.f9666a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(int i6, Date date) {
        synchronized (this.f9669d) {
            this.f9666a.edit().putInt("num_failed_realtime_streams", i6).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g() {
        synchronized (this.f9667b) {
            this.f9666a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void h() {
        synchronized (this.f9667b) {
            this.f9666a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
