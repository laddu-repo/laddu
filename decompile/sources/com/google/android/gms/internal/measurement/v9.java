package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v9 extends h {
    public final HashMap A;

    /* renamed from: z, reason: collision with root package name */
    public final a6 f2478z;

    public v9(a6 a6Var) {
        super("require");
        this.A = new HashMap();
        this.f2478z = a6Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n i(ic.s sVar, List list) {
        n nVar;
        a8.a.w("require", 1, list);
        String f3 = ((t) sVar.f6782y).c(sVar, (n) list.get(0)).f();
        HashMap hashMap = this.A;
        if (hashMap.containsKey(f3)) {
            return (n) hashMap.get(f3);
        }
        HashMap hashMap2 = (HashMap) this.f2478z.f2145a;
        if (hashMap2.containsKey(f3)) {
            try {
                nVar = (n) ((Callable) hashMap2.get(f3)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(f3)));
            }
        } else {
            nVar = n.f2352a;
        }
        if (nVar instanceof h) {
            hashMap.put(f3, (h) nVar);
        }
        return nVar;
    }
}
