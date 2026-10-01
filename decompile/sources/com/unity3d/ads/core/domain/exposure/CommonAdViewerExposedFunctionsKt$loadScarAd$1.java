package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.scar.LoadScarAd;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$loadScarAd$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ LoadScarAd $loadScarAd;

    public CommonAdViewerExposedFunctionsKt$loadScarAd$1(AdObject adObject, LoadScarAd loadScarAd) {
        this.$adObject = adObject;
        this.$loadScarAd = loadScarAd;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r11, le.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
            if (r0 == 0) goto L14
            r0 = r12
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r8.result
            int r0 = r8.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            he.a.f(r12)
            goto L91
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            he.a.f(r12)
            r12 = 0
            r11 = r11[r12]
            java.lang.String r12 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.k.c(r11, r12)
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            java.lang.String r12 = "type"
            java.lang.String r2 = r11.optString(r12)
            java.lang.String r12 = "adUnitId"
            java.lang.String r4 = r11.optString(r12)
            java.lang.String r0 = "adString"
            java.lang.String r5 = r11.optString(r0)
            java.lang.String r3 = "queryId"
            java.lang.String r6 = r11.optString(r3)
            java.lang.String r7 = "videoLength"
            int r7 = r11.optInt(r7)
            com.unity3d.ads.core.data.model.AdObject r11 = r10.$adObject
            r11.setScarAd(r1)
            com.unity3d.ads.core.data.model.AdObject r11 = r10.$adObject
            r11.setScarAdUnitId(r4)
            com.unity3d.ads.core.data.model.AdObject r11 = r10.$adObject
            r11.setScarQueryId(r6)
            com.unity3d.ads.core.data.model.AdObject r11 = r10.$adObject
            r11.setScarAdString(r5)
            r11 = 1
            com.unity3d.ads.core.domain.scar.LoadScarAd r1 = r10.$loadScarAd
            java.lang.String r9 = "adType"
            kotlin.jvm.internal.k.d(r2, r9)
            com.unity3d.ads.core.data.model.AdObject r9 = r10.$adObject
            java.lang.String r9 = r9.getPlacementId()
            kotlin.jvm.internal.k.d(r4, r12)
            kotlin.jvm.internal.k.d(r5, r0)
            kotlin.jvm.internal.k.d(r6, r3)
            r8.label = r11
            r3 = r9
            java.lang.Object r11 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
            me.a r12 = me.a.f8833x
            if (r11 != r12) goto L91
            return r12
        L91:
            he.y r11 = he.y.f6101a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
