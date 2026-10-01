package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class og extends dg implements fg {
    public static final tb B = new tb(1);
    public final Exception A;

    public og(UUID uuid, String str, Exception exc, xg xgVar) {
        super("<missing root>", uuid, str, xgVar);
        this.A = exc;
    }

    public static og i(xg xgVar) {
        UUID uuidB = kg.f2832c.b();
        String strA = dg.a(uuidB);
        y9.i0 i0Var = (y9.i0) jg.f2801a.get();
        if (!i0Var.isEmpty()) {
            i0Var.forEach(new ng(0));
        }
        return new og(uuidB, strA, B, xgVar);
    }

    @Override // com.google.android.gms.internal.measurement.fg
    public final pg W(String str, ug ugVar, boolean z2, xg xgVar) {
        if (z2) {
            AtomicReference atomicReference = jg.f2801a;
        }
        return new pg(str, this, ugVar, z2, xgVar);
    }

    @Override // com.google.android.gms.internal.measurement.fg
    public final Exception b() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final ug d() {
        return tg.f3119e;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final yg g0(String str, ug ugVar, xg xgVar) {
        AtomicReference atomicReference = jg.f2801a;
        return W(str, ugVar, true, xgVar);
    }
}
