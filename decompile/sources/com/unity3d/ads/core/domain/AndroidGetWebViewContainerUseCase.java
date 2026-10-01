package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import gf.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final y defaultDispatcher;
    private final y mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, y mainDispatcher, y defaultDispatcher) {
        k.e(context, "context");
        k.e(androidWebViewClient, "androidWebViewClient");
        k.e(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        k.e(mainDispatcher, "mainDispatcher");
        k.e(defaultDispatcher, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(gf.c0 r10, le.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r10 = r0.L$1
            gf.c0 r10 = (gf.c0) r10
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) r0
            he.a.f(r11)
        L2c:
            r7 = r10
            goto L52
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            he.a.f(r11)
            gf.y r11 = r9.mainDispatcher
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 r1 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1
            r3 = 0
            r1.<init>(r9, r3)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r2
            java.lang.Object r11 = gf.f0.J(r11, r1, r0)
            me.a r0 = me.a.f8833x
            if (r11 != r0) goto L50
            return r0
        L50:
            r0 = r9
            goto L2c
        L52:
            r2 = r11
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            com.unity3d.ads.adplayer.AndroidWebViewContainer r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer
            com.unity3d.ads.adplayer.AndroidWebViewClient r3 = r0.androidWebViewClient
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r4 = r0.sendWebViewClientErrorDiagnostics
            gf.y r5 = r0.mainDispatcher
            gf.y r6 = r0.defaultDispatcher
            android.content.Context r8 = r0.context
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke(gf.c0, le.c):java.lang.Object");
    }
}
