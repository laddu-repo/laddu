package h;

import android.R;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class f0 extends c.l implements k {
    public final e0 A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d0 f5920z;

    /* JADX WARN: Type inference failed for: r1v2, types: [h.e0] */
    public f0(ContextThemeWrapper contextThemeWrapper, int i) {
        int i10;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(g.a.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i;
        }
        super(contextThemeWrapper, i10);
        this.A = new t0.j() { // from class: h.e0
            @Override // t0.j
            public final boolean b(KeyEvent keyEvent) {
                return this.f5917v.g(keyEvent);
            }
        };
        q qVarE = e();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(g.a.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((d0) qVarE).f5882p0 = i;
        qVarE.d();
    }

    @Override // c.l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        d0 d0Var = (d0) e();
        d0Var.x();
        ((ViewGroup) d0Var.W.findViewById(R.id.content)).addView(view, layoutParams);
        d0Var.H.a(d0Var.G.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.bumptech.glide.f.k(this.A, getWindow().getDecorView(), this, keyEvent);
    }

    public final q e() {
        if (this.f5920z == null) {
            o oVar = q.f5983v;
            this.f5920z = new d0(getContext(), getWindow(), this, this);
        }
        return this.f5920z;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        d0 d0Var = (d0) e();
        d0Var.x();
        return d0Var.G.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().b();
    }

    @Override // c.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().d();
    }

    @Override // c.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        d0 d0Var = (d0) e();
        d0Var.C();
        com.bumptech.glide.f fVar = d0Var.J;
        if (fVar != null) {
            fVar.P(false);
        }
    }

    @Override // c.l, android.app.Dialog
    public final void setContentView(int i) {
        d();
        e().h(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    @Override // c.l, android.app.Dialog
    public final void setContentView(View view) {
        d();
        e().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().l(getContext().getString(i));
    }

    @Override // c.l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().j(view, layoutParams);
    }
}
