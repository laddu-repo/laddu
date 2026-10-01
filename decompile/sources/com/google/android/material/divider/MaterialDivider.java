package com.google.android.material.divider;

import ab.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.playfy.tv.R;
import i0.f;
import ma.n;
import ua.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public int A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public final i f2701x;

    /* renamed from: y, reason: collision with root package name */
    public int f2702y;

    /* renamed from: z, reason: collision with root package name */
    public int f2703z;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f2701x = new i();
        TypedArray f3 = n.f(context2, attributeSet, t9.a.A, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f2702y = f3.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.A = f3.getDimensionPixelOffset(2, 0);
        this.B = f3.getDimensionPixelOffset(1, 0);
        setDividerColor(a8.i.i(context2, f3, 0).getDefaultColor());
        f3.recycle();
    }

    public int getDividerColor() {
        return this.f2703z;
    }

    public int getDividerInsetEnd() {
        return this.B;
    }

    public int getDividerInsetStart() {
        return this.A;
    }

    public int getDividerThickness() {
        return this.f2702y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i6;
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = true;
        if (getLayoutDirection() != 1) {
            z10 = false;
        }
        if (z10) {
            i6 = this.B;
        } else {
            i6 = this.A;
        }
        if (z10) {
            width = getWidth();
            i10 = this.A;
        } else {
            width = getWidth();
            i10 = this.B;
        }
        int i11 = width - i10;
        int bottom = getBottom() - getTop();
        i iVar = this.f2701x;
        iVar.setBounds(i6, 0, i11, bottom);
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i10);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i11 = this.f2702y;
        if (i11 > 0 && measuredHeight != i11) {
            measuredHeight = i11;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i6) {
        if (this.f2703z != i6) {
            this.f2703z = i6;
            this.f2701x.q(ColorStateList.valueOf(i6));
            invalidate();
        }
    }

    public void setDividerColorResource(int i6) {
        setDividerColor(f.c(getContext(), i6));
    }

    public void setDividerInsetEnd(int i6) {
        this.B = i6;
    }

    public void setDividerInsetEndResource(int i6) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i6));
    }

    public void setDividerInsetStart(int i6) {
        this.A = i6;
    }

    public void setDividerInsetStartResource(int i6) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i6));
    }

    public void setDividerThickness(int i6) {
        if (this.f2702y != i6) {
            this.f2702y = i6;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i6) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i6));
    }
}
