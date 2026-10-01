package ef;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f5021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final od.j f5024d;

    public o(f0 f0Var, h hVar, List list, ce.a aVar) {
        this.f5021a = f0Var;
        this.f5022b = hVar;
        this.f5023c = list;
        this.f5024d = new od.j(new ac.g0(6, aVar));
    }

    public final List a() {
        return (List) this.f5024d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f5021a == this.f5021a && de.i.a(oVar.f5022b, this.f5022b) && de.i.a(oVar.a(), a()) && de.i.a(oVar.f5023c, this.f5023c);
    }

    public final int hashCode() {
        return this.f5023c.hashCode() + ((a().hashCode() + ((this.f5022b.hashCode() + ((this.f5021a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(pd.l.C(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                de.i.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f5021a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f5022b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f5023c;
        ArrayList arrayList2 = new ArrayList(pd.l.C(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                de.i.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
