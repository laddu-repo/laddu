package androidx.recyclerview.widget;

import a1.d;
import a2.a2;
import a8.e;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.unity3d.services.UnityAdsConstants;
import ie.k;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o4.j;
import okhttp3.HttpUrl;
import s8.l;
import t0.h0;
import t0.o;
import t0.p;
import t0.q0;
import t0.r0;
import u5.r;
import v.h;
import v.i;
import w4.a;
import w4.a1;
import w4.b1;
import w4.c;
import w4.c0;
import w4.e1;
import w4.f1;
import w4.g1;
import w4.h1;
import w4.i1;
import w4.j0;
import w4.k0;
import w4.k1;
import w4.m0;
import w4.n0;
import w4.o0;
import w4.p0;
import w4.r1;
import w4.s0;
import w4.t0;
import w4.u;
import w4.u0;
import w4.v0;
import w4.w;
import w4.w0;
import w4.x0;
import w4.y0;
import w4.z0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements o {
    public static final int[] W0 = {R.attr.nestedScrollingEnabled};
    public static final float X0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean Y0;
    public static final boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    public static final boolean f1119a1;

    /* renamed from: b1, reason: collision with root package name */
    public static final Class[] f1120b1;
    public static final d c1;

    /* renamed from: d1, reason: collision with root package name */
    public static final f1 f1121d1;
    public b1 A;
    public final h1 A0;
    public final j B;
    public w B0;
    public final n9.j C;
    public final h C0;
    public final l D;
    public final e1 D0;
    public boolean E;
    public v0 E0;
    public final j0 F;
    public ArrayList F0;
    public final Rect G;
    public boolean G0;
    public final Rect H;
    public boolean H0;
    public final RectF I;
    public final c I0;
    public k0 J;
    public boolean J0;
    public s0 K;
    public k1 K0;
    public final ArrayList L;
    public final int[] L0;
    public final ArrayList M;
    public p M0;
    public final ArrayList N;
    public final int[] N0;
    public u O;
    public final int[] O0;
    public boolean P;
    public final int[] P0;
    public boolean Q;
    public final ArrayList Q0;
    public boolean R;
    public final j0 R0;
    public int S;
    public boolean S0;
    public boolean T;
    public int T0;
    public boolean U;
    public int U0;
    public boolean V;
    public final r V0;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1122a0;

    /* renamed from: b0, reason: collision with root package name */
    public final AccessibilityManager f1123b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1124c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1125d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1126e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1127f0;

    /* renamed from: g0, reason: collision with root package name */
    public n0 f1128g0;

    /* renamed from: h0, reason: collision with root package name */
    public EdgeEffect f1129h0;

    /* renamed from: i0, reason: collision with root package name */
    public EdgeEffect f1130i0;

    /* renamed from: j0, reason: collision with root package name */
    public EdgeEffect f1131j0;

    /* renamed from: k0, reason: collision with root package name */
    public EdgeEffect f1132k0;

    /* renamed from: l0, reason: collision with root package name */
    public o0 f1133l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1134m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1135n0;
    public VelocityTracker o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f1136p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1137q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f1138r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1139s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f1140t0;

    /* renamed from: u0, reason: collision with root package name */
    public u0 f1141u0;

    /* renamed from: v0, reason: collision with root package name */
    public final int f1142v0;

    /* renamed from: w0, reason: collision with root package name */
    public final int f1143w0;

    /* renamed from: x, reason: collision with root package name */
    public final float f1144x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f1145x0;

    /* renamed from: y, reason: collision with root package name */
    public final a1 f1146y;

    /* renamed from: y0, reason: collision with root package name */
    public final float f1147y0;

    /* renamed from: z, reason: collision with root package name */
    public final y0 f1148z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1149z0;

    /* JADX WARN: Type inference failed for: r0v12, types: [w4.f1, java.lang.Object] */
    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        Y0 = z10;
        Z0 = true;
        f1119a1 = true;
        Class cls = Integer.TYPE;
        f1120b1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c1 = new d(2);
        f1121d1 = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.playfy.tv.R.attr.recyclerViewStyle);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            RecyclerView E = E(viewGroup.getChildAt(i6));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    public static i1 J(View view) {
        if (view == null) {
            return null;
        }
        return ((t0) view.getLayoutParams()).f14020a;
    }

    private p getScrollingChildHelper() {
        if (this.M0 == null) {
            this.M0 = new p(this);
        }
        return this.M0;
    }

    public static void j(i1 i1Var) {
        WeakReference weakReference = i1Var.f13898b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != i1Var.f13897a) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            i1Var.f13898b = null;
        }
    }

    public static int m(int i6, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i6 > 0 && edgeEffect != null && b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int round = Math.round(b.p(edgeEffect, ((-i6) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (round != i6) {
                edgeEffect.finish();
            }
            return i6 - round;
        }
        if (i6 < 0 && edgeEffect2 != null && b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = i10;
            int round2 = Math.round(b.p(edgeEffect2, (i6 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
            if (round2 != i6) {
                edgeEffect2.finish();
            }
            return i6 - round2;
        }
        return i6;
    }

    public final void A(e1 e1Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0.f13885z;
            overScroller.getFinalX();
            overScroller.getCurrX();
            e1Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        e1Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View B(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.N
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            w4.u r5 = (w4.u) r5
            int r6 = r5.f14043v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f14044w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f14038p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f14044w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f14035m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.O = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.MotionEvent):boolean");
    }

    public final void D(int[] iArr) {
        int s = this.C.s();
        if (s == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < s; i11++) {
            i1 J = J(this.C.q(i11));
            if (!J.p()) {
                int c10 = J.c();
                if (c10 < i6) {
                    i6 = c10;
                }
                if (c10 > i10) {
                    i10 = c10;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i10;
    }

    public final i1 F(int i6) {
        i1 i1Var = null;
        if (this.f1124c0) {
            return null;
        }
        int A = this.C.A();
        for (int i10 = 0; i10 < A; i10++) {
            i1 J = J(this.C.z(i10));
            if (J != null && !J.i() && G(J) == i6) {
                if (((ArrayList) this.C.A).contains(J.f13897a)) {
                    i1Var = J;
                } else {
                    return J;
                }
            }
        }
        return i1Var;
    }

    public final int G(i1 i1Var) {
        if ((i1Var.j & 524) == 0 && i1Var.f()) {
            int i6 = i1Var.f13899c;
            ArrayList arrayList = (ArrayList) this.B.f9928e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) arrayList.get(i10);
                int i11 = aVar.f13799a;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 8) {
                            int i12 = aVar.f13800b;
                            if (i12 == i6) {
                                i6 = aVar.f13802d;
                            } else {
                                if (i12 < i6) {
                                    i6--;
                                }
                                if (aVar.f13802d <= i6) {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        int i13 = aVar.f13800b;
                        if (i13 <= i6) {
                            int i14 = aVar.f13802d;
                            if (i13 + i14 <= i6) {
                                i6 -= i14;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (aVar.f13800b <= i6) {
                    i6 += aVar.f13802d;
                }
            }
            return i6;
        }
        return -1;
    }

    public final long H(i1 i1Var) {
        if (this.J.f13930y) {
            return i1Var.f13901e;
        }
        return i1Var.f13899c;
    }

    public final i1 I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return J(view);
    }

    public final Rect K(View view) {
        t0 t0Var = (t0) view.getLayoutParams();
        boolean z10 = t0Var.f14022c;
        Rect rect = t0Var.f14021b;
        if (z10) {
            e1 e1Var = this.D0;
            if (!e1Var.f13863g || (!t0Var.f14020a.l() && !t0Var.f14020a.g())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.M;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Rect rect2 = this.G;
                    rect2.set(0, 0, 0, 0);
                    ((p0) arrayList.get(i6)).a(rect2, view, this, e1Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                t0Var.f14022c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean L() {
        if (this.R && !this.f1124c0 && !this.B.l()) {
            return false;
        }
        return true;
    }

    public final boolean M() {
        if (this.f1126e0 > 0) {
            return true;
        }
        return false;
    }

    public final void N(int i6) {
        if (this.K == null) {
            return;
        }
        setScrollState(2);
        this.K.p0(i6);
        awakenScrollBars();
    }

    public final void O() {
        int A = this.C.A();
        for (int i6 = 0; i6 < A; i6++) {
            ((t0) this.C.z(i6).getLayoutParams()).f14022c = true;
        }
        ArrayList arrayList = this.f1148z.f14076c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            t0 t0Var = (t0) ((i1) arrayList.get(i10)).f13897a.getLayoutParams();
            if (t0Var != null) {
                t0Var.f14022c = true;
            }
        }
    }

    public final void P(boolean z10, int i6, int i10) {
        int i11 = i6 + i10;
        int A = this.C.A();
        for (int i12 = 0; i12 < A; i12++) {
            i1 J = J(this.C.z(i12));
            if (J != null && !J.p()) {
                int i13 = J.f13899c;
                e1 e1Var = this.D0;
                if (i13 >= i11) {
                    J.m(-i10, z10);
                    e1Var.f13862f = true;
                } else if (i13 >= i6) {
                    J.a(8);
                    J.m(-i10, z10);
                    J.f13899c = i6 - 1;
                    e1Var.f13862f = true;
                }
            }
        }
        y0 y0Var = this.f1148z;
        ArrayList arrayList = y0Var.f14076c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i1 i1Var = (i1) arrayList.get(size);
            if (i1Var != null) {
                int i14 = i1Var.f13899c;
                if (i14 >= i11) {
                    i1Var.m(-i10, z10);
                } else if (i14 >= i6) {
                    i1Var.a(8);
                    y0Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void Q() {
        this.f1126e0++;
    }

    public final void R(boolean z10) {
        int i6;
        AccessibilityManager accessibilityManager;
        int i10 = this.f1126e0 - 1;
        this.f1126e0 = i10;
        if (i10 < 1) {
            this.f1126e0 = 0;
            if (z10) {
                int i11 = this.W;
                this.W = 0;
                if (i11 != 0 && (accessibilityManager = this.f1123b0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.Q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i1 i1Var = (i1) arrayList.get(size);
                    if (i1Var.f13897a.getParent() == this && !i1Var.p() && (i6 = i1Var.f13912q) != -1) {
                        View view = i1Var.f13897a;
                        WeakHashMap weakHashMap = q0.f12397a;
                        view.setImportantForAccessibility(i6);
                        i1Var.f13912q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void S(MotionEvent motionEvent) {
        int i6;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1135n0) {
            if (actionIndex == 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.f1135n0 = motionEvent.getPointerId(i6);
            int x10 = (int) (motionEvent.getX(i6) + 0.5f);
            this.f1138r0 = x10;
            this.f1136p0 = x10;
            int y9 = (int) (motionEvent.getY(i6) + 0.5f);
            this.f1139s0 = y9;
            this.f1137q0 = y9;
        }
    }

    public final void T() {
        if (!this.J0 && this.P) {
            WeakHashMap weakHashMap = q0.f12397a;
            postOnAnimation(this.R0);
            this.J0 = true;
        }
    }

    public final void U() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.f1124c0) {
            j jVar = this.B;
            jVar.s((ArrayList) jVar.f9928e);
            jVar.s((ArrayList) jVar.f9926c);
            jVar.f9924a = 0;
            if (this.f1125d0) {
                this.K.Z();
            }
        }
        if (this.f1133l0 != null && this.K.B0()) {
            this.B.r();
        } else {
            this.B.e();
        }
        if (!this.G0 && !this.H0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.R && this.f1133l0 != null && (((z12 = this.f1124c0) || z10 || this.K.f14009f) && (!z12 || this.J.f13930y))) {
            z11 = true;
        } else {
            z11 = false;
        }
        e1 e1Var = this.D0;
        e1Var.j = z11;
        if (z11 && z10 && !this.f1124c0 && this.f1133l0 != null && this.K.B0()) {
            z13 = true;
        }
        e1Var.f13866k = z13;
    }

    public final void V(boolean z10) {
        this.f1125d0 = z10 | this.f1125d0;
        this.f1124c0 = true;
        int A = this.C.A();
        for (int i6 = 0; i6 < A; i6++) {
            i1 J = J(this.C.z(i6));
            if (J != null && !J.p()) {
                J.a(6);
            }
        }
        O();
        y0 y0Var = this.f1148z;
        ArrayList arrayList = y0Var.f14076c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i1 i1Var = (i1) arrayList.get(i10);
            if (i1Var != null) {
                i1Var.a(6);
                i1Var.a(1024);
            }
        }
        k0 k0Var = y0Var.f14081h.J;
        if (k0Var != null && k0Var.f13930y) {
            return;
        }
        y0Var.g();
    }

    public final void W(i1 i1Var, b2.j jVar) {
        i1Var.j &= -8193;
        boolean z10 = this.D0.f13864h;
        l lVar = this.D;
        if (z10 && i1Var.l() && !i1Var.i() && !i1Var.p()) {
            ((i) lVar.f12252z).h(H(i1Var), i1Var);
        }
        v.l lVar2 = (v.l) lVar.f12251y;
        r1 r1Var = (r1) lVar2.get(i1Var);
        if (r1Var == null) {
            r1Var = r1.a();
            lVar2.put(i1Var, r1Var);
        }
        r1Var.f14001b = jVar;
        r1Var.f14000a |= 4;
    }

    public final int X(int i6, float f3) {
        float height = f3 / getHeight();
        float width = i6 / getWidth();
        EdgeEffect edgeEffect = this.f1129h0;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (edgeEffect != null && b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (canScrollHorizontally(-1)) {
                this.f1129h0.onRelease();
            } else {
                float f11 = -b.p(this.f1129h0, -width, 1.0f - height);
                if (b.l(this.f1129h0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f1129h0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f1131j0;
            if (edgeEffect2 != null && b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (canScrollHorizontally(1)) {
                    this.f1131j0.onRelease();
                } else {
                    float p10 = b.p(this.f1131j0, width, height);
                    if (b.l(this.f1131j0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.f1131j0.onRelease();
                    }
                    f10 = p10;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getWidth());
    }

    public final int Y(int i6, float f3) {
        float width = f3 / getWidth();
        float height = i6 / getHeight();
        EdgeEffect edgeEffect = this.f1130i0;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (edgeEffect != null && b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (canScrollVertically(-1)) {
                this.f1130i0.onRelease();
            } else {
                float f11 = -b.p(this.f1130i0, -height, width);
                if (b.l(this.f1130i0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f1130i0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f1132k0;
            if (edgeEffect2 != null && b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (canScrollVertically(1)) {
                    this.f1132k0.onRelease();
                } else {
                    float p10 = b.p(this.f1132k0, height, 1.0f - width);
                    if (b.l(this.f1132k0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.f1132k0.onRelease();
                    }
                    f10 = p10;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getHeight());
    }

    public final void Z(p0 p0Var) {
        boolean z10;
        s0 s0Var = this.K;
        if (s0Var != null) {
            s0Var.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.M;
        arrayList.remove(p0Var);
        if (arrayList.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        O();
        requestLayout();
    }

    public final void a0() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount > 0) {
            int itemDecorationCount2 = getItemDecorationCount();
            if (itemDecorationCount2 > 0) {
                Z((p0) this.M.get(0));
                return;
            }
            throw new IndexOutOfBoundsException(h8.c.i(itemDecorationCount2, "0 is an invalid index for size "));
        }
        throw new IndexOutOfBoundsException(h8.c.i(itemDecorationCount, "0 is an invalid index for size "));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i6, int i10) {
        s0 s0Var = this.K;
        if (s0Var != null) {
            s0Var.getClass();
        }
        super.addFocusables(arrayList, i6, i10);
    }

    public final void b0(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof t0) {
            t0 t0Var = (t0) layoutParams;
            if (!t0Var.f14022c) {
                Rect rect2 = t0Var.f14021b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        s0 s0Var = this.K;
        boolean z11 = !this.R;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s0Var.m0(this, view, this.G, z11, z10);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.o0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        k0(0);
        EdgeEffect edgeEffect = this.f1129h0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f1129h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1130i0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f1130i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1131j0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f1131j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1132k0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f1132k0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = q0.f12397a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof t0) && this.K.f((t0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        s0 s0Var = this.K;
        if (s0Var != null && s0Var.d()) {
            return this.K.j(this.D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        s0 s0Var = this.K;
        if (s0Var != null && s0Var.d()) {
            return this.K.k(this.D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        s0 s0Var = this.K;
        if (s0Var != null && s0Var.d()) {
            return this.K.l(this.D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        s0 s0Var = this.K;
        if (s0Var != null && s0Var.e()) {
            return this.K.m(this.D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        s0 s0Var = this.K;
        if (s0Var != null && s0Var.e()) {
            return this.K.n(this.D0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        s0 s0Var = this.K;
        if (s0Var != null && s0Var.e()) {
            return this.K.o(this.D0);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.d0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f10, boolean z10) {
        return getScrollingChildHelper().a(f3, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f10) {
        return getScrollingChildHelper().b(f3, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i6, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        int i10;
        super.draw(canvas);
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ((p0) arrayList.get(i11)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1129h0;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.E) {
                i10 = getPaddingBottom();
            } else {
                i10 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            EdgeEffect edgeEffect2 = this.f1129h0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.f1130i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.E) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1130i0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1131j0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.E) {
                i6 = getPaddingTop();
            } else {
                i6 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i6, -width);
            EdgeEffect edgeEffect6 = this.f1131j0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1132k0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.E) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1132k0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f1133l0 == null || arrayList.size() <= 0 || !this.f1133l0.f()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap weakHashMap = q0.f12397a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i6, int i10, int[] iArr) {
        int i11;
        int i12;
        i1 i1Var;
        i0();
        Q();
        int i13 = p0.i.f10450a;
        Trace.beginSection("RV Scroll");
        e1 e1Var = this.D0;
        A(e1Var);
        y0 y0Var = this.f1148z;
        if (i6 != 0) {
            i11 = this.K.o0(i6, y0Var, e1Var);
        } else {
            i11 = 0;
        }
        if (i10 != 0) {
            i12 = this.K.q0(i10, y0Var, e1Var);
        } else {
            i12 = 0;
        }
        Trace.endSection();
        n9.j jVar = this.C;
        int s = jVar.s();
        for (int i14 = 0; i14 < s; i14++) {
            View q9 = jVar.q(i14);
            i1 I = I(q9);
            if (I != null && (i1Var = I.f13905i) != null) {
                View view = i1Var.f13897a;
                int left = q9.getLeft();
                int top = q9.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        j0(false);
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i12;
        }
    }

    public final void f(i1 i1Var) {
        boolean z10;
        View view = i1Var.f13897a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1148z.m(I(view));
        if (i1Var.k()) {
            this.C.i(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.C.g(view, -1, true);
            return;
        }
        n9.j jVar = this.C;
        int indexOfChild = ((RecyclerView) ((a2) jVar.f9355y).f162y).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((d2.i) jVar.f9356z).M(indexOfChild);
            jVar.B(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(int i6) {
        c0 c0Var;
        if (this.U) {
            return;
        }
        setScrollState(0);
        h1 h1Var = this.A0;
        h1Var.D.removeCallbacks(h1Var);
        h1Var.f13885z.abortAnimation();
        s0 s0Var = this.K;
        if (s0Var != null && (c0Var = s0Var.f14008e) != null) {
            c0Var.i();
        }
        s0 s0Var2 = this.K;
        if (s0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            s0Var2.p0(i6);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0197, code lost:
    
        if ((r5 * r6) >= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0161, code lost:
    
        if (r7 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0182, code lost:
    
        if (r7 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(p0 p0Var) {
        s0 s0Var = this.K;
        if (s0Var != null) {
            s0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.M;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(p0Var);
        O();
        requestLayout();
    }

    public final boolean g0(EdgeEffect edgeEffect, int i6, int i10) {
        if (i6 <= 0) {
            float l10 = b.l(edgeEffect) * i10;
            float abs = Math.abs(-i6) * 0.35f;
            float f3 = this.f1144x * 0.015f;
            double log = Math.log(abs / f3);
            double d10 = X0;
            if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f3)) < l10) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        s0 s0Var = this.K;
        if (s0Var != null) {
            return s0Var.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        s0 s0Var = this.K;
        if (s0Var != null) {
            return s0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public k0 getAdapter() {
        return this.J;
    }

    @Override // android.view.View
    public int getBaseline() {
        s0 s0Var = this.K;
        if (s0Var != null) {
            s0Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        return super.getChildDrawingOrder(i6, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.E;
    }

    public k1 getCompatAccessibilityDelegate() {
        return this.K0;
    }

    public n0 getEdgeEffectFactory() {
        return this.f1128g0;
    }

    public o0 getItemAnimator() {
        return this.f1133l0;
    }

    public int getItemDecorationCount() {
        return this.M.size();
    }

    public s0 getLayoutManager() {
        return this.K;
    }

    public int getMaxFlingVelocity() {
        return this.f1143w0;
    }

    public int getMinFlingVelocity() {
        return this.f1142v0;
    }

    public long getNanoTime() {
        if (f1119a1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public u0 getOnFlingListener() {
        return this.f1141u0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1149z0;
    }

    public x0 getRecycledViewPool() {
        return this.f1148z.c();
    }

    public int getScrollState() {
        return this.f1134m0;
    }

    public final void h(v0 v0Var) {
        if (this.F0 == null) {
            this.F0 = new ArrayList();
        }
        this.F0.add(v0Var);
    }

    public final void h0(boolean z10, int i6, int i10) {
        s0 s0Var = this.K;
        if (s0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.U) {
            int i11 = 0;
            if (!s0Var.d()) {
                i6 = 0;
            }
            if (!this.K.e()) {
                i10 = 0;
            }
            if (i6 == 0 && i10 == 0) {
                return;
            }
            if (z10) {
                if (i6 != 0) {
                    i11 = 1;
                }
                if (i10 != 0) {
                    i11 |= 2;
                }
                getScrollingChildHelper().g(i11, 1);
            }
            this.A0.c(i6, i10, Integer.MIN_VALUE, null);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (M()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + z());
            }
            throw new IllegalStateException(str);
        }
        if (this.f1127f0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(HttpUrl.FRAGMENT_ENCODE_SET + z()));
        }
    }

    public final void i0() {
        int i6 = this.S + 1;
        this.S = i6;
        if (i6 == 1 && !this.U) {
            this.T = false;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.P;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.U;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f12388d;
    }

    public final void j0(boolean z10) {
        if (this.S < 1) {
            this.S = 1;
        }
        if (!z10 && !this.U) {
            this.T = false;
        }
        if (this.S == 1) {
            if (z10 && this.T && !this.U && this.K != null && this.J != null) {
                p();
            }
            if (!this.U) {
                this.T = false;
            }
        }
        this.S--;
    }

    public final void k() {
        int A = this.C.A();
        for (int i6 = 0; i6 < A; i6++) {
            i1 J = J(this.C.z(i6));
            if (!J.p()) {
                J.f13900d = -1;
                J.f13903g = -1;
            }
        }
        y0 y0Var = this.f1148z;
        ArrayList arrayList = y0Var.f14074a;
        ArrayList arrayList2 = y0Var.f14076c;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            i1 i1Var = (i1) arrayList2.get(i10);
            i1Var.f13900d = -1;
            i1Var.f13903g = -1;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            i1 i1Var2 = (i1) arrayList.get(i11);
            i1Var2.f13900d = -1;
            i1Var2.f13903g = -1;
        }
        ArrayList arrayList3 = y0Var.f14075b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                i1 i1Var3 = (i1) y0Var.f14075b.get(i12);
                i1Var3.f13900d = -1;
                i1Var3.f13903g = -1;
            }
        }
    }

    public final void k0(int i6) {
        getScrollingChildHelper().h(i6);
    }

    public final void l(int i6, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1129h0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i6 > 0) {
            this.f1129h0.onRelease();
            z10 = this.f1129h0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1131j0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.f1131j0.onRelease();
            z10 |= this.f1131j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1130i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f1130i0.onRelease();
            z10 |= this.f1130i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1132k0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f1132k0.onRelease();
            z10 |= this.f1132k0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = q0.f12397a;
            postInvalidateOnAnimation();
        }
    }

    public final void n() {
        if (this.R && !this.f1124c0) {
            j jVar = this.B;
            if (jVar.l()) {
                int i6 = jVar.f9924a;
                if ((i6 & 4) != 0 && (i6 & 11) == 0) {
                    int i10 = p0.i.f10450a;
                    Trace.beginSection("RV PartialInvalidate");
                    i0();
                    Q();
                    jVar.r();
                    if (!this.T) {
                        n9.j jVar2 = this.C;
                        int s = jVar2.s();
                        int i11 = 0;
                        while (true) {
                            if (i11 < s) {
                                i1 J = J(jVar2.q(i11));
                                if (J != null && !J.p() && J.l()) {
                                    p();
                                    break;
                                }
                                i11++;
                            } else {
                                jVar.d();
                                break;
                            }
                        }
                    }
                    j0(true);
                    R(true);
                    Trace.endSection();
                    return;
                }
                if (jVar.l()) {
                    int i12 = p0.i.f10450a;
                    Trace.beginSection("RV FullInvalidate");
                    p();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i13 = p0.i.f10450a;
        Trace.beginSection("RV FullInvalidate");
        p();
        Trace.endSection();
    }

    public final void o(int i6, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = q0.f12397a;
        setMeasuredDimension(s0.g(i6, paddingRight, getMinimumWidth()), s0.g(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [w4.w, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1126e0 = r0
            r1 = 1
            r5.P = r1
            boolean r2 = r5.R
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5.R = r2
            w4.y0 r2 = r5.f1148z
            r2.e()
            w4.s0 r2 = r5.K
            if (r2 == 0) goto L26
            r2.f14010g = r1
            r2.R(r5)
        L26:
            r5.J0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f1119a1
            if (r0 == 0) goto L7b
            java.lang.ThreadLocal r0 = w4.w.B
            java.lang.Object r1 = r0.get()
            w4.w r1 = (w4.w) r1
            r5.B0 = r1
            if (r1 != 0) goto L74
            w4.w r1 = new w4.w
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f14053x = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.A = r2
            r5.B0 = r1
            java.util.WeakHashMap r1 = t0.q0.f12397a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            w4.w r2 = r5.B0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f14055z = r3
            r0.set(r2)
        L74:
            w4.w r0 = r5.B0
            java.util.ArrayList r0 = r0.f14053x
            r0.add(r5)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar;
        c0 c0Var;
        super.onDetachedFromWindow();
        o0 o0Var = this.f1133l0;
        if (o0Var != null) {
            o0Var.e();
        }
        int i6 = 0;
        setScrollState(0);
        h1 h1Var = this.A0;
        h1Var.D.removeCallbacks(h1Var);
        h1Var.f13885z.abortAnimation();
        s0 s0Var = this.K;
        if (s0Var != null && (c0Var = s0Var.f14008e) != null) {
            c0Var.i();
        }
        this.P = false;
        s0 s0Var2 = this.K;
        if (s0Var2 != null) {
            s0Var2.f14010g = false;
            s0Var2.S(this);
        }
        this.Q0.clear();
        removeCallbacks(this.R0);
        this.D.getClass();
        do {
        } while (r1.f13999d.a() != null);
        y0 y0Var = this.f1148z;
        ArrayList arrayList = y0Var.f14076c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e.e(((i1) arrayList.get(i10)).f13897a);
        }
        y0Var.f(y0Var.f14081h.J, false);
        while (i6 < getChildCount()) {
            int i11 = i6 + 1;
            View childAt = getChildAt(i6);
            if (childAt != null) {
                y0.a aVar = (y0.a) childAt.getTag(com.playfy.tv.R.id.pooling_container_listener_holder_tag);
                if (aVar == null) {
                    aVar = new y0.a();
                    childAt.setTag(com.playfy.tv.R.id.pooling_container_listener_holder_tag, aVar);
                }
                ArrayList arrayList2 = aVar.f14798a;
                int s = k.s(arrayList2);
                if (-1 >= s) {
                    i6 = i11;
                } else {
                    throw h8.c.h(s, arrayList2);
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (f1119a1 && (wVar = this.B0) != null) {
            wVar.f14053x.remove(this);
            this.B0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((p0) arrayList.get(i6)).b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.U) {
            this.O = null;
            if (C(motionEvent)) {
                c0();
                setScrollState(0);
                return true;
            }
            s0 s0Var = this.K;
            if (s0Var != null) {
                boolean d10 = s0Var.d();
                boolean e10 = this.K.e();
                if (this.o0 == null) {
                    this.o0 = VelocityTracker.obtain();
                }
                this.o0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        S(motionEvent);
                                    }
                                } else {
                                    this.f1135n0 = motionEvent.getPointerId(actionIndex);
                                    int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.f1138r0 = x10;
                                    this.f1136p0 = x10;
                                    int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.f1139s0 = y9;
                                    this.f1137q0 = y9;
                                }
                            } else {
                                c0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f1135n0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1135n0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.f1134m0 != 1) {
                                int i6 = x11 - this.f1136p0;
                                int i10 = y10 - this.f1137q0;
                                if (d10 != 0 && Math.abs(i6) > this.f1140t0) {
                                    this.f1138r0 = x11;
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (e10 && Math.abs(i10) > this.f1140t0) {
                                    this.f1139s0 = y10;
                                    z11 = true;
                                }
                                if (z11) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.o0.clear();
                        k0(0);
                    }
                } else {
                    if (this.V) {
                        this.V = false;
                    }
                    this.f1135n0 = motionEvent.getPointerId(0);
                    int x12 = (int) (motionEvent.getX() + 0.5f);
                    this.f1138r0 = x12;
                    this.f1136p0 = x12;
                    int y11 = (int) (motionEvent.getY() + 0.5f);
                    this.f1139s0 = y11;
                    this.f1137q0 = y11;
                    EdgeEffect edgeEffect = this.f1129h0;
                    if (edgeEffect != null && b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(-1)) {
                        b.p(this.f1129h0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    EdgeEffect edgeEffect2 = this.f1131j0;
                    if (edgeEffect2 != null && b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(1)) {
                        b.p(this.f1131j0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, motionEvent.getY() / getHeight());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f1130i0;
                    if (edgeEffect3 != null && b.l(edgeEffect3) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(-1)) {
                        b.p(this.f1130i0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, motionEvent.getX() / getWidth());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f1132k0;
                    if (edgeEffect4 != null && b.l(edgeEffect4) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(1)) {
                        b.p(this.f1132k0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - (motionEvent.getX() / getWidth()));
                        z10 = true;
                    }
                    if (z10 || this.f1134m0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        k0(1);
                    }
                    int[] iArr = this.O0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i11 = d10;
                    if (e10) {
                        i11 = (d10 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i11, 0);
                }
                if (this.f1134m0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13 = p0.i.f10450a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.R = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        s0 s0Var = this.K;
        if (s0Var == null) {
            o(i6, i10);
            return;
        }
        boolean L = s0Var.L();
        boolean z10 = false;
        e1 e1Var = this.D0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.K.f14005b.o(i6, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.S0 = z10;
            if (!z10 && this.J != null) {
                if (e1Var.f13860d == 1) {
                    q();
                }
                this.K.s0(i6, i10);
                e1Var.f13865i = true;
                r();
                this.K.u0(i6, i10);
                if (this.K.x0()) {
                    this.K.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    e1Var.f13865i = true;
                    r();
                    this.K.u0(i6, i10);
                }
                this.T0 = getMeasuredWidth();
                this.U0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.Q) {
            this.K.f14005b.o(i6, i10);
            return;
        }
        if (this.f1122a0) {
            i0();
            Q();
            U();
            R(true);
            if (e1Var.f13866k) {
                e1Var.f13863g = true;
            } else {
                this.B.e();
                e1Var.f13863g = false;
            }
            this.f1122a0 = false;
            j0(false);
        } else if (e1Var.f13866k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        k0 k0Var = this.J;
        if (k0Var != null) {
            e1Var.f13861e = k0Var.a();
        } else {
            e1Var.f13861e = 0;
        }
        i0();
        this.K.f14005b.o(i6, i10);
        j0(false);
        e1Var.f13863g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b1 b1Var = (b1) parcelable;
        this.A = b1Var;
        super.onRestoreInstanceState(b1Var.f15113x);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.b, android.os.Parcelable, w4.b1] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new z0.b(super.onSaveInstanceState());
        b1 b1Var = this.A;
        if (b1Var != null) {
            bVar.f13821z = b1Var.f13821z;
            return bVar;
        }
        s0 s0Var = this.K;
        if (s0Var != null) {
            bVar.f13821z = s0Var.g0();
            return bVar;
        }
        bVar.f13821z = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i6 == i11 && i10 == i12) {
            return;
        }
        this.f1132k0 = null;
        this.f1130i0 = null;
        this.f1131j0 = null;
        this.f1129h0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x03a9, code lost:
    
        if (r3 == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04c7, code lost:
    
        if (r2 < r5) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0357, code lost:
    
        if (((java.util.ArrayList) r21.C.A).contains(getFocusedChild()) == false) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0403  */
    /* JADX WARN: Type inference failed for: r13v8, types: [b2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [s8.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5, types: [b2.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [b2.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public final void r() {
        boolean z10;
        i0();
        Q();
        e1 e1Var = this.D0;
        e1Var.a(6);
        this.B.e();
        e1Var.f13861e = this.J.a();
        e1Var.f13859c = 0;
        if (this.A != null) {
            k0 k0Var = this.J;
            int c10 = y.e.c(k0Var.f13931z);
            if (c10 == 1 ? k0Var.a() > 0 : c10 != 2) {
                Parcelable parcelable = this.A.f13821z;
                if (parcelable != null) {
                    this.K.f0(parcelable);
                }
                this.A = null;
            }
        }
        e1Var.f13863g = false;
        this.K.d0(this.f1148z, e1Var);
        e1Var.f13862f = false;
        if (e1Var.j && this.f1133l0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e1Var.j = z10;
        e1Var.f13860d = 4;
        R(true);
        j0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        i1 J = J(view);
        if (J != null) {
            if (J.k()) {
                J.j &= -257;
            } else if (!J.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J + z());
            }
        }
        view.clearAnimation();
        J(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        c0 c0Var = this.K.f14008e;
        if ((c0Var == null || !c0Var.f13827e) && !M() && view2 != null) {
            b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.K.m0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u) arrayList.get(i6)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S == 0 && !this.U) {
            super.requestLayout();
        } else {
            this.T = true;
        }
    }

    public final boolean s(int i6, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i6, int i10) {
        s0 s0Var = this.K;
        if (s0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.U) {
            boolean d10 = s0Var.d();
            boolean e10 = this.K.e();
            if (!d10 && !e10) {
                return;
            }
            if (!d10) {
                i6 = 0;
            }
            if (!e10) {
                i10 = 0;
            }
            d0(i6, i10, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i6;
        if (M()) {
            int i10 = 0;
            if (accessibilityEvent != null) {
                i6 = accessibilityEvent.getContentChangeTypes();
            } else {
                i6 = 0;
            }
            if (i6 != 0) {
                i10 = i6;
            }
            this.W |= i10;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(k1 k1Var) {
        this.K0 = k1Var;
        q0.r(this, k1Var);
    }

    public void setAdapter(k0 k0Var) {
        setLayoutFrozen(false);
        k0 k0Var2 = this.J;
        a1 a1Var = this.f1146y;
        if (k0Var2 != null) {
            k0Var2.f13929x.unregisterObserver(a1Var);
            this.J.getClass();
        }
        o0 o0Var = this.f1133l0;
        if (o0Var != null) {
            o0Var.e();
        }
        s0 s0Var = this.K;
        y0 y0Var = this.f1148z;
        if (s0Var != null) {
            s0Var.i0(y0Var);
            this.K.j0(y0Var);
        }
        y0Var.f14074a.clear();
        y0Var.g();
        j jVar = this.B;
        jVar.s((ArrayList) jVar.f9928e);
        jVar.s((ArrayList) jVar.f9926c);
        jVar.f9924a = 0;
        k0 k0Var3 = this.J;
        this.J = k0Var;
        if (k0Var != null) {
            k0Var.f13929x.registerObserver(a1Var);
        }
        s0 s0Var2 = this.K;
        if (s0Var2 != null) {
            s0Var2.Q();
        }
        k0 k0Var4 = this.J;
        y0Var.f14074a.clear();
        y0Var.g();
        y0Var.f(k0Var3, true);
        x0 c10 = y0Var.c();
        if (k0Var3 != null) {
            c10.f14063b--;
        }
        if (c10.f14063b == 0) {
            SparseArray sparseArray = c10.f14062a;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                w0 w0Var = (w0) sparseArray.valueAt(i6);
                ArrayList arrayList = w0Var.f14056a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    e.e(((i1) obj).f13897a);
                }
                w0Var.f14056a.clear();
            }
        }
        if (k0Var4 != null) {
            c10.f14063b++;
        }
        y0Var.e();
        this.D0.f13862f = true;
        V(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(m0 m0Var) {
        if (m0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.E) {
            this.f1132k0 = null;
            this.f1130i0 = null;
            this.f1131j0 = null;
            this.f1129h0 = null;
        }
        this.E = z10;
        super.setClipToPadding(z10);
        if (this.R) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(n0 n0Var) {
        n0Var.getClass();
        this.f1128g0 = n0Var;
        this.f1132k0 = null;
        this.f1130i0 = null;
        this.f1131j0 = null;
        this.f1129h0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.Q = z10;
    }

    public void setItemAnimator(o0 o0Var) {
        o0 o0Var2 = this.f1133l0;
        if (o0Var2 != null) {
            o0Var2.e();
            this.f1133l0.f13970a = null;
        }
        this.f1133l0 = o0Var;
        if (o0Var != null) {
            o0Var.f13970a = this.I0;
        }
    }

    public void setItemViewCacheSize(int i6) {
        y0 y0Var = this.f1148z;
        y0Var.f14078e = i6;
        y0Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(s0 s0Var) {
        c0 c0Var;
        if (s0Var == this.K) {
            return;
        }
        setScrollState(0);
        h1 h1Var = this.A0;
        h1Var.D.removeCallbacks(h1Var);
        h1Var.f13885z.abortAnimation();
        s0 s0Var2 = this.K;
        if (s0Var2 != null && (c0Var = s0Var2.f14008e) != null) {
            c0Var.i();
        }
        s0 s0Var3 = this.K;
        y0 y0Var = this.f1148z;
        if (s0Var3 != null) {
            o0 o0Var = this.f1133l0;
            if (o0Var != null) {
                o0Var.e();
            }
            this.K.i0(y0Var);
            this.K.j0(y0Var);
            y0Var.f14074a.clear();
            y0Var.g();
            if (this.P) {
                s0 s0Var4 = this.K;
                s0Var4.f14010g = false;
                s0Var4.S(this);
            }
            this.K.v0(null);
            this.K = null;
        } else {
            y0Var.f14074a.clear();
            y0Var.g();
        }
        n9.j jVar = this.C;
        RecyclerView recyclerView = (RecyclerView) ((a2) jVar.f9355y).f162y;
        ((d2.i) jVar.f9356z).L();
        ArrayList arrayList = (ArrayList) jVar.A;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i1 J = J((View) arrayList.get(size));
            if (J != null) {
                int i6 = J.f13911p;
                if (recyclerView.M()) {
                    J.f13912q = i6;
                    recyclerView.Q0.add(J);
                } else {
                    View view = J.f13897a;
                    WeakHashMap weakHashMap = q0.f12397a;
                    view.setImportantForAccessibility(i6);
                }
                J.f13911p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            J(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.K = s0Var;
        if (s0Var != null) {
            if (s0Var.f14005b == null) {
                s0Var.v0(this);
                if (this.P) {
                    s0 s0Var5 = this.K;
                    s0Var5.f14010g = true;
                    s0Var5.R(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + s0Var + " is already attached to a RecyclerView:" + s0Var.f14005b.z());
            }
        }
        y0Var.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f12388d) {
            ViewGroup viewGroup = scrollingChildHelper.f12387c;
            WeakHashMap weakHashMap = q0.f12397a;
            h0.m(viewGroup);
        }
        scrollingChildHelper.f12388d = z10;
    }

    public void setOnFlingListener(u0 u0Var) {
        this.f1141u0 = u0Var;
    }

    @Deprecated
    public void setOnScrollListener(v0 v0Var) {
        this.E0 = v0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f1149z0 = z10;
    }

    public void setRecycledViewPool(x0 x0Var) {
        y0 y0Var = this.f1148z;
        RecyclerView recyclerView = y0Var.f14081h;
        y0Var.f(recyclerView.J, false);
        if (y0Var.f14080g != null) {
            r2.f14063b--;
        }
        y0Var.f14080g = x0Var;
        if (x0Var != null && recyclerView.getAdapter() != null) {
            y0Var.f14080g.f14063b++;
        }
        y0Var.e();
    }

    public void setScrollState(int i6) {
        c0 c0Var;
        if (i6 != this.f1134m0) {
            this.f1134m0 = i6;
            if (i6 != 2) {
                h1 h1Var = this.A0;
                h1Var.D.removeCallbacks(h1Var);
                h1Var.f13885z.abortAnimation();
                s0 s0Var = this.K;
                if (s0Var != null && (c0Var = s0Var.f14008e) != null) {
                    c0Var.i();
                }
            }
            s0 s0Var2 = this.K;
            if (s0Var2 != null) {
                s0Var2.h0(i6);
            }
            v0 v0Var = this.E0;
            if (v0Var != null) {
                v0Var.a(this, i6);
            }
            ArrayList arrayList = this.F0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((v0) this.F0.get(size)).a(this, i6);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i6) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 != 0) {
            if (i6 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
            } else {
                this.f1140t0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f1140t0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(g1 g1Var) {
        this.f1148z.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().g(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        c0 c0Var;
        if (z10 != this.U) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.U = false;
                if (this.T && this.K != null && this.J != null) {
                    requestLayout();
                }
                this.T = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
            this.U = true;
            this.V = true;
            setScrollState(0);
            h1 h1Var = this.A0;
            h1Var.D.removeCallbacks(h1Var);
            h1Var.f13885z.abortAnimation();
            s0 s0Var = this.K;
            if (s0Var != null && (c0Var = s0Var.f14008e) != null) {
                c0Var.i();
            }
        }
    }

    public final void t(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i6, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void u(int i6, int i10) {
        this.f1127f0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i10);
        v0 v0Var = this.E0;
        if (v0Var != null) {
            v0Var.b(this, i6, i10);
        }
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v0) this.F0.get(size)).b(this, i6, i10);
            }
        }
        this.f1127f0--;
    }

    public final void v() {
        if (this.f1132k0 != null) {
            return;
        }
        ((f1) this.f1128g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1132k0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void w() {
        if (this.f1129h0 != null) {
            return;
        }
        ((f1) this.f1128g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1129h0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1131j0 != null) {
            return;
        }
        ((f1) this.f1128g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1131j0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.f1130i0 != null) {
            return;
        }
        ((f1) this.f1128g0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1130i0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.J + ", layout:" + this.K + ", context:" + getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [w4.o0, java.lang.Object, w4.m] */
    /* JADX WARN: Type inference failed for: r3v18, types: [w4.e1, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        float a10;
        float a11;
        TypedArray typedArray;
        int i10;
        char c10;
        char c11;
        char c12;
        ClassLoader classLoader;
        Constructor constructor;
        this.f1146y = new a1(this);
        this.f1148z = new y0(this);
        this.D = new l(21);
        this.F = new j0(this, 0);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new RectF();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.S = 0;
        this.f1124c0 = false;
        this.f1125d0 = false;
        this.f1126e0 = 0;
        this.f1127f0 = 0;
        this.f1128g0 = f1121d1;
        ?? obj = new Object();
        Object[] objArr = null;
        obj.f13970a = null;
        obj.f13971b = new ArrayList();
        obj.f13972c = 120L;
        obj.f13973d = 120L;
        obj.f13974e = 250L;
        obj.f13975f = 250L;
        int i11 = 1;
        obj.f13941g = true;
        obj.f13942h = new ArrayList();
        obj.f13943i = new ArrayList();
        obj.j = new ArrayList();
        obj.f13944k = new ArrayList();
        obj.f13945l = new ArrayList();
        obj.f13946m = new ArrayList();
        obj.f13947n = new ArrayList();
        obj.f13948o = new ArrayList();
        obj.f13949p = new ArrayList();
        obj.f13950q = new ArrayList();
        obj.f13951r = new ArrayList();
        this.f1133l0 = obj;
        this.f1134m0 = 0;
        this.f1135n0 = -1;
        this.f1145x0 = Float.MIN_VALUE;
        this.f1147y0 = Float.MIN_VALUE;
        this.f1149z0 = true;
        this.A0 = new h1(this);
        this.C0 = f1119a1 ? new Object() : null;
        ?? obj2 = new Object();
        obj2.f13857a = -1;
        obj2.f13858b = 0;
        obj2.f13859c = 0;
        obj2.f13860d = 1;
        obj2.f13861e = 0;
        obj2.f13862f = false;
        obj2.f13863g = false;
        obj2.f13864h = false;
        obj2.f13865i = false;
        obj2.j = false;
        obj2.f13866k = false;
        this.D0 = obj2;
        this.G0 = false;
        this.H0 = false;
        c cVar = new c(this);
        this.I0 = cVar;
        this.J0 = false;
        this.L0 = new int[2];
        this.N0 = new int[2];
        this.O0 = new int[2];
        this.P0 = new int[2];
        this.Q0 = new ArrayList();
        this.R0 = new j0(this, i11);
        this.T0 = 0;
        this.U0 = 0;
        int i12 = 29;
        this.V0 = new r(this, i12);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1140t0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = r0.f12405a;
            a10 = jd.u.b(viewConfiguration);
        } else {
            a10 = r0.a(viewConfiguration, context);
        }
        this.f1145x0 = a10;
        if (i13 >= 26) {
            a11 = jd.u.c(viewConfiguration);
        } else {
            a11 = r0.a(viewConfiguration, context);
        }
        this.f1147y0 = a11;
        this.f1142v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1143w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1144x = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1133l0.f13970a = cVar;
        this.B = new j(new v9.b(this));
        this.C = new n9.j(new a2(this, i12));
        WeakHashMap weakHashMap = q0.f12397a;
        if ((i13 >= 26 ? t0.k0.a(this) : 0) == 0 && i13 >= 26) {
            t0.k0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1123b0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k1(this));
        int[] iArr = v4.a.f13294a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        q0.q(this, context, iArr, attributeSet, obtainStyledAttributes, i6);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.E = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c10 = 3;
                c11 = 2;
                c12 = 1;
                typedArray = obtainStyledAttributes;
                i10 = 4;
                new u(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.playfy.tv.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.playfy.tv.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.playfy.tv.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + z());
            }
        } else {
            typedArray = obtainStyledAttributes;
            i10 = 4;
            c10 = 3;
            c11 = 2;
            c12 = 1;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(s0.class);
                    try {
                        constructor = asSubclass.getConstructor(f1120b1);
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = context;
                        objArr2[c12] = attributeSet;
                        objArr2[c11] = Integer.valueOf(i6);
                        objArr2[c10] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((s0) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = W0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i6, 0);
        q0.q(this, context, iArr2, attributeSet, obtainStyledAttributes2, i6);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.playfy.tv.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        s0 s0Var = this.K;
        if (s0Var != null) {
            return s0Var.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Deprecated
    public void setRecyclerListener(z0 z0Var) {
    }
}
