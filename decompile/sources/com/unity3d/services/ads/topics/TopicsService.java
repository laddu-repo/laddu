package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;
import c2.z;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gf.f0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes.dex */
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers dispatchers, IEventSender eventSender) {
        k.e(context, "context");
        k.e(dispatchers, "dispatchers");
        k.e(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        int extensionVersion;
        Object systemService;
        if (Device.getApiLevel() >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            if (extensionVersion >= 4) {
                systemService = context.getSystemService((Class<Object>) z.q());
                return z.k(systemService);
            }
            return null;
        }
        return null;
    }

    public final TopicsStatus checkAvailability() {
        int extensionVersion;
        boolean isAdServicesStateEnabled;
        if (Device.getApiLevel() >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            if (extensionVersion < 4) {
                return TopicsStatus.ERROR_EXTENSION_BELOW_4;
            }
            if (this.topicsManager != null) {
                isAdServicesStateEnabled = AdServicesState.isAdServicesStateEnabled();
                if (!isAdServicesStateEnabled) {
                    return TopicsStatus.ERROR_AD_SERVICES_DISABLED;
                }
                return TopicsStatus.TOPICS_AVAILABLE;
            }
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        return TopicsStatus.ERROR_API_BELOW_33;
    }

    public final void getTopics(String adsSdkName, boolean z10) {
        GetTopicsRequest.Builder adsSdkName2;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        k.e(adsSdkName, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        adsSdkName2 = z.e().setAdsSdkName(adsSdkName);
        shouldRecordObservation = adsSdkName2.setShouldRecordObservation(z10);
        build = shouldRecordObservation.build();
        k.d(build, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(build, f0.f(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e10) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e10.toString());
            DeviceLog.debug("Failed to get topics with error: " + e10);
        }
    }
}
