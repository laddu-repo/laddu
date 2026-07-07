package g2;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends r2.b {
    public final List A;
    public final long B;

    public f(long j, List list) {
        super(0L, list.size() - 1);
        this.B = j;
        this.A = list;
    }

    @Override // r2.m
    public final long a() {
        b();
        return this.B + ((h2.j) this.A.get((int) this.f11775z)).B;
    }

    @Override // r2.m
    public final long c() {
        b();
        h2.j jVar = (h2.j) this.A.get((int) this.f11775z);
        return this.B + jVar.B + jVar.f5904z;
    }
}
