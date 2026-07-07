package sb;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f11746d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11749c;

    public q(long j8, String str, String str2) {
        this.f11747a = str;
        this.f11748b = str2;
        this.f11749c = j8;
    }

    public static String a(long j8, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j8);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
            return null;
        }
    }

    public static q b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new q(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new q(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e7) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
            return null;
        }
    }
}
