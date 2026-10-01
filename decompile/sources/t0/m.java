package t0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f12371a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f12372b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12373c = new HashMap();

    public m(Runnable runnable) {
        this.f12371a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f12372b.iterator();
        while (it.hasNext()) {
            if (((j1.h0) ((n) it.next())).f6917a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void b(n nVar) {
        this.f12372b.remove(nVar);
        l lVar = (l) this.f12373c.remove(nVar);
        if (lVar != null) {
            lVar.f12367a.c(lVar.f12368b);
            lVar.f12368b = null;
        }
        this.f12371a.run();
    }
}
