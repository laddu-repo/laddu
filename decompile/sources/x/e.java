package x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends lg.c {
    @Override // lg.c
    public final boolean a(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f14446y == cVar) {
                    gVar.f14446y = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // lg.c
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f14445x == obj) {
                    gVar.f14445x = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // lg.c
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f14447z == fVar) {
                    gVar.f14447z = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // lg.c
    public final void n(f fVar, f fVar2) {
        fVar.f14444b = fVar2;
    }

    @Override // lg.c
    public final void o(f fVar, Thread thread) {
        fVar.f14443a = thread;
    }
}
