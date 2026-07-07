package com.google.android.material.internal;

import aa.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c9.a;
import k0.l;
import ma.f;
import o.n;
import o.y;
import p.x1;
import s1.c;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements y {

    /* renamed from: g0, reason: collision with root package name */
    public static final int[] f2711g0 = {R.attr.state_checked};
    public int S;
    public boolean T;
    public boolean U;
    public final boolean V;
    public final CheckedTextView W;

    /* renamed from: a0, reason: collision with root package name */
    public FrameLayout f2712a0;

    /* renamed from: b0, reason: collision with root package name */
    public n f2713b0;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f2714c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2715d0;

    /* renamed from: e0, reason: collision with root package name */
    public Drawable f2716e0;

    /* renamed from: f0, reason: collision with root package name */
    public final h f2717f0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = true;
        h hVar = new h(this, 3);
        this.f2717f0 = hVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.playfy.tv.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.playfy.tv.R.id.design_menu_item_text);
        this.W = checkedTextView;
        q0.r(checkedTextView, hVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2712a0 == null) {
                this.f2712a0 = (FrameLayout) ((ViewStub) findViewById(com.playfy.tv.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2712a0.removeAllViews();
            this.f2712a0.addView(view);
        }
    }

    @Override // o.y
    public final void a(n nVar) {
        int i6;
        StateListDrawable stateListDrawable;
        this.f2713b0 = nVar;
        int i10 = nVar.f9801a;
        if (i10 > 0) {
            setId(i10);
        }
        if (nVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.playfy.tv.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2711g0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f9805e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f9816q);
        e9.f.i(this, nVar.f9817r);
        n nVar2 = this.f2713b0;
        CharSequence charSequence = nVar2.f9805e;
        CheckedTextView checkedTextView = this.W;
        if (charSequence == null && nVar2.getIcon() == null && this.f2713b0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2712a0;
            if (frameLayout != null) {
                x1 x1Var = (x1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) x1Var).width = -1;
                this.f2712a0.setLayoutParams(x1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2712a0;
        if (frameLayout2 != null) {
            x1 x1Var2 = (x1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) x1Var2).width = -2;
            this.f2712a0.setLayoutParams(x1Var2);
        }
    }

    @Override // o.y
    public n getItemData() {
        return this.f2713b0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        n nVar = this.f2713b0;
        if (nVar != null && nVar.isCheckable() && this.f2713b0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2711g0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.U != z10) {
            this.U = z10;
            this.f2717f0.h(this.W, 2048);
        }
    }

    public void setChecked(boolean z10) {
        int i6;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.W;
        checkedTextView.setChecked(z10);
        Typeface typeface = checkedTextView.getTypeface();
        if (z10 && this.V) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        checkedTextView.setTypeface(typeface, i6);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2715d0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = c.A(drawable).mutate();
                drawable.setTintList(this.f2714c0);
            }
            int i6 = this.S;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.T) {
            if (this.f2716e0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f7568a;
                Drawable drawable2 = resources.getDrawable(com.playfy.tv.R.drawable.navigation_empty_icon, theme);
                this.f2716e0 = drawable2;
                if (drawable2 != null) {
                    int i10 = this.S;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f2716e0;
        }
        this.W.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.W.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.S = i6;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.f2714c0 = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2715d0 = z10;
        n nVar = this.f2713b0;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.W.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.T = z10;
    }

    public void setTextAppearance(int i6) {
        a.t(this.W, i6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.W.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.W.setText(charSequence);
    }
}
