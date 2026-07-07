package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;
import ve.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {177, 183, 184}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$2 extends j implements p {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ String $placement;
    final /* synthetic */ r $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$2(LegacyShowUseCase legacyShowUseCase, boolean z10, AdObject adObject, boolean z11, r rVar, String str, c cVar) {
        super(2, cVar);
        this.this$0 = legacyShowUseCase;
        this.$isBanner = z10;
        this.$adObject = adObject;
        this.$useTimeout = z11;
        this.$reportShowError = rVar;
        this.$placement = str;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new LegacyShowUseCase$invoke$2(this.this$0, this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, cVar);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        if (r6.invoke("timeout", r8, r9, null, null, r13) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r14.terminate(r4, r13) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r14 == r5) goto L29;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            he.y r1 = he.y.f6101a
            r2 = 3
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r0 == 0) goto L32
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L22
            if (r0 != r2) goto L1a
            java.lang.Object r0 = r13.L$0
            ve.a r0 = (ve.a) r0
            he.a.f(r14)
            goto Lb5
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            java.lang.Object r0 = r13.L$0
            ve.a r0 = (ve.a) r0
            he.a.f(r14)
            goto L91
        L2a:
            java.lang.Object r0 = r13.L$0
            ve.a r0 = (ve.a) r0
            he.a.f(r14)
            goto L7a
        L32:
            he.a.f(r14)
            java.lang.Object r14 = r13.L$0
            r0 = r14
            ve.a r0 = (ve.a) r0
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            kf.r0 r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r14)
            kf.f1 r14 = (kf.f1) r14
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Lb8
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            kf.r0 r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r14)
            kf.f1 r14 = (kf.f1) r14
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Lb8
            boolean r14 = r13.$isBanner
            if (r14 == 0) goto L67
            goto Lb8
        L67:
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r6 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
            com.unity3d.ads.core.data.model.AdObject r7 = r13.$adObject
            r13.L$0 = r0
            r13.label = r4
            java.lang.String r4 = "timeout"
            java.lang.Object r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r14, r6, r4, r7, r13)
            if (r14 != r5) goto L7a
            goto Lb4
        L7a:
            boolean r14 = r13.$useTimeout
            if (r14 == 0) goto Lb8
            com.unity3d.ads.core.domain.LegacyShowUseCase r14 = r13.this$0
            com.unity3d.ads.core.domain.Show r14 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r14)
            com.unity3d.ads.core.data.model.AdObject r4 = r13.$adObject
            r13.L$0 = r0
            r13.label = r3
            java.lang.Object r14 = r14.terminate(r4, r13)
            if (r14 != r5) goto L91
            goto Lb4
        L91:
            ve.r r6 = r13.$reportShowError
            com.unity3d.ads.UnityAds$UnityAdsShowError r8 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r3 = "[UnityAds] Timeout while trying to show "
            r14.<init>(r3)
            java.lang.String r3 = r13.$placement
            r14.append(r3)
            java.lang.String r9 = r14.toString()
            r13.L$0 = r0
            r13.label = r2
            java.lang.String r7 = "timeout"
            r10 = 0
            r11 = 0
            r12 = r13
            java.lang.Object r14 = r6.invoke(r7, r8, r9, r10, r11, r12)
            if (r14 != r5) goto Lb5
        Lb4:
            return r5
        Lb5:
            r0.invoke()
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ve.p
    public final Object invoke(ve.a aVar, c cVar) {
        return ((LegacyShowUseCase$invoke$2) create(aVar, cVar)).invokeSuspend(y.f6101a);
    }
}
