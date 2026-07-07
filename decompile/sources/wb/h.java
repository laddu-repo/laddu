package wb;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f13985a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f13986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f13987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f13988d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(Executor executor, c cVar, c cVar2) {
        this.f13986b = executor;
        this.f13987c = cVar;
        this.f13988d = cVar2;
    }

    public final void a(vb.g gVar) {
        synchronized (this.f13985a) {
            this.f13985a.add(gVar);
        }
    }
}
