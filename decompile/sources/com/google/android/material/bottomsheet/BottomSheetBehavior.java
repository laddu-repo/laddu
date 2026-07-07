package com.google.android.material.bottomsheet;

import a1.f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import d6.e;
import f0.b;
import h8.c;
import i4.n1;
import j1.f0;
import j2.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import r4.a;
import t0.a1;
import t0.h0;
import t0.q0;
import t0.y0;
import t0.z0;
import ua.i;
import ua.m;
import w4.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public final n1 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public f O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2607a;

    /* renamed from: a0, reason: collision with root package name */
    public int f2608a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2609b;

    /* renamed from: b0, reason: collision with root package name */
    public int f2610b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f2611c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f2612c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f2613d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f2614d0;

    /* renamed from: e, reason: collision with root package name */
    public int f2615e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f2616e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2617f;

    /* renamed from: f0, reason: collision with root package name */
    public final va.b f2618f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2619g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2620h;

    /* renamed from: i, reason: collision with root package name */
    public final i f2621i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2622k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2623l;

    /* renamed from: m, reason: collision with root package name */
    public int f2624m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2625n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2626o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2627p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2628q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2629r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2630t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2631u;

    /* renamed from: v, reason: collision with root package name */
    public int f2632v;

    /* renamed from: w, reason: collision with root package name */
    public int f2633w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2634x;

    /* renamed from: y, reason: collision with root package name */
    public final m f2635y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2636z;

    public BottomSheetBehavior() {
        this.f2607a = 0;
        this.f2609b = true;
        this.f2622k = -1;
        this.f2623l = -1;
        this.A = new n1(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f2610b0 = -1;
        this.f2616e0 = new SparseIntArray();
        this.f2618f0 = new va.b(this, 1);
    }

    public static View w(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View w10 = w(viewGroup.getChildAt(i6));
                    if (w10 != null) {
                        return w10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int x(int i6, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i11 = Math.min(size, i11);
            }
            return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
    }

    public final boolean A() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void B(int i6) {
        if (i6 == -1) {
            if (!this.f2617f) {
                this.f2617f = true;
            } else {
                return;
            }
        } else {
            if (!this.f2617f && this.f2615e == i6) {
                return;
            }
            this.f2617f = false;
            this.f2615e = Math.max(0, i6);
        }
        J();
    }

    public final void C(int i6) {
        String str;
        int i10;
        if (i6 != 1 && i6 != 2) {
            if (!this.I && i6 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i6);
                return;
            }
            if (i6 == 6 && this.f2609b && z(i6) <= this.D) {
                i10 = 3;
            } else {
                i10 = i6;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                e eVar = new e(this, view, i10);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(eVar);
                    return;
                } else {
                    eVar.run();
                    return;
                }
            }
            D(i6);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i6 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(a.o(sb2, str, " should not be set externally."));
    }

    public final void D(int i6) {
        if (this.N != i6) {
            this.N = i6;
            if (i6 != 4 && i6 != 3 && i6 != 6) {
                boolean z10 = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || ((View) weakReference.get()) == null) {
                return;
            }
            if (i6 == 3) {
                I(true);
            } else if (i6 == 6 || i6 == 5 || i6 == 4) {
                I(false);
            }
            H(i6, true);
            ArrayList arrayList = this.Y;
            if (arrayList.size() <= 0) {
                G();
                return;
            }
            throw c.h(0, arrayList);
        }
    }

    public final boolean E(View view, float f3) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f3 * this.S) + view.getTop()) - this.G) / u() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        D(2);
        H(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.z(r4)
            a1.f r1 = r2.O
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f151r = r3
            r3 = -1
            r1.f137c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f135a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f151r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f151r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.D(r3)
            r3 = 1
            r2.H(r4, r3)
            i4.n1 r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.D(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, boolean):void");
    }

    public final void G() {
        View view;
        int i6;
        boolean z10;
        t0.b bVar;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            q0.o(view, 524288);
            q0.j(view, 0);
            q0.o(view, 262144);
            q0.j(view, 0);
            q0.o(view, 1048576);
            q0.j(view, 0);
            SparseIntArray sparseIntArray = this.f2616e0;
            int i10 = sparseIntArray.get(0, -1);
            if (i10 != -1) {
                q0.o(view, i10);
                q0.j(view, 0);
                sparseIntArray.delete(0);
            }
            int i11 = 6;
            if (!this.f2609b && this.N != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                y yVar = new y(i11, 10, this);
                ArrayList f3 = q0.f(view);
                int i12 = 0;
                while (true) {
                    if (i12 < f3.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((u0.b) f3.get(i12)).f12740a).getLabel())) {
                            i6 = ((u0.b) f3.get(i12)).a();
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = -1;
                        int i14 = 0;
                        while (true) {
                            int[] iArr = q0.f12401e;
                            if (i14 >= 32 || i13 != -1) {
                                break;
                            }
                            int i15 = iArr[i14];
                            boolean z11 = true;
                            for (int i16 = 0; i16 < f3.size(); i16++) {
                                if (((u0.b) f3.get(i16)).a() != i15) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 &= z10;
                            }
                            if (z11) {
                                i13 = i15;
                            }
                            i14++;
                        }
                        i6 = i13;
                    }
                }
                if (i6 != -1) {
                    u0.b bVar2 = new u0.b(null, i6, string, yVar, null);
                    View.AccessibilityDelegate d10 = q0.d(view);
                    if (d10 == null) {
                        bVar = null;
                    } else if (d10 instanceof t0.a) {
                        bVar = ((t0.a) d10).f12313a;
                    } else {
                        bVar = new t0.b(d10);
                    }
                    if (bVar == null) {
                        bVar = new t0.b();
                    }
                    q0.r(view, bVar);
                    q0.o(view, bVar2.a());
                    q0.f(view).add(bVar2);
                    q0.j(view, 0);
                }
                sparseIntArray.put(0, i6);
            }
            if (this.I) {
                int i17 = 5;
                if (this.N != 5) {
                    q0.p(view, u0.b.j, new y(i17, 10, this));
                }
            }
            int i18 = this.N;
            int i19 = 4;
            int i20 = 3;
            if (i18 != 3) {
                if (i18 != 4) {
                    if (i18 == 6) {
                        q0.p(view, u0.b.f12737i, new y(i19, 10, this));
                        q0.p(view, u0.b.f12736h, new y(i20, 10, this));
                        return;
                    }
                    return;
                }
                if (this.f2609b) {
                    i11 = 3;
                }
                q0.p(view, u0.b.f12736h, new y(i11, 10, this));
                return;
            }
            if (this.f2609b) {
                i11 = 4;
            }
            q0.p(view, u0.b.f12737i, new y(i11, 10, this));
        }
    }

    public final void H(int i6, boolean z10) {
        boolean z11;
        i iVar;
        if (i6 != 2) {
            if (this.N == 3 && (this.f2634x || A())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f2636z != z11 && (iVar = this.f2621i) != null) {
                this.f2636z = z11;
                ValueAnimator valueAnimator = this.B;
                float f3 = 1.0f;
                if (z10 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f10 = iVar.f13000y.j;
                    if (z11) {
                        f3 = t();
                    }
                    valueAnimator.setFloatValues(f10, f3);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f2636z) {
                    f3 = t();
                }
                iVar.r(f3);
            }
        }
    }

    public final void I(boolean z10) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f2614d0 == null) {
                        this.f2614d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = coordinatorLayout.getChildAt(i6);
                    if (childAt != this.W.get() && z10) {
                        this.f2614d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.f2614d0 = null;
                }
            }
        }
    }

    public final void J() {
        View view;
        if (this.W != null) {
            s();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // f0.b
    public final void c(f0.e eVar) {
        this.W = null;
        this.O = null;
    }

    @Override // f0.b
    public final void f() {
        this.W = null;
        this.O = null;
    }

    @Override // f0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        int i6;
        f fVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f2608a0 = -1;
                this.f2610b0 = -1;
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Z = null;
                }
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f2612c0 = false;
                    this.f2608a0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                int y9 = (int) motionEvent.getY();
                this.f2610b0 = y9;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.p(view2, x10, y9)) {
                        this.f2608a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f2612c0 = true;
                    }
                }
                if (this.f2608a0 == -1 && !coordinatorLayout.p(view, x10, this.f2610b0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.P = z10;
            }
            if (this.P || (fVar = this.O) == null || !fVar.p(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i6 = this.f2610b0) == -1 || Math.abs(i6 - motionEvent.getY()) <= this.O.f136b) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, ic.o] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, a3.c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.measurement.p4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int[], java.io.Serializable] */
    @Override // f0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        boolean z10;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f2619g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && !this.f2625n && !this.f2617f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f2626o || this.f2627p || this.f2628q || this.s || this.f2630t || this.f2631u || z10) {
                ?? obj = new Object();
                obj.f2389b = this;
                obj.f2388a = z10;
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj2 = new Object();
                obj2.f521a = paddingStart;
                obj2.f522b = paddingEnd;
                obj2.f523c = paddingBottom;
                f0 f0Var = new f0(13, (Object) obj, (Object) obj2);
                WeakHashMap weakHashMap = q0.f12397a;
                h0.l(view, f0Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            ?? obj3 = new Object();
            obj3.f6774e = new int[2];
            obj3.f6773d = view;
            WeakHashMap weakHashMap2 = q0.f12397a;
            if (i10 >= 30) {
                view.setWindowInsetsAnimationCallback(new a1(obj3));
            } else {
                PathInterpolator pathInterpolator = z0.f12430e;
                y0 y0Var = new y0(view, obj3);
                view.setTag(R.id.tag_window_insets_animation_callback, y0Var);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(y0Var);
                }
            }
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            Context context = view.getContext();
            j5.t(context, R.attr.motionDurationMedium2, 300);
            j5.t(context, R.attr.motionDurationShort3, 150);
            j5.t(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            i iVar = this.f2621i;
            if (iVar != null) {
                view.setBackground(iVar);
                float f3 = this.H;
                if (f3 == -1.0f) {
                    f3 = view.getElevation();
                }
                iVar.p(f3);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    q0.t(view, colorStateList);
                }
            }
            G();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f2618f0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i6);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i11 = this.V;
        int i12 = i11 - height;
        int i13 = this.f2633w;
        if (i12 < i13) {
            boolean z11 = this.f2629r;
            int i14 = this.f2623l;
            if (z11) {
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.T = i11;
            } else {
                int i15 = i11 - i13;
                if (i14 != -1) {
                    i15 = Math.min(i15, i14);
                }
                this.T = i15;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        s();
        int i16 = this.N;
        if (i16 == 3) {
            q0.l(view, y());
        } else if (i16 == 6) {
            q0.l(view, this.E);
        } else if (this.I && i16 == 5) {
            q0.l(view, this.V);
        } else if (i16 == 4) {
            q0.l(view, this.G);
        } else if (i16 == 1 || i16 == 2) {
            q0.l(view, top - view.getTop());
        }
        H(this.N, false);
        this.X = new WeakReference(w(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        throw c.h(0, arrayList);
    }

    @Override // f0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f2622k, marginLayoutParams.width), x(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2623l, marginLayoutParams.height));
        return true;
    }

    @Override // f0.b
    public final boolean j(View view) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view == weakReference.get() && this.N != 3 && !this.M) {
            return true;
        }
        return false;
    }

    @Override // f0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10, int[] iArr, int i11) {
        View view3;
        if (i11 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i12 = top - i10;
                if (i10 > 0) {
                    if (!this.R && !this.L && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    }
                    if (i12 < y()) {
                        int y9 = top - y();
                        iArr[1] = y9;
                        q0.l(view, -y9);
                        D(3);
                    } else if (this.K) {
                        iArr[1] = i10;
                        q0.l(view, -i10);
                        D(1);
                    } else {
                        return;
                    }
                } else if (i10 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !this.L && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    }
                    if (!canScrollVertically) {
                        int i13 = this.G;
                        if (i12 > i13 && !this.I) {
                            int i14 = top - i13;
                            iArr[1] = i14;
                            q0.l(view, -i14);
                            D(4);
                        } else {
                            if (!this.K) {
                                return;
                            }
                            iArr[1] = i10;
                            q0.l(view, -i10);
                            D(1);
                        }
                    }
                }
                v(view.getTop());
                this.Q = i10;
                this.R = true;
                this.M = false;
            }
        }
    }

    @Override // f0.b
    public final void n(View view, Parcelable parcelable) {
        z9.a aVar = (z9.a) parcelable;
        int i6 = this.f2607a;
        if (i6 != 0) {
            if (i6 == -1 || (i6 & 1) == 1) {
                this.f2615e = aVar.A;
            }
            if (i6 == -1 || (i6 & 2) == 2) {
                this.f2609b = aVar.B;
            }
            if (i6 == -1 || (i6 & 4) == 4) {
                this.I = aVar.C;
            }
            if (i6 == -1 || (i6 & 8) == 8) {
                this.J = aVar.D;
            }
        }
        int i10 = aVar.f15231z;
        if (i10 != 1 && i10 != 2) {
            this.N = i10;
        } else {
            this.N = 4;
        }
    }

    @Override // f0.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new z9.a(this);
    }

    @Override // f0.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10) {
        this.Q = 0;
        this.R = false;
        if ((i6 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    @Override // f0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.y()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.D(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.X
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.R
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f2609b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.Z
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f2611c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Z
            int r6 = r2.f2608a0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.E(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f2609b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f2609b
            if (r3 == 0) goto L99
        L97:
            r0 = 4
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = 6
        Laf:
            r3 = 0
            r2.F(r4, r0, r3)
            r2.R = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // f0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.N;
        if (i6 == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.O;
        if (fVar != null && (this.K || i6 == 1)) {
            fVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2608a0 = -1;
            this.f2610b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float abs = Math.abs(this.f2610b0 - motionEvent.getY());
            f fVar2 = this.O;
            if (abs > fVar2.f136b) {
                fVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    public final void s() {
        int u3 = u();
        if (this.f2609b) {
            this.G = Math.max(this.V - u3, this.D);
        } else {
            this.G = this.V - u3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0 = r0.getRootWindowInsets();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float t() {
        /*
            r5 = this;
            ua.i r0 = r5.f2621i
            r1 = 0
            if (r0 == 0) goto L77
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L77
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L77
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.A()
            if (r2 == 0) goto L77
            android.view.WindowInsets r0 = u5.y.d(r0)
            if (r0 == 0) goto L77
            ua.i r2 = r5.f2621i
            float r2 = r2.k()
            android.view.RoundedCorner r3 = t0.e.e(r0)
            if (r3 == 0) goto L44
            int r3 = t0.e.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = 0
        L45:
            ua.i r2 = r5.f2621i
            float[] r4 = r2.Z
            if (r4 == 0) goto L4f
            r2 = 0
            r2 = r4[r2]
            goto L5d
        L4f:
            ua.g r4 = r2.f13000y
            ua.m r4 = r4.f12978a
            ua.d r4 = r4.f13020f
            android.graphics.RectF r2 = r2.h()
            float r2 = r4.a(r2)
        L5d:
            android.view.RoundedCorner r0 = t0.e.j(r0)
            if (r0 == 0) goto L72
            int r0 = t0.e.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            float r1 = r0 / r2
        L72:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():float");
    }

    public final int u() {
        int i6;
        if (this.f2617f) {
            return Math.min(Math.max(this.f2619g, this.V - ((this.U * 9) / 16)), this.T) + this.f2632v;
        }
        if (!this.f2625n && !this.f2626o && (i6 = this.f2624m) > 0) {
            return Math.max(this.f2615e, i6 + this.f2620h);
        }
        return this.f2615e + this.f2632v;
    }

    public final void v(int i6) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i10 = this.G;
                if (i6 <= i10 && i10 != y()) {
                    y();
                }
                if (arrayList.size() > 0) {
                    throw c.h(0, arrayList);
                }
            }
        }
    }

    public final int y() {
        int i6;
        if (this.f2609b) {
            return this.D;
        }
        if (this.f2629r) {
            i6 = 0;
        } else {
            i6 = this.f2633w;
        }
        return Math.max(this.C, i6);
    }

    public final int z(int i6) {
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(c.i(i6, "Invalid state to get top offset: "));
                }
                return this.V;
            }
            return this.G;
        }
        return y();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i6;
        this.f2607a = 0;
        this.f2609b = true;
        this.f2622k = -1;
        this.f2623l = -1;
        this.A = new n1(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f2610b0 = -1;
        this.f2616e0 = new SparseIntArray();
        this.f2618f0 = new va.b(this, 1);
        this.f2620h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f12677e);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = a8.i.i(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f2635y = m.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        m mVar = this.f2635y;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f2621i = iVar;
            iVar.m(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f2621i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2621i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new t(this, 2));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2622k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2623l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i6 = peekValue.data) == -1) {
            B(i6);
        } else {
            B(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z10 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.N == 5) {
                C(4);
            }
            G();
        }
        this.f2625n = obtainStyledAttributes.getBoolean(14, false);
        boolean z11 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f2609b != z11) {
            this.f2609b = z11;
            if (this.W != null) {
                s();
            }
            D((this.f2609b && this.N == 6) ? 3 : this.N);
            H(this.N, true);
            G();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.f2607a = obtainStyledAttributes.getInt(11, 0);
        float f3 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 < 1.0f) {
            this.F = f3;
            if (this.W != null) {
                this.E = (int) ((1.0f - f3) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i10 = peekValue2.data;
                if (i10 >= 0) {
                    this.C = i10;
                    H(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    H(this.N, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2613d = obtainStyledAttributes.getInt(12, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
            this.f2626o = obtainStyledAttributes.getBoolean(18, false);
            this.f2627p = obtainStyledAttributes.getBoolean(19, false);
            this.f2628q = obtainStyledAttributes.getBoolean(20, false);
            this.f2629r = obtainStyledAttributes.getBoolean(21, true);
            this.s = obtainStyledAttributes.getBoolean(15, false);
            this.f2630t = obtainStyledAttributes.getBoolean(16, false);
            this.f2631u = obtainStyledAttributes.getBoolean(17, false);
            this.f2634x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.f2611c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // f0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int[] iArr) {
    }
}
