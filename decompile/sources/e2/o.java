package e2;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j, j10, j11, j12, list, j13, j14, j15);
        this.j = list2;
    }

    @Override // e2.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // e2.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f4260d));
    }

    @Override // e2.n
    public final boolean i() {
        return true;
    }
}
