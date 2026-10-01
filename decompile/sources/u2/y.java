package u2;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f12805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f12806b;

    public y(a0 a0Var, DisplayManager displayManager) {
        this.f12806b = a0Var;
        this.f12805a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            a0.a(this.f12806b, this.f12805a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
