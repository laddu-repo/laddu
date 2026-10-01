package y9;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends i0 {
    public static final Object[] D;
    public static final f1 E;
    public final transient Object[] A;
    public final transient int B;
    public final transient int C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient Object[] f14554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient int f14555z;

    static {
        Object[] objArr = new Object[0];
        D = objArr;
        E = new f1(0, 0, 0, objArr, objArr);
    }

    public f1(int i, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f14554y = objArr;
        this.f14555z = i;
        this.A = objArr2;
        this.B = i10;
        this.C = i11;
    }

    @Override // y9.a0
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.f14554y;
        int i10 = this.C;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // y9.a0
    public final Object[] c() {
        return this.f14554y;
    }

    @Override // y9.a0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.A;
            if (objArr.length != 0) {
                int iV = p.v(obj);
                while (true) {
                    int i = iV & this.B;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iV = i + 1;
                }
            }
        }
        return false;
    }

    @Override // y9.a0
    public final int d() {
        return this.C;
    }

    @Override // y9.a0
    public final int e() {
        return 0;
    }

    @Override // y9.a0
    public final boolean f() {
        return false;
    }

    @Override // y9.a0
    /* JADX INFO: renamed from: g */
    public final p1 iterator() {
        return a().listIterator(0);
    }

    @Override // y9.i0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14555z;
    }

    @Override // y9.i0
    public final f0 l() {
        return f0.i(this.C, this.f14554y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.C;
    }
}
