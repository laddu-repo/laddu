package com.unity3d.services.core.di;

import bf.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ServiceKey {
    private final d instanceClass;
    private final String named;

    public ServiceKey(String named, d instanceClass) {
        k.e(named, "named");
        k.e(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, d dVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i6 & 2) != 0) {
            dVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, dVar);
    }

    public final String component1() {
        return this.named;
    }

    public final d component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String named, d instanceClass) {
        k.e(named, "named");
        k.e(instanceClass, "instanceClass");
        return new ServiceKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        if (k.a(this.named, serviceKey.named) && k.a(this.instanceClass, serviceKey.instanceClass)) {
            return true;
        }
        return false;
    }

    public final d getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, d dVar, int i6, f fVar) {
        this((i6 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, dVar);
    }
}
