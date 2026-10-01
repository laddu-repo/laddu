package com.unity3d.services.ads.api;

import android.view.InputEvent;
import com.unity3d.services.ads.measurements.MeasurementsErrors;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Measurements {
    private static final MeasurementsService measurementsService = (MeasurementsService) Utilities.getService(MeasurementsService.class);

    @WebViewExposed
    public static void checkAvailability(WebViewCallback webViewCallback) {
        measurementsService.checkAvailability();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void registerClick(String str, WebViewCallback webViewCallback) {
        if (AdUnit.getAdUnitActivity() == null) {
            webViewCallback.error(MeasurementsErrors.ERROR_AD_UNIT_NULL, new Object[0]);
            return;
        }
        if (AdUnit.getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(MeasurementsErrors.ERROR_LAYOUT_NULL, new Object[0]);
            return;
        }
        InputEvent lastInputEvent = AdUnit.getAdUnitActivity().getLayout().getLastInputEvent();
        if (lastInputEvent == null) {
            webViewCallback.error(MeasurementsErrors.ERROR_LAST_INPUT_EVENT_NULL, new Object[0]);
        } else {
            measurementsService.registerClick(str, lastInputEvent);
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void registerTrigger(String str, WebViewCallback webViewCallback) {
        measurementsService.registerTrigger(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void registerView(String str, WebViewCallback webViewCallback) {
        measurementsService.registerView(str);
        webViewCallback.invoke(new Object[0]);
    }
}
