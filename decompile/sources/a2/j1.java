package a2;

import android.util.Pair;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f290x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o1 f291y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Pair f292z;

    public /* synthetic */ j1(o1 o1Var, Pair pair, int i6) {
        this.f290x = i6;
        this.f291y = o1Var;
        this.f292z = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f290x) {
            case 0:
                b2.f fVar = (b2.f) this.f291y.f359y.f385i;
                Pair pair = this.f292z;
                fVar.z(((Integer) pair.first).intValue(), (q2.c0) pair.second);
                return;
            case 1:
                b2.f fVar2 = (b2.f) this.f291y.f359y.f385i;
                Pair pair2 = this.f292z;
                fVar2.l(((Integer) pair2.first).intValue(), (q2.c0) pair2.second);
                return;
            default:
                b2.f fVar3 = (b2.f) this.f291y.f359y.f385i;
                Pair pair3 = this.f292z;
                fVar3.n(((Integer) pair3.first).intValue(), (q2.c0) pair3.second);
                return;
        }
    }
}
