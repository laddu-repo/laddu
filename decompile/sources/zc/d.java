package zc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements jd.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final jd.c f14889v = jd.c.f7075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f14890w;

    public d() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        de.i.d(mapSynchronizedMap, "synchronizedMap(...)");
        this.f14890w = mapSynchronizedMap;
    }

    @Override // jd.e
    public final jd.c J(ad.c cVar, Set set) {
        de.i.e(set, "supportedFileDownloaderTypes");
        return this.f14889v;
    }

    @Override // jd.e
    public final Set U(ad.c cVar) {
        try {
            return z7.b.z(cVar, this);
        } catch (Exception unused) {
            return qf.g.A(this.f14889v);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map map = this.f14890w;
        try {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((kd.a) ((Map.Entry) it.next()).getValue()).a();
            }
            map.clear();
        } catch (Exception unused) {
        }
    }

    @Override // jd.e
    public final void p(jd.d dVar) {
        Map map = this.f14890w;
        if (map.containsKey(dVar)) {
            kd.a aVar = (kd.a) map.get(dVar);
            map.remove(dVar);
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    @Override // jd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jd.d v(ad.c r26, jd.l r27) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d.v(ad.c, jd.l):jd.d");
    }

    @Override // jd.e
    public final void S(ad.c cVar) {
    }

    @Override // jd.e
    public final void Y(ad.c cVar) {
    }

    @Override // jd.e
    public final void z(ad.c cVar) {
    }
}
