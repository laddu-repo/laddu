package w1;

import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends InputStream {

    /* renamed from: x, reason: collision with root package name */
    public final h f13539x;

    /* renamed from: y, reason: collision with root package name */
    public final l f13540y;
    public boolean A = false;
    public boolean B = false;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f13541z = new byte[1];

    public k(h hVar, l lVar) {
        this.f13539x = hVar;
        this.f13540y = lVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.B) {
            this.f13539x.close();
            this.B = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f13541z;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        u1.c.g(!this.B);
        boolean z10 = this.A;
        h hVar = this.f13539x;
        if (!z10) {
            hVar.y(this.f13540y);
            this.A = true;
        }
        int read = hVar.read(bArr, i6, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
