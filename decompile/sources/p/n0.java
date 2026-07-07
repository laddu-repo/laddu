package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 extends f2 implements p0 {

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f10315a0;

    /* renamed from: b0, reason: collision with root package name */
    public k0 f10316b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f10317c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f10318d0;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ q0 f10319e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f10319e0 = q0Var;
        this.f10317c0 = new Rect();
        this.L = q0Var;
        this.V = true;
        this.W.setFocusable(true);
        this.M = new l0(this, 0);
    }

    @Override // p.p0
    public final CharSequence f() {
        return this.f10315a0;
    }

    @Override // p.p0
    public final void i(CharSequence charSequence) {
        this.f10315a0 = charSequence;
    }

    @Override // p.p0
    public final void l(int i6) {
        this.f10318d0 = i6;
    }

    @Override // p.p0
    public final void m(int i6, int i10) {
        ViewTreeObserver viewTreeObserver;
        a0 a0Var = this.W;
        boolean isShowing = a0Var.isShowing();
        s();
        a0Var.setInputMethodMode(2);
        b();
        t1 t1Var = this.f10240z;
        t1Var.setChoiceMode(1);
        t1Var.setTextDirection(i6);
        t1Var.setTextAlignment(i10);
        q0 q0Var = this.f10319e0;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        t1 t1Var2 = this.f10240z;
        if (a0Var.isShowing() && t1Var2 != null) {
            t1Var2.setListSelectionHidden(false);
            t1Var2.setSelection(selectedItemPosition);
            if (t1Var2.getChoiceMode() != 0) {
                t1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q0Var.getViewTreeObserver()) != null) {
            o.d dVar = new o.d(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            a0Var.setOnDismissListener(new m0(this, dVar));
        }
    }

    @Override // p.f2, p.p0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f10316b0 = (k0) listAdapter;
    }

    public final void s() {
        int i6;
        int i10;
        q0 q0Var = this.f10319e0;
        Rect rect = q0Var.E;
        a0 a0Var = this.W;
        Drawable background = a0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z10 = u3.f10392a;
            if (q0Var.getLayoutDirection() == 1) {
                i6 = rect.right;
            } else {
                i6 = -rect.left;
            }
        } else {
            i6 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i11 = q0Var.D;
        if (i11 == -2) {
            int a10 = q0Var.a(this.f10316b0, a0Var.getBackground());
            int i12 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a10 > i12) {
                a10 = i12;
            }
            r(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        boolean z11 = u3.f10392a;
        if (q0Var.getLayoutDirection() == 1) {
            i10 = (((width - paddingRight) - this.B) - this.f10318d0) + i6;
        } else {
            i10 = paddingLeft + this.f10318d0 + i6;
        }
        this.C = i10;
    }
}
