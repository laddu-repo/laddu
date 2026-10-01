package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.playfy.tv.R;
import f0.e;
import j4.b0;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    public HashMap f2829i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void s(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f2829i = new HashMap(childCount);
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt.getLayoutParams() instanceof e) && (((e) childAt.getLayoutParams()).f4611a instanceof FabTransformationScrimBehavior)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (childAt != view2 && !z12) {
                    if (!z10) {
                        HashMap hashMap = this.f2829i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.f2829i.get(childAt)).intValue());
                        }
                    } else {
                        this.f2829i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z10) {
                this.f2829i = null;
            }
        }
        super.s(view, view2, z10, z11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j4.b0] */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final b0 z(Context context, boolean z10) {
        int i6;
        if (z10) {
            i6 = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i6 = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        ?? obj = new Object();
        obj.f7158x = u9.e.b(context, i6);
        obj.f7159y = new Object();
        return obj;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
