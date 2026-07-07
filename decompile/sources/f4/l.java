package f4;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f4838f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f4839a;

    /* renamed from: b, reason: collision with root package name */
    public int f4840b;

    /* renamed from: c, reason: collision with root package name */
    public int f4841c;

    /* renamed from: d, reason: collision with root package name */
    public int f4842d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4843e;

    public final void a(byte[] bArr, int i6, int i10) {
        if (!this.f4839a) {
            return;
        }
        int i11 = i10 - i6;
        byte[] bArr2 = this.f4843e;
        int length = bArr2.length;
        int i12 = this.f4841c + i11;
        if (length < i12) {
            this.f4843e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i6, this.f4843e, this.f4841c, i11);
        this.f4841c += i11;
    }
}
