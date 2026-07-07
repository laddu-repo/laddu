package id;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.a1;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import od.c0;
import od.i0;
import od.k0;
import od.n0;
import od.q;
import od.u;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6835x;

    public /* synthetic */ i(int i6) {
        this.f6835x = i6;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6835x) {
            case 0:
                tg.a viewModel = (tg.a) obj;
                pg.a it = (pg.a) obj2;
                k.e(viewModel, "$this$viewModel");
                k.e(it, "it");
                Object a10 = viewModel.a(x.a(SharedPreferences.class), null);
                return new n0((SharedPreferences) a10, (Application) viewModel.a(x.a(Application.class), null), (a1) viewModel.a(x.a(a1.class), null));
            case 1:
                tg.a viewModel2 = (tg.a) obj;
                pg.a it2 = (pg.a) obj2;
                k.e(viewModel2, "$this$viewModel");
                k.e(it2, "it");
                return new q((a1) viewModel2.a(x.a(a1.class), null), (hd.e) viewModel2.a(x.a(hd.e.class), null));
            case 2:
                tg.a viewModel3 = (tg.a) obj;
                pg.a it3 = (pg.a) obj2;
                k.e(viewModel3, "$this$viewModel");
                k.e(it3, "it");
                Object a11 = viewModel3.a(x.a(a1.class), null);
                return new i0((a1) a11, (xf.c) viewModel3.a(x.a(xf.c.class), null), (pd.b) viewModel3.a(x.a(pd.b.class), null));
            case 3:
                tg.a viewModel4 = (tg.a) obj;
                pg.a it4 = (pg.a) obj2;
                k.e(viewModel4, "$this$viewModel");
                k.e(it4, "it");
                return new u((hd.e) viewModel4.a(x.a(hd.e.class), null), (pd.b) viewModel4.a(x.a(pd.b.class), null));
            case 4:
                tg.a viewModel5 = (tg.a) obj;
                pg.a it5 = (pg.a) obj2;
                k.e(viewModel5, "$this$viewModel");
                k.e(it5, "it");
                return new k0((hd.i) viewModel5.a(x.a(hd.i.class), null));
            default:
                tg.a viewModel6 = (tg.a) obj;
                pg.a it6 = (pg.a) obj2;
                k.e(viewModel6, "$this$viewModel");
                k.e(it6, "it");
                return new c0((a1) viewModel6.a(x.a(a1.class), null), (Application) viewModel6.a(x.a(Application.class), null));
        }
    }
}
