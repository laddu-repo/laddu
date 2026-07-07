package e8;

import android.content.Context;
import android.net.ConnectivityManager;
import f8.e;
import f8.g;
import f8.h;
import f8.i;
import f8.j;
import f8.k;
import f8.l;
import f8.n;
import f8.o;
import f8.q;
import f8.r;
import f8.s;
import f8.v;
import h8.f;
import java.net.MalformedURLException;
import java.net.URL;
import wb.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final w4.c f4471a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f4472b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4473c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f4474d;

    /* renamed from: e, reason: collision with root package name */
    public final p8.a f4475e;

    /* renamed from: f, reason: collision with root package name */
    public final p8.a f4476f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4477g;

    public c(Context context, p8.a aVar, p8.a aVar2) {
        d dVar = new d();
        f8.c cVar = f8.c.f5089a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f8.f fVar = f8.f.f5102a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        f8.d dVar2 = f8.d.f5091a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        f8.b bVar = f8.b.f5077a;
        dVar.a(f8.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f5094a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f5110a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f14269d = true;
        this.f4471a = new w4.c(dVar);
        this.f4473c = context;
        this.f4472b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4474d = b(a.f4462c);
        this.f4475e = aVar2;
        this.f4476f = aVar;
        this.f4477g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(r4.a.k("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((f8.t) f8.t.f5144x.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g8.h a(g8.h r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.c.a(g8.h):g8.h");
    }
}
