package sb;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Binder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ka.c f11781d;

    public y(ka.c cVar) {
        this.f11781d = cVar;
    }

    public final void a(z zVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = zVar.f11782a;
        g gVar = (g) this.f11781d.f7872v;
        o8.h hVar = new o8.h();
        gVar.f11717v.execute(new androidx.emoji2.text.n(gVar, intent, hVar, 8));
        hVar.f9963a.b(new l4.d(0), new pa.a(6, zVar));
    }
}
