package z6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14799b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f14798a = bArr;
        this.f14799b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z2 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f14798a, z2 ? pVar.f14798a : pVar.f14798a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f14799b, z2 ? pVar2.f14799b : pVar2.f14799b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f14798a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14799b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f14798a) + ", encryptedBlob=" + Arrays.toString(this.f14799b) + "}";
    }
}
