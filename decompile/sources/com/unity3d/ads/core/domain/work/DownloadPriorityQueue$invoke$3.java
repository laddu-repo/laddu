package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DownloadPriorityQueue$invoke$3 extends j implements p {
    final /* synthetic */ DownloadPriorityQueue.PriorityItem $priorityItem;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$3(DownloadPriorityQueue.PriorityItem priorityItem, c cVar) {
        super(2, cVar);
        this.$priorityItem = priorityItem;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(this.$priorityItem, cVar);
        downloadPriorityQueue$invoke$3.L$0 = obj;
        return downloadPriorityQueue$invoke$3;
    }

    @Override // ve.p
    public final Object invoke(DownloadPriorityQueue.PriorityItem priorityItem, c cVar) {
        return ((DownloadPriorityQueue$invoke$3) create(priorityItem, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        if (this.label == 0) {
            a.f(obj);
            if (((DownloadPriorityQueue.PriorityItem) this.L$0) == this.$priorityItem) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
