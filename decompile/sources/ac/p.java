package ac;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.g f435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc.k f436b;

    public p(fa.g gVar, dc.k kVar, sd.h hVar, z0 z0Var) {
        de.i.e(gVar, "firebaseApp");
        de.i.e(kVar, "settings");
        de.i.e(hVar, "backgroundDispatcher");
        de.i.e(z0Var, "sessionsActivityLifecycleCallbacks");
        this.f435a = gVar;
        this.f436b = kVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.6.");
        gVar.a();
        Context applicationContext = gVar.f5336a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(z0Var);
            me.x.k(me.x.b(hVar), null, new o(this, z0Var, null, 0), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
