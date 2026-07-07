package r2;

import com.google.android.gms.internal.measurement.k4;
import j1.f0;
import r1.q;
import w1.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends e {
    public final d G;
    public f0 H;
    public long I;
    public volatile boolean J;

    public k(w1.h hVar, w1.l lVar, q qVar, int i6, Object obj, d dVar) {
        super(hVar, lVar, 2, qVar, i6, obj, -9223372036854775807L, -9223372036854775807L);
        this.G = dVar;
    }

    @Override // u2.l
    public final void h() {
        boolean z10;
        if (this.I == 0) {
            this.G.a(this.H, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            w1.l c10 = this.f11786y.c(this.I);
            z zVar = this.F;
            y2.l lVar = new y2.l(zVar, c10.f13546e, zVar.y(c10));
            while (!this.J) {
                try {
                    int i6 = this.G.f11782x.i(lVar, d.G);
                    boolean z11 = false;
                    if (i6 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.g(z10);
                    if (i6 == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        break;
                    }
                } finally {
                    this.I = lVar.A - this.f11786y.f13546e;
                    y2.z zVar2 = this.G.E;
                }
            }
        } finally {
            k4.f(this.F);
        }
    }

    @Override // u2.l
    public final void p() {
        this.J = true;
    }
}
