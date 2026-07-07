package com.playfy.tv.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.k;
import s5.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HeightWrappingViewPager extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeightWrappingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
    }

    @Override // s5.g, android.view.View
    public final void onMeasure(int i6, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            super.onMeasure(i6, i10);
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                childAt.measure(i6, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i11) {
                    i11 = measuredHeight;
                }
            }
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i6, i10);
    }
}
