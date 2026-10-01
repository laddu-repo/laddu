package gb;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5604a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i6 = 0; i6 < 10; i6++) {
            bArr[i6 + 48] = (byte) i6;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b10 = (byte) (i10 + 10);
            bArr[i10 + 65] = b10;
            bArr[i10 + 97] = b10;
        }
        f5604a = bArr;
    }
}
