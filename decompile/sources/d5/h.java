package d5;

import cf.m;
import df.n;
import ie.j;
import ie.r;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3817a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3818b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f3819c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3820d;

    public h(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        k.e(foreignKeys, "foreignKeys");
        this.f3817a = str;
        this.f3818b = map;
        this.f3819c = foreignKeys;
        this.f3820d = abstractSet;
    }

    public static final h a(i5.c cVar, String str) {
        return lg.c.p(new a5.a(cVar), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (!this.f3817a.equals(hVar.f3817a) || !this.f3818b.equals(hVar.f3818b) || !k.a(this.f3819c, hVar.f3819c)) {
                    return false;
                }
                Set set2 = this.f3820d;
                if (set2 != null && (set = hVar.f3820d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3819c.hashCode() + ((this.f3818b.hashCode() + (this.f3817a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        Collection collection;
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f3817a);
        sb2.append("',\n            |    columns = {");
        sb2.append(m.m(j.T(this.f3818b.values(), new cg.h(3))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(m.m(this.f3819c));
        sb2.append("\n            |    indices = {");
        Set set = this.f3820d;
        if (set != null) {
            collection = j.T(set, new cg.h(4));
        } else {
            collection = r.f6846x;
        }
        sb2.append(m.m(collection));
        sb2.append("\n            |}\n        ");
        return n.t(sb2.toString());
    }
}
