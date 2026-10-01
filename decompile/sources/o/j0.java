package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n.d f9178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f9179w;

    public j0(k0 k0Var, n.d dVar) {
        this.f9179w = k0Var;
        this.f9178v = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f9179w.f9190c0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9178v);
        }
    }
}
