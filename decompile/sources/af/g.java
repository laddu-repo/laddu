package af;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ye.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye.d f506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye.d f507b;

    public g(ye.d dVar, ye.d dVar2) {
        de.i.e(dVar, "keyDesc");
        de.i.e(dVar2, "valueDesc");
        this.f506a = dVar;
        this.f507b = dVar2;
    }

    @Override // ye.d
    public final int a(String str) {
        de.i.e(str, "name");
        Integer numC = ke.p.C(str);
        if (numC != null) {
            return numC.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // ye.d
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // ye.d
    public final com.bumptech.glide.e c() {
        return ye.f.f14662d;
    }

    @Override // ye.d
    public final int d() {
        return 2;
    }

    @Override // ye.d
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return de.i.a(this.f506a, gVar.f506a) && de.i.a(this.f507b, gVar.f507b);
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
        return this.f507b.hashCode() + ((this.f506a.hashCode() + 710441009) * 31);
    }

    @Override // ye.d
    public final List i(int i) {
        if (i >= 0) {
            return pd.p.f10551v;
        }
        throw new IllegalArgumentException(d0.d.i(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // ye.d
    public final ye.d j(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(d0.d.i(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i10 = i % 2;
        if (i10 == 0) {
            return this.f506a;
        }
        if (i10 == 1) {
            return this.f507b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // ye.d
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(d0.d.i(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f506a + ", " + this.f507b + ')';
    }
}
