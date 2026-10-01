package s5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.lifecycle.x;
import cg.h;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import j1.f0;
import j1.p0;
import j1.w0;
import j1.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ld.n;
import ld.o;
import p.c2;
import t0.h0;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g extends ViewGroup {

    /* renamed from: v0, reason: collision with root package name */
    public static final int[] f12197v0 = {R.attr.layout_gravity};

    /* renamed from: w0, reason: collision with root package name */
    public static final h f12198w0 = new h(8);

    /* renamed from: x0, reason: collision with root package name */
    public static final a1.d f12199x0 = new a1.d(1);
    public final Rect A;
    public a B;
    public int C;
    public int D;
    public Parcelable E;
    public final Scroller F;
    public boolean G;
    public c2 H;
    public int I;
    public Drawable J;
    public int K;
    public int L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public final int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f12200a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f12201b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f12202c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f12203d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f12204e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f12205f0;

    /* renamed from: g0, reason: collision with root package name */
    public VelocityTracker f12206g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f12207h0;

    /* renamed from: i0, reason: collision with root package name */
    public final int f12208i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f12209j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int f12210k0;

    /* renamed from: l0, reason: collision with root package name */
    public final EdgeEffect f12211l0;

    /* renamed from: m0, reason: collision with root package name */
    public final EdgeEffect f12212m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f12213n0;
    public boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f12214p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f12215q0;

    /* renamed from: r0, reason: collision with root package name */
    public e f12216r0;

    /* renamed from: s0, reason: collision with root package name */
    public ArrayList f12217s0;

    /* renamed from: t0, reason: collision with root package name */
    public final a1.e f12218t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f12219u0;

    /* renamed from: x, reason: collision with root package name */
    public int f12220x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f12221y;

    /* renamed from: z, reason: collision with root package name */
    public final c f12222z;

    /* JADX WARN: Type inference failed for: r4v2, types: [s5.c, java.lang.Object] */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12221y = new ArrayList();
        this.f12222z = new Object();
        this.A = new Rect();
        this.D = -1;
        this.E = null;
        this.M = -3.4028235E38f;
        this.N = Float.MAX_VALUE;
        this.S = 1;
        this.f12205f0 = -1;
        this.f12213n0 = true;
        this.f12218t0 = new a1.e(this, 20);
        this.f12219u0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.F = new Scroller(context2, f12199x0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f3 = context2.getResources().getDisplayMetrics().density;
        this.f12200a0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f12207h0 = (int) (400.0f * f3);
        this.f12208i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12211l0 = new EdgeEffect(context2);
        this.f12212m0 = new EdgeEffect(context2);
        this.f12209j0 = (int) (25.0f * f3);
        this.f12210k0 = (int) (2.0f * f3);
        this.V = (int) (f3 * 16.0f);
        q0.r(this, new aa.h(this, 4));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        h0.l(this, new f0(this));
    }

    public static boolean c(int i6, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && c(i6, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i6)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s5.c, java.lang.Object] */
    public final c a(int i6, int i10) {
        ?? obj = new Object();
        obj.f12188b = i6;
        n nVar = (n) this.B;
        p0 p0Var = nVar.f8343b;
        if (nVar.f8345d == null) {
            p0Var.getClass();
            nVar.f8345d = new j1.a(p0Var);
        }
        long j = i6;
        y E = p0Var.E("android:switcher:" + getId() + ":" + j);
        if (E != null) {
            j1.a aVar = nVar.f8345d;
            aVar.getClass();
            aVar.b(new w0(7, E));
        } else {
            o oVar = nVar.f8348g;
            E = (y) oVar.P0.get(((Integer) oVar.Q0.get(i6)).intValue());
            nVar.f8345d.g(getId(), E, "android:switcher:" + getId() + ":" + j, 1);
        }
        if (E != nVar.f8346e) {
            if (E.f7021d0) {
                E.f7021d0 = false;
            }
            if (nVar.f8344c == 1) {
                nVar.f8345d.i(E, x.A);
            } else {
                E.L(false);
            }
        }
        obj.f12187a = E;
        this.B.getClass();
        obj.f12190d = 1.0f;
        ArrayList arrayList = this.f12221y;
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.add(i10, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i6, int i10) {
        c h4;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (h4 = h(childAt)) != null && h4.f12188b == this.C) {
                    childAt.addFocusables(arrayList, i6, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c h4;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && (h4 = h(childAt)) != null && h4.f12188b == this.C) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z11 = dVar.f12192a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f12192a = z12;
        if (this.P) {
            if (!z12) {
                dVar.f12195d = true;
                addViewInLayout(view, i6, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i6, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            android.graphics.Rect r6 = r7.A
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.g(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.g(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.C
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.R = r3
            r7.u(r0, r3, r2, r3)
            goto Lce
        L91:
            boolean r0 = r1.requestFocus()
        L95:
            r3 = r0
            goto Lcf
        L97:
            if (r8 != r4) goto Lcf
            android.graphics.Rect r2 = r7.g(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.g(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r7.m()
            goto L95
        Lae:
            boolean r0 = r1.requestFocus()
            goto L95
        Lb3:
            if (r8 == r5) goto Lc2
            if (r8 != r2) goto Lb8
            goto Lc2
        Lb8:
            if (r8 == r4) goto Lbd
            r0 = 2
            if (r8 != r0) goto Lcf
        Lbd:
            boolean r3 = r7.m()
            goto Lcf
        Lc2:
            int r0 = r7.C
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.R = r3
            r7.u(r0, r3, r2, r3)
            goto Lce
        Lcd:
            r2 = 0
        Lce:
            r3 = r2
        Lcf:
            if (r3 == 0) goto Ld8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.b(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i6) {
        if (this.B == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i6 < 0) {
            if (scrollX <= ((int) (clientWidth * this.M))) {
                return false;
            }
            return true;
        }
        if (i6 <= 0 || scrollX >= ((int) (clientWidth * this.N))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.G = true;
        Scroller scroller = this.F;
        if (!scroller.isFinished() && scroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!n(currX)) {
                    scroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = q0.f12397a;
            postInvalidateOnAnimation();
            return;
        }
        d(true);
    }

    public final void d(boolean z10) {
        boolean z11;
        if (this.f12219u0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.F;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.R = false;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f12221y;
            if (i6 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i6);
            if (cVar.f12189c) {
                cVar.f12189c = false;
                z11 = true;
            }
            i6++;
        }
        if (z11) {
            a1.e eVar = this.f12218t0;
            if (z10) {
                WeakHashMap weakHashMap = q0.f12397a;
                postOnAnimation(eVar);
            } else {
                eVar.run();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.b(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r6 = r5.b(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m()
            goto L62
        L41:
            r6 = 66
            boolean r6 = r5.b(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.C
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.R = r2
            r5.u(r6, r2, r1, r2)
            r6 = 1
            goto L62
        L5a:
            r6 = 17
            boolean r6 = r5.b(r6)
            goto L62
        L61:
            r6 = 0
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c h4;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && (h4 = h(childAt)) != null && h4.f12188b == this.C && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f12212m0;
        EdgeEffect edgeEffect2 = this.f12211l0;
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.B) == null || aVar.c() <= 1)) {
            edgeEffect2.finish();
            edgeEffect.finish();
        } else {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.M * width);
                edgeEffect2.setSize(height, width);
                z10 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.N + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z10 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap weakHashMap = q0.f12397a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.J;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e() {
        boolean z10;
        int c10 = this.B.c();
        this.f12220x = c10;
        ArrayList arrayList = this.f12221y;
        if (arrayList.size() < (this.S * 2) + 1 && arrayList.size() < c10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i6 = this.C;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            a aVar = this.B;
            y yVar = cVar.f12187a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f12198w0);
        if (z10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                d dVar = (d) getChildAt(i11).getLayoutParams();
                if (!dVar.f12192a) {
                    dVar.f12194c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            u(i6, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i6) {
        e eVar = this.f12216r0;
        if (eVar != null) {
            ((ya.h) eVar).b(i6);
        }
        ArrayList arrayList = this.f12215q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.f12215q0.get(i10);
                if (eVar2 != null) {
                    ((ya.h) eVar2).b(i6);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, s5.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f12194c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.C;
    }

    public int getOffscreenPageLimit() {
        return this.S;
    }

    public int getPageMargin() {
        return this.I;
    }

    public final c h(View view) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f12221y;
            if (i6 < arrayList.size()) {
                c cVar = (c) arrayList.get(i6);
                a aVar = this.B;
                y yVar = cVar.f12187a;
                ((n) aVar).getClass();
                if (yVar.f7024g0 == view) {
                    return cVar;
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s5.c i() {
        /*
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.I
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = 0
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r7 = r6
            r4 = 0
            r6 = -1
            r8 = 0
            r9 = 1
        L22:
            java.util.ArrayList r10 = r13.f12221y
            int r11 = r10.size()
            if (r8 >= r11) goto L72
            java.lang.Object r11 = r10.get(r8)
            s5.c r11 = (s5.c) r11
            if (r9 != 0) goto L4c
            int r12 = r11.f12188b
            int r6 = r6 + r5
            if (r12 == r6) goto L4c
            float r1 = r1 + r4
            float r1 = r1 + r3
            s5.c r4 = r13.f12222z
            r4.f12191e = r1
            r4.f12188b = r6
            s5.a r1 = r13.B
            r1.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.f12190d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4d
        L4c:
            r6 = r11
        L4d:
            float r1 = r6.f12191e
            float r4 = r6.f12190d
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L59
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L72
        L59:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L71
            int r4 = r10.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L65
            goto L71
        L65:
            int r4 = r6.f12188b
            float r7 = r6.f12190d
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = 0
            goto L22
        L71:
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.i():s5.c");
    }

    public final c j(int i6) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12221y;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar.f12188b == i6) {
                    return cVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(float r12, int r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f12214p0
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            s5.d r8 = (s5.d) r8
            boolean r9 = r8.f12192a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f12193b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            s5.e r14 = r11.f12216r0
            if (r14 == 0) goto L75
            ya.h r14 = (ya.h) r14
            r14.a(r13, r12)
        L75:
            java.util.ArrayList r14 = r11.f12215q0
            if (r14 == 0) goto L91
            int r14 = r14.size()
        L7d:
            if (r0 >= r14) goto L91
            java.util.ArrayList r2 = r11.f12215q0
            java.lang.Object r2 = r2.get(r0)
            s5.e r2 = (s5.e) r2
            if (r2 == 0) goto L8e
            ya.h r2 = (ya.h) r2
            r2.a(r13, r12)
        L8e:
            int r0 = r0 + 1
            goto L7d
        L91:
            r11.o0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.k(float, int, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int i6;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12205f0) {
            if (actionIndex == 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.f12201b0 = motionEvent.getX(i6);
            this.f12205f0 = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.f12206g0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        a aVar = this.B;
        if (aVar == null || this.C >= aVar.c() - 1) {
            return false;
        }
        int i6 = this.C + 1;
        this.R = false;
        u(i6, 0, true, false);
        return true;
    }

    public final boolean n(int i6) {
        if (this.f12221y.size() == 0) {
            if (!this.f12213n0) {
                this.o0 = false;
                k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
                if (!this.o0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c i10 = i();
        int clientWidth = getClientWidth();
        int i11 = this.I;
        int i12 = clientWidth + i11;
        float f3 = clientWidth;
        int i13 = i10.f12188b;
        float f10 = ((i6 / f3) - i10.f12191e) / (i10.f12190d + (i11 / f3));
        this.o0 = false;
        k(f10, i13, (int) (i12 * f10));
        if (this.o0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f3) {
        boolean z10;
        boolean z11;
        float f10 = this.f12201b0 - f3;
        this.f12201b0 = f3;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.M * clientWidth;
        float f12 = this.N * clientWidth;
        ArrayList arrayList = this.f12221y;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) arrayList.get(arrayList.size() - 1);
        if (cVar.f12188b != 0) {
            f11 = cVar.f12191e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f12188b != this.B.c() - 1) {
            f12 = cVar2.f12191e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f12211l0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f12212m0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i6 = (int) scrollX;
        this.f12201b0 = (scrollX - i6) + this.f12201b0;
        scrollTo(i6, getScrollY());
        n(i6);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12213n0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f12218t0);
        Scroller scroller = this.F;
        if (scroller != null && !scroller.isFinished()) {
            this.F.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i6;
        float f3;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.I > 0 && this.J != null) {
            ArrayList arrayList2 = this.f12221y;
            if (arrayList2.size() > 0 && this.B != null) {
                int scrollX = getScrollX();
                float width = getWidth();
                float f10 = this.I / width;
                int i11 = 0;
                c cVar = (c) arrayList2.get(0);
                float f11 = cVar.f12191e;
                int size = arrayList2.size();
                int i12 = cVar.f12188b;
                int i13 = ((c) arrayList2.get(size - 1)).f12188b;
                while (i12 < i13) {
                    while (true) {
                        i6 = cVar.f12188b;
                        if (i12 <= i6 || i11 >= size) {
                            break;
                        }
                        i11++;
                        cVar = (c) arrayList2.get(i11);
                    }
                    if (i12 == i6) {
                        float f12 = cVar.f12191e;
                        float f13 = cVar.f12190d;
                        f3 = (f12 + f13) * width;
                        f11 = f12 + f13 + f10;
                    } else {
                        this.B.getClass();
                        f3 = (f11 + 1.0f) * width;
                        f11 = 1.0f + f10 + f11;
                    }
                    if (this.I + f3 > scrollX) {
                        arrayList = arrayList2;
                        i10 = scrollX;
                        this.J.setBounds(Math.round(f3), this.K, Math.round(this.I + f3), this.L);
                        this.J.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        i10 = scrollX;
                    }
                    if (f3 <= i10 + r3) {
                        i12++;
                        arrayList2 = arrayList;
                        scrollX = i10;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f3;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.T) {
                    return true;
                }
                if (this.U) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        l(motionEvent);
                    }
                } else {
                    int i6 = this.f12205f0;
                    if (i6 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i6);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f10 = x10 - this.f12201b0;
                        float abs = Math.abs(f10);
                        float y9 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y9 - this.f12204e0);
                        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f11 = this.f12201b0;
                            if ((f11 >= this.W || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((f11 <= getWidth() - this.W || f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && c((int) f10, (int) x10, (int) y9, this, false))) {
                                this.f12201b0 = x10;
                                this.f12202c0 = y9;
                                this.U = true;
                                return false;
                            }
                        }
                        int i10 = this.f12200a0;
                        float f12 = i10;
                        if (abs > f12 && abs * 0.5f > abs2) {
                            this.T = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f13 = this.f12203d0;
                            float f14 = i10;
                            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f3 = f13 + f14;
                            } else {
                                f3 = f13 - f14;
                            }
                            this.f12201b0 = f3;
                            this.f12202c0 = y9;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f12) {
                            this.U = true;
                        }
                        if (this.T && o(x10)) {
                            WeakHashMap weakHashMap = q0.f12397a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.f12203d0 = x11;
                this.f12201b0 = x11;
                float y10 = motionEvent.getY();
                this.f12204e0 = y10;
                this.f12202c0 = y10;
                this.f12205f0 = motionEvent.getPointerId(0);
                this.U = false;
                this.G = true;
                Scroller scroller = this.F;
                scroller.computeScrollOffset();
                if (this.f12219u0 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f12210k0) {
                    scroller.abortAnimation();
                    this.R = false;
                    p();
                    this.T = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    d(false);
                    this.T = false;
                }
            }
            if (this.f12206g0 == null) {
                this.f12206g0 = VelocityTracker.obtain();
            }
            this.f12206g0.addMovement(motionEvent);
            return this.T;
        }
        s();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        int i10;
        int i11;
        int i12;
        c h4;
        int childCount = getChildCount();
        if ((i6 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h4 = h(childAt)) != null && h4.f12188b == this.C && childAt.requestFocus(i6, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f15113x);
        if (this.B != null) {
            u(fVar.f12196z, 0, false, true);
        } else {
            this.D = fVar.f12196z;
            this.E = fVar.A;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [z0.b, android.os.Parcelable, s5.f] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new z0.b(super.onSaveInstanceState());
        bVar.f12196z = this.C;
        a aVar = this.B;
        if (aVar != null) {
            aVar.getClass();
            bVar.A = null;
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i6 != i11) {
            int i13 = this.I;
            r(i6, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f3;
        float f10;
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.B) == null || aVar.c() == 0) {
            return false;
        }
        if (this.f12206g0 == null) {
            this.f12206g0 = VelocityTracker.obtain();
        }
        this.f12206g0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                l(motionEvent);
                                this.f12201b0 = motionEvent.getX(motionEvent.findPointerIndex(this.f12205f0));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f12201b0 = motionEvent.getX(actionIndex);
                            this.f12205f0 = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.T) {
                        t(this.C, 0, true, false);
                        z10 = s();
                    }
                } else {
                    if (!this.T) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f12205f0);
                        if (findPointerIndex == -1) {
                            z10 = s();
                        } else {
                            float x10 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x10 - this.f12201b0);
                            float y9 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y9 - this.f12202c0);
                            int i6 = this.f12200a0;
                            if (abs > i6 && abs > abs2) {
                                this.T = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f11 = this.f12203d0;
                                if (x10 - f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f10 = f11 + i6;
                                } else {
                                    f10 = f11 - i6;
                                }
                                this.f12201b0 = f10;
                                this.f12202c0 = y9;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.T) {
                        z10 = o(motionEvent.getX(motionEvent.findPointerIndex(this.f12205f0)));
                    }
                }
            } else if (this.T) {
                VelocityTracker velocityTracker = this.f12206g0;
                velocityTracker.computeCurrentVelocity(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, this.f12208i0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f12205f0);
                this.R = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c i10 = i();
                float f12 = clientWidth;
                int i11 = i10.f12188b;
                float f13 = ((scrollX / f12) - i10.f12191e) / (i10.f12190d + (this.I / f12));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f12205f0)) - this.f12203d0)) > this.f12209j0 && Math.abs(xVelocity) > this.f12207h0) {
                    if (xVelocity <= 0) {
                        i11++;
                    }
                } else {
                    if (i11 >= this.C) {
                        f3 = 0.4f;
                    } else {
                        f3 = 0.6f;
                    }
                    i11 += (int) (f13 + f3);
                }
                ArrayList arrayList = this.f12221y;
                if (arrayList.size() > 0) {
                    i11 = Math.max(((c) arrayList.get(0)).f12188b, Math.min(i11, ((c) arrayList.get(arrayList.size() - 1)).f12188b));
                }
                u(i11, xVelocity, true, true);
                z10 = s();
            }
        } else {
            this.F.abortAnimation();
            this.R = false;
            p();
            float x11 = motionEvent.getX();
            this.f12203d0 = x11;
            this.f12201b0 = x11;
            float y10 = motionEvent.getY();
            this.f12204e0 = y10;
            this.f12202c0 = y10;
            this.f12205f0 = motionEvent.getPointerId(0);
        }
        if (z10) {
            WeakHashMap weakHashMap = q0.f12397a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r10 == r11) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r19) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.g.q(int):void");
    }

    public final void r(int i6, int i10, int i11, int i12) {
        float f3;
        if (i10 > 0 && !this.f12221y.isEmpty()) {
            if (!this.F.isFinished()) {
                this.F.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i6 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        c j = j(this.C);
        if (j != null) {
            f3 = Math.min(j.f12191e, this.N);
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int paddingLeft = (int) (f3 * ((i6 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            d(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.P) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f12205f0 = -1;
        this.T = false;
        this.U = false;
        VelocityTracker velocityTracker = this.f12206g0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12206g0 = null;
        }
        this.f12211l0.onRelease();
        this.f12212m0.onRelease();
        if (!this.f12211l0.isFinished() && !this.f12212m0.isFinished()) {
            return false;
        }
        return true;
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f12221y;
        a aVar2 = this.B;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.B.e(this);
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                c cVar = (c) arrayList.get(i6);
                a aVar3 = this.B;
                int i10 = cVar.f12188b;
                aVar3.a(cVar.f12187a);
            }
            this.B.b();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((d) getChildAt(i11).getLayoutParams()).f12192a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.C = 0;
            scrollTo(0, 0);
        }
        this.B = aVar;
        this.f12220x = 0;
        if (aVar != null) {
            if (this.H == null) {
                this.H = new c2(this, 1);
            }
            this.B.d();
            this.R = false;
            boolean z10 = this.f12213n0;
            this.f12213n0 = true;
            this.f12220x = this.B.c();
            if (this.D >= 0) {
                this.B.getClass();
                u(this.D, 0, false, true);
                this.D = -1;
                this.E = null;
            } else if (!z10) {
                p();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f12217s0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.f12217s0.size();
            for (int i12 = 0; i12 < size; i12++) {
                ya.b bVar = (ya.b) this.f12217s0.get(i12);
                TabLayout tabLayout = bVar.f15026b;
                if (tabLayout.o0 == this) {
                    tabLayout.g(aVar, bVar.f15025a);
                }
            }
        }
    }

    public void setCurrentItem(int i6) {
        this.R = false;
        u(i6, 0, !this.f12213n0, false);
    }

    public void setOffscreenPageLimit(int i6) {
        if (i6 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i6 + " too small; defaulting to 1");
            i6 = 1;
        }
        if (i6 != this.S) {
            this.S = i6;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.f12216r0 = eVar;
    }

    public void setPageMargin(int i6) {
        int i10 = this.I;
        this.I = i6;
        int width = getWidth();
        r(width, width, i6, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.J = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i6) {
        if (this.f12219u0 != i6) {
            this.f12219u0 = i6;
            e eVar = this.f12216r0;
            if (eVar != null) {
                ya.h hVar = (ya.h) eVar;
                hVar.f15039b = hVar.f15040c;
                hVar.f15040c = i6;
                TabLayout tabLayout = (TabLayout) hVar.f15038a.get();
                if (tabLayout != null) {
                    tabLayout.f2764u0 = hVar.f15040c;
                }
            }
            ArrayList arrayList = this.f12215q0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar2 = (e) this.f12215q0.get(i10);
                    if (eVar2 != null) {
                        ya.h hVar2 = (ya.h) eVar2;
                        hVar2.f15039b = hVar2.f15040c;
                        hVar2.f15040c = i6;
                        TabLayout tabLayout2 = (TabLayout) hVar2.f15038a.get();
                        if (tabLayout2 != null) {
                            tabLayout2.f2764u0 = hVar2.f15040c;
                        }
                    }
                }
            }
        }
    }

    public final void t(int i6, int i10, boolean z10, boolean z11) {
        int i11;
        int scrollX;
        int abs;
        c j = j(i6);
        if (j != null) {
            i11 = (int) (Math.max(this.M, Math.min(j.f12191e, this.N)) * getClientWidth());
        } else {
            i11 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.F;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.G) {
                        scrollX = scroller.getCurrX();
                    } else {
                        scrollX = scroller.getStartX();
                    }
                    scroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i12 = scrollX;
                int scrollY = getScrollY();
                int i13 = i11 - i12;
                int i14 = 0 - scrollY;
                if (i13 == 0 && i14 == 0) {
                    d(false);
                    p();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i15 = clientWidth / 2;
                    float f3 = clientWidth;
                    float f10 = i15;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f10) + f10;
                    int abs2 = Math.abs(i10);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.B.getClass();
                        abs = (int) (((Math.abs(i13) / ((f3 * 1.0f) + this.I)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.G = false;
                    this.F.startScroll(i12, scrollY, i13, i14, min);
                    WeakHashMap weakHashMap = q0.f12397a;
                    postInvalidateOnAnimation();
                }
            }
            if (z11) {
                f(i6);
                return;
            }
            return;
        }
        if (z11) {
            f(i6);
        }
        d(false);
        scrollTo(i11, 0);
        n(i11);
    }

    public final void u(int i6, int i10, boolean z10, boolean z11) {
        a aVar = this.B;
        boolean z12 = false;
        if (aVar != null && aVar.c() > 0) {
            ArrayList arrayList = this.f12221y;
            if (!z11 && this.C == i6 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 >= this.B.c()) {
                i6 = this.B.c() - 1;
            }
            int i11 = this.S;
            int i12 = this.C;
            if (i6 > i12 + i11 || i6 < i12 - i11) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((c) arrayList.get(i13)).f12189c = true;
                }
            }
            if (this.C != i6) {
                z12 = true;
            }
            if (this.f12213n0) {
                this.C = i6;
                if (z12) {
                    f(i6);
                }
                requestLayout();
                return;
            }
            q(i6);
            t(i6, i10, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.J) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, s5.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f12194c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12197v0);
        layoutParams.f12193b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i6) {
        setPageMarginDrawable(getContext().getDrawable(i6));
    }
}
