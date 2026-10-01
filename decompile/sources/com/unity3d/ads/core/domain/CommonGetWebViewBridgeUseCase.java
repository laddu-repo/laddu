package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import gf.c0;
import gf.o0;
import gf.y;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final y dispatcher;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(y dispatcher, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        k.e(dispatcher, "dispatcher");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(logger, "logger");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer webViewContainer, c0 adPlayerScope) {
        k.e(webViewContainer, "webViewContainer");
        k.e(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent, this.logger);
    }

    public CommonGetWebViewBridgeUseCase(y yVar, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i6, f fVar) {
        this((i6 & 1) != 0 ? o0.f5693a : yVar, sendDiagnosticEvent, logger);
    }
}
