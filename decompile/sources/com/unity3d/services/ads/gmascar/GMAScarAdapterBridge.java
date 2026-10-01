package com.unity3d.services.ads.gmascar;

import a1.e;
import android.app.Activity;
import android.content.Context;
import bf.y;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import rb.i;
import rg.a;
import sd.c;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private d _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, WebViewErrorHandler webViewErrorHandler, ScarAdapterFactory scarAdapterFactory, GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    private d getScarAdapterObject() {
        MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(b.S, b.T, b.U, b.V)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(c cVar) {
        this._scarAdapter.a(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.f12291e), this._gmaEventSender));
    }

    private void loadRewardedAd(c cVar) {
        this._scarAdapter.c(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.f12291e), this._gmaEventSender));
    }

    public void getSCARBiddingSignals(List<sd.d> list, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            d scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                Context applicationContext = ClientProperties.getApplicationContext();
                y yVar = (y) ((f) scarAdapterObject).f3395a;
                yVar.getClass();
                o oVar = new o();
                a aVar = new a(1);
                for (sd.d dVar : list) {
                    oVar.c();
                    yVar.o(applicationContext, dVar, oVar, aVar);
                }
                i iVar = new i(10, biddingSignalsHandler, aVar);
                if (oVar.f13330x <= 0) {
                    iVar.run();
                    return;
                }
                return;
            }
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }

    public void getSCARSignal(String str, sd.d dVar) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler(this._gmaEventSender);
        d dVar2 = this._scarAdapter;
        if (dVar2 != null) {
            Context applicationContext = ClientProperties.getApplicationContext();
            y yVar = (y) ((f) dVar2).f3395a;
            yVar.getClass();
            HashMap hashMap = new HashMap();
            int i6 = 0 + 1;
            yVar.n(applicationContext, str, dVar);
            if (i6 <= 0) {
                if (hashMap.size() > 0) {
                    signalsHandler.onSignalsCollected(new JSONObject(hashMap).toString());
                    return;
                } else {
                    signalsHandler.onSignalsCollected(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
            }
            return;
        }
        this._webViewErrorHandler.handleError(new g(b.G, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            d scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                return true;
            }
        }
        return false;
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(b.f3392x, new Object[0]);
            this._gmaInitializer.initializeGMA();
        } else {
            this._webViewErrorHandler.handleError(new g(b.f3393y, null, new Object[0]));
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z10, String str, String str2, String str3, String str4, int i6) {
        c cVar = new c(str, str2, str4, str3, Integer.valueOf(i6));
        d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            if (z10) {
                loadInterstitialAd(cVar);
                return;
            } else {
                loadRewardedAd(cVar);
                return;
            }
        }
        this._webViewErrorHandler.handleError(new g(b.K, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
    }

    public void loadBanner(Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler = new ScarBannerAdHandler(this._gmaEventSender, str);
        d dVar = this._scarAdapter;
        if (dVar != null) {
            dVar.b(context, bannerView, cVar, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
        } else {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
        }
    }

    public void show(String str, String str2) {
        d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        int i6 = 2;
        if (scarAdapterObject != null) {
            Activity activity = ClientProperties.getActivity();
            f fVar = (f) scarAdapterObject;
            sd.a aVar = (sd.a) ((ConcurrentHashMap) fVar.f3396b).get(str);
            if (aVar == null) {
                com.unity3d.scar.adapter.common.c cVar = (com.unity3d.scar.adapter.common.c) fVar.f3398d;
                String m9 = h8.c.m("Could not find ad for placement '", str, "'.");
                cVar.handleError(new g(b.M, m9, str, str2, m9));
                return;
            } else {
                fVar.f3397c = aVar;
                a8.i.r(new e(i6, fVar, activity));
                return;
            }
        }
        this._webViewErrorHandler.handleError(new g(b.O, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
    }

    public void getSCARBiddingSignals(boolean z10, BiddingSignalsHandler biddingSignalsHandler) {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            d scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                Context applicationContext = ClientProperties.getApplicationContext();
                y yVar = (y) ((f) scarAdapterObject).f3395a;
                yVar.getClass();
                o oVar = new o();
                a aVar = new a(1);
                oVar.c();
                yVar.o(applicationContext, sd.d.f12293y, oVar, aVar);
                oVar.c();
                yVar.o(applicationContext, sd.d.f12294z, oVar, aVar);
                if (z10) {
                    oVar.c();
                    yVar.o(applicationContext, sd.d.A, oVar, aVar);
                }
                i iVar = new i(10, biddingSignalsHandler, aVar);
                if (oVar.f13330x <= 0) {
                    iVar.run();
                    return;
                }
                return;
            }
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }
}
