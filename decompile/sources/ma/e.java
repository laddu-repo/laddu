package ma;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e extends ViewGroup {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public int f8766x;

    /* renamed from: y, reason: collision with root package name */
    public int f8767y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8768z;

    public int getItemSpacing() {
        return this.f8767y;
    }

    public int getLineSpacing() {
        return this.f8766x;
    }

    public int getRowCount() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        if (getChildCount() == 0) {
            this.A = 0;
            return;
        }
        this.A = 1;
        if (getLayoutDirection() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i15 = paddingLeft;
        int i16 = paddingTop;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.getMarginStart();
                    i13 = marginLayoutParams.getMarginEnd();
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i15 + i14;
                int i18 = i11 - i6;
                int i19 = i18 - paddingRight;
                if (!this.f8768z && measuredWidth > i19) {
                    measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                    i16 = paddingTop + this.f8766x;
                    this.A++;
                    i15 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.A - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z11) {
                    childAt.layout(i18 - measuredWidth, i16, (i18 - i15) - i14, measuredHeight);
                } else {
                    childAt.layout(i15 + i14, i16, measuredWidth, measuredHeight);
                }
                i15 += childAt.getMeasuredWidth() + i14 + i13 + this.f8767y;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i6, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i18 = i13;
                if (childAt.getMeasuredWidth() + paddingLeft + i14 > paddingRight && !((ChipGroup) this).f8768z) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f8766x;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i14 + i18 + this.f8767y + paddingLeft;
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
            i12 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i12 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i12) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i6) {
        this.f8767y = i6;
    }

    public void setLineSpacing(int i6) {
        this.f8766x = i6;
    }

    public void setSingleLine(boolean z10) {
        this.f8768z = z10;
    }
}
