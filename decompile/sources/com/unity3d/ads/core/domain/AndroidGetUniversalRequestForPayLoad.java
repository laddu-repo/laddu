package com.unity3d.ads.core.domain;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData) {
        k.e(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r5 = r0.L$3
            gatewayprotocol.v1.UniversalRequestKt$Dsl r5 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r5
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r1
            java.lang.Object r2 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r2
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r0 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) r0
            he.a.f(r6)
            goto L69
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            he.a.f(r6)
            gatewayprotocol.v1.UniversalRequestKt$Dsl$Companion r6 = gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Builder r1 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.newBuilder()
            java.lang.String r3 = "newBuilder()"
            kotlin.jvm.internal.k.d(r1, r3)
            gatewayprotocol.v1.UniversalRequestKt$Dsl r6 = r6._create(r1)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r1 = r4.getUniversalRequestSharedData
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r2
            java.lang.Object r0 = r1.invoke(r0)
            me.a r1 = me.a.f8833x
            if (r0 != r1) goto L64
            return r1
        L64:
            r1 = r6
            r2 = r1
            r6 = r0
            r0 = r5
            r5 = r2
        L69:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) r6
            r5.setSharedData(r6)
            r1.setPayload(r0)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r5 = r2._build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload, le.c):java.lang.Object");
    }
}
