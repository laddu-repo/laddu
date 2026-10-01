package bg;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s implements l0 {
    private final l0 delegate;

    public s(l0 delegate) {
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final l0 m3deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final l0 delegate() {
        return this.delegate;
    }

    @Override // bg.l0
    public long read(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        return this.delegate.read(sink, j);
    }

    @Override // bg.l0
    public o0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
