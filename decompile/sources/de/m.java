package de;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends d implements ie.c {
    public final boolean B;

    public m(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.B = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return e().equals(mVar.e()) && this.f4508y.equals(mVar.f4508y) && this.f4509z.equals(mVar.f4509z) && i.a(this.f4506w, mVar.f4506w);
        }
        if (obj instanceof ie.c) {
            return obj.equals(f());
        }
        return false;
    }

    public final ie.a f() {
        if (this.B) {
            return this;
        }
        ie.a aVar = this.f4505v;
        if (aVar != null) {
            return aVar;
        }
        ie.a aVarC = c();
        this.f4505v = aVarC;
        return aVarC;
    }

    public final int hashCode() {
        return this.f4509z.hashCode() + d0.d.e(e().hashCode() * 31, 31, this.f4508y);
    }

    public final String toString() {
        ie.a aVarF = f();
        return aVarF != this ? aVarF.toString() : j4.a.n(new StringBuilder("property "), this.f4508y, " (Kotlin reflection is not available)");
    }
}
