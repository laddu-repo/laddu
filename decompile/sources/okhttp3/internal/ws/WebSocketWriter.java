package okhttp3.internal.ws;

import bg.i;
import bg.k;
import bg.l;
import bg.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final i maskCursor;
    private final byte[] maskKey;
    private final k messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final l sink;
    private final k sinkBuffer;
    private boolean writerClosed;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, bg.k] */
    public WebSocketWriter(boolean z10, l sink, Random random, boolean z11, boolean z12, long j) {
        byte[] bArr;
        kotlin.jvm.internal.k.e(sink, "sink");
        kotlin.jvm.internal.k.e(random, "random");
        this.isClient = z10;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j;
        this.messageBuffer = new Object();
        this.sinkBuffer = sink.a();
        if (z10) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z10 ? new i() : null;
    }

    private final void writeControlFrame(int i6, n nVar) {
        if (!this.writerClosed) {
            int d10 = nVar.d();
            if (d10 <= 125) {
                this.sinkBuffer.l0(i6 | 128);
                if (this.isClient) {
                    this.sinkBuffer.l0(d10 | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    kotlin.jvm.internal.k.b(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.m0write(this.maskKey);
                    if (d10 > 0) {
                        k kVar = this.sinkBuffer;
                        long j = kVar.f1726y;
                        kVar.k0(nVar);
                        k kVar2 = this.sinkBuffer;
                        i iVar = this.maskCursor;
                        kotlin.jvm.internal.k.b(iVar);
                        kVar2.a0(iVar);
                        this.maskCursor.f(j);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.l0(d10);
                    this.sinkBuffer.k0(nVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final l getSink() {
        return this.sink;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bg.k] */
    public final void writeClose(int i6, n nVar) {
        n nVar2 = n.A;
        if (i6 != 0 || nVar != null) {
            if (i6 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i6);
            }
            ?? obj = new Object();
            obj.q0(i6);
            if (nVar != null) {
                obj.k0(nVar);
            }
            nVar2 = obj.g(obj.f1726y);
        }
        try {
            writeControlFrame(8, nVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i6, n data) {
        int i10;
        kotlin.jvm.internal.k.e(data, "data");
        if (!this.writerClosed) {
            this.messageBuffer.k0(data);
            int i11 = i6 | 128;
            if (this.perMessageDeflate && data.d() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i11 = i6 | 192;
            }
            long j = this.messageBuffer.f1726y;
            this.sinkBuffer.l0(i11);
            if (this.isClient) {
                i10 = 128;
            } else {
                i10 = 0;
            }
            if (j <= 125) {
                this.sinkBuffer.l0(i10 | ((int) j));
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.l0(i10 | WebSocketProtocol.PAYLOAD_SHORT);
                this.sinkBuffer.q0((int) j);
            } else {
                this.sinkBuffer.l0(i10 | 127);
                this.sinkBuffer.p0(j);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                kotlin.jvm.internal.k.b(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.m0write(this.maskKey);
                if (j > 0) {
                    k kVar = this.messageBuffer;
                    i iVar = this.maskCursor;
                    kotlin.jvm.internal.k.b(iVar);
                    kVar.a0(iVar);
                    this.maskCursor.f(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, j);
            this.sink.j();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(n payload) {
        kotlin.jvm.internal.k.e(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(n payload) {
        kotlin.jvm.internal.k.e(payload, "payload");
        writeControlFrame(10, payload);
    }
}
