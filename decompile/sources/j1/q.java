package j1;

import android.app.Dialog;
import android.view.View;
import com.google.android.gms.internal.measurement.k4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends k4 {
    public final /* synthetic */ u A;
    public final /* synthetic */ r B;

    public q(r rVar, u uVar) {
        this.B = rVar;
        this.A = uVar;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final View m(int i6) {
        u uVar = this.A;
        if (uVar.n()) {
            return uVar.m(i6);
        }
        Dialog dialog = this.B.K0;
        if (dialog != null) {
            return dialog.findViewById(i6);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final boolean n() {
        if (!this.A.n() && !this.B.O0) {
            return false;
        }
        return true;
    }
}
