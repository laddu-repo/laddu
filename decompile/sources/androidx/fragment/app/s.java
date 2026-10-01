package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f1098a;

    public s(y yVar) {
        this.f1098a = yVar;
    }

    @Override // androidx.fragment.app.x
    public final void a() {
        y yVar = this.f1098a;
        yVar.o0.e();
        androidx.lifecycle.i0.d(yVar);
        Bundle bundle = yVar.f1152w;
        yVar.o0.f(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
