package okhttp3.internal.ws;

import bg.i;
import bg.k;
import bg.m;
import bg.n;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final k controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final i maskCursor;
    private final byte[] maskKey;
    private final k messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final m source;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface FrameCallback {
        void onReadClose(int i6, String str);

        void onReadMessage(n nVar);

        void onReadMessage(String str);

        void onReadPing(n nVar);

        void onReadPong(n nVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, bg.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, bg.k] */
    public WebSocketReader(boolean z10, m source, FrameCallback frameCallback, boolean z11, boolean z12) {
        byte[] bArr;
        kotlin.jvm.internal.k.e(source, "source");
        kotlin.jvm.internal.k.e(frameCallback, "frameCallback");
        this.isClient = z10;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.controlFrameBuffer = new Object();
        this.messageFrameBuffer = new Object();
        if (z10) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = z10 ? null : new i();
    }

    private final void readControlFrame() {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.O(this.controlFrameBuffer, j);
            if (!this.isClient) {
                k kVar = this.controlFrameBuffer;
                i iVar = this.maskCursor;
                kotlin.jvm.internal.k.b(iVar);
                kVar.a0(iVar);
                this.maskCursor.f(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                i iVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                kotlin.jvm.internal.k.b(bArr);
                webSocketProtocol.toggleMask(iVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                k kVar2 = this.controlFrameBuffer;
                long j10 = kVar2.f1726y;
                if (j10 != 1) {
                    if (j10 != 0) {
                        s = kVar2.readShort();
                        str = this.controlFrameBuffer.h0();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s = 1005;
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                k kVar3 = this.controlFrameBuffer;
                frameCallback.onReadPing(kVar3.g(kVar3.f1726y));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                k kVar4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(kVar4.g(kVar4.f1726y));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i6 = and & 15;
                this.opcode = i6;
                boolean z14 = false;
                if ((and & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isFinalFrame = z10;
                if ((and & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.isControlFrame = z11;
                if (z11 && !z10) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((and & 64) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i6 != 1 && i6 != 2) {
                    if (z12) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z12) {
                        if (this.perMessageDeflate) {
                            z13 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z13 = false;
                    }
                    this.readingCompressedMessage = z13;
                }
                if ((and & 32) == 0) {
                    if ((and & 16) == 0) {
                        int and2 = Util.and(this.source.readByte(), 255);
                        if ((and2 & 128) != 0) {
                            z14 = true;
                        }
                        if (z14 == this.isClient) {
                            if (this.isClient) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = and2 & 127;
                        this.frameLength = j;
                        if (j == 126) {
                            this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        } else if (j == 127) {
                            long readLong = this.source.readLong();
                            this.frameLength = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.isControlFrame && this.frameLength > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z14) {
                            m mVar = this.source;
                            byte[] bArr = this.maskKey;
                            kotlin.jvm.internal.k.b(bArr);
                            mVar.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.O(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    k kVar = this.messageFrameBuffer;
                    i iVar = this.maskCursor;
                    kotlin.jvm.internal.k.b(iVar);
                    kVar.a0(iVar);
                    this.maskCursor.f(this.messageFrameBuffer.f1726y - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    i iVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    kotlin.jvm.internal.k.b(bArr);
                    webSocketProtocol.toggleMask(iVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() {
        int i6 = this.opcode;
        if (i6 != 1 && i6 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i6));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i6 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.h0());
            return;
        }
        FrameCallback frameCallback = this.frameCallback;
        k kVar = this.messageFrameBuffer;
        frameCallback.onReadMessage(kVar.g(kVar.f1726y));
    }

    private final void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final m getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
