package com.unity3d.services.core.request.metrics;

import gf.c0;
import he.y;
import java.util.List;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {66, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MetricSender$sendMetrics$1 extends j implements p {
    final /* synthetic */ List<Metric> $metrics;
    Object L$0;
    int label;
    final /* synthetic */ MetricSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$1(MetricSender metricSender, List<Metric> list, c cVar) {
        super(2, cVar);
        this.this$0 = metricSender;
        this.$metrics = list;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new MetricSender$sendMetrics$1(this.this$0, this.$metrics, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((MetricSender$sendMetrics$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        if (r0 == r8) goto L19;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
