package j5;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f6886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6888c;

    public /* synthetic */ s(w wVar, int i, int i10) {
        this.f6886a = wVar;
        this.f6887b = i;
        this.f6888c = i10;
    }

    @Override // j5.v
    public final void run() {
        w wVar = this.f6886a;
        j jVar = wVar.f6908v;
        int i = this.f6887b;
        int i10 = this.f6888c;
        if (jVar == null) {
            wVar.A.add(new s(wVar, i, i10));
        } else {
            wVar.f6909w.i(i, i10 + 0.99f);
        }
    }
}
