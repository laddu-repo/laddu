package d1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements sd.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m1 f3920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e0 f3921w;

    public m1(m1 m1Var, e0 e0Var) {
        this.f3920v = m1Var;
        this.f3921w = e0Var;
    }

    @Override // sd.h
    public final sd.f A(sd.g gVar) {
        return com.bumptech.glide.d.k(this, gVar);
    }

    public final void b(e0 e0Var) {
        if (this.f3921w == e0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        m1 m1Var = this.f3920v;
        if (m1Var != null) {
            m1Var.b(e0Var);
        }
    }

    @Override // sd.f
    public final sd.g getKey() {
        return l1.f3915v;
    }

    @Override // sd.h
    public final sd.h l(sd.g gVar) {
        return com.bumptech.glide.d.C(this, gVar);
    }

    @Override // sd.h
    public final Object m(Object obj, ce.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // sd.h
    public final sd.h n0(sd.h hVar) {
        return com.bumptech.glide.d.G(this, hVar);
    }
}
