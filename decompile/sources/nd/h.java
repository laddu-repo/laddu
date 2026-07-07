package nd;

import androidx.lifecycle.n1;
import androidx.lifecycle.q1;
import com.playfy.tv.ui.fragments.CatsFragment;
import com.playfy.tv.ui.fragments.HighFragment;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.l implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9697x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9698y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ j1.y f9699z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j1.y yVar, he.f fVar, int i6) {
        super(0);
        this.f9697x = i6;
        this.f9699z = yVar;
        this.f9698y = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [he.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [he.f, java.lang.Object] */
    @Override // ve.a
    public final Object invoke() {
        androidx.lifecycle.s sVar;
        n1 defaultViewModelProviderFactory;
        androidx.lifecycle.s sVar2;
        n1 defaultViewModelProviderFactory2;
        switch (this.f9697x) {
            case 0:
                q1 q1Var = (q1) this.f9698y.getValue();
                if (q1Var instanceof androidx.lifecycle.s) {
                    sVar = (androidx.lifecycle.s) q1Var;
                } else {
                    sVar = null;
                }
                if (sVar == null || (defaultViewModelProviderFactory = sVar.getDefaultViewModelProviderFactory()) == null) {
                    return ((CatsFragment) this.f9699z).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            default:
                q1 q1Var2 = (q1) this.f9698y.getValue();
                if (q1Var2 instanceof androidx.lifecycle.s) {
                    sVar2 = (androidx.lifecycle.s) q1Var2;
                } else {
                    sVar2 = null;
                }
                if (sVar2 == null || (defaultViewModelProviderFactory2 = sVar2.getDefaultViewModelProviderFactory()) == null) {
                    return ((HighFragment) this.f9699z).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory2;
        }
    }
}
