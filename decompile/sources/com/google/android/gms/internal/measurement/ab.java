package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends t7.h {
    @Override // t7.e, r7.c
    public final int a() {
        return 9410000;
    }

    @Override // t7.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof za ? (za) iInterfaceQueryLocalInterface : new za(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 0);
    }

    @Override // t7.e
    public final q7.d[] h() {
        return h.f2672d;
    }

    @Override // t7.e
    public final String n() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // t7.e
    public final String o() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
