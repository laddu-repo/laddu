package a8;

import android.app.Dialog;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.fragment.NavHostFragment;
import b1.m;
import com.playfy.tv.R;
import gf.j0;
import ic.s;
import j1.r;
import j1.y;
import java.util.ArrayList;
import l4.x;
import t0.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {
    public static float A(int i6, float f3, int i10, int i11) {
        float f10;
        if (f3 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    return -3.4028235E38f;
                }
                return f3;
            }
            f10 = i10;
        } else {
            f10 = i11;
        }
        return f3 * f10;
    }

    public static final int C(e9.f fVar, w6.g gVar) {
        if (fVar instanceof w6.a) {
            return ((w6.a) fVar).f14123k;
        }
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.MAX_VALUE;
            }
            throw new RuntimeException();
        }
        return Integer.MIN_VALUE;
    }

    public static int E(int i6) {
        return (i6 >>> 1) ^ (-(i6 & 1));
    }

    public static long F(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i6, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i6, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i6 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i6, i10, 33);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [x.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [x.k, java.lang.Object] */
    public static x.j b(j0 j0Var) {
        ?? obj = new Object();
        obj.f14450c = new Object();
        x.j jVar = new x.j(obj);
        obj.f14449b = jVar;
        obj.f14448a = r4.a.class;
        try {
            j0Var.y(new m(3, obj, j0Var));
            obj.f14448a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e10) {
            jVar.f14453y.k(e10);
            return jVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, le.c, cf.k] */
    public static final void e(View view) {
        kotlin.jvm.internal.k.e(view, "<this>");
        t0 t0Var = new t0(view, null);
        ?? obj = new Object();
        obj.A = c.e(obj, obj, t0Var);
        while (obj.hasNext()) {
            View view2 = (View) obj.next();
            y0.a aVar = (y0.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new y0.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f14798a;
            int s = ie.k.s(arrayList);
            if (-1 < s) {
                throw h8.c.h(s, arrayList);
            }
        }
    }

    public static void i(int i6, int i10, int i11) {
        if (i6 >= 0 && i10 <= i11) {
            if (i6 <= i10) {
            } else {
                throw new IllegalArgumentException(h8.c.l("startIndex: ", " > endIndex: ", i6, i10));
            }
        } else {
            StringBuilder p10 = r4.a.p(i6, i10, "startIndex: ", ", endIndex: ", ", size: ");
            p10.append(i11);
            throw new IndexOutOfBoundsException(p10.toString());
        }
    }

    public static void j(int i6, int i10, int i11) {
        if (i6 >= 0 && i10 <= i11) {
            if (i6 <= i10) {
            } else {
                throw new IllegalArgumentException(h8.c.l("fromIndex: ", " > toIndex: ", i6, i10));
            }
        } else {
            StringBuilder p10 = r4.a.p(i6, i10, "fromIndex: ", ", toIndex: ", ", size: ");
            p10.append(i11);
            throw new IndexOutOfBoundsException(p10.toString());
        }
    }

    public static final x k(y yVar) {
        r rVar;
        Dialog dialog;
        Window window;
        kotlin.jvm.internal.k.e(yVar, "<this>");
        for (y yVar2 = yVar; yVar2 != null; yVar2 = yVar2.V) {
            if (yVar2 instanceof NavHostFragment) {
                return ((NavHostFragment) yVar2).N();
            }
            y yVar3 = yVar2.g().f6966z;
            if (yVar3 instanceof NavHostFragment) {
                return ((NavHostFragment) yVar3).N();
            }
        }
        View view = yVar.f7024g0;
        if (view != null) {
            return e9.f.d(view);
        }
        View view2 = null;
        if (yVar instanceof r) {
            rVar = (r) yVar;
        } else {
            rVar = null;
        }
        if (rVar != null && (dialog = rVar.K0) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return e9.f.d(view2);
        }
        throw new IllegalStateException(h8.c.k("Fragment ", yVar, " does not have a NavController set"));
    }

    public static void z(t1.a aVar) {
        aVar.f12443k = -3.4028235E38f;
        aVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f12434a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f12434a = SpannableString.valueOf(charSequence);
                aVar.f12435b = null;
            }
            CharSequence charSequence2 = aVar.f12434a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public abstract boolean B(View view, float f3);

    public abstract void D(ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i10);

    public abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float d(int i6);

    public abstract boolean f(g6.h hVar, g6.c cVar, g6.c cVar2);

    public abstract boolean g(g6.h hVar, Object obj, Object obj2);

    public abstract boolean h(g6.h hVar, g6.g gVar, g6.g gVar2);

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p(View view);

    public abstract int q(CoordinatorLayout coordinatorLayout);

    public abstract int r();

    public abstract boolean s(float f3);

    public abstract boolean t(View view);

    public abstract boolean u(float f3, float f10);

    public abstract void v(Throwable th);

    public abstract void w(s sVar);

    public abstract void x(g6.g gVar, g6.g gVar2);

    public abstract void y(g6.g gVar, Thread thread);
}
