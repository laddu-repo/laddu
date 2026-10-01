package com.unity3d.ads.core.domain.work;

import a8.g;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import kf.r0;
import kf.y0;
import qf.a;
import qf.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DownloadPriorityQueue {
    private final a mutex = new d();
    private final r0 nextTurn = y0.c(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return g.d(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t10).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t11).getPriority()));
        }
    });

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i6) {
            this.priority = i6;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r12.invoke(r0) != r7) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(int r11, ve.l r12, le.c r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, ve.l, le.c):java.lang.Object");
    }
}
