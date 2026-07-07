package ud;

import sd.i;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(sd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.f() != i.f11797v) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // sd.c
    public final sd.h f() {
        return i.f11797v;
    }
}
