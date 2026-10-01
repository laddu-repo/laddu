package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import ie.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest, LifecycleDataSource lifecycleDataSource) {
        k.e(diagnosticEventRepository, "diagnosticEventRepository");
        k.e(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        k.e(lifecycleDataSource, "lifecycleDataSource");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String event, Double d10, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num) {
        Boolean bool;
        ByteString byteString;
        String str;
        LinkedHashMap linkedHashMap;
        k.e(event, "event");
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType = null;
        if (adObject != null) {
            bool = Boolean.valueOf(adObject.isHeaderBidding());
        } else {
            bool = null;
        }
        if (adObject != null) {
            byteString = adObject.getOpportunityId();
        } else {
            byteString = null;
        }
        if (adObject != null) {
            str = adObject.getPlacementId();
        } else {
            str = null;
        }
        if (adObject != null) {
            diagnosticAdType = adObject.getAdType();
        }
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = diagnosticAdType;
        if (map != null) {
            linkedHashMap = w.E(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if (adObject != null && adObject.isScarAd()) {
            linkedHashMap2.put("scar", "true");
        }
        if (adObject != null && adObject.isOfferwallAd()) {
            linkedHashMap2.put("offerwall", "true");
        }
        linkedHashMap2.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, linkedHashMap2, map2, d10, bool, byteString, str, diagnosticAdType2, num));
    }
}
