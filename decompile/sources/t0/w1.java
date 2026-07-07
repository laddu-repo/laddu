package t0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: b, reason: collision with root package name */
    public static final w1 f12416b;

    /* renamed from: a, reason: collision with root package name */
    public final t1 f12417a;

    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            f12416b = s1.s;
        } else if (i6 >= 30) {
            f12416b = q1.f12404r;
        } else {
            f12416b = t1.f12409b;
        }
    }

    public w1(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            this.f12417a = new s1(this, windowInsets);
            return;
        }
        if (i6 >= 31) {
            this.f12417a = new r1(this, windowInsets);
            return;
        }
        if (i6 >= 30) {
            this.f12417a = new q1(this, windowInsets);
            return;
        }
        if (i6 >= 29) {
            this.f12417a = new p1(this, windowInsets);
        } else if (i6 >= 28) {
            this.f12417a = new o1(this, windowInsets);
        } else {
            this.f12417a = new n1(this, windowInsets);
        }
    }

    public static l0.c e(l0.c cVar, int i6, int i10, int i11, int i12) {
        int max = Math.max(0, cVar.f8062a - i6);
        int max2 = Math.max(0, cVar.f8063b - i10);
        int max3 = Math.max(0, cVar.f8064c - i11);
        int max4 = Math.max(0, cVar.f8065d - i12);
        if (max == i6 && max2 == i10 && max3 == i11 && max4 == i12) {
            return cVar;
        }
        return l0.c.b(max, max2, max3, max4);
    }

    public static w1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w1 w1Var = new w1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            w1 i6 = q0.i(view);
            t1 t1Var = w1Var.f12417a;
            t1Var.p(i6);
            t1Var.d(view.getRootView());
            t1Var.r(view.getWindowSystemUiVisibility());
        }
        return w1Var;
    }

    public final int a() {
        return this.f12417a.j().f8065d;
    }

    public final int b() {
        return this.f12417a.j().f8062a;
    }

    public final int c() {
        return this.f12417a.j().f8064c;
    }

    public final int d() {
        return this.f12417a.j().f8063b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        return Objects.equals(this.f12417a, ((w1) obj).f12417a);
    }

    public final w1 f(int i6, int i10, int i11, int i12) {
        l1 f1Var;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            f1Var = new k1(this);
        } else if (i13 >= 31) {
            f1Var = new j1(this);
        } else if (i13 >= 30) {
            f1Var = new i1(this);
        } else if (i13 >= 29) {
            f1Var = new g1(this);
        } else {
            f1Var = new f1(this);
        }
        f1Var.g(l0.c.b(i6, i10, i11, i12));
        return f1Var.b();
    }

    public final WindowInsets g() {
        t1 t1Var = this.f12417a;
        if (t1Var instanceof m1) {
            return ((m1) t1Var).f12378c;
        }
        return null;
    }

    public final int hashCode() {
        t1 t1Var = this.f12417a;
        if (t1Var == null) {
            return 0;
        }
        return t1Var.hashCode();
    }

    public w1() {
        this.f12417a = new t1(this);
    }
}
