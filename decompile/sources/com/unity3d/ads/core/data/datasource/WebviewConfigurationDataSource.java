package com.unity3d.ads.core.data.datasource;

import b1.g0;
import b1.h;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import he.y;
import kf.u;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import me.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WebviewConfigurationDataSource {
    private final h webviewConfigurationStore;

    public WebviewConfigurationDataSource(h webviewConfigurationStore) {
        k.e(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    public final Object get(c cVar) {
        return y0.l(new u(((g0) this.webviewConfigurationStore).f1301d, new WebviewConfigurationDataSource$get$2(null)), cVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c cVar) {
        Object i6 = ((g0) this.webviewConfigurationStore).i(new WebviewConfigurationDataSource$set$2(webViewConfigurationStore, null), cVar);
        if (i6 == a.f8833x) {
            return i6;
        }
        return y.f6101a;
    }
}
