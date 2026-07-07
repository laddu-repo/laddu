package k3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7335c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f7334b = str2;
        this.f7335c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f7321a.equals(pVar.f7321a) && Objects.equals(this.f7334b, pVar.f7334b) && Objects.equals(this.f7335c, pVar.f7335c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = d0.d.e(527, 31, this.f7321a);
        String str = this.f7334b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7335c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // k3.j
    public final String toString() {
        return this.f7321a + ": url=" + this.f7335c;
    }
}
