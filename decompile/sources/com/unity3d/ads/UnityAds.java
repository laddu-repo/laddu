package com.unity3d.ads;

import a2.e1;
import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.misc.Utilities;
import he.a;
import he.y;
import kotlin.jvm.internal.k;
import qd.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static final void getToken$lambda$30$lambda$29$lambda$28(IUnityAdsTokenListener tokenListener) {
        k.e(tokenListener, "$tokenListener");
        tokenListener.onUnityAdsTokenReady(null);
    }

    public static final void getToken$lambda$33$lambda$32(IUnityAdsTokenListener listener) {
        k.e(listener, "$listener");
        listener.onUnityAdsTokenReady(null);
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        k.d(version, "getInstance().version");
        return version;
    }

    public static final void initialize(Context context, String str) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, false, null);
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener listener, Throwable exception) {
        k.e(listener, "$listener");
        k.e(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener listener, Throwable exception) {
        k.e(listener, "$listener");
        k.e(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static final void load(String str) {
        try {
            load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId) {
                    k.e(placementId, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
                    k.e(placementId, "placementId");
                    k.e(error, "error");
                    k.e(message, "message");
                }
            });
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        k.e(loadListener, "$loadListener");
        k.e(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final void load$lambda$26$lambda$25$lambda$24(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        k.e(loadListener, "$loadListener");
        k.e(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final void setDebugMode(boolean z10) {
        try {
            UnityAdsImplementation.getInstance().setDebugMode(z10);
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void show(Activity activity, String str) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener listener, String str, Throwable exception) {
        k.e(listener, "$listener");
        k.e(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        listener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + exception.getMessage());
    }

    public static final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        Object b10;
        try {
            UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        if (he.k.a(b10) == null || iUnityAdsTokenListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new com.unity3d.services.ads.a(iUnityAdsTokenListener, 1));
    }

    public static final void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object b10;
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        Throwable a10 = he.k.a(b10);
        if (a10 == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new qd.a(iUnityAdsInitializationListener, a10, 1));
    }

    public static final void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object b10;
        try {
            UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        Throwable a10 = he.k.a(b10);
        if (a10 == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new b(iUnityAdsLoadListener, str, a10, 0));
    }

    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        try {
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void getToken(TokenConfiguration configuration, IUnityAdsTokenListener listener) {
        Object b10;
        k.e(configuration, "configuration");
        k.e(listener, "listener");
        try {
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        if (he.k.a(b10) != null) {
            Utilities.wrapCustomerListener(new com.unity3d.services.ads.a(listener, 2));
        }
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        Object b10;
        try {
            UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        Throwable a10 = he.k.a(b10);
        if (a10 == null || iUnityAdsShowListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new e1(iUnityAdsShowListener, str, a10, 18));
    }

    public static final void initialize(Context context, String str, boolean z10) {
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, z10, null);
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public static final void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Object b10;
        try {
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (unityAdsLoadOptions == null) {
                unityAdsLoadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        Throwable a10 = he.k.a(b10);
        if (a10 == null || iUnityAdsLoadListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new b(iUnityAdsLoadListener, str, a10, 1));
    }

    public static final void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Object b10;
        try {
            UnityAdsImplementation.getInstance().initialize(context, str, z10, iUnityAdsInitializationListener);
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = a.b(th);
        }
        Throwable a10 = he.k.a(b10);
        if (a10 == null || iUnityAdsInitializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new qd.a(iUnityAdsInitializationListener, a10, 0));
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }
}
