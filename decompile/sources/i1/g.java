package i1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f6342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f6345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6346e;
    public double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f6347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f6348h;
    public double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f6349j;

    public g() {
        this.f6342a = Math.sqrt(1500.0d);
        this.f6343b = 0.5d;
        this.f6344c = false;
        this.i = Double.MAX_VALUE;
        this.f6349j = new e();
    }

    public final e a(double d10, double d11, long j8) {
        double dSin;
        double dCos;
        if (!this.f6344c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f6343b;
            if (d12 > 1.0d) {
                double d13 = this.f6342a;
                this.f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f6343b;
                double d15 = this.f6342a;
                this.f6347g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f6348h = Math.sqrt(1.0d - (d12 * d12)) * this.f6342a;
            }
            this.f6344c = true;
        }
        double d16 = j8 / 1000.0d;
        double d17 = d10 - this.i;
        double d18 = this.f6343b;
        if (d18 > 1.0d) {
            double d19 = this.f6347g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f6347g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f6342a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f6342a) * d16) * d26;
            double d27 = -this.f6342a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.f6348h;
            double d29 = this.f6342a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.f6348h * d16) * d30) + (Math.cos(this.f6348h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f6342a;
            double d32 = this.f6343b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f6348h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f6348h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        float f = (float) (dSin + this.i);
        e eVar = this.f6349j;
        eVar.f6324a = f;
        eVar.f6325b = (float) dCos;
        return eVar;
    }

    public g(float f) {
        this.f6342a = Math.sqrt(1500.0d);
        this.f6343b = 0.5d;
        this.f6344c = false;
        this.f6349j = new e();
        this.i = f;
    }
}
