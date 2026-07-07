package t0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final ic.o f12427a;

    /* renamed from: b, reason: collision with root package name */
    public w1 f12428b;

    public y0(View view, ic.o oVar) {
        w1 w1Var;
        l1 f1Var;
        this.f12427a = oVar;
        w1 i6 = q0.i(view);
        if (i6 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                f1Var = new k1(i6);
            } else if (i10 >= 31) {
                f1Var = new j1(i6);
            } else if (i10 >= 30) {
                f1Var = new i1(i6);
            } else if (i10 >= 29) {
                f1Var = new g1(i6);
            } else {
                f1Var = new f1(i6);
            }
            w1Var = f1Var.b();
        } else {
            w1Var = null;
        }
        this.f12428b = w1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z10;
        boolean z11;
        if (!view.isLaidOut()) {
            this.f12428b = w1.h(view, windowInsets);
            return z0.i(view, windowInsets);
        }
        w1 h4 = w1.h(view, windowInsets);
        t1 t1Var = h4.f12417a;
        if (this.f12428b == null) {
            this.f12428b = q0.i(view);
        }
        if (this.f12428b == null) {
            this.f12428b = h4;
            return z0.i(view, windowInsets);
        }
        ic.o j10 = z0.j(view);
        if (j10 != null && Objects.equals((w1) j10.f6772c, h4)) {
            return z0.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        w1 w1Var = this.f12428b;
        int i6 = 1;
        while (i6 <= 512) {
            l0.c f3 = t1Var.f(i6);
            l0.c f10 = w1Var.f12417a.f(i6);
            int i10 = f3.f8062a;
            int i11 = f3.f8065d;
            int i12 = f3.f8064c;
            int i13 = f3.f8063b;
            int i14 = f10.f8062a;
            int i15 = f10.f8065d;
            int i16 = f10.f8064c;
            int i17 = f10.f8063b;
            if (i10 <= i14 && i13 <= i17 && i12 <= i16 && i11 <= i15) {
                iArr = iArr2;
                z10 = false;
            } else {
                iArr = iArr2;
                z10 = true;
            }
            if (i10 >= i14 && i13 >= i17 && i12 >= i16 && i11 >= i15) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 != z11) {
                if (z10) {
                    iArr[0] = iArr[0] | i6;
                } else {
                    iArr3[0] = iArr3[0] | i6;
                }
            }
            i6 <<= 1;
            iArr2 = iArr;
        }
        int i18 = iArr2[0];
        int i19 = iArr3[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f12428b = h4;
            return z0.i(view, windowInsets);
        }
        w1 w1Var2 = this.f12428b;
        if ((i18 & 8) != 0) {
            interpolator = z0.f12430e;
        } else if ((i19 & 8) != 0) {
            interpolator = z0.f12431f;
        } else if ((i18 & 519) != 0) {
            interpolator = z0.f12432g;
        } else if ((i19 & 519) != 0) {
            interpolator = z0.f12433h;
        } else {
            interpolator = null;
        }
        if ((i20 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        d1 d1Var = new d1(i20, interpolator, j);
        d1Var.f12338a.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(d1Var.f12338a.a());
        l0.c f11 = t1Var.f(i20);
        l0.c f12 = w1Var2.f12417a.f(i20);
        int min = Math.min(f11.f8062a, f12.f8062a);
        int i21 = f11.f8063b;
        int i22 = f12.f8063b;
        int min2 = Math.min(i21, i22);
        int i23 = f11.f8064c;
        int i24 = f12.f8064c;
        int min3 = Math.min(i23, i24);
        int i25 = f11.f8065d;
        int i26 = f12.f8065d;
        s8.l lVar = new s8.l(3, l0.c.b(min, min2, min3, Math.min(i25, i26)), l0.c.b(Math.max(f11.f8062a, f12.f8062a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        z0.f(view, h4, false);
        duration.addUpdateListener(new x0(d1Var, h4, w1Var2, i20, view));
        duration.addListener(new o5.j(d1Var, view, 2));
        u.a(view, new d6.b(view, d1Var, lVar, duration));
        this.f12428b = h4;
        return z0.i(view, windowInsets);
    }
}
