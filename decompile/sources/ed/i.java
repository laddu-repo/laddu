package ed;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4898a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f4899b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f4900c = new Handler(Looper.getMainLooper());

    public static void a() {
        synchronized (f4898a) {
            LinkedHashMap linkedHashMap = f4899b;
            h hVar = (h) linkedHashMap.get("LibGlobalFetchLib");
            if (hVar != null) {
                hVar.f4891a.b();
                if (hVar.f4891a.e() == 0) {
                    hVar.f4891a.a();
                    hVar.f4896g.b();
                    hVar.f4894d.p();
                    hVar.f4892b.close();
                    hVar.f.f();
                    hVar.f4897h.c();
                    linkedHashMap.remove("LibGlobalFetchLib");
                }
            }
        }
    }
}
