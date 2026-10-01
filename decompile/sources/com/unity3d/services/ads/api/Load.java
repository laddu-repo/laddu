package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Load {
    @WebViewExposed
    public static void sendAdFailedToLoad(String str, String str2, String str3, String str4, WebViewCallback webViewCallback) {
        LoadModule.getInstance().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.valueOf(str3), str4);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendAdLoaded(String str, String str2, WebViewCallback webViewCallback) {
        LoadModule.getInstance().onUnityAdsAdLoaded(str2);
        webViewCallback.invoke(new Object[0]);
    }
}
