package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import d0.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final ClockHandView Q;
    public final Rect R;
    public final RectF S;
    public final Rect T;
    public final SparseArray U;
    public final c V;
    public final int[] W;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f2800a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f2801b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f2802c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f2803d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f2804e0;

    /* renamed from: f0, reason: collision with root package name */
    public final String[] f2805f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f2806g0;

    /* renamed from: h0, reason: collision with root package name */
    public final ColorStateList f2807h0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new Rect();
        this.S = new RectF();
        this.T = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.U = sparseArray;
        this.f2800a0 = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList i6 = a8.i.i(context, obtainStyledAttributes, 1);
        this.f2807h0 = i6;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.Q = clockHandView;
        this.f2801b0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = i6.getColorForState(new int[]{android.R.attr.state_selected}, i6.getDefaultColor());
        this.W = new int[]{colorForState, colorForState, i6.getDefaultColor()};
        clockHandView.f2810z.add(this);
        int defaultColor = i0.f.d(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList i10 = a8.i.i(context, obtainStyledAttributes, 0);
        setBackgroundColor(i10 != null ? i10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.V = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, HttpUrl.FRAGMENT_ENCODE_SET);
        this.f2805f0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f2805f0.length, size); i11++) {
            TextView textView = (TextView) sparseArray.get(i11);
            if (i11 >= this.f2805f0.length) {
                removeView(textView);
                sparseArray.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f2805f0[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i12));
                z10 = i12 > 1 ? true : z10;
                q0.r(textView, this.V);
                textView.setTextColor(this.f2807h0);
            }
        }
        ClockHandView clockHandView2 = this.Q;
        if (clockHandView2.f2809y && !z10) {
            clockHandView2.J = 1;
        }
        clockHandView2.f2809y = z10;
        clockHandView2.invalidate();
        this.f2802c0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f2803d0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2804e0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        int i6;
        o oVar = new o();
        oVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i6 = Math.round(this.O * 0.66f);
            } else {
                i6 = this.O;
            }
            Iterator it = list.iterator();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                d0.k kVar = oVar.e(((View) it.next()).getId()).f3569d;
                kVar.f3610z = R.id.circle_center;
                kVar.A = i6;
                kVar.B = f3;
                f3 += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.U;
            if (i12 < sparseArray.size()) {
                ((TextView) sparseArray.get(i12)).setVisibility(0);
                i12++;
            } else {
                return;
            }
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z10;
        RadialGradient radialGradient;
        RectF rectF2 = this.Q.D;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i6 = 0;
        while (true) {
            sparseArray = this.U;
            int size = sparseArray.size();
            rect = this.R;
            rectF = this.S;
            if (i6 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f3) {
                    textView = textView2;
                    f3 = height;
                }
            }
            i6++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.T);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.W, this.f2800a0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2805f0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2804e0 / Math.max(Math.max(this.f2802c0 / displayMetrics.heightPixels, this.f2803d0 / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
