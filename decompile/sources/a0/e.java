package a0;

import androidx.lifecycle.j1;
import b0.o;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final b0.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f69q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final j1 f70r0 = new j1(this);

    /* renamed from: s0, reason: collision with root package name */
    public final b0.e f71s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f72t0;

    /* renamed from: u0, reason: collision with root package name */
    public d0.f f73u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f74v0;

    /* renamed from: w0, reason: collision with root package name */
    public final y.c f75w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f76x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f77y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f78z0;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, b0.b] */
    public e() {
        b0.e eVar = new b0.e();
        eVar.f1228b = true;
        eVar.f1229c = true;
        eVar.f1232f = new ArrayList();
        new ArrayList();
        eVar.f1234h = null;
        eVar.f1235i = new Object();
        eVar.f1233g = new ArrayList();
        eVar.f1230d = this;
        eVar.f1231e = this;
        this.f71s0 = eVar;
        this.f73u0 = null;
        this.f74v0 = false;
        this.f75w0 = new y.c();
        this.f78z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new Object();
    }

    public static void V(d dVar, d0.f fVar, b0.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        int i10;
        if (fVar == null) {
            return;
        }
        int i11 = dVar.f43g0;
        int[] iArr = dVar.f62t;
        if (i11 != 8 && !(dVar instanceof h) && !(dVar instanceof a)) {
            int[] iArr2 = dVar.f59p0;
            bVar.f1216a = iArr2[0];
            bVar.f1217b = iArr2[1];
            bVar.f1218c = dVar.q();
            bVar.f1219d = dVar.k();
            bVar.f1224i = false;
            bVar.j = 0;
            if (bVar.f1216a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar.f1217b == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && dVar.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && dVar.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && dVar.t(0) && dVar.f61r == 0 && !z12) {
                bVar.f1216a = 2;
                if (z11 && dVar.s == 0) {
                    bVar.f1216a = 1;
                }
                z10 = false;
            }
            if (z11 && dVar.t(1) && dVar.s == 0 && !z13) {
                bVar.f1217b = 2;
                if (z10 && dVar.f61r == 0) {
                    bVar.f1217b = 1;
                }
                z11 = false;
            }
            if (dVar.A()) {
                bVar.f1216a = 1;
                z10 = false;
            }
            if (dVar.B()) {
                bVar.f1217b = 1;
                z11 = false;
            }
            if (z12) {
                if (iArr[0] == 4) {
                    bVar.f1216a = 1;
                } else if (!z11) {
                    if (bVar.f1217b == 1) {
                        i10 = bVar.f1219d;
                    } else {
                        bVar.f1216a = 2;
                        fVar.b(dVar, bVar);
                        i10 = bVar.f1221f;
                    }
                    bVar.f1216a = 1;
                    bVar.f1218c = (int) (dVar.W * i10);
                }
            }
            if (z13) {
                if (iArr[1] == 4) {
                    bVar.f1217b = 1;
                } else if (!z10) {
                    if (bVar.f1216a == 1) {
                        i6 = bVar.f1218c;
                    } else {
                        bVar.f1217b = 2;
                        fVar.b(dVar, bVar);
                        i6 = bVar.f1220e;
                    }
                    bVar.f1217b = 1;
                    if (dVar.X == -1) {
                        bVar.f1219d = (int) (i6 / dVar.W);
                    } else {
                        bVar.f1219d = (int) (dVar.W * i6);
                    }
                }
            }
            fVar.b(dVar, bVar);
            dVar.O(bVar.f1220e);
            dVar.L(bVar.f1221f);
            dVar.E = bVar.f1223h;
            dVar.I(bVar.f1222g);
            bVar.j = 0;
            return;
        }
        bVar.f1220e = 0;
        bVar.f1221f = 0;
    }

    @Override // a0.d
    public final void C() {
        this.f75w0.t();
        this.f76x0 = 0;
        this.f77y0 = 0;
        this.f69q0.clear();
        super.C();
    }

    @Override // a0.d
    public final void F(n9.j jVar) {
        super.F(jVar);
        int size = this.f69q0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((d) this.f69q0.get(i6)).F(jVar);
        }
    }

    @Override // a0.d
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f69q0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((d) this.f69q0.get(i6)).P(z10, z11);
        }
    }

    public final void R(d dVar, int i6) {
        if (i6 == 0) {
            int i10 = this.f78z0 + 1;
            b[] bVarArr = this.C0;
            if (i10 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i11 = this.f78z0;
            bVarArr2[i11] = new b(dVar, 0, this.f74v0);
            this.f78z0 = i11 + 1;
            return;
        }
        if (i6 == 1) {
            int i12 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i12 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i13 = this.A0;
            bVarArr4[i13] = new b(dVar, 1, this.f74v0);
            this.A0 = i13 + 1;
        }
    }

    public final void S(y.c cVar) {
        e eVar;
        y.c cVar2;
        int i6;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f69q0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f69q0.get(i10);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar2 = (d) this.f69q0.get(i11);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i12 = 0; i12 < aVar.f113r0; i12++) {
                        d dVar3 = aVar.f112q0[i12];
                        if (aVar.f2t0 || dVar3.c()) {
                            int i13 = aVar.f1s0;
                            if (i13 != 0 && i13 != 1) {
                                if (i13 == 2 || i13 == 3) {
                                    dVar3.S[1] = true;
                                }
                            } else {
                                dVar3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar4 = (d) this.f69q0.get(i14);
            dVar4.getClass();
            boolean z11 = dVar4 instanceof g;
            if (z11 || (dVar4 instanceof h)) {
                if (z11) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i15 = 0; i15 < gVar.f113r0; i15++) {
                    if (hashSet.contains(gVar.f112q0[i15])) {
                        gVar.b(cVar, W);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, W);
                }
                hashSet.clear();
            }
        }
        if (y.c.f14774q) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar5 = (d) this.f69q0.get(i16);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.f59p0[0] == 2) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, i6, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i17 = 0; i17 < size; i17++) {
                d dVar7 = (d) eVar.f69q0.get(i17);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f59p0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar7.M(1);
                    }
                    if (i19 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i18 == 2) {
                        dVar7.M(i18);
                    }
                    if (i19 == 2) {
                        dVar7.N(i19);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.f78z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    public final boolean T(int i6, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        b0.e eVar = this.f71s0;
        ArrayList arrayList = (ArrayList) eVar.f1232f;
        e eVar2 = (e) eVar.f1230d;
        int j = eVar2.j(0);
        int[] iArr = eVar2.f59p0;
        int j10 = eVar2.j(1);
        int r10 = eVar2.r();
        int s = eVar2.s();
        if (z10 && (j == 2 || j10 == 2)) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    o oVar = (o) obj;
                    if (oVar.f1265f == i6 && !oVar.k()) {
                        z13 = false;
                        break;
                    }
                } else {
                    z13 = z10;
                    break;
                }
            }
            if (i6 == 0) {
                if (z13 && j == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f36d.f1264e.d(eVar2.q());
                }
            } else if (z13 && j10 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f38e.f1264e.d(eVar2.k());
            }
        }
        if (i6 == 0) {
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int q9 = eVar2.q() + r10;
                eVar2.f36d.f1268i.d(q9);
                eVar2.f36d.f1264e.d(q9 - r10);
                z11 = true;
            }
            z11 = false;
        } else {
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int k8 = eVar2.k() + s;
                eVar2.f38e.f1268i.d(k8);
                eVar2.f38e.f1264e.d(k8 - s);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            o oVar2 = (o) obj2;
            if (oVar2.f1265f == i6 && (oVar2.f1261b != eVar2 || oVar2.f1266g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            o oVar3 = (o) obj3;
            if (oVar3.f1265f == i6 && (z11 || oVar3.f1261b != eVar2)) {
                if (!oVar3.f1267h.j || !oVar3.f1268i.j || (!(oVar3 instanceof b0.c) && !oVar3.f1264e.j)) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        eVar2.M(j);
        eVar2.N(j10);
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0673 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x081f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x082c A[LOOP:14: B:279:0x082a->B:280:0x082c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0607 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0631  */
    /* JADX WARN: Type inference failed for: r6v89, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e.U():void");
    }

    public final boolean W(int i6) {
        if ((this.D0 & i6) == i6) {
            return true;
        }
        return false;
    }

    @Override // a0.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.V);
        sb2.append("\n");
        ArrayList arrayList = this.f69q0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((d) obj).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
