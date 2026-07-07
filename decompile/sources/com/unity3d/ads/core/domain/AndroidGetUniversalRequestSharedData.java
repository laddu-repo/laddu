package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        k.e(getSharedDataTimestamps, "getSharedDataTimestamps");
        k.e(sessionRepository, "sessionRepository");
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(getLimitedSessionToken, "getLimitedSessionToken");
        k.e(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(le.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r1
            java.lang.Object r2 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r2
            java.lang.Object r3 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r3 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData) r0
            he.a.f(r7)
            goto L7b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            he.a.f(r7)
            gatewayprotocol.v1.UniversalRequestKt r7 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl$Companion r7 = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData$Builder r1 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder()
            java.lang.String r3 = "newBuilder()"
            kotlin.jvm.internal.k.d(r1, r3)
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r1 = r7._create(r1)
            com.unity3d.ads.core.data.repository.SessionRepository r7 = r6.sessionRepository
            com.google.protobuf.ByteString r7 = r7.getSessionToken()
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L63
            r1.setSessionToken(r7)
            r0 = r6
            r3 = r1
            goto L81
        L63:
            com.unity3d.ads.core.domain.GetLimitedSessionToken r7 = r6.getLimitedSessionToken
            r0.L$0 = r6
            r0.L$1 = r1
            r0.L$2 = r1
            r0.L$3 = r1
            r0.label = r2
            java.lang.Object r7 = r7.invoke(r0)
            me.a r0 = me.a.f8833x
            if (r7 != r0) goto L78
            return r0
        L78:
            r0 = r6
            r2 = r1
            r3 = r2
        L7b:
            gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken r7 = (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) r7
            r1.setLimitedSessionToken(r7)
            r1 = r2
        L81:
            com.unity3d.ads.core.domain.GetSharedDataTimestamps r7 = r0.getSharedDataTimestamps
            gatewayprotocol.v1.TimestampsOuterClass$Timestamps r7 = r7.invoke()
            r1.setTimestamps(r7)
            long r4 = com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()
            com.google.protobuf.Timestamp r7 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r4)
            r1.setSdkStartTime(r7)
            long r4 = com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()
            com.google.protobuf.Timestamp r7 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r4)
            r1.setAppStartTime(r7)
            com.unity3d.ads.core.data.repository.DeveloperConsentRepository r7 = r0.developerConsentRepository
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent r7 = r7.getDeveloperConsent()
            r1.setDeveloperConsent(r7)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r7 = r0.deviceInfoRepository
            gatewayprotocol.v1.PiiOuterClass$Pii r7 = r7.getPiiData()
            r1.setPii(r7)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r7 = r3._build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(le.c):java.lang.Object");
    }
}
