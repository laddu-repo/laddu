package j1;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements androidx.lifecycle.r0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f6942x;

    public p(r rVar) {
        this.f6942x = rVar;
    }

    @Override // androidx.lifecycle.r0
    public final void a(Object obj) {
        if (((androidx.lifecycle.f0) obj) != null) {
            r rVar = this.f6942x;
            if (rVar.G0) {
                View G = rVar.G();
                if (G.getParent() == null) {
                    if (rVar.K0 != null) {
                        if (p0.L(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + rVar.K0);
                        }
                        rVar.K0.setContentView(G);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
