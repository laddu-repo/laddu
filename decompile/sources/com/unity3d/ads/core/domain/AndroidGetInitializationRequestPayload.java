package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        k.e(getClientInfo, "getClientInfo");
        k.e(sessionRepository, "sessionRepository");
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(legacyUserConsentRepository, "legacyUserConsentRepository");
        k.e(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x030a, code lost:
    
        if (r1 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02e6, code lost:
    
        if (r1 == r8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c7, code lost:
    
        if (r1 == r8) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a1, code lost:
    
        if (r1 != r8) goto L63;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ef  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(le.c r21) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(le.c):java.lang.Object");
    }
}
