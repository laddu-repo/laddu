package a2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: c, reason: collision with root package name */
    public static final c2 f191c;

    /* renamed from: a, reason: collision with root package name */
    public final long f192a;

    /* renamed from: b, reason: collision with root package name */
    public final long f193b;

    static {
        c2 c2Var = new c2(0L, 0L);
        new c2(Long.MAX_VALUE, Long.MAX_VALUE);
        new c2(Long.MAX_VALUE, 0L);
        new c2(0L, Long.MAX_VALUE);
        f191c = c2Var;
    }

    public c2(long j, long j10) {
        boolean z10;
        if (j >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        u1.c.b(j10 >= 0);
        this.f192a = j;
        this.f193b = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r11, long r13, long r15) {
        /*
            r10 = this;
            long r0 = r10.f193b
            long r2 = r10.f192a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            return r11
        Lf:
            java.lang.String r6 = u1.a0.f12750a
            long r6 = r11 - r2
            long r2 = r2 ^ r11
            long r8 = r11 ^ r6
            long r2 = r2 & r8
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L1d
            r6 = -9223372036854775808
        L1d:
            long r2 = r11 + r0
            long r8 = r11 ^ r2
            long r0 = r0 ^ r2
            long r0 = r0 & r8
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L2c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            r0 = 0
            r1 = 1
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 > 0) goto L38
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 > 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            int r5 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r5 > 0) goto L42
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r5 > 0) goto L42
            r0 = 1
        L42:
            if (r4 == 0) goto L57
            if (r0 == 0) goto L57
            long r0 = r13 - r11
            long r0 = java.lang.Math.abs(r0)
            long r11 = r15 - r11
            long r11 = java.lang.Math.abs(r11)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L5c
            goto L59
        L57:
            if (r4 == 0) goto L5a
        L59:
            return r13
        L5a:
            if (r0 == 0) goto L5d
        L5c:
            return r15
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c2.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c2.class == obj.getClass()) {
            c2 c2Var = (c2) obj;
            if (this.f192a == c2Var.f192a && this.f193b == c2Var.f193b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f192a) * 31) + ((int) this.f193b);
    }
}
