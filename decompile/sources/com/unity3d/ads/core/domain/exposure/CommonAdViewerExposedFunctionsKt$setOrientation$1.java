package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt$setOrientation$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;

    public CommonAdViewerExposedFunctionsKt$setOrientation$1(AdObject adObject) {
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, ve.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object[] r6, le.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r7)
            goto L63
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            he.a.f(r7)
            r7 = 0
            r6 = r6[r7]
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.k.c(r6, r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r7 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
            kf.q0 r7 = r7.getDisplayMessages()
            com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r1 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
            com.unity3d.ads.core.data.model.AdObject r3 = r5.$adObject
            com.google.protobuf.ByteString r3 = r3.getOpportunityId()
            java.lang.String r3 = r3.toStringUtf8()
            java.lang.String r4 = "adObject.opportunityId.toStringUtf8()"
            kotlin.jvm.internal.k.d(r3, r4)
            r1.<init>(r3, r6)
            r0.label = r2
            java.lang.Object r6 = r7.emit(r1, r0)
            me.a r7 = me.a.f8833x
            if (r6 != r7) goto L63
            return r7
        L63:
            he.y r6 = he.y.f6101a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1.invoke(java.lang.Object[], le.c):java.lang.Object");
    }
}
