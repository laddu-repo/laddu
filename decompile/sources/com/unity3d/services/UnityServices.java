package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityServices {
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    private UnityServices() {
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        k.d(versionName, "getVersionName()");
        return versionName;
    }

    public static final synchronized void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(iUnityAdsInitializationListener);
            SdkProperties.setTestMode(z10);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, null), str, null, 2, null);
        }
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final void setDebugMode(boolean z10) {
        SdkProperties.setDebugMode(z10);
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static /* synthetic */ void isSupported$annotations() {
    }
}
