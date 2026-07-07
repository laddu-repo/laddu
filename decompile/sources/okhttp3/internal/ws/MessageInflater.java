package okhttp3.internal.ws;

import bg.b;
import bg.k;
import bg.v;
import java.io.Closeable;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final k deflatedBytes;
    private final Inflater inflater;
    private final v inflaterSource;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r3v1, types: [bg.l0, java.lang.Object, bg.k] */
    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new v(b.d(obj), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(k buffer) {
        kotlin.jvm.internal.k.e(buffer, "buffer");
        if (this.deflatedBytes.f1726y == 0) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.T(buffer);
            this.deflatedBytes.o0(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.f1726y;
            do {
                this.inflaterSource.d(buffer, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
