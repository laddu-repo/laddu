package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.AdFormatOuterClass;
import gf.c0;
import gf.f0;
import he.y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
    private final ScarManager scarManager;
    private final c0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidFetchSignalsAndSendUseCase(c0 scope, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        k.e(scope, "scope");
        k.e(scarManager, "scarManager");
        k.e(handleGetTokenRequest, "handleGetTokenRequest");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.scope = scope;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(List<? extends AdFormatOuterClass.AdFormat> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (list.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i6, ByteString byteString, TokenConfiguration tokenConfiguration, c cVar) {
        f0.w(this.scope, null, new AndroidFetchSignalsAndSendUseCase$invoke$2(this, tokenConfiguration, i6, byteString, null), 3);
        return y.f6101a;
    }
}
