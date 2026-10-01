package d4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final byte[] f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f4173e;

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f4169a) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f4173e;
            int length = bArr2.length;
            int i12 = this.f4171c + i11;
            if (length < i12) {
                this.f4173e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i, this.f4173e, this.f4171c, i11);
            this.f4171c += i11;
        }
    }
}
