package ed;

import okhttp3.Interceptor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Interceptor {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (df.m.I(r2, "okhttp", false) != false) goto L11;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r6) {
        /*
            r5 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.k.e(r6, r0)
            okhttp3.Request r0 = r6.request()
            int r1 = com.playfy.tv.App.f3139y
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = r0.header(r1)
            java.lang.String r3 = "toLowerCase(...)"
            if (r2 != 0) goto L22
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r2)
            kotlin.jvm.internal.k.d(r2, r3)
            java.lang.String r2 = r0.header(r2)
        L22:
            if (r2 == 0) goto L3d
            int r4 = r2.length()
            if (r4 != 0) goto L2b
            goto L3d
        L2b:
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            kotlin.jvm.internal.k.d(r2, r3)
            java.lang.String r3 = "okhttp"
            r4 = 0
            boolean r2 = df.m.I(r2, r3, r4)
            if (r2 == 0) goto L53
        L3d:
            okhttp3.Request$Builder r0 = r0.newBuilder()
            mc.d r2 = c9.a.g()
            java.lang.String r3 = "userAgent"
            java.lang.String r2 = r2.d(r3)
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
        L53:
            okhttp3.Response r6 = r6.proceed(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
