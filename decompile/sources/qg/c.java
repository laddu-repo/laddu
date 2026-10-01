package qg;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11227a;

    public c(e eVar) {
        this.f11227a = ug.a.a(eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && k.a(this.f11227a, ((c) obj).f11227a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11227a.hashCode();
    }

    public final String toString() {
        return this.f11227a;
    }
}
