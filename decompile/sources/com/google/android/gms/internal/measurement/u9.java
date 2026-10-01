package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u9 extends h {
    public final boolean A;
    public final /* synthetic */ m4 B;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2461z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(m4 m4Var, boolean z10, boolean z11) {
        super("log");
        this.B = m4Var;
        this.f2461z = z10;
        this.A = z11;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n i(ic.s sVar, List list) {
        int i6;
        a8.a.x("log", 1, list);
        int size = list.size();
        r rVar = n.f2352a;
        m4 m4Var = this.B;
        if (size == 1) {
            ((a2.a2) m4Var.A).U(3, ((t) sVar.f6782y).c(sVar, (n) list.get(0)).f(), Collections.EMPTY_LIST, this.f2461z, this.A);
            return rVar;
        }
        n nVar = (n) list.get(0);
        t tVar = (t) sVar.f6782y;
        t tVar2 = (t) sVar.f6782y;
        int C = a8.a.C(tVar.c(sVar, nVar).b().doubleValue());
        if (C != 2) {
            if (C != 3) {
                if (C != 5) {
                    if (C != 6) {
                        i6 = 3;
                    } else {
                        i6 = 2;
                    }
                } else {
                    i6 = 5;
                }
            } else {
                i6 = 1;
            }
        } else {
            i6 = 4;
        }
        String f3 = tVar2.c(sVar, (n) list.get(1)).f();
        if (list.size() == 2) {
            ((a2.a2) m4Var.A).U(i6, f3, Collections.EMPTY_LIST, this.f2461z, this.A);
            return rVar;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
            arrayList.add(tVar2.c(sVar, (n) list.get(i10)).f());
        }
        ((a2.a2) m4Var.A).U(i6, f3, arrayList, this.f2461z, this.A);
        return rVar;
    }
}
