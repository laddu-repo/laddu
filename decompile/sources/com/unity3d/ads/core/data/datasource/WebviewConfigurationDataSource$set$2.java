package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import he.a;
import he.y;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebviewConfigurationDataSource$set$2 extends j implements p {
    final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c cVar) {
        super(2, cVar);
        this.$data = webViewConfigurationStore;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new WebviewConfigurationDataSource$set$2(this.$data, cVar);
    }

    @Override // ve.p
    public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c cVar) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.f(obj);
            return this.$data;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
