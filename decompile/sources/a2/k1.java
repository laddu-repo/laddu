package a2;

import android.util.Pair;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ q2.u A;
    public final /* synthetic */ n2.g B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f296x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o1 f297y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Pair f298z;

    public /* synthetic */ k1(o1 o1Var, Pair pair, q2.u uVar, n2.g gVar, int i6) {
        this.f296x = i6;
        this.f297y = o1Var;
        this.f298z = pair;
        this.A = uVar;
        this.B = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f296x) {
            case 0:
                b2.f fVar = (b2.f) this.f297y.f359y.f385i;
                Pair pair = this.f298z;
                fVar.L(((Integer) pair.first).intValue(), (q2.c0) pair.second, this.A, this.B);
                return;
            default:
                b2.f fVar2 = (b2.f) this.f297y.f359y.f385i;
                Pair pair2 = this.f298z;
                fVar2.v(((Integer) pair2.first).intValue(), (q2.c0) pair2.second, this.A, this.B);
                return;
        }
    }
}
