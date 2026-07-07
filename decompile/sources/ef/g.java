package ef;

import u1.t;
import y2.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4580a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4581b;

    public /* synthetic */ g(int i6, long j, boolean z10) {
        this.f4580a = i6;
        this.f4581b = j;
    }

    public static g b(p pVar, t tVar) {
        pVar.C(tVar.f12811a, 0, 8);
        tVar.K(0);
        return new g(tVar.k(), tVar.p(), false);
    }

    public boolean a() {
        int i6 = this.f4580a;
        if (i6 == 0 || i6 == 1) {
            return true;
        }
        return false;
    }

    @Override // ef.h
    public d toInstant() {
        d dVar = d.f4573z;
        d dVar2 = d.f4573z;
        long j = dVar2.f4574x;
        long j10 = this.f4581b;
        if (j10 >= j) {
            d dVar3 = d.A;
            if (j10 <= dVar3.f4574x) {
                long j11 = this.f4580a;
                long j12 = j11 / 1000000000;
                if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
                    j12--;
                }
                long j13 = j10 + j12;
                if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                    if (j10 <= 0) {
                        return dVar2;
                    }
                    return dVar3;
                }
                if (j13 >= -31557014167219200L) {
                    if (j13 <= 31556889864403199L) {
                        long j14 = j11 % 1000000000;
                        return new d(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
                    }
                    return dVar3;
                }
                return dVar2;
            }
        }
        throw new e("The parsed date is outside the range representable by Instant (Unix epoch second " + j10 + ')');
    }

    public g(int i6, long j) {
        u1.c.b(j >= 0);
        this.f4580a = i6;
        this.f4581b = j;
    }

    public g(long j, int i6) {
        this.f4581b = j;
        this.f4580a = i6;
    }
}
