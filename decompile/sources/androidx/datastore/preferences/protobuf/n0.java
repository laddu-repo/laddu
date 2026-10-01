package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f825c;

    public n0(c1 c1Var, o oVar, a aVar) {
        this.f824b = c1Var;
        oVar.getClass();
        this.f825c = oVar;
        this.f823a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void a(Object obj, Object obj2) {
        v0.k(this.f824b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void b(Object obj, e0 e0Var) {
        this.f825c.getClass();
        j4.a.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final int c(v vVar) {
        this.f824b.getClass();
        return vVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void d(Object obj) {
        this.f824b.getClass();
        b1 b1Var = ((v) obj).unknownFields;
        if (b1Var.f747e) {
            b1Var.f747e = false;
        }
        this.f825c.getClass();
        j4.a.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean e(Object obj) {
        this.f825c.getClass();
        j4.a.r(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean f(v vVar, v vVar2) {
        this.f824b.getClass();
        return vVar.unknownFields.equals(vVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void g(Object obj, k kVar, n nVar) {
        this.f824b.getClass();
        c1.a(obj);
        this.f825c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final int h(v vVar) {
        this.f824b.getClass();
        b1 b1Var = vVar.unknownFields;
        int i = b1Var.f746d;
        if (i != -1) {
            return i;
        }
        int iY = 0;
        for (int i10 = 0; i10 < b1Var.f743a; i10++) {
            int i11 = b1Var.f744b[i10] >>> 3;
            iY += l.Y(3, (g) b1Var.f745c[i10]) + l.b0(i11) + l.a0(2) + (l.a0(1) * 2);
        }
        b1Var.f746d = iY;
        return iY;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final v i() {
        a aVar = this.f823a;
        return aVar instanceof v ? ((v) aVar).i() : ((t) ((v) aVar).c(5)).b();
    }
}
