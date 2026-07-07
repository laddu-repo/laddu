package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import cg.h;
import com.google.android.gms.internal.measurement.a4;
import com.playfy.tv.R;
import java.util.ArrayList;
import java.util.Collections;
import ma.n;
import ua.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: x0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f2567x0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: s0, reason: collision with root package name */
    public Integer f2568s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2569t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2570u0;

    /* renamed from: v0, reason: collision with root package name */
    public ImageView.ScaleType f2571v0;

    /* renamed from: w0, reason: collision with root package name */
    public Boolean f2572w0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        ColorStateList g10;
        Context context2 = getContext();
        TypedArray f3 = n.f(context2, attributeSet, t9.a.G, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f3.hasValue(2)) {
            setNavigationIconTint(f3.getColor(2, -1));
        }
        this.f2569t0 = f3.getBoolean(4, false);
        this.f2570u0 = f3.getBoolean(3, false);
        int i6 = f3.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2567x0;
            if (i6 < scaleTypeArr.length) {
                this.f2571v0 = scaleTypeArr[i6];
            }
        }
        if (f3.hasValue(0)) {
            this.f2572w0 = Boolean.valueOf(f3.getBoolean(0, false));
        }
        f3.recycle();
        Drawable background = getBackground();
        if (background == null) {
            g10 = ColorStateList.valueOf(0);
        } else {
            g10 = a4.g(background);
        }
        if (g10 != null) {
            i iVar = new i();
            iVar.q(g10);
            iVar.m(context2);
            iVar.p(getElevation());
            setBackground(iVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2571v0;
    }

    public Integer getNavigationIconTint() {
        return this.f2568s0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            lg.c.s(this, (i) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i6, i10, i11, i12);
        h hVar = n.f8794c;
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f2569t0 || this.f2570u0) {
            ArrayList e10 = n.e(this, getTitle());
            if (e10.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(e10, hVar);
            }
            ArrayList e11 = n.e(this, getSubtitle());
            if (e11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(e11, hVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2569t0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f2570u0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2572w0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2571v0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof i) {
            ((i) background).p(f3);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f2572w0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f2572w0 = Boolean.valueOf(z10);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2571v0 != scaleType) {
            this.f2571v0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2568s0 != null) {
            drawable = s1.c.A(drawable.mutate());
            drawable.setTint(this.f2568s0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.f2568s0 = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f2570u0 != z10) {
            this.f2570u0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f2569t0 != z10) {
            this.f2569t0 = z10;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i6;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i6, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i6 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i6, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i6, textView.getTop(), i10, textView.getBottom());
    }
}
