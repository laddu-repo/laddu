package db;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends k0 {
    public final transient int A;
    public final /* synthetic */ k0 B;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f4006z;

    public j0(k0 k0Var, int i6, int i10) {
        this.B = k0Var;
        this.f4006z = i6;
        this.A = i10;
    }

    @Override // db.f0
    public final Object[] c() {
        return this.B.c();
    }

    @Override // db.f0
    public final int d() {
        return this.B.e() + this.f4006z + this.A;
    }

    @Override // db.f0
    public final int e() {
        return this.B.e() + this.f4006z;
    }

    @Override // db.f0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        jb.b.e(i6, this.A);
        return this.B.get(i6 + this.f4006z);
    }

    @Override // db.k0, db.f0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // db.k0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // db.k0, java.util.List
    /* renamed from: s */
    public final k0 subList(int i6, int i10) {
        jb.b.h(i6, i10, this.A);
        int i11 = this.f4006z;
        return this.B.subList(i6 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }

    @Override // db.k0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i6) {
        return listIterator(i6);
    }
}
