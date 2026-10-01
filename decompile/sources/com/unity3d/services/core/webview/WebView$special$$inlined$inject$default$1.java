package com.unity3d.services.core.webview;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebView$special$$inlined$inject$default$1 extends l implements ve.a {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView$special$$inlined$inject$default$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.request.metrics.SDKMetricsSender, java.lang.Object] */
    @Override // ve.a
    public final SDKMetricsSender invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, x.a(SDKMetricsSender.class));
    }
}
