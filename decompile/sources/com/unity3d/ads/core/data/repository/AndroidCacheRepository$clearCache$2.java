package com.unity3d.ads.core.data.repository;

import gf.c0;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidCacheRepository$clearCache$2 extends j implements p {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, c cVar) {
        super(2, cVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidCacheRepository$clearCache$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be A[RETURN] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto Lc0
            he.a.f(r8)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r8 = r7.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r8 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getSessionRepository$p(r8)
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r8 = r8.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$DebugSettings r8 = r8.getDebugSettings()
            boolean r8 = r8.getCleanCache()
            r0 = 0
            if (r8 != 0) goto L53
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r7.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getSessionRepository$p(r1)
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r1 = r1.getNativeConfiguration()
            boolean r1 = r1.hasCachedAssetsConfiguration()
            if (r1 != 0) goto L2d
            goto L53
        L2d:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r7.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getSessionRepository$p(r1)
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r1 = r1.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfiguration r1 = r1.getCachedAssetsConfiguration()
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r2 = r7.this$0
            com.unity3d.services.core.network.domain.CleanupDirectory r2 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCleanupDirectory$p(r2)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r3 = r7.this$0
            java.io.File r3 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCacheDir$p(r3)
            int r4 = r1.getMaxCachedAssetSizeMb()
            long r5 = r1.getMaxCachedAssetAgeMs()
            r2.invoke(r3, r4, r5)
            goto L6b
        L53:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r7.this$0
            java.io.File r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCacheDir$p(r1)
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L6b
            int r2 = r1.length
            r3 = 0
        L61:
            if (r3 >= r2) goto L6b
            r4 = r1[r3]
            r4.delete()
            int r3 = r3 + 1
            goto L61
        L6b:
            he.y r1 = he.y.f6101a
            if (r8 != 0) goto La6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r8 = r7.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r8 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getSessionRepository$p(r8)
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r8 = r8.getNativeConfiguration()
            boolean r8 = r8.hasCachedWebviewFilesConfiguration()
            if (r8 != 0) goto L80
            goto La6
        L80:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r8 = r7.this$0
            com.unity3d.ads.core.data.repository.SessionRepository r8 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getSessionRepository$p(r8)
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r8 = r8.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfiguration r8 = r8.getCachedWebviewFilesConfiguration()
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r7.this$0
            com.unity3d.services.core.network.domain.CleanupDirectory r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCleanupDirectory$p(r0)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r2 = r7.this$0
            java.io.File r2 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getWebviewCacheDir$p(r2)
            int r3 = r8.getMaxCachedAssetSizeMb()
            long r4 = r8.getMaxCachedAssetAgeMs()
            r0.invoke(r2, r3, r4)
            return r1
        La6:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r8 = r7.this$0
            java.io.File r8 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getWebviewCacheDir$p(r8)
            java.io.File[] r8 = r8.listFiles()
            if (r8 == 0) goto Lbe
            int r2 = r8.length
        Lb3:
            if (r0 >= r2) goto Lbd
            r3 = r8[r0]
            r3.delete()
            int r0 = r0 + 1
            goto Lb3
        Lbd:
            return r1
        Lbe:
            r8 = 0
            return r8
        Lc0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
