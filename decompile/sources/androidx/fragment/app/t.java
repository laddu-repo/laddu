package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends z7.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f1100x;

    public t(y yVar) {
        this.f1100x = yVar;
    }

    @Override // z7.b
    public final View H(int i) {
        y yVar = this.f1100x;
        View view = yVar.f1135b0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + yVar + " does not have a view");
    }

    @Override // z7.b
    public final boolean I() {
        return this.f1100x.f1135b0 != null;
    }
}
