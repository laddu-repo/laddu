package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends c2 implements m0 {
    public CharSequence Y;
    public h0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Rect f9188a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f9189b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ n0 f9190c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f9190c0 = n0Var;
        this.f9188a0 = new Rect();
        this.J = n0Var;
        this.T = true;
        this.U.setFocusable(true);
        this.K = new i0(0, this);
    }

    @Override // o.m0
    public final void f(CharSequence charSequence) {
        this.Y = charSequence;
    }

    @Override // o.m0
    public final void j(int i) {
        this.f9189b0 = i;
    }

    @Override // o.m0
    public final void l(int i, int i10) {
        ViewTreeObserver viewTreeObserver;
        x xVar = this.U;
        boolean zIsShowing = xVar.isShowing();
        s();
        xVar.setInputMethodMode(2);
        c();
        r1 r1Var = this.f9129x;
        r1Var.setChoiceMode(1);
        r1Var.setTextDirection(i);
        r1Var.setTextAlignment(i10);
        n0 n0Var = this.f9190c0;
        int selectedItemPosition = n0Var.getSelectedItemPosition();
        r1 r1Var2 = this.f9129x;
        if (xVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = n0Var.getViewTreeObserver()) == null) {
            return;
        }
        n.d dVar = new n.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        xVar.setOnDismissListener(new j0(this, dVar));
    }

    @Override // o.m0
    public final CharSequence o() {
        return this.Y;
    }

    @Override // o.c2, o.m0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.Z = (h0) listAdapter;
    }

    public final void s() {
        int i;
        n0 n0Var = this.f9190c0;
        Rect rect = n0Var.C;
        x xVar = this.U;
        Drawable background = xVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z2 = s3.f9294a;
            i = n0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = n0Var.getPaddingLeft();
        int paddingRight = n0Var.getPaddingRight();
        int width = n0Var.getWidth();
        int i10 = n0Var.B;
        if (i10 == -2) {
            int iA = n0Var.a(this.Z, xVar.getBackground());
            int i11 = (n0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i11) {
                iA = i11;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i10);
        }
        boolean z10 = s3.f9294a;
        this.A = n0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f9131z) - this.f9189b0) + i : paddingLeft + this.f9189b0 + i;
    }
}
