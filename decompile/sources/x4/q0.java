package x4;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 extends g {

    /* renamed from: b, reason: collision with root package name */
    public final i f14631b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f14632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(i iVar, b0 delegate) {
        super(delegate.f14571a);
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.f14631b = iVar;
        this.f14632c = new WeakReference(delegate);
    }

    @Override // x4.g
    public final void a(Set tables) {
        kotlin.jvm.internal.k.e(tables, "tables");
        g gVar = (g) this.f14632c.get();
        if (gVar == null) {
            i iVar = this.f14631b;
            iVar.getClass();
            kotlin.jvm.internal.k.e(this, "observer");
            ReentrantLock reentrantLock = iVar.f14581d;
            reentrantLock.lock();
            try {
                n nVar = (n) iVar.f14580c.remove(this);
                if (nVar != null) {
                    p0 p0Var = iVar.f14579b;
                    int[] tableIds = nVar.f14610b;
                    p0Var.getClass();
                    kotlin.jvm.internal.k.e(tableIds, "tableIds");
                    if (p0Var.f14627h.i(tableIds)) {
                        android.support.v4.media.session.b.q(new h(iVar, null, 1));
                        return;
                    }
                    return;
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        gVar.a(tables);
    }
}
