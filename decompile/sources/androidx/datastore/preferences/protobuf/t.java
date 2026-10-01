package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements Cloneable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v f856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v f857w;

    public t(v vVar) {
        this.f856v = vVar;
        if (vVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f857w = vVar.i();
    }

    public final v a() {
        v vVarB = b();
        vVarB.getClass();
        if (v.f(vVarB, true)) {
            return vVarB;
        }
        throw new a1();
    }

    public final v b() {
        if (!this.f857w.g()) {
            return this.f857w;
        }
        v vVar = this.f857w;
        vVar.getClass();
        r0 r0Var = r0.f848c;
        r0Var.getClass();
        r0Var.a(vVar.getClass()).d(vVar);
        vVar.h();
        return this.f857w;
    }

    public final void c() {
        if (this.f857w.g()) {
            return;
        }
        v vVarI = this.f856v.i();
        v vVar = this.f857w;
        r0 r0Var = r0.f848c;
        r0Var.getClass();
        r0Var.a(vVarI.getClass()).a(vVarI, vVar);
        this.f857w = vVarI;
    }

    public final Object clone() {
        t tVar = (t) this.f856v.c(5);
        tVar.f857w = b();
        return tVar;
    }
}
