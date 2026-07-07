package com.unity3d.services.banners;

import a2.a;
import android.content.Context;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import java.util.UUID;
import org.json.JSONObject;
import sd.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class BannerView extends RelativeLayout {
    private BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge;
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    private String viewId;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.banners.BannerView$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ BannerView val$self;

        public AnonymousClass1(BannerView bannerView) {
            r2 = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = r2.getParent();
            if (parent != null && (parent instanceof ViewManager)) {
                ((ViewManager) parent).removeView(r2);
            }
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.banners.BannerView$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ BannerView val$self;
        final /* synthetic */ UnityBannerSize val$unityBannerSize;

        public AnonymousClass2(BannerView bannerView, UnityBannerSize unityBannerSize) {
            r2 = bannerView;
            r3 = unityBannerSize;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(r2.viewId);
            JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(r2.viewId);
            JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(r2.viewId);
            if (r2.bannerWebPlayerContainer == null) {
                r2.bannerWebPlayerContainer = new BannerWebPlayerContainer(r2.getContext(), r2.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, r3);
                BannerView bannerView = r2;
                bannerView.addView(bannerView.bannerWebPlayerContainer);
                return;
            }
            r2.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
            r2.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.banners.BannerView$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements IInitializationListener {
        final /* synthetic */ BannerView val$bannerView;

        public AnonymousClass3(BannerView bannerView) {
            r2 = bannerView;
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitializationFailed(String str, ErrorState errorState, int i6) {
            r2.unregisterInitializeListener();
            if (r2.getListener() != null) {
                r2.getListener().onBannerFailedToLoad(r2, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
            }
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitialized() {
            r2.unregisterInitializeListener();
            r2.bridgeLoad();
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);

        void onBannerShown(BannerView bannerView);
    }

    public BannerView(Context context, String str, UnityBannerSize unityBannerSize) {
        super(context);
        this.gmaScarAdapterBridge = GMA.getInstance().getBridge();
        this.viewId = UUID.randomUUID().toString();
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        BannerViewCache.getInstance().addBannerView(this);
    }

    public static /* synthetic */ void a(BannerView bannerView) {
        bannerView.lambda$addScarContainer$0();
    }

    public void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    public /* synthetic */ void lambda$addScarContainer$0() {
        addView(this.scarBannerContainer);
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new IInitializationListener() { // from class: com.unity3d.services.banners.BannerView.3
            final /* synthetic */ BannerView val$bannerView;

            public AnonymousClass3(BannerView this) {
                r2 = this;
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitializationFailed(String str, ErrorState errorState, int i6) {
                r2.unregisterInitializeListener();
                if (r2.getListener() != null) {
                    r2.getListener().onBannerFailedToLoad(r2, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
                }
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitialized() {
                r2.unregisterInitializeListener();
                r2.bridgeLoad();
            }
        };
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    public void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(getContext(), this.viewId);
        Utilities.runOnUiThread(new a(this, 14));
    }

    public void destroy() {
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK();
        unityAdsSDK.sendBannerDestroyed();
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        unityAdsSDK.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.BannerView.1
            final /* synthetic */ BannerView val$self;

            public AnonymousClass1(BannerView this) {
                r2 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewParent parent = r2.getParent();
                if (parent != null && (parent instanceof ViewManager)) {
                    ((ViewManager) parent).removeView(r2);
                }
            }
        });
        BannerWebPlayerContainer bannerWebPlayerContainer = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer != null) {
            bannerWebPlayerContainer.destroy();
        }
        ScarBannerContainer scarBannerContainer = this.scarBannerContainer;
        if (scarBannerContainer != null) {
            scarBannerContainer.destroy();
        }
        DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void load() {
        bridgeLoad();
    }

    public void loadScarPlayer(String str, c cVar, UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, cVar, unityBannerSize);
    }

    public void loadWebPlayer(UnityBannerSize unityBannerSize) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.BannerView.2
            final /* synthetic */ BannerView val$self;
            final /* synthetic */ UnityBannerSize val$unityBannerSize;

            public AnonymousClass2(BannerView this, UnityBannerSize unityBannerSize2) {
                r2 = this;
                r3 = unityBannerSize2;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(r2.viewId);
                JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(r2.viewId);
                JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(r2.viewId);
                if (r2.bannerWebPlayerContainer == null) {
                    r2.bannerWebPlayerContainer = new BannerWebPlayerContainer(r2.getContext(), r2.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, r3);
                    BannerView bannerView = r2;
                    bannerView.addView(bannerView.bannerWebPlayerContainer);
                    return;
                }
                r2.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                r2.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
            }
        });
    }

    public void setListener(IListener iListener) {
        this.listener = iListener;
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions) {
        String objectId;
        if (unityAdsLoadOptions != null && (objectId = unityAdsLoadOptions.getObjectId()) != null) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            bannerViewCache.removeBannerView(this.viewId);
            this.viewId = objectId;
            bannerViewCache.addBannerView(this);
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static abstract class Listener implements IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }
    }
}
