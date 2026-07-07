package k8;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f7454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7456d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f7457e = null;

    public /* synthetic */ e0(String str, Object obj, w wVar) {
        this.f7453a = str;
        this.f7455c = obj;
        this.f7454b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7456d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L7
            return r4
        L7:
            oa.b r4 = k8.e2.f7471n
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f7455c
            return r4
        Le:
            java.lang.Object r4 = k8.e0.f
            monitor-enter(r4)
            boolean r0 = oa.b.r()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f7457e     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f7455c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L64
        L20:
            java.lang.Object r0 = r3.f7457e     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = k8.f0.f7479a     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            k8.e0 r0 = (k8.e0) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = oa.b.r()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            k8.w r2 = r0.f7454b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.a()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = k8.e0.f     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.f7457e = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
            k8.w r4 = r3.f7454b
            if (r4 != 0) goto L5f
        L5c:
            java.lang.Object r4 = r3.f7455c
            goto L63
        L5f:
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
        L63:
            return r4
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L66:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.e0.a(java.lang.Object):java.lang.Object");
    }
}
