package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final r0 uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        k.e(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = y0.c(-1);
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String eventName, Map<String, String> map, Map<String, Integer> map2, Double d10, Boolean bool, ByteString byteString, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num) {
        f1 f1Var;
        Object value;
        Integer valueOf;
        k.e(eventName, "eventName");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        k.d(newBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        r0 r0Var = this.uniqueId;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            valueOf = Integer.valueOf(((Number) value).intValue() + 1);
        } while (!f1Var.f(value, valueOf));
        _create.setEventId(valueOf.intValue());
        _create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        _create.setCustomEventType(eventName);
        if (map != null) {
            _create.putAllStringTags(_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            _create.putAllIntTags(_create.getIntTagsMap(), map2);
        }
        if (d10 != null) {
            _create.setTimeValue(d10.doubleValue());
        }
        if (bool != null) {
            _create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            _create.setImpressionOpportunityId(byteString);
        }
        if (str != null) {
            _create.setPlacementId(str);
        }
        if (diagnosticAdType != null) {
            _create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            _create.setHeaderBiddingTokenNumber(num.intValue());
        }
        return _create._build();
    }
}
