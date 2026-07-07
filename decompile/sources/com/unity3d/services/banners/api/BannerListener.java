package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BannerListener {
    @WebViewExposed
    public static void sendClickEvent(String str, WebViewCallback webViewCallback) {
        BannerViewCache.getInstance().triggerBannerClickEvent(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendErrorEvent(String str, Integer num, String str2, WebViewCallback webViewCallback) {
        BannerViewCache.getInstance().triggerBannerErrorEvent(str, new BannerErrorInfo(str2, BannerErrorCode.values()[num.intValue()]));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendLeaveApplicationEvent(String str, WebViewCallback webViewCallback) {
        BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendLoadEvent(String str, WebViewCallback webViewCallback) {
        BannerViewCache.getInstance().triggerBannerLoadEvent(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowEvent(String str, WebViewCallback webViewCallback) {
        BannerViewCache.getInstance().triggerBannerShowEvent(str);
        webViewCallback.invoke(new Object[0]);
    }
}
