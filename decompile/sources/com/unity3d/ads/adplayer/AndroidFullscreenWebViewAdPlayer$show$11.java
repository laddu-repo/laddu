package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import gf.c0;
import he.y;
import kf.i;
import kf.q0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {158, 161, 166}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$11 extends j implements p {
    final /* synthetic */ gf.p $listenerStarted;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {160}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, c cVar) {
            super(2, cVar);
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.this$0, this.$showOptions, cVar);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                q0 displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                this.label = 1;
                Object emit = displayMessages.emit(displayReady, this);
                me.a aVar = me.a.f8833x;
                if (emit == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }

        @Override // ve.p
        public final Object invoke(i iVar, c cVar) {
            return ((AnonymousClass1) create(iVar, cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends j implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c cVar) {
            super(2, cVar);
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ve.p
        public final Object invoke(OfferwallShowEvent offerwallShowEvent, c cVar) {
            return ((AnonymousClass2) create(offerwallShowEvent, cVar)).invokeSuspend(y.f6101a);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                he.a.f(obj);
                return Boolean.valueOf(k.a((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass4 implements i, g {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // kf.i
        public final Object emit(OfferwallEvent offerwallEvent, c cVar) {
            Object sendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, cVar);
            return sendOfferwallEvent == me.a.f8833x ? sendOfferwallEvent : y.f6101a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof i) && (obj instanceof g)) {
                return k.a(getFunctionDelegate(), ((g) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.g
        public final he.c getFunctionDelegate() {
            return new kotlin.jvm.internal.i(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$11(gf.p pVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, c cVar) {
        super(2, cVar);
        this.$listenerStarted = pVar;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$11(this.$listenerStarted, this.this$0, this.$showOptions, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$11) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r0.collect(r2, r7) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (kf.y0.m(r3, r8, r7) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (((gf.q) r8).p(r7) == r4) goto L23;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 3
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            he.a.f(r8)
            goto L91
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            he.a.f(r8)
            goto L57
        L20:
            he.a.f(r8)
            goto L34
        L24:
            he.a.f(r8)
            gf.p r8 = r7.$listenerStarted
            r7.label = r3
            gf.q r8 = (gf.q) r8
            java.lang.Object r8 = r8.p(r7)
            if (r8 != r4) goto L34
            goto L90
        L34:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            kf.h r8 = r8.getOnOfferwallEvent()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r3 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r0.<init>(r3, r5, r6)
            kf.u r3 = new kf.u
            r3.<init>(r0, r8)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2
            r8.<init>(r6)
            r7.label = r2
            java.lang.Object r8 = kf.y0.m(r3, r8, r7)
            if (r8 != r4) goto L57
            goto L90
        L57:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.core.data.manager.OfferwallManager r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(r8)
            com.unity3d.ads.adplayer.ShowOptions r0 = r7.$showOptions
            com.unity3d.ads.adplayer.AndroidShowOptions r0 = (com.unity3d.ads.adplayer.AndroidShowOptions) r0
            java.lang.String r0 = r0.getOfferwallPlacementName()
            if (r0 != 0) goto L69
            java.lang.String r0 = ""
        L69:
            kf.h r8 = r8.showAd(r0)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r0 = r7.this$0
            gf.c0 r0 = r0.getScope()
            r2 = 5
            kf.s0 r8 = kf.y0.q(r8, r0, r2)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1
            r0.<init>()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4 r2 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4
            r2.<init>(r8)
            r7.label = r1
            java.lang.Object r8 = r0.collect(r2, r7)
            if (r8 != r4) goto L91
        L90:
            return r4
        L91:
            he.y r8 = he.y.f6101a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
