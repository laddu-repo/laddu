package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetInitializationData implements GetInitializationData {
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetInitializationData(GetInitializationRequestPayload getInitializeRequestPayload, GetUniversalRequestSharedData getUniversalRequestSharedData) {
        k.e(getInitializeRequestPayload, "getInitializeRequestPayload");
        k.e(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getInitializeRequestPayload = getInitializeRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(le.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r1 == 0) goto L52
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r1 = r0.L$1
            gatewayprotocol.v1.InitializationDataKt$Dsl r1 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r1
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.InitializationDataKt$Dsl r0 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r0
            he.a.f(r9)
            goto L95
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.InitializationDataKt$Dsl r1 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r1
            java.lang.Object r3 = r0.L$2
            gatewayprotocol.v1.InitializationDataKt$Dsl r3 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r3
            java.lang.Object r5 = r0.L$1
            gatewayprotocol.v1.InitializationDataKt$Dsl r5 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r5
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetInitializationData r6 = (com.unity3d.ads.core.domain.AndroidGetInitializationData) r6
            he.a.f(r9)
            r7 = r3
            r3 = r1
            r1 = r5
            r5 = r7
            goto L7a
        L52:
            he.a.f(r9)
            gatewayprotocol.v1.InitializationDataKt$Dsl$Companion r9 = gatewayprotocol.v1.InitializationDataKt.Dsl.Companion
            gatewayprotocol.v1.InitializationDataOuterClass$InitializationData$Builder r1 = gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.newBuilder()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.k.d(r1, r5)
            gatewayprotocol.v1.InitializationDataKt$Dsl r1 = r9._create(r1)
            com.unity3d.ads.core.domain.GetInitializationRequestPayload r9 = r8.getInitializeRequestPayload
            r0.L$0 = r8
            r0.L$1 = r1
            r0.L$2 = r1
            r0.L$3 = r1
            r0.label = r3
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r4) goto L77
            goto L92
        L77:
            r6 = r8
            r3 = r1
            r5 = r3
        L7a:
            gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest r9 = (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) r9
            r3.setInitializationRequest(r9)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r9 = r6.getUniversalRequestSharedData
            r0.L$0 = r1
            r0.L$1 = r5
            r3 = 0
            r0.L$2 = r3
            r0.L$3 = r3
            r0.label = r2
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r4) goto L93
        L92:
            return r4
        L93:
            r0 = r1
            r1 = r5
        L95:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r9 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) r9
            r1.setSharedData(r9)
            gatewayprotocol.v1.InitializationDataOuterClass$InitializationData r9 = r0._build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationData.invoke(le.c):java.lang.Object");
    }
}
