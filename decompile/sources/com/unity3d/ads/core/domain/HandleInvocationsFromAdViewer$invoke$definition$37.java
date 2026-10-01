package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$37 extends l implements ve.a {
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$37(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
    }

    @Override // ve.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidAttribution.class)));
    }
}
