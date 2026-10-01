package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import he.y;
import kf.i;
import le.c;
import ne.e;
import ne.j;
import ve.q;
import ve.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$3 extends j implements q {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ r $reportShowError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$3(r rVar, boolean z10, c cVar) {
        super(3, cVar);
        this.$reportShowError = rVar;
        this.$isBanner = z10;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
                legacyShowUseCase$invoke$3 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            Throwable th = (Throwable) this.L$0;
            r rVar = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
            this.label = 1;
            legacyShowUseCase$invoke$3 = this;
            Object invoke = rVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$3);
            me.a aVar = me.a.f8833x;
            if (invoke == aVar) {
                return aVar;
            }
        }
        if (!legacyShowUseCase$invoke$3.$isBanner) {
            LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return y.f6101a;
    }

    @Override // ve.q
    public final Object invoke(i iVar, Throwable th, c cVar) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, cVar);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(y.f6101a);
    }
}
