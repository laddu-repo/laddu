package j1;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 implements View.OnAttachStateChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6983x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6984y;

    public /* synthetic */ u0(Object obj, int i6) {
        this.f6983x = i6;
        this.f6984y = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i6 = this.f6983x;
        Object obj = this.f6984y;
        switch (i6) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = t0.q0.f12397a;
                t0.f0.c(view2);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            default:
                za.l lVar = (za.l) obj;
                AccessibilityManager accessibilityManager = lVar.Q;
                if (lVar.R != null && accessibilityManager != null && lVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(lVar.R);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f6983x) {
            case 0:
                return;
            case 1:
                o.f fVar = (o.f) this.f6984y;
                ViewTreeObserver viewTreeObserver = fVar.U;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.U = view.getViewTreeObserver();
                    }
                    fVar.U.removeGlobalOnLayoutListener(fVar.F);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                o.c0 c0Var = (o.c0) this.f6984y;
                ViewTreeObserver viewTreeObserver2 = c0Var.L;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.L = view.getViewTreeObserver();
                    }
                    c0Var.L.removeGlobalOnLayoutListener(c0Var.F);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f6984y;
                x9.a aVar = hideBottomViewOnScrollBehavior.f2587h;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.f2586g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f2587h = null;
                    return;
                }
                return;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f6984y;
                x9.a aVar2 = hideViewOnScrollBehavior.f2592c;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.f2591b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f2592c = null;
                    return;
                }
                return;
            default:
                za.l lVar = (za.l) this.f6984y;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = lVar.R;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = lVar.Q) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
