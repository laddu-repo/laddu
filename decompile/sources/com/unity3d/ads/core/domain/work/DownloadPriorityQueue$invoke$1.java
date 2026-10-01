package com.unity3d.ads.core.domain.work;

import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", f = "DownloadPriorityQueue.kt", l = {47, 28, 31, 57}, m = "invoke")
/* loaded from: classes.dex */
public final class DownloadPriorityQueue$invoke$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DownloadPriorityQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$1(DownloadPriorityQueue downloadPriorityQueue, le.c cVar) {
        super(cVar);
        this.this$0 = downloadPriorityQueue;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
