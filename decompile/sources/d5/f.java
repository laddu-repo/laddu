package d5;

import df.n;
import he.y;
import ie.j;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3809b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3810c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3811d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3812e;

    public f(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        k.e(referenceTable, "referenceTable");
        k.e(onDelete, "onDelete");
        k.e(onUpdate, "onUpdate");
        k.e(columnNames, "columnNames");
        k.e(referenceColumnNames, "referenceColumnNames");
        this.f3808a = referenceTable;
        this.f3809b = onDelete;
        this.f3810c = onUpdate;
        this.f3811d = columnNames;
        this.f3812e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!k.a(this.f3808a, fVar.f3808a) || !k.a(this.f3809b, fVar.f3809b) || !k.a(this.f3810c, fVar.f3810c) || !k.a(this.f3811d, fVar.f3811d)) {
                return false;
            }
            return k.a(this.f3812e, fVar.f3812e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3812e.hashCode() + ((this.f3811d.hashCode() + h8.c.g(this.f3810c, h8.c.g(this.f3809b, this.f3808a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(this.f3808a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(this.f3809b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(this.f3810c);
        sb2.append("',\n            |   columnNames = {");
        n.r(j.L(j.S(this.f3811d), ",", null, null, null, 62));
        n.r("},");
        y yVar = y.f6101a;
        sb2.append(yVar);
        sb2.append("\n            |   referenceColumnNames = {");
        n.r(j.L(j.S(this.f3812e), ",", null, null, null, 62));
        n.r(" }");
        sb2.append(yVar);
        sb2.append("\n            |}\n        ");
        return n.r(n.t(sb2.toString()));
    }
}
