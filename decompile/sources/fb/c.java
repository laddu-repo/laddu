package fb;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5155a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        if (k6.e.e(d10)) {
            if (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(k6.e.d(d10)) <= Math.getExponent(d10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(double d10) {
        if (d10 > 0.0d && k6.e.e(d10)) {
            long d11 = k6.e.d(d10);
            if ((d11 & (d11 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(double r7) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            r3 = 0
            r4 = 1
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L12
            boolean r1 = k6.e.e(r7)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            java.lang.String r2 = "x must be positive and finite"
            jb.b.d(r2, r1)
            int r1 = java.lang.Math.getExponent(r7)
            int r2 = java.lang.Math.getExponent(r7)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r2 < r5) goto L7b
            int[] r2 = fb.b.f5154a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            switch(r0) {
                case 1: goto L69;
                case 2: goto L6f;
                case 3: goto L62;
                case 4: goto L5a;
                case 5: goto L50;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L35;
                default: goto L2f;
            }
        L2f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L35:
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            r5 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r7 = r7 & r5
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r7 = r7 | r5
            double r7 = java.lang.Double.longBitsToDouble(r7)
            double r7 = r7 * r7
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6f
            r3 = 1
            goto L6f
        L50:
            if (r1 < 0) goto L53
            r3 = 1
        L53:
            boolean r7 = b(r7)
        L57:
            r7 = r7 ^ r4
            r3 = r3 & r7
            goto L6f
        L5a:
            if (r1 >= 0) goto L5d
            r3 = 1
        L5d:
            boolean r7 = b(r7)
            goto L57
        L62:
            boolean r7 = b(r7)
            r3 = r7 ^ 1
            goto L6f
        L69:
            boolean r7 = b(r7)
            if (r7 == 0) goto L73
        L6f:
            if (r3 == 0) goto L72
            int r1 = r1 + r4
        L72:
            return r1
        L73:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "mode was UNNECESSARY, but rounding was necessary"
            r7.<init>(r8)
            throw r7
        L7b:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r7 = r7 * r0
            int r7 = c(r7)
            int r7 = r7 + (-52)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.c.c(double):int");
    }
}
