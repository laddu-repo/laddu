package v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q implements Iterable, we.a {

    /* renamed from: y, reason: collision with root package name */
    public static final q f13422y = new q(ie.s.f6847x);

    /* renamed from: x, reason: collision with root package name */
    public final Map f13423x;

    public q(Map map) {
        this.f13423x = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (kotlin.jvm.internal.k.a(this.f13423x, ((q) obj).f13423x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13423x.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f13423x;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() == null) {
                arrayList.add(new he.i(str, null));
            } else {
                throw new ClassCastException();
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f13423x + ')';
    }
}
