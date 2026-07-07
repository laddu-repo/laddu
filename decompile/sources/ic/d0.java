package ic;

import a2.e1;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends Binder {

    /* renamed from: e, reason: collision with root package name */
    public final u5.r f6743e;

    public d0(u5.r rVar) {
        this.f6743e = rVar;
    }

    public final void a(e0 e0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = e0Var.f6745a;
            g gVar = (g) this.f6743e.f12916y;
            s9.h hVar = new s9.h();
            gVar.f6751x.execute(new e1(gVar, intent, hVar, 10));
            hVar.f12263a.i(new q.a(1), new a2.e0(e0Var, 28));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
