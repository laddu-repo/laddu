package ue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.x;
import re.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f12984a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f12983w;
        ue.c.C.set(r2, null);
        r3 = r0.f12982v;
        r3.D(r1, r3.f8686x, new me.g(0, new ac.t(r2, r0)));
     */
    @Override // ue.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ud.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r6.e()
            od.l r1 = od.l.f10126a
            if (r0 == 0) goto L9
            goto L50
        L9:
            sd.c r7 = va.t1.h(r7)
            me.h r7 = me.x.h(r7)
            ue.b r0 = new ue.b     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = ue.g.B     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.f12988v     // Catch: java.lang.Throwable -> L51
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            ue.c r2 = r0.f12983w     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = ue.c.C     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L51
            me.h r3 = r0.f12982v     // Catch: java.lang.Throwable -> L51
            ac.t r4 = new ac.t     // Catch: java.lang.Throwable -> L51
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r3.f8686x     // Catch: java.lang.Throwable -> L51
            me.g r2 = new me.g     // Catch: java.lang.Throwable -> L51
            r5 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L51
            r3.D(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r7 = r7.u()
            td.a r0 = td.a.f12544v
            if (r7 != r0) goto L4c
            goto L4d
        L4c:
            r7 = r1
        L4d:
            if (r7 != r0) goto L50
            return r7
        L50:
            return r1
        L51:
            r0 = move-exception
            r7.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.a(ud.c):java.lang.Object");
    }

    public final boolean d() {
        return Math.max(g.B.get(this), 0) == 0;
    }

    public final boolean e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.B;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f12988v;
            if (i10 > i11) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    C.set(this, null);
                    return true;
                }
            }
        }
    }

    @Override // ue.a
    public final void i(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.f12984a;
            if (obj2 != tVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + x.g(this) + "[isLocked=" + d() + ",owner=" + C.get(this) + ']';
    }
}
