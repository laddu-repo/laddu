package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f471e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f472g;

    public y0(String str, String str2, int i, long j8, k kVar, String str3, String str4) {
        de.i.e(str, "sessionId");
        de.i.e(str2, "firstSessionId");
        de.i.e(str4, "firebaseAuthenticationToken");
        this.f467a = str;
        this.f468b = str2;
        this.f469c = i;
        this.f470d = j8;
        this.f471e = kVar;
        this.f = str3;
        this.f472g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return de.i.a(this.f467a, y0Var.f467a) && de.i.a(this.f468b, y0Var.f468b) && this.f469c == y0Var.f469c && this.f470d == y0Var.f470d && de.i.a(this.f471e, y0Var.f471e) && de.i.a(this.f, y0Var.f) && de.i.a(this.f472g, y0Var.f472g);
    }

    public final int hashCode() {
        int iE = (d0.d.e(this.f467a.hashCode() * 31, 31, this.f468b) + this.f469c) * 31;
        long j8 = this.f470d;
        return this.f472g.hashCode() + d0.d.e((this.f471e.hashCode() + ((iE + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f467a + ", firstSessionId=" + this.f468b + ", sessionIndex=" + this.f469c + ", eventTimestampUs=" + this.f470d + ", dataCollectionStatus=" + this.f471e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.f472g + ')';
    }
}
