package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements m0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h.g f9158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h0 f9159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f9160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f9161y;

    public g0(n0 n0Var) {
        this.f9161y = n0Var;
    }

    @Override // o.m0
    public final boolean a() {
        h.g gVar = this.f9158v;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // o.m0
    public final int b() {
        return 0;
    }

    @Override // o.m0
    public final Drawable d() {
        return null;
    }

    @Override // o.m0
    public final void dismiss() {
        h.g gVar = this.f9158v;
        if (gVar != null) {
            gVar.dismiss();
            this.f9158v = null;
        }
    }

    @Override // o.m0
    public final void f(CharSequence charSequence) {
        this.f9160x = charSequence;
    }

    @Override // o.m0
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.m0
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.m0
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.m0
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.m0
    public final void l(int i, int i10) {
        if (this.f9159w == null) {
            return;
        }
        n0 n0Var = this.f9161y;
        h.f fVar = new h.f(n0Var.getPopupContext());
        CharSequence charSequence = this.f9160x;
        if (charSequence != null) {
            fVar.setTitle(charSequence);
        }
        h0 h0Var = this.f9159w;
        int selectedItemPosition = n0Var.getSelectedItemPosition();
        h.b bVar = fVar.f5918a;
        bVar.f5847n = h0Var;
        bVar.f5848o = this;
        bVar.f5851r = selectedItemPosition;
        bVar.f5850q = true;
        h.g gVarCreate = fVar.create();
        this.f9158v = gVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = gVarCreate.B.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f9158v.show();
    }

    @Override // o.m0
    public final int m() {
        return 0;
    }

    @Override // o.m0
    public final CharSequence o() {
        return this.f9160x;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        n0 n0Var = this.f9161y;
        n0Var.setSelection(i);
        if (n0Var.getOnItemClickListener() != null) {
            n0Var.performItemClick(null, i, this.f9159w.getItemId(i));
        }
        dismiss();
    }

    @Override // o.m0
    public final void p(ListAdapter listAdapter) {
        this.f9159w = (h0) listAdapter;
    }
}
