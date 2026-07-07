package com.google.android.material.chip;

import a2.a2;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import ea.g;
import ea.i;
import ea.j;
import java.util.Iterator;
import java.util.List;
import ma.a;
import ma.e;
import ma.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ChipGroup extends e {
    public int B;
    public int C;
    public i D;
    public final a E;
    public final int F;
    public final j G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r0 = 2132083876(0x7f1504a4, float:1.9807907E38)
            r4 = 2130968787(0x7f0400d3, float:1.7546238E38)
            android.content.Context r10 = ab.a.a(r10, r11, r4, r0)
            r9.<init>(r10, r11, r4)
            r0 = 0
            r9.f8768z = r0
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r1 = t9.a.f12686o
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1, r0, r0)
            r7 = 1
            int r1 = r10.getDimensionPixelSize(r7, r0)
            r9.f8766x = r1
            int r1 = r10.getDimensionPixelSize(r0, r0)
            r9.f8767y = r1
            r10.recycle()
            ma.a r10 = new ma.a
            r10.<init>()
            r9.E = r10
            ea.j r8 = new ea.j
            r8.<init>(r9)
            r9.G = r8
            android.content.Context r1 = r9.getContext()
            r5 = 2132083876(0x7f1504a4, float:1.9807907E38)
            int[] r6 = new int[r0]
            int[] r3 = t9.a.f12680h
            r2 = r11
            android.content.res.TypedArray r11 = ma.n.f(r1, r2, r3, r4, r5, r6)
            int r1 = r11.getDimensionPixelOffset(r7, r0)
            r2 = 2
            int r2 = r11.getDimensionPixelOffset(r2, r1)
            r9.setChipSpacingHorizontal(r2)
            r2 = 3
            int r1 = r11.getDimensionPixelOffset(r2, r1)
            r9.setChipSpacingVertical(r1)
            r1 = 5
            boolean r1 = r11.getBoolean(r1, r0)
            r9.setSingleLine(r1)
            r1 = 6
            boolean r1 = r11.getBoolean(r1, r0)
            r9.setSingleSelection(r1)
            r1 = 4
            boolean r1 = r11.getBoolean(r1, r0)
            r9.setSelectionRequired(r1)
            r1 = -1
            int r0 = r11.getResourceId(r0, r1)
            r9.F = r0
            r11.recycle()
            u5.r r11 = new u5.r
            r0 = 5
            r11.<init>(r9, r0)
            r10.f8725c = r11
            super.setOnHierarchyChangeListener(r8)
            r9.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getVisibleChipCount() {
        int i6 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof Chip) && getChildAt(i10).getVisibility() == 0) {
                i6++;
            }
        }
        return i6;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.E.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.E.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.B;
    }

    public int getChipSpacingVertical() {
        return this.C;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.F;
        if (i6 != -1) {
            a aVar = this.E;
            h hVar = (h) aVar.f8723a.get(Integer.valueOf(i6));
            if (hVar != null && aVar.a(hVar)) {
                aVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f8768z) {
            i6 = getVisibleChipCount();
        } else {
            i6 = -1;
        }
        int rowCount = getRowCount();
        if (this.E.f8726d) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, i6, false, i10));
    }

    public void setChipSpacing(int i6) {
        setChipSpacingHorizontal(i6);
        setChipSpacingVertical(i6);
    }

    public void setChipSpacingHorizontal(int i6) {
        if (this.B != i6) {
            this.B = i6;
            setItemSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i6) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingResource(int i6) {
        setChipSpacing(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingVertical(int i6) {
        if (this.C != i6) {
            this.C = i6;
            setLineSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i6) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i6));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i6) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(ea.h hVar) {
        if (hVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a2(this, 5));
        }
    }

    public void setOnCheckedStateChangeListener(i iVar) {
        this.D = iVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.G.f4543x = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.E.f8727e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // ma.e
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        a aVar = this.E;
        if (aVar.f8726d != z10) {
            aVar.f8726d = z10;
            boolean isEmpty = aVar.f8724b.isEmpty();
            Iterator it = aVar.f8723a.values().iterator();
            while (it.hasNext()) {
                aVar.e((h) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            aVar.d();
        }
    }

    public void setSingleLine(int i6) {
        setSingleLine(getResources().getBoolean(i6));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }
}
