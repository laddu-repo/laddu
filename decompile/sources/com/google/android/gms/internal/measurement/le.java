package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2862a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2866e;

    /* JADX WARN: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public le(com.google.android.gms.internal.measurement.qc r31, com.google.android.gms.internal.measurement.ke r32) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.le.<init>(com.google.android.gms.internal.measurement.qc, com.google.android.gms.internal.measurement.ke):void");
    }

    public le(ne neVar, ke keVar) {
        ne.B().equals(neVar);
        this.f2863b = neVar.u();
        this.f2864c = neVar.v();
        int i = y9.i0.f14562x;
        Object[] objArr = y9.f1.D;
        int iZ = neVar.z() + 3;
        y9.p.d(iZ, "expectedSize");
        b3.a aVar = new b3.a(iZ);
        for (pe peVar : neVar.y()) {
            int iH = peVar.H();
            int i10 = iH - 1;
            if (iH == 0) {
                throw null;
            }
            if (i10 == 0) {
                aVar.r(peVar.u(), Long.valueOf(peVar.v()));
            } else if (i10 == 1) {
                aVar.r(peVar.u(), Boolean.valueOf(peVar.w()));
            } else if (i10 == 2) {
                aVar.r(peVar.u(), Double.valueOf(peVar.x()));
            } else if (i10 == 3) {
                aVar.r(peVar.u(), peVar.y());
            } else if (i10 == 4) {
                aVar.r(peVar.u(), peVar.z().k());
            }
        }
        aVar.r("__phenotype_server_token", neVar.w());
        aVar.r("__phenotype_snapshot_token", neVar.u());
        aVar.r("__phenotype_configuration_version", Long.valueOf(neVar.x()));
        this.f2865d = aVar.b(false);
        this.f2866e = keVar;
    }
}
