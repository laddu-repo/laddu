package e1;

import android.graphics.Rect;
import android.view.View;
import w4.g0;
import w4.s0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4157a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4158b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4159c;

    public g(int i6, String str, String str2) {
        this.f4157a = i6;
        this.f4158b = str;
        this.f4159c = str2;
    }

    public static g b(s0 s0Var, int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                return new g0(s0Var, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new g0(s0Var, 0);
    }

    public abstract void a(g5.a aVar);

    public abstract void c(g5.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i6);

    public abstract void r(g5.a aVar);

    public abstract void s(g5.a aVar);

    public abstract void t(g5.a aVar);

    public abstract void u(g5.a aVar);

    public abstract r8.a v(g5.a aVar);

    public g(s0 s0Var) {
        this.f4157a = Integer.MIN_VALUE;
        this.f4159c = new Rect();
        this.f4158b = s0Var;
    }

    public g(j jVar) {
        this.f4157a = 0;
        this.f4159c = new d();
        this.f4158b = jVar;
    }
}
