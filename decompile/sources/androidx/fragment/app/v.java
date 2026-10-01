package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f1107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f1109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc.q f1110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc.r f1111e;

    public v(mc.r rVar, u uVar, AtomicReference atomicReference, m0 m0Var, mc.q qVar) {
        this.f1111e = rVar;
        this.f1107a = uVar;
        this.f1108b = atomicReference;
        this.f1109c = m0Var;
        this.f1110d = qVar;
    }

    @Override // androidx.fragment.app.x
    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        mc.r rVar = this.f1111e;
        sb2.append(rVar.A);
        sb2.append("_rq#");
        sb2.append(rVar.f1148p0.getAndIncrement());
        String string = sb2.toString();
        mc.r rVar2 = this.f1107a.f1106v;
        c0 c0Var = rVar2.O;
        this.f1108b.set((c0Var != null ? c0Var.B.D : rVar2.H().D).c(string, rVar, this.f1109c, this.f1110d));
    }
}
