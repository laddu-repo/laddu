package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import he.i;
import ie.w;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(getGameId, "getGameId");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z10) {
        if (z10) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, null, 58, null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z10) {
        String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> y9 = w.y(new i("previous_game_id", previousGameId), new i("game_id", invoke));
        if (!previousGameId.equals("null")) {
            if (!invoke.equals(previousGameId)) {
                sendDiagnostic("native_initialize_game_id_changed", y9, z10);
            } else {
                sendDiagnostic("native_initialize_game_id_same", y9, z10);
            }
            boolean isTestMode = SdkProperties.isTestMode();
            boolean previousTestMode = SdkProperties.getPreviousTestMode();
            Map<String, String> y10 = w.y(new i("previous_test_mode", String.valueOf(previousTestMode)), new i("test_mode", String.valueOf(isTestMode)));
            if (isTestMode != previousTestMode) {
                sendDiagnostic("native_initialize_test_mode_changed", y10, z10);
            } else {
                sendDiagnostic("native_initialize_test_mode_same", y10, z10);
            }
        }
    }
}
