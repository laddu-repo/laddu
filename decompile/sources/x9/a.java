package x9;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0.b f14695c;

    public /* synthetic */ a(f0.b bVar, View view, int i6) {
        this.f14693a = i6;
        this.f14695c = bVar;
        this.f14694b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        switch (this.f14693a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f14695c;
                if (z10 && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.s(this.f14694b);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f14695c;
                if (z10 && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.t(this.f14694b);
                    return;
                }
                return;
        }
    }
}
