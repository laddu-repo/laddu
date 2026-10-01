package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import uc.b;
import uc.c;
import uc.d;
import uc.f;
import uc.g;
import uc.h;
import uc.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface OmidManager {
    void activate(Context context);

    uc.a createAdEvents(b bVar);

    b createAdSession(c cVar, d dVar);

    c createAdSessionConfiguration(f fVar, g gVar, h hVar, h hVar2, boolean z10);

    d createHtmlAdSessionContext(i iVar, WebView webView, String str, String str2);

    d createJavaScriptAdSessionContext(i iVar, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
