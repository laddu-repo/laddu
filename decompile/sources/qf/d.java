package qf;

import gf.f0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends i implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d() {
        super(1);
        this.owner$volatile = e.f11215a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        r0 = r1.f11214y;
        r5.set(r0, null);
        r1.f11213x.e(new qf.b(r0, r1, 0), r4);
     */
    @Override // qf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ne.c r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qf.i.D
            int r1 = r0.get(r7)
            int r2 = r7.f11219x
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            r3 = 0
            he.y r4 = he.y.f6101a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = qf.d.E
            if (r1 > 0) goto L5d
            le.c r8 = a8.c.i(r8)
            gf.k r8 = gf.f0.r(r8)
            qf.c r1 = new qf.c     // Catch: java.lang.Throwable -> L58
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L58
        L2b:
            int r6 = r0.getAndDecrement(r7)     // Catch: java.lang.Throwable -> L58
            if (r6 > r2) goto L2b
            if (r6 <= 0) goto L44
            qf.d r0 = r1.f11214y     // Catch: java.lang.Throwable -> L58
            r5.set(r0, r3)     // Catch: java.lang.Throwable -> L58
            gf.k r2 = r1.f11213x     // Catch: java.lang.Throwable -> L58
            qf.b r3 = new qf.b     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r3.<init>(r0, r1, r5)     // Catch: java.lang.Throwable -> L58
            r2.e(r3, r4)     // Catch: java.lang.Throwable -> L58
            goto L4a
        L44:
            boolean r6 = r7.b(r1)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L2b
        L4a:
            java.lang.Object r8 = r8.r()
            me.a r0 = me.a.f8833x
            if (r8 != r0) goto L53
            goto L54
        L53:
            r8 = r4
        L54:
            if (r8 != r0) goto L57
            return r8
        L57:
            return r4
        L58:
            r0 = move-exception
            r8.z()
            throw r0
        L5d:
            int r2 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 == 0) goto L0
            r5.set(r7, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.d.d(ne.c):java.lang.Object");
    }

    @Override // qf.a
    public final void f(Object obj) {
        while (Math.max(i.D.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            h5.a aVar = e.f11215a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                c();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(f0.p(this));
        sb2.append("[isLocked=");
        boolean z10 = false;
        if (Math.max(i.D.get(this), 0) == 0) {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append(",owner=");
        sb2.append(E.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
