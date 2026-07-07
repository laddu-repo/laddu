package t0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public final View f12411x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f12412y;

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f12413z;

    public u(View view, Runnable runnable) {
        this.f12411x = view;
        this.f12412y = view.getViewTreeObserver();
        this.f12413z = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            u uVar = new u(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(uVar);
            view.addOnAttachStateChangeListener(uVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f12412y.isAlive();
        View view = this.f12411x;
        if (isAlive) {
            this.f12412y.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f12413z.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12412y = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f12412y.isAlive();
        View view2 = this.f12411x;
        if (isAlive) {
            this.f12412y.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
