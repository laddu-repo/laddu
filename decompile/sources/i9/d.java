package i9;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends ViewGroup {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6561y;

    public int getItemSpacing() {
        return this.f6559w;
    }

    public int getLineSpacing() {
        return this.f6558v;
    }

    public int getRowCount() {
        return this.f6561y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i10, int i11, int i12) {
        int marginEnd;
        int marginStart;
        boolean z10;
        if (getChildCount() == 0) {
            this.f6561y = 0;
            return;
        }
        boolean z11 = true;
        this.f6561y = 1;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z12 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i13 = 0;
        int measuredWidth = paddingRight;
        int i14 = paddingTop;
        while (i13 < getChildCount()) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(p8.f.row_index_key, -1);
                z10 = z11;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i15 = i11 - i;
                int i16 = i15 - paddingLeft;
                z10 = z11;
                if (!this.f6560x && measuredWidth2 > i16) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i14 = paddingTop + this.f6558v;
                    this.f6561y++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(p8.f.row_index_key, Integer.valueOf(this.f6561y - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i14;
                if (z12) {
                    childAt.layout(i15 - measuredWidth2, i14, (i15 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i14, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f6559w;
                paddingTop = measuredHeight;
            }
            i13++;
            z11 = z10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = i12;
                if (childAt.getMeasuredWidth() + paddingLeft + i13 > paddingRight && !((ChipGroup) this).f6560x) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f6558v;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i13 + i18 + this.f6559w + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i18;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i11 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i11 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i11) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f6559w = i;
    }

    public void setLineSpacing(int i) {
        this.f6558v = i;
    }

    public void setSingleLine(boolean z2) {
        this.f6560x = z2;
    }
}
