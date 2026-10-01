package ef;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w implements d {
    public static final List B = ff.f.j(new x[]{x.A, x.f5094y});
    public static final List C = ff.f.j(new j[]{j.f4998e, j.f});
    public final a9.g A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.p f5068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2.e f5071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5072e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f5073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5074h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f5075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f5076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProxySelector f5077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f5078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f5079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f5080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X509TrustManager f5081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f5082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f5083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tf.c f5084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f5085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z7.b f5086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5089x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a9.g f5090y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final hf.d f5091z;

    public w(v vVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f5068a = vVar.f5046a;
        this.f5069b = ff.f.i(vVar.f5048c);
        this.f5070c = ff.f.i(vVar.f5049d);
        this.f5071d = vVar.f5050e;
        this.f5072e = vVar.f;
        this.f = vVar.f5051g;
        this.f5073g = vVar.f5052h;
        this.f5074h = vVar.i;
        this.i = vVar.f5053j;
        this.f5075j = vVar.f5054k;
        this.f5076k = vVar.f5055l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f5077l = proxySelector == null ? rf.a.f11415a : proxySelector;
        this.f5078m = vVar.f5056m;
        this.f5079n = vVar.f5057n;
        List list = vVar.f5060q;
        this.f5082q = list;
        this.f5083r = vVar.f5061r;
        this.f5084s = vVar.f5062s;
        this.f5087v = vVar.f5065v;
        this.f5088w = vVar.f5066w;
        this.f5089x = vVar.f5067x;
        this.f5090y = new a9.g(26);
        this.f5091z = hf.d.f6301l;
        a9.g gVar = vVar.f5047b;
        if (gVar == null) {
            gVar = new a9.g(14);
            vVar.f5047b = gVar;
        }
        this.A = gVar;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f4999a) {
                    SSLSocketFactory sSLSocketFactory = vVar.f5058o;
                    if (sSLSocketFactory == null) {
                        pf.e eVar = pf.e.f10613a;
                        pf.e.f10613a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        de.i.b(trustManagers);
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.f5081p = x509TrustManager;
                                pf.e eVar2 = pf.e.f10613a;
                                eVar2.getClass();
                                try {
                                    SSLContext sSLContextL = eVar2.l();
                                    sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    de.i.d(socketFactory, "getSocketFactory(...)");
                                    this.f5080o = socketFactory;
                                    z7.b bVarC = pf.e.f10613a.c(x509TrustManager);
                                    this.f5086u = bVarC;
                                    f fVar = vVar.f5063t;
                                    fVar.getClass();
                                    this.f5085t = de.i.a(fVar.f4969b, bVarC) ? fVar : new f(fVar.f4968a, bVarC);
                                } catch (GeneralSecurityException e7) {
                                    throw new AssertionError("No System TLS: " + e7, e7);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        de.i.d(string, "toString(...)");
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                    }
                    this.f5080o = sSLSocketFactory;
                    z7.b bVar = vVar.f5064u;
                    de.i.b(bVar);
                    this.f5086u = bVar;
                    qc.b bVar2 = vVar.f5059p;
                    de.i.b(bVar2);
                    this.f5081p = bVar2;
                    f fVar2 = vVar.f5063t;
                    fVar2.getClass();
                    this.f5085t = de.i.a(fVar2.f4969b, bVar) ? fVar2 : new f(fVar2.f4968a, bVar);
                }
            }
            this.f5080o = null;
            this.f5086u = null;
            this.f5081p = null;
            this.f5085t = f.f4967c;
        } else {
            this.f5080o = null;
            this.f5086u = null;
            this.f5081p = null;
            this.f5085t = f.f4967c;
        }
        X509TrustManager x509TrustManager2 = this.f5081p;
        z7.b bVar3 = this.f5086u;
        SSLSocketFactory sSLSocketFactory2 = this.f5080o;
        List list2 = this.f5070c;
        List list3 = this.f5069b;
        de.i.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        de.i.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f5082q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((j) it2.next()).f4999a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (bVar3 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (bVar3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!de.i.a(this.f5085t, f.f4967c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public w() {
        this(new v());
    }
}
