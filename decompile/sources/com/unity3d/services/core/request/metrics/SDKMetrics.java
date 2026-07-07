package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SDKMetrics {
    private static final String NULL_INSTANCE_METRICS_URL = "nullInstanceMetricsUrl";
    private static MetricSenderWithBatch _batchedSender;
    private static final AtomicBoolean _configurationIsSet = new AtomicBoolean(false);
    private static SDKMetricsSender _instance;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class NullInstance implements SDKMetricsSender {
        private Logger _logger;
        private final String _metricEndpoint;

        public NullInstance(String str) {
            this._metricEndpoint = str;
        }

        private Logger getLogger() {
            if (this._logger == null) {
                this._logger = (Logger) Utilities.getService(Logger.class);
            }
            return this._logger;
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public String getMetricEndPoint() {
            return this._metricEndpoint;
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(String str) {
            getLogger().debug("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetric(Metric metric) {
            getLogger().debug("Metric " + metric + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetricWithInitState(Metric metric) {
            sendMetric(metric);
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetrics(List<Metric> list) {
            getLogger().debug("Metrics: " + list + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(String str, String str2, Map<String, String> map) {
            sendEvent(str);
        }

        public void sendEvent(String str, Map<String, String> map) {
            sendEvent(str);
        }
    }

    public static synchronized SDKMetricsSender getInstance() {
        MetricSenderWithBatch metricSenderWithBatch;
        synchronized (SDKMetrics.class) {
            try {
                if (_instance == null) {
                    _instance = new NullInstance(null);
                }
                if (_batchedSender == null) {
                    _batchedSender = new MetricSenderWithBatch(_instance, new InitializationStatusReader());
                }
                metricSenderWithBatch = _batchedSender;
            } catch (Throwable th) {
                throw th;
            }
        }
        return metricSenderWithBatch;
    }

    private static boolean isAllowedToSetConfiguration(Configuration configuration) {
        if (TextUtils.isEmpty(configuration.getMetricsUrl()) || !_configurationIsSet.compareAndSet(false, true)) {
            return false;
        }
        return true;
    }

    public static void setConfiguration(Configuration configuration) {
        Logger logger = (Logger) Utilities.getService(Logger.class);
        if (configuration == null) {
            logger.debug("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        if (!isAllowedToSetConfiguration(configuration)) {
            return;
        }
        SDKMetricsSender sDKMetricsSender = _instance;
        if (sDKMetricsSender instanceof MetricSender) {
            ((MetricSender) sDKMetricsSender).shutdown();
        }
        if (configuration.areMetricsEnabledForCurrentSession().booleanValue()) {
            _instance = new MetricSender(configuration, new InitializationStatusReader(), logger);
        } else {
            logger.debug("Metrics will not be sent from the device for this session");
            _instance = new NullInstance(NULL_INSTANCE_METRICS_URL);
        }
        MetricSenderWithBatch metricSenderWithBatch = _batchedSender;
        if (metricSenderWithBatch == null) {
            _batchedSender = new MetricSenderWithBatch(_instance, new InitializationStatusReader());
        } else {
            metricSenderWithBatch.updateOriginal(_instance);
        }
        _batchedSender.sendQueueIfNeeded();
    }
}
