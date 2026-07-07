package okhttp3.internal.http2;

import bg.g;
import bg.j0;
import bg.k;
import bg.l0;
import bg.m;
import bg.o0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.f;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* renamed from: id, reason: collision with root package name */
    private final int f10198id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class FramingSource implements l0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final k receiveBuffer = new Object();
        private final k readBuffer = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bg.k] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, bg.k] */
        public FramingSource(long j, boolean z10) {
            this.maxByteCount = j;
            this.finished = z10;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                k kVar = this.readBuffer;
                j = kVar.f1726y;
                kVar.d();
                kotlin.jvm.internal.k.c(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final k getReadBuffer() {
            return this.readBuffer;
        }

        public final k getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        @Override // bg.l0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(bg.k r19, long r20) {
            /*
                r18 = this;
                r1 = r18
                r0 = r19
                r2 = r20
                java.lang.String r4 = "sink"
                kotlin.jvm.internal.k.e(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto Lc3
            L11:
                okhttp3.internal.http2.Http2Stream r6 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r6)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r7 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Laf
                r7.enter()     // Catch: java.lang.Throwable -> Laf
                okhttp3.internal.http2.ErrorCode r7 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L38
                if (r7 == 0) goto L3b
                boolean r7 = r1.finished     // Catch: java.lang.Throwable -> L38
                if (r7 != 0) goto L3b
                java.io.IOException r7 = r6.getErrorException$okhttp()     // Catch: java.lang.Throwable -> L38
                if (r7 != 0) goto L3c
                okhttp3.internal.http2.StreamResetException r7 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L38
                okhttp3.internal.http2.ErrorCode r8 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L38
                kotlin.jvm.internal.k.b(r8)     // Catch: java.lang.Throwable -> L38
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L38
                goto L3c
            L38:
                r0 = move-exception
                goto Lb9
            L3b:
                r7 = 0
            L3c:
                boolean r8 = r1.closed     // Catch: java.lang.Throwable -> L38
                if (r8 != 0) goto Lb1
                bg.k r8 = r1.readBuffer     // Catch: java.lang.Throwable -> L38
                long r9 = r8.f1726y     // Catch: java.lang.Throwable -> L38
                r11 = -1
                r13 = 0
                int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r14 <= 0) goto L8d
                long r9 = java.lang.Math.min(r2, r9)     // Catch: java.lang.Throwable -> L38
                long r8 = r8.read(r0, r9)     // Catch: java.lang.Throwable -> L38
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L38
                long r14 = r14 + r8
                r6.setReadBytesTotal$okhttp(r14)     // Catch: java.lang.Throwable -> L38
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L38
                long r16 = r6.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> L38
                long r14 = r14 - r16
                if (r7 != 0) goto L98
                okhttp3.internal.http2.Http2Connection r10 = r6.getConnection()     // Catch: java.lang.Throwable -> L38
                okhttp3.internal.http2.Settings r10 = r10.getOkHttpSettings()     // Catch: java.lang.Throwable -> L38
                int r10 = r10.getInitialWindowSize()     // Catch: java.lang.Throwable -> L38
                int r10 = r10 / 2
                long r4 = (long) r10     // Catch: java.lang.Throwable -> L38
                int r10 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r10 < 0) goto L98
                okhttp3.internal.http2.Http2Connection r4 = r6.getConnection()     // Catch: java.lang.Throwable -> L38
                int r5 = r6.getId()     // Catch: java.lang.Throwable -> L38
                r4.writeWindowUpdateLater$okhttp(r5, r14)     // Catch: java.lang.Throwable -> L38
                long r4 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> L38
                r6.setReadBytesAcknowledged$okhttp(r4)     // Catch: java.lang.Throwable -> L38
                goto L98
            L8d:
                boolean r4 = r1.finished     // Catch: java.lang.Throwable -> L38
                if (r4 != 0) goto L97
                if (r7 != 0) goto L97
                r6.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L38
                r13 = 1
            L97:
                r8 = r11
            L98:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r4 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Laf
                r4.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r6)
                if (r13 == 0) goto La6
                r4 = 0
                goto L11
            La6:
                int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r0 == 0) goto Lab
                return r8
            Lab:
                if (r7 != 0) goto Lae
                return r11
            Lae:
                throw r7
            Laf:
                r0 = move-exception
                goto Lc1
            Lb1:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L38
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L38
                throw r0     // Catch: java.lang.Throwable -> L38
            Lb9:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Laf
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Laf
                throw r0     // Catch: java.lang.Throwable -> Laf
            Lc1:
                monitor-exit(r6)
                throw r0
            Lc3:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r0 = r4.a.j(r0, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(bg.k, long):long");
        }

        public final void receive$okhttp(m source, long j) {
            boolean z10;
            boolean z11;
            boolean z12;
            kotlin.jvm.internal.k.e(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j10 = j;
            while (j10 > 0) {
                synchronized (Http2Stream.this) {
                    z10 = this.finished;
                    z11 = false;
                    if (this.readBuffer.f1726y + j10 > this.maxByteCount) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    source.skip(j10);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j10);
                    return;
                }
                long read = source.read(this.receiveBuffer, j10);
                if (read != -1) {
                    j10 -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        try {
                            if (this.closed) {
                                this.receiveBuffer.d();
                            } else {
                                k kVar = this.readBuffer;
                                if (kVar.f1726y == 0) {
                                    z11 = true;
                                }
                                kVar.T(this.receiveBuffer);
                                if (z11) {
                                    kotlin.jvm.internal.k.c(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                    http2Stream2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
            updateConnectionFlowControl(j);
        }

        public final void setClosed$okhttp(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished$okhttp(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // bg.l0
        public o0 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class StreamTimeout extends g {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() {
            if (!exit()) {
            } else {
                throw newTimeoutException(null);
            }
        }

        @Override // bg.g
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // bg.g
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i6, Http2Connection connection, boolean z10, boolean z11, Headers headers) {
        kotlin.jvm.internal.k.e(connection, "connection");
        this.f10198id = i6;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z11);
        this.sink = new FramingSink(z10);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (isLocallyInitiated()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            if (this.source.getFinished$okhttp()) {
                if (this.sink.getFinished()) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.f10198id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z10;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.source.getFinished$okhttp() || !this.source.getClosed$okhttp() || (!this.sink.getFinished() && !this.sink.getClosed())) {
                    z10 = false;
                    isOpen = isOpen();
                }
                z10 = true;
                isOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.f10198id);
        }
    }

    public final void checkOutNotClosed$okhttp() {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        ErrorCode errorCode = this.errorCode;
                        kotlin.jvm.internal.k.b(errorCode);
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(ErrorCode rstStatusCode, IOException iOException) {
        kotlin.jvm.internal.k.e(rstStatusCode, "rstStatusCode");
        if (!closeInternal(rstStatusCode, iOException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.f10198id, rstStatusCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        kotlin.jvm.internal.k.e(errorCode, "errorCode");
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.f10198id, errorCode);
    }

    public final void enqueueTrailers(Headers trailers) {
        kotlin.jvm.internal.k.e(trailers, "trailers");
        synchronized (this) {
            if (!this.sink.getFinished()) {
                if (trailers.size() != 0) {
                    this.sink.setTrailers(trailers);
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } else {
                throw new IllegalStateException("already finished");
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f10198id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final j0 getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final l0 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z10;
        if ((this.f10198id & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.connection.getClient$okhttp() == z10) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (!this.source.getFinished$okhttp()) {
                if (this.source.getClosed$okhttp()) {
                }
                return true;
            }
            if (this.sink.getFinished() || this.sink.getClosed()) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final o0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(m source, int i6) {
        kotlin.jvm.internal.k.e(source, "source");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(source, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:10:0x0035, B:14:0x003d, B:16:0x004e, B:17:0x0053, B:24:0x0045), top: B:9:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.k.e(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L34
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L34
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L34:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L43
            r1 = 1
            if (r0 == 0) goto L45
            if (r4 != 0) goto L3d
            goto L45
        L3d:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L43
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L43
            goto L4c
        L43:
            r3 = move-exception
            goto L65
        L45:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L43
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L43
            r0.add(r3)     // Catch: java.lang.Throwable -> L43
        L4c:
            if (r4 == 0) goto L53
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L43
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L43
        L53:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L43
            r2.notifyAll()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r2)
            if (r3 != 0) goto L64
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f10198id
            r3.removeStream$okhttp(r4)
        L64:
            return
        L65:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        kotlin.jvm.internal.k.e(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final synchronized Headers takeHeaders() {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            kotlin.jvm.internal.k.d(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                kotlin.jvm.internal.k.b(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        }
        return removeFirst;
    }

    public final synchronized Headers trailers() {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().r() && this.source.getReadBuffer().r()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            if (this.errorCode != null) {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    ErrorCode errorCode = this.errorCode;
                    kotlin.jvm.internal.k.b(errorCode);
                    throw new StreamResetException(errorCode);
                }
                throw iOException;
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> responseHeaders, boolean z10, boolean z11) {
        boolean z12;
        kotlin.jvm.internal.k.e(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z12 = true;
            this.hasResponseHeaders = true;
            if (z10) {
                this.sink.setFinished(true);
            }
        }
        if (!z11) {
            synchronized (this.connection) {
                if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                    z12 = false;
                }
            }
            z11 = z12;
        }
        this.connection.writeHeaders$okhttp(this.f10198id, z10, responseHeaders);
        if (z11) {
            this.connection.flush();
        }
    }

    public final o0 writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class FramingSink implements j0 {
        private boolean closed;
        private boolean finished;
        private final k sendBuffer;
        private Headers trailers;

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bg.k] */
        public FramingSink(boolean z10) {
            this.finished = z10;
            this.sendBuffer = new Object();
        }

        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean z10) {
            long min;
            boolean z11;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.f1726y);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (z10 && min == this.sendBuffer.f1726y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z11, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // bg.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z10;
            boolean z11;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    if (this.sendBuffer.f1726y > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.trailers != null) {
                        while (this.sendBuffer.f1726y > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        kotlin.jvm.internal.k.b(headers);
                        connection.writeHeaders$okhttp(id2, z10, Util.toHeaderList(headers));
                    } else if (z11) {
                        while (this.sendBuffer.f1726y > 0) {
                            emitFrame(true);
                        }
                    } else if (z10) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // bg.j0, java.io.Flushable
        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.f1726y > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // bg.j0
        public o0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // bg.j0
        public void write(k source, long j) {
            kotlin.jvm.internal.k.e(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(source, j);
            while (this.sendBuffer.f1726y >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z10, int i6, f fVar) {
            this((i6 & 1) != 0 ? false : z10);
        }
    }
}
