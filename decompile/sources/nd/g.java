package nd;

import androidx.lifecycle.q1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.l implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9693x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9694y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(he.f fVar, int i6) {
        super(0);
        this.f9693x = i6;
        this.f9694y = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [he.f, java.lang.Object] */
    @Override // ve.a
    public final Object invoke() {
        androidx.lifecycle.s sVar;
        androidx.lifecycle.s sVar2;
        switch (this.f9693x) {
            case 0:
                return ((q1) this.f9694y.getValue()).getViewModelStore();
            case 1:
                q1 q1Var = (q1) this.f9694y.getValue();
                if (q1Var instanceof androidx.lifecycle.s) {
                    sVar = (androidx.lifecycle.s) q1Var;
                } else {
                    sVar = null;
                }
                if (sVar != null) {
                    return sVar.getDefaultViewModelCreationExtras();
                }
                return o1.a.f9847b;
            case 2:
                return ((q1) this.f9694y.getValue()).getViewModelStore();
            default:
                q1 q1Var2 = (q1) this.f9694y.getValue();
                if (q1Var2 instanceof androidx.lifecycle.s) {
                    sVar2 = (androidx.lifecycle.s) q1Var2;
                } else {
                    sVar2 = null;
                }
                if (sVar2 != null) {
                    return sVar2.getDefaultViewModelCreationExtras();
                }
                return o1.a.f9847b;
        }
    }
}
