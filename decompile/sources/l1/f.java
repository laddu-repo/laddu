package l1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f8020v.mark(Integer.MAX_VALUE);
    }

    public final void i(long j8) throws IOException {
        int i = this.f8022x;
        if (i > j8) {
            this.f8022x = 0;
            this.f8020v.reset();
        } else {
            j8 -= (long) i;
        }
        a((int) j8);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f8020v.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
