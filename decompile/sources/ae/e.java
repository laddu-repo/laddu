package ae;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends a implements sd.a {
    @Override // sd.a
    public final void b() {
        this.f700d.handleError(com.unity3d.scar.adapter.common.a.a(this.f699c));
    }

    @Override // ae.a
    public final void c(AdRequest adRequest) {
        InterstitialAd.load(this.f698b, this.f699c.f12289c, adRequest, ((h) ((a8.i) this.f702f)).f707c);
    }
}
