package db;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 extends p0 {
    public static final Object[] F;
    public static final i1 G;
    public final transient Object[] A;
    public final transient int B;
    public final transient Object[] C;
    public final transient int D;
    public final transient int E;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new i1(0, 0, 0, objArr, objArr);
    }

    public i1(int i6, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.A = objArr;
        this.B = i6;
        this.C = objArr2;
        this.D = i10;
        this.E = i11;
    }

    @Override // db.f0
    public final int b(int i6, Object[] objArr) {
        Object[] objArr2 = this.A;
        int i10 = this.E;
        System.arraycopy(objArr2, 0, objArr, i6, i10);
        return i6 + i10;
    }

    @Override // db.f0
    public final Object[] c() {
        return this.A;
    }

    @Override // db.f0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.C;
            if (objArr.length != 0) {
                int t10 = r.t(obj);
                while (true) {
                    int i6 = t10 & this.D;
                    Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t10 = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // db.f0
    public final int d() {
        return this.E;
    }

    @Override // db.f0
    public final int e() {
        return 0;
    }

    @Override // db.f0
    public final boolean f() {
        return false;
    }

    @Override // db.f0
    /* renamed from: g */
    public final q1 iterator() {
        return a().listIterator(0);
    }

    @Override // db.p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.B;
    }

    @Override // db.p0
    public final k0 l() {
        return k0.h(this.E, this.A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
