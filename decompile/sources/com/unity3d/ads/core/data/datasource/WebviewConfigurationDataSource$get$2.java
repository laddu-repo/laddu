package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import he.a;
import he.y;
import kf.i;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebviewConfigurationDataSource$get$2 extends j implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public WebviewConfigurationDataSource$get$2(c cVar) {
        super(3, cVar);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a.f(obj);
            i iVar = (i) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof b1.a) {
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                k.d(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                Object emit = iVar.emit(defaultInstance, this);
                me.a aVar = me.a.f8833x;
                if (emit == aVar) {
                    return aVar;
                }
            } else {
                throw th;
            }
        }
        return y.f6101a;
    }

    @Override // ve.q
    public final Object invoke(i iVar, Throwable th, c cVar) {
        WebviewConfigurationDataSource$get$2 webviewConfigurationDataSource$get$2 = new WebviewConfigurationDataSource$get$2(cVar);
        webviewConfigurationDataSource$get$2.L$0 = iVar;
        webviewConfigurationDataSource$get$2.L$1 = th;
        return webviewConfigurationDataSource$get$2.invokeSuspend(y.f6101a);
    }
}
