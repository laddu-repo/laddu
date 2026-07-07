package com.google.android.material.imageview;

import a2.r1;
import ab.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import i0.f;
import p.y;
import ua.i;
import ua.m;
import ua.n;
import ua.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ShapeableImageView extends y implements v {
    public final r1 A;
    public final RectF B;
    public final RectF C;
    public final Paint D;
    public final Paint E;
    public final Path F;
    public ColorStateList G;
    public i H;
    public m I;
    public float J;
    public final Path K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public boolean R;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.A = n.f13026a;
        this.F = new Path();
        this.R = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.B = new RectF();
        this.C = new RectF();
        this.K = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, t9.a.K, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.G = a8.i.i(context2, obtainStyledAttributes, 9);
        this.J = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.L = dimensionPixelSize;
        this.M = dimensionPixelSize;
        this.N = dimensionPixelSize;
        this.O = dimensionPixelSize;
        this.L = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.M = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.N = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.O = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.P = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.Q = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.D = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.I = m.c(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new la.a(this));
    }

    public final boolean a() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i6, int i10) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i6 - getPaddingRight();
        float paddingBottom = i10 - getPaddingBottom();
        RectF rectF = this.B;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        m mVar = this.I;
        r1 r1Var = this.A;
        Path path = this.F;
        r1Var.b(mVar, null, 1.0f, rectF, null, path);
        Path path2 = this.K;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.C;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, i10);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.O;
    }

    public final int getContentPaddingEnd() {
        int i6 = this.Q;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (a()) {
            return this.L;
        }
        return this.N;
    }

    public int getContentPaddingLeft() {
        int i6 = this.Q;
        int i10 = this.P;
        if (i10 != Integer.MIN_VALUE || i6 != Integer.MIN_VALUE) {
            if (a() && i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (!a() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.L;
    }

    public int getContentPaddingRight() {
        int i6 = this.Q;
        int i10 = this.P;
        if (i10 != Integer.MIN_VALUE || i6 != Integer.MIN_VALUE) {
            if (a() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (!a() && i6 != Integer.MIN_VALUE) {
                return i6;
            }
        }
        return this.N;
    }

    public final int getContentPaddingStart() {
        int i6 = this.P;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (a()) {
            return this.N;
        }
        return this.L;
    }

    public int getContentPaddingTop() {
        return this.M;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public m getShapeAppearanceModel() {
        return this.I;
    }

    public ColorStateList getStrokeColor() {
        return this.G;
    }

    public float getStrokeWidth() {
        return this.J;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.K, this.E);
        if (this.G != null) {
            float f3 = this.J;
            Paint paint = this.D;
            paint.setStrokeWidth(f3);
            int colorForState = this.G.getColorForState(getDrawableState(), this.G.getDefaultColor());
            if (this.J > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.F, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (this.R || !isLayoutDirectionResolved()) {
            return;
        }
        this.R = true;
        if (!isPaddingRelative() && this.P == Integer.MIN_VALUE && this.Q == Integer.MIN_VALUE) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        d(i6, i10);
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
        super.setPadding(getContentPaddingLeft() + i6, getContentPaddingTop() + i10, getContentPaddingRight() + i11, getContentPaddingBottom() + i12);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i10, int i11, int i12) {
        super.setPaddingRelative(getContentPaddingStart() + i6, getContentPaddingTop() + i10, getContentPaddingEnd() + i11, getContentPaddingBottom() + i12);
    }

    @Override // ua.v
    public void setShapeAppearanceModel(m mVar) {
        this.I = mVar;
        i iVar = this.H;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(mVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i6) {
        setStrokeColor(f.d(getContext(), i6));
    }

    public void setStrokeWidth(float f3) {
        if (this.J != f3) {
            this.J = f3;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i6) {
        setStrokeWidth(getResources().getDimensionPixelSize(i6));
    }
}
