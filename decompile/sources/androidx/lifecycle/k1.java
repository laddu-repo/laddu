package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final p1.b f954a = new p1.b();

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        p1.b bVar = this.f954a;
        if (bVar != null) {
            if (bVar.f10455d) {
                p1.b.b(autoCloseable);
                return;
            }
            synchronized (bVar.f10452a) {
                autoCloseable2 = (AutoCloseable) bVar.f10453b.put(str, autoCloseable);
            }
            p1.b.b(autoCloseable2);
        }
    }

    public final void c() {
        p1.b bVar = this.f954a;
        if (bVar != null && !bVar.f10455d) {
            bVar.f10455d = true;
            synchronized (bVar.f10452a) {
                try {
                    Iterator it = bVar.f10453b.values().iterator();
                    while (it.hasNext()) {
                        p1.b.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f10454c.iterator();
                    while (it2.hasNext()) {
                        p1.b.b((AutoCloseable) it2.next());
                    }
                    bVar.f10454c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e();
    }

    public final AutoCloseable d(String str) {
        AutoCloseable autoCloseable;
        p1.b bVar = this.f954a;
        if (bVar != null) {
            synchronized (bVar.f10452a) {
                autoCloseable = (AutoCloseable) bVar.f10453b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void e() {
    }
}
