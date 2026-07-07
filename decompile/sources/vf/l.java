package vf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements t {
    public long A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f13622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f13623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o f13624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13626z;

    public l(e eVar) {
        this.f13622v = eVar;
        c cVarF = eVar.F();
        this.f13623w = cVarF;
        o oVar = cVarF.f13602v;
        this.f13624x = oVar;
        this.f13625y = oVar != null ? oVar.f13634b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r9 == r0.f13634b) goto L13;
     */
    @Override // vf.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long V(long r9, vf.c r11) {
        /*
            r8 = this;
            java.lang.String r9 = "sink"
            de.i.e(r11, r9)
            boolean r9 = r8.f13626z
            if (r9 != 0) goto L5c
            vf.o r9 = r8.f13624x
            vf.c r10 = r8.f13623w
            if (r9 == 0) goto L25
            vf.o r0 = r10.f13602v
            if (r9 != r0) goto L1d
            int r9 = r8.f13625y
            de.i.b(r0)
            int r0 = r0.f13634b
            if (r9 != r0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L25:
            long r0 = r8.A
            r2 = 1
            long r0 = r0 + r2
            vf.e r9 = r8.f13622v
            boolean r9 = r9.u(r0)
            if (r9 != 0) goto L35
            r9 = -1
            return r9
        L35:
            vf.o r9 = r8.f13624x
            if (r9 != 0) goto L43
            vf.o r9 = r10.f13602v
            if (r9 == 0) goto L43
            r8.f13624x = r9
            int r9 = r9.f13634b
            r8.f13625y = r9
        L43:
            long r9 = r10.f13603w
            long r0 = r8.A
            long r9 = r9 - r0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r6 = java.lang.Math.min(r0, r9)
            vf.c r2 = r8.f13623w
            long r4 = r8.A
            r3 = r11
            r2.i(r3, r4, r6)
            long r9 = r8.A
            long r9 = r9 + r6
            r8.A = r9
            return r6
        L5c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.l.V(long, vf.c):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13626z = true;
    }

    @Override // vf.t
    public final v g() {
        return this.f13622v.g();
    }
}
