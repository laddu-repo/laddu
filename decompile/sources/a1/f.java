package a1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: v, reason: collision with root package name */
    public static final d f134v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f138d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f139e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f140f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f141g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f142h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f143i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f144k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f145l;

    /* renamed from: m, reason: collision with root package name */
    public final float f146m;

    /* renamed from: n, reason: collision with root package name */
    public final float f147n;

    /* renamed from: o, reason: collision with root package name */
    public final int f148o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f149p;

    /* renamed from: q, reason: collision with root package name */
    public final a8.a f150q;

    /* renamed from: r, reason: collision with root package name */
    public View f151r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f152t;

    /* renamed from: c, reason: collision with root package name */
    public int f137c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final e f153u = new e(this, 0);

    public f(Context context, CoordinatorLayout coordinatorLayout, a8.a aVar) {
        if (aVar != null) {
            this.f152t = coordinatorLayout;
            this.f150q = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f148o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f136b = viewConfiguration.getScaledTouchSlop();
            this.f146m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f147n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f149p = new OverScroller(context, f134v);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public final void a() {
        this.f137c = -1;
        float[] fArr = this.f138d;
        if (fArr != null) {
            Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f139e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f140f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f141g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f142h, 0);
            Arrays.fill(this.f143i, 0);
            Arrays.fill(this.j, 0);
            this.f144k = 0;
        }
        VelocityTracker velocityTracker = this.f145l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f145l = null;
        }
    }

    public final void b(View view, int i6) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f152t;
        if (parent == coordinatorLayout) {
            this.f151r = view;
            this.f137c = i6;
            this.f150q.p(view, i6);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L48
        L4:
            a8.a r1 = r3.f150q
            int r4 = r1.m(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            int r1 = r1.o()
            if (r1 <= 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r4 == 0) goto L2c
            if (r1 == 0) goto L2c
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f136b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L48
            goto L47
        L2c:
            if (r4 == 0) goto L3a
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f136b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L48
            goto L47
        L3a:
            if (r1 == 0) goto L48
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f136b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L48
        L47:
            return r2
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.c(android.view.View, float, float):boolean");
    }

    public final void d(int i6) {
        float[] fArr = this.f138d;
        if (fArr != null) {
            int i10 = this.f144k;
            int i11 = 1 << i6;
            if ((i10 & i11) != 0) {
                fArr[i6] = 0.0f;
                this.f139e[i6] = 0.0f;
                this.f140f[i6] = 0.0f;
                this.f141g[i6] = 0.0f;
                this.f142h[i6] = 0;
                this.f143i[i6] = 0;
                this.j[i6] = 0;
                this.f144k = (~i11) & i10;
            }
        }
    }

    public final int e(int i6, int i10, int i11) {
        int abs;
        if (i6 == 0) {
            return 0;
        }
        float width = this.f152t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i6) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i6) / i11) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.f135a == 2) {
            OverScroller overScroller = this.f149p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f151r.getLeft();
            int top = currY - this.f151r.getTop();
            if (left != 0) {
                q0.k(this.f151r, left);
            }
            if (top != 0) {
                q0.l(this.f151r, top);
            }
            if (left != 0 || top != 0) {
                this.f150q.r(this.f151r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f152t.post(this.f153u);
            }
        }
        if (this.f135a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i6, int i10) {
        CoordinatorLayout coordinatorLayout = this.f152t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f150q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i6, int i10, int i11, int i12) {
        float f3;
        float f10;
        float f11;
        float f12;
        int left = this.f151r.getLeft();
        int top = this.f151r.getTop();
        int i13 = i6 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f149p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f151r;
        int i15 = (int) this.f147n;
        int i16 = (int) this.f146m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            if (i11 > 0) {
                i11 = i16;
            } else {
                i11 = -i16;
            }
        }
        int abs2 = Math.abs(i12);
        if (abs2 < i15) {
            i12 = 0;
        } else if (abs2 > i16) {
            if (i12 > 0) {
                i12 = i16;
            } else {
                i12 = -i16;
            }
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i17 = abs5 + abs6;
        int i18 = abs3 + abs4;
        if (i11 != 0) {
            f3 = abs5;
            f10 = i17;
        } else {
            f3 = abs3;
            f10 = i18;
        }
        float f13 = f3 / f10;
        if (i12 != 0) {
            f11 = abs6;
            f12 = i17;
        } else {
            f11 = abs4;
            f12 = i18;
        }
        float f14 = f11 / f12;
        a8.a aVar = this.f150q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, aVar.o()) * f14) + (e(i13, i11, aVar.m(view)) * f13)));
        n(2);
        return true;
    }

    public final boolean i(int i6) {
        if ((this.f144k & (1 << i6)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f145l == null) {
            this.f145l = VelocityTracker.obtain();
        }
        this.f145l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                a8.a aVar = this.f150q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f135a == 1 && pointerId == this.f137c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i10 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i10);
                                            if (pointerId2 != this.f137c) {
                                                View g10 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                                                View view = this.f151r;
                                                if (g10 == view && q(view, pointerId2)) {
                                                    i6 = this.f137c;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            i6 = -1;
                                            break;
                                        }
                                    }
                                    if (i6 == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y9 = motionEvent.getY(actionIndex);
                        l(x10, y9, pointerId3);
                        if (this.f135a == 0) {
                            q(g((int) x10, (int) y9), pointerId3);
                            int i11 = this.f142h[pointerId3];
                            return;
                        }
                        int i12 = (int) x10;
                        int i13 = (int) y9;
                        View view2 = this.f151r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            q(this.f151r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f135a == 1) {
                        this.s = true;
                        aVar.s(this.f151r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.s = false;
                        if (this.f135a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f135a == 1) {
                    if (!i(this.f137c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f137c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f140f;
                    int i14 = this.f137c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y10 - this.f141g[i14]);
                    int left = this.f151r.getLeft() + i15;
                    int top = this.f151r.getTop() + i16;
                    int left2 = this.f151r.getLeft();
                    int top2 = this.f151r.getTop();
                    if (i15 != 0) {
                        left = aVar.c(this.f151r, left);
                        q0.k(this.f151r, left - left2);
                    }
                    if (i16 != 0) {
                        top = aVar.d(this.f151r, top);
                        q0.l(this.f151r, top - top2);
                    }
                    if (i15 != 0 || i16 != 0) {
                        aVar.r(this.f151r, left, top);
                    }
                    m(motionEvent);
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i10 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (i(pointerId4)) {
                        float x12 = motionEvent.getX(i10);
                        float y11 = motionEvent.getY(i10);
                        float f3 = x12 - this.f138d[pointerId4];
                        float f10 = y11 - this.f139e[pointerId4];
                        Math.abs(f3);
                        Math.abs(f10);
                        int i17 = this.f142h[pointerId4];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i18 = this.f142h[pointerId4];
                        Math.abs(f3);
                        Math.abs(f10);
                        int i19 = this.f142h[pointerId4];
                        Math.abs(f10);
                        Math.abs(f3);
                        int i20 = this.f142h[pointerId4];
                        if (this.f135a != 1) {
                            View g11 = g((int) x12, (int) y11);
                            if (c(g11, f3, f10) && q(g11, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                m(motionEvent);
                return;
            }
            if (this.f135a == 1) {
                k();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g12 = g((int) x13, (int) y12);
        l(x13, y12, pointerId5);
        q(g12, pointerId5);
        int i21 = this.f142h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f145l;
        float f3 = this.f146m;
        velocityTracker.computeCurrentVelocity(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, f3);
        float xVelocity = this.f145l.getXVelocity(this.f137c);
        float abs = Math.abs(xVelocity);
        float f10 = this.f147n;
        if (abs < f10) {
            xVelocity = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (abs > f3) {
            if (xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                xVelocity = f3;
            } else {
                xVelocity = -f3;
            }
        }
        float yVelocity = this.f145l.getYVelocity(this.f137c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (abs2 > f3) {
            if (yVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = -f3;
            }
        } else {
            f3 = yVelocity;
        }
        this.s = true;
        this.f150q.s(this.f151r, xVelocity, f3);
        this.s = false;
        if (this.f135a == 1) {
            n(0);
        }
    }

    public final void l(float f3, float f10, int i6) {
        float[] fArr = this.f138d;
        int i10 = 0;
        if (fArr == null || fArr.length <= i6) {
            int i11 = i6 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f139e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f140f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f141g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f142h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f143i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f138d = fArr2;
            this.f139e = fArr3;
            this.f140f = fArr4;
            this.f141g = fArr5;
            this.f142h = iArr;
            this.f143i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f138d;
        this.f140f[i6] = f3;
        fArr9[i6] = f3;
        float[] fArr10 = this.f139e;
        this.f141g[i6] = f10;
        fArr10[i6] = f10;
        int[] iArr7 = this.f142h;
        int i12 = (int) f3;
        int i13 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f152t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f148o;
        if (i12 < left + i14) {
            i10 = 1;
        }
        if (i13 < coordinatorLayout.getTop() + i14) {
            i10 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i10 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i10 |= 8;
        }
        iArr7[i6] = i10;
        this.f144k |= 1 << i6;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (i(pointerId)) {
                float x10 = motionEvent.getX(i6);
                float y9 = motionEvent.getY(i6);
                this.f140f[pointerId] = x10;
                this.f141g[pointerId] = y9;
            }
        }
    }

    public final void n(int i6) {
        this.f152t.removeCallbacks(this.f153u);
        if (this.f135a != i6) {
            this.f135a = i6;
            this.f150q.q(i6);
            if (this.f135a == 0) {
                this.f151r = null;
            }
        }
    }

    public final boolean o(int i6, int i10) {
        if (this.s) {
            return h(i6, i10, (int) this.f145l.getXVelocity(this.f137c), (int) this.f145l.getYVelocity(this.f137c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i6) {
        if (view == this.f151r && this.f137c == i6) {
            return true;
        }
        if (view != null && this.f150q.u(view, i6)) {
            this.f137c = i6;
            b(view, i6);
            return true;
        }
        return false;
    }
}
