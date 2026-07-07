package d1;

import ca.g;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f3685a;

    /* renamed from: b, reason: collision with root package name */
    public double f3686b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3687c;

    /* renamed from: d, reason: collision with root package name */
    public double f3688d;

    /* renamed from: e, reason: collision with root package name */
    public double f3689e;

    /* renamed from: f, reason: collision with root package name */
    public double f3690f;

    /* renamed from: g, reason: collision with root package name */
    public double f3691g;

    /* renamed from: h, reason: collision with root package name */
    public double f3692h;

    /* renamed from: i, reason: collision with root package name */
    public double f3693i;
    public final g j;

    /* JADX WARN: Type inference failed for: r0v5, types: [ca.g, java.lang.Object] */
    public f() {
        this.f3685a = Math.sqrt(1500.0d);
        this.f3686b = 0.5d;
        this.f3687c = false;
        this.f3693i = Double.MAX_VALUE;
        this.j = new Object();
    }

    public final void a(float f3) {
        if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f3686b = f3;
            this.f3687c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f3) {
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f3685a = Math.sqrt(f3);
            this.f3687c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final g c(double d10, double d11, long j) {
        double sin;
        double cos;
        if (!this.f3687c) {
            if (this.f3693i != Double.MAX_VALUE) {
                double d12 = this.f3686b;
                if (d12 > 1.0d) {
                    double d13 = this.f3685a;
                    this.f3690f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                    double d14 = this.f3686b;
                    double d15 = this.f3685a;
                    this.f3691g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
                } else if (d12 >= 0.0d && d12 < 1.0d) {
                    this.f3692h = Math.sqrt(1.0d - (d12 * d12)) * this.f3685a;
                }
                this.f3687c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d16 = j / 1000.0d;
        double d17 = d10 - this.f3693i;
        double d18 = this.f3686b;
        if (d18 > 1.0d) {
            double d19 = this.f3691g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f3690f);
            double d21 = d17 - d20;
            sin = (Math.pow(2.718281828459045d, this.f3690f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f3691g;
            double pow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f3690f;
            cos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + pow;
        } else if (d18 == 1.0d) {
            double d24 = this.f3685a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double pow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double pow3 = Math.pow(2.718281828459045d, (-this.f3685a) * d16) * d26;
            double d27 = -this.f3685a;
            cos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (pow3 * d27);
            sin = pow2;
        } else {
            double d28 = 1.0d / this.f3692h;
            double d29 = this.f3685a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            sin = ((Math.sin(this.f3692h * d16) * d30) + (Math.cos(this.f3692h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f3685a;
            double d32 = this.f3686b;
            double d33 = (-d31) * sin * d32;
            double pow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f3692h;
            double sin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f3692h;
            cos = (((Math.cos(d35 * d16) * d30 * d35) + sin2) * pow4) + d33;
        }
        float f3 = (float) (sin + this.f3693i);
        g gVar = this.j;
        gVar.f2001a = f3;
        gVar.f2002b = (float) cos;
        return gVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ca.g, java.lang.Object] */
    public f(float f3) {
        this.f3685a = Math.sqrt(1500.0d);
        this.f3686b = 0.5d;
        this.f3687c = false;
        this.j = new Object();
        this.f3693i = f3;
    }
}
