package aa;

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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import ma.n;
import org.xmlpull.v1.XmlPullParserException;
import ua.a0;
import ua.m;
import ua.w;
import ua.x;
import ua.y;
import ua.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f extends LinearLayout {
    public final e A;
    public Integer[] B;
    public w C;
    public y D;
    public int E;
    public a0 F;
    public boolean G;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f648x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f649y;

    /* renamed from: z, reason: collision with root package name */
    public final lc.c f650z;

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, ua.a0] */
    public f(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        w b10;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        a0 a0Var;
        this.f648x = new ArrayList();
        this.f649y = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f650z = new lc.c(materialButtonToggleGroup);
        this.A = new e(materialButtonToggleGroup, 0);
        this.G = true;
        Context context2 = getContext();
        TypedArray f3 = n.f(context2, attributeSet, t9.a.f12691u, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (f3.hasValue(2)) {
            int resourceId = f3.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        obj = new Object();
                        obj.f12970c = new int[10];
                        obj.f12971d = new k7.d[10];
                        asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 == 2) {
                    if (xml.getName().equals("selector")) {
                        obj.a(context2, xml, asAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    a0Var = obj;
                    this.F = a0Var;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            a0Var = null;
            this.F = a0Var;
        }
        if (f3.hasValue(4)) {
            y b11 = y.b(context2, f3, 4);
            this.D = b11;
            if (b11 == null) {
                x xVar = new x(m.a(context2, f3.getResourceId(4, 0), f3.getResourceId(5, 0)).a());
                this.D = xVar.f13049a != 0 ? new y(xVar) : null;
            }
        }
        if (f3.hasValue(3)) {
            ua.a aVar = new ua.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int resourceId2 = f3.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b10 = w.b(m.d(f3, 3, aVar));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b10 = w.b(m.d(f3, 3, aVar));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        b10 = new w();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml2.getName().equals("selector")) {
                                b10.d(context2, xml2, asAttributeSet2, context2.getTheme());
                            }
                            xml2.close();
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b10 = w.b(aVar);
                }
            }
            this.C = b10;
        }
        this.E = f3.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f3.getBoolean(0, true));
        f3.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (c(i6)) {
                return i6;
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
        int i6;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i10 - 1);
                if (this.E <= 0) {
                    i6 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i6 = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.E - i6);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.E - i6;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
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
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.G = true;
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f650z);
        this.f648x.add(materialButton.getShapeAppearanceModel());
        this.f649y.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i6;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.F != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = Integer.MAX_VALUE;
            for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
                if (c(i11)) {
                    int i12 = 0;
                    if (c(i11) && this.F != null) {
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i11);
                        a0 a0Var = this.F;
                        int width = materialButton3.getWidth();
                        int i13 = -width;
                        for (int i14 = 0; i14 < a0Var.f12968a; i14++) {
                            z zVar = (z) a0Var.f12971d[i14].f7747y;
                            int i15 = zVar.f13065a;
                            float f3 = zVar.f13066b;
                            if (i15 == 2) {
                                max = Math.max(i13, f3);
                            } else if (i15 == 1) {
                                max = Math.max(i13, width * f3);
                            }
                            i13 = (int) max;
                        }
                        int max2 = Math.max(0, i13);
                        int i16 = i11 - 1;
                        while (true) {
                            materialButton = null;
                            if (i16 >= 0) {
                                if (c(i16)) {
                                    materialButton2 = (MaterialButton) getChildAt(i16);
                                    break;
                                }
                                i16--;
                            } else {
                                materialButton2 = null;
                                break;
                            }
                        }
                        if (materialButton2 == null) {
                            allowedWidthDecrease = 0;
                        } else {
                            allowedWidthDecrease = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i17 = i11 + 1;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            if (c(i17)) {
                                materialButton = (MaterialButton) getChildAt(i17);
                                break;
                            }
                            i17++;
                        }
                        if (materialButton != null) {
                            i12 = materialButton.getAllowedWidthDecrease();
                        }
                        i12 = Math.min(max2, allowedWidthDecrease + i12);
                    }
                    if (i11 != firstVisibleChildIndex && i11 != lastVisibleChildIndex) {
                        i12 /= 2;
                    }
                    i10 = Math.min(i10, i12);
                }
            }
            for (int i18 = firstVisibleChildIndex; i18 <= lastVisibleChildIndex; i18++) {
                if (c(i18)) {
                    ((MaterialButton) getChildAt(i18)).setSizeChange(this.F);
                    MaterialButton materialButton4 = (MaterialButton) getChildAt(i18);
                    if (i18 != firstVisibleChildIndex && i18 != lastVisibleChildIndex) {
                        i6 = i10 * 2;
                    } else {
                        i6 = i10;
                    }
                    materialButton4.setWidthChangeMax(i6);
                }
            }
        }
    }

    public final boolean c(int i6) {
        if (getChildAt(i6).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = materialButton.S;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.S = null;
                materialButton.P = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put((MaterialButton) getChildAt(i6), Integer.valueOf(i6));
        }
        this.B = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [ua.x, java.lang.Object] */
    public final void e() {
        boolean z10;
        boolean z11;
        x xVar;
        boolean z12;
        boolean z13;
        int i6;
        y yVar;
        if ((this.C != null || this.D != null) && this.G) {
            this.G = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i10 = 0; i10 < childCount; i10++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                if (materialButton.getVisibility() != 8) {
                    if (i10 == firstVisibleChildIndex) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == lastVisibleChildIndex) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y yVar2 = this.D;
                    if (yVar2 == null || (!z10 && !z11)) {
                        yVar2 = (y) this.f649y.get(i10);
                    }
                    if (yVar2 == null) {
                        xVar = new x((m) this.f648x.get(i10));
                    } else {
                        ?? obj = new Object();
                        int i11 = yVar2.f13057a;
                        obj.f13049a = i11;
                        obj.f13050b = yVar2.f13058b;
                        int[][] iArr = yVar2.f13059c;
                        int[][] iArr2 = new int[iArr.length];
                        obj.f13051c = iArr2;
                        m[] mVarArr = yVar2.f13060d;
                        obj.f13052d = new m[mVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i11);
                        System.arraycopy(mVarArr, 0, obj.f13052d, 0, obj.f13049a);
                        obj.f13053e = yVar2.f13061e;
                        obj.f13054f = yVar2.f13062f;
                        obj.f13055g = yVar2.f13063g;
                        obj.f13056h = yVar2.f13064h;
                        xVar = obj;
                    }
                    if (getOrientation() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                        if (z10) {
                            i6 = 5;
                        } else {
                            i6 = 0;
                        }
                        if (z11) {
                            i6 |= 10;
                        }
                        if (z13) {
                            int i12 = i6 & 5;
                            i6 = ((i6 & 10) >> 1) | (i12 << 1);
                        }
                    } else {
                        if (z10) {
                            i6 = 3;
                        } else {
                            i6 = 0;
                        }
                        if (z11) {
                            i6 |= 12;
                        }
                    }
                    int i13 = ~i6;
                    w wVar = this.C;
                    if ((i13 | 1) == i13) {
                        xVar.f13053e = wVar;
                    }
                    if ((i13 | 2) == i13) {
                        xVar.f13054f = wVar;
                    }
                    if ((i13 | 4) == i13) {
                        xVar.f13055g = wVar;
                    }
                    if ((i13 | 8) == i13) {
                        xVar.f13056h = wVar;
                    }
                    if (xVar.f13049a == 0) {
                        yVar = null;
                    } else {
                        yVar = new y(xVar);
                    }
                    if (yVar.d()) {
                        materialButton.setStateListShapeAppearanceModel(yVar);
                    } else {
                        materialButton.setShapeAppearanceModel(yVar.c());
                    }
                }
            }
        }
    }

    public a0 getButtonSizeChange() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        Integer[] numArr = this.B;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i10;
    }

    public ua.d getInnerCornerSize() {
        return this.C.f13046b;
    }

    public w getInnerCornerSizeStateList() {
        return this.C;
    }

    public m getShapeAppearance() {
        y yVar = this.D;
        if (yVar == null) {
            return null;
        }
        return yVar.c();
    }

    public int getSpacing() {
        return this.E;
    }

    public y getStateListShapeAppearance() {
        return this.D;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (z10) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        e();
        a();
        super.onMeasure(i6, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f648x.remove(indexOfChild);
            this.f649y.remove(indexOfChild);
        }
        this.G = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(a0 a0Var) {
        if (this.F != a0Var) {
            this.F = a0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            ((MaterialButton) getChildAt(i6)).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(ua.d dVar) {
        this.C = w.b(dVar);
        this.G = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(w wVar) {
        this.C = wVar;
        this.G = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (getOrientation() != i6) {
            this.G = true;
        }
        super.setOrientation(i6);
    }

    public void setShapeAppearance(m mVar) {
        y yVar;
        x xVar = new x(mVar);
        if (xVar.f13049a == 0) {
            yVar = null;
        } else {
            yVar = new y(xVar);
        }
        this.D = yVar;
        this.G = true;
        e();
        invalidate();
    }

    public void setSpacing(int i6) {
        this.E = i6;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(y yVar) {
        this.D = yVar;
        this.G = true;
        e();
        invalidate();
    }
}
