package y9;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends f0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b1 f14522x;

    public a1(b1 b1Var) {
        this.f14522x = b1Var;
    }

    @Override // y9.a0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b1 b1Var = this.f14522x;
        p4.v.l(i, b1Var.A);
        Object[] objArr = b1Var.f14525z;
        int i10 = i * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14522x.A;
    }
}
