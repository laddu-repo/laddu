package od;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10073a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10074b;

    public d0(List list, List list2) {
        this.f10073a = list;
        this.f10074b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (kotlin.jvm.internal.k.a(this.f10073a, d0Var.f10073a) && kotlin.jvm.internal.k.a(this.f10074b, d0Var.f10074b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10074b.hashCode() + (this.f10073a.hashCode() * 31);
    }

    public final String toString() {
        return "ParsedPlaylist(items=" + this.f10073a + ", groups=" + this.f10074b + ")";
    }
}
