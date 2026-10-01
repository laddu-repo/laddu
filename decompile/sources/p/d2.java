package p;

import android.widget.AbsListView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f10229a;

    public d2(f2 f2Var) {
        this.f10229a = f2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i6) {
        f2 f2Var = this.f10229a;
        b2 b2Var = f2Var.O;
        a0 a0Var = f2Var.W;
        if (i6 == 1 && a0Var.getInputMethodMode() != 2 && a0Var.getContentView() != null) {
            f2Var.S.removeCallbacks(b2Var);
            b2Var.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i6, int i10, int i11) {
    }
}
