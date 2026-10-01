package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SendPrivacyUpdateRequest {
    private final GatewayClient gatewayClient;
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(GetPrivacyUpdateRequest getPrivacyUpdateRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        k.e(getPrivacyUpdateRequest, "getPrivacyUpdateRequest");
        k.e(getRequestPolicy, "getRequestPolicy");
        k.e(gatewayClient, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r13 != r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(int r11, com.google.protobuf.ByteString r12, le.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1
            if (r0 == 0) goto L14
            r0 = r13
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            int r0 = r6.label
            r1 = 2
            r2 = 1
            me.a r9 = me.a.f8833x
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L34
            if (r0 != r1) goto L2c
            he.a.f(r13)
            goto L6a
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            java.lang.Object r11 = r6.L$0
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r11 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest) r11
            he.a.f(r13)
            goto L4d
        L3c:
            he.a.f(r13)
            com.unity3d.ads.core.domain.GetPrivacyUpdateRequest r13 = r10.getPrivacyUpdateRequest
            r6.L$0 = r10
            r6.label = r2
            java.lang.Object r13 = r13.invoke(r11, r12, r6)
            if (r13 != r9) goto L4c
            goto L69
        L4c:
            r11 = r10
        L4d:
            r3 = r13
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r3 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r3
            com.unity3d.ads.core.domain.GetRequestPolicy r12 = r11.getRequestPolicy
            com.unity3d.ads.gatewayclient.RequestPolicy r4 = r12.invoke()
            com.unity3d.ads.gatewayclient.GatewayClient r11 = r11.gatewayClient
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.PRIVACY_UPDATE
            r12 = 0
            r6.L$0 = r12
            r6.label = r1
            r2 = 0
            r7 = 1
            r8 = 0
            r1 = r11
            java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r9) goto L6a
        L69:
            return r9
        L6a:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload r11 = r13.getPayload()
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = r11.getPrivacyUpdateResponse()
            java.lang.String r12 = "response.payload.privacyUpdateResponse"
            kotlin.jvm.internal.k.d(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.invoke(int, com.google.protobuf.ByteString, le.c):java.lang.Object");
    }
}
