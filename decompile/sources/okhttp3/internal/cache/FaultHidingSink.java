package okhttp3.internal.cache;

import bg.j0;
import bg.r;
import java.io.IOException;
import kotlin.jvm.internal.k;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class FaultHidingSink extends r {
    private boolean hasErrors;
    private final l onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(j0 delegate, l onException) {
        super(delegate);
        k.e(delegate, "delegate");
        k.e(onException, "onException");
        this.onException = onException;
    }

    @Override // bg.r, bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // bg.r, bg.j0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    public final l getOnException() {
        return this.onException;
    }

    @Override // bg.r, bg.j0
    public void write(bg.k source, long j) {
        k.e(source, "source");
        if (this.hasErrors) {
            source.skip(j);
            return;
        }
        try {
            super.write(source, j);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
