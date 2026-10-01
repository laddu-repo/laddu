package gf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 extends mf.b {

    /* renamed from: b, reason: collision with root package name */
    public final o1 f5705b;

    /* renamed from: c, reason: collision with root package name */
    public v1 f5706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f5707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f5708e;

    public s1(o1 o1Var, t1 t1Var, d1 d1Var) {
        this.f5707d = t1Var;
        this.f5708e = d1Var;
        this.f5705b = o1Var;
    }

    @Override // mf.b
    public final void b(Object obj, Object obj2) {
        boolean z10;
        mf.k kVar;
        mf.k kVar2 = (mf.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mf.k kVar3 = this.f5705b;
        if (z10) {
            kVar = kVar3;
        } else {
            kVar = this.f5706c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf.k.f8863x;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z10) {
                mf.k kVar4 = this.f5706c;
                kotlin.jvm.internal.k.b(kVar4);
                kVar3.f(kVar4);
            }
        }
    }

    @Override // mf.b
    public final h5.a c(Object obj) {
        if (this.f5707d.E() == this.f5708e) {
            return null;
        }
        return mf.a.f8846e;
    }
}
