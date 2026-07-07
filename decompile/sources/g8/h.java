package g8;

import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5533a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5534b;

    /* renamed from: c, reason: collision with root package name */
    public final m f5535c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5536d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5537e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f5538f;

    public h(String str, Integer num, m mVar, long j, long j10, HashMap hashMap) {
        this.f5533a = str;
        this.f5534b = num;
        this.f5535c = mVar;
        this.f5536d = j;
        this.f5537e = j10;
        this.f5538f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f5538f.get(str);
        if (str2 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f5538f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.d, java.lang.Object] */
    public final androidx.lifecycle.d c() {
        ?? obj = new Object();
        String str = this.f5533a;
        if (str != null) {
            obj.f896a = str;
            obj.f897b = this.f5534b;
            m mVar = this.f5535c;
            if (mVar != null) {
                obj.f898c = mVar;
                obj.f899d = Long.valueOf(this.f5536d);
                obj.f900e = Long.valueOf(this.f5537e);
                obj.f901f = new HashMap(this.f5538f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f5534b;
            if (this.f5533a.equals(hVar.f5533a) && ((num = this.f5534b) != null ? num.equals(num2) : num2 == null) && this.f5535c.equals(hVar.f5535c) && this.f5536d == hVar.f5536d && this.f5537e == hVar.f5537e && this.f5538f.equals(hVar.f5538f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5533a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5534b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f5535c.hashCode()) * 1000003;
        long j = this.f5536d;
        int i6 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f5537e;
        return ((i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f5538f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f5533a + ", code=" + this.f5534b + ", encodedPayload=" + this.f5535c + ", eventMillis=" + this.f5536d + ", uptimeMillis=" + this.f5537e + ", autoMetadata=" + this.f5538f + "}";
    }
}
