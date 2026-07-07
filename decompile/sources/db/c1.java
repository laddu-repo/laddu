package db;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 extends k0 {
    public static final c1 B = new c1(0, new Object[0]);
    public final transient int A;

    /* renamed from: z, reason: collision with root package name */
    public final transient Object[] f3988z;

    public c1(int i6, Object[] objArr) {
        this.f3988z = objArr;
        this.A = i6;
    }

    @Override // db.k0, db.f0
    public final int b(int i6, Object[] objArr) {
        Object[] objArr2 = this.f3988z;
        int i10 = this.A;
        System.arraycopy(objArr2, 0, objArr, i6, i10);
        return i6 + i10;
    }

    @Override // db.f0
    public final Object[] c() {
        return this.f3988z;
    }

    @Override // db.f0
    public final int d() {
        return this.A;
    }

    @Override // db.f0
    public final int e() {
        return 0;
    }

    @Override // db.f0
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        jb.b.e(i6, this.A);
        Object obj = this.f3988z[i6];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
