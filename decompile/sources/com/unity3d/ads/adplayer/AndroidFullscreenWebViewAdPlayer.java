package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import gf.c0;
import gf.f0;
import gf.j1;
import gf.q;
import he.f;
import he.y;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kf.h;
import kf.i;
import kf.q0;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final q0 displayMessages = y0.b(0, 7);
    private final f adObject$delegate;
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final AtomicBoolean wasDestroyed;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final q0 getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
        k.e(webViewAdPlayer, "webViewAdPlayer");
        k.e(opportunityId, "opportunityId");
        k.e(webViewContainer, "webViewContainer");
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(sessionRepository, "sessionRepository");
        k.e(openMeasurementRepository, "openMeasurementRepository");
        k.e(scarManager, "scarManager");
        k.e(offerwallManager, "offerwallManager");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(adRepository, "adRepository");
        k.e(orientationRepository, "orientationRepository");
        k.e(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject$delegate = he.a.d(new AndroidFullscreenWebViewAdPlayer$adObject$2(this));
        this.wasDestroyed = new AtomicBoolean(false);
    }

    private final j1 displayEventsRouter(DisplayMessage displayMessage) {
        return f0.w(getScope(), null, new AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(displayMessage, this, null), 3);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, c cVar) {
        boolean z10 = sessionChange instanceof SessionChange.UserConsentChange;
        y yVar = y.f6101a;
        if (z10) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            k.d(byteArray, "change.value.toByteArray()");
            Object sendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, cVar);
            if (sendUserConsentChange == me.a.f8833x) {
                return sendUserConsentChange;
            }
            return yVar;
        }
        if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            k.d(byteArray2, "change.value.toByteArray()");
            Object sendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, cVar);
            if (sendPrivacyFsmChange == me.a.f8833x) {
                return sendPrivacyFsmChange;
            }
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, c cVar) {
        Object sendVolumeChange;
        boolean z10 = volumeSettingsChange instanceof VolumeSettingsChange.MuteChange;
        y yVar = y.f6101a;
        if (z10) {
            Object sendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), cVar);
            if (sendMuteChange == me.a.f8833x) {
                return sendMuteChange;
            }
            return yVar;
        }
        if ((volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) && (sendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), cVar)) == me.a.f8833x) {
            return sendVolumeChange;
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, c cVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return y.f6101a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r10.destroy(r0) == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (gf.f0.k(1000, r0) == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(le.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            he.y r2 = he.y.f6101a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            me.a r7 = me.a.f8833x
            if (r1 == 0) goto L52
            if (r1 == r6) goto L4a
            if (r1 == r5) goto L42
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            he.a.f(r10)
            return r2
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r1
            he.a.f(r10)
            goto La2
        L42:
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r1
            he.a.f(r10)
            goto L93
        L4a:
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r1 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r1
            he.a.f(r10)
            goto L78
        L52:
            he.a.f(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.wasDestroyed
            boolean r10 = r10.getAndSet(r6)
            if (r10 == 0) goto L5e
            goto Lae
        L5e:
            com.unity3d.ads.adplayer.WebViewAdPlayer r10 = r9.webViewAdPlayer
            r10.dispatchShowCompleted()
            kf.q0 r10 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r1 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r8 = r9.opportunityId
            r1.<init>(r8)
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.emit(r1, r0)
            if (r10 != r7) goto L77
            goto Lad
        L77:
            r1 = r9
        L78:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r10 = r1.openMeasurementRepository
            java.lang.String r6 = r1.opportunityId
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r6)
            boolean r10 = r10.hasSessionFinished(r6)
            if (r10 == 0) goto L93
            r0.L$0 = r1
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = gf.f0.k(r5, r0)
            if (r10 != r7) goto L93
            goto Lad
        L93:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r10 = r1.getWebViewContainer()
            r0.L$0 = r1
            r0.label = r4
            java.lang.Object r10 = r10.destroy(r0)
            if (r10 != r7) goto La2
            goto Lad
        La2:
            r10 = 0
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r10 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r1, r0)
            if (r10 != r7) goto Lae
        Lad:
            return r7
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public h getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public c0 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, c cVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, c cVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, c cVar) {
        return this.webViewAdPlayer.requestShow(map, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(c cVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, c cVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(com.unity3d.scar.adapter.common.b bVar, c cVar) {
        return this.webViewAdPlayer.sendGmaEvent(bVar, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, c cVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, c cVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, c cVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, c cVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, c cVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, c cVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, c cVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, cVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        k.e(showOptions, "showOptions");
        if (showOptions instanceof AndroidShowOptions) {
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
            boolean isScarAd = androidShowOptions.isScarAd();
            boolean isOfferwallAd = androidShowOptions.isOfferwallAd();
            q a10 = f0.a();
            final j1.f0 f0Var = new j1.f0(displayMessages, new AndroidFullscreenWebViewAdPlayer$show$1(a10, null));
            int i6 = 6;
            y0.p(new j1.f0(i6, new h() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements i {
                    final /* synthetic */ i $this_unsafeFlow;
                    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(i iVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                        this.$this_unsafeFlow = iVar;
                        this.this$0 = androidFullscreenWebViewAdPlayer;
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
                            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
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
                            com.unity3d.ads.adplayer.DisplayMessage r1 = (com.unity3d.ads.adplayer.DisplayMessage) r1
                            java.lang.String r1 = r1.getOpportunityId()
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r3 = r4.this$0
                            java.lang.String r3 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r3)
                            boolean r1 = kotlin.jvm.internal.k.a(r1, r3)
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
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                    }
                }

                @Override // kf.h
                public Object collect(i iVar, c cVar) {
                    Object collect = h.this.collect(new AnonymousClass2(iVar, this), cVar);
                    if (collect == me.a.f8833x) {
                        return collect;
                    }
                    return y.f6101a;
                }
            }, new AndroidFullscreenWebViewAdPlayer$show$3(this)), getScope());
            y0.p(new j1.f0(i6, this.deviceInfoRepository.getVolumeSettingsChange(), new AndroidFullscreenWebViewAdPlayer$show$4(this)), getScope());
            final h onShowEvent = this.webViewAdPlayer.getOnShowEvent();
            y0.p(new j1.f0(i6, new h() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements i {
                    final /* synthetic */ i $this_unsafeFlow;

                    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            int r1 = r0.label
                            r2 = 1
                            if (r1 == 0) goto L2d
                            if (r1 != r2) goto L25
                            he.a.f(r6)
                            goto L48
                        L25:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2d:
                            he.a.f(r6)
                            kf.i r6 = r4.$this_unsafeFlow
                            r1 = r5
                            com.unity3d.ads.core.data.model.ShowEvent r1 = (com.unity3d.ads.core.data.model.ShowEvent) r1
                            boolean r3 = r1 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                            if (r3 != 0) goto L3d
                            boolean r1 = r1 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                            if (r1 == 0) goto L48
                        L3d:
                            r0.label = r2
                            java.lang.Object r5 = r6.emit(r5, r0)
                            me.a r6 = me.a.f8833x
                            if (r5 != r6) goto L48
                            return r6
                        L48:
                            he.y r5 = he.y.f6101a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                    }
                }

                @Override // kf.h
                public Object collect(i iVar, c cVar) {
                    Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                    if (collect == me.a.f8833x) {
                        return collect;
                    }
                    return y.f6101a;
                }
            }, new AndroidFullscreenWebViewAdPlayer$show$6(this, null)), getScope());
            y0.p(new j1.f0(i6, this.sessionRepository.getOnChange(), new AndroidFullscreenWebViewAdPlayer$show$7(this)), getScope());
            f0.q(getScope().getCoroutineContext()).y(new AndroidFullscreenWebViewAdPlayer$show$8(this));
            if (!isScarAd && !isOfferwallAd) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
                Intent intent = new Intent(this.context, (Class<?>) FullScreenWebViewDisplay.class);
                intent.putExtra("opportunityId", this.opportunityId);
                Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
                if (unityAdsShowOptions != null) {
                    intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
                }
                intent.addFlags(268500992);
                intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
                f0.w(getScope(), null, new AndroidFullscreenWebViewAdPlayer$show$9(a10, this, intent, null), 3);
                return;
            }
            if (isScarAd) {
                ScarManager scarManager = this.scarManager;
                String placementId = androidShowOptions.getPlacementId();
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (placementId == null) {
                    placementId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String scarQueryId = androidShowOptions.getScarQueryId();
                if (scarQueryId != null) {
                    str = scarQueryId;
                }
                f0.w(getScope(), null, new AndroidFullscreenWebViewAdPlayer$show$10(a10, this, y0.q(scarManager.show(placementId, str), getScope(), 10), showOptions, null), 3);
                return;
            }
            f0.w(getScope(), null, new AndroidFullscreenWebViewAdPlayer$show$11(a10, this, showOptions, null), 3);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
