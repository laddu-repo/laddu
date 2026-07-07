package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1127w;

    public /* synthetic */ w0(int i, Object obj) {
        this.f1126v = i;
        this.f1127w = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f1126v;
        Object obj = this.f1127w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = t0.m0.f11853a;
                t0.b0.c(view2);
                break;
            case 1:
            case 2:
            case 3:
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                t9.n nVar = (t9.n) obj;
                AccessibilityManager accessibilityManager = nVar.O;
                if (nVar.P != null && accessibilityManager != null && nVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(nVar.P);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f1126v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            case 1:
                n.f fVar = (n.f) this.f1127w;
                ViewTreeObserver viewTreeObserver = fVar.S;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.S = view.getViewTreeObserver();
                    }
                    fVar.S.removeGlobalOnLayoutListener(fVar.D);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                n.c0 c0Var = (n.c0) this.f1127w;
                ViewTreeObserver viewTreeObserver2 = c0Var.J;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.J = view.getViewTreeObserver();
                    }
                    c0Var.J.removeGlobalOnLayoutListener(c0Var.D);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f1127w;
                t8.a aVar = hideBottomViewOnScrollBehavior.f3324h;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.f3323g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f3324h = null;
                    break;
                }
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f1127w;
                t8.a aVar2 = hideViewOnScrollBehavior.f3332c;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.f3331b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f3332c = null;
                    break;
                }
                break;
            default:
                t9.n nVar = (t9.n) this.f1127w;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = nVar.P;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = nVar.O) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
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
