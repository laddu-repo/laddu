package i;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6224x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f6225y;

    public /* synthetic */ l(Context context, int i6) {
        this.f6224x = i6;
        this.f6225y = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f6224x
            switch(r0) {
                case 0: goto L30;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            q.a r0 = new q.a
            r1 = 1
            r0.<init>(r1)
            p.l r1 = u4.b.f12885a
            r2 = 0
            android.content.Context r3 = r11.f6225y
            u4.b.t(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            i.l r0 = new i.l
            r1 = 2
            android.content.Context r2 = r11.f6225y
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb0
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f6225y
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb0
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L89
            v.f r0 = i.q.D
            r0.getClass()
            v.a r2 = new v.a
            r2.<init>(r0)
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            i.q r0 = (i.q) r0
            if (r0 == 0) goto L58
            i.b0 r0 = (i.b0) r0
            android.content.Context r0 = r0.H
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 == 0) goto L8e
            android.os.LocaleList r0 = i.n.a(r0)
            p0.e r2 = new p0.e
            p0.h r6 = new p0.h
            r6.<init>(r0)
            r2.<init>(r6)
            goto L90
        L89:
            p0.e r2 = i.q.f6257z
            if (r2 == 0) goto L8e
            goto L90
        L8e:
            p0.e r2 = p0.e.f10444b
        L90:
            p0.g r0 = r2.f10445a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La9
            java.lang.String r0 = h0.f.e(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto La9
            android.os.LocaleList r0 = i.m.a(r0)
            i.n.b(r2, r0)
        La9:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb0:
            i.q.C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.l.run():void");
    }
}
