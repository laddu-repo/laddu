package vf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n f13614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Inflater f13615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13617y;

    public i(n nVar, Inflater inflater) {
        this.f13614v = nVar;
        this.f13615w = inflater;
    }

    @Override // vf.t
    public final long V(long j8, c cVar) {
        long j9;
        Inflater inflater = this.f13615w;
        de.i.e(cVar, "sink");
        while (!this.f13617y) {
            try {
                o oVarC0 = cVar.c0(1);
                int iMin = (int) Math.min(8192L, 8192 - oVarC0.f13635c);
                boolean zNeedsInput = inflater.needsInput();
                n nVar = this.f13614v;
                if (zNeedsInput && !nVar.a()) {
                    o oVar = nVar.f13631w.f13602v;
                    de.i.b(oVar);
                    int i = oVar.f13635c;
                    int i10 = oVar.f13634b;
                    int i11 = i - i10;
                    this.f13616x = i11;
                    inflater.setInput(oVar.f13633a, i10, i11);
                }
                int iInflate = inflater.inflate(oVarC0.f13633a, oVarC0.f13635c, iMin);
                int i12 = this.f13616x;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f13616x -= remaining;
                    nVar.skip(remaining);
                }
                if (iInflate > 0) {
                    oVarC0.f13635c += iInflate;
                    j9 = iInflate;
                    cVar.f13603w += j9;
                } else {
                    if (oVarC0.f13634b == oVarC0.f13635c) {
                        cVar.f13602v = oVarC0.a();
                        p.a(oVarC0);
                    }
                    j9 = 0;
                }
                if (j9 > 0) {
                    return j9;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (nVar.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e7) {
                throw new IOException(e7);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13617y) {
            return;
        }
        this.f13615w.end();
        this.f13617y = true;
        this.f13614v.close();
    }

    @Override // vf.t
    public final v g() {
        return this.f13614v.f13630v.g();
    }
}
