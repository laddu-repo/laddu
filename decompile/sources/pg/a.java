package pg;

import ie.j;
import ie.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f10782a;

    /* renamed from: b, reason: collision with root package name */
    public int f10783b;

    public a(int i6, ArrayList arrayList) {
        this.f10782a = (i6 & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(e eVar) {
        Object obj;
        List list = this.f10782a;
        if (list.isEmpty()) {
            return null;
        }
        int i6 = this.f10783b;
        List list2 = this.f10782a;
        Object obj2 = list2.get(i6);
        Object obj3 = null;
        if (!eVar.d(obj2)) {
            obj2 = null;
        }
        if (obj2 != null) {
            obj3 = obj2;
        }
        if (obj3 != null && this.f10783b < k.s(list2)) {
            this.f10783b++;
        }
        if (obj3 == null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (eVar.d(obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                return null;
            }
            return obj;
        }
        return obj3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.k.a(this.f10782a, ((a) obj).f10782a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10782a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + j.Z(this.f10782a);
    }
}
