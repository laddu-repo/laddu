package o;

import android.view.ActionProvider;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public k7.d f9825a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f9826b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f9826b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        k7.d dVar = this.f9825a;
        if (dVar != null) {
            l lVar = ((n) dVar.f7747y).f9813n;
            lVar.f9783h = true;
            lVar.p(true);
        }
    }
}
