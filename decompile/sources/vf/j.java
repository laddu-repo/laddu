package vf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InputStream f13618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f13619w;

    public j(InputStream inputStream, v vVar) {
        de.i.e(inputStream, "input");
        this.f13618v = inputStream;
        this.f13619w = vVar;
    }

    @Override // vf.t
    public final long V(long j8, c cVar) throws IOException {
        de.i.e(cVar, "sink");
        try {
            this.f13619w.f();
            o oVarC0 = cVar.c0(1);
            int i = this.f13618v.read(oVarC0.f13633a, oVarC0.f13635c, (int) Math.min(8192L, 8192 - oVarC0.f13635c));
            if (i != -1) {
                oVarC0.f13635c += i;
                long j9 = i;
                cVar.f13603w += j9;
                return j9;
            }
            if (oVarC0.f13634b != oVarC0.f13635c) {
                return -1L;
            }
            cVar.f13602v = oVarC0.a();
            p.a(oVarC0);
            return -1L;
        } catch (AssertionError e7) {
            if (wf.f.a(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13618v.close();
    }

    @Override // vf.t
    public final v g() {
        return this.f13619w;
    }

    public final String toString() {
        return "source(" + this.f13618v + ')';
    }
}
