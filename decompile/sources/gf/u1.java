package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u1 extends a2 {
    public final le.c A;

    public u1(le.h hVar, ve.p pVar) {
        super(hVar, false);
        this.A = a8.c.e(this, this, pVar);
    }

    @Override // gf.t1
    public final void R() {
        try {
            mf.a.h(he.y.f6101a, a8.c.i(this.A));
        } catch (Throwable th) {
            resumeWith(he.a.b(th));
            throw th;
        }
    }
}
