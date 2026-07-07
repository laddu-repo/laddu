package h;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.r3;
import o.s3;
import t0.o1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements t0.n, n.w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d0 f5990v;

    public /* synthetic */ s(d0 d0Var) {
        this.f5990v = d0Var;
    }

    @Override // n.w
    public void d(n.l lVar, boolean z2) {
        c0 c0Var;
        n.l lVarK = lVar.k();
        int i = 0;
        boolean z10 = lVarK != lVar;
        if (z10) {
            lVar = lVarK;
        }
        d0 d0Var = this.f5990v;
        c0[] c0VarArr = d0Var.f5875h0;
        int length = c0VarArr != null ? c0VarArr.length : 0;
        while (true) {
            if (i < length) {
                c0Var = c0VarArr[i];
                if (c0Var != null && c0Var.f5860h == lVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                c0Var = null;
                break;
            }
        }
        if (c0Var != null) {
            if (!z10) {
                d0Var.t(c0Var, z2);
            } else {
                d0Var.p(c0Var.f5854a, c0Var, lVarK);
                d0Var.t(c0Var, true);
            }
        }
    }

    @Override // n.w
    public boolean k(n.l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        d0 d0Var = this.f5990v;
        if (!d0Var.f5869b0 || (callback = d0Var.G.getCallback()) == null || d0Var.f5880m0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // t0.n
    public o1 n(View view, o1 o1Var) {
        int i;
        int i10;
        int i11;
        int i12;
        int iD = o1Var.d();
        d0 d0Var = this.f5990v;
        Context context = d0Var.F;
        int iD2 = o1Var.d();
        ActionBarContextView actionBarContextView = d0Var.Q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i10 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d0Var.Q.getLayoutParams();
            if (d0Var.Q.isShown()) {
                if (d0Var.f5891y0 == null) {
                    d0Var.f5891y0 = new Rect();
                    d0Var.f5892z0 = new Rect();
                }
                Rect rect = d0Var.f5891y0;
                Rect rect2 = d0Var.f5892z0;
                rect.set(o1Var.b(), o1Var.d(), o1Var.c(), o1Var.a());
                ViewGroup viewGroup = d0Var.W;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z2 = s3.f9294a;
                    r3.a(viewGroup, rect, rect2);
                    i11 = 0;
                } else {
                    if (s3.f9294a) {
                        i11 = 0;
                    } else {
                        s3.f9294a = true;
                        i11 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            s3.f9295b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                s3.f9295b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = s3.f9295b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i11] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e7) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                        }
                    }
                }
                int i13 = rect.top;
                int i14 = rect.left;
                int i15 = rect.right;
                ViewGroup viewGroup2 = d0Var.W;
                WeakHashMap weakHashMap = t0.m0.f11853a;
                o1 o1VarA = t0.e0.a(viewGroup2);
                int iB = o1VarA == null ? i11 : o1VarA.b();
                int iC = o1VarA == null ? i11 : o1VarA.c();
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    i12 = i11;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    i12 = 1;
                }
                if (i13 <= 0 || d0Var.Y != null) {
                    View view2 = d0Var.Y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            d0Var.Y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    d0Var.Y = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    d0Var.W.addView(d0Var.Y, -1, layoutParams);
                }
                View view4 = d0Var.Y;
                i = view4 == null ? i11 : 1;
                if (i != 0 && view4.getVisibility() != 0) {
                    View view5 = d0Var.Y;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(g.c.abc_decor_view_status_guard_light) : context.getColor(g.c.abc_decor_view_status_guard));
                }
                if (!d0Var.f5871d0 && i != 0) {
                    iD2 = i11;
                }
                i10 = i;
                i = i11;
                i = i12;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i10 = 0;
                } else {
                    i10 = 0;
                    i = 0;
                }
            }
            if (i != 0) {
                d0Var.Q.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = d0Var.Y;
        if (view6 != null) {
            view6.setVisibility(i10 != 0 ? i : 8);
        }
        return t0.m0.i(view, iD != iD2 ? o1Var.f(o1Var.b(), iD2, o1Var.c(), o1Var.a()) : o1Var);
    }
}
