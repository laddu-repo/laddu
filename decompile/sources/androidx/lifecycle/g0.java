package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public x f918a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f919b;

    public final void a(f0 f0Var, w wVar) {
        x a10 = wVar.a();
        x state1 = this.f918a;
        kotlin.jvm.internal.k.e(state1, "state1");
        if (a10.compareTo(state1) < 0) {
            state1 = a10;
        }
        this.f918a = state1;
        this.f919b.onStateChanged(f0Var, wVar);
        this.f918a = a10;
    }
}
