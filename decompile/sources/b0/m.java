package b0;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f1252k;

    /* renamed from: l, reason: collision with root package name */
    public a f1253l;

    @Override // b0.d
    public final void a(d dVar) {
        float f3;
        float f10;
        float f11;
        int i6;
        if (y.e.c(this.j) != 3) {
            g gVar = this.f1264e;
            if (gVar.f1238c && !gVar.j && this.f1263d == 3) {
                a0.d dVar2 = this.f1261b;
                int i10 = dVar2.s;
                if (i10 != 2) {
                    if (i10 == 3) {
                        g gVar2 = dVar2.f36d.f1264e;
                        if (gVar2.j) {
                            int i11 = dVar2.X;
                            if (i11 != -1) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        i6 = 0;
                                        gVar.d(i6);
                                    } else {
                                        f3 = gVar2.f1242g;
                                        f10 = dVar2.W;
                                    }
                                } else {
                                    f11 = gVar2.f1242g * dVar2.W;
                                    i6 = (int) (f11 + 0.5f);
                                    gVar.d(i6);
                                }
                            } else {
                                f3 = gVar2.f1242g;
                                f10 = dVar2.W;
                            }
                            f11 = f3 / f10;
                            i6 = (int) (f11 + 0.5f);
                            gVar.d(i6);
                        }
                    }
                } else {
                    a0.d dVar3 = dVar2.T;
                    if (dVar3 != null) {
                        if (dVar3.f38e.f1264e.j) {
                            gVar.d((int) ((r5.f1242g * dVar2.f68z) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.f1267h;
            boolean z10 = fVar.f1238c;
            ArrayList arrayList = fVar.f1246l;
            if (z10) {
                f fVar2 = this.f1268i;
                boolean z11 = fVar2.f1238c;
                ArrayList arrayList2 = fVar2.f1246l;
                if (z11) {
                    if (!fVar.j || !fVar2.j || !gVar.j) {
                        if (!gVar.j && this.f1263d == 3) {
                            a0.d dVar4 = this.f1261b;
                            if (dVar4.f61r == 0 && !dVar4.y()) {
                                f fVar3 = (f) arrayList.get(0);
                                f fVar4 = (f) arrayList2.get(0);
                                int i12 = fVar3.f1242g + fVar.f1241f;
                                int i13 = fVar4.f1242g + fVar2.f1241f;
                                fVar.d(i12);
                                fVar2.d(i13);
                                gVar.d(i13 - i12);
                                return;
                            }
                        }
                        if (!gVar.j && this.f1263d == 3 && this.f1260a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar5 = (f) arrayList.get(0);
                            int i14 = (((f) arrayList2.get(0)).f1242g + fVar2.f1241f) - (fVar5.f1242g + fVar.f1241f);
                            int i15 = gVar.f1247m;
                            if (i14 < i15) {
                                gVar.d(i14);
                            } else {
                                gVar.d(i15);
                            }
                        }
                        if (gVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar6 = (f) arrayList.get(0);
                            f fVar7 = (f) arrayList2.get(0);
                            int i16 = fVar6.f1242g;
                            int i17 = fVar.f1241f + i16;
                            int i18 = fVar7.f1242g;
                            int i19 = fVar2.f1241f + i18;
                            float f12 = this.f1261b.f39e0;
                            if (fVar6 == fVar7) {
                                f12 = 0.5f;
                            } else {
                                i16 = i17;
                                i18 = i19;
                            }
                            fVar.d((int) ((((i18 - i16) - gVar.f1242g) * f12) + i16 + 0.5f));
                            fVar2.d(fVar.f1242g + gVar.f1242g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        a0.d dVar5 = this.f1261b;
        l(dVar5.J, dVar5.L, 1);
    }

    /* JADX WARN: Type inference failed for: r1v120, types: [b0.g, b0.a] */
    @Override // b0.o
    public final void d() {
        a0.d dVar;
        a0.d dVar2;
        a0.d dVar3;
        a0.d dVar4;
        f fVar = this.f1252k;
        a0.d dVar5 = this.f1261b;
        boolean z10 = dVar5.f30a;
        g gVar = this.f1264e;
        if (z10) {
            gVar.d(dVar5.k());
        }
        boolean z11 = gVar.j;
        ArrayList arrayList = gVar.f1245k;
        ArrayList arrayList2 = gVar.f1246l;
        f fVar2 = this.f1268i;
        f fVar3 = this.f1267h;
        if (!z11) {
            a0.d dVar6 = this.f1261b;
            this.f1263d = dVar6.f59p0[1];
            if (dVar6.E) {
                this.f1253l = new g(this);
            }
            int i6 = this.f1263d;
            if (i6 != 3) {
                if (i6 == 4 && (dVar4 = this.f1261b.T) != null && dVar4.f59p0[1] == 1) {
                    int k8 = (dVar4.k() - this.f1261b.J.e()) - this.f1261b.L.e();
                    o.b(fVar3, dVar4.f38e.f1267h, this.f1261b.J.e());
                    o.b(fVar2, dVar4.f38e.f1268i, -this.f1261b.L.e());
                    gVar.d(k8);
                    return;
                }
                if (i6 == 1) {
                    gVar.d(this.f1261b.k());
                }
            }
        } else if (this.f1263d == 4 && (dVar2 = (dVar = this.f1261b).T) != null && dVar2.f59p0[1] == 1) {
            o.b(fVar3, dVar2.f38e.f1267h, dVar.J.e());
            o.b(fVar2, dVar2.f38e.f1268i, -this.f1261b.L.e());
            return;
        }
        boolean z12 = gVar.j;
        if (z12) {
            a0.d dVar7 = this.f1261b;
            if (dVar7.f30a) {
                a0.c[] cVarArr = dVar7.Q;
                a0.c cVar = cVarArr[2];
                a0.c cVar2 = cVar.f26f;
                if (cVar2 != null && cVarArr[3].f26f != null) {
                    if (dVar7.y()) {
                        fVar3.f1241f = this.f1261b.Q[2].e();
                        fVar2.f1241f = -this.f1261b.Q[3].e();
                    } else {
                        f h4 = o.h(this.f1261b.Q[2]);
                        if (h4 != null) {
                            o.b(fVar3, h4, this.f1261b.Q[2].e());
                        }
                        f h10 = o.h(this.f1261b.Q[3]);
                        if (h10 != null) {
                            o.b(fVar2, h10, -this.f1261b.Q[3].e());
                        }
                        fVar3.f1237b = true;
                        fVar2.f1237b = true;
                    }
                    a0.d dVar8 = this.f1261b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.f31a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h11 = o.h(cVar);
                    if (h11 != null) {
                        o.b(fVar3, h11, this.f1261b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f1242g);
                        a0.d dVar9 = this.f1261b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.f31a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                a0.c cVar3 = cVarArr[3];
                if (cVar3.f26f != null) {
                    f h12 = o.h(cVar3);
                    if (h12 != null) {
                        o.b(fVar2, h12, -this.f1261b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f1242g);
                    }
                    a0.d dVar10 = this.f1261b;
                    if (dVar10.E) {
                        o.b(fVar, fVar3, dVar10.f31a0);
                        return;
                    }
                    return;
                }
                a0.c cVar4 = cVarArr[4];
                if (cVar4.f26f != null) {
                    f h13 = o.h(cVar4);
                    if (h13 != null) {
                        o.b(fVar, h13, 0);
                        o.b(fVar3, fVar, -this.f1261b.f31a0);
                        o.b(fVar2, fVar3, gVar.f1242g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof a0.i) && dVar7.T != null && dVar7.i(7).f26f == null) {
                    a0.d dVar11 = this.f1261b;
                    o.b(fVar3, dVar11.T.f38e.f1267h, dVar11.s());
                    o.b(fVar2, fVar3, gVar.f1242g);
                    a0.d dVar12 = this.f1261b;
                    if (dVar12.E) {
                        o.b(fVar, fVar3, dVar12.f31a0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z12 && this.f1263d == 3) {
            a0.d dVar13 = this.f1261b;
            int i10 = dVar13.s;
            if (i10 != 2) {
                if (i10 == 3 && !dVar13.y()) {
                    a0.d dVar14 = this.f1261b;
                    if (dVar14.f61r != 3) {
                        g gVar2 = dVar14.f36d.f1264e;
                        arrayList2.add(gVar2);
                        gVar2.f1245k.add(gVar);
                        gVar.f1237b = true;
                        arrayList.add(fVar3);
                        arrayList.add(fVar2);
                    }
                }
            } else {
                a0.d dVar15 = dVar13.T;
                if (dVar15 != null) {
                    g gVar3 = dVar15.f38e.f1264e;
                    arrayList2.add(gVar3);
                    gVar3.f1245k.add(gVar);
                    gVar.f1237b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        } else {
            gVar.b(this);
        }
        a0.d dVar16 = this.f1261b;
        a0.c[] cVarArr2 = dVar16.Q;
        a0.c cVar5 = cVarArr2[2];
        a0.c cVar6 = cVar5.f26f;
        if (cVar6 != null && cVarArr2[3].f26f != null) {
            if (dVar16.y()) {
                fVar3.f1241f = this.f1261b.Q[2].e();
                fVar2.f1241f = -this.f1261b.Q[3].e();
            } else {
                f h14 = o.h(this.f1261b.Q[2]);
                f h15 = o.h(this.f1261b.Q[3]);
                if (h14 != null) {
                    h14.b(this);
                }
                if (h15 != null) {
                    h15.b(this);
                }
                this.j = 4;
            }
            if (this.f1261b.E) {
                c(fVar, fVar3, 1, this.f1253l);
            }
        } else if (cVar6 != null) {
            f h16 = o.h(cVar5);
            if (h16 != null) {
                o.b(fVar3, h16, this.f1261b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f1261b.E) {
                    c(fVar, fVar3, 1, this.f1253l);
                }
                if (this.f1263d == 3) {
                    a0.d dVar17 = this.f1261b;
                    if (dVar17.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        k kVar = dVar17.f36d;
                        if (kVar.f1263d == 3) {
                            kVar.f1264e.f1245k.add(gVar);
                            arrayList2.add(this.f1261b.f36d.f1264e);
                            gVar.f1236a = this;
                        }
                    }
                }
            }
        } else {
            a0.c cVar7 = cVarArr2[3];
            if (cVar7.f26f != null) {
                f h17 = o.h(cVar7);
                if (h17 != null) {
                    o.b(fVar2, h17, -this.f1261b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f1261b.E) {
                        c(fVar, fVar3, 1, this.f1253l);
                    }
                }
            } else {
                a0.c cVar8 = cVarArr2[4];
                if (cVar8.f26f != null) {
                    f h18 = o.h(cVar8);
                    if (h18 != null) {
                        o.b(fVar, h18, 0);
                        c(fVar3, fVar, -1, this.f1253l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof a0.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.f38e.f1267h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f1261b.E) {
                        c(fVar, fVar3, 1, this.f1253l);
                    }
                    if (this.f1263d == 3) {
                        a0.d dVar18 = this.f1261b;
                        if (dVar18.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            k kVar2 = dVar18.f36d;
                            if (kVar2.f1263d == 3) {
                                kVar2.f1264e.f1245k.add(gVar);
                                arrayList2.add(this.f1261b.f36d.f1264e);
                                gVar.f1236a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f1238c = true;
        }
    }

    @Override // b0.o
    public final void e() {
        f fVar = this.f1267h;
        if (fVar.j) {
            this.f1261b.Z = fVar.f1242g;
        }
    }

    @Override // b0.o
    public final void f() {
        this.f1262c = null;
        this.f1267h.c();
        this.f1268i.c();
        this.f1252k.c();
        this.f1264e.c();
        this.f1266g = false;
    }

    @Override // b0.o
    public final boolean k() {
        if (this.f1263d == 3 && this.f1261b.s != 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        this.f1266g = false;
        f fVar = this.f1267h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f1268i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.f1252k;
        fVar3.c();
        fVar3.j = false;
        this.f1264e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f1261b.f45h0;
    }
}
