package ub;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f13067a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13068b;

    public c(String str, Map map) {
        this.f13067a = str;
        this.f13068b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13067a.equals(cVar.f13067a) && this.f13068b.equals(cVar.f13068b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13068b.hashCode() + (this.f13067a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f13067a + ", properties=" + this.f13068b.values() + "}";
    }
}
