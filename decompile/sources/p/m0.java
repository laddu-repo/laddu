package p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 implements PopupWindow.OnDismissListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o.d f10298x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f10299y;

    public m0(n0 n0Var, o.d dVar) {
        this.f10299y = n0Var;
        this.f10298x = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f10299y.f10319e0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f10298x);
        }
    }
}
