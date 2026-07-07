package f8;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f5133a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5134b;

    /* renamed from: c, reason: collision with root package name */
    public final j f5135c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f5136d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5137e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5138f;

    public l(long j, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f5148x;
        this.f5133a = j;
        this.f5134b = j10;
        this.f5135c = jVar;
        this.f5136d = num;
        this.f5137e = str;
        this.f5138f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f5148x;
                ArrayList arrayList = lVar.f5138f;
                String str = lVar.f5137e;
                Integer num = lVar.f5136d;
                j jVar = lVar.f5135c;
                if (this.f5133a == lVar.f5133a && this.f5134b == lVar.f5134b && this.f5135c.equals(jVar)) {
                    Integer num2 = this.f5136d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f5137e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f5138f.equals(arrayList) && obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f5133a;
        long j10 = this.f5134b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f5135c.hashCode()) * 1000003;
        int i6 = 0;
        Integer num = this.f5136d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f5137e;
        if (str != null) {
            i6 = str.hashCode();
        }
        return w.f5148x.hashCode() ^ ((((i10 ^ i6) * 1000003) ^ this.f5138f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5133a + ", requestUptimeMs=" + this.f5134b + ", clientInfo=" + this.f5135c + ", logSource=" + this.f5136d + ", logSourceName=" + this.f5137e + ", logEvents=" + this.f5138f + ", qosTier=" + w.f5148x + "}";
    }
}
