package b0;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1225k;

    /* renamed from: l, reason: collision with root package name */
    public int f1226l;

    public c(a0.d dVar, int i6) {
        super(dVar);
        a0.d dVar2;
        o oVar;
        int i10;
        o oVar2;
        ArrayList arrayList = new ArrayList();
        this.f1225k = arrayList;
        this.f1265f = i6;
        a0.d dVar3 = this.f1261b;
        a0.d m9 = dVar3.m(i6);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m9;
            if (dVar3 == null) {
                break;
            } else {
                m9 = dVar3.m(this.f1265f);
            }
        }
        this.f1261b = dVar2;
        int i11 = this.f1265f;
        if (i11 == 0) {
            oVar = dVar2.f36d;
        } else if (i11 == 1) {
            oVar = dVar2.f38e;
        } else {
            oVar = null;
        }
        arrayList.add(oVar);
        a0.d l10 = dVar2.l(this.f1265f);
        while (l10 != null) {
            int i12 = this.f1265f;
            if (i12 == 0) {
                oVar2 = l10.f36d;
            } else if (i12 == 1) {
                oVar2 = l10.f38e;
            } else {
                oVar2 = null;
            }
            arrayList.add(oVar2);
            l10 = l10.l(this.f1265f);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            o oVar3 = (o) obj;
            int i14 = this.f1265f;
            if (i14 == 0) {
                oVar3.f1261b.f32b = this;
            } else if (i14 == 1) {
                oVar3.f1261b.f34c = this;
            }
        }
        if (this.f1265f == 0 && ((a0.e) this.f1261b.T).f74v0 && arrayList.size() > 1) {
            this.f1261b = ((o) arrayList.get(arrayList.size() - 1)).f1261b;
        }
        if (this.f1265f == 0) {
            i10 = this.f1261b.f47i0;
        } else {
            i10 = this.f1261b.f48j0;
        }
        this.f1226l = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0393, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // b0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(b0.d r28) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c.a(b0.d):void");
    }

    @Override // b0.o
    public final void d() {
        ArrayList arrayList = this.f1225k;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        a0.d dVar = ((o) arrayList.get(0)).f1261b;
        a0.d dVar2 = ((o) arrayList.get(size2 - 1)).f1261b;
        int i10 = this.f1265f;
        f fVar = this.f1268i;
        f fVar2 = this.f1267h;
        if (i10 == 0) {
            a0.c cVar = dVar.I;
            a0.c cVar2 = dVar2.K;
            f i11 = o.i(cVar, 0);
            int e10 = cVar.e();
            a0.d m9 = m();
            if (m9 != null) {
                e10 = m9.I.e();
            }
            if (i11 != null) {
                o.b(fVar2, i11, e10);
            }
            f i12 = o.i(cVar2, 0);
            int e11 = cVar2.e();
            a0.d n10 = n();
            if (n10 != null) {
                e11 = n10.K.e();
            }
            if (i12 != null) {
                o.b(fVar, i12, -e11);
            }
        } else {
            a0.c cVar3 = dVar.J;
            a0.c cVar4 = dVar2.L;
            f i13 = o.i(cVar3, 1);
            int e12 = cVar3.e();
            a0.d m10 = m();
            if (m10 != null) {
                e12 = m10.J.e();
            }
            if (i13 != null) {
                o.b(fVar2, i13, e12);
            }
            f i14 = o.i(cVar4, 1);
            int e13 = cVar4.e();
            a0.d n11 = n();
            if (n11 != null) {
                e13 = n11.L.e();
            }
            if (i14 != null) {
                o.b(fVar, i14, -e13);
            }
        }
        fVar2.f1236a = this;
        fVar.f1236a = this;
    }

    @Override // b0.o
    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1225k;
            if (i6 < arrayList.size()) {
                ((o) arrayList.get(i6)).e();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // b0.o
    public final void f() {
        this.f1262c = null;
        ArrayList arrayList = this.f1225k;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((o) obj).f();
        }
    }

    @Override // b0.o
    public final long j() {
        ArrayList arrayList = this.f1225k;
        int size = arrayList.size();
        long j = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j = r5.f1268i.f1241f + ((o) arrayList.get(i6)).j() + j + r5.f1267h.f1241f;
        }
        return j;
    }

    @Override // b0.o
    public final boolean k() {
        ArrayList arrayList = this.f1225k;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!((o) arrayList.get(i6)).k()) {
                return false;
            }
        }
        return true;
    }

    public final a0.d m() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1225k;
            if (i6 < arrayList.size()) {
                a0.d dVar = ((o) arrayList.get(i6)).f1261b;
                if (dVar.f43g0 != 8) {
                    return dVar;
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public final a0.d n() {
        ArrayList arrayList = this.f1225k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0.d dVar = ((o) arrayList.get(size)).f1261b;
            if (dVar.f43g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f1265f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        ArrayList arrayList = this.f1225k;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            sb2.append("<");
            sb2.append((o) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
