package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import gf.c0;
import gf.f0;
import java.util.Map;
import java.util.WeakHashMap;
import kf.h;
import kf.s0;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import okhttp3.HttpUrl;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, LifecycleDataSource lifecycleDataSource, Context context) {
        k.e(webViewAdPlayer, "webViewAdPlayer");
        k.e(opportunityId, "opportunityId");
        k.e(webViewContainer, "webViewContainer");
        k.e(openMeasurementRepository, "openMeasurementRepository");
        k.e(scarManager, "scarManager");
        k.e(lifecycleDataSource, "lifecycleDataSource");
        k.e(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r1, r0) == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r9.destroy(r0) != r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (gf.f0.k(1000, r0) == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(le.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            he.a.f(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r1 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r1
            he.a.f(r9)
            goto L78
        L3d:
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r1 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r1
            he.a.f(r9)
            goto L69
        L45:
            he.a.f(r9)
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = r8.webViewAdPlayer
            r9.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r8.openMeasurementRepository
            java.lang.String r1 = r8.opportunityId
            com.google.protobuf.ByteString r1 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r1)
            boolean r9 = r9.hasSessionFinished(r1)
            if (r9 == 0) goto L68
            r0.L$0 = r8
            r0.label = r4
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = gf.f0.k(r6, r0)
            if (r9 != r5) goto L68
            goto L83
        L68:
            r1 = r8
        L69:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r1.getWebViewContainer()
            r0.L$0 = r1
            r0.label = r3
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r5) goto L78
            goto L83
        L78:
            r9 = 0
            r0.L$0 = r9
            r0.label = r2
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r1, r0)
            if (r9 != r5) goto L84
        L83:
            return r5
        L84:
            he.y r9 = he.y.f6101a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(le.c):java.lang.Object");
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
    public void show(final ShowOptions showOptions) {
        String str;
        String str2;
        k.e(showOptions, "showOptions");
        if (showOptions instanceof AndroidShowOptions) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            final BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
            if (bannerView == null) {
                if (bannerViewCache.isBannerViewDeleted(this.opportunityId)) {
                    str2 = "BannerView has been deleted";
                } else {
                    str2 = "BannerView not found";
                }
                throw new IllegalStateException(str2.toString());
            }
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
            if (androidShowOptions.isScarAd()) {
                String placementId = androidShowOptions.getPlacementId();
                if (placementId == null) {
                    placementId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String scarQueryId = androidShowOptions.getScarQueryId();
                if (scarQueryId == null) {
                    scarQueryId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String scarAdUnitId = androidShowOptions.getScarAdUnitId();
                if (scarAdUnitId == null) {
                    scarAdUnitId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String scarAdString = androidShowOptions.getScarAdString();
                if (scarAdString == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str = scarAdString;
                }
                sd.c cVar = new sd.c(placementId, scarQueryId, scarAdUnitId, str, 0);
                ScarManager scarManager = this.scarManager;
                Context context = this.context;
                UnityBannerSize size = bannerView.getSize();
                k.d(size, "bannerView.size");
                final s0 q9 = y0.q(scarManager.loadBannerAd(context, bannerView, cVar, size, this.opportunityId), getScope(), 10);
                WeakHashMap weakHashMap = q0.f12397a;
                if (bannerView.isAttachedToWindow()) {
                    f0.w(getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, q9, showOptions, null), 3);
                    if (!bannerView.isAttachedToWindow()) {
                        f0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3);
                        return;
                    } else {
                        bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this));
                        return;
                    }
                }
                bannerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        k.e(view, "view");
                        bannerView.removeOnAttachStateChangeListener(this);
                        f0.w(this.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, q9, showOptions, null), 3);
                        BannerView bannerView2 = bannerView;
                        WeakHashMap weakHashMap2 = q0.f12397a;
                        if (!bannerView2.isAttachedToWindow()) {
                            f0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3);
                        } else {
                            bannerView2.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView2, this));
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        k.e(view, "view");
                    }
                });
                return;
            }
            f0.w(f0.d(), null, new AndroidEmbeddableWebViewAdPlayer$show$2(this, bannerView, null), 3);
            final WebView webView = getWebViewContainer().getWebView();
            WeakHashMap weakHashMap2 = q0.f12397a;
            if (webView.isAttachedToWindow()) {
                f0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                if (!webView.isAttachedToWindow()) {
                    f0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                } else {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        k.e(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        f0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                        WeakHashMap weakHashMap3 = q0.f12397a;
                        if (!view.isAttachedToWindow()) {
                            f0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                        } else {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this));
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        k.e(view, "view");
                    }
                });
            }
            f0.w(f0.d(), null, new AndroidEmbeddableWebViewAdPlayer$show$4(bannerView, this, null), 3);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
