package com.unity3d.services.core.api;

import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.Session;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Sdk {
    @WebViewExposed
    public static void downloadLatestWebView(WebViewCallback webViewCallback) {
        DeviceLog.debug("Unity Ads init: WebView called download");
        webViewCallback.invoke(Integer.valueOf(InitializeThread.downloadLatestWebView().getValue()));
    }

    @WebViewExposed
    public static void getDebugMode(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Boolean.valueOf(SdkProperties.getDebugMode()));
    }

    @WebViewExposed
    public static void getSharedSessionID(WebViewCallback webViewCallback) {
        webViewCallback.invoke(Session.Default.getId());
    }

    @WebViewExposed
    public static void getTrrData(WebViewCallback webViewCallback) {
        webViewCallback.invoke(WebViewApp.getCurrentApp().getConfiguration().getRawConfigData().toString());
    }

    @WebViewExposed
    public static void initComplete(WebViewCallback webViewCallback) {
        DeviceLog.debug("Web Application initialized");
        SdkProperties.setInitialized(true);
        WebViewApp.getCurrentApp().setWebAppInitialized(true);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initError(String str, Integer num, WebViewCallback webViewCallback) {
        WebViewApp.getCurrentApp().setWebAppFailureMessage(str);
        WebViewApp.getCurrentApp().setWebAppFailureCode(num.intValue());
        WebViewApp.getCurrentApp().setWebAppInitialized(false);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void loadComplete(WebViewCallback webViewCallback) {
        boolean z10;
        DeviceLog.debug("Web Application loaded");
        WebViewApp.getCurrentApp().setWebAppLoaded(true);
        String gameId = ClientProperties.getGameId();
        Boolean valueOf = Boolean.valueOf(SdkProperties.isTestMode());
        String appName = ClientProperties.getAppName();
        String appVersion = ClientProperties.getAppVersion();
        Integer valueOf2 = Integer.valueOf(SdkProperties.getVersionCode());
        String versionName = SdkProperties.getVersionName();
        Boolean valueOf3 = Boolean.valueOf(ClientProperties.isAppDebuggable());
        String configUrl = SdkProperties.getConfigUrl();
        String webViewUrl = WebViewApp.getCurrentApp().getConfiguration().getWebViewUrl();
        String webViewHash = WebViewApp.getCurrentApp().getConfiguration().getWebViewHash();
        String webViewVersion = WebViewApp.getCurrentApp().getConfiguration().getWebViewVersion();
        Long valueOf4 = Long.valueOf(SdkProperties.getInitializationTime());
        Boolean valueOf5 = Boolean.valueOf(SdkProperties.isReinitialized());
        if (SdkProperties.getLatestConfiguration() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        webViewCallback.invoke(gameId, valueOf, appName, appVersion, valueOf2, versionName, valueOf3, configUrl, webViewUrl, webViewHash, webViewVersion, valueOf4, valueOf5, Boolean.TRUE, Boolean.valueOf(z10), Long.valueOf(Device.getElapsedRealtime()), WebViewApp.getCurrentApp().getConfiguration().getStateId(), PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase());
    }

    @WebViewExposed
    public static void logDebug(String str, WebViewCallback webViewCallback) {
        DeviceLog.debug(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logError(String str, WebViewCallback webViewCallback) {
        DeviceLog.error(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logInfo(String str, WebViewCallback webViewCallback) {
        DeviceLog.info(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logWarning(String str, WebViewCallback webViewCallback) {
        DeviceLog.warning(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void reinitialize(WebViewCallback webViewCallback) {
        SdkProperties.setReinitialized(true);
        InitializeThread.initialize(WebViewApp.getCurrentApp().getConfiguration());
    }

    @WebViewExposed
    public static void setDebugMode(Boolean bool, WebViewCallback webViewCallback) {
        SdkProperties.setDebugMode(bool.booleanValue());
        webViewCallback.invoke(new Object[0]);
    }
}
