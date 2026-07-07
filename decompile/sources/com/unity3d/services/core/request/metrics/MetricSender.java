package com.unity3d.services.core.request.metrics;

import a8.b;
import a8.g;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.InitializationStatusReader;
import df.m;
import gf.c0;
import gf.f0;
import gf.z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClientProvider httpClientProvider;
    private final Logger logger;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final c0 scope;
    private final String sessionToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader, Logger logger) {
        super(initializationStatusReader);
        k.e(configuration, "configuration");
        k.e(initializationStatusReader, "initializationStatusReader");
        k.e(logger, "logger");
        this.logger = logger;
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(b.k(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (HttpClientProvider) getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(HttpClientProvider.class));
        this.scope = f0.b(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String str, Map<String, String> tags) {
        k.e(event, "event");
        k.e(tags, "tags");
        if (event.length() == 0) {
            Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: ".concat(event), null, 2, null);
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
    public void sendMetrics(List<Metric> metrics) {
        k.e(metrics, "metrics");
        if (metrics.isEmpty()) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint != null && !m.S(metricEndPoint)) {
            f0.w(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(z.f5729x, this, metrics), new MetricSender$sendMetrics$1(this, metrics, null), 2);
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
