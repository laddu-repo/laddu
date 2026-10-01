package w4;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f13816b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f13815a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final cg.h f13817c = new cg.h(9);

    public static int c(e1 e1Var, e1.g gVar, View view, View view2, s0 s0Var, boolean z10) {
        if (s0Var.v() != 0 && e1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(s0.H(view) - s0.H(view2)) + 1;
            }
            return Math.min(gVar.n(), gVar.d(view2) - gVar.g(view));
        }
        return 0;
    }

    public static int d(e1 e1Var, e1.g gVar, View view, View view2, s0 s0Var, boolean z10, boolean z11) {
        int max;
        if (s0Var.v() == 0 || e1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(s0.H(view), s0.H(view2));
        int max2 = Math.max(s0.H(view), s0.H(view2));
        if (z11) {
            max = Math.max(0, (e1Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(gVar.d(view2) - gVar.g(view)) / (Math.abs(s0.H(view) - s0.H(view2)) + 1))) + (gVar.m() - gVar.g(view)));
    }

    public static int e(e1 e1Var, e1.g gVar, View view, View view2, s0 s0Var, boolean z10) {
        if (s0Var.v() != 0 && e1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return e1Var.b();
            }
            return (int) (((gVar.d(view2) - gVar.g(view)) / (Math.abs(s0.H(view) - s0.H(view2)) + 1)) * e1Var.b());
        }
        return 0;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract boolean b(Object obj, Object obj2);

    public Object f(Object obj, Object obj2) {
        return null;
    }
}
