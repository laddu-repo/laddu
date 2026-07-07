package com.unity3d.services.core.request.metrics;

import a8.g;
import android.text.TextUtils;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.properties.InitializationStatusReader;
import he.a;
import he.f;
import ie.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private final f _logger$delegate;
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender _original, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        k.e(_original, "_original");
        k.e(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
        this._logger$delegate = a.d(MetricSenderWithBatch$_logger$2.INSTANCE);
    }

    private final Logger get_logger() {
        Object value = this._logger$delegate.getValue();
        k.d(value, "<get-_logger>(...)");
        return (Logger) value;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) {
        k.e(event, "event");
        k.e(tags, "tags");
        if (event.length() == 0) {
            get_logger().debug("Metric event not sent due to being empty: ".concat(event));
        } else {
            sendMetrics(g.m(new Metric(event, str, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        k.e(metric, "metric");
        sendMetrics(g.m(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(List<Metric> metrics) {
        k.e(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(r.f6846x);
    }

    public final void updateOriginal(SDKMetricsSender metrics) {
        k.e(metrics, "metrics");
        this._original = metrics;
    }
}
