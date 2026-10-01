package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f1053v;

    public n(q qVar) {
        this.f1053v = qVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        q qVar = this.f1053v;
        Dialog dialog = qVar.E0;
        if (dialog != null) {
            qVar.onCancel(dialog);
        }
    }
}
