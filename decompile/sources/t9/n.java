package t9;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.w0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class n extends LinearLayout {
    public View.OnLongClickListener A;
    public final CheckableImageButton B;
    public final q3.d C;
    public int D;
    public final LinkedHashSet E;
    public ColorStateList F;
    public PorterDuff.Mode G;
    public int H;
    public ImageView.ScaleType I;
    public View.OnLongClickListener J;
    public CharSequence K;
    public final z0 L;
    public boolean M;
    public EditText N;
    public final AccessibilityManager O;
    public AccessibilityManager.TouchExplorationStateChangeListener P;
    public final l Q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextInputLayout f12460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FrameLayout f12461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CheckableImageButton f12462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f12463y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f12464z;

    public n(TextInputLayout textInputLayout, hd.a aVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.D = 0;
        this.E = new LinkedHashSet();
        this.Q = new l(this);
        m mVar = new m(this);
        this.O = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f12460v = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12461w = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, p8.f.text_input_error_icon);
        this.f12462x = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, p8.f.text_input_end_icon);
        this.B = checkableImageButtonA2;
        q3.d dVar = new q3.d();
        dVar.f10680c = new SparseArray();
        dVar.f10681d = this;
        int i = p8.l.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) aVar.f6280x;
        dVar.f10678a = typedArray.getResourceId(i, 0);
        dVar.f10679b = typedArray.getResourceId(p8.l.TextInputLayout_passwordToggleDrawable, 0);
        this.C = dVar;
        z0 z0Var = new z0(getContext(), null);
        this.L = z0Var;
        int i10 = p8.l.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) aVar.f6280x;
        if (typedArray2.hasValue(i10)) {
            this.f12463y = com.bumptech.glide.c.q(getContext(), aVar, p8.l.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(p8.l.TextInputLayout_errorIconTintMode)) {
            this.f12464z = i9.n.c(typedArray2.getInt(p8.l.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(p8.l.TextInputLayout_errorIconDrawable)) {
            i(aVar.v(p8.l.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(p8.j.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(p8.l.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(p8.l.TextInputLayout_endIconTint)) {
                this.F = com.bumptech.glide.c.q(getContext(), aVar, p8.l.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(p8.l.TextInputLayout_endIconTintMode)) {
                this.G = i9.n.c(typedArray2.getInt(p8.l.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray2.hasValue(p8.l.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(p8.l.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(p8.l.TextInputLayout_endIconContentDescription) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(p8.l.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(p8.l.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(p8.l.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(p8.l.TextInputLayout_passwordToggleTint)) {
                this.F = com.bumptech.glide.c.q(getContext(), aVar, p8.l.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(p8.l.TextInputLayout_passwordToggleTintMode)) {
                this.G = i9.n.c(typedArray2.getInt(p8.l.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            g(typedArray2.getBoolean(p8.l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(p8.l.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(p8.l.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(p8.d.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.H) {
            this.H = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(p8.l.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeK = u1.c.k(typedArray2.getInt(p8.l.TextInputLayout_endIconScaleType, -1));
            this.I = scaleTypeK;
            checkableImageButtonA2.setScaleType(scaleTypeK);
            checkableImageButtonA.setScaleType(scaleTypeK);
        }
        z0Var.setVisibility(8);
        z0Var.setId(p8.f.textinput_suffix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        z0Var.setAccessibilityLiveRegion(1);
        z0Var.setTextAppearance(typedArray2.getResourceId(p8.l.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray2.hasValue(p8.l.TextInputLayout_suffixTextColor)) {
            z0Var.setTextColor(aVar.s(p8.l.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray2.getText(p8.l.TextInputLayout_suffixText);
        this.K = TextUtils.isEmpty(text3) ? null : text3;
        z0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(z0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.A0.add(mVar);
        if (textInputLayout.f3565z != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new w0(5, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(p8.h.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.bumptech.glide.c.y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o eVar;
        int i = this.D;
        q3.d dVar = this.C;
        SparseArray sparseArray = (SparseArray) dVar.f10680c;
        o oVar = (o) sparseArray.get(i);
        if (oVar != null) {
            return oVar;
        }
        n nVar = (n) dVar.f10681d;
        if (i == -1) {
            eVar = new e(nVar, 0);
        } else if (i == 0) {
            eVar = new e(nVar, 1);
        } else if (i == 1) {
            eVar = new u(nVar, dVar.f10679b);
        } else if (i == 2) {
            eVar = new d(nVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(d0.d.h(i, "Invalid end icon mode: "));
            }
            eVar = new k(nVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.B;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.L.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f12461w.getVisibility() == 0 && this.B.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f12462x.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        o oVarB = b();
        boolean zJ = oVarB.j();
        CheckableImageButton checkableImageButton = this.B;
        boolean z12 = true;
        if (!zJ || (z11 = checkableImageButton.f3476y) == oVarB.k()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(oVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == ((k) oVarB).f12451l) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z12) {
            u1.c.C(this.f12460v, checkableImageButton, this.F);
        }
    }

    public final void g(int i) {
        if (this.D == i) {
            return;
        }
        o oVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.P;
        AccessibilityManager accessibilityManager = this.O;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.P = null;
        oVarB.r();
        this.D = i;
        Iterator it = this.E.iterator();
        if (it.hasNext()) {
            throw d0.d.g(it);
        }
        h(i != 0);
        o oVarB2 = b();
        int iD = this.C.f10678a;
        if (iD == 0) {
            iD = oVarB2.d();
        }
        Drawable drawableT = iD != 0 ? com.bumptech.glide.c.t(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.B;
        checkableImageButton.setImageDrawable(drawableT);
        TextInputLayout textInputLayout = this.f12460v;
        if (drawableT != null) {
            u1.c.b(textInputLayout, checkableImageButton, this.F, this.G);
            u1.c.C(textInputLayout, checkableImageButton, this.F);
        }
        int iC = oVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oVarB2.j());
        if (!oVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        oVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = oVarB2.h();
        this.P = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.P);
        }
        View.OnClickListener onClickListenerF = oVarB2.f();
        View.OnLongClickListener onLongClickListener = this.J;
        checkableImageButton.setOnClickListener(onClickListenerF);
        u1.c.F(checkableImageButton, onLongClickListener);
        EditText editText = this.N;
        if (editText != null) {
            oVarB2.l(editText);
            j(oVarB2);
        }
        u1.c.b(textInputLayout, checkableImageButton, this.F, this.G);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.B.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f12460v.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12462x;
        checkableImageButton.setImageDrawable(drawable);
        l();
        u1.c.b(this.f12460v, checkableImageButton, this.f12463y, this.f12464z);
    }

    public final void j(o oVar) {
        if (this.N == null) {
            return;
        }
        if (oVar.e() != null) {
            this.N.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.B.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void k() {
        this.f12461w.setVisibility((this.B.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.K == null || this.M) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f12462x;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f12460v;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.F.f12489q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.D != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f12460v;
        if (textInputLayout.f3565z == null) {
            return;
        }
        this.L.setPaddingRelative(getContext().getResources().getDimensionPixelSize(p8.d.material_input_text_to_prefix_suffix_padding), textInputLayout.f3565z.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f3565z.getPaddingEnd(), textInputLayout.f3565z.getPaddingBottom());
    }

    public final void n() {
        z0 z0Var = this.L;
        int visibility = z0Var.getVisibility();
        int i = (this.K == null || this.M) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        z0Var.setVisibility(i);
        this.f12460v.s();
    }
}
