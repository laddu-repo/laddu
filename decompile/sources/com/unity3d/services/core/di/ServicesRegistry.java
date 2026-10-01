package com.unity3d.services.core.di;

import bf.d;
import he.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import ve.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, f> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, a instance, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String named, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.j();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.j();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String named, a instance, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            named = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    public final <T> ServiceKey factory(String named, a instance) {
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    public final <T> T get(String named) {
        k.e(named, "named");
        k.j();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        k.e(named, "named");
        k.j();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String named, d instance) {
        k.e(named, "named");
        k.e(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, f> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey key) {
        k.e(key, "key");
        f fVar = getServices().get(key);
        if (fVar != null) {
            return (T) fVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey key) {
        k.e(key, "key");
        f fVar = getServices().get(key);
        if (fVar == null) {
            return null;
        }
        return (T) fVar.getValue();
    }

    public final <T> ServiceKey single(String named, a instance) {
        k.e(named, "named");
        k.e(instance, "instance");
        k.j();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey key, f instance) {
        k.e(key, "key");
        k.e(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
        } else {
            throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
        }
    }
}
