package t8;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class k extends j1.r {
    public Dialog P0;
    public DialogInterface.OnCancelListener Q0;
    public AlertDialog R0;

    @Override // j1.r
    public final Dialog O() {
        Dialog dialog = this.P0;
        if (dialog == null) {
            this.G0 = false;
            if (this.R0 == null) {
                Context d10 = d();
                x.g(d10);
                this.R0 = new AlertDialog.Builder(d10).create();
            }
            return this.R0;
        }
        return dialog;
    }

    @Override // j1.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.Q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
