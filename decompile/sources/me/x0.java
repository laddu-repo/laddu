package me;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class x0 extends d1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(v0 v0Var) {
        super(true);
        boolean z2 = true;
        J(v0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.f8688w;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar == null) {
            z2 = false;
            break;
        }
        d1 d1VarJ = lVar.j();
        while (!d1VarJ.C()) {
            k kVar2 = (k) atomicReferenceFieldUpdater.get(d1VarJ);
            l lVar2 = kVar2 instanceof l ? (l) kVar2 : null;
            if (lVar2 == null) {
                z2 = false;
                break;
            }
            d1VarJ = lVar2.j();
        }
        this.f8750x = z2;
    }

    @Override // me.d1
    public final boolean C() {
        return this.f8750x;
    }

    @Override // me.d1
    public final boolean D() {
        return true;
    }
}
