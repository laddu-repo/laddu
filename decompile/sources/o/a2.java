package o;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f9115a;

    public a2(c2 c2Var) {
        this.f9115a = c2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        c2 c2Var = this.f9115a;
        z1 z1Var = c2Var.M;
        x xVar = c2Var.U;
        if (i != 1 || xVar.getInputMethodMode() == 2 || xVar.getContentView() == null) {
            return;
        }
        c2Var.Q.removeCallbacks(z1Var);
        z1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i10, int i11) {
    }
}
