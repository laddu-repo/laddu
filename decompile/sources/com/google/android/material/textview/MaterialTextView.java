package com.google.android.material.textview;

import a8.g;
import a8.i;
import ab.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialTextView extends b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (g.p(context2, com.playfy.tv.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = t9.a.F;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i6 = -1;
            for (int i10 = 0; i10 < 2 && i6 < 0; i10++) {
                i6 = i.k(context2, obtainStyledAttributes, iArr2[i10], -1);
            }
            obtainStyledAttributes.recycle();
            if (i6 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, t9.a.E);
                    Context context3 = getContext();
                    int[] iArr3 = {2, 4};
                    int i11 = -1;
                    for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
                        i11 = i.k(context3, obtainStyledAttributes3, iArr3[i12], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i11 >= 0) {
                        setLineHeight(i11);
                    }
                }
            }
        }
    }

    @Override // p.b1, android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        if (g.p(context, com.playfy.tv.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i6, t9.a.E);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int i10 = -1;
            for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                i10 = i.k(context2, obtainStyledAttributes, iArr[i11], -1);
            }
            obtainStyledAttributes.recycle();
            if (i10 >= 0) {
                setLineHeight(i10);
            }
        }
    }
}
