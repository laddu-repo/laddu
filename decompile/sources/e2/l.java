package e2;

import android.net.Uri;
import db.k0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j E;
    public final k7.d F;

    public l(r1.q qVar, k0 k0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(qVar, k0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) k0Var.get(0)).f4210a);
        long j = rVar.f4271e;
        if (j <= 0) {
            jVar = null;
        } else {
            jVar = new j(null, rVar.f4270d, j);
        }
        this.E = jVar;
        this.F = jVar == null ? new k7.d(new j(null, 0L, -1L), 6) : null;
    }

    @Override // e2.m
    public final String a() {
        return null;
    }

    @Override // e2.m
    public final d2.h d() {
        return this.F;
    }

    @Override // e2.m
    public final j e() {
        return this.E;
    }
}
