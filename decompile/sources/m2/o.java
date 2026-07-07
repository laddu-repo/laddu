package m2;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import db.c1;
import db.h1;
import db.k0;
import db.l0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f8527a;

    static {
        new o(new k7.c(15));
    }

    public o(k7.c cVar) {
        l0 l0Var;
        db.v vVar = (db.v) ((u5.r) cVar.f7745y).f12916y;
        if (vVar == null) {
            l0Var = db.b0.B;
        } else {
            Collection entrySet = vVar.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                l0Var = db.b0.B;
            } else {
                db.t tVar = (db.t) entrySet;
                b2.k kVar = new b2.k(tVar.f4044y.size());
                Iterator it = tVar.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    c1 g10 = ((db.h0) entry.getValue()).g();
                    kVar.u(key, g10);
                    i6 += g10.A;
                }
                l0Var = new l0((h1) kVar.c(), i6);
            }
        }
        this.f8527a = l0Var;
    }

    public static String a(String str) {
        if (dg.b.f(str, "Accept")) {
            return "Accept";
        }
        if (dg.b.f(str, "Allow")) {
            return "Allow";
        }
        if (dg.b.f(str, "Authorization")) {
            return "Authorization";
        }
        if (dg.b.f(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (dg.b.f(str, "Blocksize")) {
            return "Blocksize";
        }
        if (dg.b.f(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (dg.b.f(str, "Connection")) {
            return "Connection";
        }
        if (dg.b.f(str, "Content-Base")) {
            return "Content-Base";
        }
        if (dg.b.f(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (dg.b.f(str, "Content-Language")) {
            return "Content-Language";
        }
        if (dg.b.f(str, "Content-Length")) {
            return "Content-Length";
        }
        if (dg.b.f(str, "Content-Location")) {
            return "Content-Location";
        }
        if (dg.b.f(str, CommonGatewayClient.HEADER_CONTENT_TYPE)) {
            return CommonGatewayClient.HEADER_CONTENT_TYPE;
        }
        if (dg.b.f(str, "CSeq")) {
            return "CSeq";
        }
        if (dg.b.f(str, "Date")) {
            return "Date";
        }
        if (dg.b.f(str, "Expires")) {
            return "Expires";
        }
        if (dg.b.f(str, "Location")) {
            return "Location";
        }
        if (dg.b.f(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (dg.b.f(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (dg.b.f(str, "Public")) {
            return "Public";
        }
        if (dg.b.f(str, "Range")) {
            return "Range";
        }
        if (dg.b.f(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (dg.b.f(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (dg.b.f(str, "Scale")) {
            return "Scale";
        }
        if (dg.b.f(str, "Session")) {
            return "Session";
        }
        if (dg.b.f(str, "Speed")) {
            return "Speed";
        }
        if (dg.b.f(str, "Supported")) {
            return "Supported";
        }
        if (dg.b.f(str, "Timestamp")) {
            return "Timestamp";
        }
        if (dg.b.f(str, "Transport")) {
            return "Transport";
        }
        if (dg.b.f(str, "User-Agent")) {
            return "User-Agent";
        }
        if (dg.b.f(str, "Via")) {
            return "Via";
        }
        if (dg.b.f(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public final String b(String str) {
        k0 d10 = this.f8527a.d(a(str));
        if (d10.isEmpty()) {
            return null;
        }
        return (String) db.r.l(d10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f8527a.equals(((o) obj).f8527a);
    }

    public final int hashCode() {
        return this.f8527a.hashCode();
    }
}
