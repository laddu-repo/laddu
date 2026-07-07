package p2;

import t1.o;
import w2.a0;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f {
    public final e E;
    public c F;
    public long G;
    public volatile boolean H;

    public k(y1.h hVar, y1.k kVar, o oVar, int i, Object obj, e eVar) {
        super(hVar, kVar, 2, oVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.E = eVar;
    }

    @Override // s2.k
    public final void c() {
        if (this.G == 0) {
            this.E.a(this.F, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            y1.k kVarC = this.f10209w.c(this.G);
            y yVar = this.D;
            w2.l lVar = new w2.l(yVar, kVarC.f14381e, yVar.h(kVarC));
            while (!this.H) {
                try {
                    int iG = this.E.f10203v.g(lVar, e.E);
                    boolean z2 = false;
                    w1.a.j(iG != 1);
                    if (iG == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        break;
                    }
                } finally {
                    this.G = lVar.f13837y - this.f10209w.f14381e;
                    a0 a0Var = this.E.C;
                }
            }
        } finally {
            android.support.v4.media.session.b.e(this.D);
        }
    }

    @Override // s2.k
    public final void j() {
        this.H = true;
    }
}
