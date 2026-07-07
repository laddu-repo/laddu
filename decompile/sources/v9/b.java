package v9;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import s8.j;
import t0.q0;
import t0.s;
import t0.w1;
import u0.m;
import w4.e0;
import w4.f0;
import w4.i1;
import w4.t0;
import w4.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements s, f0, m {

    /* renamed from: y, reason: collision with root package name */
    public static b f13478y;

    /* renamed from: x, reason: collision with root package name */
    public final Object f13479x;

    public /* synthetic */ b(Object obj) {
        this.f13479x = obj;
    }

    @Override // u0.m
    public boolean a(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f13479x;
        boolean z10 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z10 = true;
        }
        int i6 = swipeDismissBehavior.f2603d;
        if ((i6 == 0 && z10) || (i6 == 1 && !z10)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        q0.k(view, width);
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return true;
    }

    @Override // w4.f0
    public void b(int i6, int i10) {
        ((e0) this.f13479x).f13929x.c(i6, i10);
    }

    @Override // w4.f0
    public void c(int i6, int i10) {
        ((e0) this.f13479x).f13929x.e(i6, i10);
    }

    @Override // w4.f0
    public void d(int i6, int i10) {
        ((e0) this.f13479x).f13929x.f(i6, i10);
    }

    @Override // w4.f0
    public void e(int i6, int i10, Object obj) {
        ((e0) this.f13479x).f13929x.d(i6, i10, obj);
    }

    public void f(w4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f13479x;
        int i6 = aVar.f13799a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 != 8) {
                        return;
                    }
                    recyclerView.K.a0(aVar.f13800b, aVar.f13802d);
                    return;
                }
                recyclerView.K.c0(aVar.f13800b, aVar.f13802d);
                return;
            }
            recyclerView.K.b0(aVar.f13800b, aVar.f13802d);
            return;
        }
        recyclerView.K.Y(aVar.f13800b, aVar.f13802d);
    }

    public i1 g(int i6) {
        RecyclerView recyclerView = (RecyclerView) this.f13479x;
        int A = recyclerView.C.A();
        int i10 = 0;
        i1 i1Var = null;
        while (true) {
            if (i10 >= A) {
                break;
            }
            i1 J = RecyclerView.J(recyclerView.C.z(i10));
            if (J != null && !J.i() && J.f13899c == i6) {
                if (((ArrayList) recyclerView.C.A).contains(J.f13897a)) {
                    i1Var = J;
                } else {
                    i1Var = J;
                    break;
                }
            }
            i10++;
        }
        if (i1Var != null) {
            if (!((ArrayList) recyclerView.C.A).contains(i1Var.f13897a)) {
                return i1Var;
            }
        }
        return null;
    }

    public void h(int i6, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f13479x;
        int A = recyclerView.C.A();
        int i13 = i10 + i6;
        for (int i14 = 0; i14 < A; i14++) {
            View z10 = recyclerView.C.z(i14);
            i1 J = RecyclerView.J(z10);
            if (J != null && !J.p() && (i12 = J.f13899c) >= i6 && i12 < i13) {
                J.a(2);
                if (obj == null) {
                    J.a(1024);
                } else if ((1024 & J.j) == 0) {
                    if (J.f13906k == null) {
                        ArrayList arrayList = new ArrayList();
                        J.f13906k = arrayList;
                        J.f13907l = Collections.unmodifiableList(arrayList);
                    }
                    J.f13906k.add(obj);
                }
                ((t0) z10.getLayoutParams()).f14022c = true;
            }
        }
        y0 y0Var = recyclerView.f1148z;
        ArrayList arrayList2 = y0Var.f14076c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            i1 i1Var = (i1) arrayList2.get(size);
            if (i1Var != null && (i11 = i1Var.f13899c) >= i6 && i11 < i13) {
                i1Var.a(2);
                y0Var.h(size);
            }
        }
        recyclerView.H0 = true;
    }

    public void i(int i6, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f13479x;
        int A = recyclerView.C.A();
        for (int i11 = 0; i11 < A; i11++) {
            i1 J = RecyclerView.J(recyclerView.C.z(i11));
            if (J != null && !J.p() && J.f13899c >= i6) {
                J.m(i10, false);
                recyclerView.D0.f13862f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1148z.f14076c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            i1 i1Var = (i1) arrayList.get(i12);
            if (i1Var != null && i1Var.f13899c >= i6) {
                i1Var.m(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.G0 = true;
    }

    public void j(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = (RecyclerView) this.f13479x;
        int A = recyclerView.C.A();
        int i18 = -1;
        if (i6 < i10) {
            i12 = i6;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i6;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < A; i19++) {
            i1 J = RecyclerView.J(recyclerView.C.z(i19));
            if (J != null && (i17 = J.f13899c) >= i12 && i17 <= i11) {
                if (i17 == i6) {
                    J.m(i10 - i6, false);
                } else {
                    J.m(i13, false);
                }
                recyclerView.D0.f13862f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1148z.f14076c;
        if (i6 < i10) {
            i15 = i6;
            i14 = i10;
        } else {
            i14 = i6;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            i1 i1Var = (i1) arrayList.get(i20);
            if (i1Var != null && (i16 = i1Var.f13899c) >= i15 && i16 <= i14) {
                if (i16 == i6) {
                    i1Var.m(i10 - i6, false);
                } else {
                    i1Var.m(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.G0 = true;
    }

    public void k() {
        synchronized (this.f13479x) {
        }
    }

    @Override // t0.s
    public w1 v(View view, w1 w1Var) {
        w1 w1Var2;
        boolean z10;
        AppBarLayout appBarLayout = (AppBarLayout) this.f13479x;
        if (appBarLayout.getFitsSystemWindows()) {
            w1Var2 = w1Var;
        } else {
            w1Var2 = null;
        }
        if (!Objects.equals(appBarLayout.D, w1Var2)) {
            appBarLayout.D = w1Var2;
            if (appBarLayout.T != null && appBarLayout.getTopInset() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            appBarLayout.setWillNotDraw(!z10);
            appBarLayout.requestLayout();
        }
        return w1Var;
    }

    public b() {
        this.f13479x = new Object();
        new Handler(Looper.getMainLooper(), new j(this, 2));
    }
}
