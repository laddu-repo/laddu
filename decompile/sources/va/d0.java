package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13316e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13318h;
    public final List i;

    public d0(int i, String str, int i10, int i11, long j8, long j9, long j10, String str2, List list) {
        this.f13312a = i;
        this.f13313b = str;
        this.f13314c = i10;
        this.f13315d = i11;
        this.f13316e = j8;
        this.f = j9;
        this.f13317g = j10;
        this.f13318h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            List list2 = d0Var.i;
            String str2 = d0Var.f13318h;
            if (this.f13312a == d0Var.f13312a && this.f13313b.equals(d0Var.f13313b) && this.f13314c == d0Var.f13314c && this.f13315d == d0Var.f13315d && this.f13316e == d0Var.f13316e && this.f == d0Var.f && this.f13317g == d0Var.f13317g && ((str = this.f13318h) != null ? str.equals(str2) : str2 == null) && ((list = this.i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13312a ^ 1000003) * 1000003) ^ this.f13313b.hashCode()) * 1000003) ^ this.f13314c) * 1000003) ^ this.f13315d) * 1000003;
        long j8 = this.f13316e;
        int i = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f;
        int i10 = (i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f13317g;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str = this.f13318h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f13312a + ", processName=" + this.f13313b + ", reasonCode=" + this.f13314c + ", importance=" + this.f13315d + ", pss=" + this.f13316e + ", rss=" + this.f + ", timestamp=" + this.f13317g + ", traceFile=" + this.f13318h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
