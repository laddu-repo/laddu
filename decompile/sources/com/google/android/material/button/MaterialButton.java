package com.google.android.material.button;

import a2.e0;
import a8.i;
import aa.a;
import aa.b;
import aa.d;
import aa.f;
import aa.g;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import d1.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ma.n;
import p.p;
import s1.c;
import ua.a0;
import ua.l;
import ua.m;
import ua.v;
import ua.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialButton extends p implements Checkable, v {

    /* renamed from: f0 */
    public static final int[] f2637f0 = {R.attr.state_checkable};

    /* renamed from: g0 */
    public static final int[] f2638g0 = {R.attr.state_checked};

    /* renamed from: h0 */
    public static final a f2639h0 = new a(0);
    public final g A;
    public final LinkedHashSet B;
    public b C;
    public PorterDuff.Mode D;
    public ColorStateList E;
    public Drawable F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public LinearLayout.LayoutParams S;
    public boolean T;
    public int U;
    public boolean V;
    public int W;

    /* renamed from: a0 */
    public a0 f2640a0;

    /* renamed from: b0 */
    public int f2641b0;

    /* renamed from: c0 */
    public float f2642c0;

    /* renamed from: d0 */
    public float f2643d0;

    /* renamed from: e0 */
    public e f2644e0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(ab.a.b(context, attributeSet, com.playfy.tv.R.attr.materialButtonStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Button, new int[]{com.playfy.tv.R.attr.materialSizeOverlay}), attributeSet, com.playfy.tv.R.attr.materialButtonStyle);
        m a10;
        this.B = new LinkedHashSet();
        this.L = false;
        this.M = false;
        this.O = -1;
        this.P = -1.0f;
        this.Q = -1;
        this.R = -1;
        this.W = -1;
        Context context2 = getContext();
        TypedArray f3 = n.f(context2, attributeSet, t9.a.f12690t, com.playfy.tv.R.attr.materialButtonStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.K = f3.getDimensionPixelSize(13, 0);
        int i6 = f3.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.D = n.g(i6, mode);
        this.E = i.i(getContext(), f3, 15);
        this.F = i.l(getContext(), f3, 11);
        this.N = f3.getInteger(12, 1);
        this.H = f3.getDimensionPixelSize(14, 0);
        y b10 = y.b(context2, f3, 19);
        if (b10 != null) {
            a10 = b10.c();
        } else {
            a10 = m.c(context2, attributeSet, com.playfy.tv.R.attr.materialButtonStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Button).a();
        }
        boolean z10 = f3.getBoolean(17, false);
        g gVar = new g(this, a10);
        this.A = gVar;
        gVar.f656f = f3.getDimensionPixelOffset(2, 0);
        gVar.f657g = f3.getDimensionPixelOffset(3, 0);
        gVar.f658h = f3.getDimensionPixelOffset(4, 0);
        gVar.f659i = f3.getDimensionPixelOffset(5, 0);
        if (f3.hasValue(9)) {
            int dimensionPixelSize = f3.getDimensionPixelSize(9, -1);
            gVar.j = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            l g10 = gVar.f652b.g();
            g10.f13007e = new ua.a(f10);
            g10.f13008f = new ua.a(f10);
            g10.f13009g = new ua.a(f10);
            g10.f13010h = new ua.a(f10);
            gVar.f652b = g10.a();
            gVar.f653c = null;
            gVar.d();
            gVar.s = true;
        }
        gVar.f660k = f3.getDimensionPixelSize(22, 0);
        gVar.f661l = n.g(f3.getInt(8, -1), mode);
        gVar.f662m = i.i(getContext(), f3, 7);
        gVar.f663n = i.i(getContext(), f3, 21);
        gVar.f664o = i.i(getContext(), f3, 18);
        gVar.f668t = f3.getBoolean(6, false);
        gVar.f671w = f3.getDimensionPixelSize(10, 0);
        gVar.f669u = f3.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f3.hasValue(0)) {
            gVar.f667r = true;
            setSupportBackgroundTintList(gVar.f662m);
            setSupportBackgroundTintMode(gVar.f661l);
        } else {
            gVar.c();
        }
        setPaddingRelative(paddingStart + gVar.f656f, paddingTop + gVar.f658h, paddingEnd + gVar.f657g, paddingBottom + gVar.f659i);
        setCheckedInternal(f3.getBoolean(1, false));
        if (b10 != null) {
            gVar.f654d = d();
            if (gVar.f653c != null) {
                gVar.d();
            }
            gVar.f653c = b10;
            gVar.d();
        }
        setOpticalCenterEnabled(z10);
        f3.recycle();
        setCompoundDrawablePadding(this.K);
        h(this.F != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.U = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    public float getDisplayedWidthIncrease() {
        return this.f2642c0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        ua.i a10;
        if (!this.T || !this.V || (a10 = this.A.a(false)) == null) {
            return 0;
        }
        return (int) (a10.i() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i6 = 0; i6 < lineCount; i6++) {
            f3 = Math.max(f3, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(f3);
    }

    private void setCheckedInternal(boolean z10) {
        g gVar = this.A;
        if (gVar != null && gVar.f668t && this.L != z10) {
            this.L = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.L;
                if (!materialButtonToggleGroup.I) {
                    materialButtonToggleGroup.f(getId(), z11);
                }
            }
            if (!this.M) {
                this.M = true;
                Iterator it = this.B.iterator();
                if (!it.hasNext()) {
                    this.M = false;
                    return;
                }
                throw r4.a.i(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f3) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f2642c0 != f3) {
            this.f2642c0 = f3;
            j();
            invalidate();
            if (getParent() instanceof f) {
                f fVar = (f) getParent();
                int i6 = (int) this.f2642c0;
                int indexOfChild = fVar.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i10 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i10 >= 0) {
                            if (fVar.c(i10)) {
                                materialButton2 = (MaterialButton) fVar.getChildAt(i10);
                                break;
                            }
                            i10--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = fVar.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild >= childCount) {
                            break;
                        } else if (fVar.c(indexOfChild)) {
                            materialButton = (MaterialButton) fVar.getChildAt(indexOfChild);
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i6);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i6);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i6 / 2);
                            materialButton.setDisplayedWidthDecrease((i6 + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final d1.f d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue o10 = a8.g.o(context, com.playfy.tv.R.attr.motionSpringFastSpatial);
        int[] iArr = t9.a.D;
        if (o10 == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, com.playfy.tv.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(o10.resourceId, iArr);
        }
        d1.f fVar = new d1.f();
        try {
            float f3 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f3 != Float.MIN_VALUE) {
                float f10 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE) {
                    fVar.b(f3);
                    fVar.a(f10);
                    return fVar;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        g gVar = this.A;
        if (gVar != null && !gVar.f667r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (r1 == 2) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            ua.a0 r0 = r8.f2640a0
            if (r0 != 0) goto L6
            goto L86
        L6:
            d1.e r0 = r8.f2644e0
            if (r0 != 0) goto L19
            d1.e r0 = new d1.e
            aa.a r1 = com.google.android.material.button.MaterialButton.f2639h0
            r0.<init>(r8, r1)
            r8.f2644e0 = r0
            d1.f r1 = r8.d()
            r0.f3682m = r1
        L19:
            boolean r0 = r8.V
            if (r0 == 0) goto L86
            int r0 = r8.f2641b0
            ua.a0 r1 = r8.f2640a0
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f12970c
            r4 = 0
            r5 = 0
        L29:
            int r6 = r1.f12968a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = -1
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.f12970c
            r5 = 0
        L42:
            int r6 = r1.f12968a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            k7.d r1 = r1.f12969b
            goto L5d
        L59:
            k7.d[] r1 = r1.f12971d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f7747y
            ua.z r1 = (ua.z) r1
            int r2 = r8.getWidth()
            float r3 = r1.f13066b
            int r1 = r1.f13065a
            r5 = 1
            if (r1 != r5) goto L71
            float r1 = (float) r2
            float r3 = r3 * r1
        L6f:
            int r4 = (int) r3
            goto L75
        L71:
            r2 = 2
            if (r1 != r2) goto L75
            goto L6f
        L75:
            int r0 = java.lang.Math.min(r0, r4)
            d1.e r1 = r8.f2644e0
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L86
            d1.e r9 = r8.f2644e0
            r9.d()
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i6 = this.N;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3 && i6 != 4) {
                if (i6 != 16 && i6 != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.F, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.F, null);
            return;
        }
        setCompoundDrawablesRelative(this.F, null, null, null);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.G)) {
            return this.G;
        }
        g gVar = this.A;
        if (gVar != null && gVar.f668t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.W;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.A.j;
        }
        return 0;
    }

    public d1.f getCornerSpringForce() {
        return this.A.f654d;
    }

    public Drawable getIcon() {
        return this.F;
    }

    public int getIconGravity() {
        return this.N;
    }

    public int getIconPadding() {
        return this.K;
    }

    public int getIconSize() {
        return this.H;
    }

    public ColorStateList getIconTint() {
        return this.E;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.D;
    }

    public int getInsetBottom() {
        return this.A.f659i;
    }

    public int getInsetTop() {
        return this.A.f658h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.A.f664o;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (e()) {
            return this.A.f652b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public y getStateListShapeAppearanceModel() {
        if (e()) {
            return this.A.f653c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.A.f663n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.A.f660k;
        }
        return 0;
    }

    @Override // p.p
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.A.f662m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // p.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.A.f661l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.F;
        if (drawable != null) {
            Drawable mutate = c.A(drawable).mutate();
            this.F = mutate;
            mutate.setTintList(this.E);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                this.F.setTintMode(mode);
            }
            int i6 = this.H;
            if (i6 == 0) {
                i6 = this.F.getIntrinsicWidth();
            }
            int i10 = this.H;
            if (i10 == 0) {
                i10 = this.F.getIntrinsicHeight();
            }
            Drawable drawable2 = this.F;
            int i11 = this.I;
            int i12 = this.J;
            drawable2.setBounds(i11, i12, i6 + i11, i10 + i12);
            this.F.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.N;
        if (((i13 != 1 && i13 != 2) || drawable3 == this.F) && (((i13 != 3 && i13 != 4) || drawable5 == this.F) && ((i13 != 16 && i13 != 32) || drawable4 == this.F))) {
            return;
        }
        g();
    }

    public final void i(int i6, int i10) {
        boolean z10;
        if (this.F != null && getLayout() != null) {
            int i11 = this.N;
            boolean z11 = true;
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                if (i11 != 16 && i11 != 32) {
                    return;
                }
                this.I = 0;
                if (i11 == 16) {
                    this.J = 0;
                    h(false);
                    return;
                }
                int i12 = this.H;
                if (i12 == 0) {
                    i12 = this.F.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.K) - getPaddingBottom()) / 2);
                if (this.J != max) {
                    this.J = max;
                    h(false);
                    return;
                }
                return;
            }
            this.J = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.N;
            if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i14 = this.H;
                if (i14 == 0) {
                    i14 = this.F.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i6 - getTextLayoutWidth()) - getPaddingEnd()) - i14) - this.K) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.N != 4) {
                    z11 = false;
                }
                if (z10 != z11) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.I != textLayoutWidth) {
                    this.I = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.I = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.L;
    }

    public final void j() {
        int i6 = (int) (this.f2642c0 - this.f2643d0);
        int i10 = (i6 / 2) + this.U;
        getLayoutParams().width = (int) (this.P + i6);
        setPaddingRelative(this.Q + i10, getPaddingTop(), (this.R + i6) - i10, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            lg.c.s(this, this.A.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        g gVar = this.A;
        if (gVar != null && gVar.f668t) {
            View.mergeDrawableStates(onCreateDrawableState, f2637f0);
        }
        if (this.L) {
            View.mergeDrawableStates(onCreateDrawableState, f2638g0);
        }
        return onCreateDrawableState;
    }

    @Override // p.p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.L);
    }

    @Override // p.p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        g gVar = this.A;
        if (gVar != null && gVar.f668t) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(this.L);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p.p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        g gVar;
        super.onLayout(z10, i6, i10, i11, i12);
        if (Build.VERSION.SDK_INT == 21 && (gVar = this.A) != null) {
            int i14 = i12 - i10;
            int i15 = i11 - i6;
            ua.i iVar = gVar.f665p;
            if (iVar != null) {
                iVar.setBounds(gVar.f656f, gVar.f658h, i15 - gVar.f657g, i14 - gVar.f659i);
            }
        }
        i(getMeasuredWidth(), getMeasuredHeight());
        int i16 = getResources().getConfiguration().orientation;
        if (this.O != i16) {
            this.O = i16;
            this.P = -1.0f;
        }
        if (this.P == -1.0f) {
            this.P = getMeasuredWidth();
            if (this.S == null && (getParent() instanceof f) && ((f) getParent()).getButtonSizeChange() != null) {
                this.S = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.S);
                layoutParams.width = (int) this.P;
                setLayoutParams(layoutParams);
            }
        }
        boolean z11 = false;
        if (this.W == -1) {
            if (this.F == null) {
                i13 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i17 = this.H;
                if (i17 == 0) {
                    i17 = this.F.getIntrinsicWidth();
                }
                i13 = iconPadding + i17;
            }
            this.W = (getMeasuredWidth() - getTextLayoutWidth()) - i13;
        }
        if (this.Q == -1) {
            this.Q = getPaddingStart();
        }
        if (this.R == -1) {
            this.R = getPaddingEnd();
        }
        if ((getParent() instanceof f) && ((f) getParent()).getOrientation() == 0) {
            z11 = true;
        }
        this.V = z11;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f15113x);
        setChecked(dVar.f645z);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z0.b, android.os.Parcelable, aa.d] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new z0.b(super.onSaveInstanceState());
        bVar.f645z = this.L;
        return bVar;
    }

    @Override // p.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.A.f669u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.F != null) {
            if (this.F.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.G = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (e()) {
            g gVar = this.A;
            if (gVar.a(false) != null) {
                gVar.a(false).setTint(i6);
                return;
            }
            return;
        }
        super.setBackgroundColor(i6);
    }

    @Override // p.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                g gVar = this.A;
                gVar.f667r = true;
                MaterialButton materialButton = gVar.f651a;
                materialButton.setSupportBackgroundTintList(gVar.f662m);
                materialButton.setSupportBackgroundTintMode(gVar.f661l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.p, android.view.View
    public void setBackgroundResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = c9.a.f(getContext(), i6);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.A.f668t = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i6) {
        if (e()) {
            g gVar = this.A;
            if (!gVar.s || gVar.j != i6) {
                gVar.j = i6;
                gVar.s = true;
                float f3 = i6;
                l g10 = gVar.f652b.g();
                g10.f13007e = new ua.a(f3);
                g10.f13008f = new ua.a(f3);
                g10.f13009g = new ua.a(f3);
                g10.f13010h = new ua.a(f3);
                gVar.f652b = g10.a();
                gVar.f653c = null;
                gVar.d();
            }
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    public void setCornerSpringForce(d1.f fVar) {
        g gVar = this.A;
        gVar.f654d = fVar;
        if (gVar.f653c != null) {
            gVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i6) {
        this.f2643d0 = Math.min(i6, this.W);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (e()) {
            this.A.a(false).p(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.F != drawable) {
            this.F = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i6) {
        if (this.N != i6) {
            this.N = i6;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.K != i6) {
            this.K = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = c9.a.f(getContext(), i6);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i6) {
        if (i6 >= 0) {
            if (this.H != i6) {
                this.H = i6;
                h(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.D != mode) {
            this.D = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(i0.f.d(getContext(), i6));
    }

    public void setInsetBottom(int i6) {
        g gVar = this.A;
        gVar.b(gVar.f658h, i6);
    }

    public void setInsetTop(int i6) {
        g gVar = this.A;
        gVar.b(i6, gVar.f659i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.C = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            g gVar = this.A;
            if (z10) {
                e0 e0Var = new e0(this, 6);
                gVar.f655e = e0Var;
                ua.i a10 = gVar.a(false);
                if (a10 != null) {
                    a10.f12998b0 = e0Var;
                }
            } else {
                gVar.f655e = null;
                ua.i a11 = gVar.a(false);
                if (a11 != null) {
                    a11.f12998b0 = null;
                }
            }
            post(new a2.a(this, 4));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.C;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((lc.c) bVar).f8328x).invalidate();
        }
        super.setPressed(z10);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            g gVar = this.A;
            MaterialButton materialButton = gVar.f651a;
            if (gVar.f664o != colorStateList) {
                gVar.f664o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(sa.b.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i6) {
        if (e()) {
            setRippleColor(i0.f.d(getContext(), i6));
        }
    }

    @Override // ua.v
    public void setShapeAppearanceModel(m mVar) {
        if (e()) {
            g gVar = this.A;
            gVar.f652b = mVar;
            gVar.f653c = null;
            gVar.d();
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            g gVar = this.A;
            gVar.f666q = z10;
            gVar.e();
        }
    }

    public void setSizeChange(a0 a0Var) {
        if (this.f2640a0 != a0Var) {
            this.f2640a0 = a0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(y yVar) {
        if (e()) {
            g gVar = this.A;
            if (gVar.f654d == null && yVar.d()) {
                gVar.f654d = d();
                if (gVar.f653c != null) {
                    gVar.d();
                }
            }
            gVar.f653c = yVar;
            gVar.d();
            return;
        }
        throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            g gVar = this.A;
            if (gVar.f663n != colorStateList) {
                gVar.f663n = colorStateList;
                gVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i6) {
        if (e()) {
            setStrokeColor(i0.f.d(getContext(), i6));
        }
    }

    public void setStrokeWidth(int i6) {
        if (e()) {
            g gVar = this.A;
            if (gVar.f660k != i6) {
                gVar.f660k = i6;
                gVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // p.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            g gVar = this.A;
            if (gVar.f662m != colorStateList) {
                gVar.f662m = colorStateList;
                if (gVar.a(false) != null) {
                    gVar.a(false).setTintList(gVar.f662m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // p.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            g gVar = this.A;
            if (gVar.f661l != mode) {
                gVar.f661l = mode;
                if (gVar.a(false) != null && gVar.f661l != null) {
                    gVar.a(false).setTintMode(gVar.f661l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.A.f669u = z10;
    }

    @Override // android.widget.TextView
    public void setWidth(int i6) {
        this.P = -1.0f;
        super.setWidth(i6);
    }

    public void setWidthChangeMax(int i6) {
        if (this.f2641b0 != i6) {
            this.f2641b0 = i6;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.L);
    }
}
