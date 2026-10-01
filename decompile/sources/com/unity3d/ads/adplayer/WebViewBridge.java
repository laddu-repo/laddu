package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import kf.u0;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface WebViewBridge {
    u0 getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, c cVar);

    Object sendEvent(WebViewEvent webViewEvent, c cVar);
}
