package i9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import o.w1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends w1 {
    public Drawable K;
    public final Rect L;
    public final Rect M;
    public int N;
    public final boolean O;
    public boolean P;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.L = new Rect();
        this.M = new Rect();
        this.N = 119;
        this.O = true;
        this.P = false;
        int[] iArr = p8.l.ForegroundLinearLayout;
        m.a(context, attributeSet, 0, 0);
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.N = typedArrayObtainStyledAttributes.getInt(p8.l.ForegroundLinearLayout_android_foregroundGravity, this.N);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(p8.l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.O = typedArrayObtainStyledAttributes.getBoolean(p8.l.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.K;
        if (drawable != null) {
            if (this.P) {
                this.P = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.O;
                Rect rect = this.L;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.N;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.M;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f4) {
        super.drawableHotspotChanged(f, f4);
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.setHotspot(f, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.K;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.K.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.K;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.N;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // o.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i10, int i11, int i12) {
        super.onLayout(z2, i, i10, i11, i12);
        this.P = z2 | this.P;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.P = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.K);
            }
            this.K = drawable;
            this.P = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.N == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.N != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.N = i;
            if (i == 119 && this.K != null) {
                this.K.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.K;
    }
}
