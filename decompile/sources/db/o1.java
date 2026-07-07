package db;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o1 extends p0 {
    public final transient Object A;

    public o1(Object obj) {
        obj.getClass();
        this.A = obj;
    }

    @Override // db.p0, db.f0
    public final k0 a() {
        return k0.o(this.A);
    }

    @Override // db.f0
    public final int b(int i6, Object[] objArr) {
        objArr[i6] = this.A;
        return i6 + 1;
    }

    @Override // db.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A.equals(obj);
    }

    @Override // db.f0
    public final boolean f() {
        return false;
    }

    @Override // db.f0
    /* renamed from: g */
    public final q1 iterator() {
        return new s0(this.A);
    }

    @Override // db.p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.A.toString() + ']';
    }
}
