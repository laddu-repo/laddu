package va;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f13397e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1 f13398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2 f13399h;
    public final k2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v1 f13400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f13401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13402l;

    public j0(String str, String str2, String str3, long j8, Long l10, boolean z2, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i) {
        this.f13393a = str;
        this.f13394b = str2;
        this.f13395c = str3;
        this.f13396d = j8;
        this.f13397e = l10;
        this.f = z2;
        this.f13398g = u1Var;
        this.f13399h = l2Var;
        this.i = k2Var;
        this.f13400j = v1Var;
        this.f13401k = list;
        this.f13402l = i;
    }

    @Override // va.m2
    public final i0 a() {
        i0 i0Var = new i0();
        i0Var.f13367a = this.f13393a;
        i0Var.f13368b = this.f13394b;
        i0Var.f13369c = this.f13395c;
        i0Var.f13370d = this.f13396d;
        i0Var.f13371e = this.f13397e;
        i0Var.f = this.f;
        i0Var.f13372g = this.f13398g;
        i0Var.f13373h = this.f13399h;
        i0Var.i = this.i;
        i0Var.f13374j = this.f13400j;
        i0Var.f13375k = this.f13401k;
        i0Var.f13376l = this.f13402l;
        i0Var.f13377m = (byte) 7;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        l2 l2Var;
        k2 k2Var;
        v1 v1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            List list2 = j0Var.f13401k;
            v1 v1Var2 = j0Var.f13400j;
            k2 k2Var2 = j0Var.i;
            l2 l2Var2 = j0Var.f13399h;
            Long l11 = j0Var.f13397e;
            String str2 = j0Var.f13395c;
            if (this.f13393a.equals(j0Var.f13393a) && this.f13394b.equals(j0Var.f13394b) && ((str = this.f13395c) != null ? str.equals(str2) : str2 == null) && this.f13396d == j0Var.f13396d && ((l10 = this.f13397e) != null ? l10.equals(l11) : l11 == null) && this.f == j0Var.f && this.f13398g.equals(j0Var.f13398g) && ((l2Var = this.f13399h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.f13400j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.f13401k) != null ? list.equals(list2) : list2 == null) && this.f13402l == j0Var.f13402l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13393a.hashCode() ^ 1000003) * 1000003) ^ this.f13394b.hashCode()) * 1000003;
        String str = this.f13395c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j8 = this.f13396d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l10 = this.f13397e;
        int iHashCode3 = (((((i ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f13398g.hashCode()) * 1000003;
        l2 l2Var = this.f13399h;
        int iHashCode4 = (iHashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.i;
        int iHashCode5 = (iHashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.f13400j;
        int iHashCode6 = (iHashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.f13401k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f13402l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f13393a);
        sb2.append(", identifier=");
        sb2.append(this.f13394b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f13395c);
        sb2.append(", startedAt=");
        sb2.append(this.f13396d);
        sb2.append(", endedAt=");
        sb2.append(this.f13397e);
        sb2.append(", crashed=");
        sb2.append(this.f);
        sb2.append(", app=");
        sb2.append(this.f13398g);
        sb2.append(", user=");
        sb2.append(this.f13399h);
        sb2.append(", os=");
        sb2.append(this.i);
        sb2.append(", device=");
        sb2.append(this.f13400j);
        sb2.append(", events=");
        sb2.append(this.f13401k);
        sb2.append(", generatorType=");
        return j4.a.l(this.f13402l, "}", sb2);
    }
}
