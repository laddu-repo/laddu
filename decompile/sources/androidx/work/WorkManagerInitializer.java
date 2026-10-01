package androidx.work;

import java.util.Collections;
import java.util.List;
import k5.b;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1178a = o.h("WrkMgrInitializer");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r2 = r7.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (w5.l.f14109k != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        w5.l.f14109k = new w5.l(r2, r1, new androidx.lifecycle.j1(r1.f13298b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        w5.l.j = w5.l.f14109k;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [ob.a, java.lang.Object] */
    @Override // k5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object create(android.content.Context r7) {
        /*
            r6 = this;
            v5.o r0 = v5.o.f()
            java.lang.String r1 = androidx.work.WorkManagerInitializer.f1178a
            java.lang.String r2 = "Initializing WorkManager with default configuration."
            r3 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r0.b(r1, r2, r3)
            ob.a r0 = new ob.a
            r0.<init>()
            v5.b r1 = new v5.b
            r1.<init>(r0)
            java.lang.Object r0 = w5.l.f14110l
            monitor-enter(r0)
            w5.l r2 = w5.l.j     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            w5.l r3 = w5.l.f14109k     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L24
            goto L2e
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r7     // Catch: java.lang.Throwable -> L2c
        L2c:
            r7 = move-exception
            goto L50
        L2e:
            if (r2 != 0) goto L4a
            android.content.Context r2 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L2c
            w5.l r3 = w5.l.f14109k     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L46
            w5.l r3 = new w5.l     // Catch: java.lang.Throwable -> L2c
            androidx.lifecycle.j1 r4 = new androidx.lifecycle.j1     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ExecutorService r5 = r1.f13298b     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L2c
            w5.l.f14109k = r3     // Catch: java.lang.Throwable -> L2c
        L46:
            w5.l r1 = w5.l.f14109k     // Catch: java.lang.Throwable -> L2c
            w5.l.j = r1     // Catch: java.lang.Throwable -> L2c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            w5.l r7 = w5.l.c(r7)
            return r7
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkManagerInitializer.create(android.content.Context):java.lang.Object");
    }

    @Override // k5.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
