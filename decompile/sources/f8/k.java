package f8;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f5126a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5127b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5128c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5129d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5130e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5131f;

    /* renamed from: g, reason: collision with root package name */
    public final v f5132g;

    public k(long j, Integer num, long j10, byte[] bArr, String str, long j11, v vVar) {
        this.f5126a = j;
        this.f5127b = num;
        this.f5128c = j10;
        this.f5129d = bArr;
        this.f5130e = str;
        this.f5131f = j11;
        this.f5132g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f5132g;
            String str2 = kVar.f5130e;
            Integer num2 = kVar.f5127b;
            if (this.f5126a == kVar.f5126a && ((num = this.f5127b) != null ? num.equals(num2) : num2 == null) && this.f5128c == kVar.f5128c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).f5129d;
                } else {
                    bArr = kVar.f5129d;
                }
                if (Arrays.equals(this.f5129d, bArr) && ((str = this.f5130e) != null ? str.equals(str2) : str2 == null) && this.f5131f == kVar.f5131f && ((vVar = this.f5132g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f5126a;
        int i6 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f5127b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i6 ^ hashCode) * 1000003;
        long j10 = this.f5128c;
        int hashCode3 = (((i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5129d)) * 1000003;
        String str = this.f5130e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (hashCode3 ^ hashCode2) * 1000003;
        long j11 = this.f5131f;
        int i13 = (i12 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f5132g;
        if (vVar != null) {
            i10 = vVar.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5126a + ", eventCode=" + this.f5127b + ", eventUptimeMs=" + this.f5128c + ", sourceExtension=" + Arrays.toString(this.f5129d) + ", sourceExtensionJsonProto3=" + this.f5130e + ", timezoneOffsetSeconds=" + this.f5131f + ", networkConnectionInfo=" + this.f5132g + "}";
    }
}
