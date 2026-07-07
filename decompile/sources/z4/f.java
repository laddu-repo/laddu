package z4;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements b {
    public final AtomicBoolean A;
    public final long B;

    /* renamed from: x, reason: collision with root package name */
    public final k f15173x;

    /* renamed from: y, reason: collision with root package name */
    public final k f15174y;

    /* renamed from: z, reason: collision with root package name */
    public final ThreadLocal f15175z;

    public f(s8.l lVar) {
        this.f15175z = new ThreadLocal();
        this.A = new AtomicBoolean(false);
        int i6 = ef.a.A;
        this.B = ef.f.o(30, ef.c.SECONDS);
        k kVar = new k(1, new androidx.lifecycle.i(lVar, 26));
        this.f15173x = kVar;
        this.f15174y = kVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(10:5|6|7|(1:(1:(3:(1:(8:13|14|15|16|17|18|(3:20|(2:24|25)|22)|28)(2:55|56))(4:57|58|59|60)|34|35)(2:87|88))(2:89|90))(2:91|(5:93|(2:95|(1:97)(1:98))|(1:(2:105|(2:107|(1:111))(2:112|(1:114)))(2:103|104))(8:115|(1:117)(1:131)|118|119|120|121|122|(1:124))|109|110)(2:132|133))|61|62|(1:81)(1:65)|66|67|(4:69|70|71|(1:74)(5:73|17|18|(0)|28))(3:76|77|78)))|134|6|7|(0)(0)|61|62|(0)|81|66|67|(0)(0)|(2:(0)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b7, code lost:
    
        r2 = r0;
        r5 = r6;
        r3 = r14;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bc, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a0 A[Catch: all -> 0x01b5, TRY_LEAVE, TryCatch #4 {all -> 0x01b5, blocks: (B:18:0x019a, B:20:0x01a0, B:25:0x01ab, B:22:0x01ae), top: B:17:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161 A[Catch: all -> 0x01bb, TRY_LEAVE, TryCatch #8 {all -> 0x01bb, blocks: (B:62:0x0138, B:66:0x0156, B:69:0x0161), top: B:61:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r14v0, types: [z4.d] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Throwable, le.h] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Throwable, le.h] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    @Override // z4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(boolean r19, ve.p r20, ne.c r21) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.f.V(boolean, ve.p, ne.c):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.A.compareAndSet(false, true)) {
            this.f15173x.c();
            this.f15174y.c();
        }
    }

    public f(final s8.l lVar, final String fileName, int i6) {
        kotlin.jvm.internal.k.e(fileName, "fileName");
        this.f15175z = new ThreadLocal();
        final int i10 = 0;
        this.A = new AtomicBoolean(false);
        int i11 = ef.a.A;
        this.B = ef.f.o(30, ef.c.SECONDS);
        if (i6 > 0) {
            this.f15173x = new k(i6, new ve.a() { // from class: z4.c
                @Override // ve.a
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            g5.a k8 = lVar.k(fileName);
                            a8.d.d(k8, "PRAGMA query_only = 1");
                            return k8;
                        default:
                            return lVar.k(fileName);
                    }
                }
            });
            final int i12 = 1;
            this.f15174y = new k(1, new ve.a() { // from class: z4.c
                @Override // ve.a
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            g5.a k8 = lVar.k(fileName);
                            a8.d.d(k8, "PRAGMA query_only = 1");
                            return k8;
                        default:
                            return lVar.k(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
