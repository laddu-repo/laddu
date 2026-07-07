package af;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ye.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye.d f528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f530c;

    public o(ye.d dVar) {
        Set setG;
        de.i.e(dVar, "original");
        this.f528a = dVar;
        this.f529b = dVar.b() + '?';
        de.i.e(dVar, "<this>");
        if (dVar instanceof b) {
            setG = ((b) dVar).g();
        } else {
            HashSet hashSet = new HashSet(dVar.d());
            int iD = dVar.d();
            for (int i = 0; i < iD; i++) {
                hashSet.add(dVar.e(i));
            }
            setG = hashSet;
        }
        this.f530c = setG;
    }

    @Override // ye.d
    public final int a(String str) {
        de.i.e(str, "name");
        return this.f528a.a(str);
    }

    @Override // ye.d
    public final String b() {
        return this.f529b;
    }

    @Override // ye.d
    public final com.bumptech.glide.e c() {
        return this.f528a.c();
    }

    @Override // ye.d
    public final int d() {
        return this.f528a.d();
    }

    @Override // ye.d
    public final String e(int i) {
        return this.f528a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return de.i.a(this.f528a, ((o) obj).f528a);
        }
        return false;
    }

    @Override // ye.d
    public final boolean f() {
        return this.f528a.f();
    }

    @Override // af.b
    public final Set g() {
        return this.f530c;
    }

    @Override // ye.d
    public final List getAnnotations() {
        return this.f528a.getAnnotations();
    }

    @Override // ye.d
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.f528a.hashCode() * 31;
    }

    @Override // ye.d
    public final List i(int i) {
        return this.f528a.i(i);
    }

    @Override // ye.d
    public final ye.d j(int i) {
        return this.f528a.j(i);
    }

    @Override // ye.d
    public final boolean k(int i) {
        return this.f528a.k(i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f528a);
        sb2.append('?');
        return sb2.toString();
    }
}
