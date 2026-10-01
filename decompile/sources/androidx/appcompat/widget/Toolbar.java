package androidx.appcompat.widget;

import a1.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.datepicker.l;
import com.playfy.tv.R;
import e9.f;
import j1.h0;
import java.util.ArrayList;
import java.util.Iterator;
import n.h;
import o.n;
import p.b1;
import p.f3;
import p.g3;
import p.h3;
import p.i3;
import p.j;
import p.j3;
import p.k1;
import p.k3;
import p.l3;
import p.m3;
import p.p2;
import p.u3;
import p.x;
import p.y;
import t0.m;
import t0.q0;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public x A;
    public y B;
    public final Drawable C;
    public final CharSequence D;
    public x E;
    public View F;
    public Context G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public p2 Q;
    public int R;
    public int S;
    public final int T;
    public CharSequence U;
    public CharSequence V;
    public ColorStateList W;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f815a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f816b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f817c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ArrayList f818d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ArrayList f819e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int[] f820f0;

    /* renamed from: g0, reason: collision with root package name */
    public final m f821g0;

    /* renamed from: h0, reason: collision with root package name */
    public ArrayList f822h0;

    /* renamed from: i0, reason: collision with root package name */
    public j3 f823i0;

    /* renamed from: j0, reason: collision with root package name */
    public final lc.c f824j0;

    /* renamed from: k0, reason: collision with root package name */
    public m3 f825k0;

    /* renamed from: l0, reason: collision with root package name */
    public j f826l0;

    /* renamed from: m0, reason: collision with root package name */
    public h3 f827m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f828n0;
    public OnBackInvokedCallback o0;

    /* renamed from: p0, reason: collision with root package name */
    public OnBackInvokedDispatcher f829p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f830q0;

    /* renamed from: r0, reason: collision with root package name */
    public final e f831r0;

    /* renamed from: x, reason: collision with root package name */
    public ActionMenuView f832x;

    /* renamed from: y, reason: collision with root package name */
    public b1 f833y;

    /* renamed from: z, reason: collision with root package name */
    public b1 f834z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, p.i3] */
    public static i3 i() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f10270b = 0;
        marginLayoutParams.f10269a = 8388627;
        return marginLayoutParams;
    }

    public static i3 j(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof i3;
        if (z10) {
            i3 i3Var = (i3) layoutParams;
            i3 i3Var2 = new i3(i3Var);
            i3Var2.f10270b = 0;
            i3Var2.f10270b = i3Var.f10270b;
            return i3Var2;
        }
        if (z10) {
            i3 i3Var3 = new i3((i3) layoutParams);
            i3Var3.f10270b = 0;
            return i3Var3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 i3Var4 = new i3(marginLayoutParams);
            i3Var4.f10270b = 0;
            ((ViewGroup.MarginLayoutParams) i3Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) i3Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) i3Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) i3Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return i3Var4;
        }
        i3 i3Var5 = new i3(layoutParams);
        i3Var5.f10270b = 0;
        return i3Var5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i6, ArrayList arrayList) {
        boolean z10;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, getLayoutDirection());
        arrayList.clear();
        if (z10) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                i3 i3Var = (i3) childAt.getLayoutParams();
                if (i3Var.f10270b == 0 && t(childAt)) {
                    int i11 = i3Var.f10269a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            i3 i3Var2 = (i3) childAt2.getLayoutParams();
            if (i3Var2.f10270b == 0 && t(childAt2)) {
                int i13 = i3Var2.f10269a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        i3 i3Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            i3Var = i();
        } else if (!checkLayoutParams(layoutParams)) {
            i3Var = j(layoutParams);
        } else {
            i3Var = (i3) layoutParams;
        }
        i3Var.f10270b = 1;
        if (z10 && this.F != null) {
            view.setLayoutParams(i3Var);
            this.f819e0.add(view);
        } else {
            addView(view, i3Var);
        }
    }

    public final void c() {
        n nVar;
        h3 h3Var = this.f827m0;
        if (h3Var == null) {
            nVar = null;
        } else {
            nVar = h3Var.f10267y;
        }
        if (nVar != null) {
            nVar.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof i3)) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (this.E == null) {
            x xVar = new x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.E = xVar;
            xVar.setImageDrawable(this.C);
            this.E.setContentDescription(this.D);
            i3 i6 = i();
            i6.f10269a = (this.K & 112) | 8388611;
            i6.f10270b = 2;
            this.E.setLayoutParams(i6);
            this.E.setOnClickListener(new l(this, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.p2, java.lang.Object] */
    public final void e() {
        if (this.Q == null) {
            ?? obj = new Object();
            obj.f10345a = 0;
            obj.f10346b = 0;
            obj.f10347c = Integer.MIN_VALUE;
            obj.f10348d = Integer.MIN_VALUE;
            obj.f10349e = 0;
            obj.f10350f = 0;
            obj.f10351g = false;
            obj.f10352h = false;
            this.Q = obj;
        }
    }

    public final void f() {
        g();
        ActionMenuView actionMenuView = this.f832x;
        if (actionMenuView.M == null) {
            o.l lVar = (o.l) actionMenuView.getMenu();
            if (this.f827m0 == null) {
                this.f827m0 = new h3(this);
            }
            this.f832x.setExpandedActionViewsExclusive(true);
            lVar.b(this.f827m0, this.G);
            u();
        }
    }

    public final void g() {
        if (this.f832x == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f832x = actionMenuView;
            actionMenuView.setPopupTheme(this.H);
            this.f832x.setOnMenuItemClickListener(this.f824j0);
            ActionMenuView actionMenuView2 = this.f832x;
            r rVar = new r(this, 21);
            actionMenuView2.getClass();
            actionMenuView2.R = rVar;
            i3 i6 = i();
            i6.f10269a = (this.K & 112) | 8388613;
            this.f832x.setLayoutParams(i6);
            b(this.f832x, false);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        x xVar = this.E;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        x xVar = this.E;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            if (p2Var.f10351g) {
                return p2Var.f10345a;
            }
            return p2Var.f10346b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.S;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            return p2Var.f10345a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            return p2Var.f10346b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p2 p2Var = this.Q;
        if (p2Var != null) {
            if (p2Var.f10351g) {
                return p2Var.f10346b;
            }
            return p2Var.f10345a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.R;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o.l lVar;
        ActionMenuView actionMenuView = this.f832x;
        if (actionMenuView != null && (lVar = actionMenuView.M) != null && lVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.S, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.R, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        y yVar = this.B;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        y yVar = this.B;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        f();
        return this.f832x.getMenu();
    }

    public View getNavButtonView() {
        return this.A;
    }

    public CharSequence getNavigationContentDescription() {
        x xVar = this.A;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        x xVar = this.A;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return this.f826l0;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.f832x.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.G;
    }

    public int getPopupTheme() {
        return this.H;
    }

    public CharSequence getSubtitle() {
        return this.V;
    }

    public final TextView getSubtitleTextView() {
        return this.f834z;
    }

    public CharSequence getTitle() {
        return this.U;
    }

    public int getTitleMarginBottom() {
        return this.P;
    }

    public int getTitleMarginEnd() {
        return this.N;
    }

    public int getTitleMarginStart() {
        return this.M;
    }

    public int getTitleMarginTop() {
        return this.O;
    }

    public final TextView getTitleTextView() {
        return this.f833y;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.m3, java.lang.Object] */
    public k1 getWrapper() {
        boolean z10;
        Drawable drawable;
        if (this.f825k0 == null) {
            ?? obj = new Object();
            obj.f10313n = 0;
            obj.f10301a = this;
            obj.f10308h = getTitle();
            obj.f10309i = getSubtitle();
            if (obj.f10308h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj.f10307g = z10;
            obj.f10306f = getNavigationIcon();
            String str = null;
            n9.j E = n9.j.E(getContext(), null, h.a.f5732a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) E.f9356z;
            obj.f10314o = E.v(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f10307g = true;
                obj.f10308h = text;
                if ((obj.f10302b & 8) != 0) {
                    setTitle(text);
                    if (obj.f10307g) {
                        q0.s(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f10309i = text2;
                if ((obj.f10302b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable v10 = E.v(20);
            if (v10 != null) {
                obj.f10305e = v10;
                obj.c();
            }
            Drawable v11 = E.v(17);
            if (v11 != null) {
                obj.f10304d = v11;
                obj.c();
            }
            if (obj.f10306f == null && (drawable = obj.f10314o) != null) {
                obj.f10306f = drawable;
                if ((obj.f10302b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f10303c;
                if (view != null && (obj.f10302b & 16) != 0) {
                    removeView(view);
                }
                obj.f10303c = inflate;
                if (inflate != null && (obj.f10302b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f10302b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                e();
                this.Q.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.I = resourceId2;
                b1 b1Var = this.f833y;
                if (b1Var != null) {
                    b1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.J = resourceId3;
                b1 b1Var2 = this.f834z;
                if (b1Var2 != null) {
                    b1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            E.G();
            if (R.string.abc_action_bar_up_description != obj.f10313n) {
                obj.f10313n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i6 = obj.f10313n;
                    if (i6 != 0) {
                        str = getContext().getString(i6);
                    }
                    obj.j = str;
                    obj.b();
                }
            }
            obj.j = getNavigationContentDescription();
            setNavigationOnClickListener(new l3(obj));
            this.f825k0 = obj;
        }
        return this.f825k0;
    }

    public final void h() {
        if (this.A == null) {
            this.A = new x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            i3 i6 = i();
            i6.f10269a = (this.K & 112) | 8388611;
            this.A.setLayoutParams(i6);
        }
    }

    public final int k(View view, int i6) {
        int i10;
        i3 i3Var = (i3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i6 > 0) {
            i10 = (measuredHeight - i6) / 2;
        } else {
            i10 = 0;
        }
        int i11 = i3Var.f10269a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.T & 112;
        }
        if (i11 != 48) {
            if (i11 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) i3Var).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) i3Var).bottomMargin) - i10;
        }
        return getPaddingTop() - i10;
    }

    public final void n() {
        ArrayList arrayList = this.f822h0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = this.f821g0.f12372b.iterator();
        while (it.hasNext()) {
            ((h0) ((t0.n) it.next())).f6917a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f822h0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        if (view.getParent() != this && !this.f819e0.contains(view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f831r0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f817c0 = false;
        }
        if (!this.f817c0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f817c0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f817c0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c6 A[LOOP:2: B:47:0x02c4->B:48:0x02c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0319 A[LOOP:3: B:56:0x0317->B:57:0x0319, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11 = u3.f10392a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            z10 = true;
            c10 = 0;
        } else {
            z10 = false;
            c10 = 1;
        }
        if (t(this.A)) {
            s(this.A, i6, 0, i10, this.L);
            i11 = l(this.A) + this.A.getMeasuredWidth();
            i12 = Math.max(0, m(this.A) + this.A.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.A.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (t(this.E)) {
            s(this.E, i6, 0, i10, this.L);
            i11 = l(this.E) + this.E.getMeasuredWidth();
            i12 = Math.max(i12, m(this.E) + this.E.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.E.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        boolean z12 = z10;
        int[] iArr = this.f820f0;
        iArr[z12 ? 1 : 0] = max2;
        if (t(this.f832x)) {
            s(this.f832x, i6, max, i10, this.L);
            i14 = l(this.f832x) + this.f832x.getMeasuredWidth();
            i12 = Math.max(i12, m(this.f832x) + this.f832x.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f832x.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i14);
        if (t(this.F)) {
            max3 += r(this.F, i6, max3, i10, 0, iArr);
            i12 = Math.max(i12, m(this.F) + this.F.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.F.getMeasuredState());
        }
        if (t(this.B)) {
            max3 += r(this.B, i6, max3, i10, 0, iArr);
            i12 = Math.max(i12, m(this.B) + this.B.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.B.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((i3) childAt.getLayoutParams()).f10270b == 0 && t(childAt)) {
                max3 += r(childAt, i6, max3, i10, 0, iArr);
                int max4 = Math.max(i12, m(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i20 = max3;
        int i21 = this.O + this.P;
        int i22 = this.M + this.N;
        if (t(this.f833y)) {
            r(this.f833y, i6, i20 + i22, i10, i21, iArr);
            int l10 = l(this.f833y) + this.f833y.getMeasuredWidth();
            i17 = m(this.f833y) + this.f833y.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i13, this.f833y.getMeasuredState());
            i16 = l10;
        } else {
            i15 = i13;
            i16 = 0;
            i17 = 0;
        }
        if (t(this.f834z)) {
            i16 = Math.max(i16, r(this.f834z, i6, i20 + i22, i10, i21 + i17, iArr));
            i17 += m(this.f834z) + this.f834z.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i15, this.f834z.getMeasuredState());
        }
        int max5 = Math.max(i12, i17);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i20 + i16;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i6, (-16777216) & i15);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i15 << 16);
        if (this.f828n0) {
            int childCount2 = getChildCount();
            for (int i23 = 0; i23 < childCount2; i23++) {
                View childAt2 = getChildAt(i23);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        o.l lVar;
        MenuItem findItem;
        if (!(parcelable instanceof k3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k3 k3Var = (k3) parcelable;
        super.onRestoreInstanceState(k3Var.f15113x);
        ActionMenuView actionMenuView = this.f832x;
        if (actionMenuView != null) {
            lVar = actionMenuView.M;
        } else {
            lVar = null;
        }
        int i6 = k3Var.f10281z;
        if (i6 != 0 && this.f827m0 != null && lVar != null && (findItem = lVar.findItem(i6)) != null) {
            findItem.expandActionView();
        }
        if (k3Var.A) {
            e eVar = this.f831r0;
            removeCallbacks(eVar);
            post(eVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        e();
        p2 p2Var = this.Q;
        boolean z10 = true;
        if (i6 != 1) {
            z10 = false;
        }
        if (z10 == p2Var.f10351g) {
            return;
        }
        p2Var.f10351g = z10;
        if (p2Var.f10352h) {
            if (z10) {
                int i10 = p2Var.f10348d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = p2Var.f10349e;
                }
                p2Var.f10345a = i10;
                int i11 = p2Var.f10347c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = p2Var.f10350f;
                }
                p2Var.f10346b = i11;
                return;
            }
            int i12 = p2Var.f10347c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = p2Var.f10349e;
            }
            p2Var.f10345a = i12;
            int i13 = p2Var.f10348d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = p2Var.f10350f;
            }
            p2Var.f10346b = i13;
            return;
        }
        p2Var.f10345a = p2Var.f10349e;
        p2Var.f10346b = p2Var.f10350f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.b, android.os.Parcelable, p.k3] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        j jVar;
        n nVar;
        ?? bVar = new z0.b(super.onSaveInstanceState());
        h3 h3Var = this.f827m0;
        if (h3Var != null && (nVar = h3Var.f10267y) != null) {
            bVar.f10281z = nVar.f9801a;
        }
        ActionMenuView actionMenuView = this.f832x;
        if (actionMenuView != null && (jVar = actionMenuView.Q) != null && jVar.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.A = z10;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f816b0 = false;
        }
        if (!this.f816b0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f816b0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f816b0 = false;
        return true;
    }

    public final int p(View view, int i6, int i10, int[] iArr) {
        i3 i3Var = (i3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) i3Var).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i6;
        iArr[0] = Math.max(0, -i11);
        int k8 = k(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k8, max + measuredWidth, view.getMeasuredHeight() + k8);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) i3Var).rightMargin + max;
    }

    public final int q(View view, int i6, int i10, int[] iArr) {
        i3 i3Var = (i3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) i3Var).rightMargin - iArr[1];
        int max = i6 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int k8 = k(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k8, max, view.getMeasuredHeight() + k8);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) i3Var).leftMargin);
    }

    public final int r(View view, int i6, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i6, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f830q0 != z10) {
            this.f830q0 = z10;
            u();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(c9.a.f(getContext(), i6));
    }

    public void setCollapsible(boolean z10) {
        this.f828n0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.S) {
            this.S = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.R) {
            this.R = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(c9.a.f(getContext(), i6));
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(c9.a.f(getContext(), i6));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.A.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(j3 j3Var) {
        this.f823i0 = j3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.f832x.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.H != i6) {
            this.H = i6;
            if (i6 == 0) {
                this.G = getContext();
            } else {
                this.G = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitleMarginBottom(int i6) {
        this.P = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.N = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.M = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.O = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    public final boolean t(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void u() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = g3.a(this);
            h3 h3Var = this.f827m0;
            if (h3Var != null && h3Var.f10267y != null && a10 != null && isAttachedToWindow() && this.f830q0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f829p0 == null) {
                if (this.o0 == null) {
                    this.o0 = g3.b(new f3(this, 0));
                }
                g3.c(a10, this.o0);
                this.f829p0 = a10;
                return;
            }
            if (!z10 && (onBackInvokedDispatcher = this.f829p0) != null) {
                g3.d(onBackInvokedDispatcher, this.o0);
                this.f829p0 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.T = 8388627;
        this.f818d0 = new ArrayList();
        this.f819e0 = new ArrayList();
        this.f820f0 = new int[2];
        this.f821g0 = new m(new f3(this, 1));
        this.f822h0 = new ArrayList();
        this.f824j0 = new lc.c(this);
        this.f831r0 = new e(this, 18);
        Context context2 = getContext();
        int[] iArr = h.a.f5755z;
        n9.j E = n9.j.E(context2, attributeSet, iArr, R.attr.toolbarStyle);
        q0.q(this, context, iArr, attributeSet, (TypedArray) E.f9356z, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) E.f9356z;
        this.I = typedArray.getResourceId(28, 0);
        this.J = typedArray.getResourceId(19, 0);
        this.T = typedArray.getInteger(0, 8388627);
        this.K = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.P = dimensionPixelOffset;
        this.O = dimensionPixelOffset;
        this.N = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.M = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.N = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.O = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.P = dimensionPixelOffset5;
        }
        this.L = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        e();
        p2 p2Var = this.Q;
        p2Var.f10352h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p2Var.f10349e = dimensionPixelSize;
            p2Var.f10345a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p2Var.f10350f = dimensionPixelSize2;
            p2Var.f10346b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.R = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.S = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.C = E.v(4);
        this.D = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.G = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable v10 = E.v(16);
        if (v10 != null) {
            setNavigationIcon(v10);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable v11 = E.v(11);
        if (v11 != null) {
            setLogo(v11);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(E.t(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(E.t(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        E.G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, p.i3] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f10269a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f5733b);
        marginLayoutParams.f10269a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f10270b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        x xVar = this.E;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.E.setImageDrawable(drawable);
        } else {
            x xVar = this.E;
            if (xVar != null) {
                xVar.setImageDrawable(this.C);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.B == null) {
                this.B = new y(getContext(), null, 0);
            }
            if (!o(this.B)) {
                b(this.B, true);
            }
        } else {
            y yVar = this.B;
            if (yVar != null && o(yVar)) {
                removeView(this.B);
                this.f819e0.remove(this.B);
            }
        }
        y yVar2 = this.B;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.B == null) {
            this.B = new y(getContext(), null, 0);
        }
        y yVar = this.B;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        x xVar = this.A;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
            f.i(this.A, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!o(this.A)) {
                b(this.A, true);
            }
        } else {
            x xVar = this.A;
            if (xVar != null && o(xVar)) {
                removeView(this.A);
                this.f819e0.remove(this.A);
            }
        }
        x xVar2 = this.A;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f834z == null) {
                Context context = getContext();
                b1 b1Var = new b1(context, null);
                this.f834z = b1Var;
                b1Var.setSingleLine();
                this.f834z.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.J;
                if (i6 != 0) {
                    this.f834z.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.f815a0;
                if (colorStateList != null) {
                    this.f834z.setTextColor(colorStateList);
                }
            }
            if (!o(this.f834z)) {
                b(this.f834z, true);
            }
        } else {
            b1 b1Var2 = this.f834z;
            if (b1Var2 != null && o(b1Var2)) {
                removeView(this.f834z);
                this.f819e0.remove(this.f834z);
            }
        }
        b1 b1Var3 = this.f834z;
        if (b1Var3 != null) {
            b1Var3.setText(charSequence);
        }
        this.V = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f815a0 = colorStateList;
        b1 b1Var = this.f834z;
        if (b1Var != null) {
            b1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f833y == null) {
                Context context = getContext();
                b1 b1Var = new b1(context, null);
                this.f833y = b1Var;
                b1Var.setSingleLine();
                this.f833y.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.I;
                if (i6 != 0) {
                    this.f833y.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.f833y.setTextColor(colorStateList);
                }
            }
            if (!o(this.f833y)) {
                b(this.f833y, true);
            }
        } else {
            b1 b1Var2 = this.f833y;
            if (b1Var2 != null && o(b1Var2)) {
                removeView(this.f833y);
                this.f819e0.remove(this.f833y);
            }
        }
        b1 b1Var3 = this.f833y;
        if (b1Var3 != null) {
            b1Var3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        b1 b1Var = this.f833y;
        if (b1Var != null) {
            b1Var.setTextColor(colorStateList);
        }
    }
}
