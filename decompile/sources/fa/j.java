package fa;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5353e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5354g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = x7.c.f14260a;
        y.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f5350b = str;
        this.f5349a = str2;
        this.f5351c = str3;
        this.f5352d = str4;
        this.f5353e = str5;
        this.f = str6;
        this.f5354g = str7;
    }

    public static j a(Context context) {
        p2.c cVar = new p2.c(context, 13);
        String strK = cVar.k("google_app_id");
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        return new j(strK, cVar.k("google_api_key"), cVar.k("firebase_database_url"), cVar.k("ga_trackingId"), cVar.k("gcm_defaultSenderId"), cVar.k("google_storage_bucket"), cVar.k("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return y.j(this.f5350b, jVar.f5350b) && y.j(this.f5349a, jVar.f5349a) && y.j(this.f5351c, jVar.f5351c) && y.j(this.f5352d, jVar.f5352d) && y.j(this.f5353e, jVar.f5353e) && y.j(this.f, jVar.f) && y.j(this.f5354g, jVar.f5354g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5350b, this.f5349a, this.f5351c, this.f5352d, this.f5353e, this.f, this.f5354g});
    }

    public final String toString() {
        ob.d dVar = new ob.d(this);
        dVar.a(this.f5350b, "applicationId");
        dVar.a(this.f5349a, "apiKey");
        dVar.a(this.f5351c, "databaseUrl");
        dVar.a(this.f5353e, "gcmSenderId");
        dVar.a(this.f, "storageBucket");
        dVar.a(this.f5354g, "projectId");
        return dVar.toString();
    }
}
