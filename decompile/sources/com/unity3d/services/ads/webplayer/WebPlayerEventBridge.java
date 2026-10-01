package com.unity3d.services.ads.webplayer;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class WebPlayerEventBridge {
    public static void error(String str, String str2, String str3) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.ERROR, str2, str3, str);
        }
    }

    public static void sendFrameUpdate(String str, int i6, int i10, int i11, int i12, float f3) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.FRAME_UPDATE, str, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f3));
        }
    }

    public static void sendGetFrameResponse(String str, String str2, int i6, int i10, int i11, int i12, float f3) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.GET_FRAME_RESPONSE, str, str2, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f3));
        }
    }
}
