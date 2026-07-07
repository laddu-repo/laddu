package ya;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import ma.n;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends LinearLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f15030x;

    /* renamed from: y, reason: collision with root package name */
    public int f15031y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ TabLayout f15032z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.f15032z = tabLayout;
        this.f15031y = -1;
        setWillNotDraw(false);
    }

    public final void a(int i6) {
        TabLayout tabLayout = this.f15032z;
        if (tabLayout.f2764u0 != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i6);
        ob.a aVar = tabLayout.f2753i0;
        Drawable drawable = tabLayout.L;
        aVar.getClass();
        RectF e10 = ob.a.e(tabLayout, childAt);
        drawable.setBounds((int) e10.left, drawable.getBounds().top, (int) e10.right, drawable.getBounds().bottom);
        tabLayout.f2766x = i6;
    }

    public final void b(int i6) {
        TabLayout tabLayout = this.f15032z;
        Rect bounds = tabLayout.L.getBounds();
        tabLayout.L.setBounds(bounds.left, 0, bounds.right, i6);
        requestLayout();
    }

    public final void c(View view, View view2, float f3) {
        TabLayout tabLayout = this.f15032z;
        if (view != null && view.getWidth() > 0) {
            tabLayout.f2753i0.h(tabLayout, view, view2, f3, tabLayout.L);
        } else {
            Drawable drawable = tabLayout.L;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.L.getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z10, int i6, int i10) {
        TabLayout tabLayout = this.f15032z;
        if (tabLayout.f2766x == i6) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i6);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f2766x = i6;
        e eVar = new e(this, childAt, childAt2);
        if (z10) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15030x = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f2754j0);
            valueAnimator.setDuration(i10);
            valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            valueAnimator.addUpdateListener(eVar);
            valueAnimator.start();
            return;
        }
        this.f15030x.removeAllUpdateListeners();
        this.f15030x.addUpdateListener(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f15032z;
        int height2 = tabLayout.L.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.L.getIntrinsicHeight();
        }
        int i6 = tabLayout.f2746b0;
        if (i6 != 0) {
            if (i6 != 1) {
                height = 0;
                if (i6 != 2) {
                    if (i6 != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (tabLayout.L.getBounds().width() > 0) {
            Rect bounds = tabLayout.L.getBounds();
            tabLayout.L.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.L.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        ValueAnimator valueAnimator = this.f15030x;
        TabLayout tabLayout = this.f15032z;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, tabLayout.getSelectedTabPosition(), -1);
            return;
        }
        if (tabLayout.f2766x == -1) {
            tabLayout.f2766x = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f2766x);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            TabLayout tabLayout = this.f15032z;
            boolean z10 = true;
            if (tabLayout.W == 1 || tabLayout.f2747c0 == 2) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        i11 = Math.max(i11, childAt.getMeasuredWidth());
                    }
                }
                if (i11 > 0) {
                    if (i11 * childCount <= getMeasuredWidth() - (((int) n.d(getContext(), 16)) * 2)) {
                        boolean z11 = false;
                        for (int i13 = 0; i13 < childCount; i13++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                            if (layoutParams.width != i11 || layoutParams.weight != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                layoutParams.width = i11;
                                layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                z11 = true;
                            }
                        }
                        z10 = z11;
                    } else {
                        tabLayout.W = 0;
                        tabLayout.j(false);
                    }
                    if (z10) {
                        super.onMeasure(i6, i10);
                    }
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (Build.VERSION.SDK_INT < 23 && this.f15031y != i6) {
            requestLayout();
            this.f15031y = i6;
        }
    }
}
