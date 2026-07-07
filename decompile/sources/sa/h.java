package sa;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f11613d = new g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c4.d f11614e = new c4.d(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.c f11615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11616b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11617c = null;

    public h(ya.c cVar) {
        this.f11615a = cVar;
    }

    public static void a(ya.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e7);
        }
    }
}
