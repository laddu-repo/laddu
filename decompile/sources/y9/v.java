package y9;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends x {
    public static x f(int i) {
        return i < 0 ? x.f14628b : i > 0 ? x.f14629c : x.f14627a;
    }

    @Override // y9.x
    public final x a(int i, int i10) {
        return f(Integer.compare(i, i10));
    }

    @Override // y9.x
    public final x b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // y9.x
    public final x c(boolean z2, boolean z10) {
        return f(Boolean.compare(z2, z10));
    }

    @Override // y9.x
    public final x d(boolean z2, boolean z10) {
        return f(Boolean.compare(z10, z2));
    }

    @Override // y9.x
    public final int e() {
        return 0;
    }
}
