package d;

import android.util.Log;
import java.util.List;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.d0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3435x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3436y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3437z;

    public /* synthetic */ g(int i6, Object obj, Object obj2) {
        this.f3435x = i6;
        this.f3436y = obj;
        this.f3437z = obj2;
    }

    @Override // androidx.lifecycle.d0
    public final void onStateChanged(androidx.lifecycle.f0 f0Var, androidx.lifecycle.w wVar) {
        switch (this.f3435x) {
            case 0:
                n0 n0Var = (n0) this.f3436y;
                q qVar = (q) this.f3437z;
                if (wVar == androidx.lifecycle.w.ON_CREATE) {
                    n0Var.f3466e = k.a(qVar);
                    n0Var.e(n0Var.f3468g);
                    return;
                }
                return;
            case 1:
                n4.f fVar = (n4.f) this.f3436y;
                l4.h hVar = (l4.h) this.f3437z;
                if (wVar == androidx.lifecycle.w.ON_RESUME && ((List) ((f1) fVar.b().f8152e.f8014x).getValue()).contains(hVar)) {
                    if (n4.f.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar + " due to fragment " + f0Var + " view lifecycle reaching RESUMED");
                    }
                    fVar.b().c(hVar);
                }
                if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    if (n4.f.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar + " due to fragment " + f0Var + " view lifecycle reaching DESTROYED");
                    }
                    fVar.b().c(hVar);
                    return;
                }
                return;
            default:
                t0.m mVar = (t0.m) this.f3436y;
                t0.n nVar = (t0.n) this.f3437z;
                mVar.getClass();
                if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    mVar.b(nVar);
                    return;
                }
                return;
        }
    }
}
