package bg;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 implements l {

    /* renamed from: x, reason: collision with root package name */
    public final j0 f1701x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1702y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1703z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, bg.k] */
    public e0(j0 sink) {
        kotlin.jvm.internal.k.e(sink, "sink");
        this.f1701x = sink;
        this.f1702y = new Object();
    }

    @Override // bg.l
    public final l F(String string) {
        kotlin.jvm.internal.k.e(string, "string");
        if (!this.f1703z) {
            this.f1702y.s0(string);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l L(long j) {
        if (!this.f1703z) {
            this.f1702y.n0(j);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final long T(l0 source) {
        kotlin.jvm.internal.k.e(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.f1702y, 8192L);
            if (read != -1) {
                j += read;
                t();
            } else {
                return j;
            }
        }
    }

    @Override // bg.l
    public final l Z(long j) {
        if (!this.f1703z) {
            this.f1702y.m0(j);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final k a() {
        return this.f1702y;
    }

    @Override // bg.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j0 j0Var = this.f1701x;
        if (!this.f1703z) {
            try {
                k kVar = this.f1702y;
                long j = kVar.f1726y;
                if (j > 0) {
                    j0Var.write(kVar, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                j0Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f1703z = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // bg.l, bg.j0, java.io.Flushable
    public final void flush() {
        if (!this.f1703z) {
            k kVar = this.f1702y;
            long j = kVar.f1726y;
            j0 j0Var = this.f1701x;
            if (j > 0) {
                j0Var.write(kVar, j);
            }
            j0Var.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1703z;
    }

    @Override // bg.l
    public final l j() {
        if (!this.f1703z) {
            k kVar = this.f1702y;
            long j = kVar.f1726y;
            if (j > 0) {
                this.f1701x.write(kVar, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l n(n byteString) {
        kotlin.jvm.internal.k.e(byteString, "byteString");
        if (!this.f1703z) {
            this.f1702y.k0(byteString);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l t() {
        if (!this.f1703z) {
            k kVar = this.f1702y;
            long l10 = kVar.l();
            if (l10 > 0) {
                this.f1701x.write(kVar, l10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.j0
    public final o0 timeout() {
        return this.f1701x.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f1701x + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.k.e(source, "source");
        if (!this.f1703z) {
            int write = this.f1702y.write(source);
            t();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l writeByte(int i6) {
        if (!this.f1703z) {
            this.f1702y.l0(i6);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l writeInt(int i6) {
        if (!this.f1703z) {
            this.f1702y.o0(i6);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l writeShort(int i6) {
        if (!this.f1703z) {
            this.f1702y.q0(i6);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.j0
    public final void write(k source, long j) {
        kotlin.jvm.internal.k.e(source, "source");
        if (!this.f1703z) {
            this.f1702y.write(source, j);
            t();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l write(byte[] source) {
        kotlin.jvm.internal.k.e(source, "source");
        if (!this.f1703z) {
            this.f1702y.m0write(source);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // bg.l
    public final l write(byte[] source, int i6, int i10) {
        kotlin.jvm.internal.k.e(source, "source");
        if (!this.f1703z) {
            this.f1702y.m1write(source, i6, i10);
            t();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
