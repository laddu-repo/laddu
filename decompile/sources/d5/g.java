package d5;

import df.n;
import df.u;
import he.y;
import ie.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3814b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3815c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3816d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public g(String name, boolean z10, List columns, List list) {
        k.e(name, "name");
        k.e(columns, "columns");
        this.f3813a = name;
        this.f3814b = z10;
        this.f3815c = columns;
        this.f3816d = list;
        if (list.isEmpty()) {
            int size = columns.size();
            list = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                list.add("ASC");
            }
        }
        this.f3816d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = gVar.f3813a;
            if (this.f3814b == gVar.f3814b && k.a(this.f3815c, gVar.f3815c) && k.a(this.f3816d, gVar.f3816d)) {
                String str2 = this.f3813a;
                if (u.H(str2, "index_", false)) {
                    return u.H(str, "index_", false);
                }
                return str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f3813a;
        if (u.H(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f3816d.hashCode() + ((this.f3815c.hashCode() + (((hashCode * 31) + (this.f3814b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(this.f3813a);
        sb2.append("',\n            |   unique = '");
        sb2.append(this.f3814b);
        sb2.append("',\n            |   columns = {");
        n.r(j.L(this.f3815c, ",", null, null, null, 62));
        n.r("},");
        y yVar = y.f6101a;
        sb2.append(yVar);
        sb2.append("\n            |   orders = {");
        n.r(j.L(this.f3816d, ",", null, null, null, 62));
        n.r(" }");
        sb2.append(yVar);
        sb2.append("\n            |}\n        ");
        return n.r(n.t(sb2.toString()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.lang.String r6, java.util.List r7) {
        /*
            r5 = this;
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.k.e(r7, r0)
            int r0 = r7.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L10:
            if (r3 >= r0) goto L1a
            java.lang.String r4 = "ASC"
            r1.add(r4)
            int r3 = r3 + 1
            goto L10
        L1a:
            r5.<init>(r6, r2, r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.g.<init>(java.lang.String, java.util.List):void");
    }
}
