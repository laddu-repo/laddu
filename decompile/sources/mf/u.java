package mf;

import gf.y1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u extends d implements y1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: z, reason: collision with root package name */
    public final long f8877z;

    public u(long j, u uVar, int i6) {
        super(uVar);
        this.f8877z = j;
        this.cleanedAndPointers$volatile = i6 << 16;
    }

    @Override // mf.d
    public final boolean d() {
        if (A.get(this) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (A.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i6, le.h hVar);

    public final void i() {
        if (A.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = A;
            i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 65536 + i6));
        return true;
    }
}
