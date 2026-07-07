package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$46 extends l implements ve.a {
    public static final HandleInvocationsFromAdViewer$invoke$definition$46 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$46();

    public HandleInvocationsFromAdViewer$invoke$definition$46() {
        super(0);
    }

    @Override // ve.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
    }
}
