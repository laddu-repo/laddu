package n9;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 extends g0 {
    public String A;
    public String B;
    public int C;
    public String D;
    public String E;
    public long F;
    public final long G;
    public final long H;
    public List I;
    public String J;
    public int K;
    public String L;
    public String M;
    public long N;
    public String O;

    public m0(n1 n1Var, long j, long j10) {
        super(n1Var);
        this.N = 0L;
        this.O = null;
        this.G = j;
        this.H = j10;
    }

    @Override // n9.g0
    public final boolean g1() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n9.l4 h1(java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.m0.h1(java.lang.String):n9.l4");
    }

    public final void i1() {
        String format;
        String str;
        d1();
        n1 n1Var = (n1) this.f4301y;
        c1 c1Var = n1Var.B;
        u0 u0Var = n1Var.C;
        n1.e(c1Var);
        if (!c1Var.k1().i(y1.ANALYTICS_STORAGE)) {
            n1.g(u0Var);
            u0Var.K.a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            j4 j4Var = n1Var.F;
            n1.e(j4Var);
            j4Var.b2().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        n1.g(u0Var);
        s0 s0Var = u0Var.K;
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        s0Var.a("Resetting session stitching token to ".concat(str));
        this.M = format;
        n1Var.H.getClass();
        this.N = System.currentTimeMillis();
    }

    public final String j1() {
        e1();
        w8.x.g(this.A);
        return this.A;
    }

    public final String k1() {
        d1();
        e1();
        w8.x.g(this.L);
        return this.L;
    }
}
