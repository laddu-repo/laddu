package db;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 extends o implements Serializable {
    public final transient Map A;
    public transient int B;
    public transient x0 C;

    public y0(Map map) {
        if (map.isEmpty()) {
            this.A = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // db.o
    public final Map a() {
        Map dVar;
        Map map = this.f4026z;
        if (map == null) {
            Map map2 = this.A;
            if (map2 instanceof NavigableMap) {
                dVar = new f(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                dVar = new i(this, (SortedMap) map2);
            } else {
                dVar = new d(this, map2);
            }
            this.f4026z = dVar;
            return dVar;
        }
        return map;
    }

    public final void c() {
        Map map = this.A;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.B = 0;
    }

    public final Collection d() {
        return (List) this.C.get();
    }
}
