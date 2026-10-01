package wf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends w0 {

    /* renamed from: l, reason: collision with root package name */
    public final uf.i f14396l;

    /* renamed from: m, reason: collision with root package name */
    public final he.m f14397m;

    public u(final String str, final int i6) {
        super(str, null, i6);
        this.f14396l = uf.i.f13135g;
        this.f14397m = he.a.d(new ve.a() { // from class: wf.t
            @Override // ve.a
            public final Object invoke() {
                int i10 = i6;
                uf.g[] gVarArr = new uf.g[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    gVarArr[i11] = a.a.f(str + '.' + this.f14415e[i11], uf.j.f13139i, new uf.g[0]);
                }
                return gVarArr;
            }
        });
    }

    @Override // wf.w0
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof uf.g)) {
                uf.g gVar = (uf.g) obj;
                if (gVar.getKind() != uf.i.f13135g || !this.f14411a.equals(gVar.a()) || !kotlin.jvm.internal.k.a(u0.b(this), u0.b(gVar))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // wf.w0, uf.g
    public final a8.a getKind() {
        return this.f14396l;
    }

    @Override // wf.w0, uf.g
    public final uf.g h(int i6) {
        return ((uf.g[]) this.f14397m.getValue())[i6];
    }

    @Override // wf.w0
    public final int hashCode() {
        int i6;
        int hashCode = this.f14411a.hashCode();
        he.p pVar = new he.p(this);
        int i10 = 1;
        while (pVar.hasNext()) {
            int i11 = i10 * 31;
            String str = (String) pVar.next();
            if (str != null) {
                i6 = str.hashCode();
            } else {
                i6 = 0;
            }
            i10 = i11 + i6;
        }
        return (hashCode * 31) + i10;
    }

    @Override // wf.w0
    public final String toString() {
        return ie.j.L(new cf.q(this, 2), ", ", this.f14411a.concat("("), ")", null, 56);
    }
}
