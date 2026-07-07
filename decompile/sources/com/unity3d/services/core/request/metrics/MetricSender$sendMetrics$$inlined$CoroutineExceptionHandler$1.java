package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.core.log.Logger;
import gf.a0;
import gf.z;
import java.util.List;
import le.a;
import le.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements a0 {
    final /* synthetic */ List $metrics$inlined;
    final /* synthetic */ MetricSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(z zVar, MetricSender metricSender, List list) {
        super(zVar);
        this.this$0 = metricSender;
        this.$metrics$inlined = list;
    }

    @Override // gf.a0
    public void handleException(h hVar, Throwable th) {
        Logger logger;
        logger = this.this$0.logger;
        Logger.DefaultImpls.trace$default(logger, "Metric " + this.$metrics$inlined + " failed to send with error: " + th, null, 2, null);
    }
}
