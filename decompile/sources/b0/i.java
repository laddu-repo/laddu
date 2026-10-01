package b0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // b0.d
    public final void a(d dVar) {
        f fVar = this.f1267h;
        if (!fVar.f1238c || fVar.j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f1246l.get(0)).f1242g * ((a0.h) this.f1261b).f106q0) + 0.5f));
    }

    @Override // b0.o
    public final void d() {
        a0.d dVar = this.f1261b;
        a0.h hVar = (a0.h) dVar;
        int i6 = hVar.f107r0;
        int i10 = hVar.f108s0;
        int i11 = hVar.f110u0;
        f fVar = this.f1267h;
        if (i11 == 1) {
            if (i6 != -1) {
                fVar.f1246l.add(dVar.T.f36d.f1267h);
                this.f1261b.T.f36d.f1267h.f1245k.add(fVar);
                fVar.f1241f = i6;
            } else if (i10 != -1) {
                fVar.f1246l.add(dVar.T.f36d.f1268i);
                this.f1261b.T.f36d.f1268i.f1245k.add(fVar);
                fVar.f1241f = -i10;
            } else {
                fVar.f1237b = true;
                fVar.f1246l.add(dVar.T.f36d.f1268i);
                this.f1261b.T.f36d.f1268i.f1245k.add(fVar);
            }
            m(this.f1261b.f36d.f1267h);
            m(this.f1261b.f36d.f1268i);
            return;
        }
        if (i6 != -1) {
            fVar.f1246l.add(dVar.T.f38e.f1267h);
            this.f1261b.T.f38e.f1267h.f1245k.add(fVar);
            fVar.f1241f = i6;
        } else if (i10 != -1) {
            fVar.f1246l.add(dVar.T.f38e.f1268i);
            this.f1261b.T.f38e.f1268i.f1245k.add(fVar);
            fVar.f1241f = -i10;
        } else {
            fVar.f1237b = true;
            fVar.f1246l.add(dVar.T.f38e.f1268i);
            this.f1261b.T.f38e.f1268i.f1245k.add(fVar);
        }
        m(this.f1261b.f38e.f1267h);
        m(this.f1261b.f38e.f1268i);
    }

    @Override // b0.o
    public final void e() {
        a0.d dVar = this.f1261b;
        int i6 = ((a0.h) dVar).f110u0;
        f fVar = this.f1267h;
        if (i6 == 1) {
            dVar.Y = fVar.f1242g;
        } else {
            dVar.Z = fVar.f1242g;
        }
    }

    @Override // b0.o
    public final void f() {
        this.f1267h.c();
    }

    @Override // b0.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f1267h;
        fVar2.f1245k.add(fVar);
        fVar.f1246l.add(fVar2);
    }
}
