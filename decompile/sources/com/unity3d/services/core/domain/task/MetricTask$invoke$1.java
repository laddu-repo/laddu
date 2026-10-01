package com.unity3d.services.core.domain.task;

import he.k;
import me.a;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
/* loaded from: classes.dex */
public final class MetricTask$invoke$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetricTask$invoke$1(MetricTask<? super P, R> metricTask, le.c cVar) {
        super(cVar);
        this.this$0 = metricTask;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m88invokegIAlus$suspendImpl = MetricTask.m88invokegIAlus$suspendImpl(this.this$0, null, this);
        if (m88invokegIAlus$suspendImpl == a.f8833x) {
            return m88invokegIAlus$suspendImpl;
        }
        return new k(m88invokegIAlus$suspendImpl);
    }
}
