package w4;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13823a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f13824b;

    /* renamed from: c, reason: collision with root package name */
    public s0 f13825c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13826d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13827e;

    /* renamed from: f, reason: collision with root package name */
    public View f13828f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f13829g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13830h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f13831i;
    public final DecelerateInterpolator j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f13832k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f13833l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13834m;

    /* renamed from: n, reason: collision with root package name */
    public float f13835n;

    /* renamed from: o, reason: collision with root package name */
    public int f13836o;

    /* renamed from: p, reason: collision with root package name */
    public int f13837p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w4.c1] */
    public c0(Context context) {
        ?? obj = new Object();
        obj.f13841d = -1;
        obj.f13843f = false;
        obj.f13844g = 0;
        obj.f13838a = 0;
        obj.f13839b = 0;
        obj.f13840c = Integer.MIN_VALUE;
        obj.f13842e = null;
        this.f13829g = obj;
        this.f13831i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f13834m = false;
        this.f13836o = 0;
        this.f13837p = 0;
        this.f13833l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i6, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i14 = i11 - i6;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i6;
    }

    public int b(View view, int i6) {
        s0 s0Var = this.f13825c;
        if (s0Var != null && s0Var.d()) {
            t0 t0Var = (t0) view.getLayoutParams();
            return a((view.getLeft() - ((t0) view.getLayoutParams()).f14021b.left) - ((ViewGroup.MarginLayoutParams) t0Var).leftMargin, view.getRight() + ((t0) view.getLayoutParams()).f14021b.right + ((ViewGroup.MarginLayoutParams) t0Var).rightMargin, s0Var.E(), s0Var.f14016n - s0Var.F(), i6);
        }
        return 0;
    }

    public int c(View view, int i6) {
        s0 s0Var = this.f13825c;
        if (s0Var != null && s0Var.e()) {
            t0 t0Var = (t0) view.getLayoutParams();
            return a((view.getTop() - ((t0) view.getLayoutParams()).f14021b.top) - ((ViewGroup.MarginLayoutParams) t0Var).topMargin, view.getBottom() + ((t0) view.getLayoutParams()).f14021b.bottom + ((ViewGroup.MarginLayoutParams) t0Var).bottomMargin, s0Var.G(), s0Var.f14017o - s0Var.D(), i6);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i6) {
        float abs = Math.abs(i6);
        if (!this.f13834m) {
            this.f13835n = d(this.f13833l);
            this.f13834m = true;
        }
        return (int) Math.ceil(abs * this.f13835n);
    }

    public PointF f(int i6) {
        Object obj = this.f13825c;
        if (obj instanceof d1) {
            return ((d1) obj).a(i6);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d1.class.getCanonicalName());
        return null;
    }

    public final void g(int i6, int i10) {
        PointF f3;
        RecyclerView recyclerView = this.f13824b;
        int i11 = -1;
        if (this.f13823a == -1 || recyclerView == null) {
            i();
        }
        if (this.f13826d && this.f13828f == null && this.f13825c != null && (f3 = f(this.f13823a)) != null) {
            float f10 = f3.x;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                recyclerView.e0((int) Math.signum(f10), (int) Math.signum(f3.y), null);
            }
        }
        boolean z10 = false;
        this.f13826d = false;
        View view = this.f13828f;
        c1 c1Var = this.f13829g;
        if (view != null) {
            this.f13824b.getClass();
            i1 J = RecyclerView.J(view);
            if (J != null) {
                i11 = J.c();
            }
            if (i11 == this.f13823a) {
                View view2 = this.f13828f;
                e1 e1Var = recyclerView.D0;
                h(view2, c1Var);
                c1Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f13828f = null;
            }
        }
        if (this.f13827e) {
            e1 e1Var2 = recyclerView.D0;
            if (this.f13824b.K.v() == 0) {
                i();
            } else {
                int i12 = this.f13836o;
                int i13 = i12 - i6;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f13836o = i13;
                int i14 = this.f13837p;
                int i15 = i14 - i10;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f13837p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF f11 = f(this.f13823a);
                    if (f11 != null) {
                        if (f11.x != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f12 = f11.y;
                            float sqrt = (float) Math.sqrt((f12 * f12) + (r10 * r10));
                            float f13 = f11.x / sqrt;
                            f11.x = f13;
                            float f14 = f11.y / sqrt;
                            f11.y = f14;
                            this.f13832k = f11;
                            this.f13836o = (int) (f13 * 10000.0f);
                            this.f13837p = (int) (f14 * 10000.0f);
                            int e10 = e(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                            c1Var.f13838a = (int) (this.f13836o * 1.2f);
                            c1Var.f13839b = (int) (this.f13837p * 1.2f);
                            c1Var.f13840c = (int) (e10 * 1.2f);
                            c1Var.f13842e = this.f13831i;
                            c1Var.f13843f = true;
                        }
                    }
                    c1Var.f13841d = this.f13823a;
                    i();
                }
            }
            if (c1Var.f13841d >= 0) {
                z10 = true;
            }
            c1Var.a(recyclerView);
            if (z10 && this.f13827e) {
                this.f13826d = true;
                recyclerView.A0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r7, w4.c1 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f13832k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = 1
            goto L16
        L13:
            r0 = -1
            goto L16
        L15:
            r0 = 0
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f13832k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = -1
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f13838a = r0
            r8.f13839b = r7
            r8.f13840c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.j
            r8.f13842e = r7
            r8.f13843f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c0.h(android.view.View, w4.c1):void");
    }

    public final void i() {
        if (!this.f13827e) {
            return;
        }
        this.f13827e = false;
        this.f13837p = 0;
        this.f13836o = 0;
        this.f13832k = null;
        this.f13824b.D0.f13857a = -1;
        this.f13828f = null;
        this.f13823a = -1;
        this.f13826d = false;
        s0 s0Var = this.f13825c;
        if (s0Var.f14008e == this) {
            s0Var.f14008e = null;
        }
        this.f13825c = null;
        this.f13824b = null;
    }
}
