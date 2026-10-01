package androidx.appcompat.widget;

import a2.a2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.unity3d.services.UnityAdsConstants;
import o.k;
import o.l;
import o.z;
import p.f;
import p.i;
import p.j;
import p.m;
import p.n;
import p.u3;
import p.x1;
import p.y1;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ActionMenuView extends y1 implements k, z {
    public l M;
    public Context N;
    public int O;
    public boolean P;
    public j Q;
    public r R;
    public boolean S;
    public int T;
    public final int U;
    public final int V;
    public n W;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.U = (int) (56.0f * f3);
        this.V = (int) (f3 * 4.0f);
        this.N = context;
        this.O = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, p.m] */
    public static m j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f10292a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, p.m] */
    public static m k(ViewGroup.LayoutParams layoutParams) {
        m mVar;
        if (layoutParams != null) {
            if (layoutParams instanceof m) {
                m mVar2 = (m) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) mVar2);
                layoutParams2.f10292a = mVar2.f10292a;
                mVar = layoutParams2;
            } else {
                mVar = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) mVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) mVar).gravity = 16;
            }
            return mVar;
        }
        return j();
    }

    @Override // o.z
    public final void b(l lVar) {
        this.M = lVar;
    }

    @Override // o.k
    public final boolean c(o.n nVar) {
        return this.M.q(nVar, null, 0);
    }

    @Override // p.y1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p.y1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ x1 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.x1, android.widget.LinearLayout$LayoutParams] */
    @Override // p.y1
    /* renamed from: g */
    public final x1 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // p.y1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // p.y1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.w, java.lang.Object] */
    public Menu getMenu() {
        if (this.M == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.M = lVar;
            lVar.f9780e = new a2(this, 19);
            j jVar = new j(context);
            this.Q = jVar;
            jVar.I = true;
            jVar.J = true;
            jVar.B = new Object();
            this.M.b(jVar, this.N);
            j jVar2 = this.Q;
            jVar2.E = this;
            this.M = jVar2.f10273z;
        }
        return this.M;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.Q;
        i iVar = jVar.F;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.H) {
            return jVar.G;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.O;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p.y1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ x1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i6) {
        boolean z10 = false;
        if (i6 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i6 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof p.k)) {
            z10 = ((p.k) childAt).b();
        }
        if (i6 > 0 && (childAt2 instanceof p.k)) {
            return ((p.k) childAt2).c() | z10;
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.Q;
        if (jVar != null) {
            jVar.g();
            if (this.Q.h()) {
                this.Q.b();
                this.Q.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.Q;
        if (jVar != null) {
            jVar.b();
            f fVar = jVar.Q;
            if (fVar != null && fVar.b()) {
                fVar.f9845i.dismiss();
            }
        }
    }

    @Override // p.y1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        int i13;
        int width;
        int i14;
        if (!this.S) {
            super.onLayout(z10, i6, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i6;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean z12 = u3.f10392a;
        if (getLayoutDirection() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                m mVar = (m) childAt.getLayoutParams();
                if (mVar.f10292a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    l(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        if (i23 > 0) {
            i13 = paddingRight / i23;
        } else {
            i13 = 0;
        }
        int max = Math.max(0, i13);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                m mVar2 = (m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f10292a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            m mVar3 = (m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f10292a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) mVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p.y1, android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        ?? r11;
        boolean z13;
        int i15;
        int i16;
        ActionMenuItemView actionMenuItemView;
        boolean z14;
        int i17;
        boolean z15;
        l lVar;
        boolean z16 = this.S;
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S = z10;
        if (z16 != z10) {
            this.T = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.S && (lVar = this.M) != null && size != this.T) {
            this.T = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (this.S && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i6);
            int size3 = View.MeasureSpec.getSize(i10);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
            int i18 = size2 - paddingRight;
            int i19 = this.U;
            int i20 = i18 / i19;
            int i21 = i18 % i19;
            if (i20 == 0) {
                setMeasuredDimension(i18, 0);
                return;
            }
            int i22 = (i21 / i20) + i19;
            int childCount2 = getChildCount();
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            boolean z17 = false;
            int i27 = 0;
            long j = 0;
            while (true) {
                i11 = this.V;
                if (i26 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i26);
                int i28 = size3;
                int i29 = paddingBottom;
                if (childAt.getVisibility() == 8) {
                    i16 = i22;
                } else {
                    boolean z18 = childAt instanceof ActionMenuItemView;
                    i24++;
                    if (z18) {
                        childAt.setPadding(i11, 0, i11, 0);
                    }
                    m mVar = (m) childAt.getLayoutParams();
                    mVar.f10297f = false;
                    mVar.f10294c = 0;
                    mVar.f10293b = 0;
                    mVar.f10295d = false;
                    ((LinearLayout.LayoutParams) mVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) mVar).rightMargin = 0;
                    if (z18 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    mVar.f10296e = z13;
                    if (mVar.f10292a) {
                        i15 = 1;
                    } else {
                        i15 = i20;
                    }
                    m mVar2 = (m) childAt.getLayoutParams();
                    int i30 = i20;
                    i16 = i22;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i29, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z18) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z19 = z14;
                    if (i15 > 0 && (!z14 || i15 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i15, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i17 = measuredWidth / i16;
                        if (measuredWidth % i16 != 0) {
                            i17++;
                        }
                        if (z19 && i17 < 2) {
                            i17 = 2;
                        }
                    } else {
                        i17 = 0;
                    }
                    if (!mVar2.f10292a && z19) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    mVar2.f10295d = z15;
                    mVar2.f10293b = i17;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i16, 1073741824), makeMeasureSpec);
                    i25 = Math.max(i25, i17);
                    if (mVar.f10295d) {
                        i27++;
                    }
                    if (mVar.f10292a) {
                        z17 = true;
                    }
                    i20 = i30 - i17;
                    i23 = Math.max(i23, childAt.getMeasuredHeight());
                    if (i17 == 1) {
                        j |= 1 << i26;
                    }
                }
                i26++;
                size3 = i28;
                paddingBottom = i29;
                i22 = i16;
            }
            int i31 = size3;
            int i32 = i20;
            int i33 = i22;
            if (z17 && i24 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i34 = i32;
            boolean z20 = false;
            while (i27 > 0 && i34 > 0) {
                int i35 = Integer.MAX_VALUE;
                long j10 = 0;
                int i36 = 0;
                int i37 = 0;
                while (i37 < childCount2) {
                    int i38 = i23;
                    m mVar3 = (m) getChildAt(i37).getLayoutParams();
                    boolean z21 = z11;
                    if (mVar3.f10295d) {
                        int i39 = mVar3.f10293b;
                        if (i39 < i35) {
                            j10 = 1 << i37;
                            i35 = i39;
                            i36 = 1;
                        } else if (i39 == i35) {
                            j10 |= 1 << i37;
                            i36++;
                        }
                    }
                    i37++;
                    z11 = z21;
                    i23 = i38;
                }
                i12 = i23;
                boolean z22 = z11;
                j |= j10;
                if (i36 > i34) {
                    break;
                }
                int i40 = i35 + 1;
                int i41 = 0;
                while (i41 < childCount2) {
                    View childAt2 = getChildAt(i41);
                    m mVar4 = (m) childAt2.getLayoutParams();
                    boolean z23 = z17;
                    long j11 = 1 << i41;
                    if ((j10 & j11) == 0) {
                        if (mVar4.f10293b == i40) {
                            j |= j11;
                        }
                    } else {
                        if (z22 && mVar4.f10296e) {
                            r11 = 1;
                            r11 = 1;
                            if (i34 == 1) {
                                childAt2.setPadding(i11 + i33, 0, i11, 0);
                            }
                        } else {
                            r11 = 1;
                        }
                        mVar4.f10293b += r11;
                        mVar4.f10297f = r11;
                        i34--;
                    }
                    i41++;
                    z17 = z23;
                }
                z11 = z22;
                i23 = i12;
                z20 = true;
            }
            i12 = i23;
            if (!z17 && i24 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i34 > 0 && j != 0 && (i34 < i24 - 1 || z12 || i25 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z12) {
                    if ((j & 1) != 0 && !((m) getChildAt(0).getLayoutParams()).f10296e) {
                        bitCount -= 0.5f;
                    }
                    int i42 = childCount2 - 1;
                    if ((j & (1 << i42)) != 0 && !((m) getChildAt(i42).getLayoutParams()).f10296e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i14 = (int) ((i34 * i33) / bitCount);
                } else {
                    i14 = 0;
                }
                boolean z24 = z20;
                for (int i43 = 0; i43 < childCount2; i43++) {
                    if ((j & (1 << i43)) != 0) {
                        View childAt3 = getChildAt(i43);
                        m mVar5 = (m) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            mVar5.f10294c = i14;
                            mVar5.f10297f = true;
                            if (i43 == 0 && !mVar5.f10296e) {
                                ((LinearLayout.LayoutParams) mVar5).leftMargin = (-i14) / 2;
                            }
                            z24 = true;
                        } else if (mVar5.f10292a) {
                            mVar5.f10294c = i14;
                            mVar5.f10297f = true;
                            ((LinearLayout.LayoutParams) mVar5).rightMargin = (-i14) / 2;
                            z24 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) mVar5).leftMargin = i14 / 2;
                            }
                            if (i43 != childCount2 - 1) {
                                ((LinearLayout.LayoutParams) mVar5).rightMargin = i14 / 2;
                            }
                        }
                    }
                }
                z20 = z24;
            }
            if (z20) {
                for (int i44 = 0; i44 < childCount2; i44++) {
                    View childAt4 = getChildAt(i44);
                    m mVar6 = (m) childAt4.getLayoutParams();
                    if (mVar6.f10297f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar6.f10293b * i33) + mVar6.f10294c, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i13 = i12;
            } else {
                i13 = i31;
            }
            setMeasuredDimension(i18, i13);
            return;
        }
        for (int i45 = 0; i45 < childCount; i45++) {
            m mVar7 = (m) getChildAt(i45).getLayoutParams();
            ((LinearLayout.LayoutParams) mVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) mVar7).leftMargin = 0;
        }
        super.onMeasure(i6, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.Q.N = z10;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.W = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.Q;
        i iVar = jVar.F;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.H = true;
            jVar.G = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.P = z10;
    }

    public void setPopupTheme(int i6) {
        if (this.O != i6) {
            this.O = i6;
            if (i6 == 0) {
                this.N = getContext();
            } else {
                this.N = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.Q = jVar;
        jVar.E = this;
        this.M = jVar.f10273z;
    }

    @Override // p.y1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
