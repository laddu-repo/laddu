package ad;

import de.i;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f494w;

    public g(f fVar) {
        this.f493v = fVar;
        ab.a aVar = fVar.f488v;
        this.f494w = new Object();
    }

    public final od.f A(e eVar) {
        od.f fVarB;
        synchronized (this.f494w) {
            fVarB = this.f493v.B(eVar);
        }
        return fVarB;
    }

    public final void B(e eVar) {
        i.e(eVar, "downloadInfo");
        synchronized (this.f494w) {
            this.f493v.I(eVar);
        }
    }

    public final e a(String str) {
        e eVarL;
        i.e(str, "file");
        synchronized (this.f494w) {
            eVarL = this.f493v.l(str);
        }
        return eVarL;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f494w) {
            this.f493v.close();
        }
    }

    public final List i(int i) {
        List listM;
        synchronized (this.f494w) {
            listM = this.f493v.m(i);
        }
        return listM;
    }

    public final s5.d l() {
        s5.d dVar;
        synchronized (this.f494w) {
            dVar = this.f493v.f492z;
        }
        return dVar;
    }

    public final List m(zc.i iVar) {
        List listA;
        i.e(iVar, "prioritySort");
        synchronized (this.f494w) {
            listA = this.f493v.A(iVar);
        }
        return listA;
    }
}
