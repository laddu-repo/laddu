package nc;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f9639a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9640b;

    /* renamed from: c, reason: collision with root package name */
    public final e f9641c;

    /* renamed from: d, reason: collision with root package name */
    public final e f9642d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public k(Executor executor, e eVar, e eVar2) {
        this.f9640b = executor;
        this.f9641c = eVar;
        this.f9642d = eVar2;
    }

    public final void a(mc.j jVar) {
        synchronized (this.f9639a) {
            this.f9639a.add(jVar);
        }
    }
}
