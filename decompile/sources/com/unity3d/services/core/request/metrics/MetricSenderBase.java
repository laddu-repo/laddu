package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import he.i;
import ie.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class MetricSenderBase implements SDKMetricsSender {
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(InitializationStatusReader _initStatusReader) {
        k.e(_initStatusReader, "_initStatusReader");
        this._initStatusReader = _initStatusReader;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(Metric metric) {
        k.e(metric, "metric");
        Map x10 = w.x(new i("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())));
        Map<String, String> tags = metric.getTags();
        k.e(tags, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(tags);
        linkedHashMap.putAll(x10);
        sendMetric(Metric.copy$default(metric, null, null, linkedHashMap, 3, null));
    }
}
