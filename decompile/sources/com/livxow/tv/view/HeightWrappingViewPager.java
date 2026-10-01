package com.livxow.tv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import i5.h;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class HeightWrappingViewPager extends h {
    public HeightWrappingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // i5.h, android.view.View
    public final void onMeasure(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            int i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i11) {
                    i11 = measuredHeight;
                }
            }
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, (int) (getContext().getResources().getDisplayMetrics().heightPixels * (getResources().getConfiguration().orientation == 2 ? 0.55f : 0.3f))), 1073741824);
        }
        super.onMeasure(i, i10);
    }
}
