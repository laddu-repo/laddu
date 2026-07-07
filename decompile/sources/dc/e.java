package dc;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.b f4477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd.h f4478b;

    public e(ac.b bVar, sd.h hVar) {
        de.i.e(bVar, "appInfo");
        de.i.e(hVar, "blockingDispatcher");
        this.f4477a = bVar;
        this.f4478b = hVar;
    }

    public static final URL a(e eVar) {
        eVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ac.b bVar = eVar.f4477a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f321a).appendPath("settings");
        ac.a aVar = bVar.f322b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f314c).appendQueryParameter("display_version", aVar.f313b).build().toString());
    }
}
