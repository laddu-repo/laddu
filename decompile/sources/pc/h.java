package pc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.c(7);
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f10522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f10523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f10524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10525y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f10526z;

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.optBoolean("visible", true)) {
                    arrayList.add(b(jSONObject));
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static h b(JSONObject jSONObject) {
        h hVar = new h();
        hVar.f10526z = "pronull";
        hVar.A = 0;
        hVar.f10522v = jSONObject.getString("name");
        hVar.f10523w = jSONObject.getString("link");
        if (jSONObject.has("api") && !jSONObject.isNull("api") && !TextUtils.isEmpty(jSONObject.getString("api"))) {
            hVar.f10524x = jSONObject.getString("api");
        }
        hVar.f10525y = jSONObject.optString("tokenApi", null);
        hVar.f10526z = jSONObject.optString("audio", "pronull");
        hVar.A = jSONObject.optInt("scheme", 0);
        hVar.B = jSONObject.optBoolean("secure_decoder", false);
        return hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10522v);
        parcel.writeString(this.f10523w);
        parcel.writeString(this.f10524x);
        parcel.writeString(this.f10525y);
        parcel.writeString(this.f10526z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B ? 1 : 0);
    }
}
