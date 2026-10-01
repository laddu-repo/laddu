package wb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13989a;

    public i(j jVar) {
        this.f13989a = jVar;
    }

    public final void a() {
        j jVar = this.f13989a;
        synchronized (jVar) {
            jVar.f13995d = true;
        }
        this.f13989a.g();
    }
}
