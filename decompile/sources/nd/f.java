package nd;

import android.os.Bundle;
import android.view.View;
import java.util.Locale;
import kf.f1;
import kf.r0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f<T> extends e<T> {
    public static final /* synthetic */ int B0 = 0;

    @Override // nd.e, j1.y
    public void B(View view, Bundle bundle) {
        kotlin.jvm.internal.k.e(view, "view");
        super.B(view, bundle);
        T().getData().d(j(), new n4.i(new cf.n(this, 12), 1));
    }

    @Override // nd.e
    public final void O() {
        T().mo157getData();
    }

    @Override // nd.e
    public final void R(String query) {
        kotlin.jvm.internal.k.e(query, "query");
        r0 a10 = T().a();
        String lowerCase = query.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.k.d(lowerCase, "toLowerCase(...)");
        f1 f1Var = (f1) a10;
        f1Var.getClass();
        f1Var.h(null, lowerCase);
    }

    public abstract od.n T();
}
