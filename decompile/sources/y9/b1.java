package y9;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends i0 {
    public final transient int A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient e1 f14524y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient Object[] f14525z;

    public b1(e1 e1Var, Object[] objArr, int i) {
        this.f14524y = e1Var;
        this.f14525z = objArr;
        this.A = i;
    }

    @Override // y9.a0
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14524y.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // y9.a0
    public final boolean f() {
        return true;
    }

    @Override // y9.a0
    /* JADX INFO: renamed from: g */
    public final p1 iterator() {
        return a().listIterator(0);
    }

    @Override // y9.i0
    public final f0 l() {
        return new a1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}
