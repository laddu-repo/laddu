package j1;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnCancelListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f6936x;

    public n(r rVar) {
        this.f6936x = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        r rVar = this.f6936x;
        Dialog dialog = rVar.K0;
        if (dialog != null) {
            rVar.onCancel(dialog);
        }
    }
}
