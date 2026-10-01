package r7;

import bg.e0;
import bg.k;
import bg.l0;
import bg.m;
import bg.o0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements l0 {
    public final /* synthetic */ e0 A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11865x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f11866y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g f11867z;

    public h(m mVar, g gVar, e0 e0Var) {
        this.f11866y = mVar;
        this.f11867z = gVar;
        this.A = e0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f11865x && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.f11865x = true;
            this.f11867z.abort();
        }
        this.f11866y.close();
    }

    @Override // bg.l0
    public final long read(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        try {
            long read = this.f11866y.read(sink, j);
            e0 e0Var = this.A;
            if (read == -1) {
                if (!this.f11865x) {
                    this.f11865x = true;
                    e0Var.close();
                }
                return -1L;
            }
            sink.m(sink.f1726y - read, e0Var.f1702y, read);
            e0Var.t();
            return read;
        } catch (IOException e10) {
            if (!this.f11865x) {
                this.f11865x = true;
                this.f11867z.abort();
                throw e10;
            }
            throw e10;
        }
    }

    @Override // bg.l0
    public final o0 timeout() {
        return this.f11866y.timeout();
    }
}
