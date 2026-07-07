package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewAdPlayer$sendScarBannerEvent$2 extends l implements ve.a {
    final /* synthetic */ BannerBridge.BannerEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendScarBannerEvent$2(BannerBridge.BannerEvent bannerEvent) {
        super(0);
        this.$event = bannerEvent;
    }

    @Override // ve.a
    public final WebViewEvent invoke() {
        return new OnScarBannerEvent(this.$event);
    }
}
