package com.unity3d.services.core.di;

import bf.d;
import he.f;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface IServicesRegistry {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, d dVar, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return iServicesRegistry.getService(str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
        }
    }

    <T> T getService(String str, d dVar);

    Map<ServiceKey, f> getServices();

    <T> T resolveService(ServiceKey serviceKey);

    <T> T resolveServiceOrNull(ServiceKey serviceKey);

    <T> void updateService(ServiceKey serviceKey, f fVar);
}
