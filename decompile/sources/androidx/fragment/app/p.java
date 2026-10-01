package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z7.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f1057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f1058y;

    public p(q qVar, t tVar) {
        this.f1058y = qVar;
        this.f1057x = tVar;
    }

    @Override // z7.b
    public final View H(int i) {
        t tVar = this.f1057x;
        if (tVar.I()) {
            return tVar.H(i);
        }
        Dialog dialog = this.f1058y.E0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // z7.b
    public final boolean I() {
        return this.f1057x.I() || this.f1058y.I0;
    }
}
