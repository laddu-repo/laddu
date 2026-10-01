package y9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends f0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object[] f14540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f14541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient int f14542z;

    public d1(Object[] objArr, int i, int i10) {
        this.f14540x = objArr;
        this.f14541y = i;
        this.f14542z = i10;
    }

    @Override // y9.a0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p4.v.l(i, this.f14542z);
        Object obj = this.f14540x[(i * 2) + this.f14541y];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14542z;
    }
}
