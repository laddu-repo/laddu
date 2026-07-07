package t0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12414a;

    public u0(View view) {
        this.f12414a = new WeakReference(view);
    }

    public final void a(float f3) {
        View view = (View) this.f12414a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    public final void b() {
        View view = (View) this.f12414a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f12414a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(v0 v0Var) {
        View view = (View) this.f12414a.get();
        if (view != null) {
            if (v0Var != null) {
                view.animate().setListener(new o5.j(v0Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f3) {
        View view = (View) this.f12414a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
