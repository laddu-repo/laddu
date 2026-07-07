package com.playfy.tv.helpers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import w4.t0;
import w4.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AbsoluteLayoutManager extends GridLayoutManager {
    public AbsoluteLayoutManager(Context context, AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, w4.s0
    public final boolean f(t0 t0Var) {
        return t0Var instanceof x;
    }

    public final void p1(x xVar) {
        if (this.f1109p == 0) {
            ((ViewGroup.MarginLayoutParams) xVar).width = Math.round(((this.f14016n - F()) - E()) / 2.0f);
            xVar.setMargins(2, 2, 2, 2);
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, w4.s0
    public final t0 r() {
        t0 r10 = super.r();
        p1((x) r10);
        return r10;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, w4.s0
    public final t0 s(Context context, AttributeSet attributeSet) {
        t0 s = super.s(context, attributeSet);
        p1((x) s);
        return s;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, w4.s0
    public final t0 t(ViewGroup.LayoutParams layoutParams) {
        t0 t10 = super.t(layoutParams);
        p1((x) t10);
        return t10;
    }
}
