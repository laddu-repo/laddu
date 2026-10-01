package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f1171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f1172w;

    public DefaultLifecycleObserverAdapter(e eVar, q qVar) {
        this.f1171v = eVar;
        this.f1172w = qVar;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        int i = f.f1193a[mVar.ordinal()];
        if (i == 3) {
            this.f1171v.i();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        q qVar = this.f1172w;
        if (qVar != null) {
            qVar.a(sVar, mVar);
        }
    }
}
