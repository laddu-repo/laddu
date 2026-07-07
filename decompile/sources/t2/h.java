package t2;

import r1.e1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends o implements Comparable {
    public final int B;
    public final int C;

    public h(int i6, e1 e1Var, int i10, k kVar, int i11) {
        super(i6, e1Var, i10);
        int i12;
        this.B = r4.a.f(i11, kVar.f12536t0) ? 1 : 0;
        r1.q qVar = this.A;
        int i13 = qVar.f11676u;
        int i14 = -1;
        if (i13 != -1 && (i12 = qVar.f11677v) != -1) {
            i14 = i13 * i12;
        }
        this.C = i14;
    }

    @Override // t2.o
    public final int a() {
        return this.B;
    }

    @Override // t2.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.C, ((h) obj).C);
    }
}
