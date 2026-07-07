package xg;

import b4.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import n9.j;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* renamed from: x, reason: collision with root package name */
    public final String f14758x;

    /* renamed from: y, reason: collision with root package name */
    public final h f14759y;

    public c(String str, h hVar) {
        this.f14758x = str;
        this.f14759y = hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        rg.b bVar = (rg.b) this.f14759y.B;
        bVar.getClass();
        ConcurrentHashMap concurrentHashMap = bVar.f11957c;
        tg.a aVar = (tg.a) concurrentHashMap.get(this.f14758x);
        if (aVar != null) {
            j jVar = (j) bVar.f11955a.f1469x;
            jVar.getClass();
            lg.b[] bVarArr = (lg.b[]) ((ConcurrentHashMap) jVar.f9356z).values().toArray(new lg.b[0]);
            ArrayList arrayList = new ArrayList();
            for (lg.b bVar2 : bVarArr) {
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                concurrentHashMap.remove(aVar.f12710b);
                return;
            }
            throw r4.a.i(it);
        }
    }
}
