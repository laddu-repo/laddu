package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i0 extends Service implements f0 {

    /* renamed from: x, reason: collision with root package name */
    public final j1 f939x = new j1(this);

    @Override // androidx.lifecycle.f0
    public final y getLifecycle() {
        return (h0) this.f939x.f949y;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.k.e(intent, "intent");
        j1 j1Var = this.f939x;
        j1Var.getClass();
        j1Var.x(w.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        j1 j1Var = this.f939x;
        j1Var.getClass();
        j1Var.x(w.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        j1 j1Var = this.f939x;
        j1Var.getClass();
        j1Var.x(w.ON_STOP);
        j1Var.x(w.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i6) {
        j1 j1Var = this.f939x;
        j1Var.getClass();
        j1Var.x(w.ON_START);
        super.onStart(intent, i6);
    }
}
