package f4;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4816e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f4817a;

    /* renamed from: b, reason: collision with root package name */
    public int f4818b;

    /* renamed from: c, reason: collision with root package name */
    public int f4819c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4820d;

    public final void a(byte[] bArr, int i6, int i10) {
        if (!this.f4817a) {
            return;
        }
        int i11 = i10 - i6;
        byte[] bArr2 = this.f4820d;
        int length = bArr2.length;
        int i12 = this.f4818b + i11;
        if (length < i12) {
            this.f4820d = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i6, this.f4820d, this.f4818b, i11);
        this.f4818b += i11;
    }
}
