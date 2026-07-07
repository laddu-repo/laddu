package okhttp3.internal.ws;

import bg.b;
import bg.i;
import bg.k;
import bg.n;
import bg.o;
import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MessageDeflater implements Closeable {
    private final k deflatedBytes;
    private final Deflater deflater;
    private final o deflaterSink;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, bg.k] */
    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new o(obj, deflater);
    }

    private final boolean endsWith(k kVar, n nVar) {
        return kVar.I(kVar.f1726y - nVar.d(), nVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(k buffer) {
        n nVar;
        kotlin.jvm.internal.k.e(buffer, "buffer");
        if (this.deflatedBytes.f1726y == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.f1726y);
            this.deflaterSink.flush();
            k kVar = this.deflatedBytes;
            nVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(kVar, nVar)) {
                k kVar2 = this.deflatedBytes;
                long j = kVar2.f1726y - 4;
                i a02 = kVar2.a0(b.f1689a);
                try {
                    a02.d(j);
                    a02.close();
                } finally {
                }
            } else {
                this.deflatedBytes.l0(0);
            }
            k kVar3 = this.deflatedBytes;
            buffer.write(kVar3, kVar3.f1726y);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
