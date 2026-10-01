package y9;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient f0 f14539x;

    public d0(f0 f0Var) {
        this.f14539x = f0Var;
    }

    @Override // y9.f0, y9.a0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14539x.contains(obj);
    }

    @Override // y9.a0
    public final boolean f() {
        return this.f14539x.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        f0 f0Var = this.f14539x;
        p4.v.l(i, f0Var.size());
        return f0Var.get((f0Var.size() - 1) - i);
    }

    @Override // y9.f0, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f14539x.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // y9.f0, y9.a0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // y9.f0, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f14539x.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // y9.f0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14539x.size();
    }

    @Override // y9.f0
    public final f0 t() {
        return this.f14539x;
    }

    @Override // y9.f0, java.util.List
    /* JADX INFO: renamed from: v */
    public final f0 subList(int i, int i10) {
        f0 f0Var = this.f14539x;
        p4.v.p(i, i10, f0Var.size());
        return f0Var.subList(f0Var.size() - i10, f0Var.size() - i).t();
    }

    @Override // y9.f0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
