package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ef.r;
import i9.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import k8.g2;
import l2.t;
import o9.a0;
import o9.d;
import o9.x;
import o9.y;
import o9.z;
import org.xmlpull.v1.XmlPullParserException;
import p8.k;
import p8.l;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends LinearLayout {
    public static final int F = k.Widget_Material3_MaterialButtonGroup;
    public x A;
    public y B;
    public int C;
    public a0 D;
    public boolean E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f3386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f3387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g2 f3388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f3389y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer[] f3390z;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i) {
        x xVarB;
        XmlResourceParser xml;
        int next;
        a0 a0Var;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        int i10 = F;
        super(v9.a.a(context, attributeSet, i, i10), attributeSet, i);
        this.f3386v = new ArrayList();
        this.f3387w = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f3388x = new g2(28, materialButtonToggleGroup);
        this.f3389y = new t(2, materialButtonToggleGroup);
        this.E = true;
        Context context2 = getContext();
        TypedArray typedArrayD = m.d(context2, attributeSet, l.MaterialButtonGroup, i, i10, new int[0]);
        if (typedArrayD.hasValue(l.MaterialButtonGroup_buttonSizeChange)) {
            int resourceId = typedArrayD.getResourceId(l.MaterialButtonGroup_buttonSizeChange, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        a0Var = new a0();
                        a0Var.f9990c = new int[10][];
                        a0Var.f9991d = new g2[10];
                        attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    a0Var = null;
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.D = a0Var;
            } else {
                a0Var = null;
                this.D = a0Var;
            }
        }
        if (typedArrayD.hasValue(l.MaterialButtonGroup_shapeAppearance)) {
            y yVarB = y.b(context2, typedArrayD, l.MaterialButtonGroup_shapeAppearance);
            this.B = yVarB;
            if (yVarB == null) {
                r rVar = new r(o9.m.a(context2, typedArrayD.getResourceId(l.MaterialButtonGroup_shapeAppearance, 0), typedArrayD.getResourceId(l.MaterialButtonGroup_shapeAppearanceOverlay, 0)).a());
                this.B = rVar.f5029b != 0 ? new y(rVar) : null;
            }
        }
        if (typedArrayD.hasValue(l.MaterialButtonGroup_innerCornerSize)) {
            int i11 = l.MaterialButtonGroup_innerCornerSize;
            o9.a aVar = new o9.a(0.0f);
            int resourceId2 = typedArrayD.getResourceId(i11, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        x xVar = new x();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            xVar.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        xVarB = xVar;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    xVarB = x.b(aVar);
                }
            } else {
                xVarB = x.b(o9.m.d(typedArrayD, i11, aVar));
            }
            this.A = xVarB;
        }
        this.C = typedArrayD.getDimensionPixelSize(l.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(l.MaterialButtonGroup_android_enabled, true));
        typedArrayD.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.C <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.C - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.C - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.E = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f3388x);
        this.f3386v.add(materialButton.getShapeAppearanceModel());
        this.f3387w.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.D == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                if (c(i) && this.D != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    a0 a0Var = this.D;
                    int width = materialButton3.getWidth();
                    int i10 = -width;
                    for (int i11 = 0; i11 < a0Var.f9988a; i11++) {
                        z zVar = (z) a0Var.f9991d[i11].f7546w;
                        int i12 = zVar.f10079a;
                        float f = zVar.f10080b;
                        if (i12 == 2) {
                            fMax = Math.max(i10, f);
                        } else if (i12 == 1) {
                            fMax = Math.max(i10, width * f);
                        }
                        i10 = (int) fMax;
                    }
                    int iMax = Math.max(0, i10);
                    int i13 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i13 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i13)) {
                                materialButton2 = (MaterialButton) getChildAt(i13);
                                break;
                            }
                            i13--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i14 = i + 1;
                    while (true) {
                        if (i14 >= childCount) {
                            break;
                        }
                        if (c(i14)) {
                            materialButton = (MaterialButton) getChildAt(i14);
                            break;
                        }
                        i14++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i15 = firstVisibleChildIndex;
        while (i15 <= lastVisibleChildIndex) {
            if (c(i15)) {
                ((MaterialButton) getChildAt(i15)).setSizeChange(this.D);
                ((MaterialButton) getChildAt(i15)).setWidthChangeMax((i15 == firstVisibleChildIndex || i15 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i15++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.Q;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.Q = null;
                materialButton.N = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3389y);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f3390z = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Serializable, o9.m[]] */
    public final void e() {
        r rVar;
        int i;
        if (!(this.A == null && this.B == null) && this.E) {
            this.E = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                if (materialButton.getVisibility() != 8) {
                    boolean z2 = i10 == firstVisibleChildIndex;
                    boolean z10 = i10 == lastVisibleChildIndex;
                    y yVar = this.B;
                    if (yVar == null || (!z2 && !z10)) {
                        yVar = (y) this.f3387w.get(i10);
                    }
                    if (yVar == null) {
                        rVar = new r((o9.m) this.f3386v.get(i10));
                    } else {
                        r rVar2 = new r(1);
                        int i11 = yVar.f10072a;
                        rVar2.f5029b = i11;
                        rVar2.f5030c = yVar.f10073b;
                        int[][] iArr = yVar.f10074c;
                        ?? r14 = new int[iArr.length][];
                        rVar2.f5031d = r14;
                        o9.m[] mVarArr = yVar.f10075d;
                        rVar2.f5032e = new o9.m[mVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i11);
                        System.arraycopy(mVarArr, 0, (o9.m[]) rVar2.f5032e, 0, rVar2.f5029b);
                        rVar2.f = yVar.f10076e;
                        rVar2.f5033g = yVar.f;
                        rVar2.f5034h = yVar.f10077g;
                        rVar2.i = yVar.f10078h;
                        rVar = rVar2;
                    }
                    boolean z11 = getOrientation() == 0;
                    boolean z12 = getLayoutDirection() == 1;
                    if (z11) {
                        i = z2 ? 5 : 0;
                        if (z10) {
                            i |= 10;
                        }
                        if (z12) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z2 ? 3 : 0;
                        if (z10) {
                            i |= 12;
                        }
                    }
                    int i12 = ~i;
                    x xVar = this.A;
                    if ((i12 | 1) == i12) {
                        rVar.f = xVar;
                    }
                    if ((i12 | 2) == i12) {
                        rVar.f5033g = xVar;
                    }
                    if ((i12 | 4) == i12) {
                        rVar.f5034h = xVar;
                    }
                    if ((i12 | 8) == i12) {
                        rVar.i = xVar;
                    }
                    y yVar2 = rVar.f5029b == 0 ? null : new y(rVar);
                    if (yVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(yVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(yVar2.c());
                    }
                }
                i10++;
            }
        }
    }

    public a0 getButtonSizeChange() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i10) {
        Integer[] numArr = this.f3390z;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i10;
    }

    public d getInnerCornerSize() {
        return this.A.f10069b;
    }

    public x getInnerCornerSizeStateList() {
        return this.A;
    }

    public o9.m getShapeAppearance() {
        y yVar = this.B;
        if (yVar == null) {
            return null;
        }
        return yVar.c();
    }

    public int getSpacing() {
        return this.C;
    }

    public y getStateListShapeAppearance() {
        return this.B;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i10, int i11, int i12) {
        super.onLayout(z2, i, i10, i11, i12);
        if (z2) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        e();
        a();
        super.onMeasure(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f3386v.remove(iIndexOfChild);
            this.f3387w.remove(iIndexOfChild);
        }
        this.E = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(a0 a0Var) {
        if (this.D != a0Var) {
            this.D = a0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(d dVar) {
        this.A = x.b(dVar);
        this.E = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(x xVar) {
        this.A = xVar;
        this.E = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.E = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(o9.m mVar) {
        r rVar = new r(mVar);
        this.B = rVar.f5029b == 0 ? null : new y(rVar);
        this.E = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.C = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(y yVar) {
        this.B = yVar;
        this.E = true;
        e();
        invalidate();
    }
}
