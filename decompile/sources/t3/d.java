package t3;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import r1.l0;
import u1.a0;
import u1.t;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public q f12573a;

    /* renamed from: b, reason: collision with root package name */
    public i f12574b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12575c;

    public final boolean b(p pVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(pVar, true) && (fVar.f12581a & 2) == 2) {
            int min = Math.min(fVar.f12585e, 8);
            t tVar = new t(min);
            pVar.C(tVar.f12811a, 0, min);
            tVar.K(0);
            if (tVar.a() >= 5 && tVar.y() == 127 && tVar.A() == 1179402563) {
                this.f12574b = new i();
                return true;
            }
            tVar.K(0);
            try {
                z10 = y2.a.B(1, tVar, true);
            } catch (l0 unused) {
                z10 = false;
            }
            if (z10) {
                this.f12574b = new i();
            } else {
                tVar.K(0);
                if (h.e(tVar, h.f12588o)) {
                    this.f12574b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override // y2.o
    public final void c(long j, long j10) {
        i iVar = this.f12574b;
        if (iVar != null) {
            e eVar = iVar.f12591a;
            f fVar = eVar.f12576a;
            fVar.f12581a = 0;
            fVar.f12582b = 0L;
            fVar.f12583c = 0;
            fVar.f12584d = 0;
            fVar.f12585e = 0;
            eVar.f12577b.H(0);
            eVar.f12578c = -1;
            eVar.f12580e = false;
            if (j == 0) {
                iVar.d(!iVar.f12601l);
                return;
            }
            if (iVar.f12598h != 0) {
                long j11 = (iVar.f12599i * j10) / 1000000;
                iVar.f12595e = j11;
                g gVar = iVar.f12594d;
                String str = a0.f12750a;
                gVar.q(j11);
                iVar.f12598h = 2;
            }
        }
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        try {
            return b(pVar);
        } catch (l0 unused) {
            return false;
        }
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, t3.g] */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r21, mc.i r22) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f12573a = qVar;
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}
