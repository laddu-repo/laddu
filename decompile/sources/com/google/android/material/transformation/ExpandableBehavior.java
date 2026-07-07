package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f0.b;
import ja.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f2819a = 0;

    public ExpandableBehavior() {
    }

    @Override // f0.b
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z10 = ((FloatingActionButton) obj).L.f7317a;
        int i6 = 2;
        if (z10) {
            int i10 = this.f2819a;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f2819a != 1) {
            return false;
        }
        if (z10) {
            i6 = 1;
        }
        this.f2819a = i6;
        s((View) obj, view, z10, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        a aVar;
        int i10;
        if (!view.isLaidOut()) {
            ArrayList k8 = coordinatorLayout.k(view);
            int size = k8.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    View view2 = (View) k8.get(i11);
                    if (b(view, view2)) {
                        aVar = (a) view2;
                        break;
                    }
                    i11++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                boolean z10 = ((FloatingActionButton) aVar).L.f7317a;
                int i12 = 2;
                if (!z10 ? this.f2819a == 1 : !((i10 = this.f2819a) != 0 && i10 != 2)) {
                    if (z10) {
                        i12 = 1;
                    }
                    this.f2819a = i12;
                    view.getViewTreeObserver().addOnPreDrawListener(new bb.a(this, view, i12, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
