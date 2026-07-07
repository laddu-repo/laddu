package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends h {
    public final ArrayList A;
    public final ic.s B;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f2343z;

    public m(m mVar) {
        super(mVar.f2239x);
        ArrayList arrayList = new ArrayList(mVar.f2343z.size());
        this.f2343z = arrayList;
        arrayList.addAll(mVar.f2343z);
        ArrayList arrayList2 = new ArrayList(mVar.A.size());
        this.A = arrayList2;
        arrayList2.addAll(mVar.A);
        this.B = mVar.B;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n i(ic.s sVar, List list) {
        r rVar;
        ic.s C = this.B.C();
        t tVar = (t) C.f6782y;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2343z;
            int size = arrayList.size();
            rVar = n.f2352a;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                C.F((String) arrayList.get(i10), ((t) sVar.f6782y).c(sVar, (n) list.get(i10)));
            } else {
                C.F((String) arrayList.get(i10), rVar);
            }
            i10++;
        }
        ArrayList arrayList2 = this.A;
        int size2 = arrayList2.size();
        while (i6 < size2) {
            Object obj = arrayList2.get(i6);
            i6++;
            n nVar = (n) obj;
            n c10 = tVar.c(C, nVar);
            if (c10 instanceof o) {
                c10 = tVar.c(C, nVar);
            }
            if (c10 instanceof f) {
                return ((f) c10).f2201x;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n j() {
        return new m(this);
    }

    public m(String str, ArrayList arrayList, List list, ic.s sVar) {
        super(str);
        this.f2343z = new ArrayList();
        this.B = sVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                this.f2343z.add(((n) obj).f());
            }
        }
        this.A = new ArrayList(list);
    }
}
