package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import b2.j;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import m5.a;
import m5.d;
import m5.e;
import m5.f;
import m5.g;
import m5.h;
import m5.i;
import m5.k;
import t0.h0;
import t0.o;
import t0.p;
import t0.q;
import t0.q0;
import t0.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements r, q, o {

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f1163k0 = {R.attr.enabled};
    public final int A;
    public float B;
    public float C;
    public final j D;
    public final p E;
    public final int[] F;
    public final int[] G;
    public final int[] H;
    public boolean I;
    public final int J;
    public int K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public final DecelerateInterpolator P;
    public final a Q;
    public int R;
    public int S;
    public final int T;
    public final int U;
    public int V;
    public final e W;

    /* renamed from: a0, reason: collision with root package name */
    public g f1164a0;

    /* renamed from: b0, reason: collision with root package name */
    public g f1165b0;

    /* renamed from: c0, reason: collision with root package name */
    public h f1166c0;

    /* renamed from: d0, reason: collision with root package name */
    public h f1167d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1168e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1169f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1170g0;

    /* renamed from: h0, reason: collision with root package name */
    public final f f1171h0;

    /* renamed from: i0, reason: collision with root package name */
    public final g f1172i0;

    /* renamed from: j0, reason: collision with root package name */
    public final g f1173j0;

    /* renamed from: x, reason: collision with root package name */
    public View f1174x;

    /* renamed from: y, reason: collision with root package name */
    public m5.j f1175y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1176z;

    /* JADX WARN: Type inference failed for: r1v14, types: [b2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.widget.ImageView, android.view.View, m5.a] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1176z = false;
        this.B = -1.0f;
        this.F = new int[2];
        this.G = new int[2];
        this.H = new int[2];
        this.O = -1;
        this.R = -1;
        this.f1171h0 = new f(this, 0);
        this.f1172i0 = new g(this, 2);
        this.f1173j0 = new g(this, 3);
        this.A = ViewConfiguration.get(context).getScaledTouchSlop();
        this.J = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.P = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1169f0 = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f3 = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(l5.a.f8218a);
        imageView.f8605y = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = q0.f12397a;
        h0.k(imageView, f3 * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.f8605y);
        imageView.setBackground(shapeDrawable);
        this.Q = imageView;
        e eVar = new e(getContext());
        this.W = eVar;
        eVar.c(1);
        this.Q.setImageDrawable(this.W);
        this.Q.setVisibility(8);
        addView(this.Q);
        setChildrenDrawingOrderEnabled(true);
        int i6 = (int) (displayMetrics.density * 64.0f);
        this.U = i6;
        this.B = i6;
        this.D = new Object();
        this.E = new p(this);
        setNestedScrollingEnabled(true);
        int i10 = -this.f1169f0;
        this.K = i10;
        this.T = i10;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1163k0);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i6) {
        this.Q.getBackground().setAlpha(i6);
        this.W.setAlpha(i6);
    }

    @Override // t0.r
    public final void a(View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        if (i13 == 0) {
            int i15 = iArr[1];
            if (i13 == 0) {
                this.E.d(i6, i10, i11, i12, this.G, i13, iArr);
            }
            int i16 = i12 - (iArr[1] - i15);
            if (i16 == 0) {
                i14 = i12 + this.G[1];
            } else {
                i14 = i16;
            }
            if (i14 < 0 && !g()) {
                float abs = this.C + Math.abs(i14);
                this.C = abs;
                j(abs);
                iArr[1] = iArr[1] + i16;
            }
        }
    }

    @Override // t0.q
    public final void b(View view, int i6, int i10, int i11, int i12, int i13) {
        a(view, i6, i10, i11, i12, i13, this.H);
    }

    @Override // t0.q
    public final boolean c(View view, View view2, int i6, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(view, view2, i6);
        }
        return false;
    }

    @Override // t0.q
    public final void d(View view, View view2, int i6, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            n(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return this.E.a(f3, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return this.E.b(f3, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i10, int[] iArr, int[] iArr2) {
        return this.E.c(i6, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i10, int i11, int i12, int[] iArr) {
        return this.E.d(i6, i10, i11, i12, iArr, 0, null);
    }

    @Override // t0.q
    public final void e(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // t0.q
    public final void f(View view, int i6, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i6, i10, iArr);
        }
    }

    public final boolean g() {
        View view = this.f1174x;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        int i11 = this.R;
        if (i11 >= 0) {
            if (i10 == i6 - 1) {
                return i11;
            }
            if (i10 >= i11) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        j jVar = this.D;
        return jVar.f1381b | jVar.f1380a;
    }

    public int getProgressCircleDiameter() {
        return this.f1169f0;
    }

    public int getProgressViewEndOffset() {
        return this.U;
    }

    public int getProgressViewStartOffset() {
        return this.T;
    }

    public final void h() {
        if (this.f1174x == null) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (!childAt.equals(this.Q)) {
                    this.f1174x = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.E.f(0);
    }

    public final void i(float f3) {
        if (f3 > this.B) {
            m(true, true);
            return;
        }
        this.f1176z = false;
        e eVar = this.W;
        d dVar = eVar.f8629x;
        dVar.f8614e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f8615f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        eVar.invalidateSelf();
        f fVar = new f(this, 1);
        this.S = this.K;
        g gVar = this.f1173j0;
        gVar.reset();
        gVar.setDuration(200L);
        gVar.setInterpolator(this.P);
        a aVar = this.Q;
        aVar.f8604x = fVar;
        aVar.clearAnimation();
        this.Q.startAnimation(gVar);
        e eVar2 = this.W;
        d dVar2 = eVar2.f8629x;
        if (dVar2.f8622n) {
            dVar2.f8622n = false;
        }
        eVar2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.E.f12388d;
    }

    public final void j(float f3) {
        h hVar;
        h hVar2;
        e eVar = this.W;
        d dVar = eVar.f8629x;
        if (!dVar.f8622n) {
            dVar.f8622n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f3 / this.B));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f3) - this.B;
        int i6 = this.V;
        if (i6 <= 0) {
            i6 = this.U;
        }
        float f10 = i6;
        double max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(abs, f10 * 2.0f) / f10) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i10 = this.T + ((int) ((f10 * min) + (f10 * pow * 2.0f)));
        if (this.Q.getVisibility() != 0) {
            this.Q.setVisibility(0);
        }
        this.Q.setScaleX(1.0f);
        this.Q.setScaleY(1.0f);
        if (f3 < this.B) {
            if (this.W.f8629x.f8627t > 76 && ((hVar2 = this.f1166c0) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.W.f8629x.f8627t, 76);
                hVar3.setDuration(300L);
                a aVar = this.Q;
                aVar.f8604x = null;
                aVar.clearAnimation();
                this.Q.startAnimation(hVar3);
                this.f1166c0 = hVar3;
            }
        } else if (this.W.f8629x.f8627t < 255 && ((hVar = this.f1167d0) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.W.f8629x.f8627t, 255);
            hVar4.setDuration(300L);
            a aVar2 = this.Q;
            aVar2.f8604x = null;
            aVar2.clearAnimation();
            this.Q.startAnimation(hVar4);
            this.f1167d0 = hVar4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        e eVar2 = this.W;
        d dVar2 = eVar2.f8629x;
        dVar2.f8614e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar2.f8615f = min2;
        eVar2.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        e eVar3 = this.W;
        d dVar3 = eVar3.f8629x;
        if (min3 != dVar3.f8624p) {
            dVar3.f8624p = min3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.W;
        eVar4.f8629x.f8616g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i10 - this.K);
    }

    public final void k(float f3) {
        setTargetOffsetTopAndBottom((this.S + ((int) ((this.T - r0) * f3))) - this.Q.getTop());
    }

    public final void l() {
        this.Q.clearAnimation();
        this.W.stop();
        this.Q.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.T - this.K);
        this.K = this.Q.getTop();
    }

    public final void m(boolean z10, boolean z11) {
        if (this.f1176z != z10) {
            this.f1168e0 = z11;
            h();
            this.f1176z = z10;
            f fVar = this.f1171h0;
            if (z10) {
                this.S = this.K;
                g gVar = this.f1172i0;
                gVar.reset();
                gVar.setDuration(200L);
                gVar.setInterpolator(this.P);
                if (fVar != null) {
                    this.Q.f8604x = fVar;
                }
                this.Q.clearAnimation();
                this.Q.startAnimation(gVar);
                return;
            }
            g gVar2 = new g(this, 1);
            this.f1165b0 = gVar2;
            gVar2.setDuration(150L);
            a aVar = this.Q;
            aVar.f8604x = fVar;
            aVar.clearAnimation();
            this.Q.startAnimation(this.f1165b0);
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z10 && this.f1176z != z10) {
            this.f1176z = z10;
            setTargetOffsetTopAndBottom((this.U + this.T) - this.K);
            this.f1168e0 = z11;
            this.Q.setVisibility(0);
            this.W.setAlpha(255);
            g gVar = new g(this, 0);
            this.f1164a0 = gVar;
            gVar.setDuration(this.J);
            f fVar = this.f1171h0;
            if (fVar != null) {
                this.Q.f8604x = fVar;
            }
            this.Q.clearAnimation();
            this.Q.startAnimation(this.f1164a0);
            return;
        }
        m(z10, false);
    }

    public final void o(float f3) {
        float f10 = this.M;
        float f11 = f3 - f10;
        float f12 = this.A;
        if (f11 > f12 && !this.N) {
            this.L = f10 + f12;
            this.N = true;
            this.W.setAlpha(76);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h();
        int actionMasked = motionEvent.getActionMasked();
        int i6 = 0;
        if (isEnabled() && !g() && !this.f1176z && !this.I) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.O) {
                                    if (actionIndex == 0) {
                                        i6 = 1;
                                    }
                                    this.O = motionEvent.getPointerId(i6);
                                }
                            }
                        }
                    } else {
                        int i10 = this.O;
                        if (i10 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex >= 0) {
                            o(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.N;
                }
                this.N = false;
                this.O = -1;
                return this.N;
            }
            setTargetOffsetTopAndBottom(this.T - this.Q.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.O = pointerId;
            this.N = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.M = motionEvent.getY(findPointerIndex2);
                return this.N;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1174x == null) {
                h();
            }
            View view = this.f1174x;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.Q.getMeasuredWidth();
            int measuredHeight2 = this.Q.getMeasuredHeight();
            int i13 = measuredWidth / 2;
            int i14 = measuredWidth2 / 2;
            int i15 = this.K;
            this.Q.layout(i13 - i14, i15, i13 + i14, measuredHeight2 + i15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (this.f1174x == null) {
            h();
        }
        View view = this.f1174x;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.Q.measure(View.MeasureSpec.makeMeasureSpec(this.f1169f0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1169f0, 1073741824));
            this.R = -1;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                if (getChildAt(i11) == this.Q) {
                    this.R = i11;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        return this.E.a(f3, f10, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return this.E.b(f3, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr) {
        if (i10 > 0) {
            float f3 = this.C;
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f10 = i10;
                if (f10 > f3) {
                    iArr[1] = (int) f3;
                    this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    this.C = f3 - f10;
                    iArr[1] = i10;
                }
                j(this.C);
            }
        }
        int i11 = i6 - iArr[0];
        int i12 = i10 - iArr[1];
        int[] iArr2 = this.F;
        if (dispatchNestedPreScroll(i11, i12, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12) {
        a(view, i6, i10, i11, i12, 0, this.H);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        this.D.f1380a = i6;
        startNestedScroll(i6 & 2);
        this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.I = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f8639x);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f1176z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        if (isEnabled() && !this.f1176z && (i6 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.D.f1380a = 0;
        this.I = false;
        float f3 = this.C;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i(f3);
            this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            post(new j2.h(this, 7));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i6 = 0;
        if (isEnabled() && !g() && !this.f1176z && !this.I) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.O) {
                                        if (actionIndex == 0) {
                                            i6 = 1;
                                        }
                                        this.O = motionEvent.getPointerId(i6);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.O = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.O);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y9 = motionEvent.getY(findPointerIndex);
                        o(y9);
                        if (this.N) {
                            float f3 = (y9 - this.L) * 0.5f;
                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                j(f3);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.O);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.N) {
                        float y10 = (motionEvent.getY(findPointerIndex2) - this.L) * 0.5f;
                        this.N = false;
                        i(y10);
                    }
                    this.O = -1;
                    return false;
                }
            } else {
                this.O = motionEvent.getPointerId(0);
                this.N = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        if (this.f1170g0 && (view = this.f1174x) != null) {
            WeakHashMap weakHashMap = q0.f12397a;
            if (!h0.h(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f3) {
        this.Q.setScaleX(f3);
        this.Q.setScaleY(f3);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        e eVar = this.W;
        d dVar = eVar.f8629x;
        dVar.f8618i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr2[i6] = i0.f.c(context, iArr[i6]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i6) {
        this.B = i6;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f1170g0 = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        p pVar = this.E;
        if (pVar.f12388d) {
            ViewGroup viewGroup = pVar.f12387c;
            WeakHashMap weakHashMap = q0.f12397a;
            h0.m(viewGroup);
        }
        pVar.f12388d = z10;
    }

    public void setOnRefreshListener(m5.j jVar) {
        this.f1175y = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i6) {
        setProgressBackgroundColorSchemeResource(i6);
    }

    public void setProgressBackgroundColorSchemeColor(int i6) {
        this.Q.setBackgroundColor(i6);
    }

    public void setProgressBackgroundColorSchemeResource(int i6) {
        setProgressBackgroundColorSchemeColor(i0.f.c(getContext(), i6));
    }

    public void setRefreshing(boolean z10) {
        n(z10, false);
    }

    public void setSize(int i6) {
        if (i6 != 0 && i6 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i6 == 0) {
            this.f1169f0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f1169f0 = (int) (displayMetrics.density * 40.0f);
        }
        this.Q.setImageDrawable(null);
        this.W.c(i6);
        this.Q.setImageDrawable(this.W);
    }

    public void setSlingshotDistance(int i6) {
        this.V = i6;
    }

    public void setTargetOffsetTopAndBottom(int i6) {
        this.Q.bringToFront();
        q0.l(this.Q, i6);
        this.K = this.Q.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return this.E.g(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.E.h(0);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
