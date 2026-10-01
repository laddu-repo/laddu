package gf;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends a {
    public final Thread A;
    public final y0 B;

    public f(le.h hVar, Thread thread, y0 y0Var) {
        super(hVar, true);
        this.A = thread;
        this.B = y0Var;
    }

    @Override // gf.t1
    public final void n(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.A;
        if (!kotlin.jvm.internal.k.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
