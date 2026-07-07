package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 implements p0, DialogInterface.OnClickListener {
    public final /* synthetic */ q0 A;

    /* renamed from: x, reason: collision with root package name */
    public i.h f10274x;

    /* renamed from: y, reason: collision with root package name */
    public k0 f10275y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f10276z;

    public j0(q0 q0Var) {
        this.A = q0Var;
    }

    @Override // p.p0
    public final boolean a() {
        i.h hVar = this.f10274x;
        if (hVar != null) {
            return hVar.isShowing();
        }
        return false;
    }

    @Override // p.p0
    public final int c() {
        return 0;
    }

    @Override // p.p0
    public final void dismiss() {
        i.h hVar = this.f10274x;
        if (hVar != null) {
            hVar.dismiss();
            this.f10274x = null;
        }
    }

    @Override // p.p0
    public final void e(int i6) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final CharSequence f() {
        return this.f10276z;
    }

    @Override // p.p0
    public final Drawable g() {
        return null;
    }

    @Override // p.p0
    public final void i(CharSequence charSequence) {
        this.f10276z = charSequence;
    }

    @Override // p.p0
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final void k(int i6) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final void l(int i6) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.p0
    public final void m(int i6, int i10) {
        if (this.f10275y == null) {
            return;
        }
        q0 q0Var = this.A;
        i.g gVar = new i.g(q0Var.getPopupContext());
        CharSequence charSequence = this.f10276z;
        if (charSequence != null) {
            gVar.setTitle(charSequence);
        }
        k0 k0Var = this.f10275y;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        i.d dVar = gVar.f6209a;
        dVar.f6169m = k0Var;
        dVar.f6170n = this;
        dVar.f6173q = selectedItemPosition;
        dVar.f6172p = true;
        i.h create = gVar.create();
        this.f10274x = create;
        AlertController$RecycleListView alertController$RecycleListView = create.C.f6182f;
        alertController$RecycleListView.setTextDirection(i6);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f10274x.show();
    }

    @Override // p.p0
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        q0 q0Var = this.A;
        q0Var.setSelection(i6);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i6, this.f10275y.getItemId(i6));
        }
        dismiss();
    }

    @Override // p.p0
    public final void p(ListAdapter listAdapter) {
        this.f10275y = (k0) listAdapter;
    }
}
