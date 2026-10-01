package k3;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f7315e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7312b = str;
        this.f7313c = str2;
        this.f7314d = str3;
        this.f7315e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f7312b, fVar.f7312b) && Objects.equals(this.f7313c, fVar.f7313c) && Objects.equals(this.f7314d, fVar.f7314d) && Arrays.equals(this.f7315e, fVar.f7315e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7312b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7313c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7314d;
        return Arrays.hashCode(this.f7315e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // k3.j
    public final String toString() {
        return this.f7321a + ": mimeType=" + this.f7312b + ", filename=" + this.f7313c + ", description=" + this.f7314d;
    }
}
