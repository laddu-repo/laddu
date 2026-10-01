package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class WebViewHandler implements IAdUnitViewHandler {
    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean create(IAdUnitActivity iAdUnitActivity) {
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
            ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
            return true;
        }
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public View getView() {
        if (WebViewApp.getCurrentApp() != null) {
            return WebViewApp.getCurrentApp().getWebView();
        }
        return null;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(IAdUnitActivity iAdUnitActivity) {
        destroy();
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onPause(IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onResume(IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStart(IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStop(IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(IAdUnitActivity iAdUnitActivity, Bundle bundle) {
    }
}
