package com.unity3d.services.core.request.metrics;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class InitMetric {
    private static final String INIT_METRIC_ENVIRONMENT_NOT_OK = "native_init_environment_not_ok";
    private static final String INIT_METRIC_ENVIRONMENT_OK = "native_init_environment_ok";

    public static Metric newInitEnvironmentNotOk() {
        return new Metric(INIT_METRIC_ENVIRONMENT_NOT_OK, null);
    }

    public static Metric newInitEnvironmentOk() {
        return new Metric(INIT_METRIC_ENVIRONMENT_OK, null);
    }
}
