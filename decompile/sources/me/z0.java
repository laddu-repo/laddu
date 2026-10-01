package me;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends re.j implements h0, s0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d1 f8752y;

    @Override // me.s0
    public final boolean a() {
        return true;
    }

    @Override // me.h0
    public final void b() {
        d1 d1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.f8687v;
            Object obj = atomicReferenceFieldUpdater.get(d1VarJ);
            if (obj instanceof z0) {
                if (obj != this) {
                    return;
                }
                i0 i0Var = x.f8749j;
                while (!atomicReferenceFieldUpdater.compareAndSet(d1VarJ, obj, i0Var)) {
                    if (atomicReferenceFieldUpdater.get(d1VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof s0) || ((s0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = re.j.f11385v;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof re.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                de.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                re.j jVar = (re.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = re.j.f11387x;
                re.o oVar = (re.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new re.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.f();
                return;
            }
        }
    }

    @Override // me.s0
    public final e1 d() {
        return null;
    }

    public v0 getParent() {
        return j();
    }

    public final d1 j() {
        d1 d1Var = this.f8752y;
        if (d1Var != null) {
            return d1Var;
        }
        de.i.i("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // re.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + x.g(this) + "[job@" + x.g(j()) + ']';
    }
}
