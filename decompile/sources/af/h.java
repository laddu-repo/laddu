package af;

import java.util.LinkedHashMap;
import java.util.Map;
import pd.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements we.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we.a f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f509b;

    public h(we.a aVar) {
        p pVar = p.f531a;
        this.f508a = aVar;
        this.f509b = new g(p.f532b, aVar.d());
    }

    @Override // we.a
    public Object b(cf.k kVar) {
        de.i.e(kVar, "decoder");
        de.i.e(kVar, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        de.i.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        cf.k kVarC = kVar.c(d());
        while (true) {
            int iG = kVarC.g(d());
            if (iG == -1) {
                kVarC.t(d());
                de.i.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i = iG + size;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            de.i.e(linkedHashMap2, "builder");
            p pVar = p.f531a;
            g gVar = this.f509b;
            Object objN = kVarC.n(gVar, i, pVar, null);
            int iG2 = kVarC.g(gVar);
            if (iG2 != i + 1) {
                throw new IllegalArgumentException(j4.a.k(i, iG2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean zContainsKey = linkedHashMap2.containsKey(objN);
            we.a aVar = this.f508a;
            linkedHashMap2.put(objN, (!zContainsKey || (aVar.d().c() instanceof ye.c)) ? kVarC.n(gVar, iG2, aVar, null) : kVarC.n(gVar, iG2, aVar, s.Q(linkedHashMap2, objN)));
        }
    }

    @Override // we.a
    public final void c(cf.l lVar, Object obj) {
        Map map = (Map) obj;
        de.i.e(map, "<this>");
        map.size();
        g gVar = this.f509b;
        de.i.e(gVar, "descriptor");
        cf.l lVarA = lVar.a(gVar);
        Map map2 = (Map) obj;
        de.i.e(map2, "<this>");
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i + 1;
            lVarA.h(gVar, i, p.f531a, key);
            i += 2;
            lVarA.h(gVar, i10, this.f508a, value);
        }
        lVarA.l(gVar);
    }

    @Override // we.a
    public final ye.d d() {
        return this.f509b;
    }
}
