package kf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d extends lf.e {
    public final ne.j A;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ve.p pVar, le.h hVar, int i6, jf.a aVar) {
        super(hVar, i6, aVar);
        this.A = (ne.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ne.j, ve.p] */
    @Override // lf.e
    public Object a(jf.v vVar, le.c cVar) {
        Object invoke = this.A.invoke(vVar, cVar);
        if (invoke == me.a.f8833x) {
            return invoke;
        }
        return he.y.f6101a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ne.j, ve.p] */
    @Override // lf.e
    public lf.e b(le.h hVar, int i6, jf.a aVar) {
        return new d(this.A, hVar, i6, aVar);
    }

    @Override // lf.e
    public final String toString() {
        return "block[" + this.A + "] -> " + super.toString();
    }
}
