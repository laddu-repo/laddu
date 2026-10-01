package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class mg extends eh {
    public final rg h(String str) {
        boolean z2;
        yg ygVarW;
        ug ugVar = tg.f3119e;
        xg xgVarB = jg.b();
        yg ygVar = xgVarB.f3233b;
        if (ygVar == qg.B) {
            ygVar = null;
            jg.a(xgVarB, null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (ygVar == null) {
            UUID uuidB = kg.f2832c.b();
            String strA = dg.a(uuidB);
            tb tbVar = og.B;
            y9.i0 i0Var = (y9.i0) jg.f2801a.get();
            if (!i0Var.isEmpty()) {
                i0Var.forEach(new ng(1));
            }
            ygVarW = new pg(uuidB, strA, str, ugVar, tbVar, xgVarB);
        } else {
            ygVarW = ygVar instanceof fg ? ((fg) ygVar).W(str, ugVar, false, xgVarB) : ygVar.g0(str, ugVar, xgVarB);
        }
        jg.a(xgVarB, ygVarW);
        return new rg(ygVarW, z2);
    }
}
