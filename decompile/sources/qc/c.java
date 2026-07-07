package qc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f11197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11199d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11200e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11201f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f11197b = str;
        this.f11198c = str2;
        this.f11199d = str3;
        this.f11200e = str4;
        this.f11201f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f11197b.equals(cVar.f11197b) && this.f11198c.equals(cVar.f11198c) && this.f11199d.equals(cVar.f11199d) && this.f11200e.equals(cVar.f11200e) && this.f11201f == cVar.f11201f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f11197b.hashCode() ^ 1000003) * 1000003) ^ this.f11198c.hashCode()) * 1000003) ^ this.f11199d.hashCode()) * 1000003) ^ this.f11200e.hashCode()) * 1000003;
        long j = this.f11201f;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f11197b);
        sb2.append(", variantId=");
        sb2.append(this.f11198c);
        sb2.append(", parameterKey=");
        sb2.append(this.f11199d);
        sb2.append(", parameterValue=");
        sb2.append(this.f11200e);
        sb2.append(", templateVersion=");
        return r4.a.m(sb2, this.f11201f, "}");
    }
}
