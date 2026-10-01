package t0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z0 extends c1 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f12430e = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final l1.a f12431f = new l1.a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f12432g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f12433h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        ic.o j = j(view);
        if (j != null) {
            ((View) j.f6773d).setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                e(viewGroup.getChildAt(i6));
            }
        }
    }

    public static void f(View view, w1 w1Var, boolean z10) {
        ic.o j = j(view);
        if (j != null) {
            j.f6772c = w1Var;
            if (!z10) {
                View view2 = (View) j.f6773d;
                int[] iArr = (int[]) j.f6774e;
                view2.getLocationOnScreen(iArr);
                z10 = true;
                j.f6770a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                f(viewGroup.getChildAt(i6), w1Var, z10);
            }
        }
    }

    public static void g(View view, w1 w1Var, List list) {
        ic.o j = j(view);
        if (j != null) {
            j.f(w1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                g(viewGroup.getChildAt(i6), w1Var, list);
            }
        }
    }

    public static void h(View view, s8.l lVar) {
        ic.o j = j(view);
        if (j != null) {
            View view2 = (View) j.f6773d;
            int[] iArr = (int[]) j.f6774e;
            view2.getLocationOnScreen(iArr);
            int i6 = j.f6770a - iArr[1];
            j.f6771b = i6;
            view2.setTranslationY(i6);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), lVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static ic.o j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof y0) {
            return ((y0) tag).f12427a;
        }
        return null;
    }
}
