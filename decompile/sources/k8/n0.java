package k8;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends h0 {
    public int A;
    public String B;
    public String C;
    public long D;
    public final long E;
    public final long F;
    public List G;
    public String H;
    public final String I;
    public int J;
    public String K;
    public String L;
    public long M;
    public String N;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7639y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f7640z;

    public n0(p1 p1Var, long j8, long j9, String str) {
        super(p1Var);
        this.M = 0L;
        this.N = null;
        this.E = j8;
        this.F = j9;
        this.I = str;
    }

    @Override // k8.h0
    public final boolean G() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.v4 H(java.lang.String r50) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n0.H(java.lang.String):k8.v4");
    }

    public final void I() {
        String str;
        D();
        p1 p1Var = (p1) this.f2053w;
        d1 d1Var = p1Var.f7696z;
        v0 v0Var = p1Var.A;
        p1.j(d1Var);
        if (d1Var.K().i(c2.f7423x)) {
            byte[] bArr = new byte[16];
            t4 t4Var = p1Var.D;
            p1.j(t4Var);
            t4Var.D0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            p1.l(v0Var);
            v0Var.I.a("Analytics Storage consent is not granted");
            str = null;
        }
        p1.l(v0Var);
        v0Var.I.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.L = str;
        p1Var.F.getClass();
        this.M = System.currentTimeMillis();
    }

    public final String J() {
        E();
        t7.y.g(this.f7639y);
        return this.f7639y;
    }

    public final String K() {
        D();
        E();
        t7.y.g(this.K);
        return this.K;
    }
}
