package y9;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f14545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f14546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f0 f14547z;

    public e0(f0 f0Var, int i, int i10) {
        this.f14547z = f0Var;
        this.f14545x = i;
        this.f14546y = i10;
    }

    @Override // y9.a0
    public final Object[] c() {
        return this.f14547z.c();
    }

    @Override // y9.a0
    public final int d() {
        return this.f14547z.e() + this.f14545x + this.f14546y;
    }

    @Override // y9.a0
    public final int e() {
        return this.f14547z.e() + this.f14545x;
    }

    @Override // y9.a0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p4.v.l(i, this.f14546y);
        return this.f14547z.get(i + this.f14545x);
    }

    @Override // y9.f0, y9.a0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // y9.f0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14546y;
    }

    @Override // y9.f0, java.util.List
    /* JADX INFO: renamed from: v */
    public final f0 subList(int i, int i10) {
        p4.v.p(i, i10, this.f14546y);
        int i11 = this.f14545x;
        return this.f14547z.subList(i + i11, i10 + i11);
    }

    @Override // y9.f0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
