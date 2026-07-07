package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.playfy.tv.R;
import p.q2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable A;
    public Drawable B;
    public Drawable C;
    public final boolean D;
    public boolean E;
    public final int F;

    /* renamed from: x, reason: collision with root package name */
    public boolean f748x;

    /* renamed from: y, reason: collision with root package name */
    public View f749y;

    /* renamed from: z, reason: collision with root package name */
    public View f750z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new p.a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f5732a);
        boolean z10 = false;
        this.A = obtainStyledAttributes.getDrawable(0);
        this.B = obtainStyledAttributes.getDrawable(2);
        this.F = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.D = true;
            this.C = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful()) {
            this.A.setState(getDrawableState());
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            this.B.setState(getDrawableState());
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null && drawable3.isStateful()) {
            this.C.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f749y = findViewById(R.id.action_bar);
        this.f750z = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f748x && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        boolean z11 = true;
        if (this.D) {
            Drawable drawable = this.C;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.A != null) {
                if (this.f749y.getVisibility() == 0) {
                    this.A.setBounds(this.f749y.getLeft(), this.f749y.getTop(), this.f749y.getRight(), this.f749y.getBottom());
                } else {
                    View view = this.f750z;
                    if (view != null && view.getVisibility() == 0) {
                        this.A.setBounds(this.f750z.getLeft(), this.f750z.getTop(), this.f750z.getRight(), this.f750z.getBottom());
                    } else {
                        this.A.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z11 = false;
            }
            this.E = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        if (this.f749y == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.F) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i6, i10);
        if (this.f749y == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.A);
        }
        this.A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f749y;
            if (view != null) {
                this.A.setBounds(view.getLeft(), this.f749y.getTop(), this.f749y.getRight(), this.f749y.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.C);
        }
        this.C = drawable;
        boolean z10 = this.D;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.C) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.A != null || this.B != null) : this.C == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.B);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.E && this.B != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        int i6;
        this.f748x = z10;
        if (z10) {
            i6 = 393216;
        } else {
            i6 = 262144;
        }
        setDescendantFocusability(i6);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        boolean z10;
        super.setVisibility(i6);
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        boolean z10 = this.D;
        if (drawable != drawable2 || z10) {
            if (drawable != this.B || !this.E) {
                if ((drawable == this.C && z10) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }

    public void setTabContainer(q2 q2Var) {
    }
}
