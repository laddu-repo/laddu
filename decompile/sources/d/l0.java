package d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 implements d {

    /* renamed from: x, reason: collision with root package name */
    public final f0 f3457x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f3458y;

    public l0(n0 n0Var, f0 onBackPressedCallback) {
        kotlin.jvm.internal.k.e(onBackPressedCallback, "onBackPressedCallback");
        this.f3458y = n0Var;
        this.f3457x = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ve.a, kotlin.jvm.internal.j] */
    @Override // d.d
    public final void cancel() {
        n0 n0Var = this.f3458y;
        ie.h hVar = n0Var.f3463b;
        f0 f0Var = this.f3457x;
        hVar.remove(f0Var);
        if (kotlin.jvm.internal.k.a(n0Var.f3464c, f0Var)) {
            f0Var.a();
            n0Var.f3464c = null;
        }
        f0Var.f3433b.remove(this);
        ?? r02 = f0Var.f3434c;
        if (r02 != 0) {
            r02.invoke();
        }
        f0Var.f3434c = null;
    }
}
