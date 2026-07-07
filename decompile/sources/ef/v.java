package ef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a9.g f5047b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2.e f5050e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f5052h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f5054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f5055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f5056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f5057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f5058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qc.b f5059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f5060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f5061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tf.c f5062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f5063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z7.b f5064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5067x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.p f5046a = new sb.p(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5048c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5049d = new ArrayList();

    public v() {
        TimeZone timeZone = ff.f.f5401a;
        this.f5050e = new d2.e(15);
        this.f = true;
        this.f5051g = true;
        b bVar = b.f4941b;
        this.f5052h = bVar;
        this.i = true;
        this.f5053j = true;
        this.f5054k = b.f4942c;
        this.f5055l = b.f4943d;
        this.f5056m = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        de.i.d(socketFactory, "getDefault(...)");
        this.f5057n = socketFactory;
        this.f5060q = w.C;
        this.f5061r = w.B;
        this.f5062s = tf.c.f12582a;
        this.f5063t = f.f4967c;
        this.f5065v = 10000;
        this.f5066w = 10000;
        this.f5067x = 10000;
    }

    public final void a(List list) {
        de.i.e(list, "protocols");
        ArrayList arrayListP = pd.j.P(list);
        x xVar = x.B;
        if (!arrayListP.contains(xVar) && !arrayListP.contains(x.f5094y)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListP).toString());
        }
        if (arrayListP.contains(xVar) && arrayListP.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListP).toString());
        }
        if (arrayListP.contains(x.f5093x)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListP).toString());
        }
        if (arrayListP.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListP.remove(x.f5095z);
        arrayListP.equals(this.f5061r);
        List listUnmodifiableList = Collections.unmodifiableList(arrayListP);
        de.i.d(listUnmodifiableList, "unmodifiableList(...)");
        this.f5061r = listUnmodifiableList;
    }

    public final void b(SSLSocketFactory sSLSocketFactory, qc.b bVar) {
        de.i.e(sSLSocketFactory, "sslSocketFactory");
        if (sSLSocketFactory.equals(this.f5058o)) {
            bVar.equals(this.f5059p);
        }
        this.f5058o = sSLSocketFactory;
        pf.e eVar = pf.e.f10613a;
        this.f5064u = pf.e.f10613a.c(bVar);
        this.f5059p = bVar;
    }
}
