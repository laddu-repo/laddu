package gf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class m1 extends t1 implements r {

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5688z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j1 j1Var) {
        super(true);
        o oVar;
        o oVar2;
        boolean z10 = true;
        H(j1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t1.f5713y;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar instanceof o) {
            oVar = (o) nVar;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            t1 j = oVar.j();
            while (!j.B()) {
                n nVar2 = (n) atomicReferenceFieldUpdater.get(j);
                if (nVar2 instanceof o) {
                    oVar2 = (o) nVar2;
                } else {
                    oVar2 = null;
                }
                if (oVar2 != null) {
                    j = oVar2.j();
                }
            }
            this.f5688z = z10;
        }
        z10 = false;
        this.f5688z = z10;
    }

    @Override // gf.t1
    public final boolean B() {
        return this.f5688z;
    }

    @Override // gf.t1
    public final boolean C() {
        return true;
    }
}
