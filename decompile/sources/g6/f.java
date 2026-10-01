package g6;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends a8.e {
    @Override // a8.e
    public final boolean f(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5477y == cVar) {
                    hVar.f5477y = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a8.e
    public final boolean g(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f5476x == obj) {
                    hVar.f5476x = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a8.e
    public final boolean h(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5478z == gVar) {
                    hVar.f5478z = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a8.e
    public final void x(g gVar, g gVar2) {
        gVar.f5475b = gVar2;
    }

    @Override // a8.e
    public final void y(g gVar, Thread thread) {
        gVar.f5474a = thread;
    }
}
