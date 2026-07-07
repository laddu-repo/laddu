package u2;

import android.net.Uri;
import q2.u;
import u1.a0;
import w1.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r implements l {
    public final z A;
    public final q B;
    public volatile Object C;

    /* renamed from: x, reason: collision with root package name */
    public final long f12871x = u.f10969b.getAndIncrement();

    /* renamed from: y, reason: collision with root package name */
    public final w1.l f12872y;

    /* renamed from: z, reason: collision with root package name */
    public final int f12873z;

    public r(w1.h hVar, w1.l lVar, int i6, q qVar) {
        this.A = new z(hVar);
        this.f12872y = lVar;
        this.f12873z = i6;
        this.B = qVar;
    }

    @Override // u2.l
    public final void h() {
        this.A.f13559y = 0L;
        w1.k kVar = new w1.k(this.A, this.f12872y);
        try {
            kVar.f13539x.y(kVar.f13540y);
            kVar.A = true;
            Uri z10 = this.A.f13558x.z();
            z10.getClass();
            this.C = this.B.h(z10, kVar);
        } finally {
            a0.g(kVar);
        }
    }

    @Override // u2.l
    public final void p() {
    }
}
