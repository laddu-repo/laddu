package od;

import java.io.Closeable;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends ne.j implements ve.p {
    public final /* synthetic */ i0 A;
    public final /* synthetic */ Map B;

    /* renamed from: x, reason: collision with root package name */
    public Closeable f10088x;

    /* renamed from: y, reason: collision with root package name */
    public int f10089y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10090z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Map map, le.c cVar) {
        super(2, cVar);
        this.A = i0Var;
        this.B = map;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        h0 h0Var = new h0(this.A, this.B, cVar);
        h0Var.f10090z = obj;
        return h0Var;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r11 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r11 == r8) goto L22;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, int] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f10090z
            gf.c0 r0 = (gf.c0) r0
            int r1 = r10.f10089y
            od.i0 r4 = r10.A
            r2 = 2
            r3 = 1
            r6 = 0
            me.a r8 = me.a.f8833x
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.io.Closeable r1 = r10.f10088x
            he.a.f(r11)     // Catch: java.lang.Throwable -> L19
            goto L84
        L19:
            r0 = move-exception
            r11 = r0
            goto L92
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            he.a.f(r11)
            goto L56
        L29:
            he.a.f(r11)
            java.lang.String r11 = r4.f10098d
            od.e0 r1 = new od.e0
            r1.<init>(r3)
            w7.b r5 = new w7.b
            of.d r7 = gf.o0.f5694b
            gf.c2 r9 = gf.f0.e()
            le.h r7 = r7.plus(r9)
            od.z r9 = new od.z
            r9.<init>(r11, r1, r6, r2)
            gf.j0 r11 = gf.f0.g(r0, r7, r9, r2)
            r5.<init>(r11)
            r10.f10090z = r6
            r10.f10089y = r3
            java.lang.Object r11 = r5.a0(r10)
            if (r11 != r8) goto L56
            goto L83
        L56:
            r1 = r11
            java.io.Closeable r1 = (java.io.Closeable) r1
            java.util.Map r5 = r10.B
            r11 = r1
            okhttp3.Response r11 = (okhttp3.Response) r11     // Catch: java.lang.Throwable -> L19
            okhttp3.ResponseBody r11 = r11.body()     // Catch: java.lang.Throwable -> L19
            if (r11 == 0) goto L8a
            java.io.InputStream r11 = r11.byteStream()     // Catch: java.lang.Throwable -> L19
            r10.f10090z = r6     // Catch: java.lang.Throwable -> L19
            r10.f10088x = r1     // Catch: java.lang.Throwable -> L19
            r10.f10089y = r2     // Catch: java.lang.Throwable -> L19
            df.k r0 = od.i0.f10094l     // Catch: java.lang.Throwable -> L19
            of.e r0 = gf.o0.f5693a     // Catch: java.lang.Throwable -> L19
            gf.y r0 = r0.i0(r3)     // Catch: java.lang.Throwable -> L19
            kf.n r2 = new kf.n     // Catch: java.lang.Throwable -> L19
            r7 = 4
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r11 = gf.f0.J(r0, r2, r10)     // Catch: java.lang.Throwable -> L19
            if (r11 != r8) goto L84
        L83:
            return r8
        L84:
            od.d0 r11 = (od.d0) r11     // Catch: java.lang.Throwable -> L19
            jb.b.j(r1, r6)
            return r11
        L8a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "Playlist response body is empty"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L19
            throw r11     // Catch: java.lang.Throwable -> L19
        L92:
            throw r11     // Catch: java.lang.Throwable -> L93
        L93:
            r0 = move-exception
            jb.b.j(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
