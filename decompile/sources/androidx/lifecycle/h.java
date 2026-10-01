package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements d0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f925x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f926y;

    public /* synthetic */ h(Object obj, int i6) {
        this.f925x = i6;
        this.f926y = obj;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(f0 f0Var, w wVar) {
        switch (this.f925x) {
            case 0:
                new HashMap();
                r[] rVarArr = (r[]) this.f926y;
                if (rVarArr.length <= 0) {
                    if (rVarArr.length <= 0) {
                        return;
                    }
                    r rVar = rVarArr[0];
                    throw null;
                }
                r rVar2 = rVarArr[0];
                throw null;
            default:
                if (wVar == w.ON_CREATE) {
                    f0Var.getLifecycle().c(this);
                    ((e1) this.f926y).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + wVar).toString());
                }
        }
    }
}
