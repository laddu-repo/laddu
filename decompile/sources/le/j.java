package le;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements c, ne.d {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8354y = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");
    private volatile Object result;

    /* renamed from: x, reason: collision with root package name */
    public final c f8355x;

    public j(c cVar) {
        me.a aVar = me.a.f8834y;
        this.f8355x = cVar;
        this.result = aVar;
    }

    public final Object b() {
        Object obj = this.result;
        me.a aVar = me.a.f8834y;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8354y;
            me.a aVar2 = me.a.f8833x;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return me.a.f8833x;
        }
        if (obj == me.a.f8835z) {
            return me.a.f8833x;
        }
        if (!(obj instanceof he.j)) {
            return obj;
        }
        throw ((he.j) obj).f6078x;
    }

    @Override // ne.d
    public final ne.d getCallerFrame() {
        c cVar = this.f8355x;
        if (cVar instanceof ne.d) {
            return (ne.d) cVar;
        }
        return null;
    }

    @Override // le.c
    public final h getContext() {
        return this.f8355x.getContext();
    }

    @Override // le.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            me.a aVar = me.a.f8834y;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8354y;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            me.a aVar2 = me.a.f8833x;
            if (obj2 == aVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8354y;
                me.a aVar3 = me.a.f8835z;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                this.f8355x.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f8355x;
    }
}
