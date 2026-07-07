package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: x, reason: collision with root package name */
    public final c[] f5654x;

    public d(c[] cVarArr) {
        this.f5654x = cVarArr;
    }

    @Override // gf.i
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f5654x) {
            q0 q0Var = cVar.C;
            if (q0Var != null) {
                q0Var.d();
            } else {
                kotlin.jvm.internal.k.k("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f5654x + ']';
    }
}
