package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.unity3d.services.UnityAdsConstants;
import e1.k;
import g1.h;
import i0.f;
import java.util.WeakHashMap;
import n9.j;
import p.b3;
import p.n1;
import p.u3;
import p.w;
import p.x0;
import t0.d0;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: r0, reason: collision with root package name */
    public static final o5.b f794r0 = new o5.b(Float.class, "thumbPos", 7);

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f795s0 = {R.attr.state_checked};
    public boolean A;
    public boolean B;
    public Drawable C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public CharSequence L;
    public CharSequence M;
    public CharSequence N;
    public CharSequence O;
    public boolean P;
    public int Q;
    public final int R;
    public float S;
    public float T;
    public final VelocityTracker U;
    public final int V;
    public float W;

    /* renamed from: a0, reason: collision with root package name */
    public int f796a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f797b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f798c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f799d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f800e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f801f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f802g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f803h0;

    /* renamed from: i0, reason: collision with root package name */
    public final TextPaint f804i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ColorStateList f805j0;

    /* renamed from: k0, reason: collision with root package name */
    public StaticLayout f806k0;

    /* renamed from: l0, reason: collision with root package name */
    public StaticLayout f807l0;

    /* renamed from: m0, reason: collision with root package name */
    public final m.a f808m0;

    /* renamed from: n0, reason: collision with root package name */
    public ObjectAnimator f809n0;
    public w o0;

    /* renamed from: p0, reason: collision with root package name */
    public h f810p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Rect f811q0;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f812x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f813y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f814z;

    /* JADX WARN: Type inference failed for: r14v11, types: [m.a, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playfy.tv.R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i6;
        int resourceId;
        this.f813y = null;
        this.f814z = null;
        this.A = false;
        this.B = false;
        this.D = null;
        this.E = null;
        this.F = false;
        this.G = false;
        this.U = VelocityTracker.obtain();
        this.f803h0 = true;
        this.f811q0 = new Rect();
        b3.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f804i0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = h.a.f5753x;
        j E = j.E(context, attributeSet, iArr, com.playfy.tv.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) E.f9356z;
        q0.q(this, context, iArr, attributeSet, typedArray, com.playfy.tv.R.attr.switchStyle);
        Drawable v10 = E.v(2);
        this.f812x = v10;
        if (v10 != null) {
            v10.setCallback(this);
        }
        Drawable v11 = E.v(11);
        this.C = v11;
        if (v11 != null) {
            v11.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.P = typedArray.getBoolean(3, true);
        this.H = typedArray.getDimensionPixelSize(8, 0);
        this.I = typedArray.getDimensionPixelSize(5, 0);
        this.J = typedArray.getDimensionPixelSize(6, 0);
        this.K = typedArray.getBoolean(4, false);
        ColorStateList t10 = E.t(9);
        if (t10 != null) {
            this.f813y = t10;
            this.A = true;
        }
        PorterDuff.Mode c10 = n1.c(typedArray.getInt(10, -1), null);
        if (this.f814z != c10) {
            this.f814z = c10;
            this.B = true;
        }
        if (this.A || this.B) {
            a();
        }
        ColorStateList t11 = E.t(12);
        if (t11 != null) {
            this.D = t11;
            this.F = true;
        }
        PorterDuff.Mode c11 = n1.c(typedArray.getInt(13, -1), null);
        if (this.E != c11) {
            this.E = c11;
            this.G = true;
        }
        if (this.F || this.G) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, h.a.f5754y);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = f.d(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f805j0 = colorStateList;
            } else {
                this.f805j0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int i10 = obtainStyledAttributes.getInt(1, -1);
            int i11 = obtainStyledAttributes.getInt(2, -1);
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i11 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i11);
                } else {
                    create = Typeface.create(typeface, i11);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i6 = create.getStyle();
                } else {
                    i6 = 0;
                }
                int i12 = (~i6) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : f10);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f8403x = context2.getResources().getConfiguration().locale;
                this.f808m0 = obj;
            } else {
                this.f808m0 = null;
            }
            setTextOnInternal(this.L);
            setTextOffInternal(this.N);
            obtainStyledAttributes.recycle();
        }
        new x0(this).f(attributeSet, com.playfy.tv.R.attr.switchStyle);
        E.G();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.R = viewConfiguration.getScaledTouchSlop();
        this.V = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.playfy.tv.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private w getEmojiTextViewHelper() {
        if (this.o0 == null) {
            this.o0 = new w(this);
        }
        return this.o0;
    }

    private boolean getTargetCheckedState() {
        if (this.W > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f3;
        boolean z10 = u3.f10392a;
        if (getLayoutDirection() == 1) {
            f3 = 1.0f - this.W;
        } else {
            f3 = this.W;
        }
        return (int) ((f3 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.C;
        if (drawable != null) {
            Rect rect2 = this.f811q0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f812x;
            if (drawable2 != null) {
                rect = n1.b(drawable2);
            } else {
                rect = n1.f10322c;
            }
            return ((((this.f796a0 - this.f798c0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.N = charSequence;
        TransformationMethod t10 = ((a8.c) getEmojiTextViewHelper().f10401b.f7745y).t(this.f808m0);
        if (t10 != null) {
            charSequence = t10.getTransformation(charSequence, this);
        }
        this.O = charSequence;
        this.f807l0 = null;
        if (this.P) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.L = charSequence;
        TransformationMethod t10 = ((a8.c) getEmojiTextViewHelper().f10401b.f7745y).t(this.f808m0);
        if (t10 != null) {
            charSequence = t10.getTransformation(charSequence, this);
        }
        this.M = charSequence;
        this.f806k0 = null;
        if (this.P) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f812x;
        if (drawable != null) {
            if (this.A || this.B) {
                Drawable mutate = s1.c.A(drawable).mutate();
                this.f812x = mutate;
                if (this.A) {
                    mutate.setTintList(this.f813y);
                }
                if (this.B) {
                    this.f812x.setTintMode(this.f814z);
                }
                if (this.f812x.isStateful()) {
                    this.f812x.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.C;
        if (drawable != null) {
            if (this.F || this.G) {
                Drawable mutate = s1.c.A(drawable).mutate();
                this.C = mutate;
                if (this.F) {
                    mutate.setTintList(this.D);
                }
                if (this.G) {
                    this.C.setTintMode(this.E);
                }
                if (this.C.isStateful()) {
                    this.C.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.L);
        setTextOffInternal(this.N);
        requestLayout();
    }

    public final void d() {
        if (this.f810p0 == null && ((a8.c) this.o0.f10401b.f7745y).j() && k.f4160k != null) {
            k a10 = k.a();
            int b10 = a10.b();
            if (b10 == 3 || b10 == 0) {
                h hVar = new h(this);
                this.f810p0 = hVar;
                a10.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i6;
        int i10;
        int i11 = this.f799d0;
        int i12 = this.f800e0;
        int i13 = this.f801f0;
        int i14 = this.f802g0;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f812x;
        if (drawable != null) {
            rect = n1.b(drawable);
        } else {
            rect = n1.f10322c;
        }
        Drawable drawable2 = this.C;
        Rect rect2 = this.f811q0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i15 = rect2.left;
            thumbOffset += i15;
            if (rect != null) {
                int i16 = rect.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if (i17 > i18) {
                    i6 = (i17 - i18) + i12;
                } else {
                    i6 = i12;
                }
                int i19 = rect.right;
                int i20 = rect2.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rect.bottom;
                int i22 = rect2.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.C.setBounds(i11, i6, i13, i10);
                }
            } else {
                i6 = i12;
            }
            i10 = i14;
            this.C.setBounds(i11, i6, i13, i10);
        }
        Drawable drawable3 = this.f812x;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i23 = thumbOffset - rect2.left;
            int i24 = thumbOffset + this.f798c0 + rect2.right;
            this.f812x.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f10) {
        super.drawableHotspotChanged(f3, f10);
        Drawable drawable = this.f812x;
        if (drawable != null) {
            drawable.setHotspot(f3, f10);
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.setHotspot(f3, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f812x;
        if (drawable != null && drawable.isStateful()) {
            z10 = drawable.setState(drawableState);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z10 = u3.f10392a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f796a0;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.J;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z10 = u3.f10392a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f796a0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.J;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c9.a.v(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.P;
    }

    public boolean getSplitTrack() {
        return this.K;
    }

    public int getSwitchMinWidth() {
        return this.I;
    }

    public int getSwitchPadding() {
        return this.J;
    }

    public CharSequence getTextOff() {
        return this.N;
    }

    public CharSequence getTextOn() {
        return this.L;
    }

    public Drawable getThumbDrawable() {
        return this.f812x;
    }

    public final float getThumbPosition() {
        return this.W;
    }

    public int getThumbTextPadding() {
        return this.H;
    }

    public ColorStateList getThumbTintList() {
        return this.f813y;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f814z;
    }

    public Drawable getTrackDrawable() {
        return this.C;
    }

    public ColorStateList getTrackTintList() {
        return this.D;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.E;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f812x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f809n0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f809n0.end();
            this.f809n0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f795s0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.C;
        Rect rect = this.f811q0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i6 = this.f800e0;
        int i10 = this.f802g0;
        int i11 = i6 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f812x;
        if (drawable != null) {
            if (this.K && drawable2 != null) {
                Rect b10 = n1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b10.left;
                rect.right -= b10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f806k0;
        } else {
            staticLayout = this.f807l0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f804i0;
            ColorStateList colorStateList = this.f805j0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.L;
            } else {
                charSequence = this.N;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i6, i10, i11, i12);
        int i17 = 0;
        if (this.f812x != null) {
            Drawable drawable = this.C;
            Rect rect = this.f811q0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b10 = n1.b(this.f812x);
            i13 = Math.max(0, b10.left - rect.left);
            i17 = Math.max(0, b10.right - rect.right);
        } else {
            i13 = 0;
        }
        boolean z11 = u3.f10392a;
        if (getLayoutDirection() == 1) {
            i14 = getPaddingLeft() + i13;
            width = ((this.f796a0 + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.f796a0) + i13 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i16 = getPaddingTop();
                i15 = this.f797b0 + i16;
            } else {
                i15 = getHeight() - getPaddingBottom();
                i16 = i15 - this.f797b0;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i18 = this.f797b0;
            int i19 = height - (i18 / 2);
            i15 = i18 + i19;
            i16 = i19;
        }
        this.f799d0 = i14;
        this.f800e0 = i16;
        this.f802g0 = i15;
        this.f801f0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (this.P) {
            StaticLayout staticLayout = this.f806k0;
            TextPaint textPaint = this.f804i0;
            if (staticLayout == null) {
                CharSequence charSequence = this.M;
                if (charSequence != null) {
                    i16 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i16 = 0;
                }
                this.f806k0 = new StaticLayout(charSequence, textPaint, i16, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
            if (this.f807l0 == null) {
                CharSequence charSequence2 = this.O;
                if (charSequence2 != null) {
                    i15 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i15 = 0;
                }
                this.f807l0 = new StaticLayout(charSequence2, textPaint, i15, Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            }
        }
        Drawable drawable = this.f812x;
        Rect rect = this.f811q0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.f812x.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f812x.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (this.P) {
            i13 = (this.H * 2) + Math.max(this.f806k0.getWidth(), this.f807l0.getWidth());
        } else {
            i13 = 0;
        }
        this.f798c0 = Math.max(i13, i11);
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i17 = this.C.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i18 = rect.left;
        int i19 = rect.right;
        Drawable drawable3 = this.f812x;
        if (drawable3 != null) {
            Rect b10 = n1.b(drawable3);
            i18 = Math.max(i18, b10.left);
            i19 = Math.max(i19, b10.right);
        }
        if (this.f803h0) {
            i14 = Math.max(this.I, (this.f798c0 * 2) + i18 + i19);
        } else {
            i14 = this.I;
        }
        int max = Math.max(i17, i12);
        this.f796a0 = i14;
        this.f797b0 = max;
        super.onMeasure(i6, i10);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.L;
        } else {
            charSequence = this.N;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.L;
                if (obj == null) {
                    obj = getResources().getString(com.playfy.tv.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = q0.f12397a;
                new d0(com.playfy.tv.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.N;
            if (obj3 == null) {
                obj3 = getResources().getString(com.playfy.tv.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = q0.f12397a;
            new d0(com.playfy.tv.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (windowToken != null && isLaidOut()) {
            if (isChecked) {
                f3 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f794r0, f3);
            this.f809n0 = ofFloat;
            ofFloat.setDuration(250L);
            this.f809n0.setAutoCancel(true);
            this.f809n0.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f809n0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f3 = 1.0f;
        }
        setThumbPosition(f3);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c9.a.w(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.L);
        setTextOffInternal(this.N);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f803h0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.K = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i6) {
        this.I = i6;
        requestLayout();
    }

    public void setSwitchPadding(int i6) {
        this.J = i6;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f804i0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.N;
            if (obj == null) {
                obj = getResources().getString(com.playfy.tv.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = q0.f12397a;
            new d0(com.playfy.tv.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.L;
            if (obj == null) {
                obj = getResources().getString(com.playfy.tv.R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = q0.f12397a;
            new d0(com.playfy.tv.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f812x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f812x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.W = f3;
        invalidate();
    }

    public void setThumbResource(int i6) {
        setThumbDrawable(c9.a.f(getContext(), i6));
    }

    public void setThumbTextPadding(int i6) {
        this.H = i6;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f813y = colorStateList;
        this.A = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f814z = mode;
        this.B = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.C = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i6) {
        setTrackDrawable(c9.a.f(getContext(), i6));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        this.F = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.E = mode;
        this.G = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f812x && drawable != this.C) {
            return false;
        }
        return true;
    }
}
