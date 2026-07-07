package v3;

import db.c1;
import db.i0;
import db.k0;
import db.q;
import db.z0;
import java.util.List;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: z, reason: collision with root package name */
    public static final q f13265z = new q(new u2.i(2), z0.f4063y);

    /* renamed from: x, reason: collision with root package name */
    public final k0 f13266x;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f13267y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(db.c1 r19) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.b.<init>(db.c1):void");
    }

    @Override // v3.d
    public final int c(long j) {
        int a10 = a0.a(this.f13267y, j, false);
        if (a10 < this.f13266x.size()) {
            return a10;
        }
        return -1;
    }

    @Override // v3.d
    public final long e(int i6) {
        boolean z10;
        if (i6 < this.f13266x.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        return this.f13267y[i6];
    }

    @Override // v3.d
    public final List p(long j) {
        int e10 = a0.e(this.f13267y, j, false);
        if (e10 == -1) {
            i0 i0Var = k0.f4008y;
            return c1.B;
        }
        return (k0) this.f13266x.get(e10);
    }

    @Override // v3.d
    public final int s() {
        return this.f13266x.size();
    }
}
