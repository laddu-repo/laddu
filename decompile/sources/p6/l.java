package p6;

import android.webkit.MimeTypeMap;
import bg.c0;
import bg.f0;
import bg.q;
import df.u;
import java.io.IOException;
import java.util.Map;
import m6.p;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final CacheControl f10605f = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: g, reason: collision with root package name */
    public static final CacheControl f10606g = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a, reason: collision with root package name */
    public final String f10607a;

    /* renamed from: b, reason: collision with root package name */
    public final o f10608b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10609c;

    /* renamed from: d, reason: collision with root package name */
    public final he.m f10610d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10611e;

    public l(String str, o oVar, he.f fVar, he.m mVar, boolean z10) {
        this.f10607a = str;
        this.f10608b = oVar;
        this.f10609c = fVar;
        this.f10610d = mVar;
        this.f10611e = z10;
    }

    public static String d(String str, MediaType mediaType) {
        String str2;
        String b10;
        if (mediaType != null) {
            str2 = mediaType.toString();
        } else {
            str2 = null;
        }
        if ((str2 == null || u.H(str2, "text/plain", false)) && (b10 = a7.f.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b10;
        }
        if (str2 == null) {
            return null;
        }
        return df.m.h0(str2, ';');
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012e A[Catch: Exception -> 0x00d2, TryCatch #6 {Exception -> 0x00d2, blocks: (B:92:0x0098, B:94:0x00a4, B:97:0x00d6, B:99:0x00da, B:102:0x00f3, B:104:0x013b, B:109:0x0109, B:111:0x0115, B:112:0x011e, B:114:0x00ba, B:116:0x00c4, B:118:0x0126, B:119:0x012d, B:120:0x012e), top: B:90:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ee A[Catch: Exception -> 0x021c, TryCatch #3 {Exception -> 0x021c, blocks: (B:16:0x01e6, B:18:0x01ee, B:21:0x0218, B:25:0x021f, B:26:0x0224), top: B:15:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021f A[Catch: Exception -> 0x021c, TryCatch #3 {Exception -> 0x021c, blocks: (B:16:0x01e6, B:18:0x01ee, B:21:0x0218, B:25:0x021f, B:26:0x0224), top: B:15:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0230 A[Catch: Exception -> 0x0058, TRY_ENTER, TryCatch #4 {Exception -> 0x0058, blocks: (B:43:0x0053, B:44:0x0156, B:46:0x0230, B:47:0x0235), top: B:42:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0098 A[Catch: Exception -> 0x00d2, TRY_ENTER, TryCatch #6 {Exception -> 0x00d2, blocks: (B:92:0x0098, B:94:0x00a4, B:97:0x00d6, B:99:0x00da, B:102:0x00f3, B:104:0x013b, B:109:0x0109, B:111:0x0115, B:112:0x011e, B:114:0x00ba, B:116:0x00c4, B:118:0x0126, B:119:0x012d, B:120:0x012e), top: B:90:0x0096 }] */
    /* JADX WARN: Type inference failed for: r4v14, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [he.f, java.lang.Object] */
    @Override // p6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(le.c r17) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.l.a(le.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [he.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(okhttp3.Request r5, ne.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p6.j
            if (r0 == 0) goto L13
            r0 = r6
            p6.j r0 = (p6.j) r0
            int r1 = r0.f10601z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10601z = r1
            goto L18
        L13:
            p6.j r0 = new p6.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f10599x
            int r1 = r0.f10601z
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r6)
            goto L8c
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r6)
            android.graphics.Bitmap$Config[] r6 = a7.f.f595a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r6 = kotlin.jvm.internal.k.a(r6, r1)
            java.lang.Object r1 = r4.f10609c
            if (r6 == 0) goto L5f
            v6.o r6 = r4.f10608b
            v6.b r6 = r6.f13420o
            boolean r6 = r6.f13341x
            if (r6 != 0) goto L59
            java.lang.Object r6 = r1.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            goto L8f
        L59:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5f:
            java.lang.Object r6 = r1.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.f10601z = r2
            gf.k r6 = new gf.k
            le.c r0 = a8.c.i(r0)
            r6.<init>(r2, r0)
            r6.s()
            a7.g r0 = new a7.g
            r1 = 0
            r0.<init>(r1, r5, r6)
            r5.enqueue(r0)
            r6.u(r0)
            java.lang.Object r6 = r6.r()
            me.a r5 = me.a.f8833x
            if (r6 != r5) goto L8c
            return r5
        L8c:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L8f:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto Lca
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto Lca
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto La6
            a7.f.a(r6)
        La6:
            a2.x0 r6 = new a2.x0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            int r1 = r5.code()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r5 = r5.message()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lca:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.l.b(okhttp3.Request, ne.c):java.lang.Object");
    }

    public final q c() {
        Object value = this.f10610d.getValue();
        kotlin.jvm.internal.k.b(value);
        return ((n6.g) value).f9082a;
    }

    public final Request e() {
        Request.Builder url = new Request.Builder().url(this.f10607a);
        o oVar = this.f10608b;
        Request.Builder headers = url.headers(oVar.j);
        for (Map.Entry entry : oVar.f13416k.f13432a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.k.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class) key, entry.getValue());
        }
        v6.b bVar = oVar.f13419n;
        boolean z10 = bVar.f13341x;
        boolean z11 = oVar.f13420o.f13341x;
        if (!z11 && z10) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (z11 && !z10) {
            if (bVar.f13342y) {
                headers.cacheControl(CacheControl.FORCE_NETWORK);
            } else {
                headers.cacheControl(f10605f);
            }
        } else if (!z11 && !z10) {
            headers.cacheControl(f10606g);
        }
        return headers.build();
    }

    public final u6.b f(k7.a aVar) {
        Throwable th;
        u6.b bVar;
        try {
            q c10 = c();
            n6.b bVar2 = (n6.b) aVar.f7740y;
            if (!bVar2.f9072y) {
                f0 d10 = bg.b.d(c10.l((c0) bVar2.f9071x.f9064c.get(0)));
                try {
                    bVar = new u6.b(d10);
                    try {
                        d10.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        d10.close();
                    } catch (Throwable th4) {
                        he.a.a(th3, th4);
                    }
                    th = th3;
                    bVar = null;
                }
                if (th == null) {
                    return bVar;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    public final p g(k7.a aVar) {
        n6.b bVar = (n6.b) aVar.f7740y;
        if (!bVar.f9072y) {
            c0 c0Var = (c0) bVar.f9071x.f9064c.get(1);
            q c10 = c();
            String str = this.f10608b.f13415i;
            if (str == null) {
                str = this.f10607a;
            }
            return new p(c0Var, c10, str, aVar);
        }
        throw new IllegalStateException("snapshot is closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.a h(k7.a r4, okhttp3.Request r5, okhttp3.Response r6, u6.b r7) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.l.h(k7.a, okhttp3.Request, okhttp3.Response, u6.b):k7.a");
    }
}
