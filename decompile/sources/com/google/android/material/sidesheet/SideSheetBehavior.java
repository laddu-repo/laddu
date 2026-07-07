package com.google.android.material.sidesheet;

import a1.f;
import a2.w;
import a8.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import f0.b;
import h8.c;
import i4.n1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t0.q0;
import ua.i;
import ua.l;
import ua.m;
import va.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f2720a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2721b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f2722c;

    /* renamed from: d, reason: collision with root package name */
    public final m f2723d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f2724e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2725f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2726g;

    /* renamed from: h, reason: collision with root package name */
    public int f2727h;

    /* renamed from: i, reason: collision with root package name */
    public f f2728i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2729k;

    /* renamed from: l, reason: collision with root package name */
    public int f2730l;

    /* renamed from: m, reason: collision with root package name */
    public int f2731m;

    /* renamed from: n, reason: collision with root package name */
    public int f2732n;

    /* renamed from: o, reason: collision with root package name */
    public int f2733o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2734p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2735q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2736r;
    public VelocityTracker s;

    /* renamed from: t, reason: collision with root package name */
    public int f2737t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f2738u;

    /* renamed from: v, reason: collision with root package name */
    public final va.b f2739v;

    public SideSheetBehavior() {
        this.f2724e = new n1(this);
        this.f2726g = true;
        this.f2727h = 5;
        this.f2729k = 0.1f;
        this.f2736r = -1;
        this.f2738u = new LinkedHashSet();
        this.f2739v = new va.b(this, 0);
    }

    @Override // f0.b
    public final void c(f0.e eVar) {
        this.f2734p = null;
        this.f2728i = null;
    }

    @Override // f0.b
    public final void f() {
        this.f2734p = null;
        this.f2728i = null;
    }

    @Override // f0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || q0.e(view) != null) && this.f2726g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.s) != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                    this.j = false;
                    return false;
                }
            } else {
                this.f2737t = (int) motionEvent.getX();
            }
            if (!this.j && (fVar = this.f2728i) != null && fVar.p(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // f0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        int i10;
        View view2;
        View view3;
        int i11;
        int i12;
        View findViewById;
        int i13;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.f2734p == null) {
            this.f2734p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            Context context = view.getContext();
            j5.t(context, R.attr.motionDurationMedium2, 300);
            j5.t(context, R.attr.motionDurationShort3, 150);
            j5.t(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            i iVar = this.f2721b;
            if (iVar != null) {
                view.setBackground(iVar);
                float f3 = this.f2725f;
                if (f3 == -1.0f) {
                    f3 = view.getElevation();
                }
                this.f2721b.p(f3);
            } else {
                ColorStateList colorStateList = this.f2722c;
                if (colorStateList != null) {
                    q0.t(view, colorStateList);
                }
            }
            if (this.f2727h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            v();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (q0.e(view) == null) {
                q0.s(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((f0.e) view.getLayoutParams()).f4613c, i6) == 3) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        e eVar = this.f2720a;
        if (eVar == null || eVar.r() != i10) {
            f0.e eVar2 = null;
            m mVar = this.f2723d;
            if (i10 == 0) {
                this.f2720a = new a(this, 1);
                if (mVar != null) {
                    WeakReference weakReference = this.f2734p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof f0.e)) {
                        eVar2 = (f0.e) view3.getLayoutParams();
                    }
                    if (eVar2 == null || ((ViewGroup.MarginLayoutParams) eVar2).rightMargin <= 0) {
                        l g10 = mVar.g();
                        g10.f13008f = new ua.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        g10.f13009g = new ua.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        m a10 = g10.a();
                        i iVar2 = this.f2721b;
                        if (iVar2 != null) {
                            iVar2.setShapeAppearanceModel(a10);
                        }
                    }
                }
            } else if (i10 == 1) {
                this.f2720a = new a(this, 0);
                if (mVar != null) {
                    WeakReference weakReference2 = this.f2734p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof f0.e)) {
                        eVar2 = (f0.e) view2.getLayoutParams();
                    }
                    if (eVar2 == null || ((ViewGroup.MarginLayoutParams) eVar2).leftMargin <= 0) {
                        l g11 = mVar.g();
                        g11.f13007e = new ua.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        g11.f13010h = new ua.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        m a11 = g11.a();
                        i iVar3 = this.f2721b;
                        if (iVar3 != null) {
                            iVar3.setShapeAppearanceModel(a11);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(c.j(i10, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
            }
        }
        if (this.f2728i == null) {
            this.f2728i = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f2739v);
        }
        int p10 = this.f2720a.p(view);
        coordinatorLayout.r(view, i6);
        this.f2731m = coordinatorLayout.getWidth();
        this.f2732n = this.f2720a.q(coordinatorLayout);
        this.f2730l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i11 = this.f2720a.c(marginLayoutParams);
        } else {
            i11 = 0;
        }
        this.f2733o = i11;
        int i15 = this.f2727h;
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                if (i15 == 5) {
                    i14 = this.f2720a.m();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f2727h);
                }
            }
        } else {
            i14 = p10 - this.f2720a.p(view);
        }
        q0.k(view, i14);
        if (this.f2735q == null && (i12 = this.f2736r) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f2735q = new WeakReference(findViewById);
        }
        Iterator it = this.f2738u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // f0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // f0.b
    public final void n(View view, Parcelable parcelable) {
        int i6 = ((va.c) parcelable).f13501z;
        if (i6 == 1 || i6 == 2) {
            i6 = 5;
        }
        this.f2727h = i6;
    }

    @Override // f0.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new va.c(this);
    }

    @Override // f0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2727h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f2728i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float abs = Math.abs(this.f2737t - motionEvent.getX());
            f fVar = this.f2728i;
            if (abs > fVar.f136b) {
                fVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void s(int i6) {
        View view;
        int i10;
        if (this.f2727h != i6) {
            this.f2727h = i6;
            WeakReference weakReference = this.f2734p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.f2727h == 5) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (view.getVisibility() != i10) {
                view.setVisibility(i10);
            }
            Iterator it = this.f2738u.iterator();
            if (!it.hasNext()) {
                v();
                return;
            }
            throw r4.a.i(it);
        }
    }

    public final boolean t() {
        if (this.f2728i != null) {
            if (this.f2726g || this.f2727h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        s(2);
        r2.f2724e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            a8.e r0 = r2.f2720a
            int r0 = r0.m()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = h8.c.i(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            a8.e r0 = r2.f2720a
            int r0 = r0.l()
        L1f:
            a1.f r1 = r2.f2728i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f151r = r3
            r3 = -1
            r1.f137c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f135a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f151r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f151r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.s(r3)
            i4.n1 r3 = r2.f2724e
            r3.a(r4)
            return
        L57:
            r2.s(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.u(android.view.View, int, boolean):void");
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.f2734p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            q0.o(view, 262144);
            q0.j(view, 0);
            q0.o(view, 1048576);
            q0.j(view, 0);
            int i6 = 5;
            if (this.f2727h != 5) {
                q0.p(view, u0.b.j, new w(i6, 4, this));
            }
            int i10 = 3;
            if (this.f2727h != 3) {
                q0.p(view, u0.b.f12736h, new w(i10, 4, this));
            }
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2724e = new n1(this);
        this.f2726g = true;
        this.f2727h = 5;
        this.f2729k = 0.1f;
        this.f2736r = -1;
        this.f2738u = new LinkedHashSet();
        this.f2739v = new va.b(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.L);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2722c = a8.i.i(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2723d = m.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2736r = resourceId;
            WeakReference weakReference = this.f2735q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2735q = null;
            WeakReference weakReference2 = this.f2734p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        m mVar = this.f2723d;
        if (mVar != null) {
            i iVar = new i(mVar);
            this.f2721b = iVar;
            iVar.m(context);
            ColorStateList colorStateList = this.f2722c;
            if (colorStateList != null) {
                this.f2721b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2721b.setTint(typedValue.data);
            }
        }
        this.f2725f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2726g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
