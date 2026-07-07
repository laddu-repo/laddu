package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b2 extends mf.t {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(le.h hVar, le.c cVar, int i6) {
        super(cVar, hVar);
        this.B = i6;
    }

    @Override // gf.t1
    public final boolean u(Throwable th) {
        switch (this.B) {
            case 0:
                return false;
            default:
                if (th instanceof lf.l) {
                    return true;
                }
                return q(th);
        }
    }
}
