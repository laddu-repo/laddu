package z8;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import b8.h;
import f5.d;
import f5.f;
import i9.m;
import i9.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.p;
import org.xmlpull.v1.XmlPullParserException;
import p8.e;
import p8.j;
import p8.k;
import p8.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c extends p {
    public static final int T = k.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] U = {p8.b.state_indeterminate};
    public static final int[] V;
    public static final int[][] W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f14829a0;
    public final LinkedHashSet A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public boolean E;
    public CharSequence F;
    public Drawable G;
    public Drawable H;
    public boolean I;
    public ColorStateList J;
    public ColorStateList K;
    public PorterDuff.Mode L;
    public int M;
    public int[] N;
    public boolean O;
    public CharSequence P;
    public CompoundButton.OnCheckedChangeListener Q;
    public final f R;
    public final a S;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f14830z;

    static {
        int i = p8.b.state_error;
        V = new int[]{i};
        W = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f14829a0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, AttributeSet attributeSet) throws Throwable {
        f fVar;
        int next;
        int i = g.a.checkboxStyle;
        super(v9.a.a(context, attributeSet, i, T), attributeSet, i);
        this.f14830z = new LinkedHashSet();
        this.A = new LinkedHashSet();
        Context context2 = getContext();
        int i10 = e.mtrl_checkbox_button_checked_unchecked;
        if (Build.VERSION.SDK_INT >= 24) {
            fVar = new f(context2, 0);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = k0.k.f7244a;
            Drawable drawable = resources.getDrawable(i10, theme);
            fVar.f5240v = drawable;
            drawable.setCallback(fVar.A);
            new f5.e(0, fVar.f5240v.getConstantState());
        } else {
            int i11 = f.B;
            try {
                XmlResourceParser xml = context2.getResources().getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                f fVar2 = new f(context2, 0);
                fVar2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                fVar = fVar2;
            } catch (IOException e7) {
                Log.e("AnimatedVDCompat", "parser error", e7);
                fVar = null;
            } catch (XmlPullParserException e10) {
                Log.e("AnimatedVDCompat", "parser error", e10);
                fVar = null;
            }
        }
        this.R = fVar;
        this.S = new a(this);
        Context context3 = getContext();
        this.G = getButtonDrawable();
        this.J = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = l.MaterialCheckBox;
        int i12 = T;
        m.a(context3, attributeSet, i, i12);
        m.b(context3, attributeSet, iArr, i, i12, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, i, i12);
        hd.a aVar = new hd.a(context3, typedArrayObtainStyledAttributes);
        this.H = aVar.v(l.MaterialCheckBox_buttonIcon);
        if (this.G != null && h.I(context3, p8.b.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(l.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == f14829a0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.G = com.bumptech.glide.c.t(context3, e.mtrl_checkbox_button);
                this.I = true;
                if (this.H == null) {
                    this.H = com.bumptech.glide.c.t(context3, e.mtrl_checkbox_button_icon);
                }
            }
        }
        this.K = com.bumptech.glide.c.q(context3, aVar, l.MaterialCheckBox_buttonIconTint);
        this.L = n.c(typedArrayObtainStyledAttributes.getInt(l.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.C = typedArrayObtainStyledAttributes.getBoolean(l.MaterialCheckBox_useMaterialThemeColors, false);
        this.D = typedArrayObtainStyledAttributes.getBoolean(l.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.E = typedArrayObtainStyledAttributes.getBoolean(l.MaterialCheckBox_errorShown, false);
        this.F = typedArrayObtainStyledAttributes.getText(l.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArrayObtainStyledAttributes.hasValue(l.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(l.MaterialCheckBox_checkedState, 0));
        }
        aVar.K();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.M;
        return i == 1 ? getResources().getString(j.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(j.mtrl_checkbox_state_description_unchecked) : getResources().getString(j.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.B == null) {
            int iO = com.bumptech.glide.c.o(this, g.a.colorControlActivated);
            int iO2 = com.bumptech.glide.c.o(this, g.a.colorError);
            int iO3 = com.bumptech.glide.c.o(this, p8.b.colorSurface);
            int iO4 = com.bumptech.glide.c.o(this, p8.b.colorOnSurface);
            this.B = new ColorStateList(W, new int[]{com.bumptech.glide.c.A(1.0f, iO3, iO2), com.bumptech.glide.c.A(1.0f, iO3, iO), com.bumptech.glide.c.A(0.54f, iO3, iO4), com.bumptech.glide.c.A(0.38f, iO3, iO4), com.bumptech.glide.c.A(0.38f, iO3, iO4)});
        }
        return this.B;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.J;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e5.l lVar;
        Drawable drawableMutate = this.G;
        ColorStateList colorStateList3 = this.J;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.G = drawableMutate;
        Drawable drawableMutate2 = this.H;
        ColorStateList colorStateList4 = this.K;
        PorterDuff.Mode mode = this.L;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.H = drawableMutate2;
        if (this.I) {
            f fVar = this.R;
            if (fVar != null) {
                d dVar = fVar.f5233w;
                Drawable drawable = fVar.f5240v;
                a aVar = this.S;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (aVar.f14826a == null) {
                        aVar.f14826a = new f5.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f14826a);
                }
                ArrayList arrayList = fVar.f5236z;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f5236z.size() == 0 && (lVar = fVar.f5235y) != null) {
                        dVar.f5228b.removeListener(lVar);
                        fVar.f5235y = null;
                    }
                }
                Drawable drawable2 = fVar.f5240v;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (aVar.f14826a == null) {
                        aVar.f14826a = new f5.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f14826a);
                } else if (aVar != null) {
                    if (fVar.f5236z == null) {
                        fVar.f5236z = new ArrayList();
                    }
                    if (!fVar.f5236z.contains(aVar)) {
                        fVar.f5236z.add(aVar);
                        if (fVar.f5235y == null) {
                            fVar.f5235y = new e5.l(1, fVar);
                        }
                        dVar.f5228b.addListener(fVar.f5235y);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.G;
                if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(p8.f.checked, p8.f.unchecked, fVar, false);
                    ((AnimatedStateListDrawable) this.G).addTransition(p8.f.indeterminate, p8.f.unchecked, fVar, false);
                }
            }
        }
        Drawable drawable4 = this.G;
        if (drawable4 != null && (colorStateList2 = this.J) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.H;
        if (drawable5 != null && (colorStateList = this.K) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.G;
        Drawable drawable7 = this.H;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.G;
    }

    public Drawable getButtonIconDrawable() {
        return this.H;
    }

    public ColorStateList getButtonIconTintList() {
        return this.K;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.L;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.J;
    }

    public int getCheckedState() {
        return this.M;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.F;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.M == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C && this.J == null && this.K == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U);
        }
        if (this.E) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i11 = iArrOnCreateDrawableState[i10];
            if (i11 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i11 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i10] = 16842912;
                break;
            }
            i10++;
        }
        this.N = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.D || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.E) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.F));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f14828v);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f14828v = getCheckedState();
        return bVar;
    }

    @Override // o.p, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.c.t(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.H = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(com.bumptech.glide.c.t(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.K == colorStateList) {
            return;
        }
        this.K = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.L == mode) {
            return;
        }
        this.L = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.J == colorStateList) {
            return;
        }
        this.J = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.D = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.M != i) {
            this.M = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.P == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.O) {
                return;
            }
            this.O = true;
            LinkedHashSet linkedHashSet = this.A;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw d0.d.g(it);
                }
            }
            if (this.M != 2 && (onCheckedChangeListener = this.Q) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.O = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.F = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.E == z2) {
            return;
        }
        this.E = z2;
        refreshDrawableState();
        Iterator it = this.f14830z.iterator();
        if (it.hasNext()) {
            throw d0.d.g(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.Q = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.P = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.C = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // o.p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.G = drawable;
        this.I = false;
        a();
    }
}
