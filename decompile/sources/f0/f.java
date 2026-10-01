package f0;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f4626x;

    public f(CoordinatorLayout coordinatorLayout) {
        this.f4626x = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f4626x.q(0);
        return true;
    }
}
