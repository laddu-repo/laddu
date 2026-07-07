package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // b0.d
    public final void a(d dVar) {
        a0.a aVar = (a0.a) this.f1261b;
        int i6 = aVar.f1s0;
        f fVar = this.f1267h;
        ArrayList arrayList = fVar.f1246l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i13 = ((f) obj).f1242g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i10 < i13) {
                i10 = i13;
            }
        }
        if (i6 != 0 && i6 != 2) {
            fVar.d(i10 + aVar.f3u0);
        } else {
            fVar.d(i12 + aVar.f3u0);
        }
    }

    @Override // b0.o
    public final void d() {
        a0.d dVar = this.f1261b;
        if (dVar instanceof a0.a) {
            f fVar = this.f1267h;
            fVar.f1237b = true;
            ArrayList arrayList = fVar.f1246l;
            a0.a aVar = (a0.a) dVar;
            int i6 = aVar.f1s0;
            boolean z10 = aVar.f2t0;
            int i10 = 0;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            fVar.f1240e = 7;
                            while (i10 < aVar.f113r0) {
                                a0.d dVar2 = aVar.f112q0[i10];
                                if (z10 || dVar2.f43g0 != 8) {
                                    f fVar2 = dVar2.f38e.f1268i;
                                    fVar2.f1245k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i10++;
                            }
                            m(this.f1261b.f38e.f1267h);
                            m(this.f1261b.f38e.f1268i);
                            return;
                        }
                        return;
                    }
                    fVar.f1240e = 6;
                    while (i10 < aVar.f113r0) {
                        a0.d dVar3 = aVar.f112q0[i10];
                        if (z10 || dVar3.f43g0 != 8) {
                            f fVar3 = dVar3.f38e.f1267h;
                            fVar3.f1245k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i10++;
                    }
                    m(this.f1261b.f38e.f1267h);
                    m(this.f1261b.f38e.f1268i);
                    return;
                }
                fVar.f1240e = 5;
                while (i10 < aVar.f113r0) {
                    a0.d dVar4 = aVar.f112q0[i10];
                    if (z10 || dVar4.f43g0 != 8) {
                        f fVar4 = dVar4.f36d.f1268i;
                        fVar4.f1245k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i10++;
                }
                m(this.f1261b.f36d.f1267h);
                m(this.f1261b.f36d.f1268i);
                return;
            }
            fVar.f1240e = 4;
            while (i10 < aVar.f113r0) {
                a0.d dVar5 = aVar.f112q0[i10];
                if (z10 || dVar5.f43g0 != 8) {
                    f fVar5 = dVar5.f36d.f1267h;
                    fVar5.f1245k.add(fVar);
                    arrayList.add(fVar5);
                }
                i10++;
            }
            m(this.f1261b.f36d.f1267h);
            m(this.f1261b.f36d.f1268i);
        }
    }

    @Override // b0.o
    public final void e() {
        a0.d dVar = this.f1261b;
        if (dVar instanceof a0.a) {
            int i6 = ((a0.a) dVar).f1s0;
            f fVar = this.f1267h;
            if (i6 != 0 && i6 != 1) {
                dVar.Z = fVar.f1242g;
            } else {
                dVar.Y = fVar.f1242g;
            }
        }
    }

    @Override // b0.o
    public final void f() {
        this.f1262c = null;
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
