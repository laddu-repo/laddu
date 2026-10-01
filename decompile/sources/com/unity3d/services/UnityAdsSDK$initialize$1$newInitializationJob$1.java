package com.unity3d.services;

import gf.c0;
import he.f;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {101, 107}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends j implements p {
    final /* synthetic */ f $alternativeFlowReader$delegate;
    final /* synthetic */ String $gameId;
    final /* synthetic */ c0 $initScope;
    final /* synthetic */ f $initializeBoldSDK$delegate;
    final /* synthetic */ f $initializeSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, String str2, c0 c0Var, f fVar, f fVar2, f fVar3, c cVar) {
        super(2, cVar);
        this.$source = str;
        this.$gameId = str2;
        this.$initScope = c0Var;
        this.$alternativeFlowReader$delegate = fVar;
        this.$initializeBoldSDK$delegate = fVar2;
        this.$initializeSDK$delegate = fVar3;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r7.mo71invokegIAlus(r2, r6) == r0) goto L21;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            he.a.f(r7)
            he.k r7 = (he.k) r7
            r7.getClass()
            goto L97
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            he.a.f(r7)
            goto L97
        L21:
            he.a.f(r7)
            he.f r7 = r6.$alternativeFlowReader$delegate
            com.unity3d.ads.core.configuration.AlternativeFlowReader r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$4$lambda$1(r7)
            boolean r7 = r7.invoke()
            me.a r0 = me.a.f8833x
            if (r7 == 0) goto L43
            he.f r7 = r6.$initializeBoldSDK$delegate
            com.unity3d.ads.core.domain.InitializeBoldSDK r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$4$lambda$3(r7)
            java.lang.String r1 = r6.$source
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L97
            goto L96
        L43:
            boolean r7 = com.unity3d.services.core.properties.SdkProperties.isTestMode()
            if (r7 == 0) goto L4c
            java.lang.String r7 = "test mode"
            goto L4e
        L4c:
            java.lang.String r7 = "production mode"
        L4e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Initializing Unity Services "
            r2.<init>(r3)
            java.lang.String r3 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            int r3 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            r2.append(r3)
            java.lang.String r3 = ") with game id "
            r2.append(r3)
            java.lang.String r3 = r6.$gameId
            java.lang.String r4 = " in "
            java.lang.String r5 = ", session "
            r4.a.u(r2, r3, r4, r7, r5)
            com.unity3d.services.core.properties.Session$Default r7 = com.unity3d.services.core.properties.Session.Default
            java.lang.String r7 = r7.getId()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.unity3d.services.core.log.DeviceLog.info(r7)
            he.f r7 = r6.$initializeSDK$delegate
            com.unity3d.services.core.domain.task.InitializeSDK r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$4$lambda$2(r7)
            com.unity3d.services.core.domain.task.EmptyParams r2 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
            r6.label = r1
            java.lang.Object r7 = r7.mo71invokegIAlus(r2, r6)
            if (r7 != r0) goto L97
        L96:
            return r0
        L97:
            gf.c0 r7 = r6.$initScope
            gf.f0.i(r7)
            he.y r7 = he.y.f6101a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
