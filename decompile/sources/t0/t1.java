package t0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class t1 {

    /* renamed from: b, reason: collision with root package name */
    public static final w1 f12409b;

    /* renamed from: a, reason: collision with root package name */
    public final w1 f12410a;

    static {
        l1 f1Var;
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
        f12409b = f1Var.b().f12417a.a().f12417a.b().f12417a.c();
    }

    public t1(w1 w1Var) {
        this.f12410a = w1Var;
    }

    public w1 a() {
        return this.f12410a;
    }

    public w1 b() {
        return this.f12410a;
    }

    public w1 c() {
        return this.f12410a;
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (n() == t1Var.n() && m() == t1Var.m() && Objects.equals(j(), t1Var.j()) && Objects.equals(h(), t1Var.h()) && Objects.equals(e(), t1Var.e())) {
            return true;
        }
        return false;
    }

    public l0.c f(int i6) {
        return l0.c.f8061e;
    }

    public l0.c g() {
        return j();
    }

    public l0.c h() {
        return l0.c.f8061e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public l0.c i() {
        return j();
    }

    public l0.c j() {
        return l0.c.f8061e;
    }

    public l0.c k() {
        return j();
    }

    public w1 l(int i6, int i10, int i11, int i12) {
        return f12409b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(l0.c[] cVarArr) {
    }

    public void p(w1 w1Var) {
    }

    public void q(l0.c cVar) {
    }

    public void r(int i6) {
    }
}
