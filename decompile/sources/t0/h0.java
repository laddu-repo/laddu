package t0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static w1 b(View view, w1 w1Var, Rect rect) {
        WindowInsets g10 = w1Var.g();
        if (g10 != null) {
            return w1.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return w1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static w1 e(View view) {
        l1 f1Var;
        if (e1.f12343d && view.isAttachedToWindow()) {
            try {
                Object obj = e1.f12340a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) e1.f12341b.get(obj);
                    Rect rect2 = (Rect) e1.f12342c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 34) {
                            f1Var = new k1();
                        } else if (i6 >= 31) {
                            f1Var = new j1();
                        } else if (i6 >= 30) {
                            f1Var = new i1();
                        } else if (i6 >= 29) {
                            f1Var = new g1();
                        } else {
                            f1Var = new f1();
                        }
                        f1Var.e(l0.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        f1Var.g(l0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        w1 b10 = f1Var.b();
                        b10.f12417a.p(b10);
                        b10.f12417a.d(view.getRootView());
                        return b10;
                    }
                }
            } catch (IllegalAccessException e10) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static boolean h(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void k(View view, float f3) {
        view.setElevation(f3);
    }

    public static void l(View view, s sVar) {
        g0 g0Var;
        if (sVar != null) {
            g0Var = new g0(view, sVar);
        } else {
            g0Var = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, g0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (g0Var != null) {
            view.setOnApplyWindowInsetsListener(g0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void m(View view) {
        view.stopNestedScroll();
    }
}
