package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import he.y;
import java.util.Map;
import kotlin.jvm.internal.l;
import le.c;
import ne.e;
import ne.j;
import ve.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyShowUseCase$showError$1 extends j implements r {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    final /* synthetic */ ef.j $startTime;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements ve.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $message;
        final /* synthetic */ String $placement;
        final /* synthetic */ UnityAds.UnityAdsShowError $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
            this.$reason = unityAdsShowError;
            this.$message = str2;
        }

        @Override // ve.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return y.f6101a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            this.$listeners.onError(this.$placement, this.$reason, this.$message);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showError$1(LegacyShowUseCase legacyShowUseCase, String str, ef.j jVar, Listeners listeners, String str2, c cVar) {
        super(6, cVar);
        this.this$0 = legacyShowUseCase;
        this.$opportunityId = str;
        this.$startTime = jVar;
        this.$listeners = listeners;
        this.$placement = str2;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String adInfoString;
        AdObject adObject;
        SendDiagnosticEvent sendDiagnosticEvent;
        Map tags;
        SafeCallbackInvoke safeCallbackInvoke;
        if (this.label == 0) {
            he.a.f(obj);
            String str = (String) this.L$0;
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            logger = this.this$0.logger;
            StringBuilder sb2 = new StringBuilder("Failed to show ad ");
            adInfoString = this.this$0.getAdInfoString();
            sb2.append(adInfoString);
            sb2.append(", error: ");
            sb2.append(str2);
            Logger.DefaultImpls.error$default(logger, sb2.toString(), null, 2, null);
            adObject = this.this$0.adObject;
            if (adObject == null) {
                adObject = this.this$0.getTmpAdObject(this.$opportunityId);
            }
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            Double d10 = new Double(TimeExtensionsKt.elapsedMillis(this.$startTime));
            tags = this.this$0.getTags(str, num, str3);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_failure_time", d10, tags, null, adObject, null, 40, null);
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            safeCallbackInvoke.invoke(new AnonymousClass1(this.$listeners, this.$placement, unityAdsShowError, str2));
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ve.r
    public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, c cVar) {
        LegacyShowUseCase$showError$1 legacyShowUseCase$showError$1 = new LegacyShowUseCase$showError$1(this.this$0, this.$opportunityId, this.$startTime, this.$listeners, this.$placement, cVar);
        legacyShowUseCase$showError$1.L$0 = str;
        legacyShowUseCase$showError$1.L$1 = unityAdsShowError;
        legacyShowUseCase$showError$1.L$2 = str2;
        legacyShowUseCase$showError$1.L$3 = num;
        legacyShowUseCase$showError$1.L$4 = str3;
        return legacyShowUseCase$showError$1.invokeSuspend(y.f6101a);
    }
}
