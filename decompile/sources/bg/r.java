package bg;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r implements j0 {
    private final j0 delegate;

    public r(j0 delegate) {
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final j0 m2deprecated_delegate() {
        return this.delegate;
    }

    @Override // bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final j0 delegate() {
        return this.delegate;
    }

    @Override // bg.j0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // bg.j0
    public o0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // bg.j0
    public void write(k source, long j) {
        kotlin.jvm.internal.k.e(source, "source");
        this.delegate.write(source, j);
    }
}
