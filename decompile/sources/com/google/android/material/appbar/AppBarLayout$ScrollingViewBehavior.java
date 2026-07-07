package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p8.l;
import r8.a;
import t0.m0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3307b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // f0.b
    public final boolean b(View view, View view2) {
        return false;
    }

    @Override // f0.b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((e) view2.getLayoutParams()).f5102a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f3307b;
            int iE = bottom - (i == 0 ? 0 : a.a.e((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = m0.f11853a;
            view.offsetTopAndBottom(iE);
        }
        return false;
    }

    @Override // f0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        int i12 = view.getLayoutParams().height;
        if (i12 != -1 && i12 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // f0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // r8.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.ScrollingViewBehavior_Layout);
        this.f3307b = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
