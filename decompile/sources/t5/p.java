package t5;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ob.d f12289a = ob.d.f("k");

    public static ArrayList a(u5.b bVar, j5.j jVar, float f, d0 d0Var, boolean z2) {
        u5.b bVar2;
        j5.j jVar2;
        float f4;
        d0 d0Var2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (bVar.c0() == 6) {
            jVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bVar.i();
        while (bVar.B()) {
            if (bVar.n0(f12289a) != 0) {
                bVar.p0();
            } else if (bVar.c0() == 1) {
                bVar.a();
                if (bVar.c0() == 7) {
                    u5.b bVar3 = bVar;
                    j5.j jVar3 = jVar;
                    float f10 = f;
                    d0 d0Var3 = d0Var;
                    boolean z11 = z2;
                    w5.a aVarB = o.b(bVar3, jVar3, f10, d0Var3, false, z11);
                    bVar2 = bVar3;
                    jVar2 = jVar3;
                    f4 = f10;
                    d0Var2 = d0Var3;
                    z10 = z11;
                    arrayList.add(aVarB);
                } else {
                    bVar2 = bVar;
                    jVar2 = jVar;
                    f4 = f;
                    d0Var2 = d0Var;
                    z10 = z2;
                    while (bVar2.B()) {
                        arrayList.add(o.b(bVar2, jVar2, f4, d0Var2, true, z10));
                    }
                }
                bVar2.l();
                bVar = bVar2;
                jVar = jVar2;
                f = f4;
                d0Var = d0Var2;
                z2 = z10;
            } else {
                u5.b bVar4 = bVar;
                arrayList.add(o.b(bVar4, jVar, f, d0Var, false, z2));
                bVar = bVar4;
            }
        }
        bVar.m();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i = size - 1;
            if (i10 >= i) {
                break;
            }
            w5.a aVar = (w5.a) arrayList.get(i10);
            i10++;
            w5.a aVar2 = (w5.a) arrayList.get(i10);
            aVar.f13903h = Float.valueOf(aVar2.f13902g);
            if (aVar.f13899c == null && (obj = aVar2.f13898b) != null) {
                aVar.f13899c = obj;
                if (aVar instanceof m5.l) {
                    ((m5.l) aVar).d();
                }
            }
        }
        w5.a aVar3 = (w5.a) arrayList.get(i);
        if ((aVar3.f13898b == null || aVar3.f13899c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
