package y9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends n implements Serializable {
    public transient v0 A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient Map f14625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient int f14626z;

    public w0(Map map) {
        p4.v.j(map.isEmpty());
        this.f14625y = map;
    }

    @Override // y9.n
    public final Map a() {
        Map map = this.f14590x;
        if (map != null) {
            return map;
        }
        Map map2 = this.f14625y;
        Map fVar = map2 instanceof NavigableMap ? new f(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new i(this, (SortedMap) map2) : new d(this, map2);
        this.f14590x = fVar;
        return fVar;
    }

    public final void b() {
        Map map = this.f14625y;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f14626z = 0;
    }

    public final Collection c() {
        return (List) this.A.get();
    }
}
