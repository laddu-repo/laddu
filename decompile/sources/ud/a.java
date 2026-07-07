package ud;

import a1.e;
import a8.i;
import ae.b;
import ae.h;
import ae.m;
import android.content.Context;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;
import wd.g;
import wd.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13103e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i6) {
        super(cVar);
        this.f13103e = i6;
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void a(Context context, sd.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        switch (this.f13103e) {
            case 0:
                ae.a aVar = new ae.a(context, cVar, (vd.a) this.f13104f, (c) this.f3398d, 1);
                aVar.f702f = new g();
                i.r(new e(aVar, 24));
                return;
            default:
                ae.a aVar2 = new ae.a(context, cVar, (zd.a) this.f13104f, (c) this.f3398d, 0);
                aVar2.f702f = new h();
                i.r(new v8.i(aVar2, 5));
                return;
        }
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void b(Context context, BannerView bannerView, sd.c cVar, int i6, int i10, ScarBannerAdHandler scarBannerAdHandler) {
        switch (this.f13103e) {
            case 0:
                i.r(new e(new wd.a(context, bannerView, (vd.a) this.f13104f, cVar, i6, i10, (c) this.f3398d), 26));
                return;
            default:
                i.r(new v8.i(new b(context, bannerView, (zd.a) this.f13104f, cVar, i6, i10, (c) this.f3398d), 7));
                return;
        }
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void c(Context context, sd.c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        switch (this.f13103e) {
            case 0:
                ae.a aVar = new ae.a(context, cVar, (vd.a) this.f13104f, (c) this.f3398d, 1);
                aVar.f702f = new l();
                i.r(new e(aVar, 25));
                return;
            default:
                ae.a aVar2 = new ae.a(context, cVar, (zd.a) this.f13104f, (c) this.f3398d, 0);
                aVar2.f702f = new m();
                i.r(new v8.i(aVar2, 6));
                return;
        }
    }
}
