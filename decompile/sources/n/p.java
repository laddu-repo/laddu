package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements m.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CollapsibleActionView f8945v;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f8945v = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // m.b
    public final void onActionViewCollapsed() {
        this.f8945v.onActionViewCollapsed();
    }

    @Override // m.b
    public final void onActionViewExpanded() {
        this.f8945v.onActionViewExpanded();
    }
}
