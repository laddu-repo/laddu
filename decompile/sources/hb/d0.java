package hb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends h {
    public final boolean m(x xVar) {
        b bVar;
        xVar.getClass();
        Object obj = this.f6026x;
        if (obj == null) {
            if (xVar.isDone()) {
                if (o.C.d(this, null, o.h(xVar))) {
                    o.e(this, false);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, xVar);
            if (o.C.d(this, null, eVar)) {
                try {
                    xVar.a(eVar, q.f6029x);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Error | Exception unused) {
                        bVar = b.f6011b;
                    }
                    o.C.d(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f6026x;
        }
        if (obj instanceof a) {
            xVar.cancel(((a) obj).f6007a);
        }
        return false;
    }
}
