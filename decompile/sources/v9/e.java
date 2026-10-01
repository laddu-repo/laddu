package v9;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import com.unity3d.services.UnityAdsConstants;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f13490c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f13491d;

    /* renamed from: e, reason: collision with root package name */
    public int f13492e;

    /* renamed from: f, reason: collision with root package name */
    public int f13493f;

    public e() {
        this.f13490c = new Rect();
        this.f13491d = new Rect();
        this.f13492e = 0;
    }

    @Override // f0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11) {
        AppBarLayout v10;
        int i12;
        w1 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 == -1 || i13 == -2) && (v10 = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.k(view))) != null) {
            int size = View.MeasureSpec.getSize(i11);
            if (size > 0) {
                if (v10.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int totalScrollRange = v10.getTotalScrollRange() + size;
            int measuredHeight = v10.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                totalScrollRange -= measuredHeight;
            }
            if (i13 == -1) {
                i12 = 1073741824;
            } else {
                i12 = Integer.MIN_VALUE;
            }
            coordinatorLayout.s(view, i6, i10, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i12));
            return true;
        }
        return false;
    }

    @Override // v9.f
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i6) {
        int i10;
        AppBarLayout v10 = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.k(view));
        if (v10 != null) {
            f0.e eVar = (f0.e) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int bottom = v10.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int bottom2 = ((v10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            Rect rect = this.f13490c;
            rect.set(paddingLeft, bottom, width, bottom2);
            w1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
            int i11 = eVar.f4613c;
            if (i11 == 0) {
                i10 = 8388659;
            } else {
                i10 = i11;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.f13491d;
            Gravity.apply(i10, measuredWidth, measuredHeight, rect, rect2, i6);
            int u3 = u(v10);
            view.layout(rect2.left, rect2.top - u3, rect2.right, rect2.bottom - u3);
            this.f13492e = rect2.top - v10.getBottom();
            return;
        }
        coordinatorLayout.r(view, i6);
        this.f13492e = 0;
    }

    public final int u(View view) {
        int i6;
        int i10;
        if (this.f13493f == 0) {
            return 0;
        }
        boolean z10 = view instanceof AppBarLayout;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            f0.b bVar = ((f0.e) appBarLayout.getLayoutParams()).f4611a;
            if (bVar instanceof AppBarLayout.BaseBehavior) {
                i6 = ((AppBarLayout.BaseBehavior) bVar).u();
            } else {
                i6 = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i6 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f3 = (i6 / i10) + 1.0f;
            }
        }
        int i11 = this.f13493f;
        return c9.a.b((int) (f3 * i11), 0, i11);
    }

    public e(int i6) {
        super(0);
        this.f13490c = new Rect();
        this.f13491d = new Rect();
        this.f13492e = 0;
    }
}
