package com.unity3d.ads.adplayer;

import kf.d1;
import le.c;
import org.json.JSONArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, c cVar);

    Object destroy(c cVar);

    Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, c cVar);

    d1 getLastInputEvent();

    Object loadUrl(String str, c cVar);
}
