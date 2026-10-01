package fc;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hc.h f5364c;

    public d(hc.h hVar) {
        this.f5364c = hVar;
    }

    @Override // androidx.fragment.app.h
    public final int j(int i) {
        hc.h hVar = this.f5364c;
        return (i == hVar.f6227j && hVar.g()) ? 3 : 1;
    }
}
