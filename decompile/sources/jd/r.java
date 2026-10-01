package jd;

import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends InputStream {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7402x = 1;

    /* renamed from: y, reason: collision with root package name */
    public int f7403y = 1073741824;

    /* renamed from: z, reason: collision with root package name */
    public final Object f7404z;

    public r(InputStream inputStream) {
        this.f7404z = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.f7402x) {
            case 1:
                return this.f7403y;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f7402x) {
            case 1:
                ((InputStream) this.f7404z).close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f7402x) {
            case 0:
                int i6 = this.f7403y;
                s sVar = (s) this.f7404z;
                int i10 = sVar.f7406b;
                if (i6 >= i10) {
                    return -1;
                }
                String str = sVar.f7407c;
                int i11 = sVar.f7405a;
                int h4 = a.a.h(str.charAt((i11 == 0 ? i6 : (i6 + i11) % i10) + 4));
                int i12 = i6 + 1;
                if (i11 != 0) {
                    i12 = (i12 + i11) % i10;
                }
                int h10 = ((byte) (a.a.h(str.charAt(i12 + 4)) | (h4 << 4))) & 255;
                this.f7403y += 2;
                return h10;
            default:
                int read = ((InputStream) this.f7404z).read();
                if (read == -1) {
                    this.f7403y = 0;
                }
                return read;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f7402x) {
            case 1:
                return ((InputStream) this.f7404z).skip(j);
            default:
                return super.skip(j);
        }
    }

    public r(s sVar) {
        this.f7404z = sVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.f7402x) {
            case 1:
                int read = ((InputStream) this.f7404z).read(bArr);
                if (read == -1) {
                    this.f7403y = 0;
                }
                return read;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i10) {
        switch (this.f7402x) {
            case 1:
                int read = ((InputStream) this.f7404z).read(bArr, i6, i10);
                if (read == -1) {
                    this.f7403y = 0;
                }
                return read;
            default:
                return super.read(bArr, i6, i10);
        }
    }
}
