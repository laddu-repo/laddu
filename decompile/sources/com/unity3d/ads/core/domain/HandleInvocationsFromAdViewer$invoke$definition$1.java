package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$1 extends l implements ve.a {
    final /* synthetic */ String $adDataObject;
    final /* synthetic */ String $adDataRefreshTokenObject;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $impressionConfigObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adDataObject = str;
        this.$impressionConfigObject = str2;
        this.$adDataRefreshTokenObject = str3;
        this.$adObject = adObject;
    }

    @Override // ve.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.m65getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(AndroidGetAdPlayerContext.class)), this.$adDataObject, this.$impressionConfigObject, this.$adDataRefreshTokenObject, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService(HttpUrl.FRAGMENT_ENCODE_SET, x.a(IsOMActivated.class)), this.$adObject);
    }
}
