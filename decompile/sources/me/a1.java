package me;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends h {
    public final n D;

    public a1(sd.c cVar, n nVar) {
        super(1, cVar);
        this.D = nVar;
    }

    @Override // me.h
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // me.h
    public final Throwable t(d1 d1Var) {
        Throwable thC;
        n nVar = this.D;
        nVar.getClass();
        Object obj = d1.f8687v.get(nVar);
        return (!(obj instanceof c1) || (thC = ((c1) obj).c()) == null) ? obj instanceof p ? ((p) obj).f8723a : d1Var.x() : thC;
    }
}
