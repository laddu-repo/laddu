package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gf.f0;
import he.a;
import he.f;
import he.y;
import kf.d1;
import kotlin.jvm.internal.k;
import le.c;
import le.j;
import t4.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final f measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        k.e(context, "context");
        k.e(dispatchers, "dispatchers");
        k.e(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = a.d(new AndroidAttribution$measurementManager$2(this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return b.b(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri parse = Uri.parse(str);
        k.d(parse, "parse(this)");
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        k.d(build, "baseUrl.toUri()\n        …4())\n            .build()");
        return build;
    }

    public final Object isAvailable(c cVar) {
        int extensionVersion;
        boolean isAdServicesStateEnabled;
        y yVar;
        if (Device.getApiLevel() >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            if (extensionVersion < 4) {
                return Boolean.FALSE;
            }
            if (getMeasurementManager() != null) {
                isAdServicesStateEnabled = AdServicesState.isAdServicesStateEnabled();
                if (!isAdServicesStateEnabled) {
                    return Boolean.FALSE;
                }
                final j jVar = new j(a8.c.i(cVar));
                MeasurementManager measurementManager = getMeasurementManager();
                if (measurementManager != null) {
                    measurementManager.getMeasurementApiStatus(f0.f(this.dispatchers.getDefault()), new OutcomeReceiver<Integer, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                        @Override // android.os.OutcomeReceiver
                        public /* bridge */ /* synthetic */ void onResult(Integer num) {
                            onResult(num.intValue());
                        }

                        @Override // android.os.OutcomeReceiver
                        public void onError(Exception error) {
                            k.e(error, "error");
                            c.this.resumeWith(Boolean.FALSE);
                        }

                        public void onResult(int i6) {
                            c.this.resumeWith(Boolean.valueOf(i6 == 1));
                        }
                    });
                    yVar = y.f6101a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    jVar.resumeWith(Boolean.FALSE);
                }
                return jVar.b();
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public final Object registerClick(String str, AdObject adObject, c cVar) {
        WebViewContainer webViewContainer;
        d1 lastInputEvent;
        InputEvent inputEvent;
        y yVar;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (webViewContainer = adPlayer.getWebViewContainer()) != null && (lastInputEvent = webViewContainer.getLastInputEvent()) != null && (inputEvent = (InputEvent) lastInputEvent.getValue()) != null) {
            final j jVar = new j(a8.c.i(cVar));
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.registerSource(getUri(str, adObject), inputEvent, f0.f(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                    @Override // android.os.OutcomeReceiver
                    public void onResult(Object p02) {
                        k.e(p02, "p0");
                        c.this.resumeWith(Boolean.TRUE);
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onError(Exception error) {
                        k.e(error, "error");
                        c.this.resumeWith(Boolean.FALSE);
                    }
                });
                yVar = y.f6101a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                jVar.resumeWith(Boolean.FALSE);
            }
            return jVar.b();
        }
        return Boolean.FALSE;
    }

    public final Object registerView(String str, AdObject adObject, c cVar) {
        y yVar;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final j jVar = new j(a8.c.i(cVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, f0.f(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(Object p02) {
                    k.e(p02, "p0");
                    c.this.resumeWith(Boolean.TRUE);
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception error) {
                    k.e(error, "error");
                    c.this.resumeWith(Boolean.FALSE);
                }
            });
            yVar = y.f6101a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            jVar.resumeWith(Boolean.FALSE);
        }
        return jVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        int extensionVersion;
        Object systemService;
        if (Device.getApiLevel() < 33) {
            return null;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        if (extensionVersion < 4) {
            return null;
        }
        systemService = context.getSystemService((Class<Object>) b.c());
        return b.b(systemService);
    }
}
