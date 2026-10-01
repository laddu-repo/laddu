package gf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r1 implements d1 {
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final v1 f5698x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5696y = AtomicIntegerFieldUpdater.newUpdater(r1.class, "_isCompleting$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5697z = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_exceptionsHolder$volatile");

    public r1(v1 v1Var, Throwable th) {
        this.f5698x = v1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b10 = b();
        if (b10 == null) {
            f5697z.set(this, th);
            return;
        }
        if (th != b10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable b() {
        return (Throwable) f5697z.get(this);
    }

    @Override // gf.d1
    public final v1 c() {
        return this.f5698x;
    }

    public final boolean d() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f5696y.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable b10 = b();
        if (b10 != null) {
            arrayList.add(0, b10);
        }
        if (th != null && !th.equals(b10)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, f0.f5672h);
        return arrayList;
    }

    @Override // gf.d1
    public final boolean isActive() {
        if (b() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + A.get(this) + ", list=" + this.f5698x + ']';
    }
}
