package h1;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: x, reason: collision with root package name */
    public long f5817x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f5818y;

    public a(f fVar) {
        this.f5818y = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j10 = this.f5817x;
            if (j10 != j) {
                if (j10 >= 0 && j >= j10 + this.f5818y.f5819x.available()) {
                    return -1;
                }
                this.f5818y.f(j);
                this.f5817x = j;
            }
            if (i10 > this.f5818y.f5819x.available()) {
                i10 = this.f5818y.f5819x.available();
            }
            int read = this.f5818y.read(bArr, i6, i10);
            if (read >= 0) {
                this.f5817x += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f5817x = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
