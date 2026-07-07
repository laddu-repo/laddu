package l7;

import j1.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8254a = f0.V("k", "x", "y");

    public static d7.c a(m7.b bVar, b7.j jVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (bVar.f0() == 1) {
            bVar.d();
            while (bVar.K()) {
                if (bVar.f0() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m7.b bVar2 = bVar;
                b7.j jVar2 = jVar;
                arrayList.add(new e7.l(jVar2, o.b(bVar2, jVar2, n7.i.c(), f.B, z10, false)));
                bVar = bVar2;
                jVar = jVar2;
            }
            bVar.l();
            p.b(arrayList);
        } else {
            arrayList.add(new o7.a(n.b(bVar, n7.i.c())));
        }
        return new d7.c(arrayList);
    }

    public static h7.e b(m7.b bVar, b7.j jVar) {
        bVar.f();
        d7.c cVar = null;
        h7.b bVar2 = null;
        h7.b bVar3 = null;
        boolean z10 = false;
        while (bVar.f0() != 4) {
            int h02 = bVar.h0(f8254a);
            if (h02 != 0) {
                if (h02 != 1) {
                    if (h02 != 2) {
                        bVar.i0();
                        bVar.j0();
                    } else if (bVar.f0() == 6) {
                        bVar.j0();
                        z10 = true;
                    } else {
                        bVar3 = k6.e.h(bVar, jVar, true);
                    }
                } else if (bVar.f0() == 6) {
                    bVar.j0();
                    z10 = true;
                } else {
                    bVar2 = k6.e.h(bVar, jVar, true);
                }
            } else {
                cVar = a(bVar, jVar);
            }
        }
        bVar.m();
        if (z10) {
            jVar.a("Lottie doesn't support expressions.");
        }
        if (cVar != null) {
            return cVar;
        }
        return new h7.c(bVar2, bVar3);
    }
}
