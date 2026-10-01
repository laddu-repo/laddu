package yf;

import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends a8.f {

    /* renamed from: c, reason: collision with root package name */
    public final y2.j f15075c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f15076d;

    public k(y2.j jVar, xf.c json) {
        kotlin.jvm.internal.k.e(json, "json");
        this.f15075c = jVar;
        this.f15076d = json.f14727b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // a8.f, vf.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final short A() {
        /*
            r6 = this;
            y2.j r0 = r6.f15075c
            java.lang.String r1 = r0.l()
            r2 = 0
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.k.e(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L32
            he.r r3 = a8.c.r(r1)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r3 == 0) goto L28
            int r3 = r3.f6094x     // Catch: java.lang.IllegalArgumentException -> L32
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r4 <= 0) goto L21
            goto L28
        L21:
            short r3 = (short) r3     // Catch: java.lang.IllegalArgumentException -> L32
            he.w r4 = new he.w     // Catch: java.lang.IllegalArgumentException -> L32
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L29
        L28:
            r4 = r2
        L29:
            if (r4 == 0) goto L2e
            short r0 = r4.f6099x     // Catch: java.lang.IllegalArgumentException -> L32
            return r0
        L2e:
            df.t.v(r1)     // Catch: java.lang.IllegalArgumentException -> L32
            throw r2     // Catch: java.lang.IllegalArgumentException -> L32
        L32:
            java.lang.String r3 = "Failed to parse type 'UShort' for input '"
            r4 = 39
            java.lang.String r1 = w8.k.b(r4, r3, r1)
            r3 = 0
            r4 = 6
            y2.j.q(r0, r1, r3, r2, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.k.A():short");
    }

    @Override // vf.a
    public final int b(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // a8.f, vf.b
    public final int l() {
        y2.j jVar = this.f15075c;
        String l10 = jVar.l();
        try {
            kotlin.jvm.internal.k.e(l10, "<this>");
            he.r r10 = a8.c.r(l10);
            if (r10 != null) {
                return r10.f6094x;
            }
            df.t.v(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            y2.j.q(jVar, w8.k.b('\'', "Failed to parse type 'UInt' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    @Override // vf.a
    public final e0 o() {
        return this.f15076d;
    }

    @Override // a8.f, vf.b
    public final long u() {
        y2.j jVar = this.f15075c;
        String l10 = jVar.l();
        try {
            kotlin.jvm.internal.k.e(l10, "<this>");
            he.t s = a8.c.s(l10);
            if (s != null) {
                return s.f6096x;
            }
            df.t.v(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            y2.j.q(jVar, w8.k.b('\'', "Failed to parse type 'ULong' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // a8.f, vf.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte z() {
        /*
            r6 = this;
            y2.j r0 = r6.f15075c
            java.lang.String r1 = r0.l()
            r2 = 0
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.k.e(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L32
            he.r r3 = a8.c.r(r1)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r3 == 0) goto L28
            int r3 = r3.f6094x     // Catch: java.lang.IllegalArgumentException -> L32
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r4 <= 0) goto L21
            goto L28
        L21:
            byte r3 = (byte) r3     // Catch: java.lang.IllegalArgumentException -> L32
            he.o r4 = new he.o     // Catch: java.lang.IllegalArgumentException -> L32
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L29
        L28:
            r4 = r2
        L29:
            if (r4 == 0) goto L2e
            byte r0 = r4.f6089x     // Catch: java.lang.IllegalArgumentException -> L32
            return r0
        L2e:
            df.t.v(r1)     // Catch: java.lang.IllegalArgumentException -> L32
            throw r2     // Catch: java.lang.IllegalArgumentException -> L32
        L32:
            java.lang.String r3 = "Failed to parse type 'UByte' for input '"
            r4 = 39
            java.lang.String r1 = w8.k.b(r4, r3, r1)
            r3 = 0
            r4 = 6
            y2.j.q(r0, r1, r3, r2, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.k.z():byte");
    }
}
