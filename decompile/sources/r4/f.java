package r4;

import ac.g0;
import androidx.media3.decoder.DecoderInputBuffer;
import k8.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b {
    public final long A;
    public final int B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f11183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f11184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f11185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ThreadLocal f11186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f11187z;

    public f(ob.d dVar) {
        this.f11185x = new b0(23);
        this.f11186y = new ThreadLocal();
        int i = le.a.f8338y;
        this.A = com.bumptech.glide.f.S(30, le.c.SECONDS);
        this.B = 2;
        s sVar = new s(1, new g0(11, dVar));
        this.f11183v = sVar;
        this.f11184w = sVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f11187z) {
            return;
        }
        this.f11187z = true;
        this.f11183v.c();
        this.f11184w.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151 A[Catch: all -> 0x01ae, TRY_LEAVE, TryCatch #4 {all -> 0x01ae, blocks: (B:64:0x0128, B:69:0x0146, B:71:0x0151, B:86:0x01b2, B:87:0x01b9), top: B:115:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b2 A[Catch: all -> 0x01ae, TRY_ENTER, TryCatch #4 {all -> 0x01ae, blocks: (B:64:0x0128, B:69:0x0146, B:71:0x0151, B:86:0x01b2, B:87:0x01b9), top: B:115:0x0128 }] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1, types: [r4.d] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, r4.s] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r4.s] */
    /* JADX WARN: Type inference failed for: r4v7, types: [r4.s] */
    @Override // r4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(boolean r18, ce.p r19, ud.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.f.w(boolean, ce.p, ud.c):java.lang.Object");
    }

    public f(final ob.d dVar, final String str, int i) {
        de.i.e(str, "fileName");
        this.f11185x = new b0(23);
        this.f11186y = new ThreadLocal();
        int i10 = le.a.f8338y;
        this.A = com.bumptech.glide.f.S(30, le.c.SECONDS);
        this.B = 2;
        if (i > 0) {
            final int i11 = 0;
            this.f11183v = new s(i, new ce.a() { // from class: r4.c
                @Override // ce.a
                public final Object b() {
                    switch (i11) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            v4.a aVarB = dVar.b(str);
                            p4.v.x(aVarB, "PRAGMA query_only = 1");
                            return aVarB;
                        default:
                            return dVar.b(str);
                    }
                }
            });
            final int i12 = 1;
            this.f11184w = new s(1, new ce.a() { // from class: r4.c
                @Override // ce.a
                public final Object b() {
                    switch (i12) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            v4.a aVarB = dVar.b(str);
                            p4.v.x(aVarB, "PRAGMA query_only = 1");
                            return aVarB;
                        default:
                            return dVar.b(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
