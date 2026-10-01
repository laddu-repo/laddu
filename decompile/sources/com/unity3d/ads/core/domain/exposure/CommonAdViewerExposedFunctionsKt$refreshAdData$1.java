package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.Refresh;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Refresh $refresh;

    public CommonAdViewerExposedFunctionsKt$refreshAdData$1(Refresh refresh, AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r7, le.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            java.lang.String r2 = "adDataRefreshToken"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 != r5) goto L29
            he.a.f(r8)
            goto L68
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            he.a.f(r8)
            int r8 = r7.length
            if (r8 != 0) goto L3a
            com.google.protobuf.ByteString r7 = com.google.protobuf.ByteString.EMPTY
            goto L50
        L3a:
            r7 = r7[r4]
            java.lang.String r8 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.k.c(r7, r8)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r7 = r7.optString(r2)
            java.lang.String r8 = "refreshToken"
            kotlin.jvm.internal.k.d(r7, r8)
            com.google.protobuf.ByteString r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r7, r4, r5, r3)
        L50:
            com.unity3d.ads.core.domain.Refresh r8 = r6.$refresh
            java.lang.String r1 = "refreshTokenByteString"
            kotlin.jvm.internal.k.d(r7, r1)
            com.unity3d.ads.core.data.model.AdObject r1 = r6.$adObject
            com.google.protobuf.ByteString r1 = r1.getOpportunityId()
            r0.label = r5
            java.lang.Object r8 = r8.invoke(r7, r1, r0)
            me.a r7 = me.a.f8833x
            if (r8 != r7) goto L68
            return r7
        L68:
            gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r8 = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) r8
            boolean r7 = r8.hasError()
            if (r7 != 0) goto Lae
            je.f r7 = new je.f
            r7.<init>()
            com.google.protobuf.ByteString r0 = r8.getAdData()
            java.lang.String r1 = "adRefreshResponse.adData"
            kotlin.jvm.internal.k.d(r0, r1)
            java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r4, r5, r3)
            java.lang.String r1 = "adData"
            r7.put(r1, r0)
            com.google.protobuf.ByteString r0 = r8.getAdDataRefreshToken()
            java.lang.String r1 = "adRefreshResponse.adDataRefreshToken"
            kotlin.jvm.internal.k.d(r0, r1)
            java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r4, r5, r3)
            r7.put(r2, r0)
            com.google.protobuf.ByteString r8 = r8.getTrackingToken()
            java.lang.String r0 = "adRefreshResponse.trackingToken"
            kotlin.jvm.internal.k.d(r8, r0)
            java.lang.String r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r8, r4, r5, r3)
            java.lang.String r0 = "trackingToken"
            r7.put(r0, r8)
            je.f r7 = r7.b()
            return r7
        Lae:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Refresh failed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
