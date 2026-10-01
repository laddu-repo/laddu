package t4;

import de.i;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import pd.j;
import pd.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f12248d;

    public h(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        i.e(abstractSet, "foreignKeys");
        this.f12245a = str;
        this.f12246b = map;
        this.f12247c = abstractSet;
        this.f12248d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f12245a.equals(hVar.f12245a) || !this.f12246b.equals(hVar.f12246b) || !i.a(this.f12247c, hVar.f12247c)) {
            return false;
        }
        Set set2 = this.f12248d;
        if (set2 == null || (set = hVar.f12248d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f12247c.hashCode() + ((this.f12246b.hashCode() + (this.f12245a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f12245a);
        sb2.append("',\n            |    columns = {");
        sb2.append(fa.b.l(j.M(this.f12246b.values(), new f0.h(7))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(fa.b.l(this.f12247c));
        sb2.append("\n            |    indices = {");
        Set set = this.f12248d;
        sb2.append(fa.b.l(set != null ? j.M(set, new f0.h(8)) : p.f10551v));
        sb2.append("\n            |}\n        ");
        return ke.j.w(sb2.toString());
    }
}
