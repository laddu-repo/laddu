package a7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6.c f214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f215b;

    public o(x6.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f214a = cVar;
        this.f215b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f214a.equals(oVar.f214a)) {
            return Arrays.equals(this.f215b, oVar.f215b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f214a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f215b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f214a + ", bytes=[...]}";
    }
}
