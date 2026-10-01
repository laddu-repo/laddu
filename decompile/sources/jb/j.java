package jb;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import s8.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f7343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7345c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7346d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7347e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7348f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7349g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i6 = a9.d.f639a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        x.i("ApplicationId must be set.", true ^ z10);
        this.f7344b = str;
        this.f7343a = str2;
        this.f7345c = str3;
        this.f7346d = str4;
        this.f7347e = str5;
        this.f7348f = str6;
        this.f7349g = str7;
    }

    public static j a(Context context) {
        l lVar = new l(context);
        String m9 = lVar.m("google_app_id");
        if (TextUtils.isEmpty(m9)) {
            return null;
        }
        return new j(m9, lVar.m("google_api_key"), lVar.m("firebase_database_url"), lVar.m("ga_trackingId"), lVar.m("gcm_defaultSenderId"), lVar.m("google_storage_bucket"), lVar.m("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!x.j(this.f7344b, jVar.f7344b) || !x.j(this.f7343a, jVar.f7343a) || !x.j(this.f7345c, jVar.f7345c) || !x.j(this.f7346d, jVar.f7346d) || !x.j(this.f7347e, jVar.f7347e) || !x.j(this.f7348f, jVar.f7348f) || !x.j(this.f7349g, jVar.f7349g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7344b, this.f7343a, this.f7345c, this.f7346d, this.f7347e, this.f7348f, this.f7349g});
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.a(this.f7344b, "applicationId");
        lVar.a(this.f7343a, "apiKey");
        lVar.a(this.f7345c, "databaseUrl");
        lVar.a(this.f7347e, "gcmSenderId");
        lVar.a(this.f7348f, "storageBucket");
        lVar.a(this.f7349g, "projectId");
        return lVar.toString();
    }
}
