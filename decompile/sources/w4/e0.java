package w4;

import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e0 extends k0 {
    public final e A;

    public e0(b bVar) {
        d0 d0Var = new d0(this);
        v9.b bVar2 = new v9.b(this);
        synchronized (b.f13815a) {
            try {
                if (b.f13816b == null) {
                    b.f13816b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = new e(bVar2, new s8.l(17, b.f13816b, bVar));
        this.A = eVar;
        eVar.f13853d.add(d0Var);
    }

    @Override // w4.k0
    public final int a() {
        return this.A.f13855f.size();
    }

    public final Object h(int i6) {
        return this.A.f13855f.get(i6);
    }

    public final void i(List list) {
        this.A.b(list, null);
    }
}
