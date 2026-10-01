package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f912a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f913b;

    public f(int i6, Method method) {
        this.f912a = i6;
        this.f913b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f912a == fVar.f912a && this.f913b.getName().equals(fVar.f913b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f913b.getName().hashCode() + (this.f912a * 31);
    }
}
