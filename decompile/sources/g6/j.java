package g6;

import hb.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.D;
        }
        if (h.C.g(this, null, obj)) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th) {
        if (h.C.g(this, null, new b(th))) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(x xVar) {
        b bVar;
        xVar.getClass();
        Object obj = this.f5476x;
        if (obj == null) {
            if (xVar.isDone()) {
                if (h.C.g(this, null, h.f(xVar))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, xVar);
            if (h.C.g(this, null, eVar)) {
                try {
                    xVar.a(eVar, i.f5479x);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Throwable unused) {
                        bVar = b.f5460b;
                    }
                    h.C.g(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f5476x;
        }
        if (obj instanceof a) {
            xVar.cancel(((a) obj).f5458a);
        }
        return false;
    }
}
