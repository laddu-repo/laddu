package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u f1173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o.r f1174w;

    public LegacySavedStateHandleController$tryToAddRecreator$1(u uVar, o.r rVar) {
        this.f1173v = uVar;
        this.f1174w = rVar;
    }

    @Override // androidx.lifecycle.q
    public final void a(s sVar, m mVar) {
        if (mVar == m.ON_START) {
            this.f1173v.f(this);
            this.f1174w.g();
        }
    }
}
