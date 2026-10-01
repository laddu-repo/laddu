package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements ExposedFunction {
    final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    public CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r9, le.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            java.lang.String r3 = "version"
            java.lang.String r4 = "content"
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 != r6) goto L2b
            he.a.f(r10)
            goto L5d
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            he.a.f(r10)
            r9 = r9[r5]
            java.lang.String r10 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.k.c(r9, r10)
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            java.lang.String r10 = r9.optString(r4)
            int r9 = r9.optInt(r3)
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r1 = r8.$sendPrivacyUpdateRequest
            java.lang.String r7 = "privacyUpdateContentBase64"
            kotlin.jvm.internal.k.d(r10, r7)
            com.google.protobuf.ByteString r10 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r10, r5, r6, r2)
            r0.label = r6
            java.lang.Object r10 = r1.invoke(r9, r10, r0)
            me.a r9 = me.a.f8833x
            if (r10 != r9) goto L5d
            return r9
        L5d:
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r10 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r10
            je.f r9 = new je.f
            r9.<init>()
            int r0 = r10.getVersion()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r9.put(r3, r1)
            com.google.protobuf.ByteString r10 = r10.getContent()
            java.lang.String r0 = "response.content"
            kotlin.jvm.internal.k.d(r10, r0)
            java.lang.String r10 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r10, r5, r6, r2)
            r9.put(r4, r10)
            je.f r9 = r9.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
