package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class pg extends gg implements fg {
    public final Exception B;
    public final boolean C;

    /* JADX WARN: Multi-variable type inference failed */
    public pg(String str, fg fgVar, ug ugVar, boolean z2, xg xgVar) {
        super("<missing root>:".concat(str), (dg) fgVar, ug.a(ugVar, tg.f), xgVar);
        this.B = fgVar.b();
        this.C = z2;
    }

    @Override // com.google.android.gms.internal.measurement.fg
    public final pg W(String str, ug ugVar, boolean z2, xg xgVar) {
        boolean z10 = this.C;
        if (z2 && !z10) {
            AtomicReference atomicReference = jg.f2801a;
        }
        boolean z11 = true;
        if ((!z2 || z10) && !z10) {
            z11 = false;
        }
        return new pg(str, this, ugVar, z11, xgVar);
    }

    @Override // com.google.android.gms.internal.measurement.fg
    public final Exception b() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final ug c() {
        return tg.f3119e;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final yg g0(String str, ug ugVar, xg xgVar) {
        AtomicReference atomicReference = jg.f2801a;
        return W(str, ugVar, true, xgVar);
    }

    public pg(UUID uuid, String str, String str2, ug ugVar, Exception exc, xg xgVar) {
        super("<missing root>:".concat(str2), uuid, str, ug.a(ugVar, tg.f), xgVar);
        this.B = exc;
        this.C = false;
    }
}
