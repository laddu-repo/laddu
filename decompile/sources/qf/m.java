package qf;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f11041b;

    public m(l lVar) {
        this.f11040a = lVar;
    }

    @Override // qf.n
    public final String a(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.a(sSLSocket);
        }
        return null;
    }

    @Override // qf.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.f11040a.b(sSLSocket);
    }

    @Override // qf.n
    public final boolean c() {
        return true;
    }

    @Override // qf.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        de.i.e(list, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f11041b == null && this.f11040a.b(sSLSocket)) {
                this.f11041b = this.f11040a.d(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11041b;
    }
}
