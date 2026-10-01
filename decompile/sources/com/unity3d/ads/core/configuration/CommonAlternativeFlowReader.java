package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final r0 isAlternativeFlowEnabled;
    private final r0 isAlternativeFlowRead;
    private final MediationTraitsMetadataReader mediationMetadataReader;
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository, MediationTraitsMetadataReader mediationMetadataReader) {
        k.e(configurationReader, "configurationReader");
        k.e(sessionRepository, "sessionRepository");
        k.e(mediationMetadataReader, "mediationMetadataReader");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        this.isAlternativeFlowRead = y0.c(Boolean.FALSE);
        this.isAlternativeFlowEnabled = y0.c(Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke() {
        /*
            r4 = this;
            kf.r0 r0 = r4.isAlternativeFlowRead
            kf.f1 r0 = (kf.f1) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            kf.r0 r0 = r4.isAlternativeFlowEnabled
            kf.f1 r0 = (kf.f1) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r0 = r4.mediationMetadataReader
            com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
            java.lang.String r0 = r0.getKey()
            java.lang.Object r0 = r1.get(r0)
            r1 = 0
            if (r0 == 0) goto L38
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 != 0) goto L39
        L38:
            r0 = r1
        L39:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L67
            java.lang.String r2 = "boldSdkEnabled"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            if (r0 == 0) goto L67
            kf.r0 r3 = r4.isAlternativeFlowEnabled
            boolean r0 = r0.optBoolean(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            kf.f1 r3 = (kf.f1) r3
            r3.getClass()
            r3.h(r1, r0)
            kf.r0 r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kf.f1 r0 = (kf.f1) r0
            r0.getClass()
            r0.h(r1, r2)
        L67:
            kf.r0 r0 = r4.isAlternativeFlowRead
            kf.f1 r0 = (kf.f1) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbc
            com.unity3d.services.core.configuration.ConfigurationReader r0 = r4.configurationReader
            com.unity3d.services.core.configuration.Configuration r0 = r0.getCurrentConfiguration()
            com.unity3d.services.core.configuration.IExperiments r0 = r0.getExperiments()
            boolean r0 = r0.isBoldSdkNextSessionEnabled()
            if (r0 != 0) goto L94
            kf.r0 r0 = r4.isAlternativeFlowEnabled
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            kf.f1 r0 = (kf.f1) r0
            r0.getClass()
            r0.h(r1, r2)
            goto Lb0
        L94:
            kf.r0 r0 = r4.isAlternativeFlowEnabled
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r4.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r2 = r2.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r2 = r2.getFeatureFlags()
            boolean r2 = r2.getBoldSdkNextSessionEnabled()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            kf.f1 r0 = (kf.f1) r0
            r0.getClass()
            r0.h(r1, r2)
        Lb0:
            kf.r0 r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kf.f1 r0 = (kf.f1) r0
            r0.getClass()
            r0.h(r1, r2)
        Lbc:
            kf.r0 r0 = r4.isAlternativeFlowEnabled
            kf.f1 r0 = (kf.f1) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.CommonAlternativeFlowReader.invoke():boolean");
    }
}
