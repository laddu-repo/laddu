package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> r6, java.lang.String r7, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin r8, le.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L4e
            if (r1 != r2) goto L46
            java.lang.Object r6 = r0.L$6
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r6 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$5
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r7 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r7
            java.lang.Object r8 = r0.L$4
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r8 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r8
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionOrigin r1 = (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin) r1
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest r0 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest) r0
            he.a.f(r9)
            r4 = r9
            r9 = r8
            r8 = r1
            r1 = r0
            r0 = r4
            goto L80
        L46:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4e:
            he.a.f(r9)
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl$Companion r9 = gatewayprotocol.v1.TransactionEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest$Builder r1 = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder()
            java.lang.String r3 = "newBuilder()"
            kotlin.jvm.internal.k.d(r1, r3)
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r9 = r9._create(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r5.deviceInfoRepository
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.L$4 = r9
            r0.L$5 = r9
            r0.L$6 = r9
            r0.label = r2
            java.lang.Object r0 = r1.staticDeviceInfo(r0)
            me.a r1 = me.a.f8833x
            if (r0 != r1) goto L7b
            return r1
        L7b:
            r1 = r5
            r3 = r6
            r2 = r7
            r6 = r9
            r7 = r6
        L80:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r0 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r0
            r6.setStaticDeviceInfo(r0)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r1.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r6 = r6.getDynamicDeviceInfo()
            r7.setDynamicDeviceInfo(r6)
            gatewayprotocol.v1.TransactionEventRequestOuterClass$StoreType r6 = gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY
            r7.setAppStore(r6)
            r7.setGooglePlayBillingLibraryVersion(r2)
            r7.setOrigin(r8)
            com.google.protobuf.kotlin.DslList r6 = r7.getTransactionData()
            r7.addAllTransactionData(r6, r3)
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r6 = r9._build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.invoke(java.util.List, java.lang.String, gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionOrigin, le.c):java.lang.Object");
    }
}
