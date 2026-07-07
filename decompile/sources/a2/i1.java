package a2;

import android.util.Pair;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ n2.g A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f272x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o1 f273y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Pair f274z;

    public /* synthetic */ i1(o1 o1Var, Pair pair, n2.g gVar, int i6) {
        this.f272x = i6;
        this.f273y = o1Var;
        this.f274z = pair;
        this.A = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f272x) {
            case 0:
                b2.f fVar = (b2.f) this.f273y.f359y.f385i;
                Pair pair = this.f274z;
                int intValue = ((Integer) pair.first).intValue();
                q2.c0 c0Var = (q2.c0) pair.second;
                c0Var.getClass();
                fVar.w(intValue, c0Var, this.A);
                return;
            default:
                b2.f fVar2 = (b2.f) this.f273y.f359y.f385i;
                Pair pair2 = this.f274z;
                fVar2.M(((Integer) pair2.first).intValue(), (q2.c0) pair2.second, this.A);
                return;
        }
    }
}
