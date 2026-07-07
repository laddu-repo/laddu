package re;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import me.g1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends b implements g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11399d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11400c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j8, r rVar, int i) {
        super(rVar);
        this.f11400c = j8;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // re.b
    public final boolean c() {
        return f11399d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f11399d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, sd.h hVar);

    public final void h() {
        if (f11399d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f11399d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
