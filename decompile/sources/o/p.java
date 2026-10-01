package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends FrameLayout implements n.b {

    /* renamed from: x, reason: collision with root package name */
    public final CollapsibleActionView f9827x;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f9827x = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // n.b
    public final void onActionViewCollapsed() {
        this.f9827x.onActionViewCollapsed();
    }

    @Override // n.b
    public final void onActionViewExpanded() {
        this.f9827x.onActionViewExpanded();
    }
}
