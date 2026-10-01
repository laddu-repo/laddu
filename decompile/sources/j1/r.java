package j1;

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
import com.google.android.gms.internal.measurement.k4;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class r extends y implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean I0;
    public Dialog K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;

    /* renamed from: z0, reason: collision with root package name */
    public Handler f6970z0;
    public final a1.e A0 = new a1.e(this, 5);
    public final n B0 = new n(this);
    public final o C0 = new o(this);
    public int D0 = 0;
    public int E0 = 0;
    public boolean F0 = true;
    public boolean G0 = true;
    public int H0 = -1;
    public final p J0 = new p(this);
    public boolean O0 = false;

    @Override // j1.y
    public void A() {
        this.f7022e0 = true;
        Dialog dialog = this.K0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // j1.y
    public final void C(Bundle bundle) {
        Bundle bundle2;
        this.f7022e0 = true;
        if (this.K0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.K0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // j1.y
    public final void D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.D(layoutInflater, viewGroup, bundle);
        if (this.f7024g0 == null && this.K0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.K0.onRestoreInstanceState(bundle2);
        }
    }

    public final void N(boolean z10, boolean z11) {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        this.N0 = false;
        Dialog dialog = this.K0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.K0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f6970z0.getLooper()) {
                    onDismiss(this.K0);
                } else {
                    this.f6970z0.post(this.A0);
                }
            }
        }
        this.L0 = true;
        if (this.H0 >= 0) {
            p0 g10 = g();
            int i6 = this.H0;
            if (i6 >= 0) {
                g10.x(new m0(g10, null, i6), z10);
                this.H0 = -1;
                return;
            }
            throw new IllegalArgumentException(h8.c.i(i6, "Bad id: "));
        }
        a aVar = new a(g());
        aVar.f6869p = true;
        p0 p0Var = this.S;
        if (p0Var != null && p0Var != aVar.f6871r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new w0(3, this));
        if (z10) {
            aVar.f(true, true);
        } else {
            aVar.e();
        }
    }

    public Dialog O() {
        if (p0.L(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.r(F(), this.E0);
    }

    public final Dialog P() {
        Dialog dialog = this.K0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Q(p0 p0Var, String str) {
        this.M0 = false;
        this.N0 = true;
        p0Var.getClass();
        a aVar = new a(p0Var);
        aVar.f6869p = true;
        aVar.g(0, this, str, 1);
        aVar.e();
    }

    @Override // j1.y
    public final k4 a() {
        return new q(this, new u(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.L0) {
            if (p0.L(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            N(true, true);
        }
    }

    @Override // j1.y
    public final void p() {
        this.f7022e0 = true;
    }

    @Override // j1.y
    public final void r(Context context) {
        Object obj;
        super.r(context);
        androidx.lifecycle.q0 q0Var = this.f7034r0;
        q0Var.getClass();
        androidx.lifecycle.o0.a("observeForever");
        p pVar = this.J0;
        androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(q0Var, pVar);
        r.f fVar = q0Var.f970b;
        r.c a10 = fVar.a(pVar);
        if (a10 != null) {
            obj = a10.f11232y;
        } else {
            r.c cVar = new r.c(pVar, n0Var);
            fVar.A++;
            r.c cVar2 = fVar.f11238y;
            if (cVar2 == null) {
                fVar.f11237x = cVar;
                fVar.f11238y = cVar;
            } else {
                cVar2.f11233z = cVar;
                cVar.A = cVar2;
                fVar.f11238y = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.n0 n0Var2 = (androidx.lifecycle.n0) obj;
        if (!(n0Var2 instanceof androidx.lifecycle.m0)) {
            if (n0Var2 == null) {
                n0Var.a(true);
            }
            if (!this.N0) {
                this.M0 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // j1.y
    public void s(Bundle bundle) {
        boolean z10;
        super.s(bundle);
        this.f6970z0 = new Handler();
        if (this.X == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = z10;
        if (bundle != null) {
            this.D0 = bundle.getInt("android:style", 0);
            this.E0 = bundle.getInt("android:theme", 0);
            this.F0 = bundle.getBoolean("android:cancelable", true);
            this.G0 = bundle.getBoolean("android:showsDialog", this.G0);
            this.H0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // j1.y
    public final void u() {
        this.f7022e0 = true;
        Dialog dialog = this.K0;
        if (dialog != null) {
            this.L0 = true;
            dialog.setOnDismissListener(null);
            this.K0.dismiss();
            if (!this.M0) {
                onDismiss(this.K0);
            }
            this.K0 = null;
            this.O0 = false;
        }
    }

    @Override // j1.y
    public final void v() {
        this.f7022e0 = true;
        if (!this.N0 && !this.M0) {
            this.M0 = true;
        }
        androidx.lifecycle.q0 q0Var = this.f7034r0;
        q0Var.getClass();
        androidx.lifecycle.o0.a("removeObserver");
        androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) q0Var.f970b.b(this.J0);
        if (n0Var == null) {
            return;
        }
        n0Var.b();
        n0Var.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0048, B:21:0x0052, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x006a), top: B:9:0x001a }] */
    @Override // j1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater w(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.w(r8)
            boolean r0 = r7.G0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9c
            boolean r3 = r7.I0
            if (r3 == 0) goto L11
            goto L9c
        L11:
            if (r0 != 0) goto L14
            goto L73
        L14:
            boolean r0 = r7.O0
            if (r0 != 0) goto L73
            r0 = 0
            r3 = 1
            r7.I0 = r3     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r7.O()     // Catch: java.lang.Throwable -> L50
            r7.K0 = r4     // Catch: java.lang.Throwable -> L50
            boolean r5 = r7.G0     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L6a
            int r5 = r7.D0     // Catch: java.lang.Throwable -> L50
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L50
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L50
        L3e:
            android.content.Context r4 = r7.d()     // Catch: java.lang.Throwable -> L50
            boolean r5 = r4.a.w(r4)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L52
            android.app.Dialog r5 = r7.K0     // Catch: java.lang.Throwable -> L50
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L50
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r8 = move-exception
            goto L70
        L52:
            android.app.Dialog r4 = r7.K0     // Catch: java.lang.Throwable -> L50
            boolean r5 = r7.F0     // Catch: java.lang.Throwable -> L50
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r7.K0     // Catch: java.lang.Throwable -> L50
            j1.n r5 = r7.B0     // Catch: java.lang.Throwable -> L50
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L50
            android.app.Dialog r4 = r7.K0     // Catch: java.lang.Throwable -> L50
            j1.o r5 = r7.C0     // Catch: java.lang.Throwable -> L50
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L50
            r7.O0 = r3     // Catch: java.lang.Throwable -> L50
            goto L6d
        L6a:
            r3 = 0
            r7.K0 = r3     // Catch: java.lang.Throwable -> L50
        L6d:
            r7.I0 = r0
            goto L73
        L70:
            r7.I0 = r0
            throw r8
        L73:
            boolean r0 = j1.p0.L(r2)
            if (r0 == 0) goto L8f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8f:
            android.app.Dialog r0 = r7.K0
            if (r0 == 0) goto Ld7
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L9c:
            boolean r0 = j1.p0.L(r2)
            if (r0 == 0) goto Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.G0
            if (r2 != 0) goto Lc6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.r.w(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // j1.y
    public void y(Bundle bundle) {
        Dialog dialog = this.K0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i6 = this.D0;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i10 = this.E0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z10 = this.F0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.G0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i11 = this.H0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // j1.y
    public void z() {
        this.f7022e0 = true;
        Dialog dialog = this.K0;
        if (dialog != null) {
            this.L0 = false;
            dialog.show();
            View decorView = this.K0.getWindow().getDecorView();
            kotlin.jvm.internal.k.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
