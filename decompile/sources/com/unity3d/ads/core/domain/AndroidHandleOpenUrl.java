package com.unity3d.ads.core.domain;

import android.content.Context;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;
    private final IntentCreation intentCreation;

    public AndroidHandleOpenUrl(Context context, IntentCreation intentCreation) {
        k.e(context, "context");
        k.e(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(final com.unity3d.ads.core.data.model.AdObject r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, boolean r10, le.c r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r11)
            goto L75
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r11)
            com.unity3d.ads.core.domain.IntentCreation r11 = r4.intentCreation
            android.content.Intent r6 = r11.invoke(r6, r7, r8, r9)
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r7 = r5.getAdType()
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r8 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER
            if (r7 != r8) goto L54
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r6.setFlags(r5)
            android.content.Context r5 = r4.context     // Catch: java.lang.Throwable -> L4b
            r5.startActivity(r6)     // Catch: java.lang.Throwable -> L4b
            he.y r5 = he.y.f6101a     // Catch: java.lang.Throwable -> L4b
            goto L50
        L4b:
            r5 = move-exception
            he.j r5 = he.a.b(r5)
        L50:
            boolean r5 = r5 instanceof he.j
            r5 = r5 ^ r2
            goto L80
        L54:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
            kf.q0 r7 = r7.getDisplayMessages()
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1 r8 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1
            r9 = 0
            r8.<init>(r5, r6, r10, r9)
            j1.f0 r6 = new j1.f0
            r6.<init>(r7, r8)
            com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1 r7 = new com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1
            r7.<init>()
            r0.label = r2
            java.lang.Object r11 = kf.y0.l(r7, r0)
            me.a r5 = me.a.f8833x
            if (r11 != r5) goto L75
            return r5
        L75:
            java.lang.String r5 = "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult"
            kotlin.jvm.internal.k.c(r11, r5)
            com.unity3d.ads.adplayer.DisplayMessage$OpenUrlResult r11 = (com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult) r11
            boolean r5 = r11.getSuccess()
        L80:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleOpenUrl.invoke(com.unity3d.ads.core.data.model.AdObject, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, le.c):java.lang.Object");
    }
}
