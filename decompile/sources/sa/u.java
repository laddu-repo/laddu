package sa;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11682b;

    public u(String str, String str2) {
        this.f11681a = str;
        this.f11682b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return de.i.a(this.f11681a, uVar.f11681a) && de.i.a(this.f11682b, uVar.f11682b);
    }

    public final int hashCode() {
        String str = this.f11681a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11682b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f11681a + ", authToken=" + this.f11682b + ')';
    }
}
