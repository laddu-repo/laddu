package m2;

import db.n0;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8438a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8439b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8441d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8442e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8443f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8444g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8445h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f8446i;
    public final b j;

    public c(a aVar, n0 n0Var, b bVar) {
        this.f8438a = aVar.f8413a;
        this.f8439b = aVar.f8414b;
        this.f8440c = aVar.f8415c;
        this.f8441d = aVar.f8416d;
        this.f8443f = aVar.f8419g;
        this.f8444g = aVar.f8420h;
        this.f8442e = aVar.f8418f;
        this.f8445h = aVar.f8421i;
        this.f8446i = n0Var;
        this.j = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f8438a.equals(cVar.f8438a) && this.f8439b == cVar.f8439b && this.f8440c.equals(cVar.f8440c) && this.f8441d == cVar.f8441d && this.f8442e == cVar.f8442e) {
                n0 n0Var = cVar.f8446i;
                n0 n0Var2 = this.f8446i;
                n0Var2.getClass();
                if (db.r.h(n0Var, n0Var2) && this.j.equals(cVar.j) && Objects.equals(this.f8443f, cVar.f8443f) && Objects.equals(this.f8444g, cVar.f8444g) && Objects.equals(this.f8445h, cVar.f8445h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.j.hashCode() + ((this.f8446i.hashCode() + ((((h8.c.g(this.f8440c, (h8.c.g(this.f8438a, 217, 31) + this.f8439b) * 31, 31) + this.f8441d) * 31) + this.f8442e) * 31)) * 31)) * 31;
        int i6 = 0;
        String str = this.f8443f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        String str2 = this.f8444g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f8445h;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return i11 + i6;
    }
}
