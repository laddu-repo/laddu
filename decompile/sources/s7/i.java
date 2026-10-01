package s7;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f11519a;

    public i(d dVar) {
        this.f11519a = dVar;
    }

    @Override // s7.b
    public final void a(boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        d dVar = this.f11519a;
        dVar.H.sendMessage(dVar.H.obtainMessage(1, boolValueOf));
    }
}
