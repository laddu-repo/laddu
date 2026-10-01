package com.unity3d.scar.adapter.common;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface d {
    void a(Context context, sd.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler);

    void b(Context context, BannerView bannerView, sd.c cVar, int i6, int i10, ScarBannerAdHandler scarBannerAdHandler);

    void c(Context context, sd.c cVar, ScarRewardedAdHandler scarRewardedAdHandler);
}
