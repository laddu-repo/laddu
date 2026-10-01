package c2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1 f1967b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.i0 f1968a;

    static {
        s5.c cVar = new s5.c(5);
        cVar.f11492w = y9.i0.j(2, 1, 5);
        f1967b = new t1(cVar);
    }

    public t1(s5.c cVar) {
        this.f1968a = (y9.i0) cVar.f11492w;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t1) && this.f1968a.equals(((t1) obj).f1968a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f1968a, null, null, bool, bool, bool, bool);
    }
}
