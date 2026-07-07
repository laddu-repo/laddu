package com.google.android.material.chip;

import a8.i;
import ab.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.p4;
import com.unity3d.services.UnityAdsConstants;
import ea.b;
import ea.c;
import ea.d;
import ea.e;
import ea.f;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.lang.ref.WeakReference;
import java.util.Locale;
import ma.g;
import ma.h;
import ma.l;
import ma.n;
import okhttp3.HttpUrl;
import p.q;
import t0.q0;
import u5.r;
import ua.m;
import ua.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Chip extends q implements e, v, h {
    public static final Rect U = new Rect();
    public static final int[] V = {R.attr.state_selected};
    public static final int[] W = {R.attr.state_checkable};
    public f B;
    public InsetDrawable C;
    public RippleDrawable D;
    public View.OnClickListener E;
    public CompoundButton.OnCheckedChangeListener F;
    public g G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public CharSequence O;
    public final d P;
    public boolean Q;
    public final Rect R;
    public final RectF S;
    public final b T;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.playfy.tv.R.attr.chipStyle);
        ra.d dVar;
        float dimension;
        int resourceId;
        this.R = new Rect();
        this.S = new RectF();
        this.T = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.L0;
        int[] iArr = t9.a.f12679g;
        TypedArray f3 = n.f(context3, attributeSet, iArr, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f4529l1 = f3.hasValue(37);
        Context context4 = fVar.L0;
        ColorStateList i6 = i.i(context4, f3, 24);
        if (fVar.f4514e0 != i6) {
            fVar.f4514e0 = i6;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList i10 = i.i(context4, f3, 11);
        if (fVar.f4516f0 != i10) {
            fVar.f4516f0 = i10;
            fVar.onStateChange(fVar.getState());
        }
        float dimension2 = f3.getDimension(19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.f4518g0 != dimension2) {
            fVar.f4518g0 = dimension2;
            fVar.invalidateSelf();
            fVar.F();
        }
        if (f3.hasValue(12)) {
            fVar.L(f3.getDimension(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        fVar.Q(i.i(context4, f3, 22));
        fVar.R(f3.getDimension(23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.b0(i.i(context4, f3, 36));
        CharSequence text = f3.getText(5);
        text = text == null ? HttpUrl.FRAGMENT_ENCODE_SET : text;
        boolean equals = TextUtils.equals(fVar.f4528l0, text);
        l lVar = fVar.R0;
        if (!equals) {
            fVar.f4528l0 = text;
            lVar.f8789e = true;
            fVar.invalidateSelf();
            fVar.F();
        }
        if (f3.hasValue(0) && (resourceId = f3.getResourceId(0, 0)) != 0) {
            dVar = new ra.d(context4, resourceId);
        } else {
            dVar = null;
        }
        dVar.f11919l = f3.getDimension(1, dVar.f11919l);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            dVar.f11918k = i.i(context4, f3, 2);
        }
        lVar.b(dVar, context4);
        int i12 = f3.getInt(3, 0);
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    fVar.f4523i1 = TextUtils.TruncateAt.END;
                }
            } else {
                fVar.f4523i1 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            fVar.f4523i1 = TextUtils.TruncateAt.START;
        }
        fVar.P(f3.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.P(f3.getBoolean(15, false));
        }
        fVar.M(i.l(context4, f3, 14));
        if (f3.hasValue(17)) {
            fVar.O(i.i(context4, f3, 17));
        }
        fVar.N(f3.getDimension(16, -1.0f));
        fVar.Y(f3.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.Y(f3.getBoolean(26, false));
        }
        fVar.S(i.l(context4, f3, 25));
        fVar.X(i.i(context4, f3, 30));
        fVar.U(f3.getDimension(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.H(f3.getBoolean(6, false));
        fVar.K(f3.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.K(f3.getBoolean(8, false));
        }
        fVar.I(i.l(context4, f3, 7));
        if (f3.hasValue(9)) {
            fVar.J(i.i(context4, f3, 9));
        }
        fVar.B0 = u9.e.a(context4, f3, 39);
        fVar.C0 = u9.e.a(context4, f3, 33);
        float dimension3 = f3.getDimension(21, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.D0 != dimension3) {
            fVar.D0 = dimension3;
            fVar.invalidateSelf();
            fVar.F();
        }
        fVar.a0(f3.getDimension(35, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.Z(f3.getDimension(34, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension4 = f3.getDimension(41, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.G0 != dimension4) {
            fVar.G0 = dimension4;
            fVar.invalidateSelf();
            fVar.F();
        }
        float dimension5 = f3.getDimension(40, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.H0 != dimension5) {
            fVar.H0 = dimension5;
            fVar.invalidateSelf();
            fVar.F();
        }
        fVar.V(f3.getDimension(29, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fVar.T(f3.getDimension(27, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float dimension6 = f3.getDimension(13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fVar.K0 != dimension6) {
            fVar.K0 = dimension6;
            fVar.invalidateSelf();
            fVar.F();
        }
        fVar.f4527k1 = f3.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f3.recycle();
        n.a(context2, attributeSet, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action);
        this.L = obtainStyledAttributes.getBoolean(32, false);
        TypedValue o10 = a8.g.o(context2, com.playfy.tv.R.attr.minTouchTargetSize);
        if (o10 != null && o10.type == 5) {
            dimension = o10.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(com.playfy.tv.R.dimen.mtrl_min_touch_target_size);
        }
        this.N = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.p(getElevation());
        n.a(context2, attributeSet, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.playfy.tv.R.attr.chipStyle, com.playfy.tv.R.style.Widget_MaterialComponents_Chip_Action);
        if (i11 < 23) {
            setTextColor(i.i(context2, obtainStyledAttributes2, 2));
        }
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.P = new d(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.H);
        setText(fVar.f4528l0);
        setEllipsize(fVar.f4523i1);
        g();
        if (!this.B.f4525j1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.L) {
            setMinHeight(this.N);
        }
        this.M = getLayoutDirection();
        super.setOnCheckedChangeListener(new ea.a(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.S;
        rectF.setEmpty();
        if (c() && this.E != null) {
            f fVar = this.B;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.e0()) {
                float f3 = fVar.K0 + fVar.J0 + fVar.f4538v0 + fVar.I0 + fVar.H0;
                if (s1.c.o(fVar) == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f3;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i6 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.R;
        rect.set(i6, i10, i11, i12);
        return rect;
    }

    private ra.d getTextAppearance() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.R0.f8791g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            refreshDrawableState();
        }
    }

    public final void b(int i6) {
        int i10;
        int i11;
        this.N = i6;
        if (!this.L) {
            InsetDrawable insetDrawable = this.C;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.C = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        int max = Math.max(0, i6 - ((int) this.B.f4518g0));
        int max2 = Math.max(0, i6 - this.B.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.C;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.C = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        if (max2 > 0) {
            i10 = max2 / 2;
        } else {
            i10 = 0;
        }
        if (max > 0) {
            i11 = max / 2;
        } else {
            i11 = 0;
        }
        if (this.C != null) {
            Rect rect = new Rect();
            this.C.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                e();
                return;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        this.C = new InsetDrawable((Drawable) this.B, i10, i11, i10, i11);
        e();
    }

    public final boolean c() {
        f fVar = this.B;
        if (fVar != null) {
            Object obj = fVar.f4535s0;
            if (obj != null) {
                if (obj instanceof m0.c) {
                    obj = ((m0.d) ((m0.c) obj)).C;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void d() {
        f fVar;
        if (c() && (fVar = this.B) != null && fVar.f4534r0 && this.E != null) {
            q0.r(this, this.P);
            this.Q = true;
        } else {
            q0.r(this, null);
            this.Q = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i6;
        if (!this.Q) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.P;
        AccessibilityManager accessibilityManager = dVar.f123h;
        int i10 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i6 = dVar.f127m) != Integer.MIN_VALUE) {
                    if (i6 != Integer.MIN_VALUE) {
                        dVar.f127m = Integer.MIN_VALUE;
                        dVar.r(Integer.MIN_VALUE, 128);
                        dVar.r(i6, 256);
                        return true;
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                Chip chip = dVar.f4508q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x10, y9)) {
                    i10 = 1;
                }
                int i11 = dVar.f127m;
                if (i11 != i10) {
                    dVar.f127m = i10;
                    dVar.r(i10, 128);
                    dVar.r(i11, 256);
                    return true;
                }
            }
            return true;
        }
        if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.Q) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.P;
        dVar.getClass();
        boolean z10 = false;
        int i6 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i10 = 130;
                                        }
                                    } else {
                                        i10 = 17;
                                    }
                                } else {
                                    i10 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i6 < repeatCount && dVar.m(i10, null)) {
                                    i6++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = dVar.f126l;
                    if (i11 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f4508q;
                        if (i11 == 0) {
                            chip.performClick();
                        } else if (i11 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.E;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.Q) {
                                chip.P.r(1, 1);
                            }
                        }
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = dVar.m(1, null);
            }
        }
        if (z10 && dVar.f126l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // p.q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.B;
        boolean z10 = false;
        int i6 = 0;
        z10 = false;
        if (fVar != null && f.E(fVar.f4535s0)) {
            f fVar2 = this.B;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.K) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.J) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.I) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i6 = 1;
            }
            if (this.K) {
                iArr[i6] = 16842908;
                i6++;
            }
            if (this.J) {
                iArr[i6] = 16843623;
                i6++;
            }
            if (this.I) {
                iArr[i6] = 16842919;
                i6++;
            }
            if (isChecked()) {
                iArr[i6] = 16842913;
            }
            z10 = fVar2.W(iArr);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        this.D = new RippleDrawable(sa.b.b(this.B.f4526k0), getBackgroundDrawable(), null);
        this.B.getClass();
        setBackground(this.D);
        f();
    }

    public final void f() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.B) != null) {
            int B = (int) (fVar.B() + fVar.K0 + fVar.H0);
            f fVar2 = this.B;
            int A = (int) (fVar2.A() + fVar2.D0 + fVar2.G0);
            if (this.C != null) {
                Rect rect = new Rect();
                this.C.getPadding(rect);
                A += rect.left;
                B += rect.right;
            }
            setPaddingRelative(A, getPaddingTop(), B, getPaddingBottom());
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.B;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        ra.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.T);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.O)) {
            return this.O;
        }
        f fVar = this.B;
        if (fVar != null && fVar.f4540x0) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).E.f8726d) {
                return "android.widget.RadioButton";
            }
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.C;
        if (insetDrawable == null) {
            return this.B;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4542z0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.A0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4516f0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.B;
        if (fVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVar.C());
    }

    public Drawable getChipDrawable() {
        return this.B;
    }

    public float getChipEndPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.K0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.B;
        if (fVar == null || (drawable = fVar.f4531n0) == 0) {
            return null;
        }
        if (drawable instanceof m0.c) {
            return ((m0.d) ((m0.c) drawable)).C;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4532p0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.o0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4518g0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getChipStartPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.D0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4522i0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4524j0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.B;
        if (fVar == null || (drawable = fVar.f4535s0) == 0) {
            return null;
        }
        if (drawable instanceof m0.c) {
            return ((m0.d) ((m0.c) drawable)).C;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4539w0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.J0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconSize() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4538v0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.I0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4537u0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4523i1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.Q) {
            d dVar = this.P;
            if (dVar.f126l == 1 || dVar.f125k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public u9.e getHideMotionSpec() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.C0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.F0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getIconStartPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.E0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.f4526k0;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.B.f13000y.f12978a;
    }

    public u9.e getShowMotionSpec() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.B0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.H0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getTextStartPadding() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.G0;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lg.c.s(this, this.B);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, V);
        }
        f fVar = this.B;
        if (fVar != null && fVar.f4540x0) {
            View.mergeDrawableStates(onCreateDrawableState, W);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        super.onFocusChanged(z10, i6, rect);
        if (this.Q) {
            d dVar = this.P;
            int i10 = dVar.f126l;
            if (i10 != Integer.MIN_VALUE) {
                dVar.j(i10);
            }
            if (z10) {
                dVar.m(i6, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.B;
        if (fVar != null && fVar.f4540x0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i10 = -1;
            if (chipGroup.f8768z) {
                i6 = 0;
                for (int i11 = 0; i11 < chipGroup.getChildCount(); i11++) {
                    View childAt = chipGroup.getChildAt(i11);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i11).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
            i6 = -1;
            Object tag = getTag(com.playfy.tv.R.id.row_index_key);
            if (tag instanceof Integer) {
                i10 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) r.w(i10, 1, i6, 1, isChecked()).f12916y);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i6);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.M != i6) {
            this.M = i6;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.I
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = 1
            goto L51
        L2c:
            boolean r0 = r5.I
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.E
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.Q
            if (r0 == 0) goto L43
            ea.d r0 = r5.P
            r0.r(r2, r2)
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.O = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.D) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.D) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p.q, android.view.View
    public void setBackgroundResource(int i6) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.H(z10);
        }
    }

    public void setCheckableResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.H(fVar.L0.getResources().getBoolean(i6));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        f fVar = this.B;
        if (fVar == null) {
            this.H = z10;
        } else if (fVar.f4540x0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.I(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.I(c9.a.f(fVar.L0, i6));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.J(i0.f.d(fVar.L0, i6));
        }
    }

    public void setCheckedIconVisible(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.K(fVar.L0.getResources().getBoolean(i6));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.B;
        if (fVar != null && fVar.f4516f0 != colorStateList) {
            fVar.f4516f0 = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i6) {
        ColorStateList d10;
        f fVar = this.B;
        if (fVar != null && fVar.f4516f0 != (d10 = i0.f.d(fVar.L0, i6))) {
            fVar.f4516f0 = d10;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.L(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.L(fVar.L0.getResources().getDimension(i6));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.B;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f4521h1 = new WeakReference(null);
            }
            this.B = fVar;
            fVar.f4525j1 = false;
            fVar.f4521h1 = new WeakReference(this);
            b(this.N);
        }
    }

    public void setChipEndPadding(float f3) {
        f fVar = this.B;
        if (fVar != null && fVar.K0 != f3) {
            fVar.K0 = f3;
            fVar.invalidateSelf();
            fVar.F();
        }
    }

    public void setChipEndPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            float dimension = fVar.L0.getResources().getDimension(i6);
            if (fVar.K0 != dimension) {
                fVar.K0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.M(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.M(c9.a.f(fVar.L0, i6));
        }
    }

    public void setChipIconSize(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.N(f3);
        }
    }

    public void setChipIconSizeResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.N(fVar.L0.getResources().getDimension(i6));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.O(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.O(i0.f.d(fVar.L0, i6));
        }
    }

    public void setChipIconVisible(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.P(fVar.L0.getResources().getBoolean(i6));
        }
    }

    public void setChipMinHeight(float f3) {
        f fVar = this.B;
        if (fVar != null && fVar.f4518g0 != f3) {
            fVar.f4518g0 = f3;
            fVar.invalidateSelf();
            fVar.F();
        }
    }

    public void setChipMinHeightResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            float dimension = fVar.L0.getResources().getDimension(i6);
            if (fVar.f4518g0 != dimension) {
                fVar.f4518g0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        f fVar = this.B;
        if (fVar != null && fVar.D0 != f3) {
            fVar.D0 = f3;
            fVar.invalidateSelf();
            fVar.F();
        }
    }

    public void setChipStartPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            float dimension = fVar.L0.getResources().getDimension(i6);
            if (fVar.D0 != dimension) {
                fVar.D0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.Q(i0.f.d(fVar.L0, i6));
        }
    }

    public void setChipStrokeWidth(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.R(f3);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.R(fVar.L0.getResources().getDimension(i6));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.S(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        r0.b bVar;
        f fVar = this.B;
        if (fVar != null && fVar.f4539w0 != charSequence) {
            String str = r0.b.f11245b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = r0.b.f11248e;
            } else {
                bVar = r0.b.f11247d;
            }
            bVar.getClass();
            p4 p4Var = r0.f.f11255a;
            fVar.f4539w0 = bVar.c(charSequence);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.T(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.T(fVar.L0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.S(c9.a.f(fVar.L0, i6));
        }
        d();
    }

    public void setCloseIconSize(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.U(f3);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.U(fVar.L0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.V(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.V(fVar.L0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.X(i0.f.d(fVar.L0, i6));
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    @Override // p.q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // p.q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i6, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        f fVar = this.B;
        if (fVar != null) {
            fVar.p(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.B != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                f fVar = this.B;
                if (fVar != null) {
                    fVar.f4523i1 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.L = z10;
        b(this.N);
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i6);
        }
    }

    public void setHideMotionSpec(u9.e eVar) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.C0 = eVar;
        }
    }

    public void setHideMotionSpecResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.C0 = u9.e.b(fVar.L0, i6);
        }
    }

    public void setIconEndPadding(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.Z(f3);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.Z(fVar.L0.getResources().getDimension(i6));
        }
    }

    public void setIconStartPadding(float f3) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.a0(f3);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.a0(fVar.L0.getResources().getDimension(i6));
        }
    }

    @Override // ma.h
    public void setInternalOnCheckedChangeListener(g gVar) {
        this.G = gVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.B == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 <= 1) {
            super.setLines(i6);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 <= 1) {
            super.setMaxLines(i6);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        f fVar = this.B;
        if (fVar != null) {
            fVar.f4527k1 = i6;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 <= 1) {
            super.setMinLines(i6);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.F = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.E = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.b0(colorStateList);
        }
        this.B.getClass();
        e();
    }

    public void setRippleColorResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.b0(i0.f.d(fVar.L0, i6));
            this.B.getClass();
            e();
        }
    }

    @Override // ua.v
    public void setShapeAppearanceModel(m mVar) {
        this.B.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(u9.e eVar) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.B0 = eVar;
        }
    }

    public void setShowMotionSpecResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.B0 = u9.e.b(fVar.L0, i6);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.B;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (fVar.f4525j1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            f fVar2 = this.B;
            if (fVar2 != null && !TextUtils.equals(fVar2.f4528l0, charSequence)) {
                fVar2.f4528l0 = charSequence;
                fVar2.R0.f8789e = true;
                fVar2.invalidateSelf();
                fVar2.F();
            }
        }
    }

    public void setTextAppearance(ra.d dVar) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.R0.b(dVar, fVar.L0);
        }
        g();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f3) {
        f fVar = this.B;
        if (fVar != null && fVar.H0 != f3) {
            fVar.H0 = f3;
            fVar.invalidateSelf();
            fVar.F();
        }
    }

    public void setTextEndPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            float dimension = fVar.L0.getResources().getDimension(i6);
            if (fVar.H0 != dimension) {
                fVar.H0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f3) {
        super.setTextSize(i6, f3);
        f fVar = this.B;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i6, f3, getResources().getDisplayMetrics());
            l lVar = fVar.R0;
            ra.d dVar = lVar.f8791g;
            if (dVar != null) {
                dVar.f11919l = applyDimension;
                lVar.f8785a.setTextSize(applyDimension);
                fVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f3) {
        f fVar = this.B;
        if (fVar != null && fVar.G0 != f3) {
            fVar.G0 = f3;
            fVar.invalidateSelf();
            fVar.F();
        }
    }

    public void setTextStartPaddingResource(int i6) {
        f fVar = this.B;
        if (fVar != null) {
            float dimension = fVar.L0.getResources().getDimension(i6);
            if (fVar.G0 != dimension) {
                fVar.G0 = dimension;
                fVar.invalidateSelf();
                fVar.F();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.Y(z10);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z10) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.K(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        f fVar = this.B;
        if (fVar != null) {
            fVar.P(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        f fVar = this.B;
        if (fVar != null) {
            Context context2 = fVar.L0;
            fVar.R0.b(new ra.d(context2, i6), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        f fVar = this.B;
        if (fVar != null) {
            Context context = fVar.L0;
            fVar.R0.b(new ra.d(context, i6), context);
        }
        g();
    }
}
