package qe;

import ce.p;
import de.s;
import re.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sd.c[] f11013a = new sd.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f11014b = new t(0, "NULL");

    public static final Object a(sd.h hVar, Object obj, Object obj2, p pVar, sd.c cVar) {
        Object objI;
        Object objL = re.a.l(hVar, obj2);
        try {
            j jVar = new j(cVar, hVar);
            if (d0.d.s(pVar)) {
                s.a(2, pVar);
                objI = pVar.i(obj, jVar);
            } else {
                de.i.e(pVar, "<this>");
                sd.h hVarF = jVar.f();
                Object bVar = hVarF == sd.i.f11797v ? new td.b(jVar) : new td.c(jVar, hVarF);
                s.a(2, pVar);
                objI = pVar.i(obj, bVar);
            }
            re.a.g(hVar, objL);
            if (objI == td.a.f12544v) {
                de.i.e(cVar, "frame");
            }
            return objI;
        } catch (Throwable th) {
            re.a.g(hVar, objL);
            throw th;
        }
    }
}
