package n;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ka.c f8943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f8944b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f8944b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        ka.c cVar = this.f8943a;
        if (cVar != null) {
            l lVar = ((n) cVar.f7872v).f8930n;
            lVar.f8900h = true;
            lVar.p(true);
        }
    }
}
