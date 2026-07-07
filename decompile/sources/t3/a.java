package t3;

import java.math.BigInteger;
import y2.a0;
import y2.y;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f12567a;

    public a(b bVar) {
        this.f12567a = bVar;
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        b bVar = this.f12567a;
        long j10 = bVar.f12569y;
        BigInteger valueOf = BigInteger.valueOf((bVar.A.f12599i * j) / 1000000);
        long j11 = bVar.f12570z;
        a0 a0Var = new a0(j, u1.a0.j((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.C)).longValue() + j10) - 30000, bVar.f12569y, j11 - 1));
        return new y(a0Var, a0Var);
    }

    @Override // y2.z
    public final long m() {
        return (this.f12567a.C * 1000000) / r0.A.f12599i;
    }
}
