package m6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final m f8648a;

    /* renamed from: b, reason: collision with root package name */
    public final qf.i f8649b;

    public d(int i6, m mVar) {
        this.f8648a = mVar;
        int i10 = qf.j.f11221a;
        this.f8649b = new qf.i(i6);
    }

    @Override // m6.j
    public final k a(p6.m mVar, v6.o oVar) {
        return new f(mVar.f10612a, oVar, this.f8649b, this.f8648a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof d;
    }

    public final int hashCode() {
        return d.class.hashCode();
    }
}
