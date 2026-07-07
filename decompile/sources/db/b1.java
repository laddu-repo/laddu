package db;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 extends d0 {
    public static final b1 F = new b1();
    public final transient Object A;
    public final transient Object[] B;
    public final transient int C;
    public final transient int D;
    public final transient b1 E;

    public b1() {
        this.A = null;
        this.B = new Object[0];
        this.C = 0;
        this.D = 0;
        this.E = this;
    }

    @Override // db.n0
    public final e1 b() {
        return new e1(this, this.B, this.C, this.D);
    }

    @Override // db.n0
    public final f1 c() {
        return new f1(this, new g1(this.B, this.C, this.D));
    }

    @Override // db.n0, java.util.Map
    public final Object get(Object obj) {
        Object i6 = h1.i(this.A, this.B, this.D, this.C, obj);
        if (i6 == null) {
            return null;
        }
        return i6;
    }

    @Override // java.util.Map
    public final int size() {
        return this.D;
    }

    public b1(int i6, Object[] objArr) {
        this.B = objArr;
        this.D = i6;
        this.C = 0;
        int h4 = i6 >= 2 ? p0.h(i6) : 0;
        Object h10 = h1.h(objArr, i6, h4, 0);
        if (!(h10 instanceof Object[])) {
            this.A = h10;
            Object h11 = h1.h(objArr, i6, h4, 1);
            if (!(h11 instanceof Object[])) {
                this.E = new b1(h11, objArr, i6, this);
                return;
            }
            throw ((m0) ((Object[]) h11)[2]).a();
        }
        throw ((m0) ((Object[]) h10)[2]).a();
    }

    public b1(Object obj, Object[] objArr, int i6, b1 b1Var) {
        this.A = obj;
        this.B = objArr;
        this.C = 1;
        this.D = i6;
        this.E = b1Var;
    }
}
