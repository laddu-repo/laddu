package mf;

import gf.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class t extends gf.a implements ne.d {
    public final le.c A;

    public t(le.c cVar, le.h hVar) {
        super(hVar, true);
        this.A = cVar;
    }

    @Override // gf.t1
    public final boolean J() {
        return true;
    }

    @Override // ne.d
    public final ne.d getCallerFrame() {
        le.c cVar = this.A;
        if (cVar instanceof ne.d) {
            return (ne.d) cVar;
        }
        return null;
    }

    @Override // gf.t1
    public void n(Object obj) {
        a.h(f0.z(obj), a8.c.i(this.A));
    }

    @Override // gf.t1
    public void o(Object obj) {
        this.A.resumeWith(f0.z(obj));
    }
}
