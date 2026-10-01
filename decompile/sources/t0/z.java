package t0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends u5.r {

    /* renamed from: z, reason: collision with root package name */
    public View f12429z;

    @Override // u5.r
    public final void C() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f12429z;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.C();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [t0.y] */
    @Override // u5.r
    public final void t() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f12429z;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: t0.y
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i6) {
                    boolean z10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i6 & 8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    atomicBoolean2.set(z10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.t();
    }
}
