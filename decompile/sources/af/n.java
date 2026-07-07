package af;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ye.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye.c f527b;

    public n(String str, ye.c cVar) {
        de.i.e(cVar, "kind");
        this.f526a = str;
        this.f527b = cVar;
    }

    @Override // ye.d
    public final int a(String str) {
        de.i.e(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // ye.d
    public final String b() {
        return this.f526a;
    }

    @Override // ye.d
    public final com.bumptech.glide.e c() {
        return this.f527b;
    }

    @Override // ye.d
    public final int d() {
        return 0;
    }

    @Override // ye.d
    public final String e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return de.i.a(this.f526a, nVar.f526a) && de.i.a(this.f527b, nVar.f527b);
    }

    @Override // ye.d
    public final boolean f() {
        return false;
    }

    @Override // ye.d
    public final List getAnnotations() {
        return pd.p.f10551v;
    }

    @Override // ye.d
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (this.f527b.hashCode() * 31) + this.f526a.hashCode();
    }

    @Override // ye.d
    public final List i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // ye.d
    public final ye.d j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // ye.d
    public final boolean k(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f526a + ')';
    }
}
