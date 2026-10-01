package ac;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f328a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f329b = fb.c.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f330c = fb.c.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f331d = fb.c.a("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f332e = fb.c.a("deviceManufacturer");
    public static final fb.c f = fb.c.a("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f333g = fb.c.a("appProcessDetails");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        fb.e eVar = (fb.e) obj2;
        eVar.a(f329b, aVar.f312a);
        eVar.a(f330c, aVar.f313b);
        eVar.a(f331d, aVar.f314c);
        eVar.a(f332e, Build.MANUFACTURER);
        eVar.a(f, aVar.f315d);
        eVar.a(f333g, aVar.f316e);
    }
}
