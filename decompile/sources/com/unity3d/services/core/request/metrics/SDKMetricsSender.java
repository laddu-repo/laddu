package com.unity3d.services.core.request.metrics;

import ie.s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface SDKMetricsSender {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static void sendEvent(SDKMetricsSender sDKMetricsSender, String event) {
            k.e(event, "event");
            sendEvent$default(sDKMetricsSender, event, null, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendEvent$default(SDKMetricsSender sDKMetricsSender, String str, String str2, Map map, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    str2 = null;
                }
                if ((i6 & 4) != 0) {
                    map = s.f6847x;
                }
                sDKMetricsSender.sendEvent(str, str2, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
    }

    String getMetricEndPoint();

    void sendEvent(String str);

    void sendEvent(String str, String str2, Map<String, String> map);

    void sendMetric(Metric metric);

    void sendMetricWithInitState(Metric metric);

    void sendMetrics(List<Metric> list);
}
