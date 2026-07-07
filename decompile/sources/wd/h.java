package wd;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends ae.a implements sd.a {
    @Override // sd.a
    public final void b() {
        this.f700d.handleError(com.unity3d.scar.adapter.common.a.a(this.f699c));
    }

    @Override // ae.a
    public final void c(AdRequest adRequest) {
        RewardedAd.load(this.f698b, this.f699c.f12289c, adRequest, ((l) ((jb.b) this.f702f)).f14293a);
    }
}
