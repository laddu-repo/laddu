package y9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends f0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z0 f14637z = new z0(0, new Object[0]);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object[] f14638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f14639y;

    public z0(int i, Object[] objArr) {
        this.f14638x = objArr;
        this.f14639y = i;
    }

    @Override // y9.f0, y9.a0
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.f14638x;
        int i10 = this.f14639y;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // y9.a0
    public final Object[] c() {
        return this.f14638x;
    }

    @Override // y9.a0
    public final int d() {
        return this.f14639y;
    }

    @Override // y9.a0
    public final int e() {
        return 0;
    }

    @Override // y9.a0
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p4.v.l(i, this.f14639y);
        Object obj = this.f14638x[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14639y;
    }
}
