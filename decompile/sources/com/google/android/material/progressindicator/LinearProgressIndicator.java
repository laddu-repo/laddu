package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import com.playfy.tv.R;
import i.y;
import java.util.Objects;
import ma.n;
import pa.d;
import pa.e;
import pa.m;
import pa.q;
import pa.r;
import pa.s;
import pa.u;
import pa.w;
import pa.x;
import t9.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    /* JADX WARN: Type inference failed for: r4v1, types: [pa.r, pa.t] */
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        y wVar;
        x xVar = (x) this.f10630x;
        ?? rVar = new r(xVar);
        rVar.f10713f = 300.0f;
        rVar.f10721o = new Pair(new q(), new q());
        Context context2 = getContext();
        if (xVar.f10741o == 0) {
            wVar = new u(xVar);
        } else {
            wVar = new w(context2, xVar);
        }
        setIndeterminateDrawable(new s(context2, xVar, rVar, wVar));
        setProgressDrawable(new m(getContext(), xVar, rVar));
        this.E = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pa.e, pa.x] */
    @Override // pa.d
    public final e a(Context context, AttributeSet attributeSet) {
        ?? eVar = new e(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        boolean z10 = false;
        n.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = a.f12688q;
        n.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        eVar.f10741o = obtainStyledAttributes.getInt(0, 1);
        eVar.f10742p = obtainStyledAttributes.getInt(1, 0);
        eVar.f10744r = Math.min(obtainStyledAttributes.getDimensionPixelSize(4, 0), eVar.f10633a);
        if (obtainStyledAttributes.hasValue(3)) {
            eVar.s = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null) {
            int i6 = peekValue.type;
            if (i6 == 5) {
                eVar.f10745t = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), eVar.f10633a / 2);
                eVar.f10747v = false;
                eVar.f10748w = true;
            } else if (i6 == 6) {
                eVar.f10746u = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                eVar.f10747v = true;
                eVar.f10748w = true;
            }
        }
        obtainStyledAttributes.recycle();
        eVar.d();
        if (eVar.f10742p == 1) {
            z10 = true;
        }
        eVar.f10743q = z10;
        return eVar;
    }

    @Override // pa.d
    public final void c(int i6) {
        e eVar = this.f10630x;
        if (eVar != null && ((x) eVar).f10741o == 0 && isIndeterminate()) {
            return;
        }
        super.c(i6);
    }

    public int getIndeterminateAnimationType() {
        return ((x) this.f10630x).f10741o;
    }

    public int getIndicatorDirection() {
        return ((x) this.f10630x).f10742p;
    }

    public int getTrackInnerCornerRadius() {
        return ((x) this.f10630x).f10745t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((x) this.f10630x).s;
    }

    public int getTrackStopIndicatorSize() {
        return ((x) this.f10630x).f10744r;
    }

    @Override // pa.d, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        e eVar = this.f10630x;
        x xVar = (x) eVar;
        boolean z11 = true;
        if (((x) eVar).f10742p != 1 && ((getLayoutDirection() != 1 || ((x) eVar).f10742p != 2) && (getLayoutDirection() != 0 || ((x) eVar).f10742p != 3))) {
            z11 = false;
        }
        xVar.f10743q = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        int paddingRight = i6 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i10 - (getPaddingBottom() + getPaddingTop());
        s indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        m progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i6) {
        e eVar = this.f10630x;
        if (((x) eVar).f10741o == i6) {
            return;
        }
        if (d() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((x) eVar).f10741o = i6;
        ((x) eVar).d();
        if (i6 == 0) {
            s indeterminateDrawable = getIndeterminateDrawable();
            u uVar = new u((x) eVar);
            indeterminateDrawable.L = uVar;
            uVar.f6268a = indeterminateDrawable;
        } else {
            s indeterminateDrawable2 = getIndeterminateDrawable();
            w wVar = new w(getContext(), (x) eVar);
            indeterminateDrawable2.L = wVar;
            wVar.f6268a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // pa.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((x) this.f10630x).d();
    }

    public void setIndicatorDirection(int i6) {
        e eVar = this.f10630x;
        ((x) eVar).f10742p = i6;
        x xVar = (x) eVar;
        boolean z10 = true;
        if (i6 != 1 && ((getLayoutDirection() != 1 || ((x) eVar).f10742p != 2) && (getLayoutDirection() != 0 || i6 != 3))) {
            z10 = false;
        }
        xVar.f10743q = z10;
        invalidate();
    }

    @Override // pa.d
    public void setTrackCornerRadius(int i6) {
        super.setTrackCornerRadius(i6);
        ((x) this.f10630x).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i6) {
        e eVar = this.f10630x;
        if (((x) eVar).f10745t != i6) {
            ((x) eVar).f10745t = Math.round(Math.min(i6, ((x) eVar).f10633a / 2.0f));
            ((x) eVar).f10747v = false;
            ((x) eVar).f10748w = true;
            ((x) eVar).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f3) {
        e eVar = this.f10630x;
        if (((x) eVar).f10746u != f3) {
            ((x) eVar).f10746u = Math.min(f3, 0.5f);
            ((x) eVar).f10747v = true;
            ((x) eVar).f10748w = true;
            ((x) eVar).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        e eVar = this.f10630x;
        if (!Objects.equals(((x) eVar).s, num)) {
            ((x) eVar).s = num;
            invalidate();
        }
    }

    public void setTrackStopIndicatorSize(int i6) {
        e eVar = this.f10630x;
        if (((x) eVar).f10744r != i6) {
            ((x) eVar).f10744r = Math.min(i6, ((x) eVar).f10633a);
            ((x) eVar).d();
            invalidate();
        }
    }
}
