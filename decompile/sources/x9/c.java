package x9;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends a8.a {

    /* renamed from: f, reason: collision with root package name */
    public int f14697f;

    /* renamed from: g, reason: collision with root package name */
    public int f14698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f14699h;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        super(1);
        this.f14699h = swipeDismissBehavior;
        this.f14698g = -1;
    }

    @Override // a8.a
    public final int c(View view, int i6) {
        boolean z10;
        int width;
        int width2;
        int width3;
        if (view.getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f14699h.f2603d;
        if (i10 == 0) {
            if (z10) {
                width = this.f14697f - view.getWidth();
                width2 = this.f14697f;
            } else {
                width = this.f14697f;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 == 1) {
            if (z10) {
                width = this.f14697f;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f14697f - view.getWidth();
                width2 = this.f14697f;
            }
        } else {
            width = this.f14697f - view.getWidth();
            width2 = view.getWidth() + this.f14697f;
        }
        return Math.min(Math.max(width, i6), width2);
    }

    @Override // a8.a
    public final int d(View view, int i6) {
        return view.getTop();
    }

    @Override // a8.a
    public final int m(View view) {
        return view.getWidth();
    }

    @Override // a8.a
    public final void p(View view, int i6) {
        this.f14698g = i6;
        this.f14697f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f14699h;
            swipeDismissBehavior.f2602c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2602c = false;
        }
    }

    @Override // a8.a
    public final void r(View view, int i6, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f14699h;
        float f3 = width * swipeDismissBehavior.f2604e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2605f;
        float abs = Math.abs(i6 - this.f14697f);
        if (abs <= f3) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - ((abs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f14697f) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // a8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f14698g = r11
            int r11 = r9.getWidth()
            r0 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r1 = r8.f14699h
            r2 = 1
            r3 = 0
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            int r6 = r1.f2603d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L51
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 >= 0) goto L65
            goto L51
        L28:
            if (r4 <= 0) goto L65
            goto L51
        L2b:
            if (r6 != r2) goto L65
            if (r5 == 0) goto L32
            if (r4 <= 0) goto L65
            goto L51
        L32:
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 >= 0) goto L65
            goto L51
        L37:
            int r4 = r9.getLeft()
            int r5 = r8.f14697f
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L65
        L51:
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 < 0) goto L60
            int r10 = r9.getLeft()
            int r0 = r8.f14697f
            if (r10 >= r0) goto L5e
            goto L60
        L5e:
            int r0 = r0 + r11
            goto L69
        L60:
            int r10 = r8.f14697f
            int r0 = r10 - r11
            goto L69
        L65:
            int r10 = r8.f14697f
            r0 = r10
            r2 = 0
        L69:
            a1.f r10 = r1.f2600a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7d
            rb.i r10 = new rb.i
            r10.<init>(r1, r9, r2)
            r9.postOnAnimation(r10)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.c.s(android.view.View, float, float):void");
    }

    @Override // a8.a
    public final boolean u(View view, int i6) {
        int i10 = this.f14698g;
        if ((i10 == -1 || i10 == i6) && this.f14699h.s(view)) {
            return true;
        }
        return false;
    }

    @Override // a8.a
    public final void q(int i6) {
    }
}
