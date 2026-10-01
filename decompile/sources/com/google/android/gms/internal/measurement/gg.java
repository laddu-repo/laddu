package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class gg extends dg {
    public final ug A;

    public gg(String str, dg dgVar, ug ugVar, xg xgVar) {
        super(str, dgVar, xgVar);
        p4.v.j(ugVar.f3147c);
        this.A = ugVar;
    }

    @Override // com.google.android.gms.internal.measurement.yg
    public final ug d() {
        return ug.a(this.A, c());
    }

    public gg(String str, UUID uuid, String str2, ug ugVar, xg xgVar) {
        super(str, uuid, str2, xgVar);
        p4.v.j(ugVar.f3147c);
        this.A = ugVar;
    }
}
