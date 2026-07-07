package wf;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 implements uf.g {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f14378a = new Object();

    @Override // uf.g
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override // uf.g
    public final boolean c() {
        return false;
    }

    @Override // uf.g
    public final int d(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // uf.g
    public final String f(int i6) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final List g(int i6) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final List getAnnotations() {
        return ie.r.f6846x;
    }

    @Override // uf.g
    public final a8.a getKind() {
        return uf.j.f13139i;
    }

    @Override // uf.g
    public final uf.g h(int i6) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (uf.j.f13139i.hashCode() * 31) - 1818355776;
    }

    @Override // uf.g
    public final boolean i(int i6) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // uf.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
