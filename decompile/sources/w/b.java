package w;

import java.util.List;
import w2.a0;
import w2.g0;
import w2.q;
import w6.c;
import zc.h;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q, c {
    public static zc.a b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zc.a.f14871x : zc.a.A : zc.a.f14873z : zc.a.f14872y;
    }

    public static h c(int i) {
        if (i == -1) {
            return h.f14903z;
        }
        h hVar = h.f14902y;
        return (i == 0 || i != 1) ? hVar : h.f14901x;
    }

    @Override // w6.c
    public void a(Object obj) {
        ((List) obj).clear();
    }

    @Override // w2.q
    public void e() {
        throw new UnsupportedOperationException();
    }

    @Override // w2.q
    public void k(a0 a0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // w2.q
    public g0 r(int i, int i10) {
        throw new UnsupportedOperationException();
    }
}
