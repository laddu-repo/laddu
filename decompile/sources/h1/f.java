package h1;

import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f5819x.mark(Integer.MAX_VALUE);
    }

    public final void f(long j) {
        int i6 = this.f5820y;
        if (i6 > j) {
            this.f5820y = 0;
            this.f5819x.reset();
        } else {
            j -= i6;
        }
        d((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f5819x.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
