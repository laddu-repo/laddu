package y9;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends i0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient e1 f14533y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient d1 f14534z;

    public c1(e1 e1Var, d1 d1Var) {
        this.f14533y = e1Var;
        this.f14534z = d1Var;
    }

    @Override // y9.i0, y9.a0
    public final f0 a() {
        return this.f14534z;
    }

    @Override // y9.a0
    public final int b(int i, Object[] objArr) {
        return this.f14534z.b(i, objArr);
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14533y.get(obj) != null;
    }

    @Override // y9.a0
    public final boolean f() {
        return true;
    }

    @Override // y9.a0
    /* JADX INFO: renamed from: g */
    public final p1 iterator() {
        return this.f14534z.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14533y.A;
    }
}
