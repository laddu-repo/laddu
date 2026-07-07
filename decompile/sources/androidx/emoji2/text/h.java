package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import o4.j0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f907c;

    public h(int i, String str, String str2) {
        this.f905a = i;
        this.f906b = str;
        this.f907c = str2;
    }

    public static h b(j0 j0Var, int i) {
        if (i == 0) {
            return new o4.v(j0Var, 0);
        }
        if (i == 1) {
            return new o4.v(j0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(v4.a aVar);

    public abstract void c(v4.a aVar);

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

    public abstract void q(int i);

    public abstract void r(v4.a aVar);

    public abstract void s(v4.a aVar);

    public abstract void t(v4.a aVar);

    public abstract void u(v4.a aVar);

    public abstract l7.a v(v4.a aVar);

    public h(j0 j0Var) {
        this.f905a = Integer.MIN_VALUE;
        this.f907c = new Rect();
        this.f906b = j0Var;
    }

    public h(l lVar) {
        this.f905a = 0;
        this.f907c = new e();
        this.f906b = lVar;
    }
}
