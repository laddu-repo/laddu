package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InitializeStateLoadCache$doWork$2 extends j implements p {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, c cVar) {
        super(2, cVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((InitializeStateLoadCache$doWork$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: webapp loaded from local cache");
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L70
            he.a.f(r6)
            com.unity3d.services.core.domain.task.InitializeStateLoadCache r6 = r5.this$0
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params r0 = r5.$params
            java.lang.String r1 = "Unity Ads init: check if webapp can be loaded from local cache"
            com.unity3d.services.core.log.DeviceLog.debug(r1)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            byte[] r6 = com.unity3d.services.core.domain.task.InitializeStateLoadCache.access$getWebViewData(r6)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            r1 = 1
            if (r6 != 0) goto L23
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r6 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            r0 = 2
            r2 = 0
            r6.<init>(r1, r2, r0, r2)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            goto L5a
        L1f:
            r6 = move-exception
            goto L56
        L21:
            r6 = move-exception
            goto L6f
        L23:
            java.lang.String r2 = com.unity3d.services.core.misc.Utilities.Sha256(r6)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            java.lang.String r4 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.k.d(r3, r4)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            r4.<init>(r6, r3)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            if (r2 == 0) goto L49
            com.unity3d.services.core.configuration.Configuration r6 = r0.getConfig()     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            java.lang.String r6 = r6.getWebViewHash()     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            if (r6 != 0) goto L48
            goto L49
        L48:
            r1 = 0
        L49:
            if (r1 != 0) goto L50
            java.lang.String r6 = "Unity Ads init: webapp loaded from local cache"
            com.unity3d.services.core.log.DeviceLog.info(r6)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
        L50:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r6 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L21
            goto L5a
        L56:
            he.j r6 = he.a.b(r6)
        L5a:
            boolean r0 = r6 instanceof he.j
            if (r0 != 0) goto L5f
            goto L69
        L5f:
            java.lang.Throwable r0 = he.k.a(r6)
            if (r0 == 0) goto L69
            he.j r6 = he.a.b(r0)
        L69:
            he.k r0 = new he.k
            r0.<init>(r6)
            return r0
        L6f:
            throw r6
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
