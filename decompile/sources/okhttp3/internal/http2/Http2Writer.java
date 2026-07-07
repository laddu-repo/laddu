package okhttp3.internal.http2;

import bg.k;
import bg.l;
import h8.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.f;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final k hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final l sink;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, bg.k] */
    public Http2Writer(l sink, boolean z10) {
        kotlin.jvm.internal.k.e(sink, "sink");
        this.sink = sink;
        this.client = z10;
        ?? obj = new Object();
        this.hpackBuffer = obj;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, obj, 3, null);
    }

    private final void writeContinuationFrames(int i6, long j) {
        int i10;
        while (j > 0) {
            long min = Math.min(this.maxFrameSize, j);
            j -= min;
            int i11 = (int) min;
            if (j == 0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            frameHeader(i6, i11, 9, i10);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) {
        try {
            kotlin.jvm.internal.k.e(peerSettings, "peerSettings");
            if (!this.closed) {
                this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
                if (peerSettings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        try {
            if (!this.closed) {
                if (!this.client) {
                    return;
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.e(), new Object[0]));
                }
                this.sink.n(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z10, int i6, k kVar, int i10) {
        if (!this.closed) {
            dataFrame(i6, z10 ? 1 : 0, kVar, i10);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i6, int i10, k kVar, int i11) {
        frameHeader(i6, i11, 0, i10);
        if (i11 > 0) {
            l lVar = this.sink;
            kotlin.jvm.internal.k.b(kVar);
            lVar.write(kVar, i11);
        }
    }

    public final synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i6, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i13 = i6;
            i14 = i10;
            i15 = i11;
            i16 = i12;
            logger2.fine(Http2.INSTANCE.frameLog(false, i13, i14, i15, i16));
        } else {
            i13 = i6;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        if (i14 <= this.maxFrameSize) {
            if ((Integer.MIN_VALUE & i13) == 0) {
                Util.writeMedium(this.sink, i14);
                this.sink.writeByte(i15 & 255);
                this.sink.writeByte(i16 & 255);
                this.sink.writeInt(Integer.MAX_VALUE & i13);
                return;
            }
            throw new IllegalArgumentException(c.i(i13, "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i14).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i6, ErrorCode errorCode, byte[] debugData) {
        kotlin.jvm.internal.k.e(errorCode, "errorCode");
        kotlin.jvm.internal.k.e(debugData, "debugData");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(0, debugData.length + 8, 7, 0);
                this.sink.writeInt(i6);
                this.sink.writeInt(errorCode.getHttpCode());
                if (debugData.length != 0) {
                    this.sink.write(debugData);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z10, int i6, List<Header> headerBlock) {
        int i10;
        kotlin.jvm.internal.k.e(headerBlock, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(headerBlock);
            long j = this.hpackBuffer.f1726y;
            long min = Math.min(this.maxFrameSize, j);
            if (j == min) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (z10) {
                i10 |= 1;
            }
            frameHeader(i6, (int) min, 1, i10);
            this.sink.write(this.hpackBuffer, min);
            if (j > min) {
                writeContinuationFrames(i6, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z10, int i6, int i10) {
        if (!this.closed) {
            frameHeader(0, 8, 6, z10 ? 1 : 0);
            this.sink.writeInt(i6);
            this.sink.writeInt(i10);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i6, int i10, List<Header> requestHeaders) {
        int i11;
        kotlin.jvm.internal.k.e(requestHeaders, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(requestHeaders);
            long j = this.hpackBuffer.f1726y;
            int min = (int) Math.min(this.maxFrameSize - 4, j);
            int i12 = min + 4;
            long j10 = min;
            if (j == j10) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            frameHeader(i6, i12, 5, i11);
            this.sink.writeInt(i10 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j10);
            if (j > j10) {
                writeContinuationFrames(i6, j - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i6, ErrorCode errorCode) {
        kotlin.jvm.internal.k.e(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(i6, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) {
        int i6;
        try {
            kotlin.jvm.internal.k.e(settings, "settings");
            if (!this.closed) {
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.isSet(i10)) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                i6 = i10;
                            } else {
                                i6 = 4;
                            }
                        } else {
                            i6 = 3;
                        }
                        this.sink.writeShort(i6);
                        this.sink.writeInt(settings.get(i10));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i6, long j) {
        if (!this.closed) {
            if (j != 0 && j <= 2147483647L) {
                frameHeader(i6, 4, 8, 0);
                this.sink.writeInt((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
