package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import com.unity3d.ads.core.log.LogLevel;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HandleDebugSettings {
    private final Logger logger;

    public HandleDebugSettings(Logger logger) {
        k.e(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        k.e(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(LogLevel.TRACE);
        }
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
