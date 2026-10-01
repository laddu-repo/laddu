package z6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f14803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f14804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14806e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f14808h;
    public final b0 i;

    public s(long j8, Integer num, a0 a0Var, long j9, byte[] bArr, String str, long j10, i0 i0Var, b0 b0Var) {
        this.f14802a = j8;
        this.f14803b = num;
        this.f14804c = a0Var;
        this.f14805d = j9;
        this.f14806e = bArr;
        this.f = str;
        this.f14807g = j10;
        this.f14808h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.i;
            i0 i0Var2 = sVar.f14808h;
            String str2 = sVar.f;
            a0 a0Var2 = sVar.f14804c;
            Integer num2 = sVar.f14803b;
            if (this.f14802a == sVar.f14802a && ((num = this.f14803b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f14804c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f14805d == sVar.f14805d) {
                if (Arrays.equals(this.f14806e, e0Var instanceof s ? ((s) e0Var).f14806e : sVar.f14806e) && ((str = this.f) != null ? str.equals(str2) : str2 == null) && this.f14807g == sVar.f14807g && ((i0Var = this.f14808h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f14802a;
        int i = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f14803b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f14804c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j9 = this.f14805d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f14806e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f14807g;
        int i10 = (iHashCode4 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        i0 i0Var = this.f14808h;
        int iHashCode5 = (i10 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f14802a + ", eventCode=" + this.f14803b + ", complianceData=" + this.f14804c + ", eventUptimeMs=" + this.f14805d + ", sourceExtension=" + Arrays.toString(this.f14806e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.f14807g + ", networkConnectionInfo=" + this.f14808h + ", experimentIds=" + this.i + "}";
    }
}
