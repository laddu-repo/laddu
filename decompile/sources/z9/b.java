package z9;

import qf.g;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final char[] f14832v = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z2;
        if (obj instanceof b) {
            byte[] bArr = ((a) this).f14831w;
            int length = bArr.length * 8;
            byte[] bArr2 = ((a) ((b) obj)).f14831w;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z2 = false;
                } else {
                    z2 = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z2 &= bArr[i] == bArr2[i];
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((a) this).f14831w;
        if (bArr.length * 8 >= 32) {
            boolean z2 = bArr.length >= 4;
            int length = bArr.length;
            if (z2) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(g.y("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i = bArr[0] & 255;
        for (int i10 = 1; i10 < bArr.length; i10++) {
            i |= (bArr[i10] & 255) << (i10 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((a) this).f14831w;
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            char[] cArr = f14832v;
            sb2.append(cArr[(b9 >> 4) & 15]);
            sb2.append(cArr[b9 & 15]);
        }
        return sb2.toString();
    }
}
