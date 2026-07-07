package kd;

import java.util.List;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class x {
    public static final w Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final he.f[] f7904c;

    /* renamed from: a, reason: collision with root package name */
    public final List f7905a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7906b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.w, java.lang.Object] */
    static {
        d.a0 a0Var = new d.a0(12);
        he.g gVar = he.g.f6074y;
        f7904c = new he.f[]{he.a.c(gVar, a0Var), he.a.c(gVar, new d.a0(13))};
    }

    public /* synthetic */ x(int i6, List list, List list2) {
        if (3 == (i6 & 3)) {
            this.f7905a = list;
            this.f7906b = list2;
        } else {
            u0.h(i6, 3, v.f7903a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (kotlin.jvm.internal.k.a(this.f7905a, xVar.f7905a) && kotlin.jvm.internal.k.a(this.f7906b, xVar.f7906b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7906b.hashCode() + (this.f7905a.hashCode() * 31);
    }

    public final String toString() {
        return "Events(channels=" + this.f7905a + ", cats=" + this.f7906b + ")";
    }
}
