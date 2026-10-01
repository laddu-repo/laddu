package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 implements d0, AutoCloseable {

    /* renamed from: x, reason: collision with root package name */
    public final String f887x;

    /* renamed from: y, reason: collision with root package name */
    public final a1 f888y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f889z;

    public b1(String str, a1 a1Var) {
        this.f887x = str;
        this.f888y = a1Var;
    }

    public final void a0(y lifecycle, e5.e registry) {
        kotlin.jvm.internal.k.e(registry, "registry");
        kotlin.jvm.internal.k.e(lifecycle, "lifecycle");
        if (!this.f889z) {
            this.f889z = true;
            lifecycle.a(this);
            registry.c(this.f887x, (d.i) this.f888y.f883b.f1470y);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        if (wVar == w.ON_DESTROY) {
            this.f889z = false;
            f0Var.getLifecycle().c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
