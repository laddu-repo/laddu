package okhttp3.internal.http2;

import bg.b;
import bg.l;
import bg.m;
import bg.n;
import he.y;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public l sink;
        public Socket socket;
        public m source;
        private final TaskRunner taskRunner;

        public Builder(boolean z10, TaskRunner taskRunner) {
            k.e(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, m mVar, l lVar, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i6 & 4) != 0) {
                mVar = b.d(b.m(socket));
            }
            if ((i6 & 8) != 0) {
                lVar = b.c(b.i(socket));
            }
            return builder.socket(socket, str, mVar, lVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            k.k("connectionName");
            throw null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final l getSink$okhttp() {
            l lVar = this.sink;
            if (lVar != null) {
                return lVar;
            }
            k.k("sink");
            throw null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            k.k("socket");
            throw null;
        }

        public final m getSource$okhttp() {
            m mVar = this.source;
            if (mVar != null) {
                return mVar;
            }
            k.k("source");
            throw null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            k.e(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i6) {
            this.pingIntervalMillis = i6;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            k.e(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(String str) {
            k.e(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            k.e(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i6) {
            this.pingIntervalMillis = i6;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            k.e(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(l lVar) {
            k.e(lVar, "<set-?>");
            this.sink = lVar;
        }

        public final void setSocket$okhttp(Socket socket) {
            k.e(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(m mVar) {
            k.e(mVar, "<set-?>");
            this.source = mVar;
        }

        public final Builder socket(Socket socket) {
            k.e(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String peerName) {
            k.e(socket, "socket");
            k.e(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String peerName, m source) {
            k.e(socket, "socket");
            k.e(peerName, "peerName");
            k.e(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public final Builder socket(Socket socket, String peerName, m source, l sink) {
            String concat;
            k.e(socket, "socket");
            k.e(peerName, "peerName");
            k.e(source, "source");
            k.e(sink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                concat = Util.okHttpName + ' ' + peerName;
            } else {
                concat = "MockWebServer ".concat(peerName);
            }
            setConnectionName$okhttp(concat);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) {
                k.e(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private Companion() {
            }
        }

        public void onSettings(Http2Connection connection, Settings settings) {
            k.e(connection, "connection");
            k.e(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, a {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            k.e(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i6, String origin, n protocol, String host, int i10, long j) {
            k.e(origin, "origin");
            k.e(protocol, "protocol");
            k.e(host, "host");
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.w] */
        public final void applyAndAckSettings(boolean z10, Settings settings) {
            long initialWindowSize;
            int i6;
            Http2Stream[] http2StreamArr;
            k.e(settings, "settings");
            final ?? obj = new Object();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!z10) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        obj.f8055x = settings;
                        initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            http2Connection.setPeerSettings((Settings) obj.f8055x);
                            TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                            final String str = http2Connection.getConnectionName$okhttp() + " onSettings";
                            final boolean z11 = true;
                            taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) obj.f8055x);
                                    return -1L;
                                }
                            }, 0L);
                        }
                        http2StreamArr = null;
                        http2Connection.setPeerSettings((Settings) obj.f8055x);
                        TaskQueue taskQueue2 = http2Connection.settingsListenerQueue;
                        final String str2 = http2Connection.getConnectionName$okhttp() + " onSettings";
                        final boolean z112 = true;
                        taskQueue2.schedule(new Task(str2, z112) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) obj.f8055x);
                                return -1L;
                            }
                        }, 0L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) obj.f8055x);
                } catch (IOException e10) {
                    http2Connection.failConnection(e10);
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z10, int i6, m source, int i10) {
            k.e(source, "source");
            if (this.this$0.pushedStream$okhttp(i6)) {
                this.this$0.pushDataLater$okhttp(i6, source, i10, z10);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i6);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i6, ErrorCode.PROTOCOL_ERROR);
                long j = i10;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                source.skip(j);
                return;
            }
            stream.receiveData(source, i10);
            if (z10) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i6, ErrorCode errorCode, n debugData) {
            int i10;
            Object[] array;
            k.e(errorCode, "errorCode");
            k.e(debugData, "debugData");
            debugData.d();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i6 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z10, int i6, int i10, List<Header> headerBlock) {
            k.e(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i6)) {
                this.this$0.pushHeadersLater$okhttp(i6, headerBlock, z10);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i6);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (i6 <= http2Connection.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if (i6 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    final Http2Stream http2Stream = new Http2Stream(i6, http2Connection, false, z10, Util.toHeaders(headerBlock));
                    http2Connection.setLastGoodStreamId$okhttp(i6);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(i6), http2Stream);
                    TaskQueue newQueue = http2Connection.taskRunner.newQueue();
                    final String str = http2Connection.getConnectionName$okhttp() + '[' + i6 + "] onStream";
                    final boolean z11 = true;
                    newQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                http2Connection.getListener$okhttp().onStream(http2Stream);
                                return -1L;
                            } catch (IOException e10) {
                                Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e10);
                                try {
                                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e10);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                stream.receiveHeaders(Util.toHeaders(headerBlock), z10);
            }
        }

        @Override // ve.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m292invoke();
            return y.f6101a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z10, final int i6, final int i10) {
            if (!z10) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection = this.this$0;
                final boolean z11 = true;
                taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, i6, i10);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (i6 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (i6 == 2) {
                        http2Connection2.degradedPongsReceived++;
                    } else if (i6 == 3) {
                        http2Connection2.awaitPongsReceived++;
                        k.c(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                        http2Connection2.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i6, int i10, List<Header> requestHeaders) {
            k.e(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i10, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i6, ErrorCode errorCode) {
            k.e(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i6)) {
                this.this$0.pushResetLater$okhttp(i6, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i6);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z10, final Settings settings) {
            k.e(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            final boolean z11 = true;
            taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z10, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i6, long j) {
            if (i6 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i6);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke, reason: collision with other method in class */
        public void m292invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    this.this$0.close$okhttp(errorCode, errorCode3, e10);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    this.this$0.close$okhttp(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e12) {
                    e10 = e12;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.close$okhttp(errorCode4, errorCode4, e10);
                    errorCode = http2Connection;
                    errorCode3 = this.reader;
                    Util.closeQuietly((Closeable) errorCode3);
                }
                errorCode3 = this.reader;
                Util.closeQuietly((Closeable) errorCode3);
            } catch (Throwable th2) {
                th = th2;
                this.this$0.close$okhttp(errorCode, errorCode3, e10);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i6, int i10, int i11, boolean z10) {
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        int i6;
        k.e(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient$okhttp()) {
            i6 = 3;
        } else {
            i6 = 2;
        }
        this.nextStreamId = i6;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String c10 = w8.k.c(connectionName$okhttp, " ping");
            newQueue.schedule(new Task(c10) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j;
                    long j10;
                    boolean z10;
                    synchronized (this) {
                        long j11 = this.intervalPongsReceived;
                        j = this.intervalPingsSent;
                        if (j11 >= j) {
                            j10 = this.intervalPingsSent;
                            this.intervalPingsSent = j10 + 1;
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = true;
        }
        if ((i6 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i6;
        Object[] objArr;
        k.e(connectionCode, "connectionCode");
        k.e(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                objArr = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            } else {
                objArr = null;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i6) {
        return this.streams.get(Integer.valueOf(i6));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean z10) {
        k.e(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, z10);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, bg.k] */
    public final void pushDataLater$okhttp(final int i6, m source, final int i10, final boolean z10) {
        k.e(source, "source");
        final ?? obj = new Object();
        long j = i10;
        source.Y(j);
        source.read(obj, j);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i6 + "] onData";
        final boolean z11 = true;
        taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.pushObserver;
                    boolean onData = pushObserver.onData(i6, obj, i10, z10);
                    if (onData) {
                        this.getWriter().rstStream(i6, ErrorCode.CANCEL);
                    }
                    if (onData || z10) {
                        synchronized (this) {
                            set = this.currentPushRequests;
                            set.remove(Integer.valueOf(i6));
                        }
                        return -1L;
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i6, final List<Header> requestHeaders, final boolean z10) {
        k.e(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i6 + "] onHeaders";
        final boolean z11 = true;
        taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(i6, requestHeaders, z10);
                if (onHeaders) {
                    try {
                        this.getWriter().rstStream(i6, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (onHeaders || z10) {
                    synchronized (this) {
                        set = this.currentPushRequests;
                        set.remove(Integer.valueOf(i6));
                    }
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i6, final List<Header> requestHeaders) {
        Throwable th;
        k.e(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i6))) {
                    try {
                        writeSynResetLater$okhttp(i6, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.currentPushRequests.add(Integer.valueOf(i6));
                TaskQueue taskQueue = this.pushQueue;
                final String str = this.connectionName + '[' + i6 + "] onRequest";
                final boolean z10 = true;
                taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        PushObserver pushObserver;
                        Set set;
                        pushObserver = this.pushObserver;
                        if (pushObserver.onRequest(i6, requestHeaders)) {
                            try {
                                this.getWriter().rstStream(i6, ErrorCode.CANCEL);
                                synchronized (this) {
                                    set = this.currentPushRequests;
                                    set.remove(Integer.valueOf(i6));
                                }
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                        return -1L;
                    }
                }, 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void pushResetLater$okhttp(final int i6, final ErrorCode errorCode) {
        k.e(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i6 + "] onReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.pushObserver;
                pushObserver.onReset(i6, errorCode);
                synchronized (this) {
                    set = this.currentPushRequests;
                    set.remove(Integer.valueOf(i6));
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i6, List<Header> requestHeaders, boolean z10) {
        k.e(requestHeaders, "requestHeaders");
        if (!this.client) {
            return newStream(i6, requestHeaders, z10);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public final boolean pushedStream$okhttp(int i6) {
        if (i6 != 0 && (i6 & 1) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i6) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i6));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j10 = this.degradedPingsSent;
            if (j < j10) {
                return;
            }
            this.degradedPingsSent = j10 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + DEGRADED_PONG_TIMEOUT_NS;
            TaskQueue taskQueue = this.writerQueue;
            final String o10 = r4.a.o(new StringBuilder(), this.connectionName, " ping");
            final boolean z10 = true;
            taskQueue.schedule(new Task(o10, z10) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i6) {
        this.lastGoodStreamId = i6;
    }

    public final void setNextStreamId$okhttp(int i6) {
        this.nextStreamId = i6;
    }

    public final void setPeerSettings(Settings settings) {
        k.e(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        k.e(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode statusCode) {
        k.e(statusCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j10 = this.readBytesTotal + j;
        this.readBytesTotal = j10;
        long j11 = j10 - this.readBytesAcknowledged;
        if (j11 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j11);
            this.readBytesAcknowledged += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.writer.maxDataLength());
        r6 = r3;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeData(int r9, boolean r10, bg.k r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r3 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r5 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L34
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r8.streams     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r3 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L2a
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r3 = r8.writer     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L2a
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L56
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = 0
        L57:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, bg.k, long):void");
    }

    public final void writeHeaders$okhttp(int i6, boolean z10, List<Header> alternating) {
        k.e(alternating, "alternating");
        this.writer.headers(z10, i6, alternating);
    }

    public final void writePing(boolean z10, int i6, int i10) {
        try {
            this.writer.ping(z10, i6, i10);
        } catch (IOException e10) {
            failConnection(e10);
        }
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i6, ErrorCode statusCode) {
        k.e(statusCode, "statusCode");
        this.writer.rstStream(i6, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int i6, final ErrorCode errorCode) {
        k.e(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i6 + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i6, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i6, final long j) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i6 + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i6, j);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:15:0x0027, B:17:0x002c, B:19:0x0034, B:23:0x0047, B:25:0x004d, B:42:0x0080, B:43:0x0085), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x005f, TryCatch #4 {all -> 0x005f, blocks: (B:26:0x0056, B:28:0x0059, B:34:0x0062, B:36:0x0066, B:37:0x0074, B:38:0x007b, B:46:0x0086, B:47:0x0087), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062 A[Catch: all -> 0x005f, TryCatch #4 {all -> 0x005f, blocks: (B:26:0x0056, B:28:0x0059, B:34:0x0062, B:36:0x0066, B:37:0x0074, B:38:0x007b, B:46:0x0086, B:47:0x0087), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r10, java.util.List<okhttp3.internal.http2.Header> r11, boolean r12) {
        /*
            r9 = this;
            r3 = r12 ^ 1
            okhttp3.internal.http2.Http2Writer r6 = r9.writer
            monitor-enter(r6)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L88
            int r0 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L18
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r9.shutdown(r0)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L86
        L18:
            boolean r0 = r9.isShutdown     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7f
            int r1 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            int r0 = r1 + 2
            r9.nextStreamId = r0     // Catch: java.lang.Throwable -> L7c
            okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L7c
            r5 = 0
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L46
            long r4 = r2.writeBytesTotal     // Catch: java.lang.Throwable -> L43
            long r7 = r2.writeBytesMaximum     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 >= 0) goto L46
            long r4 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L43
            long r7 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L43
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 < 0) goto L41
            goto L46
        L41:
            r12 = 0
            goto L47
        L43:
            r0 = move-exception
        L44:
            r10 = r0
            goto L86
        L46:
            r12 = 1
        L47:
            boolean r4 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L56
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r2.streams     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> L43
        L56:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L62
            okhttp3.internal.http2.Http2Writer r10 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r10.headers(r3, r1, r11)     // Catch: java.lang.Throwable -> L5f
            goto L6b
        L5f:
            r0 = move-exception
        L60:
            r10 = r0
            goto L8b
        L62:
            boolean r3 = r2.client     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L74
            okhttp3.internal.http2.Http2Writer r3 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r3.pushPromise(r10, r1, r11)     // Catch: java.lang.Throwable -> L5f
        L6b:
            monitor-exit(r6)
            if (r12 == 0) goto L73
            okhttp3.internal.http2.Http2Writer r10 = r2.writer
            r10.flush()
        L73:
            return r0
        L74:
            java.lang.String r10 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5f
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L5f
            throw r11     // Catch: java.lang.Throwable -> L5f
        L7c:
            r0 = move-exception
            r2 = r9
            goto L44
        L7f:
            r2 = r9
            okhttp3.internal.http2.ConnectionShutdownException r10 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            r10.<init>()     // Catch: java.lang.Throwable -> L43
            throw r10     // Catch: java.lang.Throwable -> L43
        L86:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L88:
            r0 = move-exception
            r2 = r9
            goto L60
        L8b:
            monitor-exit(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void start(boolean z10) {
        start$default(this, z10, null, 2, null);
    }

    public final void start(boolean z10, TaskRunner taskRunner) {
        k.e(taskRunner, "taskRunner");
        if (z10) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue$execute$1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
