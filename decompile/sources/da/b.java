package da;

import a8.i;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.a4;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p.q;
import p5.d;
import p5.e;
import pa.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends q {
    public static final int[] V = {R.attr.state_indeterminate};
    public static final int[] W = {R.attr.state_error};

    /* renamed from: a0, reason: collision with root package name */
    public static final int[][] f3978a0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: b0, reason: collision with root package name */
    public static final int f3979b0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet B;
    public final LinkedHashSet C;
    public ColorStateList D;
    public boolean E;
    public boolean F;
    public boolean G;
    public CharSequence H;
    public Drawable I;
    public Drawable J;
    public boolean K;
    public ColorStateList L;
    public ColorStateList M;
    public PorterDuff.Mode N;
    public int O;
    public int[] P;
    public boolean Q;
    public CharSequence R;
    public CompoundButton.OnCheckedChangeListener S;
    public final e T;
    public final c U;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i6 = this.O;
        if (i6 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i6 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.D == null) {
            int o10 = jb.b.o(this, R.attr.colorControlActivated);
            int o11 = jb.b.o(this, R.attr.colorError);
            int o12 = jb.b.o(this, R.attr.colorSurface);
            int o13 = jb.b.o(this, R.attr.colorOnSurface);
            this.D = new ColorStateList(f3978a0, new int[]{jb.b.u(1.0f, o12, o11), jb.b.u(1.0f, o12, o10), jb.b.u(0.54f, o12, o13), jb.b.u(0.38f, o12, o13), jb.b.u(0.38f, o12, o13)});
        }
        return this.D;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        bb.b bVar;
        this.I = a4.e(this.I, this.L, getButtonTintMode());
        this.J = a4.e(this.J, this.M, this.N);
        if (this.K) {
            e eVar = this.T;
            if (eVar != null) {
                d dVar = eVar.f10529y;
                Drawable drawable = eVar.f10532x;
                c cVar = this.U;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f10627a == null) {
                        cVar.f10627a = new p5.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f10627a);
                }
                ArrayList arrayList = eVar.B;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (eVar.B.size() == 0 && (bVar = eVar.A) != null) {
                        dVar.f10526b.removeListener(bVar);
                        eVar.A = null;
                    }
                }
                Drawable drawable2 = eVar.f10532x;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f10627a == null) {
                        cVar.f10627a = new p5.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f10627a);
                } else if (cVar != null) {
                    if (eVar.B == null) {
                        eVar.B = new ArrayList();
                    }
                    if (!eVar.B.contains(cVar)) {
                        eVar.B.add(cVar);
                        if (eVar.A == null) {
                            eVar.A = new bb.b(eVar, 5);
                        }
                        dVar.f10526b.addListener(eVar.A);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.I;
                if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                    ((AnimatedStateListDrawable) this.I).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
                }
            }
        }
        Drawable drawable4 = this.I;
        if (drawable4 != null && (colorStateList2 = this.L) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.J;
        if (drawable5 != null && (colorStateList = this.M) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.I;
        Drawable drawable7 = this.J;
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
                float f3 = intrinsicWidth / intrinsicHeight;
                if (f3 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f3);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f3 * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
                drawable6 = layerDrawable;
            } else {
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable2.setLayerInset(1, max, max2, max, max2);
                drawable6 = layerDrawable2;
            }
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.I;
    }

    public Drawable getButtonIconDrawable() {
        return this.J;
    }

    public ColorStateList getButtonIconTintList() {
        return this.M;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.N;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.L;
    }

    public int getCheckedState() {
        return this.O;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.H;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.O == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E && this.L == null && this.M == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, V);
        }
        if (this.G) {
            View.mergeDrawableStates(onCreateDrawableState, W);
        }
        int i10 = 0;
        while (true) {
            if (i10 < onCreateDrawableState.length) {
                int i11 = onCreateDrawableState[i10];
                if (i11 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i11 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i10] = 16842912;
                    break;
                }
                i10++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.P = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable h4;
        if (this.F && TextUtils.isEmpty(getText()) && (h4 = i.h(this)) != null) {
            int i6 = 1;
            if (getLayoutDirection() == 1) {
                i6 = -1;
            }
            int width = ((getWidth() - h4.getIntrinsicWidth()) / 2) * i6;
            int save = canvas.save();
            canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = h4.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.G) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.H));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f3977x);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, da.a] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f3977x = getCheckedState();
        return baseSavedState;
    }

    @Override // p.q, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(c9.a.f(getContext(), i6));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.J = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(c9.a.f(getContext(), i6));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.M == colorStateList) {
            return;
        }
        this.M = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.N == mode) {
            return;
        }
        this.N = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.L == colorStateList) {
            return;
        }
        this.L = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.F = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.O != i6) {
            this.O = i6;
            if (i6 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.R == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.Q) {
                this.Q = true;
                LinkedHashSet linkedHashSet = this.C;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw r4.a.i(it);
                    }
                }
                if (this.O != 2 && (onCheckedChangeListener = this.S) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.Q = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.H = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        CharSequence charSequence;
        if (i6 != 0) {
            charSequence = getResources().getText(i6);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
            Iterator it = this.B.iterator();
            if (!it.hasNext()) {
            } else {
                throw r4.a.i(it);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.S = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.R = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.E = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p.q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.I = drawable;
        this.K = false;
        a();
    }
}
