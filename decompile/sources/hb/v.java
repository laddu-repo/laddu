package hb;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final e0 f6037x;

    public v(e0 e0Var) {
        this.f6037x = e0Var;
    }

    public static void a(v vVar, Thread thread) {
        vVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f6037x.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
