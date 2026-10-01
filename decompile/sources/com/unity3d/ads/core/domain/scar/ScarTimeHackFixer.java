package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ScarTimeHackFixer {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(SendDiagnosticEvent sendDiagnosticEvent) {
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int i6) {
        if (i6 < 1000) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, null, 62, null);
            return i6 * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        }
        return i6;
    }
}
