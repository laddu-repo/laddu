package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class q extends y implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean C0;
    public Dialog E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Handler f1061t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final m f1062u0 = new m(0, this);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final n f1063v0 = new n(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final o f1064w0 = new o(this);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1065x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f1066y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f1067z0 = true;
    public boolean A0 = true;
    public int B0 = -1;
    public final s5.d D0 = new s5.d(this);
    public boolean I0 = false;

    @Override // androidx.fragment.app.y
    public void B(Bundle bundle) {
        Dialog dialog = this.E0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f1065x0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i10 = this.f1066y0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z2 = this.f1067z0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z10 = this.A0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.B0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // androidx.fragment.app.y
    public void C() {
        this.Z = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            this.F0 = false;
            dialog.show();
            View decorView = this.E0.getWindow().getDecorView();
            de.i.e(decorView, "<this>");
            decorView.setTag(q1.a.view_tree_lifecycle_owner, this);
            decorView.setTag(r1.d.view_tree_view_model_store_owner, this);
            decorView.setTag(u4.a.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.y
    public void D() {
        this.Z = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.y
    public final void F(Bundle bundle) {
        Bundle bundle2;
        this.Z = true;
        if (this.E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.E0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.y
    public final void G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.G(layoutInflater, viewGroup, bundle);
        if (this.f1135b0 != null || this.E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.E0.onRestoreInstanceState(bundle2);
    }

    public final void P(boolean z2, boolean z10) {
        if (this.G0) {
            return;
        }
        this.G0 = true;
        this.H0 = false;
        Dialog dialog = this.E0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.E0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f1061t0.getLooper()) {
                    onDismiss(this.E0);
                } else {
                    this.f1061t0.post(this.f1062u0);
                }
            }
        }
        this.F0 = true;
        if (this.B0 >= 0) {
            q0 q0VarL = l();
            int i = this.B0;
            if (i < 0) {
                throw new IllegalArgumentException(d0.d.h(i, "Bad id: "));
            }
            q0VarL.w(new p0(q0VarL, i), z2);
            this.B0 = -1;
            return;
        }
        a aVar = new a(l());
        aVar.f967o = true;
        aVar.g(this);
        if (z2) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog Q(Bundle bundle) {
        if (q0.I(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new c.l(I(), this.f1066y0);
    }

    public void R(q0 q0Var, String str) {
        this.G0 = false;
        this.H0 = true;
        q0Var.getClass();
        a aVar = new a(q0Var);
        aVar.f967o = true;
        aVar.e(0, this, str, 1);
        aVar.d(false);
    }

    @Override // androidx.fragment.app.y
    public final z7.b b() {
        return new p(this, new t(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.F0) {
            return;
        }
        if (q0.I(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        P(true, true);
    }

    @Override // androidx.fragment.app.y
    public final void s() {
        this.Z = true;
    }

    @Override // androidx.fragment.app.y
    public final void u(Context context) {
        super.u(context);
        this.f1146m0.d(this.D0);
        if (this.H0) {
            return;
        }
        this.G0 = false;
    }

    @Override // androidx.fragment.app.y
    public void v(Bundle bundle) {
        super.v(bundle);
        this.f1061t0 = new Handler();
        this.A0 = this.S == 0;
        if (bundle != null) {
            this.f1065x0 = bundle.getInt("android:style", 0);
            this.f1066y0 = bundle.getInt("android:theme", 0);
            this.f1067z0 = bundle.getBoolean("android:cancelable", true);
            this.A0 = bundle.getBoolean("android:showsDialog", this.A0);
            this.B0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.y
    public final void x() {
        this.Z = true;
        Dialog dialog = this.E0;
        if (dialog != null) {
            this.F0 = true;
            dialog.setOnDismissListener(null);
            this.E0.dismiss();
            if (!this.G0) {
                onDismiss(this.E0);
            }
            this.E0 = null;
            this.I0 = false;
        }
    }

    @Override // androidx.fragment.app.y
    public final void y() {
        this.Z = true;
        if (!this.H0 && !this.G0) {
            this.G0 = true;
        }
        androidx.lifecycle.y yVar = this.f1146m0;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1251b.b(this.D0);
        if (xVar == null) {
            return;
        }
        xVar.c();
        xVar.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0048, B:29:0x0052, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x006a), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater z(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.z(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
