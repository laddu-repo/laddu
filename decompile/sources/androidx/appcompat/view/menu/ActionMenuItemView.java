package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import e9.f;
import h.a;
import o.b;
import o.c;
import o.l;
import o.n;
import o.y;
import p.b1;
import p.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends b1 implements y, View.OnClickListener, k {
    public n E;
    public CharSequence F;
    public Drawable G;
    public o.k H;
    public b I;
    public c J;
    public boolean K;
    public boolean L;
    public final int M;
    public int N;
    public final int O;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.K = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f5734c, 0, 0);
        this.M = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.O = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.N = -1;
        setSaveEnabled(false);
    }

    @Override // o.y
    public final void a(n nVar) {
        int i6;
        this.E = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f9801a);
        if (nVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.I == null) {
            this.I = new b(this);
        }
    }

    @Override // p.k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.k
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.E.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i6 < 480) {
            if ((i6 < 640 || i10 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.y
    public n getItemData() {
        return this.E;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.F);
        if (this.G != null && ((this.E.f9823y & 4) != 4 || (!this.K && !this.L))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence3 = null;
        if (z12) {
            charSequence = this.F;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.E.f9816q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z12) {
                charSequence2 = null;
            } else {
                charSequence2 = this.E.f9805e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.E.f9817r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z12) {
                charSequence3 = this.E.f9805e;
            }
            f.i(this, charSequence3);
            return;
        }
        f.i(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.k kVar = this.H;
        if (kVar != null) {
            kVar.c(this.E);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.K = g();
        h();
    }

    @Override // p.b1, android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i12 = this.N) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.M;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(size, i13);
        } else {
            i11 = i13;
        }
        if (mode != 1073741824 && i13 > 0 && measuredWidth < i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
        if (isEmpty && this.G != null) {
            super.setPadding((getMeasuredWidth() - this.G.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.E.hasSubMenu() && (bVar = this.I) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            n nVar = this.E;
            if (nVar != null) {
                l lVar = nVar.f9813n;
                lVar.f9785k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.O;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(o.k kVar) {
        this.H = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
        this.N = i6;
        super.setPadding(i6, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.J = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.F = charSequence;
        h();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
