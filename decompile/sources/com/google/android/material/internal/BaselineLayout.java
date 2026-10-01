package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: x, reason: collision with root package name */
    public int f2708x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2709y;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2708x = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f2708x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i11 - i6) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.f2708x != -1 && childAt.getBaseline() != -1) {
                    i13 = (this.f2708x + paddingTop) - childAt.getBaseline();
                } else {
                    i13 = paddingTop;
                }
                childAt.layout(i15, i13, measuredWidth + i15, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i6, i10);
                i11 = Math.max(i11, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i15 = Math.max(i15, baseline);
                    i16 = Math.max(i16, childAt.getMeasuredHeight() - baseline);
                }
                i13 = Math.max(i13, childAt.getMeasuredWidth());
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        if (i15 != -1) {
            if (this.f2709y) {
                i12 = Math.max(i12, Math.max(i16, getPaddingBottom()) + i15);
            }
            this.f2708x = i15;
        }
        if (!this.f2709y) {
            i12 = getPaddingBottom() + i11;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i13, getSuggestedMinimumWidth()), i6, i14), View.resolveSizeAndState(Math.max(i12, getSuggestedMinimumHeight()), i10, i14 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z10) {
        this.f2709y = z10;
    }
}
