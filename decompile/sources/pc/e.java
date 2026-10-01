package pc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10501e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10503h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f10507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JSONArray f10508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10509o;

    public static e a(JSONObject jSONObject) {
        e eVar = new e();
        eVar.f10509o = jSONObject.optInt("priority", -1);
        eVar.f10497a = jSONObject.getString("category");
        jSONObject.optString("categoryLogo", "");
        eVar.f10498b = jSONObject.getString("eventName").trim();
        eVar.f10500d = jSONObject.getString("teamAName");
        eVar.f10501e = jSONObject.getString("teamBName");
        eVar.f = jSONObject.getString("teamAFlag");
        eVar.f10502g = jSONObject.getString("teamBFlag");
        eVar.f10499c = jSONObject.optString("eventLogo");
        eVar.f10503h = jSONObject.getString("links");
        eVar.f10504j = jSONObject.getString("date");
        eVar.i = jSONObject.getString("time");
        eVar.f10506l = jSONObject.optString("end_date", null);
        eVar.f10505k = jSONObject.optString("end_time", null);
        eVar.f10508n = jSONObject.optJSONArray("link_names");
        return eVar;
    }

    public static List b(ArrayList arrayList) {
        if (arrayList.size() < 2) {
            return arrayList;
        }
        Collections.sort(arrayList, new c4.d(6));
        return arrayList;
    }
}
