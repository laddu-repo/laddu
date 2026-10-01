package sd;

import ce.p;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f11797v = new i();

    @Override // sd.h
    public final f A(g gVar) {
        de.i.e(gVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // sd.h
    public final h l(g gVar) {
        de.i.e(gVar, "key");
        return this;
    }

    @Override // sd.h
    public final h n0(h hVar) {
        de.i.e(hVar, "context");
        return hVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // sd.h
    public final Object m(Object obj, p pVar) {
        return obj;
    }
}
