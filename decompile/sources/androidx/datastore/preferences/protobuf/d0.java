package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0[] f756a;

    @Override // androidx.datastore.preferences.protobuf.k0
    public final t0 a(Class cls) {
        for (k0 k0Var : this.f756a) {
            if (k0Var.b(cls)) {
                return k0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean b(Class cls) {
        for (k0 k0Var : this.f756a) {
            if (k0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
