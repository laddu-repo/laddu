package s9;

import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n f12263a = new n();

    public final void a(Object obj) {
        this.f12263a.m(obj);
    }

    public final boolean b(Exception exc) {
        n nVar = this.f12263a;
        nVar.getClass();
        x.h(exc, "Exception must not be null");
        synchronized (nVar.f12275a) {
            try {
                if (nVar.f12277c) {
                    return false;
                }
                nVar.f12277c = true;
                nVar.f12280f = exc;
                nVar.f12276b.f(nVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        n nVar = this.f12263a;
        synchronized (nVar.f12275a) {
            try {
                if (nVar.f12277c) {
                    return;
                }
                nVar.f12277c = true;
                nVar.f12279e = obj;
                nVar.f12276b.f(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
