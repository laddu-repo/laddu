package vf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f13627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f13628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13629x;

    public m(r rVar) {
        de.i.e(rVar, "sink");
        this.f13627v = rVar;
        this.f13628w = new c();
    }

    public final d a() {
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f13628w;
        long j8 = cVar.f13603w;
        if (j8 == 0) {
            j8 = 0;
        } else {
            o oVar = cVar.f13602v;
            de.i.b(oVar);
            o oVar2 = oVar.f13638g;
            de.i.b(oVar2);
            int i = oVar2.f13635c;
            if (i < 8192 && oVar2.f13637e) {
                j8 -= (long) (i - oVar2.f13634b);
            }
        }
        if (j8 > 0) {
            this.f13627v.y(j8, cVar);
        }
        return this;
    }

    @Override // vf.d
    public final d b0(String str) {
        de.i.e(str, "string");
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        this.f13628w.v0(str);
        a();
        return this;
    }

    @Override // vf.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f13627v;
        if (this.f13629x) {
            return;
        }
        try {
            c cVar = this.f13628w;
            long j8 = cVar.f13603w;
            if (j8 > 0) {
                rVar.y(j8, cVar);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            rVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f13629x = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // vf.d, vf.r, java.io.Flushable
    public final void flush() {
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f13628w;
        long j8 = cVar.f13603w;
        r rVar = this.f13627v;
        if (j8 > 0) {
            rVar.y(j8, cVar);
        }
        rVar.flush();
    }

    @Override // vf.r
    public final v g() {
        return this.f13627v.g();
    }

    @Override // vf.d
    public final d h0(f fVar) {
        de.i.e(fVar, "byteString");
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        this.f13628w.n0(fVar);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13629x;
    }

    public final String toString() {
        return "buffer(" + this.f13627v + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        de.i.e(byteBuffer, "source");
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f13628w.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // vf.d
    public final d writeByte(int i) {
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        this.f13628w.p0(i);
        a();
        return this;
    }

    @Override // vf.d
    public final d writeInt(int i) {
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        this.f13628w.s0(i);
        a();
        return this;
    }

    @Override // vf.d
    public final d writeShort(int i) {
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        this.f13628w.t0(i);
        a();
        return this;
    }

    @Override // vf.r
    public final void y(long j8, c cVar) {
        de.i.e(cVar, "source");
        if (this.f13629x) {
            throw new IllegalStateException("closed");
        }
        this.f13628w.y(j8, cVar);
        a();
    }

    @Override // vf.d
    public final d write(byte[] bArr) {
        if (!this.f13629x) {
            this.f13628w.m0(bArr.length, bArr);
            a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
