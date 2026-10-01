package okhttp3.internal.http2;

import af.a;
import android.support.v4.media.session.b;
import bg.l0;
import bg.m;
import bg.n;
import bg.o0;
import com.google.protobuf.CodedOutputStream;
import h8.c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final m source;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i6, int i10, int i11) {
            if ((i10 & 8) != 0) {
                i6--;
            }
            if (i11 <= i6) {
                return i6 - i11;
            }
            throw new IOException(c.l("PROTOCOL_ERROR padding ", " > remaining length ", i11, i6));
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i6, String str, n nVar, String str2, int i10, long j);

        void data(boolean z10, int i6, m mVar, int i10);

        void goAway(int i6, ErrorCode errorCode, n nVar);

        void headers(boolean z10, int i6, int i10, List<Header> list);

        void ping(boolean z10, int i6, int i10);

        void priority(int i6, int i10, int i11, boolean z10);

        void pushPromise(int i6, int i10, List<Header> list);

        void rstStream(int i6, ErrorCode errorCode);

        void settings(boolean z10, Settings settings);

        void windowUpdate(int i6, long j);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        k.d(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(m source, boolean z10) {
        k.e(source, "source");
        this.source = source;
        this.client = z10;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, CodedOutputStream.DEFAULT_BUFFER_SIZE, 0, 4, null);
    }

    private final void readData(Handler handler, int i6, int i10, int i11) {
        boolean z10;
        if (i11 != 0) {
            int i12 = 0;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 32) == 0) {
                if ((i10 & 8) != 0) {
                    i12 = Util.and(this.source.readByte(), 255);
                }
                handler.data(z10, i11, this.source, Companion.lengthWithoutPadding(i6, i10, i12));
                this.source.skip(i12);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int i6, int i10, int i11) {
        if (i6 >= 8) {
            if (i11 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i12 = i6 - 8;
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    n nVar = n.A;
                    if (i12 > 0) {
                        nVar = this.source.g(i12);
                    }
                    handler.goAway(readInt, fromHttp2, nVar);
                    return;
                }
                throw new IOException(c.i(readInt2, "TYPE_GOAWAY unexpected error code: "));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(c.i(i6, "TYPE_GOAWAY length < 8: "));
    }

    private final List<Header> readHeaderBlock(int i6, int i10, int i11, int i12) {
        this.continuation.setLeft(i6);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i10);
        this.continuation.setFlags(i11);
        this.continuation.setStreamId(i12);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i6, int i10, int i11) {
        boolean z10;
        if (i11 != 0) {
            int i12 = 0;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                i12 = Util.and(this.source.readByte(), 255);
            }
            if ((i10 & 32) != 0) {
                readPriority(handler, i11);
                i6 -= 5;
            }
            handler.headers(z10, i11, -1, readHeaderBlock(Companion.lengthWithoutPadding(i6, i10, i12), i12, i10, i11));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int i6, int i10, int i11) {
        if (i6 == 8) {
            if (i11 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                boolean z10 = true;
                if ((i10 & 1) == 0) {
                    z10 = false;
                }
                handler.ping(z10, readInt, readInt2);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(c.i(i6, "TYPE_PING length != 8: "));
    }

    private final void readPriority(Handler handler, int i6, int i10, int i11) {
        if (i6 != 5) {
            throw new IOException(c.j(i6, "TYPE_PRIORITY length: ", " != 5"));
        }
        if (i11 != 0) {
            readPriority(handler, i11);
            return;
        }
        throw new IOException("TYPE_PRIORITY streamId == 0");
    }

    private final void readPushPromise(Handler handler, int i6, int i10, int i11) {
        int i12;
        if (i11 != 0) {
            if ((i10 & 8) != 0) {
                i12 = Util.and(this.source.readByte(), 255);
            } else {
                i12 = 0;
            }
            handler.pushPromise(i11, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i6 - 4, i10, i12), i12, i10, i11));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int i6, int i10, int i11) {
        if (i6 == 4) {
            if (i11 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i11, fromHttp2);
                    return;
                }
                throw new IOException(c.i(readInt, "TYPE_RST_STREAM unexpected error code: "));
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        throw new IOException(c.j(i6, "TYPE_RST_STREAM length: ", " != 4"));
    }

    private final void readSettings(Handler handler, int i6, int i10, int i11) {
        int readInt;
        if (i11 == 0) {
            if ((i10 & 1) != 0) {
                if (i6 == 0) {
                    handler.ackSettings();
                    return;
                }
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            if (i6 % 6 == 0) {
                Settings settings = new Settings();
                a u3 = b.u(b.w(0, i6), 6);
                int i12 = u3.f709x;
                int i13 = u3.f710y;
                int i14 = u3.f711z;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        int and = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        readInt = this.source.readInt();
                        if (and != 2) {
                            if (and != 3) {
                                if (and != 4) {
                                    if (and == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        break;
                                    }
                                } else if (readInt >= 0) {
                                    and = 7;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else {
                                and = 4;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        settings.set(and, readInt);
                        if (i12 == i13) {
                            break;
                        } else {
                            i12 += i14;
                        }
                    }
                    throw new IOException(c.i(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                }
                handler.settings(false, settings);
                return;
            }
            throw new IOException(c.i(i6, "TYPE_SETTINGS length % 6 != 0: "));
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    private final void readWindowUpdate(Handler handler, int i6, int i10, int i11) {
        if (i6 == 4) {
            long and = Util.and(this.source.readInt(), 2147483647L);
            if (and != 0) {
                handler.windowUpdate(i11, and);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(c.i(i6, "TYPE_WINDOW_UPDATE length !=4: "));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean z10, Handler handler) {
        k.e(handler, "handler");
        try {
            this.source.Y(9L);
            int readMedium = Util.readMedium(this.source);
            if (readMedium <= 16384) {
                int and = Util.and(this.source.readByte(), 255);
                int and2 = Util.and(this.source.readByte(), 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
                if (z10 && and != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(and));
                }
                switch (and) {
                    case 0:
                        readData(handler, readMedium, and2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, and2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, and2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, and2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, and2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, and2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, and2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, and2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, and2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw new IOException(c.i(readMedium, "FRAME_SIZE_ERROR: "));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) {
        k.e(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        m mVar = this.source;
        n nVar = Http2.CONNECTION_PREFACE;
        n g10 = mVar.g(nVar.d());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + g10.e(), new Object[0]));
        }
        if (nVar.equals(g10)) {
        } else {
            throw new IOException("Expected a connection header but was ".concat(g10.q()));
        }
    }

    private final void readPriority(Handler handler, int i6) {
        int readInt = this.source.readInt();
        handler.priority(i6, readInt & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class ContinuationSource implements l0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final m source;
        private int streamId;

        public ContinuationSource(m source) {
            k.e(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() {
            int i6 = this.streamId;
            int readMedium = Util.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt == i6) {
                } else {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(and + " != TYPE_CONTINUATION");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // bg.l0
        public long read(bg.k sink, long j) {
            k.e(sink, "sink");
            while (true) {
                int i6 = this.left;
                if (i6 == 0) {
                    this.source.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(sink, Math.min(j, i6));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i6) {
            this.flags = i6;
        }

        public final void setLeft(int i6) {
            this.left = i6;
        }

        public final void setLength(int i6) {
            this.length = i6;
        }

        public final void setPadding(int i6) {
            this.padding = i6;
        }

        public final void setStreamId(int i6) {
            this.streamId = i6;
        }

        @Override // bg.l0
        public o0 timeout() {
            return this.source.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
