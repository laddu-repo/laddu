package db;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 extends p0 {
    public final transient n0 A;
    public final transient g1 B;

    public f1(n0 n0Var, g1 g1Var) {
        this.A = n0Var;
        this.B = g1Var;
    }

    @Override // db.p0, db.f0
    public final k0 a() {
        return this.B;
    }

    @Override // db.f0
    public final int b(int i6, Object[] objArr) {
        return this.B.b(i6, objArr);
    }

    @Override // db.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.A.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // db.f0
    public final boolean f() {
        return true;
    }

    @Override // db.f0
    /* renamed from: g */
    public final q1 iterator() {
        return this.B.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A.size();
    }
}
