package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import gf.c0;
import he.y;
import java.util.Map;
import kf.i;
import kf.u0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {75, 79}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1$1 extends j implements p {
    final /* synthetic */ u0 $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, c cVar) {
            super(2, cVar);
            this.this$0 = androidEmbeddableWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(this.this$0, this.$showOptions, cVar);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                this.label = 1;
                Object requestShow = webViewAdPlayer.requestShow(unityAdsShowOptions, this);
                me.a aVar = me.a.f8833x;
                if (requestShow == aVar) {
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
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2, reason: invalid class name */
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
        public final Object invoke(ScarEvent scarEvent, c cVar) {
            return ((AnonymousClass2) create(scarEvent, cVar)).invokeSuspend(y.f6101a);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                he.a.f(obj);
                return Boolean.valueOf(k.a((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass4 implements i, g {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // kf.i
        public final Object emit(BannerBridge.BannerEvent bannerEvent, c cVar) {
            Object sendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, cVar);
            return sendScarBannerEvent == me.a.f8833x ? sendScarBannerEvent : y.f6101a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof i) && (obj instanceof g)) {
                return k.a(getFunctionDelegate(), ((g) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.g
        public final he.c getFunctionDelegate() {
            return new kotlin.jvm.internal.i(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, u0 u0Var, ShowOptions showOptions, c cVar) {
        super(2, cVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$scarEvents = u0Var;
        this.$showOptions = showOptions;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents, this.$showOptions, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r0.collect(r2, r7) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (kf.y0.m(r4, r8, r7) == r3) goto L15;
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
            r1 = 2
            r2 = 1
            me.a r3 = me.a.f8833x
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            he.a.f(r8)
            goto L5d
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            he.a.f(r8)
            goto L42
        L1c:
            he.a.f(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            kf.h r8 = r8.getOnScarEvent()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r4 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r0.<init>(r4, r5, r6)
            kf.u r4 = new kf.u
            r4.<init>(r0, r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2 r8 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2
            r8.<init>(r6)
            r7.label = r2
            java.lang.Object r8 = kf.y0.m(r4, r8, r7)
            if (r8 != r3) goto L42
            goto L5c
        L42:
            kf.u0 r8 = r7.$scarEvents
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1
            r0.<init>()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4 r2 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4
            r2.<init>(r8)
            r7.label = r1
            java.lang.Object r8 = r0.collect(r2, r7)
            if (r8 != r3) goto L5d
        L5c:
            return r3
        L5d:
            he.y r8 = he.y.f6101a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
