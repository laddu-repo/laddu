package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k0 f1177v;

    public SavedStateHandleAttacher(k0 k0Var) {
        this.f1177v = k0Var;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        if (mVar == m.ON_CREATE) {
            sVar.f().f(this);
            this.f1177v.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
        }
    }
}
