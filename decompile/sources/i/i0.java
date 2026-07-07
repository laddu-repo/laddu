package i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static i0 f6213d;

    /* renamed from: a, reason: collision with root package name */
    public long f6214a;

    /* renamed from: b, reason: collision with root package name */
    public long f6215b;

    /* renamed from: c, reason: collision with root package name */
    public int f6216c;

    public final void a(double d10, double d11, long j) {
        double d12 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((r2 - 9.0E-4f) - r6)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f6216c = 1;
            this.f6214a = -1L;
            this.f6215b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f6216c = 0;
                this.f6214a = -1L;
                this.f6215b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f6214a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f6215b = round;
            if (round < j && this.f6214a > j) {
                this.f6216c = 0;
            } else {
                this.f6216c = 1;
            }
        }
    }
}
