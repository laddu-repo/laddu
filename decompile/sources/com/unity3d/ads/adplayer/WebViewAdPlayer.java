package com.unity3d.ads.adplayer;

import androidx.lifecycle.j1;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import gf.b0;
import gf.c0;
import gf.f0;
import gf.y;
import kf.f1;
import kf.h;
import kf.i;
import kf.q0;
import kf.r0;
import kf.u0;
import kf.y0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final y dispatcher;
    private final r0 isCompletedManually;
    private final h onBroadcastEvents;
    private final h onLoadEvent;
    private final h onOfferwallEvent;
    private final h onScarEvent;
    private final h onShowEvent;
    private final c0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final l storageEventCallback;
    private final WebViewContainer webViewContainer;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.l implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // ve.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return he.y.f6101a;
        }

        public final void invoke(Throwable th) {
            Storage.Companion.removeStorageEventCallback(WebViewAdPlayer.this.storageEventCallback);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends j implements p {
        public AnonymousClass2(Object obj) {
            super(2, obj, q0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ve.p
        public final Object invoke(String str, c cVar) {
            return ((q0) this.receiver).emit(str, cVar);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass3 extends j implements p {
        public AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ve.p
        public final Object invoke(String str, c cVar) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, cVar);
        }
    }

    public WebViewAdPlayer(WebViewBridge bridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, y dispatcher, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, c0 adPlayerScope) {
        k.e(bridge, "bridge");
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(sessionRepository, "sessionRepository");
        k.e(dispatcher, "dispatcher");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(webViewContainer, "webViewContainer");
        k.e(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        f1 c10 = y0.c(Boolean.FALSE);
        this.isCompletedManually = c10;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        this.scope = f0.y(f0.y(adPlayerScope, dispatcher), new b0("WebViewAdPlayer"));
        final u0 onInvocation = bridge.getOnInvocation();
        final h hVar = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L50
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
                        java.lang.String r3 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        java.lang.String[] r3 = new java.lang.String[]{r3}
                        java.lang.String r1 = r1.getLocation()
                        boolean r1 = ie.i.Z(r3, r1)
                        if (r1 == 0) goto L50
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L50
                        return r6
                    L50:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        this.onScarEvent = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
                
                    if (r1.emit(r7, r0) == r5) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
                
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(r7, null, r0, 1, null) == r5) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, le.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        me.a r5 = me.a.f8833x
                        if (r1 == 0) goto L3f
                        if (r1 == r3) goto L33
                        if (r1 != r2) goto L2b
                        he.a.f(r8)
                        goto L6e
                    L2b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L33:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r1 = r0.L$0
                        kf.i r1 = (kf.i) r1
                        he.a.f(r8)
                        goto L53
                    L3f:
                        he.a.f(r8)
                        kf.i r1 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r1
                        r0.L$1 = r7
                        r0.label = r3
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r4, r0, r3, r4)
                        if (r8 != r5) goto L53
                        goto L6d
                    L53:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r3 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        boolean r8 = kotlin.jvm.internal.k.a(r8, r3)
                        if (r8 == 0) goto L71
                        com.unity3d.ads.core.data.model.ScarEvent$Show r7 = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE
                        r0.L$0 = r4
                        r0.L$1 = r4
                        r0.label = r2
                        java.lang.Object r7 = r1.emit(r7, r0)
                        if (r7 != r5) goto L6e
                    L6d:
                        return r5
                    L6e:
                        he.y r7 = he.y.f6101a
                        return r7
                    L71:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unexpected location: "
                        r0.<init>(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        final u0 onInvocation2 = bridge.getOnInvocation();
        final h hVar2 = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L50
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
                        java.lang.String r3 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        java.lang.String[] r3 = new java.lang.String[]{r3}
                        java.lang.String r1 = r1.getLocation()
                        boolean r1 = ie.i.Z(r3, r1)
                        if (r1 == 0) goto L50
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L50
                        return r6
                    L50:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        this.onOfferwallEvent = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
                
                    if (r1.emit(r7, r0) == r5) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
                
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(r7, null, r0, 1, null) == r5) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, le.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        me.a r5 = me.a.f8833x
                        if (r1 == 0) goto L3f
                        if (r1 == r3) goto L33
                        if (r1 != r2) goto L2b
                        he.a.f(r8)
                        goto L6e
                    L2b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L33:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r1 = r0.L$0
                        kf.i r1 = (kf.i) r1
                        he.a.f(r8)
                        goto L53
                    L3f:
                        he.a.f(r8)
                        kf.i r1 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r1
                        r0.L$1 = r7
                        r0.label = r3
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r4, r0, r3, r4)
                        if (r8 != r5) goto L53
                        goto L6d
                    L53:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r3 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        boolean r8 = kotlin.jvm.internal.k.a(r8, r3)
                        if (r8 == 0) goto L71
                        com.unity3d.ads.core.data.model.OfferwallShowEvent$Show r7 = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE
                        r0.L$0 = r4
                        r0.L$1 = r4
                        r0.label = r2
                        java.lang.Object r7 = r1.emit(r7, r0)
                        if (r7 != r5) goto L6e
                    L6d:
                        return r5
                    L6e:
                        he.y r7 = he.y.f6101a
                        return r7
                    L71:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Unexpected location: "
                        r0.<init>(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        final u0 onInvocation3 = bridge.getOnInvocation();
        final h hVar3 = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L4e
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
                        java.lang.String[] r3 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r1 = r1.getLocation()
                        boolean r1 = ie.i.Z(r3, r1)
                        if (r1 == 0) goto L4e
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L4e
                        return r6
                    L4e:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        this.onShowEvent = new j1(new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {244, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0107, code lost:
                
                    if (r1.emit(r13, r0) != r5) goto L56;
                 */
                /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0050. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r13, le.c r14) {
                    /*
                        Method dump skipped, instructions count: 320
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        }, c10, new WebViewAdPlayer$onShowEvent$3(null));
        final u0 onInvocation4 = bridge.getOnInvocation();
        final h hVar4 = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L4e
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
                        java.lang.String[] r3 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r1 = r1.getLocation()
                        boolean r1 = ie.i.Z(r3, r1)
                        if (r1 == 0) goto L4e
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L4e
                        return r6
                    L4e:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        this.onLoadEvent = new k7.c(y0.q(new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
                
                    if (r1.emit(r3, r0) != r5) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
                
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(r8, null, r0, 1, null) == r5) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, le.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        me.a r5 = me.a.f8833x
                        if (r1 == 0) goto L3f
                        if (r1 == r3) goto L33
                        if (r1 != r2) goto L2b
                        he.a.f(r9)
                        goto L94
                    L2b:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L33:
                        java.lang.Object r8 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        java.lang.Object r1 = r0.L$0
                        kf.i r1 = (kf.i) r1
                        he.a.f(r9)
                        goto L53
                    L3f:
                        he.a.f(r9)
                        kf.i r1 = r7.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        r0.L$0 = r1
                        r0.L$1 = r8
                        r0.label = r3
                        java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r4, r0, r3, r4)
                        if (r9 != r5) goto L53
                        goto L93
                    L53:
                        java.lang.String r9 = r8.getLocation()
                        java.lang.String r3 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r9 = kotlin.jvm.internal.k.a(r9, r3)
                        if (r9 == 0) goto L85
                        java.lang.Object[] r8 = r8.getParameters()
                        java.lang.Object r8 = ie.i.l0(r8)
                        java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.k.c(r8, r9)
                        org.json.JSONObject r8 = (org.json.JSONObject) r8
                        java.lang.String r9 = "code"
                        int r9 = r8.optInt(r9)
                        java.lang.String r3 = "message"
                        java.lang.String r8 = r8.optString(r3)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r3 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        java.lang.String r6 = "errorMessage"
                        kotlin.jvm.internal.k.d(r8, r6)
                        r3.<init>(r8, r9)
                        goto L87
                    L85:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r3 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L87:
                        r0.L$0 = r4
                        r0.L$1 = r4
                        r0.label = r2
                        java.lang.Object r8 = r1.emit(r3, r0)
                        if (r8 != r5) goto L94
                    L93:
                        return r5
                    L94:
                        he.y r8 = he.y.f6101a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        }, getScope(), 1), 14);
        final u0 onInvocation5 = bridge.getOnInvocation();
        final h hVar5 = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L4c
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.Invocation r1 = (com.unity3d.ads.adplayer.Invocation) r1
                        java.lang.String r1 = r1.getLocation()
                        java.lang.String r3 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r1 = kotlin.jvm.internal.k.a(r1, r3)
                        if (r1 == 0) goto L4c
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L4c
                        return r6
                    L4c:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        h hVar6 = new h() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
                
                    if (r1.emit(r7, r0) != r5) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
                
                    if (com.unity3d.ads.adplayer.Invocation.handle$default(r7, null, r0, 1, null) == r5) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, le.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        me.a r5 = me.a.f8833x
                        if (r1 == 0) goto L3f
                        if (r1 == r3) goto L33
                        if (r1 != r2) goto L2b
                        he.a.f(r8)
                        goto L6c
                    L2b:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L33:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r1 = r0.L$0
                        kf.i r1 = (kf.i) r1
                        he.a.f(r8)
                        goto L53
                    L3f:
                        he.a.f(r8)
                        kf.i r1 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r1
                        r0.L$1 = r7
                        r0.label = r3
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r4, r0, r3, r4)
                        if (r8 != r5) goto L53
                        goto L6b
                    L53:
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = ie.i.l0(r7)
                        java.lang.String r7 = r7.toString()
                        r0.L$0 = r4
                        r0.L$1 = r4
                        r0.label = r2
                        java.lang.Object r7 = r1.emit(r7, r0)
                        if (r7 != r5) goto L6c
                    L6b:
                        return r5
                    L6c:
                        he.y r7 = he.y.f6101a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return he.y.f6101a;
            }
        };
        this.onBroadcastEvents = hVar6;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        f0.q(adPlayerScope.getCoroutineContext()).y(new AnonymousClass1());
        AdPlayer.Companion companion = AdPlayer.Companion;
        y0.p(new j1.f0(6, hVar6, new AnonymousClass2(companion.getBroadcastEventChannel())), getScope());
        y0.p(new j1.f0(6, companion.getBroadcastEventChannel(), new AnonymousClass3(this)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendEvent(ve.a r20, le.c r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = (com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r2 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            he.y r4 = he.y.f6101a
            r5 = 2
            r6 = 1
            me.a r7 = me.a.f8833x
            if (r3 == 0) goto L44
            if (r3 == r6) goto L38
            if (r3 != r5) goto L30
            he.a.f(r1)
            return r4
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r3 = r2.L$1
            ve.a r3 = (ve.a) r3
            java.lang.Object r8 = r2.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r8
            he.a.f(r1)
            goto L5b
        L44:
            he.a.f(r1)
            kf.h r1 = r0.getOnLoadEvent()
            r2.L$0 = r0
            r3 = r20
            r2.L$1 = r3
            r2.label = r6
            java.lang.Object r1 = kf.y0.r(r1, r2)
            if (r1 != r7) goto L5a
            goto Lba
        L5a:
            r8 = r0
        L5b:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r9 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r9 == 0) goto La5
            com.unity3d.ads.core.domain.SendDiagnosticEvent r10 = r8.sendDiagnosticEvent
            he.i r2 = new he.i
            java.lang.String r3 = "reason"
            java.lang.String r7 = "adviewer"
            r2.<init>(r3, r7)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r3 = r1.getMessage()
            he.i r7 = new he.i
            java.lang.String r8 = "reason_debug"
            r7.<init>(r8, r3)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            he.i r3 = new he.i
            java.lang.String r8 = "reason_code"
            r3.<init>(r8, r1)
            r1 = 3
            he.i[] r1 = new he.i[r1]
            r8 = 0
            r1[r8] = r2
            r1[r6] = r7
            r1[r5] = r3
            java.util.Map r13 = ie.w.y(r1)
            r17 = 58
            r18 = 0
            java.lang.String r11 = "bridge_send_event_failed"
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r4
        La5:
            java.lang.Object r1 = r3.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r3 = r8.bridge
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.label = r5
            java.lang.Object r1 = r3.sendEvent(r1, r2)
            if (r1 != r7) goto Lbb
        Lba:
            return r7
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(ve.a, le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(c cVar) {
        return AdPlayer.DefaultImpls.destroy(this, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        r0 r0Var = this.isCompletedManually;
        Boolean bool = Boolean.TRUE;
        f1 f1Var = (f1) r0Var;
        f1Var.getClass();
        f1Var.h(null, bool);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public c0 getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$onAllowedPiiChange$2(bArr), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$onBroadcastEvent$2(str), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0185, code lost:
    
        if (r14.request("webview", "show", r15, r0) != r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> r14, le.c r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(c cVar) {
        Object sendEvent = sendEvent(WebViewAdPlayer$sendActivityDestroyed$2.INSTANCE, cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendFocusChange$2(z10), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(com.unity3d.scar.adapter.common.b bVar, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendGmaEvent$2(bVar), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendMuteChange$2(z10), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendOfferwallEvent$2(offerwallEvent), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendPrivacyFsmChange$2(bArr), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendScarBannerEvent$2(bannerEvent), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendUserConsentChange$2(bArr), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendVisibilityChange$2(z10), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, c cVar) {
        Object sendEvent = sendEvent(new WebViewAdPlayer$sendVolumeChange$2(d10), cVar);
        if (sendEvent == me.a.f8833x) {
            return sendEvent;
        }
        return he.y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
