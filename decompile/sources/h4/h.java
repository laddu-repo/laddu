package h4;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import h.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f6142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f6144e;
    public boolean f;

    public h(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f6142c = onBackInvokedDispatcher;
        this.f6143d = i;
        this.f6144e = Build.VERSION.SDK_INT == 33 ? new x(1, this) : new i(this);
    }

    @Override // h4.d
    public final void b(boolean z2) {
        if (z2 && !this.f) {
            this.f6142c.registerOnBackInvokedCallback(this.f6143d, this.f6144e);
            this.f = true;
        } else {
            if (z2 || !this.f) {
                return;
            }
            this.f6142c.unregisterOnBackInvokedCallback(this.f6144e);
            this.f = false;
        }
    }
}
