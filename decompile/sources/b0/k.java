package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1249k = new int[2];

    public static void m(int[] iArr, int i6, int i10, int i11, int i12, float f3, int i13) {
        int i14 = i10 - i6;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    iArr[0] = i14;
                    iArr[1] = (int) ((i14 * f3) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i15 * f3) + 0.5f);
            iArr[1] = i15;
            return;
        }
        int i16 = (int) ((i15 * f3) + 0.5f);
        int i17 = (int) ((i14 / f3) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0246, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b0  */
    @Override // b0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(b0.d r24) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.k.a(b0.d):void");
    }

    @Override // b0.o
    public final void d() {
        a0.d dVar;
        a0.d dVar2;
        int i6;
        a0.d dVar3;
        a0.d dVar4;
        int i10;
        a0.d dVar5 = this.f1261b;
        boolean z10 = dVar5.f30a;
        g gVar = this.f1264e;
        if (z10) {
            gVar.d(dVar5.q());
        }
        boolean z11 = gVar.j;
        ArrayList arrayList = gVar.f1245k;
        ArrayList arrayList2 = gVar.f1246l;
        f fVar = this.f1268i;
        f fVar2 = this.f1267h;
        if (!z11) {
            a0.d dVar6 = this.f1261b;
            int i11 = dVar6.f59p0[0];
            this.f1263d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.T) != null && ((i10 = dVar4.f59p0[0]) == 1 || i10 == 4)) {
                    int q9 = (dVar4.q() - this.f1261b.I.e()) - this.f1261b.K.e();
                    o.b(fVar2, dVar4.f36d.f1267h, this.f1261b.I.e());
                    o.b(fVar, dVar4.f36d.f1268i, -this.f1261b.K.e());
                    gVar.d(q9);
                    return;
                }
                if (i11 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f1263d == 4 && (dVar2 = (dVar = this.f1261b).T) != null && ((i6 = dVar2.f59p0[0]) == 1 || i6 == 4)) {
            o.b(fVar2, dVar2.f36d.f1267h, dVar.I.e());
            o.b(fVar, dVar2.f36d.f1268i, -this.f1261b.K.e());
            return;
        }
        if (gVar.j) {
            a0.d dVar7 = this.f1261b;
            if (dVar7.f30a) {
                a0.c[] cVarArr = dVar7.Q;
                a0.c cVar = cVarArr[0];
                a0.c cVar2 = cVar.f26f;
                if (cVar2 != null && cVarArr[1].f26f != null) {
                    if (dVar7.x()) {
                        fVar2.f1241f = this.f1261b.Q[0].e();
                        fVar.f1241f = -this.f1261b.Q[1].e();
                        return;
                    }
                    f h4 = o.h(this.f1261b.Q[0]);
                    if (h4 != null) {
                        o.b(fVar2, h4, this.f1261b.Q[0].e());
                    }
                    f h10 = o.h(this.f1261b.Q[1]);
                    if (h10 != null) {
                        o.b(fVar, h10, -this.f1261b.Q[1].e());
                    }
                    fVar2.f1237b = true;
                    fVar.f1237b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h11 = o.h(cVar);
                    if (h11 != null) {
                        o.b(fVar2, h11, this.f1261b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f1242g);
                        return;
                    }
                    return;
                }
                a0.c cVar3 = cVarArr[1];
                if (cVar3.f26f != null) {
                    f h12 = o.h(cVar3);
                    if (h12 != null) {
                        o.b(fVar, h12, -this.f1261b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f1242g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof a0.i) && dVar7.T != null && dVar7.i(7).f26f == null) {
                    a0.d dVar8 = this.f1261b;
                    o.b(fVar2, dVar8.T.f36d.f1267h, dVar8.r());
                    o.b(fVar, fVar2, gVar.f1242g);
                    return;
                }
                return;
            }
        }
        if (this.f1263d == 3) {
            a0.d dVar9 = this.f1261b;
            int i12 = dVar9.f61r;
            if (i12 != 2) {
                if (i12 == 3) {
                    if (dVar9.s == 3) {
                        fVar2.f1236a = this;
                        fVar.f1236a = this;
                        m mVar = dVar9.f38e;
                        mVar.f1267h.f1236a = this;
                        mVar.f1268i.f1236a = this;
                        gVar.f1236a = this;
                        if (dVar9.y()) {
                            arrayList2.add(this.f1261b.f38e.f1264e);
                            this.f1261b.f38e.f1264e.f1245k.add(gVar);
                            m mVar2 = this.f1261b.f38e;
                            mVar2.f1264e.f1236a = this;
                            arrayList2.add(mVar2.f1267h);
                            arrayList2.add(this.f1261b.f38e.f1268i);
                            this.f1261b.f38e.f1267h.f1245k.add(gVar);
                            this.f1261b.f38e.f1268i.f1245k.add(gVar);
                        } else if (this.f1261b.x()) {
                            this.f1261b.f38e.f1264e.f1246l.add(gVar);
                            arrayList.add(this.f1261b.f38e.f1264e);
                        } else {
                            this.f1261b.f38e.f1264e.f1246l.add(gVar);
                        }
                    } else {
                        g gVar2 = dVar9.f38e.f1264e;
                        arrayList2.add(gVar2);
                        gVar2.f1245k.add(gVar);
                        this.f1261b.f38e.f1267h.f1245k.add(gVar);
                        this.f1261b.f38e.f1268i.f1245k.add(gVar);
                        gVar.f1237b = true;
                        arrayList.add(fVar2);
                        arrayList.add(fVar);
                        fVar2.f1246l.add(gVar);
                        fVar.f1246l.add(gVar);
                    }
                }
            } else {
                a0.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar3 = dVar10.f38e.f1264e;
                    arrayList2.add(gVar3);
                    gVar3.f1245k.add(gVar);
                    gVar.f1237b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        a0.d dVar11 = this.f1261b;
        a0.c[] cVarArr2 = dVar11.Q;
        a0.c cVar4 = cVarArr2[0];
        a0.c cVar5 = cVar4.f26f;
        if (cVar5 != null && cVarArr2[1].f26f != null) {
            if (dVar11.x()) {
                fVar2.f1241f = this.f1261b.Q[0].e();
                fVar.f1241f = -this.f1261b.Q[1].e();
                return;
            }
            f h13 = o.h(this.f1261b.Q[0]);
            f h14 = o.h(this.f1261b.Q[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            f h15 = o.h(cVar4);
            if (h15 != null) {
                o.b(fVar2, h15, this.f1261b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        a0.c cVar6 = cVarArr2[1];
        if (cVar6.f26f != null) {
            f h16 = o.h(cVar6);
            if (h16 != null) {
                o.b(fVar, h16, -this.f1261b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if (!(dVar11 instanceof a0.i) && (dVar3 = dVar11.T) != null) {
            o.b(fVar2, dVar3.f36d.f1267h, dVar11.r());
            c(fVar, fVar2, 1, gVar);
        }
    }

    @Override // b0.o
    public final void e() {
        f fVar = this.f1267h;
        if (fVar.j) {
            this.f1261b.Y = fVar.f1242g;
        }
    }

    @Override // b0.o
    public final void f() {
        this.f1262c = null;
        this.f1267h.c();
        this.f1268i.c();
        this.f1264e.c();
        this.f1266g = false;
    }

    @Override // b0.o
    public final boolean k() {
        if (this.f1263d == 3 && this.f1261b.f61r != 0) {
            return false;
        }
        return true;
    }

    public final void n() {
        this.f1266g = false;
        f fVar = this.f1267h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f1268i;
        fVar2.c();
        fVar2.j = false;
        this.f1264e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f1261b.f45h0;
    }
}
