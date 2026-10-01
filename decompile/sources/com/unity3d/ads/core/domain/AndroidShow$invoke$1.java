package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import he.y;
import kf.f1;
import kf.i;
import kf.s;
import kf.u;
import le.c;
import ne.e;
import ne.j;
import ve.p;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidShow$invoke$1 extends j implements p {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidShow this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends j implements p {
        final /* synthetic */ AdObject $ad;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, c cVar) {
            super(2, cVar);
            this.$ad = adObject;
            this.this$0 = androidShow;
            this.$adObject = adObject2;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if (r1 == null) goto L11;
         */
        @Override // ne.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                if (r0 != 0) goto L9c
                he.a.f(r13)
                com.unity3d.ads.core.data.model.AdObject r13 = r12.$ad
                com.unity3d.ads.core.domain.AndroidShow r0 = r12.this$0
                com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                java.lang.String r2 = r0.getKey()
                java.lang.Object r1 = r1.get(r2)
                r2 = 0
                if (r1 == 0) goto L26
                boolean r3 = r1 instanceof java.lang.String
                if (r3 == 0) goto L23
                goto L24
            L23:
                r1 = r2
            L24:
                if (r1 != 0) goto L27
            L26:
                r1 = r2
            L27:
                com.unity3d.services.core.misc.JsonStorage r3 = r0.getJsonStorage()
                java.lang.String r4 = r0.getKey()
                java.lang.Object r3 = r3.get(r4)
                if (r3 == 0) goto L40
                com.unity3d.services.core.misc.JsonStorage r3 = r0.getJsonStorage()
                java.lang.String r0 = r0.getKey()
                r3.delete(r0)
            L40:
                java.lang.String r1 = (java.lang.String) r1
                r13.setPlayerServerId(r1)
                com.unity3d.ads.core.data.model.AdObject r13 = r12.$adObject
                kf.r0 r13 = r13.getState()
                com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                kf.f1 r13 = (kf.f1) r13
                r13.g(r0)
                com.unity3d.ads.core.data.model.AdObject r13 = r12.$ad
                com.unity3d.ads.adplayer.AdPlayer r13 = r13.getAdPlayer()
                com.unity3d.ads.UnityAdsShowOptions r0 = r12.$showOptions
                if (r0 == 0) goto L66
                org.json.JSONObject r0 = r0.getData()
                if (r0 == 0) goto L66
                java.util.Map r2 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
            L66:
                r4 = r2
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                boolean r6 = r0.isScarAd()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r8 = r0.getScarAdString()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r7 = r0.getScarQueryId()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r9 = r0.getScarAdUnitId()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                boolean r10 = r0.isOfferwallAd()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r11 = r0.getOfferwallPlacementName()
                com.unity3d.ads.core.data.model.AdObject r0 = r12.$ad
                java.lang.String r5 = r0.getPlacementId()
                com.unity3d.ads.adplayer.AndroidShowOptions r3 = new com.unity3d.ads.adplayer.AndroidShowOptions
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r13.show(r3)
                he.y r13 = he.y.f6101a
                return r13
            L9c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow$invoke$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ve.p
        public final Object invoke(i iVar, c cVar) {
            return ((AnonymousClass2) create(iVar, cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends j implements q {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ ByteString $opportunityId;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AdObject adObject, AndroidShow androidShow, ByteString byteString, c cVar) {
            super(3, cVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$opportunityId = byteString;
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            AdRepository adRepository;
            if (this.label == 0) {
                he.a.f(obj);
                ((f1) this.$adObject.getState()).g(AdObjectState.COMPLETED);
                adRepository = this.this$0.adRepository;
                adRepository.removeAd(this.$opportunityId);
                return y.f6101a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ve.q
        public final Object invoke(i iVar, Throwable th, c cVar) {
            return new AnonymousClass3(this.$adObject, this.this$0, this.$opportunityId, cVar).invokeSuspend(y.f6101a);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends j implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass4(c cVar) {
            super(3, cVar);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            ShowEvent showEvent;
            int i6 = this.label;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    showEvent = (ShowEvent) this.L$0;
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                i iVar = (i) this.L$0;
                showEvent = (ShowEvent) this.L$1;
                this.L$0 = showEvent;
                this.label = 1;
                Object emit = iVar.emit(showEvent, this);
                me.a aVar = me.a.f8833x;
                if (emit == aVar) {
                    return aVar;
                }
            }
            if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // ve.q
        public final Object invoke(i iVar, ShowEvent showEvent, c cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(cVar);
            anonymousClass4.L$0 = iVar;
            anonymousClass4.L$1 = showEvent;
            return anonymousClass4.invokeSuspend(y.f6101a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidShow$invoke$1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, c cVar) {
        super(2, cVar);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidShow$invoke$1 androidShow$invoke$1 = new AndroidShow$invoke$1(this.$adObject, this.this$0, this.$showOptions, cVar);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        AdRepository adRepository;
        SendDiagnosticEvent sendDiagnosticEvent;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                he.a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            final i iVar = (i) this.L$0;
            if (!this.$adObject.getOpportunityId().isEmpty()) {
                ByteString opportunityId = this.$adObject.getOpportunityId();
                adRepository = this.this$0.adRepository;
                AdObject ad2 = adRepository.getAd(opportunityId);
                if (ad2 != null) {
                    sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                    AdPlayer adPlayer = ad2.getAdPlayer();
                    if (adPlayer != null) {
                        lc.c cVar = new lc.c((p) new dd.c(new s(new u(new AnonymousClass2(ad2, this.this$0, this.$adObject, this.$showOptions, null), adPlayer.getOnShowEvent()), new AnonymousClass3(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass4(null), (c) null));
                        i iVar2 = new i() { // from class: com.unity3d.ads.core.domain.AndroidShow$invoke$1.5
                            @Override // kf.i
                            public final Object emit(ShowEvent showEvent, c cVar2) {
                                Object emit = i.this.emit(showEvent, cVar2);
                                return emit == me.a.f8833x ? emit : y.f6101a;
                            }
                        };
                        this.label = 1;
                        Object collect = cVar.collect(iVar2, this);
                        me.a aVar = me.a.f8833x;
                        if (collect == aVar) {
                            return aVar;
                        }
                    } else {
                        throw new IllegalStateException("No adPlayer associated with ad");
                    }
                } else {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
            } else {
                throw new IllegalArgumentException("No opportunityId");
            }
        }
        return y.f6101a;
    }

    @Override // ve.p
    public final Object invoke(i iVar, c cVar) {
        return ((AndroidShow$invoke$1) create(iVar, cVar)).invokeSuspend(y.f6101a);
    }
}
