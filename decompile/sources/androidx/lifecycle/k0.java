package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0 f953x;

    public k0(o0 o0Var) {
        this.f953x = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f953x.f969a) {
            obj = this.f953x.f974f;
            this.f953x.f974f = o0.f968k;
        }
        this.f953x.h(obj);
    }
}
