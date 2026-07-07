package z6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f14811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14813e;
    public final ArrayList f;

    public t(long j8, long j9, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f14780v;
        this.f14809a = j8;
        this.f14810b = j9;
        this.f14811c = nVar;
        this.f14812d = num;
        this.f14813e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        t tVar = (t) ((f0) obj);
        Object obj2 = j0.f14780v;
        ArrayList arrayList = tVar.f;
        String str = tVar.f14813e;
        Integer num = tVar.f14812d;
        n nVar = tVar.f14811c;
        if (this.f14809a != tVar.f14809a || this.f14810b != tVar.f14810b || !this.f14811c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.f14812d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f14813e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j8 = this.f14809a;
        long j9 = this.f14810b;
        int iHashCode = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f14811c.hashCode()) * 1000003;
        Integer num = this.f14812d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f14813e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ j0.f14780v.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14809a + ", requestUptimeMs=" + this.f14810b + ", clientInfo=" + this.f14811c + ", logSource=" + this.f14812d + ", logSourceName=" + this.f14813e + ", logEvents=" + this.f + ", qosTier=" + j0.f14780v + "}";
    }
}
