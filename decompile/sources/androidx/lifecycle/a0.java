package androidx.lifecycle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 implements d0, gf.c0 {

    /* renamed from: x, reason: collision with root package name */
    public final y f880x;

    /* renamed from: y, reason: collision with root package name */
    public final le.h f881y;

    public a0(y yVar, le.h coroutineContext) {
        kotlin.jvm.internal.k.e(coroutineContext, "coroutineContext");
        this.f880x = yVar;
        this.f881y = coroutineContext;
        if (yVar.b() == x.f991x) {
            gf.f0.h(coroutineContext, null);
        }
    }

    @Override // gf.c0
    public final le.h getCoroutineContext() {
        return this.f881y;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        y yVar = this.f880x;
        if (yVar.b().compareTo(x.f991x) <= 0) {
            yVar.c(this);
            gf.f0.h(this.f881y, null);
        }
    }
}
