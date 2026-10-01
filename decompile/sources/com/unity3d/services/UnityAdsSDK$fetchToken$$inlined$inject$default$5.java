package com.unity3d.services;

import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.di.IServiceComponent;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityAdsSDK$fetchToken$$inlined$inject$default$5 extends l implements a {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$$inlined$inject$default$5(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.unity3d.ads.core.log.Logger] */
    @Override // ve.a
    public final Logger invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, x.a(Logger.class));
    }
}
