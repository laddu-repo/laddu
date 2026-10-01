package xb;

import java.io.OutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: x, reason: collision with root package name */
    public long f14702x;

    @Override // java.io.OutputStream
    public final void write(int i6) {
        this.f14702x++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f14702x += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i10) {
        int i11;
        if (i6 >= 0 && i6 <= bArr.length && i10 >= 0 && (i11 = i6 + i10) <= bArr.length && i11 >= 0) {
            this.f14702x += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
