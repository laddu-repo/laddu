package tg;

import b4.h;
import ef.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import qg.c;
import s8.l;
import ua.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final qg.a f12709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12710b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12711c;

    /* renamed from: d, reason: collision with root package name */
    public final c f12712d;

    /* renamed from: e, reason: collision with root package name */
    public final h f12713e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12714f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadLocal f12715g;

    public a(qg.a scopeQualifier, String str, c cVar, h hVar, int i6) {
        boolean z10;
        if ((i6 & 4) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        cVar = (i6 & 8) != 0 ? null : cVar;
        k.e(scopeQualifier, "scopeQualifier");
        this.f12709a = scopeQualifier;
        this.f12710b = str;
        this.f12711c = z10;
        this.f12712d = cVar;
        this.f12713e = hVar;
        this.f12714f = new ArrayList();
        new LinkedHashSet();
    }

    public final Object a(e eVar, pg.a aVar) {
        String n10;
        f fVar = (f) this.f12713e.f1471z;
        fVar.getClass();
        if (mg.a.B.compareTo(mg.a.f8887x) <= 0) {
            if (this.f12711c) {
                n10 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                n10 = r4.a.n(new StringBuilder(" - scope:'"), this.f12710b, '\'');
            }
            String msg = "|- '" + ug.a.a(eVar) + '\'' + HttpUrl.FRAGMENT_ENCODE_SET + n10 + "...";
            fVar.getClass();
            k.e(msg, "msg");
            long b10 = i.b();
            Object c10 = c(eVar, aVar);
            long a10 = ef.k.a(b10);
            StringBuilder sb2 = new StringBuilder("|- '");
            sb2.append(ug.a.a(eVar));
            sb2.append("' in ");
            int i6 = ef.a.A;
            sb2.append(ef.a.h(a10, ef.c.MICROSECONDS) / 1000.0d);
            sb2.append(" ms");
            String msg2 = sb2.toString();
            fVar.getClass();
            k.e(msg2, "msg");
            return c10;
        }
        return c(eVar, aVar);
    }

    public final Object b(h hVar) {
        l lVar = (l) this.f12713e.A;
        lVar.getClass();
        Object x10 = lVar.x(this, hVar, true);
        if (x10 != null) {
            return x10;
        }
        String msg = "No definition found for type '" + ug.a.a((e) hVar.B) + '\'' + HttpUrl.FRAGMENT_ENCODE_SET + ". Check your Modules configuration and add missing type and/or qualifier!";
        k.e(msg, "msg");
        throw new Exception(msg);
    }

    public final Object c(e eVar, pg.a aVar) {
        ie.h hVar;
        f fVar = (f) this.f12713e.f1471z;
        h hVar2 = new h(fVar, this, eVar, aVar);
        if (aVar == null) {
            return b(hVar2);
        }
        fVar.getClass();
        if (mg.a.B.compareTo(mg.a.f8887x) <= 0) {
            String msg = "| >> parameters " + aVar;
            k.e(msg, "msg");
        }
        ThreadLocal threadLocal = this.f12715g;
        if (threadLocal == null || (hVar = (ie.h) threadLocal.get()) == null) {
            hVar = new ie.h();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.f12715g = threadLocal2;
            threadLocal2.set(hVar);
        }
        hVar.addFirst(aVar);
        try {
            return b(hVar2);
        } finally {
            fVar.r("| << parameters");
            if (!hVar.isEmpty()) {
                hVar.removeFirst();
            }
            if (hVar.isEmpty()) {
                ThreadLocal threadLocal3 = this.f12715g;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.f12715g = null;
            }
        }
    }

    public final String toString() {
        return r4.a.o(new StringBuilder("['"), this.f12710b, "']");
    }
}
