package g8;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final d8.c f5546a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5547b;

    public m(d8.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f5546a = cVar;
                this.f5547b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f5546a.equals(mVar.f5546a)) {
            return false;
        }
        return Arrays.equals(this.f5547b, mVar.f5547b);
    }

    public final int hashCode() {
        return ((this.f5546a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5547b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f5546a + ", bytes=[...]}";
    }
}
