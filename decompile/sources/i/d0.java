package i;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d0 extends d.r implements k {
    public b0 A;
    public final c0 B;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969013(0x7f0401b5, float:1.7546696E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            i.c0 r2 = new i.c0
            r2.<init>()
            r4.B = r2
            i.q r2 = r4.c()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            i.b0 r5 = (i.b0) r5
            r5.f6146r0 = r6
            r2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d0.<init>(android.view.ContextThemeWrapper, int):void");
    }

    @Override // d.r, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        b0 b0Var = (b0) c();
        b0Var.u();
        ((ViewGroup) b0Var.Y.findViewById(R.id.content)).addView(view, layoutParams);
        b0Var.J.a(b0Var.I.getCallback());
    }

    public final q c() {
        if (this.A == null) {
            o oVar = q.f6255x;
            this.A = new b0(getContext(), getWindow(), this, this);
        }
        return this.A;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a8.a.h(this.B, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i6) {
        b0 b0Var = (b0) c();
        b0Var.u();
        return b0Var.I.findViewById(i6);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b0 b0Var = (b0) c();
        if (b0Var.L != null) {
            b0Var.z();
            b0Var.L.getClass();
            b0Var.A(0);
        }
    }

    @Override // d.r, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().c();
    }

    @Override // d.r, android.app.Dialog
    public final void onStop() {
        super.onStop();
        b0 b0Var = (b0) c();
        b0Var.z();
        m0 m0Var = b0Var.L;
        if (m0Var != null) {
            m0Var.f6245u = false;
            n.j jVar = m0Var.f6244t;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // d.r, android.app.Dialog
    public final void setContentView(int i6) {
        b();
        c().g(i6);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().j(charSequence);
    }

    @Override // d.r, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i6) {
        super.setTitle(i6);
        c().j(getContext().getString(i6));
    }

    @Override // d.r, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().i(view, layoutParams);
    }
}
