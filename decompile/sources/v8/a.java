package v8;

import java.util.Arrays;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13440a;

    /* renamed from: b, reason: collision with root package name */
    public final s8.l f13441b;

    /* renamed from: c, reason: collision with root package name */
    public final w8.o f13442c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13443d;

    public a(s8.l lVar, w8.o oVar, String str) {
        this.f13441b = lVar;
        this.f13442c = oVar;
        this.f13443d = str;
        this.f13440a = Arrays.hashCode(new Object[]{lVar, oVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (x.j(this.f13441b, aVar.f13441b) && x.j(this.f13442c, aVar.f13442c) && x.j(this.f13443d, aVar.f13443d)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13440a;
    }
}
