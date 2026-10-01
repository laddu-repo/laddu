package va;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13353b;

    public h0(String str, byte[] bArr) {
        this.f13352a = str;
        this.f13353b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.f13352a.equals(h0Var.f13352a)) {
                if (Arrays.equals(this.f13353b, r1Var instanceof h0 ? ((h0) r1Var).f13353b : h0Var.f13353b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13352a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13353b);
    }

    public final String toString() {
        return "File{filename=" + this.f13352a + ", contents=" + Arrays.toString(this.f13353b) + "}";
    }
}
