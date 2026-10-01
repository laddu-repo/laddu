package b3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import mc.i;
import u1.t;
import y2.b0;
import y2.l;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1412a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1413b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f1414c;

    public a(int i6) {
        this.f1412a = i6;
        switch (i6) {
            case 1:
                this.f1413b = new t(4);
                this.f1414c = new b0("image/heif", -1, -1);
                return;
            case 2:
                this.f1413b = new t(4);
                this.f1414c = new b0("image/webp", -1, -1);
                return;
            default:
                this.f1413b = new t(4);
                this.f1414c = new b0("image/avif", -1, -1);
                return;
        }
    }

    @Override // y2.o
    public final void a() {
        int i6 = this.f1412a;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        switch (this.f1412a) {
            case 0:
                this.f1414c.c(j, j10);
                return;
            case 1:
                this.f1414c.c(j, j10);
                return;
            default:
                this.f1414c.c(j, j10);
                return;
        }
    }

    @Override // y2.o
    public final o d() {
        int i6 = this.f1412a;
        return this;
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        switch (this.f1412a) {
            case 0:
                l lVar = (l) pVar;
                lVar.b(4, false);
                t tVar = this.f1413b;
                tVar.H(4);
                lVar.k(tVar.f12811a, 0, 4, false);
                if (tVar.A() != 1718909296) {
                    return false;
                }
                tVar.H(4);
                lVar.k(tVar.f12811a, 0, 4, false);
                if (tVar.A() != 1635150182) {
                    return false;
                }
                return true;
            case 1:
                l lVar2 = (l) pVar;
                lVar2.b(4, false);
                t tVar2 = this.f1413b;
                tVar2.H(4);
                lVar2.k(tVar2.f12811a, 0, 4, false);
                if (tVar2.A() != 1718909296) {
                    return false;
                }
                tVar2.H(4);
                lVar2.k(tVar2.f12811a, 0, 4, false);
                if (tVar2.A() != 1751476579) {
                    return false;
                }
                return true;
            default:
                t tVar3 = this.f1413b;
                tVar3.H(4);
                l lVar3 = (l) pVar;
                lVar3.k(tVar3.f12811a, 0, 4, false);
                if (tVar3.A() != 1380533830) {
                    return false;
                }
                lVar3.b(4, false);
                tVar3.H(4);
                lVar3.k(tVar3.f12811a, 0, 4, false);
                if (tVar3.A() != 1464156752) {
                    return false;
                }
                return true;
        }
    }

    @Override // y2.o
    public final List h() {
        switch (this.f1412a) {
            case 0:
            case 1:
            default:
                i0 i0Var = k0.f4008y;
                return c1.B;
        }
    }

    @Override // y2.o
    public final int i(p pVar, i iVar) {
        switch (this.f1412a) {
            case 0:
                return this.f1414c.i(pVar, iVar);
            case 1:
                return this.f1414c.i(pVar, iVar);
            default:
                return this.f1414c.i(pVar, iVar);
        }
    }

    @Override // y2.o
    public final void l(q qVar) {
        switch (this.f1412a) {
            case 0:
                this.f1414c.l(qVar);
                return;
            case 1:
                this.f1414c.l(qVar);
                return;
            default:
                this.f1414c.l(qVar);
                return;
        }
    }

    private final void b() {
    }

    private final void e() {
    }

    private final void g() {
    }
}
