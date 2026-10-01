package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y1 extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public float D;
    public boolean E;
    public int[] F;
    public int[] G;
    public Drawable H;
    public int I;
    public int J;
    public int K;
    public int L;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10424x;

    /* renamed from: y, reason: collision with root package name */
    public int f10425y;

    /* renamed from: z, reason: collision with root package name */
    public int f10426z;

    public y1(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f10424x = true;
        this.f10425y = -1;
        this.f10426z = 0;
        this.B = 8388659;
        int[] iArr = h.a.f5745o;
        n9.j E = n9.j.E(context, attributeSet, iArr, i6);
        t0.q0.q(this, context, iArr, attributeSet, (TypedArray) E.f9356z, i6);
        TypedArray typedArray = (TypedArray) E.f9356z;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.D = typedArray.getFloat(4, -1.0f);
        this.f10425y = typedArray.getInt(3, -1);
        this.E = typedArray.getBoolean(7, false);
        setDividerDrawable(E.v(5));
        this.K = typedArray.getInt(8, 0);
        this.L = typedArray.getDimensionPixelSize(6, 0);
        E.G();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x1;
    }

    public final void d(Canvas canvas, int i6) {
        this.H.setBounds(getPaddingLeft() + this.L, i6, (getWidth() - getPaddingRight()) - this.L, this.J + i6);
        this.H.draw(canvas);
    }

    public final void e(Canvas canvas, int i6) {
        this.H.setBounds(i6, getPaddingTop() + this.L, this.I + i6, (getHeight() - getPaddingBottom()) - this.L);
        this.H.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x1 generateDefaultLayoutParams() {
        int i6 = this.A;
        if (i6 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i6 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f10425y < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f10425y;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f10425y == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f10426z;
            if (this.A == 1 && (i6 = this.B & 112) != 48) {
                if (i6 != 16) {
                    if (i6 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.C;
                    }
                } else {
                    i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.C) / 2;
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10425y;
    }

    public Drawable getDividerDrawable() {
        return this.H;
    }

    public int getDividerPadding() {
        return this.L;
    }

    public int getDividerWidth() {
        return this.I;
    }

    public int getGravity() {
        return this.B;
    }

    public int getOrientation() {
        return this.A;
    }

    public int getShowDividers() {
        return this.K;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.D;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof x1) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i6) {
        if (i6 == 0) {
            if ((this.K & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i6 == getChildCount()) {
            if ((this.K & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.K & 2) != 0) {
            for (int i10 = i6 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int right;
        int left;
        int i6;
        int left2;
        int bottom;
        if (this.H != null) {
            int i10 = 0;
            if (this.A == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((x1) childAt.getLayoutParams())).topMargin) - this.J);
                    }
                    i10++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.J;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((x1) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z11 = u3.f10392a;
            if (getLayoutDirection() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                    x1 x1Var = (x1) childAt3.getLayoutParams();
                    if (z10) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) x1Var).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) x1Var).leftMargin) - this.I;
                    }
                    e(canvas, left2);
                }
                i10++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z10) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i6 = this.I;
                        right = left - i6;
                    }
                } else {
                    x1 x1Var2 = (x1) childAt4.getLayoutParams();
                    if (z10) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) x1Var2).leftMargin;
                        i6 = this.I;
                        right = left - i6;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) x1Var2).rightMargin;
                    }
                }
                e(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f10424x = z10;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f10425y = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.H) {
            return;
        }
        this.H = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.I = drawable.getIntrinsicWidth();
            this.J = drawable.getIntrinsicHeight();
        } else {
            this.I = 0;
            this.J = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.L = i6;
    }

    public void setGravity(int i6) {
        if (this.B != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.B = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i10 = i6 & 8388615;
        int i11 = this.B;
        if ((8388615 & i11) != i10) {
            this.B = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.E = z10;
    }

    public void setOrientation(int i6) {
        if (this.A != i6) {
            this.A = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.K) {
            requestLayout();
        }
        this.K = i6;
    }

    public void setVerticalGravity(int i6) {
        int i10 = i6 & 112;
        int i11 = this.B;
        if ((i11 & 112) != i10) {
            this.B = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.D = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
