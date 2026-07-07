package com.google.android.material.progressindicator;

import a8.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.playfy.tv.R;
import i.y;
import ma.n;
import p5.p;
import pa.d;
import pa.e;
import pa.f;
import pa.h;
import pa.j;
import pa.k;
import pa.m;
import pa.s;
import t9.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class CircularProgressIndicator extends d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        y hVar;
        k kVar = (k) this.f10630x;
        f fVar = new f(kVar);
        Context context2 = getContext();
        if (kVar.f10685o == 1) {
            hVar = new j(context2, kVar);
        } else {
            hVar = new h(kVar);
        }
        s sVar = new s(context2, kVar, fVar, hVar);
        sVar.M = p.a(context2.getResources(), R.drawable.ic_mtrl_arrow_circle, null);
        setIndeterminateDrawable(sVar);
        setProgressDrawable(new m(getContext(), kVar, fVar));
        this.E = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pa.k, pa.e] */
    @Override // pa.d
    public final e a(Context context, AttributeSet attributeSet) {
        ?? eVar = new e(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        n.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = a.f12681i;
        n.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        eVar.f10685o = obtainStyledAttributes.getInt(0, 0);
        eVar.f10686p = Math.max(i.k(context, obtainStyledAttributes, 4, dimensionPixelSize), eVar.f10633a * 2);
        eVar.f10687q = i.k(context, obtainStyledAttributes, 3, dimensionPixelSize2);
        eVar.f10688r = obtainStyledAttributes.getInt(2, 0);
        eVar.s = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        eVar.d();
        return eVar;
    }

    public int getIndeterminateAnimationType() {
        return ((k) this.f10630x).f10685o;
    }

    public int getIndicatorDirection() {
        return ((k) this.f10630x).f10688r;
    }

    public int getIndicatorInset() {
        return ((k) this.f10630x).f10687q;
    }

    public int getIndicatorSize() {
        return ((k) this.f10630x).f10686p;
    }

    public void setIndeterminateAnimationType(int i6) {
        y hVar;
        e eVar = this.f10630x;
        if (((k) eVar).f10685o == i6) {
            return;
        }
        if (d() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((k) eVar).f10685o = i6;
        ((k) eVar).d();
        if (i6 == 1) {
            hVar = new j(getContext(), (k) eVar);
        } else {
            hVar = new h((k) eVar);
        }
        s indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.L = hVar;
        hVar.f6268a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i6) {
        ((k) this.f10630x).f10688r = i6;
        invalidate();
    }

    public void setIndicatorInset(int i6) {
        e eVar = this.f10630x;
        if (((k) eVar).f10687q != i6) {
            ((k) eVar).f10687q = i6;
            invalidate();
        }
    }

    public void setIndicatorSize(int i6) {
        int max = Math.max(i6, getTrackThickness() * 2);
        e eVar = this.f10630x;
        if (((k) eVar).f10686p != max) {
            ((k) eVar).f10686p = max;
            ((k) eVar).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // pa.d
    public void setTrackThickness(int i6) {
        super.setTrackThickness(i6);
        ((k) this.f10630x).d();
    }
}
