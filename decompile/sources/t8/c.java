package t8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: x, reason: collision with root package name */
    public Dialog f12631x;

    /* renamed from: y, reason: collision with root package name */
    public DialogInterface.OnCancelListener f12632y;

    /* renamed from: z, reason: collision with root package name */
    public AlertDialog f12633z;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12632y;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f12631x;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f12633z == null) {
                Activity activity = getActivity();
                x.g(activity);
                this.f12633z = new AlertDialog.Builder(activity).create();
            }
            return this.f12633z;
        }
        return dialog;
    }
}
