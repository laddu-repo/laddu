package t0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m1 extends t1 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f12374i = false;
    public static Method j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f12375k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f12376l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f12377m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f12378c;

    /* renamed from: d, reason: collision with root package name */
    public l0.c[] f12379d;

    /* renamed from: e, reason: collision with root package name */
    public l0.c f12380e;

    /* renamed from: f, reason: collision with root package name */
    public w1 f12381f;

    /* renamed from: g, reason: collision with root package name */
    public l0.c f12382g;

    /* renamed from: h, reason: collision with root package name */
    public int f12383h;

    public m1(w1 w1Var, WindowInsets windowInsets) {
        super(w1Var);
        this.f12380e = null;
        this.f12378c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private l0.c s(int i6, boolean z10) {
        l0.c cVar = l0.c.f8061e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i6 & i10) != 0) {
                cVar = l0.c.a(cVar, t(i10, z10));
            }
        }
        return cVar;
    }

    private l0.c u() {
        w1 w1Var = this.f12381f;
        if (w1Var != null) {
            return w1Var.f12417a.h();
        }
        return l0.c.f8061e;
    }

    private l0.c v(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f12374i) {
                w();
            }
            Method method = j;
            if (method != null && f12375k != null && f12376l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f12376l.get(f12377m.get(invoke));
                    if (rect != null) {
                        return l0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f12375k = cls;
            f12376l = cls.getDeclaredField("mVisibleInsets");
            f12377m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f12376l.setAccessible(true);
            f12377m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f12374i = true;
    }

    public static boolean y(int i6, int i10) {
        if ((i6 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    @Override // t0.t1
    public void d(View view) {
        l0.c v10 = v(view);
        if (v10 == null) {
            v10 = l0.c.f8061e;
        }
        x(v10);
    }

    @Override // t0.t1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (!Objects.equals(this.f12382g, m1Var.f12382g) || !y(this.f12383h, m1Var.f12383h)) {
            return false;
        }
        return true;
    }

    @Override // t0.t1
    public l0.c f(int i6) {
        return s(i6, false);
    }

    @Override // t0.t1
    public final l0.c j() {
        if (this.f12380e == null) {
            WindowInsets windowInsets = this.f12378c;
            this.f12380e = l0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f12380e;
    }

    @Override // t0.t1
    public w1 l(int i6, int i10, int i11, int i12) {
        l1 f1Var;
        w1 h4 = w1.h(null, this.f12378c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            f1Var = new k1(h4);
        } else if (i13 >= 31) {
            f1Var = new j1(h4);
        } else if (i13 >= 30) {
            f1Var = new i1(h4);
        } else if (i13 >= 29) {
            f1Var = new g1(h4);
        } else {
            f1Var = new f1(h4);
        }
        f1Var.g(w1.e(j(), i6, i10, i11, i12));
        f1Var.e(w1.e(h(), i6, i10, i11, i12));
        return f1Var.b();
    }

    @Override // t0.t1
    public boolean n() {
        return this.f12378c.isRound();
    }

    @Override // t0.t1
    public void o(l0.c[] cVarArr) {
        this.f12379d = cVarArr;
    }

    @Override // t0.t1
    public void p(w1 w1Var) {
        this.f12381f = w1Var;
    }

    @Override // t0.t1
    public void r(int i6) {
        this.f12383h = i6;
    }

    public l0.c t(int i6, boolean z10) {
        int i10;
        i e10;
        int i11;
        int i12;
        int i13;
        l0.c cVar = l0.c.f8061e;
        int i14 = 0;
        if (i6 != 1) {
            l0.c cVar2 = null;
            if (i6 != 2) {
                if (i6 != 8) {
                    if (i6 != 16) {
                        if (i6 != 32) {
                            if (i6 != 64) {
                                if (i6 == 128) {
                                    w1 w1Var = this.f12381f;
                                    if (w1Var != null) {
                                        e10 = w1Var.f12417a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = j0.a.h(e10.f12363a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = j0.a.j(e10.f12363a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = j0.a.i(e10.f12363a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = j0.a.g(e10.f12363a);
                                        }
                                        return l0.c.b(i11, i12, i13, i14);
                                    }
                                }
                            } else {
                                return k();
                            }
                        } else {
                            return g();
                        }
                    } else {
                        return i();
                    }
                } else {
                    l0.c[] cVarArr = this.f12379d;
                    if (cVarArr != null) {
                        cVar2 = cVarArr[a8.c.g(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    l0.c j10 = j();
                    l0.c u3 = u();
                    int i16 = j10.f8065d;
                    if (i16 > u3.f8065d) {
                        return l0.c.b(0, 0, 0, i16);
                    }
                    l0.c cVar3 = this.f12382g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i10 = this.f12382g.f8065d) > u3.f8065d) {
                        return l0.c.b(0, 0, 0, i10);
                    }
                }
            } else {
                if (z10) {
                    l0.c u10 = u();
                    l0.c h4 = h();
                    return l0.c.b(Math.max(u10.f8062a, h4.f8062a), 0, Math.max(u10.f8064c, h4.f8064c), Math.max(u10.f8065d, h4.f8065d));
                }
                if ((this.f12383h & 2) == 0) {
                    l0.c j11 = j();
                    w1 w1Var2 = this.f12381f;
                    if (w1Var2 != null) {
                        cVar2 = w1Var2.f12417a.h();
                    }
                    int i17 = j11.f8065d;
                    if (cVar2 != null) {
                        i17 = Math.min(i17, cVar2.f8065d);
                    }
                    return l0.c.b(j11.f8062a, 0, j11.f8064c, i17);
                }
            }
        } else {
            if (z10) {
                return l0.c.b(0, Math.max(u().f8063b, j().f8063b), 0, 0);
            }
            if ((this.f12383h & 4) == 0) {
                return l0.c.b(0, j().f8063b, 0, 0);
            }
        }
        return cVar;
    }

    public void x(l0.c cVar) {
        this.f12382g = cVar;
    }
}
