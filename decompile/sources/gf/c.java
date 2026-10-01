package gf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends o1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    public final k B;
    public q0 C;
    public final /* synthetic */ e D;
    private volatile /* synthetic */ Object _disposer$volatile;

    public c(e eVar, k kVar) {
        this.D = eVar;
        this.B = kVar;
    }

    @Override // gf.g1
    public final void a(Throwable th) {
        k kVar = this.B;
        if (th != null) {
            kVar.getClass();
            h5.a D = kVar.D(null, new t(th, false));
            if (D != null) {
                kVar.j(D);
                d dVar = (d) E.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f5659b;
        e eVar = this.D;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f5660a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.f());
            }
            kVar.resumeWith(arrayList);
        }
    }
}
