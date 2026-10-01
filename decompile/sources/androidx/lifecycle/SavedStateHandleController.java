package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h0 f1179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1180x;

    public SavedStateHandleController(String str, h0 h0Var) {
        this.f1178v = str;
        this.f1179w = h0Var;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        if (mVar == m.ON_DESTROY) {
            this.f1180x = false;
            sVar.f().f(this);
        }
    }

    public final void b(u uVar, o.r rVar) {
        de.i.e(rVar, "registry");
        de.i.e(uVar, "lifecycle");
        if (this.f1180x) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1180x = true;
        uVar.a(this);
        rVar.f(this.f1178v, this.f1179w.f1200e);
    }
}
