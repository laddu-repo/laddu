package ac;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements fb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f336a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c f337b = fb.c.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fb.c f338c = fb.c.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.c f339d = fb.c.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fb.c f340e = fb.c.a("osVersion");
    public static final fb.c f = fb.c.a("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fb.c f341g = fb.c.a("androidAppInfo");

    @Override // fb.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        fb.e eVar = (fb.e) obj2;
        eVar.a(f337b, bVar.f321a);
        eVar.a(f338c, Build.MODEL);
        eVar.a(f339d, "3.0.6");
        eVar.a(f340e, Build.VERSION.RELEASE);
        eVar.a(f, b0.f323w);
        eVar.a(f341g, bVar.f322b);
    }
}
