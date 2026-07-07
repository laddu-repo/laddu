package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonCleanAssets implements CleanAssets {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCleanAssets(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(cacheRepository, "cacheRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.CleanAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(le.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r1 == 0) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            long r1 = r0.J$1
            long r3 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonCleanAssets r0 = (com.unity3d.ads.core.domain.CommonCleanAssets) r0
            he.a.f(r15)
            goto L75
        L32:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3a:
            long r5 = r0.J$0
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.core.domain.CommonCleanAssets r1 = (com.unity3d.ads.core.domain.CommonCleanAssets) r1
            he.a.f(r15)
            goto L5b
        L44:
            he.a.f(r15)
            long r5 = ef.i.b()
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r14.cacheRepository
            r0.L$0 = r14
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r15 = r15.getCacheSize(r0)
            if (r15 != r4) goto L5a
            goto L71
        L5a:
            r1 = r14
        L5b:
            java.lang.Number r15 = (java.lang.Number) r15
            long r7 = r15.longValue()
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r1.cacheRepository
            r0.L$0 = r1
            r0.J$0 = r5
            r0.J$1 = r7
            r0.label = r2
            java.lang.Object r15 = r15.clearCache(r0)
            if (r15 != r4) goto L72
        L71:
            return r4
        L72:
            r0 = r1
            r3 = r5
            r1 = r7
        L75:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            ef.k r15 = new ef.k
            r15.<init>(r3)
            double r3 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r3)
            r15 = 1024(0x400, float:1.435E-42)
            long r3 = (long) r15
            long r1 = r1 / r3
            int r15 = (int) r1
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r15)
            he.i r15 = new he.i
            java.lang.String r1 = "size_kb"
            r15.<init>(r1, r0)
            java.util.Map r9 = ie.w.x(r15)
            r12 = 52
            r13 = 0
            java.lang.String r6 = "native_clean_assets_task_success_time"
            r8 = 0
            r10 = 0
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            he.y r15 = he.y.f6101a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonCleanAssets.invoke(le.c):java.lang.Object");
    }
}
