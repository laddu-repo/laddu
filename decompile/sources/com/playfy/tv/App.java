package com.playfy.tv;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import bf.y;
import cf.m;
import dg.b;
import gf.f0;
import gf.o0;
import i.b0;
import i.q;
import i4.u0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import lg.c;
import mc.d;
import mf.e;
import nc.j;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;
import okhttp3.internal.cache.DiskLruCache;
import r7.i;
import s9.l;
import s9.n;
import v.a;
import v.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class App extends Application {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f3139y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final e f3140x = f0.b(m.A(f0.e(), o0.f5694b));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [okhttp3.Interceptor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [mc.i, java.lang.Object] */
    @Override // android.app.Application
    public final void onCreate() {
        i iVar;
        if (q.f6256y != 2) {
            q.f6256y = 2;
            synchronized (q.E) {
                try {
                    f fVar = q.D;
                    fVar.getClass();
                    a aVar = new a(fVar);
                    while (aVar.hasNext()) {
                        q qVar = (q) ((WeakReference) aVar.next()).get();
                        if (qVar != null) {
                            ((b0) qVar).k(true, true);
                        }
                    }
                } finally {
                }
            }
        }
        super.onCreate();
        n nVar = c.j().f2849h;
        u0 u0Var = new u0(12);
        nVar.getClass();
        nVar.f12276b.d(new l(s9.i.f12264a, u0Var, new n()));
        nVar.p();
        y.w(new cf.n(this, 3));
        d g10 = c9.a.g();
        g10.f();
        ?? obj = new Object();
        obj.f8812a = j.f9630i;
        obj.a(43200L);
        b.c(g10.f8803c, new b7.d(3, g10, new mc.i(obj)));
        f0.w(this.f3140x, null, new androidx.lifecycle.c(g10, null, 5), 3);
        g10.b(new ed.a(this, g10));
        Context context = p7.a.f10615a;
        String d10 = g10.d("baseUrl");
        if (df.m.S(d10)) {
            d10 = "https://google.com";
        }
        p7.a.f10616b = d10;
        p7.a.f10615a = this;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.followRedirects(true);
        builder.followSslRedirects(true);
        File cacheDir = getCacheDir();
        k.d(cacheDir, "getCacheDir(...)");
        builder.cache(new Cache(cacheDir, 134217728L));
        p7.a.f10622h = new jd.n((xf.c) a8.b.f(this).a(x.a(xf.c.class), null), this);
        builder.addInterceptor(new Object());
        x7.a.a(builder);
        OkHttpClient value = builder.build();
        k.e(value, "value");
        List<Interceptor> interceptors = value.interceptors();
        u7.c cVar = u7.c.f12949a;
        if (!interceptors.contains(cVar)) {
            value = value.newBuilder().addInterceptor(cVar).build();
        }
        p7.a.f10617c = value;
        Cache cache = value.cache();
        if (cache != null) {
            DiskLruCache diskLruCache = OkHttpUtils.diskLruCache(cache);
            k.d(diskLruCache, "diskLruCache(it)");
            iVar = new i(diskLruCache);
        } else {
            iVar = null;
        }
        p7.a.f10618d = iVar;
        l6.e eVar = new l6.e(this);
        eVar.f8231c = new he.d(p7.a.f10617c);
        v6.c a10 = v6.c.a(eVar.f8230b, new z6.a(100), 32751);
        eVar.f8230b = a10;
        v6.c a11 = v6.c.a(a10, null, 24575);
        eVar.f8230b = a11;
        eVar.f8230b = v6.c.a(a11, null, 28671);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            arrayList5.add(new Object());
        } else {
            arrayList5.add(new Object());
        }
        eVar.f8232d = new l6.b(a8.c.p(arrayList), a8.c.p(arrayList2), a8.c.p(arrayList3), a8.c.p(arrayList4), a8.c.p(arrayList5));
        l6.a.b(eVar.a());
    }
}
