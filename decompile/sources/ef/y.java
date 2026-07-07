package ef;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f5097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f5099d;

    public y(u uVar, int i, byte[] bArr) {
        this.f5097b = uVar;
        this.f5098c = i;
        this.f5099d = bArr;
    }

    @Override // ef.z
    public final long a() {
        return this.f5098c;
    }

    @Override // ef.z
    public final u b() {
        return this.f5097b;
    }

    @Override // ef.z
    public final void d(vf.m mVar) {
        byte[] bArr = this.f5099d;
        de.i.e(bArr, "source");
        if (mVar.f13629x) {
            throw new IllegalStateException("closed");
        }
        mVar.f13628w.m0(this.f5098c, bArr);
        mVar.a();
    }
}
