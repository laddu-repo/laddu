package ef;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f4965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f4966c;

    public e0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        de.i.e(inetSocketAddress, "socketAddress");
        this.f4964a = aVar;
        this.f4965b = proxy;
        this.f4966c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return de.i.a(e0Var.f4964a, this.f4964a) && de.i.a(e0Var.f4965b, this.f4965b) && de.i.a(e0Var.f4966c, this.f4966c);
    }

    public final int hashCode() {
        return this.f4966c.hashCode() + ((this.f4965b.hashCode() + ((this.f4964a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        s sVar = this.f4964a.f4926h;
        String str = sVar.f5038d;
        InetSocketAddress inetSocketAddress = this.f4966c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : ff.c.b(hostAddress);
        if (ke.h.F(str, ':')) {
            sb2.append("[");
            sb2.append(str);
            sb2.append("]");
        } else {
            sb2.append(str);
        }
        if (sVar.f5039e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb2.append(":");
            sb2.append(sVar.f5039e);
        }
        if (!str.equals(strB)) {
            if (this.f4965b.equals(Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strB == null) {
                sb2.append("<unresolved>");
            } else if (ke.h.F(strB, ':')) {
                sb2.append("[");
                sb2.append(strB);
                sb2.append("]");
            } else {
                sb2.append(strB);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
