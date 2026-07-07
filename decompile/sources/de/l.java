package de;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m implements ie.c, ce.p {
    @Override // de.d
    public final ie.a c() {
        q.f4523a.getClass();
        return this;
    }

    public final void g() {
        if (this.B) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        ie.a aVarF = f();
        if (aVarF == this) {
            throw new be.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((ie.c) aVarF)).g();
    }

    @Override // ce.p
    public final Object i(Object obj, Object obj2) {
        g();
        throw null;
    }
}
