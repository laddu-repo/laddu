package wa;

import a8.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.playfy.tv.R;
import ma.n;
import ua.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b F = new Object();
    public final float A;
    public final int B;
    public final int C;
    public ColorStateList D;
    public PorterDuff.Mode E;

    /* renamed from: x, reason: collision with root package name */
    public final m f14255x;

    /* renamed from: y, reason: collision with root package name */
    public int f14256y;

    /* renamed from: z, reason: collision with root package name */
    public final float f14257z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Drawable A;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, t9.a.M);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f14256y = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f14255x = m.c(context2, attributeSet, 0, 0).a();
        }
        this.f14257z = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(i.i(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(n.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.A = obtainStyledAttributes.getFloat(1, 1.0f);
        this.B = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.C = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(F);
        setFocusable(true);
        if (getBackground() == null) {
            int u3 = jb.b.u(getBackgroundOverlayColorAlpha(), jb.b.o(this, R.attr.colorSurface), jb.b.o(this, R.attr.colorOnSurface));
            m mVar = this.f14255x;
            if (mVar != null) {
                int i6 = d.f14258a;
                ua.i iVar = new ua.i(mVar);
                iVar.q(ColorStateList.valueOf(u3));
                gradientDrawable = iVar;
            } else {
                Resources resources = getResources();
                int i10 = d.f14258a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(u3);
                gradientDrawable = gradientDrawable2;
            }
            if (this.D != null) {
                A = s1.c.A(gradientDrawable);
                A.setTintList(this.D);
            } else {
                A = s1.c.A(gradientDrawable);
            }
            setBackground(A);
        }
    }

    public float getActionTextColorAlpha() {
        return this.A;
    }

    public int getAnimationMode() {
        return this.f14256y;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f14257z;
    }

    public int getMaxInlineActionWidth() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int i11 = this.B;
        if (i11 > 0 && getMeasuredWidth() > i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
    }

    public void setAnimationMode(int i6) {
        this.f14256y = i6;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.D != null) {
            drawable = s1.c.A(drawable.mutate());
            drawable.setTintList(this.D);
            drawable.setTintMode(this.E);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        if (getBackground() != null) {
            Drawable A = s1.c.A(getBackground().mutate());
            A.setTintList(colorStateList);
            A.setTintMode(this.E);
            if (A != getBackground()) {
                super.setBackgroundDrawable(A);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.E = mode;
        if (getBackground() != null) {
            Drawable A = s1.c.A(getBackground().mutate());
            A.setTintMode(mode);
            if (A != getBackground()) {
                super.setBackgroundDrawable(A);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        b bVar;
        if (onClickListener != null) {
            bVar = null;
        } else {
            bVar = F;
        }
        setOnTouchListener(bVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
