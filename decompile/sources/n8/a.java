package n8;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f9130f = new a(10485760, 200, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f9131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9133c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9134d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9135e;

    public a(long j, int i6, int i10, long j10, int i11) {
        this.f9131a = j;
        this.f9132b = i6;
        this.f9133c = i10;
        this.f9134d = j10;
        this.f9135e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9131a == aVar.f9131a && this.f9132b == aVar.f9132b && this.f9133c == aVar.f9133c && this.f9134d == aVar.f9134d && this.f9135e == aVar.f9135e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9131a;
        int i6 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9132b) * 1000003) ^ this.f9133c) * 1000003;
        long j10 = this.f9134d;
        return this.f9135e ^ ((i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f9131a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f9132b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f9133c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f9134d);
        sb2.append(", maxBlobByteSizePerRow=");
        return r4.a.l(sb2, this.f9135e, "}");
    }
}
