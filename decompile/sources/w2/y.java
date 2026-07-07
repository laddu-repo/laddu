package w2;

import android.hardware.display.DisplayManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f13722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f13723b;

    public y(a0 a0Var, DisplayManager displayManager) {
        this.f13723b = a0Var;
        this.f13722a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i6) {
        if (i6 == 0) {
            a0.a(this.f13723b, this.f13722a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i6) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i6) {
    }
}
