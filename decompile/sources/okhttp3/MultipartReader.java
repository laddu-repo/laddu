package okhttp3;

import bg.b;
import bg.b0;
import bg.l0;
import bg.m;
import bg.n;
import bg.n0;
import bg.o0;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.internal.http1.HeadersReader;
import r4.a;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final b0 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final n crlfDashDashBoundary;
    private PartSource currentPart;
    private final n dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final m source;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final b0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Part implements Closeable {
        private final m body;
        private final Headers headers;

        public Part(Headers headers, m body) {
            k.e(headers, "headers");
            k.e(body, "body");
            this.headers = headers;
            this.body = body;
        }

        public final m body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class PartSource implements l0 {
        private final o0 timeout = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bg.o0] */
        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (k.a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // bg.l0
        public long read(bg.k sink, long j) {
            long read;
            long j10;
            long read2;
            k.e(sink, "sink");
            if (j >= 0) {
                if (k.a(MultipartReader.this.currentPart, this)) {
                    o0 timeout = MultipartReader.this.source.timeout();
                    o0 o0Var = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    n0 n0Var = o0.Companion;
                    long timeoutNanos2 = o0Var.timeoutNanos();
                    long timeoutNanos3 = timeout.timeoutNanos();
                    n0Var.getClass();
                    if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                        timeoutNanos2 = timeoutNanos3;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(timeoutNanos2, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (o0Var.hasDeadline()) {
                            j10 = deadlineNanoTime;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), o0Var.deadlineNanoTime()));
                        } else {
                            j10 = deadlineNanoTime;
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(sink, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (o0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j10);
                            }
                            return read2;
                        } catch (Throwable th) {
                            long j11 = j10;
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (o0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(j11);
                            }
                            throw th;
                        }
                    }
                    if (o0Var.hasDeadline()) {
                        timeout.deadlineNanoTime(o0Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(sink, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (o0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (o0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(a.j("byteCount < 0: ", j).toString());
        }

        @Override // bg.l0
        public o0 timeout() {
            return this.timeout;
        }
    }

    static {
        n nVar = n.A;
        afterBoundaryOptions = b.h(l.u("\r\n"), l.u("--"), l.u(" "), l.u("\t"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, bg.k] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, bg.k] */
    public MultipartReader(m source, String boundary) {
        k.e(source, "source");
        k.e(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        ?? obj = new Object();
        obj.s0("--");
        obj.s0(boundary);
        this.dashDashBoundary = obj.g(obj.f1726y);
        ?? obj2 = new Object();
        obj2.s0("\r\n--");
        obj2.s0(boundary);
        this.crlfDashDashBoundary = obj2.g(obj2.f1726y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long currentPartBytesRemaining(long r20) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.currentPartBytesRemaining(long):long");
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.I(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.d());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.d());
            }
            boolean z10 = false;
            while (true) {
                int w10 = this.source.w(afterBoundaryOptions);
                if (w10 != -1) {
                    if (w10 != 0) {
                        if (w10 != 1) {
                            if (w10 == 2 || w10 == 3) {
                                z10 = true;
                            }
                        } else {
                            if (!z10) {
                                if (this.partCount != 0) {
                                    this.noMoreParts = true;
                                    return null;
                                }
                                throw new ProtocolException("expected at least 1 part");
                            }
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, b.d(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.k.e(r3, r0)
            bg.m r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
