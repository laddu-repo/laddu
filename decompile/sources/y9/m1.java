package y9;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends i0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient Object f14587y;

    public m1(Object obj) {
        obj.getClass();
        this.f14587y = obj;
    }

    @Override // y9.i0, y9.a0
    public final f0 a() {
        return f0.q(this.f14587y);
    }

    @Override // y9.a0
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.f14587y;
        return i + 1;
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14587y.equals(obj);
    }

    @Override // y9.a0
    public final boolean f() {
        return false;
    }

    @Override // y9.a0
    /* JADX INFO: renamed from: g */
    public final p1 iterator() {
        return new n0(this.f14587y);
    }

    @Override // y9.i0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14587y.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f14587y.toString() + ']';
    }
}
