package cc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2024x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f2025y;

    public /* synthetic */ c(d dVar, int i6) {
        this.f2024x = i6;
        this.f2025y = dVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f2024x
            switch(r0) {
                case 0: goto L90;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            cc.d r0 = r7.f2025y
            r0.b()
            return
        Lb:
            cc.d r0 = r7.f2025y
            java.lang.Object r1 = cc.d.f2026m
            monitor-enter(r1)
            jb.g r2 = r0.f2027a     // Catch: java.lang.Throwable -> L27
            r2.a()     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = r2.f7331a     // Catch: java.lang.Throwable -> L27
            j4.b0 r2 = j4.b0.f(r2)     // Catch: java.lang.Throwable -> L27
            j4.b0 r3 = r0.f2029c     // Catch: java.lang.Throwable -> L87
            dc.b r3 = r3.A()     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L2a
            r2.C()     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            goto L8e
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            int r1 = r3.f4074b     // Catch: cc.f -> L4b
            r2 = 0
            r4 = 5
            r5 = 1
            if (r1 != r4) goto L34
            r6 = 1
            goto L35
        L34:
            r6 = 0
        L35:
            if (r6 != 0) goto L4d
            r6 = 3
            if (r1 != r6) goto L3b
            r2 = 1
        L3b:
            if (r2 == 0) goto L3e
            goto L4d
        L3e:
            cc.k r1 = r0.f2030d     // Catch: cc.f -> L4b
            boolean r1 = r1.a(r3)     // Catch: cc.f -> L4b
            if (r1 == 0) goto L86
            dc.b r1 = r0.c(r3)     // Catch: cc.f -> L4b
            goto L51
        L4b:
            r1 = move-exception
            goto L83
        L4d:
            dc.b r1 = r0.i(r3)     // Catch: cc.f -> L4b
        L51:
            r0.f(r1)
            r0.m(r3, r1)
            int r2 = r1.f4074b
            r3 = 4
            if (r2 != r3) goto L61
            java.lang.String r2 = r1.f4073a
            r0.l(r2)
        L61:
            int r2 = r1.f4074b
            if (r2 != r4) goto L6e
            cc.f r1 = new cc.f
            r1.<init>()
            r0.j(r1)
            goto L86
        L6e:
            r3 = 2
            if (r2 == r3) goto L78
            if (r2 != r5) goto L74
            goto L78
        L74:
            r0.k(r1)
            goto L86
        L78:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.j(r1)
            goto L86
        L83:
            r0.j(r1)
        L86:
            return
        L87:
            r0 = move-exception
            if (r2 == 0) goto L8d
            r2.C()     // Catch: java.lang.Throwable -> L27
        L8d:
            throw r0     // Catch: java.lang.Throwable -> L27
        L8e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r0
        L90:
            cc.d r0 = r7.f2025y
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.c.run():void");
    }
}
