package nc;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f9616h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f9617a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f9618b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f9619c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f9620d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f9621e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9622f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f9623g;

    public g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f9618b = jSONObject;
        this.f9619c = date;
        this.f9620d = jSONArray;
        this.f9621e = jSONObject2;
        this.f9622f = j;
        this.f9623g = jSONArray2;
        this.f9617a = jSONObject3;
    }

    public static g a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nc.f] */
    public static f c() {
        ?? obj = new Object();
        obj.f9610a = new JSONObject();
        obj.f9611b = f9616h;
        obj.f9612c = new JSONArray();
        obj.f9613d = new JSONObject();
        obj.f9614e = 0L;
        obj.f9615f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i6 = 0;
        while (true) {
            JSONArray jSONArray = this.f9623g;
            if (i6 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i6);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    String string3 = jSONArray2.getString(i10);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i6++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f9617a.toString().equals(((g) obj).f9617a.toString());
    }

    public final int hashCode() {
        return this.f9617a.hashCode();
    }

    public final String toString() {
        return this.f9617a.toString();
    }
}
