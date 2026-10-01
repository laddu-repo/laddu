package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13415e;
    public final String f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f13411a = str;
        this.f13412b = str2;
        this.f13413c = str3;
        this.f13414d = str4;
        this.f13415e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            String str5 = k0Var.f;
            String str6 = k0Var.f13415e;
            String str7 = k0Var.f13414d;
            String str8 = k0Var.f13413c;
            if (this.f13411a.equals(k0Var.f13411a) && this.f13412b.equals(k0Var.f13412b) && ((str = this.f13413c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f13414d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f13415e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13411a.hashCode() ^ 1000003) * 1000003) ^ this.f13412b.hashCode()) * 1000003;
        String str = this.f13413c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f13414d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13415e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f13411a);
        sb2.append(", version=");
        sb2.append(this.f13412b);
        sb2.append(", displayVersion=");
        sb2.append(this.f13413c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f13414d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f13415e);
        sb2.append(", developmentPlatformVersion=");
        return j4.a.n(sb2, this.f, "}");
    }
}
