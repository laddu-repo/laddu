package bg;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 implements l0 {
    public int A;
    public boolean B;
    public long C;

    /* renamed from: x, reason: collision with root package name */
    public final m f1695x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1696y;

    /* renamed from: z, reason: collision with root package name */
    public g0 f1697z;

    public d0(m mVar) {
        int i6;
        this.f1695x = mVar;
        k a10 = mVar.a();
        this.f1696y = a10;
        g0 g0Var = a10.f1725x;
        this.f1697z = g0Var;
        if (g0Var != null) {
            i6 = g0Var.f1711b;
        } else {
            i6 = -1;
        }
        this.A = i6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.f1711b) goto L15;
     */
    @Override // bg.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(bg.k r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.k.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.B
            if (r3 != 0) goto L63
            bg.g0 r3 = r8.f1697z
            bg.k r4 = r8.f1696y
            if (r3 == 0) goto L2b
            bg.g0 r5 = r4.f1725x
            if (r3 != r5) goto L23
            int r3 = r8.A
            kotlin.jvm.internal.k.b(r5)
            int r5 = r5.f1711b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.C
            r2 = 1
            long r0 = r0 + r2
            bg.m r2 = r8.f1695x
            boolean r0 = r2.P(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            bg.g0 r0 = r8.f1697z
            if (r0 != 0) goto L4c
            bg.g0 r0 = r4.f1725x
            if (r0 == 0) goto L4c
            r8.f1697z = r0
            int r0 = r0.f1711b
            r8.A = r0
        L4c:
            long r0 = r4.f1726y
            long r2 = r8.C
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            bg.k r2 = r8.f1696y
            long r3 = r8.C
            r5 = r9
            r2.m(r3, r5, r6)
            long r9 = r8.C
            long r9 = r9 + r6
            r8.C = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = r4.a.j(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.d0.read(bg.k, long):long");
    }

    @Override // bg.l0
    public final o0 timeout() {
        return this.f1695x.timeout();
    }
}
