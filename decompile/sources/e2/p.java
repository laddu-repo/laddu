package e2;

import androidx.lifecycle.j1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends n {
    public final j1 j;

    /* renamed from: k, reason: collision with root package name */
    public final j1 f4266k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4267l;

    public p(j jVar, long j, long j10, long j11, long j12, long j13, List list, long j14, j1 j1Var, j1 j1Var2, long j15, long j16) {
        super(jVar, j, j10, j11, j13, list, j14, j15, j16);
        this.j = j1Var;
        this.f4266k = j1Var2;
        this.f4267l = j12;
    }

    @Override // e2.s
    public final j a(m mVar) {
        j1 j1Var = this.j;
        if (j1Var != null) {
            r1.q qVar = mVar.f4257x;
            return new j(j1Var.h(qVar.f11658a, 0L, qVar.j, 0L), 0L, -1L);
        }
        return this.f4272a;
    }

    @Override // e2.n
    public final long d(long j) {
        if (this.f4262f != null) {
            return r0.size();
        }
        long j10 = this.f4267l;
        if (j10 != -1) {
            return (j10 - this.f4260d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f4273b));
        BigInteger multiply2 = BigInteger.valueOf(this.f4261e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i6 = fb.a.f5153a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // e2.n
    public final j h(k kVar, long j) {
        long j10;
        long j11 = this.f4260d;
        List list = this.f4262f;
        if (list != null) {
            j10 = ((q) list.get((int) (j - j11))).f4268a;
        } else {
            j10 = (j - j11) * this.f4261e;
        }
        long j12 = j10;
        r1.q qVar = kVar.f4257x;
        return new j(this.f4266k.h(qVar.f11658a, j, qVar.j, j12), 0L, -1L);
    }
}
