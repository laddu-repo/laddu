package de;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends d implements g, ie.a, od.a {
    public final int B;
    public final int C;

    public h(int i, Class cls, String str, String str2, int i10) {
        this(i, c.f4504v, cls, str, str2, i10, 0);
    }

    @Override // de.d
    public final ie.a c() {
        q.f4523a.getClass();
        return this;
    }

    @Override // de.g
    public final int d() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f4508y.equals(hVar.f4508y) && this.f4509z.equals(hVar.f4509z) && this.C == hVar.C && this.B == hVar.B && i.a(this.f4506w, hVar.f4506w) && e().equals(hVar.e());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        ie.a aVar = this.f4505v;
        if (aVar == null) {
            c();
            this.f4505v = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        e();
        return this.f4509z.hashCode() + d0.d.e(e().hashCode() * 31, 31, this.f4508y);
    }

    public final String toString() {
        ie.a aVar = this.f4505v;
        if (aVar == null) {
            c();
            this.f4505v = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f4508y;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : d0.d.l("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.B = i;
        this.C = 0;
    }
}
