package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import kf.i;
import ve.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$4<T> implements i {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ r $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ LegacyShowUseCase this$0;

    public LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j, String str, Listeners listeners, AdObject adObject, r rVar) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$adObject = adObject;
        this.$reportShowError = rVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|(1:(3:(1:(1:13)(2:17|18))(2:19|20)|14|15)(3:21|22|23))(6:26|27|28|(1:30)(2:31|(1:33)(2:34|(1:36)(2:37|(2:39|(1:41)(3:42|(2:44|23)|25))(2:45|(1:47)(2:48|(1:50))))))|14|15)))|56|6|7|8|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0148, code lost:
    
        if (r2.invoke(r5, r6, r7, r9, r0, r10) != r14) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0189, code lost:
    
        if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) != r14) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0049, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r23, le.c r24) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, le.c):java.lang.Object");
    }
}
