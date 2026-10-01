package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    private final GatewayClient gatewayClient;
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public HandleAndroidGetTokenRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetHbTokenEventRequest getHbTokenEventRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        k.e(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        k.e(getHbTokenEventRequest, "getHbTokenEventRequest");
        k.e(getRequestPolicy, "getRequestPolicy");
        k.e(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r13 != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r11, com.unity3d.services.ads.gmascar.models.BiddingSignals r12, le.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1
            if (r0 == 0) goto L14
            r0 = r13
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1) r0
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
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            int r0 = r6.label
            r1 = 3
            r2 = 2
            r3 = 1
            me.a r9 = me.a.f8833x
            if (r0 == 0) goto L47
            if (r0 == r3) goto L3f
            if (r0 == r2) goto L37
            if (r0 != r1) goto L2f
            he.a.f(r13)
            return r13
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            java.lang.Object r11 = r6.L$0
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest r11 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest) r11
            he.a.f(r13)
            goto L7f
        L3f:
            java.lang.Object r11 = r6.L$0
            com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest r11 = (com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest) r11
            he.a.f(r13)
            goto L58
        L47:
            he.a.f(r13)
            com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest r13 = r10.getHbTokenEventRequest
            r6.L$0 = r10
            r6.label = r3
            java.lang.Object r13 = r13.invoke(r11, r12, r6)
            if (r13 != r9) goto L57
            goto L9b
        L57:
            r11 = r10
        L58:
            gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequest r13 = (gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest) r13
            gatewayprotocol.v1.UniversalRequestKt r12 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r12 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r0 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            java.lang.String r3 = "newBuilder()"
            kotlin.jvm.internal.k.d(r0, r3)
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r12 = r12._create(r0)
            r12.setGetTokenEventRequest(r13)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r12 = r12._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r13 = r11.getUniversalRequestForPayLoad
            r6.L$0 = r11
            r6.label = r2
            java.lang.Object r13 = r13.invoke(r12, r6)
            if (r13 != r9) goto L7f
            goto L9b
        L7f:
            r3 = r13
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r3 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r3
            com.unity3d.ads.core.domain.GetRequestPolicy r12 = r11.getRequestPolicy
            com.unity3d.ads.gatewayclient.RequestPolicy r4 = r12.invoke()
            com.unity3d.ads.gatewayclient.GatewayClient r11 = r11.gatewayClient
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.GET_TOKEN
            r12 = 0
            r6.L$0 = r12
            r6.label = r1
            r2 = 0
            r7 = 1
            r8 = 0
            r1 = r11
            java.lang.Object r11 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r9) goto L9c
        L9b:
            return r9
        L9c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest.invoke(com.google.protobuf.ByteString, com.unity3d.services.ads.gmascar.models.BiddingSignals, le.c):java.lang.Object");
    }
}
