package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import ld.o;
import ma.n;
import ob.a;
import p.c2;
import s0.d;
import s5.b;
import s5.g;
import ua.i;
import w4.t;
import ya.c;
import ya.f;
import ya.h;
import ya.j;
import ya.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@b
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: w0, reason: collision with root package name */
    public static final d f2744w0 = new d(16);
    public final f A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public ColorStateList I;
    public ColorStateList J;
    public ColorStateList K;
    public Drawable L;
    public int M;
    public final float N;
    public final float O;
    public final float P;
    public final int Q;
    public int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f2745a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f2746b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f2747c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2748d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f2749e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f2750f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f2751g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f2752h0;

    /* renamed from: i0, reason: collision with root package name */
    public a f2753i0;

    /* renamed from: j0, reason: collision with root package name */
    public final TimeInterpolator f2754j0;

    /* renamed from: k0, reason: collision with root package name */
    public c f2755k0;

    /* renamed from: l0, reason: collision with root package name */
    public final ArrayList f2756l0;

    /* renamed from: m0, reason: collision with root package name */
    public k f2757m0;

    /* renamed from: n0, reason: collision with root package name */
    public ValueAnimator f2758n0;
    public g o0;

    /* renamed from: p0, reason: collision with root package name */
    public s5.a f2759p0;

    /* renamed from: q0, reason: collision with root package name */
    public c2 f2760q0;

    /* renamed from: r0, reason: collision with root package name */
    public h f2761r0;

    /* renamed from: s0, reason: collision with root package name */
    public ya.b f2762s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2763t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f2764u0;

    /* renamed from: v0, reason: collision with root package name */
    public final s0.c f2765v0;

    /* renamed from: x, reason: collision with root package name */
    public int f2766x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f2767y;

    /* renamed from: z, reason: collision with root package name */
    public ya.g f2768z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(ab.a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f2766x = -1;
        this.f2767y = new ArrayList();
        this.H = -1;
        this.M = 0;
        this.R = Integer.MAX_VALUE;
        this.f2750f0 = -1;
        this.f2756l0 = new ArrayList();
        this.f2765v0 = new s0.c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(this, context2);
        this.A = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray f3 = n.f(context2, attributeSet, t9.a.O, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList g10 = a4.g(getBackground());
        if (g10 != null) {
            i iVar = new i();
            iVar.q(g10);
            iVar.m(context2);
            iVar.p(getElevation());
            setBackground(iVar);
        }
        setSelectedTabIndicator(a8.i.l(context2, f3, 5));
        setSelectedTabIndicatorColor(f3.getColor(8, 0));
        fVar.b(f3.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(f3.getInt(10, 0));
        setTabIndicatorAnimationMode(f3.getInt(7, 0));
        setTabIndicatorFullWidth(f3.getBoolean(9, true));
        int dimensionPixelSize = f3.getDimensionPixelSize(16, 0);
        this.E = dimensionPixelSize;
        this.D = dimensionPixelSize;
        this.C = dimensionPixelSize;
        this.B = dimensionPixelSize;
        this.B = f3.getDimensionPixelSize(19, dimensionPixelSize);
        this.C = f3.getDimensionPixelSize(20, dimensionPixelSize);
        this.D = f3.getDimensionPixelSize(18, dimensionPixelSize);
        this.E = f3.getDimensionPixelSize(17, dimensionPixelSize);
        if (a8.g.p(context2, R.attr.isMaterial3Theme, false)) {
            this.F = R.attr.textAppearanceTitleSmall;
        } else {
            this.F = R.attr.textAppearanceButton;
        }
        int resourceId = f3.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.G = resourceId;
        int[] iArr = h.a.f5754y;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.N = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.I = a8.i.i(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (f3.hasValue(22)) {
                this.H = f3.getResourceId(22, resourceId);
            }
            int i6 = this.H;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i6 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i6, iArr);
                try {
                    this.O = obtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList i10 = a8.i.i(context2, obtainStyledAttributes, 3);
                    if (i10 != null) {
                        this.I = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{i10.getColorForState(new int[]{android.R.attr.state_selected}, i10.getDefaultColor()), this.I.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (f3.hasValue(25)) {
                this.I = a8.i.i(context2, f3, 25);
            }
            if (f3.hasValue(23)) {
                this.I = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{f3.getColor(23, 0), this.I.getDefaultColor()});
            }
            this.J = a8.i.i(context2, f3, 3);
            n.g(f3.getInt(4, -1), null);
            this.K = a8.i.i(context2, f3, 21);
            this.f2745a0 = f3.getInt(6, 300);
            this.f2754j0 = j5.u(context2, R.attr.motionEasingEmphasizedInterpolator, u9.a.f12954b);
            this.S = f3.getDimensionPixelSize(14, -1);
            this.T = f3.getDimensionPixelSize(13, -1);
            this.Q = f3.getResourceId(0, 0);
            this.V = f3.getDimensionPixelSize(1, 0);
            this.f2747c0 = f3.getInt(15, 1);
            this.W = f3.getInt(2, 0);
            this.f2748d0 = f3.getBoolean(12, false);
            this.f2752h0 = f3.getBoolean(26, false);
            f3.recycle();
            Resources resources = getResources();
            this.P = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.U = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            b();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f2767y;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i6 = this.S;
        if (i6 != -1) {
            return i6;
        }
        int i10 = this.f2747c0;
        if (i10 != 0 && i10 != 2) {
            return 0;
        }
        return this.U;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i6) {
        boolean z10;
        boolean z11;
        f fVar = this.A;
        int childCount = fVar.getChildCount();
        if (i6 < childCount) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = fVar.getChildAt(i10);
                boolean z12 = true;
                if ((i10 == i6 && !childAt.isSelected()) || (i10 != i6 && childAt.isSelected())) {
                    if (i10 == i6) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i10 != i6) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof j) {
                        ((j) childAt).f();
                    }
                } else {
                    if (i10 == i6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i10 != i6) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                }
            }
        }
    }

    public final void a(int i6) {
        if (i6 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.A;
            int childCount = fVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (fVar.getChildAt(i10).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int c10 = c(i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (scrollX != c10) {
                d();
                this.f2758n0.setIntValues(scrollX, c10);
                this.f2758n0.start();
            }
            ValueAnimator valueAnimator = fVar.f15030x;
            if (valueAnimator != null && valueAnimator.isRunning() && fVar.f15032z.f2766x != i6) {
                fVar.f15030x.cancel();
            }
            fVar.d(true, i6, this.f2745a0);
            return;
        }
        h(i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            int r0 = r5.f2747c0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r5.V
            int r3 = r5.B
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            ya.f r3 = r5.A
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.f2747c0
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 == r4) goto L25
            if (r0 == r1) goto L25
            goto L4a
        L25:
            int r0 = r5.W
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            r3.setGravity(r4)
            goto L4a
        L32:
            int r0 = r5.W
            if (r0 == 0) goto L3f
            if (r0 == r4) goto L3b
            if (r0 == r1) goto L44
            goto L4a
        L3b:
            r3.setGravity(r4)
            goto L4a
        L3f:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L44:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4a:
            r5.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.b():void");
    }

    public final int c(int i6, float f3) {
        f fVar;
        View childAt;
        View view;
        int i10 = this.f2747c0;
        int i11 = 0;
        if ((i10 != 0 && i10 != 2) || (childAt = (fVar = this.A).getChildAt(i6)) == null) {
            return 0;
        }
        int i12 = i6 + 1;
        if (i12 < fVar.getChildCount()) {
            view = fVar.getChildAt(i12);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i11 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + i11) * 0.5f * f3);
        if (getLayoutDirection() == 0) {
            return left + i13;
        }
        return left - i13;
    }

    public final void d() {
        if (this.f2758n0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2758n0 = valueAnimator;
            valueAnimator.setInterpolator(this.f2754j0);
            this.f2758n0.setDuration(this.f2745a0);
            this.f2758n0.addUpdateListener(new t(this, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [ya.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, ya.j] */
    /* JADX WARN: Type inference failed for: r12v25, types: [ya.j] */
    /* JADX WARN: Type inference failed for: r12v28 */
    public final void e() {
        s0.c cVar;
        CharSequence charSequence;
        d dVar;
        int currentItem;
        ya.g gVar;
        ?? r12;
        String string;
        f fVar = this.A;
        int childCount = fVar.getChildCount() - 1;
        while (true) {
            cVar = this.f2765v0;
            charSequence = null;
            if (childCount < 0) {
                break;
            }
            j jVar = (j) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (jVar != null) {
                jVar.setTab(null);
                jVar.setSelected(false);
                cVar.c(jVar);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f2767y;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = f2744w0;
            if (!hasNext) {
                break;
            }
            ya.g gVar2 = (ya.g) it.next();
            it.remove();
            gVar2.f15036d = null;
            gVar2.f15037e = null;
            gVar2.f15033a = null;
            gVar2.f15034b = -1;
            gVar2.f15035c = null;
            dVar.c(gVar2);
        }
        this.f2768z = null;
        s5.a aVar = this.f2759p0;
        if (aVar != null) {
            int c10 = aVar.c();
            int i6 = 0;
            while (i6 < c10) {
                ya.g gVar3 = (ya.g) dVar.a();
                ya.g gVar4 = gVar3;
                if (gVar3 == null) {
                    ?? obj = new Object();
                    obj.f15034b = -1;
                    gVar4 = obj;
                }
                gVar4.f15036d = this;
                if (cVar != null) {
                    r12 = (j) cVar.a();
                } else {
                    r12 = charSequence;
                }
                if (r12 == 0) {
                    r12 = new j(this, getContext());
                }
                r12.setTab(gVar4);
                r12.setFocusable(true);
                r12.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(charSequence)) {
                    r12.setContentDescription(gVar4.f15033a);
                } else {
                    r12.setContentDescription(charSequence);
                }
                gVar4.f15037e = r12;
                o oVar = ((ld.n) this.f2759p0).f8348g;
                Resources h4 = oVar.h();
                int intValue = ((Integer) oVar.Q0.get(i6)).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                string = h4.getString(R.string.track_selection_title_image);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            string = h4.getString(R.string.track_selection_title_text);
                        }
                    } else {
                        string = h4.getString(R.string.track_selection_title_video);
                    }
                } else {
                    string = h4.getString(R.string.track_selection_title_audio);
                }
                if (TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(string)) {
                    gVar4.f15037e.setContentDescription(string);
                }
                gVar4.f15033a = string;
                j jVar2 = gVar4.f15037e;
                if (jVar2 != null) {
                    jVar2.d();
                }
                int size = arrayList.size();
                if (gVar4.f15036d == this) {
                    gVar4.f15034b = size;
                    arrayList.add(size, gVar4);
                    int size2 = arrayList.size();
                    int i10 = -1;
                    for (int i11 = size + 1; i11 < size2; i11++) {
                        if (((ya.g) arrayList.get(i11)).f15034b == this.f2766x) {
                            i10 = i11;
                        }
                        ((ya.g) arrayList.get(i11)).f15034b = i11;
                    }
                    this.f2766x = i10;
                    j jVar3 = gVar4.f15037e;
                    jVar3.setSelected(false);
                    jVar3.setActivated(false);
                    int i12 = gVar4.f15034b;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    if (this.f2747c0 == 1 && this.W == 0) {
                        layoutParams.width = 0;
                        layoutParams.weight = 1.0f;
                    } else {
                        layoutParams.width = -2;
                        layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    fVar.addView(jVar3, i12, layoutParams);
                    i6++;
                    charSequence = null;
                } else {
                    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                }
            }
            g gVar5 = this.o0;
            if (gVar5 != null && c10 > 0 && (currentItem = gVar5.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                if (currentItem >= 0 && currentItem < getTabCount()) {
                    gVar = (ya.g) arrayList.get(currentItem);
                } else {
                    gVar = null;
                }
                f(gVar, true);
            }
        }
    }

    public final void f(ya.g gVar, boolean z10) {
        int i6;
        TabLayout tabLayout;
        ya.g gVar2 = this.f2768z;
        ArrayList arrayList = this.f2756l0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).getClass();
                }
                a(gVar.f15034b);
                return;
            }
            return;
        }
        if (gVar != null) {
            i6 = gVar.f15034b;
        } else {
            i6 = -1;
        }
        if (z10) {
            if ((gVar2 != null && gVar2.f15034b != -1) || i6 == -1) {
                tabLayout = this;
                a(i6);
            } else {
                tabLayout = this;
                tabLayout.h(i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
            }
            if (i6 != -1) {
                setSelectedTabView(i6);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.f2768z = gVar;
        if (gVar2 != null && gVar2.f15036d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((k) ((c) arrayList.get(size3))).f15046a.setCurrentItem(gVar.f15034b);
            }
        }
    }

    public final void g(s5.a aVar, boolean z10) {
        c2 c2Var;
        s5.a aVar2 = this.f2759p0;
        if (aVar2 != null && (c2Var = this.f2760q0) != null) {
            aVar2.f12186a.unregisterObserver(c2Var);
        }
        this.f2759p0 = aVar;
        if (z10 && aVar != null) {
            if (this.f2760q0 == null) {
                this.f2760q0 = new c2(this, 3);
            }
            aVar.f12186a.registerObserver(this.f2760q0);
        }
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        ya.g gVar = this.f2768z;
        if (gVar != null) {
            return gVar.f15034b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f2767y.size();
    }

    public int getTabGravity() {
        return this.W;
    }

    public ColorStateList getTabIconTint() {
        return this.J;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f2751g0;
    }

    public int getTabIndicatorGravity() {
        return this.f2746b0;
    }

    public int getTabMaxWidth() {
        return this.R;
    }

    public int getTabMode() {
        return this.f2747c0;
    }

    public ColorStateList getTabRippleColor() {
        return this.K;
    }

    public Drawable getTabSelectedIndicator() {
        return this.L;
    }

    public ColorStateList getTabTextColors() {
        return this.I;
    }

    public final void h(int i6, float f3, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f10 = i6 + f3;
        int round = Math.round(f10);
        if (round >= 0) {
            f fVar = this.A;
            if (round < fVar.getChildCount()) {
                if (z11) {
                    fVar.f15032z.f2766x = Math.round(f10);
                    ValueAnimator valueAnimator = fVar.f15030x;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar.f15030x.cancel();
                    }
                    fVar.c(fVar.getChildAt(i6), fVar.getChildAt(i6 + 1), f3);
                }
                ValueAnimator valueAnimator2 = this.f2758n0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f2758n0.cancel();
                }
                int c10 = c(i6, f3);
                int scrollX = getScrollX();
                if ((i6 < getSelectedTabPosition() && c10 >= scrollX) || ((i6 > getSelectedTabPosition() && c10 <= scrollX) || i6 == getSelectedTabPosition())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (getLayoutDirection() == 1) {
                    if ((i6 < getSelectedTabPosition() && c10 <= scrollX) || ((i6 > getSelectedTabPosition() && c10 >= scrollX) || i6 == getSelectedTabPosition())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (z13 || this.f2764u0 == 1 || z12) {
                    if (i6 < 0) {
                        c10 = 0;
                    }
                    scrollTo(c10, 0);
                }
                if (z10) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void i(g gVar, boolean z10) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        g gVar2 = this.o0;
        if (gVar2 != null) {
            h hVar = this.f2761r0;
            if (hVar != null && (arrayList2 = gVar2.f12215q0) != null) {
                arrayList2.remove(hVar);
            }
            ya.b bVar = this.f2762s0;
            if (bVar != null && (arrayList = this.o0.f12217s0) != null) {
                arrayList.remove(bVar);
            }
        }
        k kVar = this.f2757m0;
        ArrayList arrayList3 = this.f2756l0;
        if (kVar != null) {
            arrayList3.remove(kVar);
            this.f2757m0 = null;
        }
        if (gVar != null) {
            this.o0 = gVar;
            if (this.f2761r0 == null) {
                this.f2761r0 = new h(this);
            }
            h hVar2 = this.f2761r0;
            hVar2.f15040c = 0;
            hVar2.f15039b = 0;
            if (gVar.f12215q0 == null) {
                gVar.f12215q0 = new ArrayList();
            }
            gVar.f12215q0.add(hVar2);
            k kVar2 = new k(gVar);
            this.f2757m0 = kVar2;
            if (!arrayList3.contains(kVar2)) {
                arrayList3.add(kVar2);
            }
            s5.a adapter = gVar.getAdapter();
            if (adapter != null) {
                g(adapter, true);
            }
            if (this.f2762s0 == null) {
                this.f2762s0 = new ya.b(this);
            }
            ya.b bVar2 = this.f2762s0;
            bVar2.f15025a = true;
            if (gVar.f12217s0 == null) {
                gVar.f12217s0 = new ArrayList();
            }
            gVar.f12217s0.add(bVar2);
            h(gVar.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
            tabLayout = this;
        } else {
            tabLayout = this;
            tabLayout.o0 = null;
            g(null, false);
        }
        tabLayout.f2763t0 = z10;
    }

    public final void j(boolean z10) {
        int i6 = 0;
        while (true) {
            f fVar = this.A;
            if (i6 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i6);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.f2747c0 == 1 && this.W == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                if (z10) {
                    childAt.requestLayout();
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            lg.c.s(this, (i) background);
        }
        if (this.o0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof g) {
                i((g) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2763t0) {
            setupWithViewPager(null);
            this.f2763t0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j jVar;
        Drawable drawable;
        int i6 = 0;
        while (true) {
            f fVar = this.A;
            if (i6 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i6);
                if ((childAt instanceof j) && (drawable = (jVar = (j) childAt).F) != null) {
                    drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                    jVar.F.draw(canvas);
                }
                i6++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int round = Math.round(n.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i10) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i6);
        if (View.MeasureSpec.getMode(i6) != 0) {
            int i11 = this.T;
            if (i11 <= 0) {
                i11 = (int) (size - n.d(getContext(), 56));
            }
            this.R = i11;
        }
        super.onMeasure(i6, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f2747c0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof i) {
            ((i) background).p(f3);
        }
    }

    public void setInlineLabel(boolean z10) {
        if (this.f2748d0 != z10) {
            this.f2748d0 = z10;
            int i6 = 0;
            while (true) {
                f fVar = this.A;
                if (i6 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i6);
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        jVar.setOrientation(!jVar.H.f2748d0 ? 1 : 0);
                        TextView textView = jVar.D;
                        if (textView == null && jVar.E == null) {
                            jVar.g(jVar.f15044y, jVar.f15045z, true);
                        } else {
                            jVar.g(textView, jVar.E, false);
                        }
                    }
                    i6++;
                } else {
                    b();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i6) {
        setInlineLabel(getResources().getBoolean(i6));
    }

    @Deprecated
    public void setOnTabSelectedListener(ya.d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        d();
        this.f2758n0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = s1.c.A(drawable).mutate();
        this.L = mutate;
        a4.p(mutate, this.M);
        int i6 = this.f2750f0;
        if (i6 == -1) {
            i6 = this.L.getIntrinsicHeight();
        }
        this.A.b(i6);
    }

    public void setSelectedTabIndicatorColor(int i6) {
        this.M = i6;
        a4.p(this.L, i6);
        j(false);
    }

    public void setSelectedTabIndicatorGravity(int i6) {
        if (this.f2746b0 != i6) {
            this.f2746b0 = i6;
            this.A.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i6) {
        this.f2750f0 = i6;
        this.A.b(i6);
    }

    public void setTabGravity(int i6) {
        if (this.W != i6) {
            this.W = i6;
            b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            ArrayList arrayList = this.f2767y;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar = ((ya.g) arrayList.get(i6)).f15037e;
                if (jVar != null) {
                    jVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i6) {
        setTabIconTint(i0.f.d(getContext(), i6));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ob.a, java.lang.Object] */
    public void setTabIndicatorAnimationMode(int i6) {
        this.f2751g0 = i6;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    this.f2753i0 = new ya.a(1);
                    return;
                }
                throw new IllegalArgumentException(i6 + " is not a valid TabIndicatorAnimationMode");
            }
            this.f2753i0 = new ya.a(0);
            return;
        }
        this.f2753i0 = new Object();
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f2749e0 = z10;
        int i6 = f.A;
        f fVar = this.A;
        fVar.a(fVar.f15032z.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i6) {
        if (i6 != this.f2747c0) {
            this.f2747c0 = i6;
            b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            int i6 = 0;
            while (true) {
                f fVar = this.A;
                if (i6 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i6);
                    if (childAt instanceof j) {
                        Context context = getContext();
                        int i10 = j.I;
                        ((j) childAt).e(context);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i6) {
        setTabRippleColor(i0.f.d(getContext(), i6));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            ArrayList arrayList = this.f2767y;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar = ((ya.g) arrayList.get(i6)).f15037e;
                if (jVar != null) {
                    jVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(s5.a aVar) {
        g(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f2752h0 != z10) {
            this.f2752h0 = z10;
            int i6 = 0;
            while (true) {
                f fVar = this.A;
                if (i6 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i6);
                    if (childAt instanceof j) {
                        Context context = getContext();
                        int i10 = j.I;
                        ((j) childAt).e(context);
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i6) {
        setUnboundedRipple(getResources().getBoolean(i6));
    }

    public void setupWithViewPager(g gVar) {
        i(gVar, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i6) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f2755k0;
        ArrayList arrayList = this.f2756l0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.f2755k0 = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i6) {
        if (i6 != 0) {
            setSelectedTabIndicator(c9.a.f(getContext(), i6));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
