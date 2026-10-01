package za;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import bf.y;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import j1.u0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends LinearLayout {
    public ColorStateList A;
    public PorterDuff.Mode B;
    public View.OnLongClickListener C;
    public final CheckableImageButton D;
    public final s3.c E;
    public int F;
    public final LinkedHashSet G;
    public ColorStateList H;
    public PorterDuff.Mode I;
    public int J;
    public ImageView.ScaleType K;
    public View.OnLongClickListener L;
    public CharSequence M;
    public final b1 N;
    public boolean O;
    public EditText P;
    public final AccessibilityManager Q;
    public AccessibilityManager.TouchExplorationStateChangeListener R;
    public final j S;

    /* renamed from: x, reason: collision with root package name */
    public final TextInputLayout f15265x;

    /* renamed from: y, reason: collision with root package name */
    public final FrameLayout f15266y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckableImageButton f15267z;

    /* JADX WARN: Type inference failed for: r11v1, types: [s3.c, java.lang.Object] */
    public l(TextInputLayout textInputLayout, n9.j jVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.F = 0;
        this.G = new LinkedHashSet();
        this.S = new j(this);
        k kVar = new k(this);
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15265x = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15266y = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f15267z = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.D = a11;
        ?? obj = new Object();
        obj.f12053c = new SparseArray();
        obj.f12054d = this;
        TypedArray typedArray = (TypedArray) jVar.f9356z;
        obj.f12051a = typedArray.getResourceId(28, 0);
        obj.f12052b = typedArray.getResourceId(53, 0);
        this.E = obj;
        b1 b1Var = new b1(getContext(), null);
        this.N = b1Var;
        TypedArray typedArray2 = (TypedArray) jVar.f9356z;
        if (typedArray2.hasValue(38)) {
            this.A = a8.i.j(getContext(), jVar, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.B = ma.n.g(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(jVar.v(37));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a10.setImportantForAccessibility(2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setCheckable(false);
        a10.setFocusable(false);
        if (!typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(32)) {
                this.H = a8.i.j(getContext(), jVar, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.I = ma.n.g(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && a11.getContentDescription() != (text = typedArray2.getText(27))) {
                a11.setContentDescription(text);
            }
            a11.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(55)) {
                this.H = a8.i.j(getContext(), jVar, 55);
            }
            if (typedArray2.hasValue(56)) {
                this.I = ma.n.g(typedArray2.getInt(56, -1), null);
            }
            g(typedArray2.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(52);
            if (a11.getContentDescription() != text2) {
                a11.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.J) {
                this.J = dimensionPixelSize;
                a11.setMinimumWidth(dimensionPixelSize);
                a11.setMinimumHeight(dimensionPixelSize);
                a10.setMinimumWidth(dimensionPixelSize);
                a10.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray2.hasValue(31)) {
                ImageView.ScaleType h4 = y.h(typedArray2.getInt(31, -1));
                this.K = h4;
                a11.setScaleType(h4);
                a10.setScaleType(h4);
            }
            b1Var.setVisibility(8);
            b1Var.setId(R.id.textinput_suffix_text);
            b1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            b1Var.setAccessibilityLiveRegion(1);
            c9.a.t(b1Var, typedArray2.getResourceId(73, 0));
            if (typedArray2.hasValue(74)) {
                b1Var.setTextColor(jVar.t(74));
            }
            CharSequence text3 = typedArray2.getText(72);
            this.M = TextUtils.isEmpty(text3) ? null : text3;
            b1Var.setText(text3);
            n();
            frameLayout.addView(a11);
            addView(b1Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.C0.add(kVar);
            if (textInputLayout.B != null) {
                kVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new u0(this, 5));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i6) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i6);
        if (Build.VERSION.SDK_INT < 23) {
            Context context = checkableImageButton.getContext();
            int d10 = (int) ma.n.d(checkableImageButton.getContext(), 4);
            int[] iArr = sa.b.f12281a;
            checkableImageButton.setBackground(sa.a.a(context, d10));
        }
        if (a8.i.o(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final m b() {
        m dVar;
        int i6 = this.F;
        s3.c cVar = this.E;
        SparseArray sparseArray = (SparseArray) cVar.f12053c;
        m mVar = (m) sparseArray.get(i6);
        if (mVar == null) {
            l lVar = (l) cVar.f12054d;
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                dVar = new i(lVar);
                            } else {
                                throw new IllegalArgumentException(h8.c.i(i6, "Invalid end icon mode: "));
                            }
                        } else {
                            dVar = new c(lVar);
                        }
                    } else {
                        dVar = new s(lVar, cVar.f12052b);
                    }
                } else {
                    dVar = new d(lVar, 1);
                }
            } else {
                dVar = new d(lVar, 0);
            }
            sparseArray.append(i6, dVar);
            return dVar;
        }
        return mVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.D;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.N.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.f15266y.getVisibility() == 0 && this.D.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f15267z.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean z12;
        m b10 = b();
        boolean j = b10.j();
        CheckableImageButton checkableImageButton = this.D;
        boolean z13 = true;
        if (j && (z12 = checkableImageButton.A) != b10.k()) {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof i) && (isActivated = checkableImageButton.isActivated()) != ((i) b10).f15256l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z13 = z11;
        }
        if (!z10 && !z13) {
            return;
        }
        y.s(this.f15265x, checkableImageButton, this.H);
    }

    public final void g(int i6) {
        boolean z10;
        Drawable drawable;
        if (this.F == i6) {
            return;
        }
        m b10 = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.R;
        AccessibilityManager accessibilityManager = this.Q;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.R = null;
        b10.r();
        this.F = i6;
        Iterator it = this.G.iterator();
        if (!it.hasNext()) {
            if (i6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h(z10);
            m b11 = b();
            int i10 = this.E.f12051a;
            if (i10 == 0) {
                i10 = b11.d();
            }
            if (i10 != 0) {
                drawable = c9.a.f(getContext(), i10);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.D;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f15265x;
            if (drawable != null) {
                y.c(textInputLayout, checkableImageButton, this.H, this.I);
                y.s(textInputLayout, checkableImageButton, this.H);
            }
            int c10 = b11.c();
            if (c10 != 0) {
                charSequence = getResources().getText(c10);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.j());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.q();
                AccessibilityManager.TouchExplorationStateChangeListener h4 = b11.h();
                this.R = h4;
                if (h4 != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.R);
                }
                View.OnClickListener f3 = b11.f();
                View.OnLongClickListener onLongClickListener = this.L;
                checkableImageButton.setOnClickListener(f3);
                y.t(checkableImageButton, onLongClickListener);
                EditText editText = this.P;
                if (editText != null) {
                    b11.l(editText);
                    j(b11);
                }
                y.c(textInputLayout, checkableImageButton, this.H, this.I);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
        }
        throw r4.a.i(it);
    }

    public final void h(boolean z10) {
        int i6;
        if (d() != z10) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            this.D.setVisibility(i6);
            k();
            m();
            this.f15265x.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15267z;
        checkableImageButton.setImageDrawable(drawable);
        l();
        y.c(this.f15265x, checkableImageButton, this.A, this.B);
    }

    public final void j(m mVar) {
        if (this.P != null) {
            if (mVar.e() != null) {
                this.P.setOnFocusChangeListener(mVar.e());
            }
            if (mVar.g() != null) {
                this.D.setOnFocusChangeListener(mVar.g());
            }
        }
    }

    public final void k() {
        int i6;
        char c10;
        int i10 = 8;
        if (this.D.getVisibility() == 0 && !e()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.f15266y.setVisibility(i6);
        if (this.M != null && !this.O) {
            c10 = 0;
        } else {
            c10 = '\b';
        }
        if (d() || e() || c10 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    public final void l() {
        int i6;
        CheckableImageButton checkableImageButton = this.f15267z;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f15265x;
        if (drawable != null && textInputLayout.H.f15293q && textInputLayout.o()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        checkableImageButton.setVisibility(i6);
        k();
        m();
        if (this.F != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        int i6;
        TextInputLayout textInputLayout = this.f15265x;
        if (textInputLayout.B == null) {
            return;
        }
        if (!d() && !e()) {
            i6 = textInputLayout.B.getPaddingEnd();
        } else {
            i6 = 0;
        }
        this.N.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.B.getPaddingTop(), i6, textInputLayout.B.getPaddingBottom());
    }

    public final void n() {
        int i6;
        b1 b1Var = this.N;
        int visibility = b1Var.getVisibility();
        boolean z10 = false;
        if (this.M != null && !this.O) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        if (visibility != i6) {
            m b10 = b();
            if (i6 == 0) {
                z10 = true;
            }
            b10.o(z10);
        }
        k();
        b1Var.setVisibility(i6);
        this.f15265x.s();
    }
}
