package l7;

import j1.f0;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8293a = f0.V("k");

    public static ArrayList a(m7.a aVar, b7.j jVar, float f3, d0 d0Var, boolean z10) {
        m7.a aVar2;
        b7.j jVar2;
        float f10;
        d0 d0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (aVar.f0() == 6) {
            jVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.f();
        while (aVar.K()) {
            if (aVar.h0(f8293a) != 0) {
                aVar.j0();
            } else if (aVar.f0() == 1) {
                aVar.d();
                if (aVar.f0() == 7) {
                    m7.a aVar3 = aVar;
                    b7.j jVar3 = jVar;
                    float f11 = f3;
                    d0 d0Var3 = d0Var;
                    boolean z12 = z10;
                    o7.a b10 = o.b(aVar3, jVar3, f11, d0Var3, false, z12);
                    aVar2 = aVar3;
                    jVar2 = jVar3;
                    f10 = f11;
                    d0Var2 = d0Var3;
                    z11 = z12;
                    arrayList.add(b10);
                } else {
                    aVar2 = aVar;
                    jVar2 = jVar;
                    f10 = f3;
                    d0Var2 = d0Var;
                    z11 = z10;
                    while (aVar2.K()) {
                        arrayList.add(o.b(aVar2, jVar2, f10, d0Var2, true, z11));
                    }
                }
                aVar2.l();
                aVar = aVar2;
                jVar = jVar2;
                f3 = f10;
                d0Var = d0Var2;
                z10 = z11;
            } else {
                m7.a aVar4 = aVar;
                arrayList.add(o.b(aVar4, jVar, f3, d0Var, false, z10));
                aVar = aVar4;
            }
        }
        aVar.m();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i6;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i6 = size - 1;
            if (i10 >= i6) {
                break;
            }
            o7.a aVar = (o7.a) arrayList.get(i10);
            i10++;
            o7.a aVar2 = (o7.a) arrayList.get(i10);
            aVar.f10019h = Float.valueOf(aVar2.f10018g);
            if (aVar.f10014c == null && (obj = aVar2.f10013b) != null) {
                aVar.f10014c = obj;
                if (aVar instanceof e7.l) {
                    ((e7.l) aVar).d();
                }
            }
        }
        o7.a aVar3 = (o7.a) arrayList.get(i6);
        if ((aVar3.f10013b == null || aVar3.f10014c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
