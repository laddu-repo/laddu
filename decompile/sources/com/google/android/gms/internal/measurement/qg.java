package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class qg extends gg {
    public static final qg B;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        B = new qg("<skip trace>", uuidRandomUUID, dg.a(uuidRandomUUID), tg.f3119e, jg.b());
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final ug c() {
        return tg.f3119e;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final yg g0(String str, ug ugVar, xg xgVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }
}
