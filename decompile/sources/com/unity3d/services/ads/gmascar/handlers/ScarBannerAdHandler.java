package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ScarBannerAdHandler {
    private final IEventSender _eventSender;
    private final String _operationId;

    public ScarBannerAdHandler(IEventSender iEventSender, String str) {
        this._eventSender = iEventSender;
        this._operationId = str;
    }

    public void onAdClicked() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLICKED, this._operationId);
    }

    public void onAdClosed() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_CLOSED, this._operationId);
    }

    public void onAdFailedToLoad(int i6, String str) {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, this._operationId, Integer.valueOf(i6), str);
    }

    public void onAdImpression() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_IMPRESSION, this._operationId);
    }

    public void onAdLoaded() {
        BannerViewCache.getInstance().addScarContainer(this._operationId);
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOADED, this._operationId);
    }

    public void onAdOpened() {
        this._eventSender.sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_OPENED, this._operationId);
    }
}
