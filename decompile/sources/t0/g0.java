package t0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public w1 f12351a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f12353c;

    public g0(View view, s sVar) {
        this.f12352b = view;
        this.f12353c = sVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w1 h4 = w1.h(view, windowInsets);
        int i6 = Build.VERSION.SDK_INT;
        s sVar = this.f12353c;
        if (i6 < 30) {
            h0.a(windowInsets, this.f12352b);
            if (h4.equals(this.f12351a)) {
                return sVar.v(view, h4).g();
            }
        }
        this.f12351a = h4;
        w1 v10 = sVar.v(view, h4);
        if (i6 >= 30) {
            return v10.g();
        }
        WeakHashMap weakHashMap = q0.f12397a;
        f0.c(view);
        return v10.g();
    }
}
