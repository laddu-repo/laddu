package re;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11374a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11375b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void a() {
        f11375b.set(this, null);
    }

    public final b b() {
        Object obj = f11374a.get(this);
        if (obj == a.f11368a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean c();

    public final void d() {
        b bVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11375b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b bVarB2 = b();
            de.i.b(bVarB2);
            while (bVarB2.c() && (bVarB = bVarB2.b()) != null) {
                bVarB2 = bVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(bVarB2);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(bVarB2, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(bVarB2) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                f11374a.set(bVar, bVarB2);
            }
            if (!bVarB2.c() || bVarB2.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
