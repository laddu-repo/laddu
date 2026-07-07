package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gf.c0;
import gf.f0;
import gf.y;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final c0 adPlayerScope;
    private final AdRepository adRepository;
    private final Context context;
    private final y defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, y defaultDispatcher, c0 adPlayerScope, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, AdRepository adRepository, LifecycleDataSource lifecycleDataSource, OrientationRepository orientationRepository, Context context) {
        k.e(deviceInfoRepository, "deviceInfoRepository");
        k.e(sessionRepository, "sessionRepository");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(adPlayerScope, "adPlayerScope");
        k.e(openMeasurementRepository, "openMeasurementRepository");
        k.e(scarManager, "scarManager");
        k.e(offerwallManager, "offerwallManager");
        k.e(adRepository, "adRepository");
        k.e(lifecycleDataSource, "lifecycleDataSource");
        k.e(orientationRepository, "orientationRepository");
        k.e(context, "context");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = defaultDispatcher;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webviewBridge, AndroidWebViewContainer webviewContainer, ByteString opportunityId, DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        k.e(webviewBridge, "webviewBridge");
        k.e(webviewContainer, "webviewContainer");
        k.e(opportunityId, "opportunityId");
        k.e(adType, "adType");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, f0.y(this.adPlayerScope, new CoroutineOpportunity(opportunityId)));
        if (adType == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN) {
            String uuid = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            SessionRepository sessionRepository = this.sessionRepository;
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            OfferwallManager offerwallManager = this.offerwallManager;
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            AdRepository adRepository = this.adRepository;
            OrientationRepository orientationRepository = this.orientationRepository;
            Context context = this.context;
            k.d(uuid, "toString()");
            return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, uuid, webviewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository, scarManager, offerwallManager, sendDiagnosticEvent, adRepository, orientationRepository, context);
        }
        String uuid2 = ProtobufExtensionsKt.toUUID(opportunityId).toString();
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        LifecycleDataSource lifecycleDataSource = this.lifecycleDataSource;
        Context context2 = this.context;
        k.d(uuid2, "toString()");
        return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, uuid2, webviewContainer, openMeasurementRepository2, scarManager2, lifecycleDataSource, context2);
    }
}
