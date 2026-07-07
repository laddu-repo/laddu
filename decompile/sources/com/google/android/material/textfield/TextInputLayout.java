package com.google.android.material.textfield;

import a8.g;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bf.y;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.material.internal.CheckableImageButton;
import com.unity3d.services.UnityAdsConstants;
import i0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import jb.b;
import ma.c;
import ma.d;
import ma.j;
import ma.n;
import o5.h;
import okhttp3.HttpUrl;
import p.b1;
import p.n1;
import t0.q0;
import u9.a;
import ua.i;
import ua.m;
import za.e;
import za.k;
import za.l;
import za.o;
import za.p;
import za.r;
import za.t;
import za.u;
import za.v;
import za.w;
import za.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a1, reason: collision with root package name */
    public static final int[][] f2769a1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public final int A;
    public ColorDrawable A0;
    public EditText B;
    public int B0;
    public CharSequence C;
    public final LinkedHashSet C0;
    public int D;
    public ColorDrawable D0;
    public int E;
    public int E0;
    public int F;
    public Drawable F0;
    public int G;
    public ColorStateList G0;
    public final p H;
    public ColorStateList H0;
    public boolean I;
    public int I0;
    public int J;
    public int J0;
    public boolean K;
    public int K0;
    public w L;
    public ColorStateList L0;
    public b1 M;
    public int M0;
    public int N;
    public int N0;
    public int O;
    public int O0;
    public CharSequence P;
    public int P0;
    public boolean Q;
    public int Q0;
    public b1 R;
    public int R0;
    public ColorStateList S;
    public boolean S0;
    public int T;
    public final c T0;
    public h U;
    public boolean U0;
    public h V;
    public boolean V0;
    public ColorStateList W;
    public ValueAnimator W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f2770a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f2771b0;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f2772c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2773d0;

    /* renamed from: e0, reason: collision with root package name */
    public CharSequence f2774e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f2775f0;

    /* renamed from: g0, reason: collision with root package name */
    public i f2776g0;

    /* renamed from: h0, reason: collision with root package name */
    public i f2777h0;

    /* renamed from: i0, reason: collision with root package name */
    public StateListDrawable f2778i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f2779j0;

    /* renamed from: k0, reason: collision with root package name */
    public i f2780k0;

    /* renamed from: l0, reason: collision with root package name */
    public i f2781l0;

    /* renamed from: m0, reason: collision with root package name */
    public m f2782m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f2783n0;
    public final int o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2784p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2785q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f2786r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2787s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2788t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2789u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2790v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Rect f2791w0;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f2792x;

    /* renamed from: x0, reason: collision with root package name */
    public final Rect f2793x0;

    /* renamed from: y, reason: collision with root package name */
    public final t f2794y;

    /* renamed from: y0, reason: collision with root package name */
    public final RectF f2795y0;

    /* renamed from: z, reason: collision with root package name */
    public final l f2796z;

    /* renamed from: z0, reason: collision with root package name */
    public Typeface f2797z0;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        int i6;
        EditText editText = this.B;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int o10 = b.o(this.B, com.playfy.tv.R.attr.colorControlHighlight);
            int i10 = this.f2784p0;
            int[][] iArr = f2769a1;
            if (i10 == 2) {
                Context context = getContext();
                i iVar = this.f2776g0;
                TypedValue q9 = g.q(com.playfy.tv.R.attr.colorSurface, context, "TextInputLayout");
                int i11 = q9.resourceId;
                if (i11 != 0) {
                    i6 = f.c(context, i11);
                } else {
                    i6 = q9.data;
                }
                i iVar2 = new i(iVar.f13000y.f12978a);
                int u3 = b.u(0.1f, o10, i6);
                iVar2.q(new ColorStateList(iArr, new int[]{u3, 0}));
                iVar2.setTint(i6);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{u3, i6});
                i iVar3 = new i(iVar.f13000y.f12978a);
                iVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar2, iVar3), iVar});
            }
            if (i10 == 1) {
                i iVar4 = this.f2776g0;
                int i12 = this.f2790v0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{b.u(0.1f, o10, i12), i12}), iVar4, iVar4);
            }
            return null;
        }
        return this.f2776g0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2778i0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2778i0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2778i0.addState(new int[0], h(false));
        }
        return this.f2778i0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2777h0 == null) {
            this.f2777h0 = h(true);
        }
        return this.f2777h0;
    }

    public static void m(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.B == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.B = editText;
            int i6 = this.D;
            if (i6 != -1) {
                setMinEms(i6);
            } else {
                setMinWidth(this.F);
            }
            int i10 = this.E;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.G);
            }
            this.f2779j0 = false;
            k();
            setTextInputAccessibilityDelegate(new v(this));
            Typeface typeface = this.B.getTypeface();
            c cVar = this.T0;
            cVar.n(typeface);
            float textSize = this.B.getTextSize();
            if (cVar.f8743h != textSize) {
                cVar.f8743h = textSize;
                cVar.j(false);
            }
            float letterSpacing = this.B.getLetterSpacing();
            if (cVar.X != letterSpacing) {
                cVar.X = letterSpacing;
                cVar.j(false);
            }
            int gravity = this.B.getGravity();
            int i11 = (gravity & (-113)) | 48;
            if (cVar.f8741g != i11) {
                cVar.f8741g = i11;
                cVar.j(false);
            }
            if (cVar.f8739f != gravity) {
                cVar.f8739f = gravity;
                cVar.j(false);
            }
            this.R0 = editText.getMinimumHeight();
            this.B.addTextChangedListener(new u(this, editText));
            if (this.G0 == null) {
                this.G0 = this.B.getHintTextColors();
            }
            if (this.f2773d0) {
                if (TextUtils.isEmpty(this.f2774e0)) {
                    CharSequence hint = this.B.getHint();
                    this.C = hint;
                    setHint(hint);
                    this.B.setHint((CharSequence) null);
                }
                this.f2775f0 = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.M != null) {
                p(this.B.getText());
            }
            t();
            this.H.b();
            this.f2794y.bringToFront();
            l lVar = this.f2796z;
            lVar.bringToFront();
            Iterator it = this.C0.iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(this);
            }
            lVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f2774e0)) {
            this.f2774e0 = charSequence;
            c cVar = this.T0;
            if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
                cVar.B = charSequence;
                cVar.C = null;
                cVar.j(false);
            }
            if (!this.S0) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        if (z10) {
            b1 b1Var = this.R;
            if (b1Var != null) {
                this.f2792x.addView(b1Var);
                this.R.setVisibility(0);
            }
        } else {
            b1 b1Var2 = this.R;
            if (b1Var2 != null) {
                b1Var2.setVisibility(8);
            }
            this.R = null;
        }
        this.Q = z10;
    }

    public final void a() {
        if (this.B != null && this.f2784p0 == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.B;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_filled_edittext_font_2_0_padding_top), this.B.getPaddingEnd(), getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else {
                    if (a8.i.o(getContext())) {
                        EditText editText2 = this.B;
                        editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_filled_edittext_font_1_3_padding_top), this.B.getPaddingEnd(), getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                        return;
                    }
                    return;
                }
            }
            EditText editText3 = this.B;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.T0.f() + this.A), this.B.getPaddingEnd(), getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f2792x;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            v();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i6, layoutParams);
    }

    public final void b(float f3) {
        c cVar = this.T0;
        if (cVar.f8731b == f3) {
            return;
        }
        if (this.W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W0 = valueAnimator;
            valueAnimator.setInterpolator(j5.u(getContext(), com.playfy.tv.R.attr.motionEasingEmphasizedInterpolator, a.f12954b));
            this.W0.setDuration(j5.t(getContext(), com.playfy.tv.R.attr.motionDurationMedium4, 167));
            this.W0.addUpdateListener(new w4.t(this, 3));
        }
        this.W0.setFloatValues(cVar.f8731b, f3);
        this.W0.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i6;
        int i10;
        i iVar = this.f2776g0;
        if (iVar == null) {
            return;
        }
        m mVar = iVar.f13000y.f12978a;
        m mVar2 = this.f2782m0;
        if (mVar != mVar2) {
            iVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f2784p0 == 2 && (i6 = this.f2786r0) > -1 && (i10 = this.f2789u0) != 0) {
            i iVar2 = this.f2776g0;
            iVar2.f13000y.f12987k = i6;
            iVar2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i10);
            ua.g gVar = iVar2.f13000y;
            if (gVar.f12982e != valueOf2) {
                gVar.f12982e = valueOf2;
                iVar2.onStateChange(iVar2.getState());
            }
        }
        int i11 = this.f2790v0;
        if (this.f2784p0 == 1) {
            i11 = l0.b.b(this.f2790v0, b.n(getContext(), com.playfy.tv.R.attr.colorSurface, 0));
        }
        this.f2790v0 = i11;
        this.f2776g0.q(ColorStateList.valueOf(i11));
        i iVar3 = this.f2780k0;
        if (iVar3 != null && this.f2781l0 != null) {
            if (this.f2786r0 > -1 && this.f2789u0 != 0) {
                if (this.B.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.I0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f2789u0);
                }
                iVar3.q(valueOf);
                this.f2781l0.q(ColorStateList.valueOf(this.f2789u0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z10;
        if (this.B != null) {
            if (getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i6 = rect.bottom;
            Rect rect2 = this.f2793x0;
            rect2.bottom = i6;
            int i10 = this.f2784p0;
            if (i10 != 1) {
                if (i10 != 2) {
                    rect2.left = i(rect.left, z10);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z10);
                    return rect2;
                }
                rect2.left = this.B.getPaddingLeft() + rect.left;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.B.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z10);
            rect2.top = rect.top + this.f2785q0;
            rect2.right = j(rect.right, z10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i6) {
        EditText editText = this.B;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.C != null) {
            boolean z10 = this.f2775f0;
            this.f2775f0 = false;
            CharSequence hint = editText.getHint();
            this.B.setHint(this.C);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.B.setHint(hint);
                this.f2775f0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        FrameLayout frameLayout = this.f2792x;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure newChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(newChild, i6);
            if (childAt == this.B) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar;
        super.draw(canvas);
        boolean z10 = this.f2773d0;
        c cVar = this.T0;
        if (z10) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.f8737e;
            int save = canvas.save();
            if (cVar.C != null && rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF.height() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                textPaint.setTextSize(cVar.G);
                float f3 = cVar.f8755q;
                float f10 = cVar.f8756r;
                float f11 = cVar.F;
                if (f11 != 1.0f) {
                    canvas.scale(f11, f11, f3, f10);
                }
                if ((cVar.f8738e0 > 1 || cVar.f8740f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.f8755q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f10);
                    float f12 = alpha;
                    textPaint.setAlpha((int) (cVar.f8734c0 * f12));
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, b.m(cVar.K, textPaint.getAlpha()));
                    }
                    cVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (cVar.f8732b0 * f12));
                    if (i6 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, b.m(cVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.f8736d0;
                    float f13 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, textPaint);
                    if (i6 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String trim = cVar.f8736d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f3, f10);
                    cVar.Z.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.f2781l0 != null && (iVar = this.f2780k0) != null) {
            iVar.draw(canvas);
            if (this.B.isFocused()) {
                Rect bounds = this.f2781l0.getBounds();
                Rect bounds2 = this.f2780k0.getBounds();
                float f14 = cVar.f8731b;
                int centerX = bounds2.centerX();
                bounds.left = a.c(f14, centerX, bounds2.left);
                bounds.right = a.c(f14, centerX, bounds2.right);
                this.f2781l0.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.X0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.X0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ma.c r3 = r4.T0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f8748k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            android.widget.EditText r3 = r4.B
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.X0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.f2773d0) {
            int i6 = this.f2784p0;
            c cVar = this.T0;
            if (i6 != 0) {
                if (i6 == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (cVar.f() / 2.0f);
                    }
                    float f3 = cVar.f();
                    TextPaint textPaint = cVar.P;
                    textPaint.setTextSize(cVar.f8745i);
                    textPaint.setTypeface(cVar.s);
                    textPaint.setLetterSpacing(cVar.W);
                    return Math.max(0, (int) (f3 - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) cVar.f();
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.f9989z = j5.t(getContext(), com.playfy.tv.R.attr.motionDurationShort2, 87);
        hVar.A = j5.u(getContext(), com.playfy.tv.R.attr.motionEasingLinearInterpolator, a.f12953a);
        return hVar;
    }

    public final boolean g() {
        if (this.f2773d0 && !TextUtils.isEmpty(this.f2774e0) && (this.f2776g0 instanceof za.f)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.B;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public i getBoxBackground() {
        int i6 = this.f2784p0;
        if (i6 != 1 && i6 != 2) {
            throw new IllegalStateException();
        }
        return this.f2776g0;
    }

    public int getBoxBackgroundColor() {
        return this.f2790v0;
    }

    public int getBoxBackgroundMode() {
        return this.f2784p0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2785q0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f2795y0;
        if (layoutDirection == 1) {
            return this.f2782m0.f13022h.a(rectF);
        }
        return this.f2782m0.f13021g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f2795y0;
        if (layoutDirection == 1) {
            return this.f2782m0.f13021g.a(rectF);
        }
        return this.f2782m0.f13022h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f2795y0;
        if (layoutDirection == 1) {
            return this.f2782m0.f13019e.a(rectF);
        }
        return this.f2782m0.f13020f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f2795y0;
        if (layoutDirection == 1) {
            return this.f2782m0.f13020f.a(rectF);
        }
        return this.f2782m0.f13019e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.L0;
    }

    public int getBoxStrokeWidth() {
        return this.f2787s0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2788t0;
    }

    public int getCounterMaxLength() {
        return this.J;
    }

    public CharSequence getCounterOverflowDescription() {
        b1 b1Var;
        if (this.I && this.K && (b1Var = this.M) != null) {
            return b1Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2770a0;
    }

    public ColorStateList getCounterTextColor() {
        return this.W;
    }

    public ColorStateList getCursorColor() {
        return this.f2771b0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2772c0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.G0;
    }

    public EditText getEditText() {
        return this.B;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2796z.D.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2796z.D.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2796z.J;
    }

    public int getEndIconMode() {
        return this.f2796z.F;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2796z.K;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2796z.D;
    }

    public CharSequence getError() {
        p pVar = this.H;
        if (pVar.f15293q) {
            return pVar.f15292p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.H.f15295t;
    }

    public CharSequence getErrorContentDescription() {
        return this.H.s;
    }

    public int getErrorCurrentTextColors() {
        b1 b1Var = this.H.f15294r;
        if (b1Var != null) {
            return b1Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2796z.f15267z.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.H;
        if (pVar.f15299x) {
            return pVar.f15298w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        b1 b1Var = this.H.f15300y;
        if (b1Var != null) {
            return b1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2773d0) {
            return this.f2774e0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.T0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.T0;
        return cVar.g(cVar.f8748k);
    }

    public int getHintMaxLines() {
        return this.T0.f8738e0;
    }

    public ColorStateList getHintTextColor() {
        return this.H0;
    }

    public w getLengthCounter() {
        return this.L;
    }

    public int getMaxEms() {
        return this.E;
    }

    public int getMaxWidth() {
        return this.G;
    }

    public int getMinEms() {
        return this.D;
    }

    public int getMinWidth() {
        return this.F;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2796z.D.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2796z.D.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.Q) {
            return this.P;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.T;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.S;
    }

    public CharSequence getPrefixText() {
        return this.f2794y.f15310z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2794y.f15309y.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2794y.f15309y;
    }

    public m getShapeAppearanceModel() {
        return this.f2782m0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2794y.A.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2794y.A.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2794y.D;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2794y.E;
    }

    public CharSequence getSuffixText() {
        return this.f2796z.M;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2796z.N.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2796z.N;
    }

    public Typeface getTypeface() {
        return this.f2797z0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ua.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [k6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [k6.e, java.lang.Object] */
    public final i h(boolean z10) {
        float f3;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i6;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.playfy.tv.R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f3 = dimensionPixelOffset2;
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        EditText editText = this.B;
        if (editText instanceof r) {
            dimensionPixelOffset = ((r) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.playfy.tv.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.playfy.tv.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        int i10 = 0;
        ua.f fVar = new ua.f(i10);
        ua.f fVar2 = new ua.f(i10);
        ua.f fVar3 = new ua.f(i10);
        ua.f fVar4 = new ua.f(i10);
        ua.a aVar = new ua.a(f3);
        ua.a aVar2 = new ua.a(f3);
        ua.a aVar3 = new ua.a(dimensionPixelOffset2);
        ua.a aVar4 = new ua.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f13015a = obj;
        obj5.f13016b = obj2;
        obj5.f13017c = obj3;
        obj5.f13018d = obj4;
        obj5.f13019e = aVar;
        obj5.f13020f = aVar2;
        obj5.f13021g = aVar4;
        obj5.f13022h = aVar3;
        obj5.f13023i = fVar;
        obj5.j = fVar2;
        obj5.f13024k = fVar3;
        obj5.f13025l = fVar4;
        EditText editText2 = this.B;
        if (editText2 instanceof r) {
            colorStateList = ((r) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = i.f12995c0;
            TypedValue q9 = g.q(com.playfy.tv.R.attr.colorSurface, context, i.class.getSimpleName());
            int i11 = q9.resourceId;
            if (i11 != 0) {
                i6 = f.c(context, i11);
            } else {
                i6 = q9.data;
            }
            colorStateList = ColorStateList.valueOf(i6);
        }
        i iVar = new i();
        iVar.m(context);
        iVar.q(colorStateList);
        iVar.p(dimensionPixelOffset);
        iVar.setShapeAppearanceModel(obj5);
        ua.g gVar = iVar.f13000y;
        if (gVar.f12985h == null) {
            gVar.f12985h = new Rect();
        }
        iVar.f13000y.f12985h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int i(int i6, boolean z10) {
        int compoundPaddingLeft;
        if (!z10 && getPrefixText() != null) {
            compoundPaddingLeft = this.f2794y.a();
        } else if (z10 && getSuffixText() != null) {
            compoundPaddingLeft = this.f2796z.c();
        } else {
            compoundPaddingLeft = this.B.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i6;
    }

    public final int j(int i6, boolean z10) {
        int compoundPaddingRight;
        if (!z10 && getSuffixText() != null) {
            compoundPaddingRight = this.f2796z.c();
        } else if (z10 && getPrefixText() != null) {
            compoundPaddingRight = this.f2794y.a();
        } else {
            compoundPaddingRight = this.B.getCompoundPaddingRight();
        }
        return i6 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [ua.i, za.f] */
    public final void k() {
        int i6 = this.f2784p0;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    if (this.f2773d0 && !(this.f2776g0 instanceof za.f)) {
                        m mVar = this.f2782m0;
                        int i10 = za.f.f15246f0;
                        if (mVar == null) {
                            mVar = new m();
                        }
                        e eVar = new e(mVar, new RectF());
                        ?? iVar = new i(eVar);
                        iVar.f15247e0 = eVar;
                        this.f2776g0 = iVar;
                    } else {
                        this.f2776g0 = new i(this.f2782m0);
                    }
                    this.f2780k0 = null;
                    this.f2781l0 = null;
                } else {
                    throw new IllegalArgumentException(r4.a.l(new StringBuilder(), this.f2784p0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f2776g0 = new i(this.f2782m0);
                this.f2780k0 = new i();
                this.f2781l0 = new i();
            }
        } else {
            this.f2776g0 = null;
            this.f2780k0 = null;
            this.f2781l0 = null;
        }
        u();
        z();
        if (this.f2784p0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2785q0 = getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (a8.i.o(getContext())) {
                this.f2785q0 = getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f2784p0 != 0) {
            v();
        }
        EditText editText = this.B;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f2784p0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(b1 b1Var, int i6) {
        try {
            c9.a.t(b1Var, i6);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (b1Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            c9.a.t(b1Var, com.playfy.tv.R.style.TextAppearance_AppCompat_Caption);
            b1Var.setTextColor(f.c(getContext(), com.playfy.tv.R.color.design_error));
        }
    }

    public final boolean o() {
        p pVar = this.H;
        if (pVar.f15291o == 1 && pVar.f15294r != null && !TextUtils.isEmpty(pVar.f15292p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        l lVar = this.f2796z;
        lVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.Z0 = false;
        if (this.B != null && this.B.getMeasuredHeight() < (max = Math.max(lVar.getMeasuredHeight(), this.f2794y.getMeasuredHeight()))) {
            this.B.setMinimumHeight(max);
            z10 = true;
        }
        boolean s = s();
        if (!z10 && !s) {
            return;
        }
        this.B.post(new j2.h(this, 20));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        float descent;
        int i13;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z10, i6, i10, i11, i12);
        EditText editText = this.B;
        if (editText != null) {
            Rect rect = this.f2791w0;
            d.a(this, editText, rect);
            i iVar = this.f2780k0;
            if (iVar != null) {
                int i14 = rect.bottom;
                iVar.setBounds(rect.left, i14 - this.f2787s0, rect.right, i14);
            }
            i iVar2 = this.f2781l0;
            if (iVar2 != null) {
                int i15 = rect.bottom;
                iVar2.setBounds(rect.left, i15 - this.f2788t0, rect.right, i15);
            }
            if (this.f2773d0) {
                float textSize = this.B.getTextSize();
                c cVar = this.T0;
                float f3 = cVar.f8743h;
                TextPaint textPaint = cVar.P;
                if (f3 != textSize) {
                    cVar.f8743h = textSize;
                    cVar.j(false);
                }
                int gravity = this.B.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (cVar.f8741g != i16) {
                    cVar.f8741g = i16;
                    cVar.j(false);
                }
                if (cVar.f8739f != gravity) {
                    cVar.f8739f = gravity;
                    cVar.j(false);
                }
                Rect d10 = d(rect);
                int i17 = d10.left;
                int i18 = d10.top;
                int i19 = d10.right;
                int i20 = d10.bottom;
                Rect rect2 = cVar.f8735d;
                if (rect2.left != i17 || rect2.top != i18 || rect2.right != i19 || rect2.bottom != i20) {
                    rect2.set(i17, i18, i19, i20);
                    cVar.N = true;
                }
                if (this.B != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(cVar.f8743h);
                        textPaint.setTypeface(cVar.f8759v);
                        textPaint.setLetterSpacing(cVar.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(cVar.f8743h);
                        textPaint.setTypeface(cVar.f8759v);
                        textPaint.setLetterSpacing(cVar.X);
                        descent = cVar.f8750l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.B.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.f2793x0;
                    rect3.left = compoundPaddingLeft;
                    if (this.f2784p0 == 1 && this.B.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.f2784p0 == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(cVar.f8743h);
                            textPaint.setTypeface(cVar.f8759v);
                            textPaint.setLetterSpacing(cVar.X);
                            i13 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i13 = 0;
                        }
                        compoundPaddingTop = (this.B.getCompoundPaddingTop() + rect.top) - i13;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.B.getCompoundPaddingRight();
                    if (this.f2784p0 == 1 && this.B.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.B.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i21 = rect3.left;
                    int i22 = rect3.top;
                    int i23 = rect3.right;
                    Rect rect4 = cVar.f8733c;
                    if (rect4.left != i21 || rect4.top != i22 || rect4.right != i23 || rect4.bottom != compoundPaddingBottom || true != cVar.f8749k0) {
                        rect4.set(i21, i22, i23, compoundPaddingBottom);
                        cVar.N = true;
                        cVar.f8749k0 = true;
                    }
                    cVar.j(false);
                    if (g() && !this.S0) {
                        l();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        float f3;
        boolean z10;
        float f10;
        EditText editText;
        super.onMeasure(i6, i10);
        boolean z11 = this.Z0;
        l lVar = this.f2796z;
        if (!z11) {
            lVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Z0 = true;
        }
        if (this.R != null && (editText = this.B) != null) {
            this.R.setGravity(editText.getGravity());
            this.R.setPadding(this.B.getCompoundPaddingLeft(), this.B.getCompoundPaddingTop(), this.B.getCompoundPaddingRight(), this.B.getCompoundPaddingBottom());
        }
        lVar.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.B.getMeasuredWidth() - this.B.getCompoundPaddingLeft()) - this.B.getCompoundPaddingRight();
            c cVar = this.T0;
            TextPaint textPaint = cVar.P;
            textPaint.setTextSize(cVar.f8745i);
            textPaint.setTypeface(cVar.s);
            textPaint.setLetterSpacing(cVar.W);
            float f11 = measuredWidth;
            cVar.f8746i0 = cVar.e(cVar.f8740f0, textPaint, cVar.B, (cVar.f8745i / cVar.f8743h) * f11, cVar.D).getHeight();
            textPaint.setTextSize(cVar.f8743h);
            textPaint.setTypeface(cVar.f8759v);
            textPaint.setLetterSpacing(cVar.X);
            cVar.f8747j0 = cVar.e(cVar.f8738e0, textPaint, cVar.B, f11, cVar.D).getHeight();
            EditText editText2 = this.B;
            Rect rect = this.f2791w0;
            d.a(this, editText2, rect);
            Rect d10 = d(rect);
            int i11 = d10.left;
            int i12 = d10.top;
            int i13 = d10.right;
            int i14 = d10.bottom;
            Rect rect2 = cVar.f8735d;
            if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
                rect2.set(i11, i12, i13, i14);
                cVar.N = true;
            }
            v();
            a();
            if (this.B != null) {
                int i15 = cVar.f8747j0;
                if (i15 != -1) {
                    f3 = i15;
                } else {
                    TextPaint textPaint2 = cVar.P;
                    textPaint2.setTextSize(cVar.f8743h);
                    textPaint2.setTypeface(cVar.f8759v);
                    textPaint2.setLetterSpacing(cVar.X);
                    f3 = -textPaint2.ascent();
                }
                CharSequence charSequence = this.P;
                float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (charSequence != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.R.getPaint());
                    textPaint3.setTextSize(this.R.getTextSize());
                    textPaint3.setTypeface(this.R.getTypeface());
                    textPaint3.setLetterSpacing(this.R.getLetterSpacing());
                    try {
                        j jVar = new j(this.P, textPaint3, measuredWidth);
                        if (getLayoutDirection() == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        jVar.f8782k = z10;
                        jVar.j = true;
                        float lineSpacingExtra = this.R.getLineSpacingExtra();
                        float lineSpacingMultiplier = this.R.getLineSpacingMultiplier();
                        jVar.f8779g = lineSpacingExtra;
                        jVar.f8780h = lineSpacingMultiplier;
                        jVar.f8784m = new j2.u(this, 18);
                        StaticLayout a10 = jVar.a();
                        if (this.f2784p0 == 1) {
                            f10 = cVar.f() + this.f2785q0 + this.A;
                        } else {
                            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        f12 = a10.getHeight() + f10;
                    } catch (ma.i e10) {
                        Log.e("TextInputLayout", e10.getCause().getMessage(), e10);
                    }
                }
                float max = Math.max(f3, f12);
                if (this.B.getMeasuredHeight() < max) {
                    this.B.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f15113x);
        setError(xVar.f15315z);
        if (xVar.A) {
            post(new v8.i(this, 9));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ua.m] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z10 = true;
        if (i6 != 1) {
            z10 = false;
        }
        if (z10 != this.f2783n0) {
            ua.d dVar = this.f2782m0.f13019e;
            RectF rectF = this.f2795y0;
            float a10 = dVar.a(rectF);
            float a11 = this.f2782m0.f13020f.a(rectF);
            float a12 = this.f2782m0.f13022h.a(rectF);
            float a13 = this.f2782m0.f13021g.a(rectF);
            m mVar = this.f2782m0;
            k6.e eVar = mVar.f13015a;
            k6.e eVar2 = mVar.f13016b;
            k6.e eVar3 = mVar.f13018d;
            k6.e eVar4 = mVar.f13017c;
            ua.f fVar = new ua.f(0);
            ua.f fVar2 = new ua.f(0);
            ua.f fVar3 = new ua.f(0);
            ua.f fVar4 = new ua.f(0);
            ua.a aVar = new ua.a(a11);
            ua.a aVar2 = new ua.a(a10);
            ua.a aVar3 = new ua.a(a13);
            ua.a aVar4 = new ua.a(a12);
            ?? obj = new Object();
            obj.f13015a = eVar2;
            obj.f13016b = eVar;
            obj.f13017c = eVar3;
            obj.f13018d = eVar4;
            obj.f13019e = aVar;
            obj.f13020f = aVar2;
            obj.f13021g = aVar4;
            obj.f13022h = aVar3;
            obj.f13023i = fVar;
            obj.j = fVar2;
            obj.f13024k = fVar3;
            obj.f13025l = fVar4;
            this.f2783n0 = z10;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z0.b, android.os.Parcelable, za.x] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? bVar = new z0.b(super.onSaveInstanceState());
        if (o()) {
            bVar.f15315z = getError();
        }
        l lVar = this.f2796z;
        if (lVar.F != 0 && lVar.D.A) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.A = z10;
        return bVar;
    }

    public final void p(Editable editable) {
        int i6;
        boolean z10;
        int i10;
        r0.b bVar;
        ((u2.i) this.L).getClass();
        if (editable != null) {
            i6 = editable.length();
        } else {
            i6 = 0;
        }
        boolean z11 = this.K;
        int i11 = this.J;
        String str = null;
        if (i11 == -1) {
            this.M.setText(String.valueOf(i6));
            this.M.setContentDescription(null);
            this.K = false;
        } else {
            if (i6 > i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K = z10;
            Context context = getContext();
            b1 b1Var = this.M;
            int i12 = this.J;
            if (this.K) {
                i10 = com.playfy.tv.R.string.character_counter_overflowed_content_description;
            } else {
                i10 = com.playfy.tv.R.string.character_counter_content_description;
            }
            b1Var.setContentDescription(context.getString(i10, Integer.valueOf(i6), Integer.valueOf(i12)));
            if (z11 != this.K) {
                q();
            }
            String str2 = r0.b.f11245b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = r0.b.f11248e;
            } else {
                bVar = r0.b.f11247d;
            }
            b1 b1Var2 = this.M;
            String string = getContext().getString(com.playfy.tv.R.string.character_counter_pattern, Integer.valueOf(i6), Integer.valueOf(this.J));
            bVar.getClass();
            p4 p4Var = r0.f.f11255a;
            if (string != null) {
                str = bVar.c(string).toString();
            }
            b1Var2.setText(str);
        }
        if (this.B != null && z11 != this.K) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i6;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        b1 b1Var = this.M;
        if (b1Var != null) {
            if (this.K) {
                i6 = this.N;
            } else {
                i6 = this.O;
            }
            n(b1Var, i6);
            if (!this.K && (colorStateList2 = this.W) != null) {
                this.M.setTextColor(colorStateList2);
            }
            if (this.K && (colorStateList = this.f2770a0) != null) {
                this.M.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2771b0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue o10 = g.o(context, com.playfy.tv.R.attr.colorControlActivated);
            if (o10 != null) {
                int i6 = o10.resourceId;
                if (i6 != 0) {
                    colorStateList2 = f.d(context, i6);
                } else {
                    int i10 = o10.data;
                    if (i10 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i10);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.B;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.B.getTextCursorDrawable();
                Drawable mutate = s1.c.A(textCursorDrawable2).mutate();
                if ((o() || (this.M != null && this.K)) && (colorStateList = this.f2772c0) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.f2790v0 != i6) {
            this.f2790v0 = i6;
            this.M0 = i6;
            this.O0 = i6;
            this.P0 = i6;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        setBoxBackgroundColor(f.c(getContext(), i6));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.M0 = defaultColor;
        this.f2790v0 = defaultColor;
        this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 != this.f2784p0) {
            this.f2784p0 = i6;
            if (this.B != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.f2785q0 = i6;
    }

    public void setBoxCornerFamily(int i6) {
        ua.l g10 = this.f2782m0.g();
        ua.d dVar = this.f2782m0.f13019e;
        g10.f13003a = lg.c.f(i6);
        g10.f13007e = dVar;
        ua.d dVar2 = this.f2782m0.f13020f;
        g10.f13004b = lg.c.f(i6);
        g10.f13008f = dVar2;
        ua.d dVar3 = this.f2782m0.f13022h;
        g10.f13006d = lg.c.f(i6);
        g10.f13010h = dVar3;
        ua.d dVar4 = this.f2782m0.f13021g;
        g10.f13005c = lg.c.f(i6);
        g10.f13009g = dVar4;
        this.f2782m0 = g10.a();
        c();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.K0 != i6) {
            this.K0 = i6;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.I0 = colorStateList.getDefaultColor();
            this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.K0 != colorStateList.getDefaultColor()) {
            this.K0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.f2787s0 = i6;
        z();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.f2788t0 = i6;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.I != z10) {
            p pVar = this.H;
            Editable editable = null;
            if (z10) {
                b1 b1Var = new b1(getContext(), null);
                this.M = b1Var;
                b1Var.setId(com.playfy.tv.R.id.textinput_counter);
                Typeface typeface = this.f2797z0;
                if (typeface != null) {
                    this.M.setTypeface(typeface);
                }
                this.M.setMaxLines(1);
                pVar.a(this.M, 2);
                ((ViewGroup.MarginLayoutParams) this.M.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.playfy.tv.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.M != null) {
                    EditText editText = this.B;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                pVar.g(this.M, 2);
                this.M = null;
            }
            this.I = z10;
        }
    }

    public void setCounterMaxLength(int i6) {
        Editable text;
        if (this.J != i6) {
            if (i6 > 0) {
                this.J = i6;
            } else {
                this.J = -1;
            }
            if (this.I && this.M != null) {
                EditText editText = this.B;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                p(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.N != i6) {
            this.N = i6;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2770a0 != colorStateList) {
            this.f2770a0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.O != i6) {
            this.O = i6;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2771b0 != colorStateList) {
            this.f2771b0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2772c0 != colorStateList) {
            this.f2772c0 = colorStateList;
            if (!o() && (this.M == null || !this.K)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList;
        if (this.B != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f2796z.D.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f2796z.D.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i6) {
        l lVar = this.f2796z;
        CharSequence text = i6 != 0 ? lVar.getResources().getText(i6) : null;
        CheckableImageButton checkableImageButton = lVar.D;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i6) {
        l lVar = this.f2796z;
        Drawable f3 = i6 != 0 ? c9.a.f(lVar.getContext(), i6) : null;
        TextInputLayout textInputLayout = lVar.f15265x;
        CheckableImageButton checkableImageButton = lVar.D;
        checkableImageButton.setImageDrawable(f3);
        if (f3 != null) {
            y.c(textInputLayout, checkableImageButton, lVar.H, lVar.I);
            y.s(textInputLayout, checkableImageButton, lVar.H);
        }
    }

    public void setEndIconMinSize(int i6) {
        l lVar = this.f2796z;
        if (i6 >= 0) {
            if (i6 != lVar.J) {
                lVar.J = i6;
                CheckableImageButton checkableImageButton = lVar.D;
                checkableImageButton.setMinimumWidth(i6);
                checkableImageButton.setMinimumHeight(i6);
                CheckableImageButton checkableImageButton2 = lVar.f15267z;
                checkableImageButton2.setMinimumWidth(i6);
                checkableImageButton2.setMinimumHeight(i6);
                return;
            }
            return;
        }
        lVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i6) {
        this.f2796z.g(i6);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f2796z;
        CheckableImageButton checkableImageButton = lVar.D;
        View.OnLongClickListener onLongClickListener = lVar.L;
        checkableImageButton.setOnClickListener(onClickListener);
        y.t(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f2796z;
        lVar.L = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.D;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y.t(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.f2796z;
        lVar.K = scaleType;
        lVar.D.setScaleType(scaleType);
        lVar.f15267z.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.f2796z;
        if (lVar.H != colorStateList) {
            lVar.H = colorStateList;
            y.c(lVar.f15265x, lVar.D, colorStateList, lVar.I);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f2796z;
        if (lVar.I != mode) {
            lVar.I = mode;
            y.c(lVar.f15265x, lVar.D, lVar.H, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f2796z.h(z10);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.H;
        if (!pVar.f15293q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            pVar.c();
            pVar.f15292p = charSequence;
            pVar.f15294r.setText(charSequence);
            int i6 = pVar.f15290n;
            if (i6 != 1) {
                pVar.f15291o = 1;
            }
            pVar.i(pVar.h(pVar.f15294r, charSequence), i6, pVar.f15291o);
            return;
        }
        pVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        p pVar = this.H;
        pVar.f15295t = i6;
        b1 b1Var = pVar.f15294r;
        if (b1Var != null) {
            b1Var.setAccessibilityLiveRegion(i6);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.H;
        pVar.s = charSequence;
        b1 b1Var = pVar.f15294r;
        if (b1Var != null) {
            b1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        p pVar = this.H;
        TextInputLayout textInputLayout = pVar.f15285h;
        if (pVar.f15293q == z10) {
            return;
        }
        pVar.c();
        if (z10) {
            b1 b1Var = new b1(pVar.f15284g, null);
            pVar.f15294r = b1Var;
            b1Var.setId(com.playfy.tv.R.id.textinput_error);
            pVar.f15294r.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.f15294r.setTypeface(typeface);
            }
            int i6 = pVar.f15296u;
            pVar.f15296u = i6;
            b1 b1Var2 = pVar.f15294r;
            if (b1Var2 != null) {
                pVar.f15285h.n(b1Var2, i6);
            }
            ColorStateList colorStateList = pVar.f15297v;
            pVar.f15297v = colorStateList;
            b1 b1Var3 = pVar.f15294r;
            if (b1Var3 != null && colorStateList != null) {
                b1Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.s;
            pVar.s = charSequence;
            b1 b1Var4 = pVar.f15294r;
            if (b1Var4 != null) {
                b1Var4.setContentDescription(charSequence);
            }
            int i10 = pVar.f15295t;
            pVar.f15295t = i10;
            b1 b1Var5 = pVar.f15294r;
            if (b1Var5 != null) {
                b1Var5.setAccessibilityLiveRegion(i10);
            }
            pVar.f15294r.setVisibility(4);
            pVar.a(pVar.f15294r, 0);
        } else {
            pVar.f();
            pVar.g(pVar.f15294r, 0);
            pVar.f15294r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        pVar.f15293q = z10;
    }

    public void setErrorIconDrawable(int i6) {
        l lVar = this.f2796z;
        lVar.i(i6 != 0 ? c9.a.f(lVar.getContext(), i6) : null);
        y.s(lVar.f15265x, lVar.f15267z, lVar.A);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f2796z;
        CheckableImageButton checkableImageButton = lVar.f15267z;
        View.OnLongClickListener onLongClickListener = lVar.C;
        checkableImageButton.setOnClickListener(onClickListener);
        y.t(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f2796z;
        lVar.C = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f15267z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y.t(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.f2796z;
        if (lVar.A != colorStateList) {
            lVar.A = colorStateList;
            y.c(lVar.f15265x, lVar.f15267z, colorStateList, lVar.B);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f2796z;
        if (lVar.B != mode) {
            lVar.B = mode;
            y.c(lVar.f15265x, lVar.f15267z, lVar.A, mode);
        }
    }

    public void setErrorTextAppearance(int i6) {
        p pVar = this.H;
        pVar.f15296u = i6;
        b1 b1Var = pVar.f15294r;
        if (b1Var != null) {
            pVar.f15285h.n(b1Var, i6);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.H;
        pVar.f15297v = colorStateList;
        b1 b1Var = pVar.f15294r;
        if (b1Var != null && colorStateList != null) {
            b1Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.U0 != z10) {
            this.U0 = z10;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.H;
        if (isEmpty) {
            if (pVar.f15299x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f15299x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f15298w = charSequence;
        pVar.f15300y.setText(charSequence);
        int i6 = pVar.f15290n;
        if (i6 != 2) {
            pVar.f15291o = 2;
        }
        pVar.i(pVar.h(pVar.f15300y, charSequence), i6, pVar.f15291o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.H;
        pVar.A = colorStateList;
        b1 b1Var = pVar.f15300y;
        if (b1Var != null && colorStateList != null) {
            b1Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        p pVar = this.H;
        TextInputLayout textInputLayout = pVar.f15285h;
        if (pVar.f15299x == z10) {
            return;
        }
        pVar.c();
        if (z10) {
            b1 b1Var = new b1(pVar.f15284g, null);
            pVar.f15300y = b1Var;
            b1Var.setId(com.playfy.tv.R.id.textinput_helper_text);
            pVar.f15300y.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.f15300y.setTypeface(typeface);
            }
            pVar.f15300y.setVisibility(4);
            pVar.f15300y.setAccessibilityLiveRegion(1);
            int i6 = pVar.f15301z;
            pVar.f15301z = i6;
            b1 b1Var2 = pVar.f15300y;
            if (b1Var2 != null) {
                c9.a.t(b1Var2, i6);
            }
            ColorStateList colorStateList = pVar.A;
            pVar.A = colorStateList;
            b1 b1Var3 = pVar.f15300y;
            if (b1Var3 != null && colorStateList != null) {
                b1Var3.setTextColor(colorStateList);
            }
            pVar.a(pVar.f15300y, 1);
            pVar.f15300y.setAccessibilityDelegate(new o(pVar));
        } else {
            pVar.c();
            int i10 = pVar.f15290n;
            if (i10 == 2) {
                pVar.f15291o = 0;
            }
            pVar.i(pVar.h(pVar.f15300y, HttpUrl.FRAGMENT_ENCODE_SET), i10, pVar.f15291o);
            pVar.g(pVar.f15300y, 1);
            pVar.f15300y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        pVar.f15299x = z10;
    }

    public void setHelperTextTextAppearance(int i6) {
        p pVar = this.H;
        pVar.f15301z = i6;
        b1 b1Var = pVar.f15300y;
        if (b1Var != null) {
            c9.a.t(b1Var, i6);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2773d0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.V0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f2773d0) {
            this.f2773d0 = z10;
            if (!z10) {
                this.f2775f0 = false;
                if (!TextUtils.isEmpty(this.f2774e0) && TextUtils.isEmpty(this.B.getHint())) {
                    this.B.setHint(this.f2774e0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.B.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2774e0)) {
                        setHint(hint);
                    }
                    this.B.setHint((CharSequence) null);
                }
                this.f2775f0 = true;
            }
            if (this.B != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i6) {
        c cVar = this.T0;
        if (i6 != cVar.f8740f0) {
            cVar.f8740f0 = i6;
            cVar.j(false);
        }
        if (i6 != cVar.f8738e0) {
            cVar.f8738e0 = i6;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i6) {
        c cVar = this.T0;
        TextInputLayout textInputLayout = cVar.f8729a;
        ra.d dVar = new ra.d(textInputLayout.getContext(), i6);
        ColorStateList colorStateList = dVar.f11918k;
        if (colorStateList != null) {
            cVar.f8748k = colorStateList;
        }
        float f3 = dVar.f11919l;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            cVar.f8745i = f3;
        }
        ColorStateList colorStateList2 = dVar.f11909a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = dVar.f11914f;
        cVar.U = dVar.f11915g;
        cVar.S = dVar.f11916h;
        cVar.W = dVar.j;
        ra.a aVar = cVar.f8763z;
        if (aVar != null) {
            aVar.f11902c = true;
        }
        k7.c cVar2 = new k7.c(cVar, 16);
        dVar.a();
        cVar.f8763z = new ra.a(cVar2, dVar.f11923p);
        dVar.b(textInputLayout.getContext(), cVar.f8763z);
        cVar.j(false);
        this.H0 = cVar.f8748k;
        if (this.B != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            if (this.G0 == null) {
                c cVar = this.T0;
                if (cVar.f8748k != colorStateList) {
                    cVar.f8748k = colorStateList;
                    cVar.j(false);
                }
            }
            this.H0 = colorStateList;
            if (this.B != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(w wVar) {
        this.L = wVar;
    }

    public void setMaxEms(int i6) {
        this.E = i6;
        EditText editText = this.B;
        if (editText != null && i6 != -1) {
            editText.setMaxEms(i6);
        }
    }

    public void setMaxWidth(int i6) {
        this.G = i6;
        EditText editText = this.B;
        if (editText != null && i6 != -1) {
            editText.setMaxWidth(i6);
        }
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.D = i6;
        EditText editText = this.B;
        if (editText != null && i6 != -1) {
            editText.setMinEms(i6);
        }
    }

    public void setMinWidth(int i6) {
        this.F = i6;
        EditText editText = this.B;
        if (editText != null && i6 != -1) {
            editText.setMinWidth(i6);
        }
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        l lVar = this.f2796z;
        lVar.D.setContentDescription(i6 != 0 ? lVar.getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        l lVar = this.f2796z;
        lVar.D.setImageDrawable(i6 != 0 ? c9.a.f(lVar.getContext(), i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        l lVar = this.f2796z;
        if (z10 && lVar.F != 1) {
            lVar.g(1);
        } else if (!z10) {
            lVar.g(0);
        } else {
            lVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.f2796z;
        lVar.H = colorStateList;
        y.c(lVar.f15265x, lVar.D, colorStateList, lVar.I);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.f2796z;
        lVar.I = mode;
        y.c(lVar.f15265x, lVar.D, lVar.H, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.R == null) {
            b1 b1Var = new b1(getContext(), null);
            this.R = b1Var;
            b1Var.setId(com.playfy.tv.R.id.textinput_placeholder);
            this.R.setImportantForAccessibility(1);
            this.R.setAccessibilityLiveRegion(1);
            h f3 = f();
            this.U = f3;
            f3.f9988y = 67L;
            this.V = f();
            setPlaceholderTextAppearance(this.T);
            setPlaceholderTextColor(this.S);
            q0.r(this.R, new com.google.android.material.datepicker.h(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.Q) {
                setPlaceholderTextEnabled(true);
            }
            this.P = charSequence;
        }
        EditText editText = this.B;
        if (editText != null) {
            editable = editText.getText();
        }
        x(editable);
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.T = i6;
        b1 b1Var = this.R;
        if (b1Var != null) {
            c9.a.t(b1Var, i6);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            b1 b1Var = this.R;
            if (b1Var != null && colorStateList != null) {
                b1Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        t tVar = this.f2794y;
        tVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        tVar.f15310z = charSequence2;
        tVar.f15309y.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(int i6) {
        c9.a.t(this.f2794y.f15309y, i6);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2794y.f15309y.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        i iVar = this.f2776g0;
        if (iVar != null && iVar.f13000y.f12978a != mVar) {
            this.f2782m0 = mVar;
            c();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f2794y.A.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? c9.a.f(getContext(), i6) : null);
    }

    public void setStartIconMinSize(int i6) {
        t tVar = this.f2794y;
        if (i6 >= 0) {
            if (i6 != tVar.D) {
                tVar.D = i6;
                CheckableImageButton checkableImageButton = tVar.A;
                checkableImageButton.setMinimumWidth(i6);
                checkableImageButton.setMinimumHeight(i6);
                return;
            }
            return;
        }
        tVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f2794y;
        CheckableImageButton checkableImageButton = tVar.A;
        View.OnLongClickListener onLongClickListener = tVar.F;
        checkableImageButton.setOnClickListener(onClickListener);
        y.t(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f2794y;
        tVar.F = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.A;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y.t(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.f2794y;
        tVar.E = scaleType;
        tVar.A.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f2794y;
        if (tVar.B != colorStateList) {
            tVar.B = colorStateList;
            y.c(tVar.f15308x, tVar.A, colorStateList, tVar.C);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f2794y;
        if (tVar.C != mode) {
            tVar.C = mode;
            y.c(tVar.f15308x, tVar.A, tVar.B, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f2794y.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        l lVar = this.f2796z;
        lVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        lVar.M = charSequence2;
        lVar.N.setText(charSequence);
        lVar.n();
    }

    public void setSuffixTextAppearance(int i6) {
        c9.a.t(this.f2796z.N, i6);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2796z.N.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.B;
        if (editText != null) {
            q0.r(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2797z0) {
            this.f2797z0 = typeface;
            this.T0.n(typeface);
            p pVar = this.H;
            if (typeface != pVar.B) {
                pVar.B = typeface;
                b1 b1Var = pVar.f15294r;
                if (b1Var != null) {
                    b1Var.setTypeface(typeface);
                }
                b1 b1Var2 = pVar.f15300y;
                if (b1Var2 != null) {
                    b1Var2.setTypeface(typeface);
                }
            }
            b1 b1Var3 = this.M;
            if (b1Var3 != null) {
                b1Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        b1 b1Var;
        EditText editText = this.B;
        if (editText != null && this.f2784p0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = n1.f10320a;
            Drawable mutate = background.mutate();
            if (o()) {
                mutate.setColorFilter(p.t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.K && (b1Var = this.M) != null) {
                mutate.setColorFilter(p.t.c(b1Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                s1.c.e(mutate);
                this.B.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.B;
        if (editText != null && this.f2776g0 != null) {
            if ((this.f2779j0 || editText.getBackground() == null) && this.f2784p0 != 0) {
                this.B.setBackground(getEditTextBoxBackground());
                this.f2779j0 = true;
            }
        }
    }

    public final void v() {
        if (this.f2784p0 != 1) {
            FrameLayout frameLayout = this.f2792x;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e10 = e();
            if (e10 != layoutParams.topMargin) {
                layoutParams.topMargin = e10;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        b1 b1Var;
        ColorStateList colorStateList2;
        int i6;
        boolean isEnabled = isEnabled();
        EditText editText = this.B;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.B;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.G0;
        c cVar = this.T0;
        if (colorStateList3 != null) {
            cVar.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.G0;
            if (colorStateList4 != null) {
                i6 = colorStateList4.getColorForState(new int[]{-16842910}, this.Q0);
            } else {
                i6 = this.Q0;
            }
            cVar.k(ColorStateList.valueOf(i6));
        } else if (o()) {
            b1 b1Var2 = this.H.f15294r;
            if (b1Var2 != null) {
                colorStateList2 = b1Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar.k(colorStateList2);
        } else if (this.K && (b1Var = this.M) != null) {
            cVar.k(b1Var.getTextColors());
        } else if (z13 && (colorStateList = this.H0) != null && cVar.f8748k != colorStateList) {
            cVar.f8748k = colorStateList;
            cVar.j(false);
        }
        l lVar = this.f2796z;
        t tVar = this.f2794y;
        if (!z12 && this.U0 && (!isEnabled() || !z13)) {
            if (z11 || !this.S0) {
                ValueAnimator valueAnimator = this.W0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.W0.cancel();
                }
                if (z10 && this.V0) {
                    b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    cVar.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (g() && !((za.f) this.f2776g0).f15247e0.f15245r.isEmpty() && g()) {
                    ((za.f) this.f2776g0).y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                this.S0 = true;
                b1 b1Var3 = this.R;
                if (b1Var3 != null && this.Q) {
                    b1Var3.setText((CharSequence) null);
                    o5.v.a(this.f2792x, this.V);
                    this.R.setVisibility(4);
                }
                tVar.G = true;
                tVar.e();
                lVar.O = true;
                lVar.n();
                return;
            }
            return;
        }
        if (!z11 && !this.S0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.W0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.W0.cancel();
        }
        if (z10 && this.V0) {
            b(1.0f);
        } else {
            cVar.m(1.0f);
        }
        this.S0 = false;
        if (g()) {
            l();
        }
        EditText editText3 = this.B;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        x(editable);
        tVar.G = false;
        tVar.e();
        lVar.O = false;
        lVar.n();
    }

    public final void x(Editable editable) {
        int i6;
        ((u2.i) this.L).getClass();
        if (editable != null) {
            i6 = editable.length();
        } else {
            i6 = 0;
        }
        FrameLayout frameLayout = this.f2792x;
        if (i6 == 0 && !this.S0) {
            if (this.R != null && this.Q && !TextUtils.isEmpty(this.P)) {
                this.R.setText(this.P);
                o5.v.a(frameLayout, this.U);
                this.R.setVisibility(0);
                this.R.bringToFront();
                return;
            }
            return;
        }
        b1 b1Var = this.R;
        if (b1Var != null && this.Q) {
            b1Var.setText((CharSequence) null);
            o5.v.a(frameLayout, this.V);
            this.R.setVisibility(4);
        }
    }

    public final void y(boolean z10, boolean z11) {
        int defaultColor = this.L0.getDefaultColor();
        int colorForState = this.L0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.L0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f2789u0 = colorForState2;
        } else if (z11) {
            this.f2789u0 = colorForState;
        } else {
            this.f2789u0 = defaultColor;
        }
    }

    public final void z() {
        boolean z10;
        b1 b1Var;
        EditText editText;
        EditText editText2;
        if (this.f2776g0 != null && this.f2784p0 != 0) {
            boolean z11 = false;
            if (!isFocused() && ((editText2 = this.B) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (isHovered() || ((editText = this.B) != null && editText.isHovered())) {
                z11 = true;
            }
            if (!isEnabled()) {
                this.f2789u0 = this.Q0;
            } else if (o()) {
                if (this.L0 != null) {
                    y(z10, z11);
                } else {
                    this.f2789u0 = getErrorCurrentTextColors();
                }
            } else if (this.K && (b1Var = this.M) != null) {
                if (this.L0 != null) {
                    y(z10, z11);
                } else {
                    this.f2789u0 = b1Var.getCurrentTextColor();
                }
            } else if (z10) {
                this.f2789u0 = this.K0;
            } else if (z11) {
                this.f2789u0 = this.J0;
            } else {
                this.f2789u0 = this.I0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            l lVar = this.f2796z;
            TextInputLayout textInputLayout = lVar.f15265x;
            CheckableImageButton checkableImageButton = lVar.D;
            TextInputLayout textInputLayout2 = lVar.f15265x;
            lVar.l();
            y.s(textInputLayout2, lVar.f15267z, lVar.A);
            y.s(textInputLayout2, checkableImageButton, lVar.H);
            if (lVar.b() instanceof za.i) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = s1.c.A(checkableImageButton.getDrawable()).mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    y.c(textInputLayout, checkableImageButton, lVar.H, lVar.I);
                }
            }
            t tVar = this.f2794y;
            y.s(tVar.f15308x, tVar.A, tVar.B);
            if (this.f2784p0 == 2) {
                int i6 = this.f2786r0;
                if (z10 && isEnabled()) {
                    this.f2786r0 = this.f2788t0;
                } else {
                    this.f2786r0 = this.f2787s0;
                }
                if (this.f2786r0 != i6 && g() && !this.S0) {
                    if (g()) {
                        ((za.f) this.f2776g0).y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    l();
                }
            }
            if (this.f2784p0 == 1) {
                if (!isEnabled()) {
                    this.f2790v0 = this.N0;
                } else if (z11 && !z10) {
                    this.f2790v0 = this.P0;
                } else if (z10) {
                    this.f2790v0 = this.O0;
                } else {
                    this.f2790v0 = this.M0;
                }
            }
            c();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.playfy.tv.R.attr.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2794y.A;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2794y.b(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i6) {
        super(ab.a.a(context, attributeSet, i6, com.playfy.tv.R.style.Widget_Design_TextInputLayout), attributeSet, i6);
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = new p(this);
        this.L = new u2.i(5);
        this.f2791w0 = new Rect();
        this.f2793x0 = new Rect();
        this.f2795y0 = new RectF();
        this.C0 = new LinkedHashSet();
        c cVar = new c(this);
        this.T0 = cVar;
        this.Z0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2792x = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = a.f12953a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.f8741g != 8388659) {
            cVar.f8741g = 8388659;
            cVar.j(false);
        }
        n.a(context2, attributeSet, i6, com.playfy.tv.R.style.Widget_Design_TextInputLayout);
        int[] iArr = t9.a.Q;
        n.b(context2, attributeSet, iArr, i6, com.playfy.tv.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i6, com.playfy.tv.R.style.Widget_Design_TextInputLayout);
        n9.j jVar = new n9.j(context2, obtainStyledAttributes);
        t tVar = new t(this, jVar);
        this.f2794y = tVar;
        this.f2773d0 = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.V0 = obtainStyledAttributes.getBoolean(47, true);
        this.U0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2782m0 = m.c(context2, attributeSet, i6, com.playfy.tv.R.style.Widget_Design_TextInputLayout).a();
        this.o0 = context2.getResources().getDimensionPixelOffset(com.playfy.tv.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2785q0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.A = getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f2787s0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2788t0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.playfy.tv.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2786r0 = this.f2787s0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        ua.l g10 = this.f2782m0.g();
        if (dimension >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            g10.f13007e = new ua.a(dimension);
        }
        if (dimension2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            g10.f13008f = new ua.a(dimension2);
        }
        if (dimension3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            g10.f13009g = new ua.a(dimension3);
        }
        if (dimension4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            g10.f13010h = new ua.a(dimension4);
        }
        this.f2782m0 = g10.a();
        ColorStateList j = a8.i.j(context2, jVar, 7);
        if (j != null) {
            int defaultColor = j.getDefaultColor();
            this.M0 = defaultColor;
            this.f2790v0 = defaultColor;
            if (j.isStateful()) {
                this.N0 = j.getColorForState(new int[]{-16842910}, -1);
                this.O0 = j.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.P0 = j.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.O0 = this.M0;
                ColorStateList d10 = f.d(context2, com.playfy.tv.R.color.mtrl_filled_background_color);
                this.N0 = d10.getColorForState(new int[]{-16842910}, -1);
                this.P0 = d10.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2790v0 = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
            this.P0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList t10 = jVar.t(1);
            this.H0 = t10;
            this.G0 = t10;
        }
        ColorStateList j10 = a8.i.j(context2, jVar, 14);
        this.K0 = obtainStyledAttributes.getColor(14, 0);
        this.I0 = f.c(context2, com.playfy.tv.R.color.mtrl_textinput_default_box_stroke_color);
        this.Q0 = f.c(context2, com.playfy.tv.R.color.mtrl_textinput_disabled_color);
        this.J0 = f.c(context2, com.playfy.tv.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (j10 != null) {
            setBoxStrokeColorStateList(j10);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(a8.i.j(context2, jVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.f2771b0 = jVar.t(24);
        this.f2772c0 = jVar.t(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i10 = obtainStyledAttributes.getInt(34, 1);
        boolean z10 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z11 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z12 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.O = obtainStyledAttributes.getResourceId(22, 0);
        this.N = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.N);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.O);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(jVar.t(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(jVar.t(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(jVar.t(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(jVar.t(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(jVar.t(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(jVar.t(59));
        }
        l lVar = new l(this, jVar);
        this.f2796z = lVar;
        boolean z13 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        jVar.G();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(tVar);
        frameLayout.addView(lVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2796z.D.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2796z.D.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2796z.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2796z.D;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.f2796z;
        TextInputLayout textInputLayout = lVar.f15265x;
        CheckableImageButton checkableImageButton = lVar.D;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            y.c(textInputLayout, checkableImageButton, lVar.H, lVar.I);
            y.s(textInputLayout, checkableImageButton, lVar.H);
        }
    }
}
