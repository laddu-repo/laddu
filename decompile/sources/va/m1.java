package va;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13446e;
    public final int f;

    public m1(int i, int i10, long j8, long j9, boolean z2, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f13442a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f13443b = i10;
        this.f13444c = j8;
        this.f13445d = j9;
        this.f13446e = z2;
        this.f = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f13442a != m1Var.f13442a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f13443b != m1Var.f13443b || this.f13444c != m1Var.f13444c || this.f13445d != m1Var.f13445d || this.f13446e != m1Var.f13446e || this.f != m1Var.f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13442a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f13443b) * 1000003;
        long j8 = this.f13444c;
        int i = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f13445d;
        return ((((((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ (this.f13446e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f13442a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f13443b);
        sb2.append(", totalRam=");
        sb2.append(this.f13444c);
        sb2.append(", diskSpace=");
        sb2.append(this.f13445d);
        sb2.append(", isEmulator=");
        sb2.append(this.f13446e);
        sb2.append(", state=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return j4.a.n(sb2, Build.PRODUCT, "}");
    }
}
