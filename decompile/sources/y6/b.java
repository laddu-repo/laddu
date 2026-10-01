package y6;

import android.content.Context;
import android.net.ConnectivityManager;
import b7.e;
import java.net.MalformedURLException;
import java.net.URL;
import s5.d;
import z6.a0;
import z6.b0;
import z6.c;
import z6.c0;
import z6.d0;
import z6.e0;
import z6.f;
import z6.f0;
import z6.g;
import z6.h;
import z6.i;
import z6.i0;
import z6.j;
import z6.k;
import z6.l;
import z6.m;
import z6.n;
import z6.o;
import z6.p;
import z6.q;
import z6.r;
import z6.s;
import z6.t;
import z6.v;
import z6.w;
import z6.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f14505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f14506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f14507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j7.a f14508e;
    public final j7.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14509g;

    public b(Context context, j7.a aVar, j7.a aVar2) {
        hb.d dVar = new hb.d();
        c cVar = c.f14746a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f14773a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        z6.d dVar2 = z6.d.f14748a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        z6.b bVar = z6.b.f14735a;
        dVar.a(z6.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.f14765a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        z6.e eVar = z6.e.f14751a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        h hVar = h.f14761a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.f14757a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f14782a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.f14754a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f6195d = true;
        this.f14504a = new d(dVar);
        this.f14506c = context;
        this.f14505b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f14507d = b(a.f14499c);
        this.f14508e = aVar2;
        this.f = aVar;
        this.f14509g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(d0.d.k("Invalid url: ", str), e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a7.i a(a7.i r7) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.b.a(a7.i):a7.i");
    }
}
