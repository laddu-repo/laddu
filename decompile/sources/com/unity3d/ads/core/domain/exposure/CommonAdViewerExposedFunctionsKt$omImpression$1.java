package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$omImpression$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

    public CommonAdViewerExposedFunctionsKt$omImpression$1(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        this.$omImpressionOccurred = omImpressionOccurred;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r6)
            goto L4d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r6)
            r6 = 0
            r5 = r5[r6]
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.k.c(r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.unity3d.ads.core.domain.om.OmImpressionOccurred r6 = r4.$omImpressionOccurred
            com.unity3d.ads.core.data.model.AdObject r1 = r4.$adObject
            r0.label = r2
            java.lang.Object r5 = r6.invoke(r1, r5, r0)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L4d
            return r6
        L4d:
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
