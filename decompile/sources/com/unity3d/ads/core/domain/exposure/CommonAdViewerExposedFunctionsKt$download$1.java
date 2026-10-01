package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheFile;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;

    public CommonAdViewerExposedFunctionsKt$download$1(CacheFile cacheFile, AdObject adObject) {
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r8, le.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            if (r0 == 0) goto L14
            r0 = r9
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.result
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            he.a.f(r9)
            goto L64
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            he.a.f(r9)
            r9 = 0
            r0 = r8[r9]
            java.lang.String r2 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.k.c(r0, r2)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r2 = "url"
            r3 = r2
            java.lang.String r2 = r0.getString(r3)
            r4 = 2
            java.lang.Object r8 = ie.i.m0(r4, r8)
            r4 = r8
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.lang.String r8 = "priority"
            int r5 = r0.optInt(r8, r9)
            r8 = 1
            com.unity3d.ads.core.domain.CacheFile r1 = r7.$cacheFile
            kotlin.jvm.internal.k.d(r2, r3)
            com.unity3d.ads.core.data.model.AdObject r3 = r7.$adObject
            r6.label = r8
            java.lang.Object r9 = r1.invoke(r2, r3, r4, r5, r6)
            me.a r8 = me.a.f8833x
            if (r9 != r8) goto L64
            return r8
        L64:
            com.unity3d.ads.core.data.model.CacheResult r9 = (com.unity3d.ads.core.data.model.CacheResult) r9
            boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r8 == 0) goto L83
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unity-ads-cache://unity.ads.cache/"
            r8.<init>(r0)
            com.unity3d.ads.core.data.model.CacheResult$Success r9 = (com.unity3d.ads.core.data.model.CacheResult.Success) r9
            com.unity3d.ads.core.data.model.CachedFile r9 = r9.getCachedFile()
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            return r8
        L83:
            boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
            if (r8 == 0) goto L9b
            com.unity3d.ads.core.data.model.CacheResult$Failure r9 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r9
            com.unity3d.ads.core.data.model.CacheError r8 = r9.getError()
            java.lang.String r8 = r8.name()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L9b:
            a2.x0 r8 = new a2.x0
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
