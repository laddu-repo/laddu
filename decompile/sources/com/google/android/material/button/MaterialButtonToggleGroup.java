package com.google.android.material.button;

import aa.f;
import aa.h;
import ab.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.i;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ma.n;
import t0.q0;
import ua.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends f {
    public static final /* synthetic */ int N = 0;
    public final LinkedHashSet H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final int L;
    public HashSet M;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.H = new LinkedHashSet();
        this.I = false;
        this.M = new HashSet();
        TypedArray f3 = n.f(getContext(), attributeSet, t9.a.f12692v, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f3.getBoolean(7, false));
        this.L = f3.getResourceId(2, -1);
        this.K = f3.getBoolean(4, false);
        if (this.C == null) {
            this.C = w.b(new ua.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        setEnabled(f3.getBoolean(0, true));
        f3.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        Class cls;
        if (this.J) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && getChildAt(i10).getVisibility() != 8) {
                i6++;
            }
        }
        return i6;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // aa.f, android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.L);
        q0.r(materialButton, new h(this, 0));
    }

    public final void f(int i6, boolean z10) {
        if (i6 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i6);
            return;
        }
        HashSet hashSet = new HashSet(this.M);
        if (z10 && !hashSet.contains(Integer.valueOf(i6))) {
            if (this.J && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i6));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i6))) {
            if (!this.K || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i6));
            }
        } else {
            return;
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.M;
        this.M = new HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id2 = ((MaterialButton) getChildAt(i6)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.I = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.I = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.H.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (this.J && !this.M.isEmpty()) {
            return ((Integer) this.M.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id2 = ((MaterialButton) getChildAt(i6)).getId();
            if (this.M.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.L;
        if (i6 != -1) {
            g(Collections.singleton(Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.J) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i6));
    }

    public void setSelectionRequired(boolean z10) {
        this.K = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            ((MaterialButton) getChildAt(i6)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }
}
