package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.ScarEvent;
import gf.c0;
import he.y;
import kf.i;
import kf.q0;
import kf.u0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {144, 147, 151}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$10 extends j implements p {
    final /* synthetic */ gf.p $listenerStarted;
    final /* synthetic */ u0 $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {146}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1, reason: invalid class name */
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
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2, reason: invalid class name */
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
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass4 implements i, g {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // kf.i
        public final Object emit(com.unity3d.scar.adapter.common.b bVar, c cVar) {
            Object sendGmaEvent = this.$tmp0.sendGmaEvent(bVar, cVar);
            return sendGmaEvent == me.a.f8833x ? sendGmaEvent : y.f6101a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof i) && (obj instanceof g)) {
                return k.a(getFunctionDelegate(), ((g) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.g
        public final he.c getFunctionDelegate() {
            return new kotlin.jvm.internal.i(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$10(gf.p pVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, u0 u0Var, ShowOptions showOptions, c cVar) {
        super(2, cVar);
        this.$listenerStarted = pVar;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$scarEvents = u0Var;
        this.$showOptions = showOptions;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$10(this.$listenerStarted, this.this$0, this.$scarEvents, this.$showOptions, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$10) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r0.collect(r2, r7) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (kf.y0.m(r3, r8, r7) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (((gf.q) r8).p(r7) == r4) goto L20;
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
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            he.a.f(r8)
            goto L71
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            he.a.f(r8)
            goto L56
        L1f:
            he.a.f(r8)
            goto L33
        L23:
            he.a.f(r8)
            gf.p r8 = r7.$listenerStarted
            r7.label = r3
            gf.q r8 = (gf.q) r8
            java.lang.Object r8 = r8.p(r7)
            if (r8 != r4) goto L33
            goto L70
        L33:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            kf.h r8 = r8.getOnScarEvent()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r3 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r0.<init>(r3, r5, r6)
            kf.u r3 = new kf.u
            r3.<init>(r0, r8)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2
            r8.<init>(r6)
            r7.label = r2
            java.lang.Object r8 = kf.y0.m(r3, r8, r7)
            if (r8 != r4) goto L56
            goto L70
        L56:
            kf.u0 r8 = r7.$scarEvents
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1
            r0.<init>()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4 r2 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4
            r2.<init>(r8)
            r7.label = r1
            java.lang.Object r8 = r0.collect(r2, r7)
            if (r8 != r4) goto L71
        L70:
            return r4
        L71:
            he.y r8 = he.y.f6101a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
