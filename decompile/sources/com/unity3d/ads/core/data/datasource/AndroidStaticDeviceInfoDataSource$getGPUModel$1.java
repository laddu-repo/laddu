package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.UnityAdsConstants;
import ne.c;
import ne.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE}, m = "getGPUModel")
/* loaded from: classes.dex */
public final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStaticDeviceInfoDataSource$getGPUModel$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, le.c cVar) {
        super(cVar);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        Object gPUModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        gPUModel = this.this$0.getGPUModel(this);
        return gPUModel;
    }
}
