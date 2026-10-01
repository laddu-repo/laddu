package va;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13277e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13279h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m2 f13281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s1 f13282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1 f13283m;

    public b0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f13274b = str;
        this.f13275c = str2;
        this.f13276d = i;
        this.f13277e = str3;
        this.f = str4;
        this.f13278g = str5;
        this.f13279h = str6;
        this.i = str7;
        this.f13280j = str8;
        this.f13281k = m2Var;
        this.f13282l = s1Var;
        this.f13283m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.f13249a = this.f13274b;
        a0Var.f13250b = this.f13275c;
        a0Var.f13251c = this.f13276d;
        a0Var.f13252d = this.f13277e;
        a0Var.f13253e = this.f;
        a0Var.f = this.f13278g;
        a0Var.f13254g = this.f13279h;
        a0Var.f13255h = this.i;
        a0Var.i = this.f13280j;
        a0Var.f13256j = this.f13281k;
        a0Var.f13257k = this.f13282l;
        a0Var.f13258l = this.f13283m;
        a0Var.f13259m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        m2 m2Var;
        s1 s1Var;
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            p1 p1Var2 = b0Var.f13283m;
            s1 s1Var2 = b0Var.f13282l;
            m2 m2Var2 = b0Var.f13281k;
            String str4 = b0Var.f13279h;
            String str5 = b0Var.f13278g;
            String str6 = b0Var.f;
            if (this.f13274b.equals(b0Var.f13274b) && this.f13275c.equals(b0Var.f13275c) && this.f13276d == b0Var.f13276d && this.f13277e.equals(b0Var.f13277e) && ((str = this.f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f13278g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f13279h) != null ? str3.equals(str4) : str4 == null) && this.i.equals(b0Var.i) && this.f13280j.equals(b0Var.f13280j) && ((m2Var = this.f13281k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.f13282l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.f13283m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13274b.hashCode() ^ 1000003) * 1000003) ^ this.f13275c.hashCode()) * 1000003) ^ this.f13276d) * 1000003) ^ this.f13277e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f13278g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13279h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.f13280j.hashCode()) * 1000003;
        m2 m2Var = this.f13281k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.f13282l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.f13283m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f13274b + ", gmpAppId=" + this.f13275c + ", platform=" + this.f13276d + ", installationUuid=" + this.f13277e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.f13278g + ", appQualitySessionId=" + this.f13279h + ", buildVersion=" + this.i + ", displayVersion=" + this.f13280j + ", session=" + this.f13281k + ", ndkPayload=" + this.f13282l + ", appExitInfo=" + this.f13283m + "}";
    }
}
