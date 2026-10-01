package b0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f1260a;

    /* renamed from: b, reason: collision with root package name */
    public a0.d f1261b;

    /* renamed from: c, reason: collision with root package name */
    public l f1262c;

    /* renamed from: d, reason: collision with root package name */
    public int f1263d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1264e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f1265f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1266g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f1267h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f1268i = new f(this);
    public int j = 1;

    public o(a0.d dVar) {
        this.f1261b = dVar;
    }

    public static void b(f fVar, f fVar2, int i6) {
        fVar.f1246l.add(fVar2);
        fVar.f1241f = i6;
        fVar2.f1245k.add(fVar);
    }

    public static f h(a0.c cVar) {
        a0.c cVar2 = cVar.f26f;
        if (cVar2 != null) {
            a0.d dVar = cVar2.f24d;
            int c10 = y.e.c(cVar2.f25e);
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                return null;
                            }
                            return dVar.f38e.f1252k;
                        }
                        return dVar.f38e.f1268i;
                    }
                    return dVar.f36d.f1268i;
                }
                return dVar.f38e.f1267h;
            }
            return dVar.f36d.f1267h;
        }
        return null;
    }

    public static f i(a0.c cVar, int i6) {
        o oVar;
        a0.c cVar2 = cVar.f26f;
        if (cVar2 != null) {
            a0.d dVar = cVar2.f24d;
            if (i6 == 0) {
                oVar = dVar.f36d;
            } else {
                oVar = dVar.f38e;
            }
            int c10 = y.e.c(cVar2.f25e);
            if (c10 != 1 && c10 != 2) {
                if (c10 != 3 && c10 != 4) {
                    return null;
                }
                return oVar.f1268i;
            }
            return oVar.f1267h;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i6, g gVar) {
        fVar.f1246l.add(fVar2);
        fVar.f1246l.add(this.f1264e);
        fVar.f1243h = i6;
        fVar.f1244i = gVar;
        fVar2.f1245k.add(fVar);
        gVar.f1245k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i6, int i10) {
        if (i10 == 0) {
            a0.d dVar = this.f1261b;
            int i11 = dVar.f64v;
            int max = Math.max(dVar.f63u, i6);
            if (i11 > 0) {
                max = Math.min(i11, i6);
            }
            if (max != i6) {
                return max;
            }
        } else {
            a0.d dVar2 = this.f1261b;
            int i12 = dVar2.f67y;
            int max2 = Math.max(dVar2.f66x, i6);
            if (i12 > 0) {
                max2 = Math.min(i12, i6);
            }
            if (max2 != i6) {
                return max2;
            }
        }
        return i6;
    }

    public long j() {
        if (this.f1264e.j) {
            return r0.f1242g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f1260a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(a0.c r12, a0.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.o.l(a0.c, a0.c, int):void");
    }
}
