package q7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.fragment.app.q {
    public Dialog J0;
    public DialogInterface.OnCancelListener K0;
    public AlertDialog L0;

    @Override // androidx.fragment.app.q
    public final Dialog Q(Bundle bundle) {
        Dialog dialog = this.J0;
        if (dialog != null) {
            return dialog;
        }
        this.A0 = false;
        if (this.L0 == null) {
            Context contextJ = j();
            y.g(contextJ);
            this.L0 = new AlertDialog.Builder(contextJ).create();
        }
        return this.L0;
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.K0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
