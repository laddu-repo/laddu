package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(cacheRepository, "cacheRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.String r13, le.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            long r1 = r0.J$0
            java.lang.Object r13 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetIsFileCache r13 = (com.unity3d.ads.core.domain.CommonGetIsFileCache) r13
            he.a.f(r14)
            goto L53
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            he.a.f(r14)
            long r3 = ef.i.b()
            java.lang.String r14 = "/"
            java.lang.String r13 = df.m.g0(r13, r14)
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r12.cacheRepository
            r0.L$0 = r12
            r0.J$0 = r3
            r0.label = r2
            java.lang.Object r14 = r14.doesFileExist(r13, r0)
            me.a r13 = me.a.f8833x
            if (r14 != r13) goto L51
            return r13
        L51:
            r13 = r12
            r1 = r3
        L53:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r13.sendDiagnosticEvent
            if (r0 == 0) goto L61
            java.lang.String r13 = "native_show_is_file_cached_success_time"
        L5f:
            r4 = r13
            goto L64
        L61:
            java.lang.String r13 = "native_show_is_file_cached_failure_time"
            goto L5f
        L64:
            ef.k r13 = new ef.k
            r13.<init>(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r13)
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r0)
            r10 = 60
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke(java.lang.String, le.c):java.lang.Object");
    }
}
