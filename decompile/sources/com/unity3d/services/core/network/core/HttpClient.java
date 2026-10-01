package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface HttpClient {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object execute$default(HttpClient httpClient, HttpRequest httpRequest, boolean z10, c cVar, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 2) != 0) {
                    z10 = false;
                }
                return httpClient.execute(httpRequest, z10, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    Object execute(HttpRequest httpRequest, boolean z10, c cVar);

    HttpResponse executeBlocking(HttpRequest httpRequest);
}
