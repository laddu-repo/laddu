package fd;

import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.activities.MainActivity;
import p.j3;
import t0.t1;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements t0.s, j3 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5191x;

    public /* synthetic */ i(MainActivity mainActivity) {
        this.f5191x = mainActivity;
    }

    @Override // t0.s
    public w1 v(View v10, w1 w1Var) {
        bf.o[] oVarArr = MainActivity.J;
        kotlin.jvm.internal.k.e(v10, "v");
        t1 t1Var = w1Var.f12417a;
        l0.c f3 = t1Var.f(647);
        kotlin.jvm.internal.k.d(f3, "getInsets(...)");
        l0.c f10 = t1Var.f(8);
        kotlin.jvm.internal.k.d(f10, "getInsets(...)");
        int max = Math.max(f3.f8065d, f10.f8065d);
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(f3.f8062a, f3.f8063b, f3.f8064c, max);
            v10.setLayoutParams(marginLayoutParams);
            this.f5191x.Z();
            return w1Var;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
