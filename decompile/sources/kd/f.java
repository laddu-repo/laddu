package kd;

import java.util.List;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final he.f[] f7849f;

    /* renamed from: a, reason: collision with root package name */
    public final String f7850a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7851b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7852c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7853d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7854e;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.e, java.lang.Object] */
    static {
        d.a0 a0Var = new d.a0(8);
        he.g gVar = he.g.f6074y;
        f7849f = new he.f[]{null, he.a.c(gVar, a0Var), null, null, he.a.c(gVar, new d.a0(9))};
    }

    public /* synthetic */ f(int i6, String str, List list, String str2, String str3, List list2) {
        if (7 == (i6 & 7)) {
            this.f7850a = str;
            this.f7851b = list;
            this.f7852c = str2;
            if ((i6 & 8) == 0) {
                this.f7853d = null;
            } else {
                this.f7853d = str3;
            }
            if ((i6 & 16) == 0) {
                this.f7854e = ie.r.f6846x;
                return;
            } else {
                this.f7854e = list2;
                return;
            }
        }
        u0.h(i6, 7, d.f7844a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.k.a(this.f7850a, fVar.f7850a) && kotlin.jvm.internal.k.a(this.f7851b, fVar.f7851b) && kotlin.jvm.internal.k.a(this.f7852c, fVar.f7852c) && kotlin.jvm.internal.k.a(this.f7853d, fVar.f7853d) && kotlin.jvm.internal.k.a(this.f7854e, fVar.f7854e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        String str = this.f7850a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g10 = h8.c.g(this.f7852c, (this.f7851b.hashCode() + (hashCode * 31)) * 31, 31);
        String str2 = this.f7853d;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return this.f7854e.hashCode() + ((g10 + i6) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppData(sig=");
        sb2.append(this.f7850a);
        sb2.append(", dataRows=");
        sb2.append(this.f7851b);
        sb2.append(", ads=");
        r4.a.u(sb2, this.f7852c, ", updateUrl=", this.f7853d, ", items=");
        sb2.append(this.f7854e);
        sb2.append(")");
        return sb2.toString();
    }
}
