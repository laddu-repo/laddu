package j1;

import android.view.View;
import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends k4 {
    public final /* synthetic */ y A;

    public u(y yVar) {
        this.A = yVar;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final View m(int i6) {
        y yVar = this.A;
        View view = yVar.f7024g0;
        if (view != null) {
            return view.findViewById(i6);
        }
        throw new IllegalStateException("Fragment " + yVar + " does not have a view");
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean n() {
        if (this.A.f7024g0 != null) {
            return true;
        }
        return false;
    }
}
