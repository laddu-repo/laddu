package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequest(GetByteStringId generateByteStringId, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository) {
        k.e(generateByteStringId, "generateByteStringId");
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(sessionRepository, "sessionRepository");
        k.e(campaignRepository, "campaignRepository");
        this.generateByteStringId = generateByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r5, com.google.protobuf.ByteString r6, com.google.protobuf.ByteString r7, com.google.protobuf.ByteString r8, java.lang.String r9, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r10, le.c r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 != r2) goto L3a
            java.lang.Object r5 = r0.L$4
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r5 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r5
            java.lang.Object r6 = r0.L$3
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r6 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$2
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r7 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r7
            java.lang.Object r8 = r0.L$1
            r10 = r8
            gatewayprotocol.v1.AdFormatOuterClass$AdFormat r10 = (gatewayprotocol.v1.AdFormatOuterClass.AdFormat) r10
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r8 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest) r8
            he.a.f(r11)
            goto L93
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            he.a.f(r11)
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl$Companion r11 = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder r1 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder()
            java.lang.String r3 = "newBuilder()"
            kotlin.jvm.internal.k.d(r1, r3)
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r11 = r11._create(r1)
            com.unity3d.ads.core.domain.GetByteStringId r1 = r4.generateByteStringId
            com.google.protobuf.ByteString r1 = r1.invoke()
            r11.setEventId(r1)
            r11.setEventType(r5)
            r11.setImpressionOpportunityId(r7)
            r11.setTrackingToken(r6)
            r11.setAdditionalData(r8)
            if (r9 == 0) goto L6e
            r11.setSid(r9)
        L6e:
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r5 = r5.getDynamicDeviceInfo()
            r11.setDynamicDeviceInfo(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            r0.L$0 = r4
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r11
            r0.L$4 = r11
            r0.label = r2
            java.lang.Object r5 = r5.staticDeviceInfo(r0)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L8e
            return r6
        L8e:
            r8 = r4
            r6 = r11
            r7 = r6
            r11 = r5
            r5 = r7
        L93:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r11 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r11
            r5.setStaticDeviceInfo(r11)
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r8.sessionRepository
            gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters r5 = r5.getSessionCounters()
            r6.setSessionCounters(r5)
            com.unity3d.ads.core.data.repository.CampaignRepository r5 = r8.campaignRepository
            gatewayprotocol.v1.CampaignStateOuterClass$CampaignState r5 = r5.getCampaignState()
            r6.setCampaignState(r5)
            if (r10 == 0) goto Laf
            r6.setAdFormat(r10)
        Laf:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r5 = r7._build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, le.c):java.lang.Object");
    }
}
