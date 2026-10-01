package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import b2.j;
import com.playfy.tv.R;
import i.m0;
import java.util.WeakHashMap;
import o.l;
import o.w;
import p.e;
import p.h3;
import p.j1;
import p.k1;
import p.m3;
import t0.f0;
import t0.f1;
import t0.g1;
import t0.h0;
import t0.i1;
import t0.l1;
import t0.q;
import t0.q0;
import t0.r;
import t0.t1;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements j1, q, r {

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f754c0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: d0, reason: collision with root package name */
    public static final w1 f755d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Rect f756e0;
    public ActionBarContainer A;
    public k1 B;
    public Drawable C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final Rect J;
    public final Rect K;
    public final Rect L;
    public final Rect M;
    public w1 N;
    public w1 O;
    public w1 P;
    public w1 Q;
    public p.c R;
    public OverScroller S;
    public ViewPropertyAnimator T;
    public final bb.b U;
    public final p.b V;
    public final p.b W;

    /* renamed from: a0, reason: collision with root package name */
    public final j f757a0;

    /* renamed from: b0, reason: collision with root package name */
    public final e f758b0;

    /* renamed from: x, reason: collision with root package name */
    public int f759x;

    /* renamed from: y, reason: collision with root package name */
    public int f760y;

    /* renamed from: z, reason: collision with root package name */
    public ContentFrameLayout f761z;

    static {
        l1 f1Var;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            f1Var = new t0.k1();
        } else if (i6 >= 31) {
            f1Var = new t0.j1();
        } else if (i6 >= 30) {
            f1Var = new i1();
        } else if (i6 >= 29) {
            f1Var = new g1();
        } else {
            f1Var = new f1();
        }
        f1Var.g(l0.c.b(0, 1, 0, 1));
        f755d0 = f1Var.b();
        f756e0 = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [b2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [p.e, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f760y = 0;
        this.J = new Rect();
        this.K = new Rect();
        this.L = new Rect();
        this.M = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w1 w1Var = w1.f12416b;
        this.N = w1Var;
        this.O = w1Var;
        this.P = w1Var;
        this.Q = w1Var;
        this.U = new bb.b(this, 4);
        this.V = new p.b(this, 0);
        this.W = new p.b(this, 1);
        i(context);
        this.f757a0 = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f758b0 = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z10) {
        boolean z11;
        p.d dVar = (p.d) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i10 = rect.left;
        if (i6 != i10) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i12;
            z11 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i14;
            z11 = true;
        }
        if (z10) {
            int i15 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i16;
                return true;
            }
        }
        return z11;
    }

    @Override // t0.r
    public final void a(View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        b(view, i6, i10, i11, i12, i13);
    }

    @Override // t0.q
    public final void b(View view, int i6, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i6, i10, i11, i12);
        }
    }

    @Override // t0.q
    public final boolean c(View view, View view2, int i6, int i10) {
        if (i10 == 0 && onStartNestedScroll(view, view2, i6)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.d;
    }

    @Override // t0.q
    public final void d(View view, View view2, int i6, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i6;
        super.draw(canvas);
        if (this.C != null) {
            if (this.A.getVisibility() == 0) {
                i6 = (int) (this.A.getTranslationY() + this.A.getBottom() + 0.5f);
            } else {
                i6 = 0;
            }
            this.C.setBounds(0, i6, getWidth(), this.C.getIntrinsicHeight() + i6);
            this.C.draw(canvas);
        }
    }

    @Override // t0.q
    public final void e(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        j jVar = this.f757a0;
        return jVar.f1381b | jVar.f1380a;
    }

    public CharSequence getTitle() {
        k();
        return ((m3) this.B).f10301a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.V);
        removeCallbacks(this.W);
        ViewPropertyAnimator viewPropertyAnimator = this.T;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f754c0);
        boolean z10 = false;
        this.f759x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.C = drawable;
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        this.S = new OverScroller(context);
    }

    public final void j(int i6) {
        k();
        if (i6 != 2) {
            if (i6 != 5) {
                if (i6 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            } else {
                ((m3) this.B).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((m3) this.B).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        k1 wrapper;
        if (this.f761z == null) {
            this.f761z = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof k1) {
                wrapper = (k1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.B = wrapper;
        }
    }

    public final void l(Menu menu, w wVar) {
        k();
        m3 m3Var = (m3) this.B;
        Toolbar toolbar = m3Var.f10301a;
        if (m3Var.f10312m == null) {
            m3Var.f10312m = new p.j(toolbar.getContext());
        }
        p.j jVar = m3Var.f10312m;
        jVar.B = wVar;
        l lVar = (l) menu;
        if (lVar != null || toolbar.f832x != null) {
            toolbar.g();
            l lVar2 = toolbar.f832x.M;
            if (lVar2 == lVar) {
                return;
            }
            if (lVar2 != null) {
                lVar2.r(toolbar.f826l0);
                lVar2.r(toolbar.f827m0);
            }
            if (toolbar.f827m0 == null) {
                toolbar.f827m0 = new h3(toolbar);
            }
            jVar.N = true;
            if (lVar != null) {
                lVar.b(jVar, toolbar.G);
                lVar.b(toolbar.f827m0, toolbar.G);
            } else {
                jVar.c(toolbar.G, null);
                toolbar.f827m0.c(toolbar.G, null);
                jVar.g();
                toolbar.f827m0.g();
            }
            toolbar.f832x.setPopupTheme(toolbar.H);
            toolbar.f832x.setPresenter(jVar);
            toolbar.f826l0 = jVar;
            toolbar.u();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w1 h4 = w1.h(this, windowInsets);
        boolean g10 = g(this.A, new Rect(h4.b(), h4.d(), h4.c(), h4.a()), false);
        WeakHashMap weakHashMap = q0.f12397a;
        Rect rect = this.J;
        h0.b(this, h4, rect);
        int i6 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        t1 t1Var = h4.f12417a;
        w1 l10 = t1Var.l(i6, i10, i11, i12);
        this.N = l10;
        boolean z10 = true;
        if (!this.O.equals(l10)) {
            this.O = this.N;
            g10 = true;
        }
        Rect rect2 = this.K;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = g10;
        }
        if (z10) {
            requestLayout();
        }
        return t1Var.a().f12417a.c().f12417a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = q0.f12397a;
        f0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                p.d dVar = (p.d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        if (this.F && z10) {
            this.S.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.S.getFinalY() > this.A.getHeight()) {
                h();
                this.W.run();
            } else {
                h();
                this.V.run();
            }
            this.G = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12) {
        int i13 = this.H + i10;
        this.H = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        m0 m0Var;
        n.j jVar;
        this.f757a0.f1380a = i6;
        this.H = getActionBarHideOffset();
        h();
        p.c cVar = this.R;
        if (cVar != null && (jVar = (m0Var = (m0) cVar).f6244t) != null) {
            jVar.a();
            m0Var.f6244t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        if ((i6 & 2) != 0 && this.A.getVisibility() == 0) {
            return this.F;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.F && !this.G) {
            if (this.H <= this.A.getHeight()) {
                h();
                postDelayed(this.V, 600L);
            } else {
                h();
                postDelayed(this.W, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i6) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i6);
        k();
        int i10 = this.I ^ i6;
        this.I = i6;
        if ((i6 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i6 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p.c cVar = this.R;
        if (cVar != null) {
            m0 m0Var = (m0) cVar;
            m0Var.f6241p = !z11;
            if (!z10 && z11) {
                if (!m0Var.f6242q) {
                    m0Var.f6242q = true;
                    m0Var.y(true);
                }
            } else if (m0Var.f6242q) {
                m0Var.f6242q = false;
                m0Var.y(true);
            }
        }
        if ((i10 & 256) != 0 && this.R != null) {
            WeakHashMap weakHashMap = q0.f12397a;
            f0.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        this.f760y = i6;
        p.c cVar = this.R;
        if (cVar != null) {
            ((m0) cVar).f6240o = i6;
        }
    }

    public void setActionBarHideOffset(int i6) {
        h();
        this.A.setTranslationY(-Math.max(0, Math.min(i6, this.A.getHeight())));
    }

    public void setActionBarVisibilityCallback(p.c cVar) {
        this.R = cVar;
        if (getWindowToken() != null) {
            ((m0) this.R).f6240o = this.f760y;
            int i6 = this.I;
            if (i6 != 0) {
                onWindowSystemUiVisibilityChanged(i6);
                WeakHashMap weakHashMap = q0.f12397a;
                f0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.E = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.F) {
            this.F = z10;
            if (!z10) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i6) {
        k();
        m3 m3Var = (m3) this.B;
        m3Var.f10304d = i6 != 0 ? c9.a.f(m3Var.f10301a.getContext(), i6) : null;
        m3Var.c();
    }

    public void setLogo(int i6) {
        Drawable drawable;
        k();
        m3 m3Var = (m3) this.B;
        if (i6 != 0) {
            drawable = c9.a.f(m3Var.f10301a.getContext(), i6);
        } else {
            drawable = null;
        }
        m3Var.f10305e = drawable;
        m3Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.D = z10;
    }

    @Override // p.j1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((m3) this.B).f10310k = callback;
    }

    @Override // p.j1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        m3 m3Var = (m3) this.B;
        if (!m3Var.f10307g) {
            Toolbar toolbar = m3Var.f10301a;
            m3Var.f10308h = charSequence;
            if ((m3Var.f10302b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f10307g) {
                    q0.s(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        m3 m3Var = (m3) this.B;
        m3Var.f10304d = drawable;
        m3Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i6) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr) {
    }

    @Override // t0.q
    public final void f(View view, int i6, int i10, int[] iArr, int i11) {
    }
}
