package db;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g1 extends k0 {
    public final transient int A;
    public final transient int B;

    /* renamed from: z, reason: collision with root package name */
    public final transient Object[] f4001z;

    public g1(Object[] objArr, int i6, int i10) {
        this.f4001z = objArr;
        this.A = i6;
        this.B = i10;
    }

    @Override // db.f0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        jb.b.e(i6, this.B);
        Object obj = this.f4001z[(i6 * 2) + this.A];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B;
    }
}
