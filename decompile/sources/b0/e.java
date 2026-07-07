package b0;

import bg.c0;
import com.unity3d.services.UnityAdsConstants;
import ie.s;
import ie.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1227a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1228b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1229c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1230d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1231e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f1232f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f1233g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1234h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1235i;

    public /* synthetic */ e() {
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [b0.l, java.lang.Object] */
    public void a(f fVar, int i6, ArrayList arrayList, l lVar) {
        o oVar = fVar.f1239d;
        l lVar2 = oVar.f1262c;
        f fVar2 = oVar.f1268i;
        f fVar3 = oVar.f1267h;
        if (lVar2 == null) {
            a0.e eVar = (a0.e) this.f1230d;
            if (oVar != eVar.f36d) {
                l lVar3 = lVar;
                if (oVar != eVar.f38e) {
                    if (lVar == null) {
                        ?? obj = new Object();
                        obj.f1250a = null;
                        obj.f1251b = new ArrayList();
                        obj.f1250a = oVar;
                        arrayList.add(obj);
                        lVar3 = obj;
                    }
                    oVar.f1262c = lVar3;
                    lVar3.f1251b.add(oVar);
                    ArrayList arrayList2 = fVar3.f1245k;
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        d dVar = (d) obj2;
                        if (dVar instanceof f) {
                            a((f) dVar, i6, arrayList, lVar3);
                        }
                    }
                    ArrayList arrayList3 = fVar2.f1245k;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        d dVar2 = (d) obj3;
                        if (dVar2 instanceof f) {
                            a((f) dVar2, i6, arrayList, lVar3);
                        }
                    }
                    if (i6 == 1 && (oVar instanceof m)) {
                        ArrayList arrayList4 = ((m) oVar).f1252k.f1245k;
                        int size3 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            d dVar3 = (d) obj4;
                            if (dVar3 instanceof f) {
                                a((f) dVar3, i6, arrayList, lVar3);
                            }
                        }
                    }
                    ArrayList arrayList5 = fVar3.f1246l;
                    int size4 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        a((f) obj5, i6, arrayList, lVar3);
                    }
                    ArrayList arrayList6 = fVar2.f1246l;
                    int size5 = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size5) {
                        Object obj6 = arrayList6.get(i15);
                        i15++;
                        a((f) obj6, i6, arrayList, lVar3);
                    }
                    if (i6 == 1 && (oVar instanceof m)) {
                        ArrayList arrayList7 = ((m) oVar).f1252k.f1246l;
                        int size6 = arrayList7.size();
                        while (i10 < size6) {
                            Object obj7 = arrayList7.get(i10);
                            i10++;
                            a((f) obj7, i6, arrayList, lVar3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0266, code lost:
    
        if (r7[3].f26f != null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0269, code lost:
    
        r7 = r10;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026d, code lost:
    
        f(2, 0, r10, 0, r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0290, code lost:
    
        r7 = r10;
        r0 = r13;
        r6 = 1;
        r8 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00df, code lost:
    
        if (r15 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e1, code lost:
    
        if (r6 != r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00e3, code lost:
    
        f(2, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ec, code lost:
    
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0121, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0124, code lost:
    
        if (r15 != 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0126, code lost:
    
        f(2, 0, r6, 0, r12);
        r12.f36d.f1264e.f1247m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013a, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x013c, code lost:
    
        r0 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x013e, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0141, code lost:
    
        if (r0 != 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0144, code lost:
    
        r10 = r6;
        r0 = 3;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0148, code lost:
    
        f(1, (int) ((r4 * r24.q()) + 0.5f), r6, r12.k(), r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0177, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x017e, code lost:
    
        if (r7[0].f26f == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0184, code lost:
    
        if (r7[1].f26f != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0187, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0189, code lost:
    
        f(2, 0, r10, 0, r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ab, code lost:
    
        r10 = r6;
        r6 = 1;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00c6, code lost:
    
        if (r6 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        if (r13 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
    
        if (r13 != 3) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
    
        if (r6 == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        if (r6 != 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        r10 = r6;
        r0 = 3;
        r6 = 1;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01af, code lost:
    
        if (r10 != r0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b1, code lost:
    
        if (r13 == r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b3, code lost:
    
        if (r13 != r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b6, code lost:
    
        r7 = r10;
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b8, code lost:
    
        r6 = 1;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ba, code lost:
    
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0296, code lost:
    
        if (r0 != r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0298, code lost:
    
        if (r7 != r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x029a, code lost:
    
        if (r15 == r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029c, code lost:
    
        if (r1 != r6) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a0, code lost:
    
        if (r1 != 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a2, code lost:
    
        if (r15 != 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a6, code lost:
    
        if (r2[0] != r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02aa, code lost:
    
        if (r2[r6] != r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02ac, code lost:
    
        f(r8, (int) ((r4 * r24.q()) + 0.5f), r8, (int) ((r14 * r24.k()) + 0.5f), r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e1, code lost:
    
        f(2, 0, 2, 0, r12);
        r12.f36d.f1264e.f1247m = r12.q();
        r12.f38e.f1264e.f1247m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01be, code lost:
    
        if (r1 != r0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c0, code lost:
    
        if (r13 != r8) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c2, code lost:
    
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ca, code lost:
    
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d3, code lost:
    
        if (r12.X != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d5, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d7, code lost:
    
        f(1, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0200, code lost:
    
        if (r1 != 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0202, code lost:
    
        f(r13, 0, 2, 0, r12);
        r12.f38e.f1264e.f1247m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0217, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021a, code lost:
    
        if (r1 != 2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021c, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021e, code lost:
    
        if (r7 == r6) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0221, code lost:
    
        if (r7 != 4) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0224, code lost:
    
        r0 = r8;
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0227, code lost:
    
        f(r8, r12.q(), 1, (int) ((r14 * r24.k()) + 0.5f), r12);
        r12.f36d.f1264e.d(r12.q());
        r12.f38e.f1264e.d(r12.k());
        r12.f30a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0256, code lost:
    
        r0 = r8;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025e, code lost:
    
        if (r7[2].f26f == null) goto L135;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(a0.e r24) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.b(a0.e):void");
    }

    public void c() {
        a0.e eVar = (a0.e) this.f1230d;
        ArrayList arrayList = (ArrayList) this.f1233g;
        ArrayList arrayList2 = (ArrayList) this.f1232f;
        arrayList2.clear();
        a0.e eVar2 = (a0.e) this.f1231e;
        eVar2.f36d.f();
        eVar2.f38e.f();
        arrayList2.add(eVar2.f36d);
        arrayList2.add(eVar2.f38e);
        ArrayList arrayList3 = eVar2.f69q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList3.get(i6);
            i6++;
            a0.d dVar = (a0.d) obj;
            if (dVar instanceof a0.h) {
                o oVar = new o(dVar);
                dVar.f36d.f();
                dVar.f38e.f();
                oVar.f1265f = ((a0.h) dVar).f110u0;
                arrayList2.add(oVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f32b == null) {
                        dVar.f32b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f32b);
                } else {
                    arrayList2.add(dVar.f36d);
                }
                if (dVar.y()) {
                    if (dVar.f34c == null) {
                        dVar.f34c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f34c);
                } else {
                    arrayList2.add(dVar.f38e);
                }
                if (dVar instanceof a0.i) {
                    arrayList2.add(new o(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            o oVar2 = (o) obj3;
            if (oVar2.f1261b != eVar2) {
                oVar2.d();
            }
        }
        arrayList.clear();
        e(eVar.f36d, 0, arrayList);
        e(eVar.f38e, 1, arrayList);
        this.f1228b = false;
    }

    public int d(a0.e eVar, int i6) {
        o oVar;
        o oVar2;
        ArrayList arrayList;
        int i10;
        long j;
        float f3;
        long j10;
        a0.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f1233g;
        int size = arrayList2.size();
        long j11 = 0;
        int i11 = 0;
        long j12 = 0;
        while (i11 < size) {
            o oVar3 = ((l) arrayList2.get(i11)).f1250a;
            if (!(oVar3 instanceof c) ? !(i6 != 0 ? (oVar3 instanceof m) : (oVar3 instanceof k)) : ((c) oVar3).f1265f != i6) {
                arrayList = arrayList2;
                i10 = size;
                j = j11;
            } else {
                if (i6 == 0) {
                    oVar = eVar2.f36d;
                } else {
                    oVar = eVar2.f38e;
                }
                f fVar = oVar.f1267h;
                if (i6 == 0) {
                    oVar2 = eVar2.f36d;
                } else {
                    oVar2 = eVar2.f38e;
                }
                f fVar2 = oVar2.f1268i;
                f fVar3 = oVar3.f1267h;
                f fVar4 = oVar3.f1268i;
                boolean contains = fVar3.f1246l.contains(fVar);
                boolean contains2 = fVar4.f1246l.contains(fVar2);
                long j13 = oVar3.j();
                if (contains && contains2) {
                    long b10 = l.b(fVar3, j11);
                    long a10 = l.a(fVar4, j11);
                    long j14 = b10 - j13;
                    int i12 = fVar4.f1241f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j14 >= (-i12)) {
                        j14 += i12;
                    }
                    long j15 = fVar3.f1241f;
                    long j16 = ((-a10) - j13) - j15;
                    if (j16 >= j15) {
                        j16 -= j15;
                    }
                    a0.d dVar = oVar3.f1261b;
                    if (i6 == 0) {
                        f3 = dVar.f37d0;
                    } else if (i6 == 1) {
                        f3 = dVar.f39e0;
                    } else {
                        dVar.getClass();
                        f3 = -1.0f;
                    }
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        j10 = (((float) j14) / (1.0f - f3)) + (((float) j16) / f3);
                    } else {
                        j10 = 0;
                    }
                    float f10 = (float) j10;
                    j = (fVar3.f1241f + ((((f10 * f3) + 0.5f) + j13) + h8.c.f(1.0f, f3, f10, 0.5f))) - fVar4.f1241f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    if (contains) {
                        j = Math.max(l.b(fVar3, fVar3.f1241f), fVar3.f1241f + j13);
                    } else if (contains2) {
                        j = Math.max(-l.a(fVar4, fVar4.f1241f), (-fVar4.f1241f) + j13);
                    } else {
                        j = (oVar3.j() + fVar3.f1241f) - fVar4.f1241f;
                    }
                }
            }
            j12 = Math.max(j12, j);
            i11++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i10;
            j11 = 0;
        }
        return (int) j12;
    }

    public void e(o oVar, int i6, ArrayList arrayList) {
        f fVar = oVar.f1267h;
        f fVar2 = oVar.f1268i;
        ArrayList arrayList2 = fVar.f1245k;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i6, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f1267h, i6, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f1245k;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i6, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f1268i, i6, arrayList, null);
            }
        }
        if (i6 == 1) {
            ArrayList arrayList4 = ((m) oVar).f1252k.f1245k;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i6, arrayList, null);
                }
            }
        }
    }

    public void f(int i6, int i10, int i11, int i12, a0.d dVar) {
        b bVar = (b) this.f1235i;
        bVar.f1216a = i6;
        bVar.f1217b = i11;
        bVar.f1218c = i10;
        bVar.f1219d = i12;
        ((d0.f) this.f1234h).b(dVar, bVar);
        dVar.O(bVar.f1220e);
        dVar.L(bVar.f1221f);
        dVar.E = bVar.f1223h;
        dVar.I(bVar.f1222g);
    }

    public void g() {
        boolean z10;
        boolean z11;
        a aVar;
        e eVar = this;
        ArrayList arrayList = ((a0.e) eVar.f1230d).f69q0;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            int i10 = i6 + 1;
            a0.d dVar = (a0.d) arrayList.get(i6);
            if (!dVar.f30a) {
                int[] iArr = dVar.f59p0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = dVar.f61r;
                int i14 = dVar.s;
                if (i11 != 2 && (i11 != 3 || i13 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 != 2 && (i12 != 3 || i14 != 1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                g gVar = dVar.f36d.f1264e;
                boolean z12 = gVar.j;
                g gVar2 = dVar.f38e.f1264e;
                boolean z13 = gVar2.j;
                boolean z14 = z10;
                if (z12 && z13) {
                    eVar.f(1, gVar.f1242g, 1, gVar2.f1242g, dVar);
                    dVar.f30a = true;
                } else if (z12 && z11) {
                    f(1, gVar.f1242g, 2, gVar2.f1242g, dVar);
                    if (i12 == 3) {
                        dVar.f38e.f1264e.f1247m = dVar.k();
                    } else {
                        dVar.f38e.f1264e.d(dVar.k());
                        dVar.f30a = true;
                    }
                } else if (z13 && z14) {
                    f(2, gVar.f1242g, 1, gVar2.f1242g, dVar);
                    if (i11 == 3) {
                        dVar.f36d.f1264e.f1247m = dVar.q();
                    } else {
                        dVar.f36d.f1264e.d(dVar.q());
                        dVar.f30a = true;
                    }
                }
                if (dVar.f30a && (aVar = dVar.f38e.f1253l) != null) {
                    aVar.d(dVar.f31a0);
                }
                eVar = this;
            }
            i6 = i10;
        }
    }

    public String toString() {
        switch (this.f1227a) {
            case 1:
                Map map = (Map) this.f1235i;
                Long l10 = (Long) this.f1234h;
                Long l11 = (Long) this.f1233g;
                Long l12 = (Long) this.f1232f;
                Long l13 = (Long) this.f1231e;
                ArrayList arrayList = new ArrayList();
                if (this.f1228b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f1229c) {
                    arrayList.add("isDirectory");
                }
                if (l13 != null) {
                    arrayList.add("byteCount=" + l13);
                }
                if (l12 != null) {
                    arrayList.add("createdAt=" + l12);
                }
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11);
                }
                if (l10 != null) {
                    arrayList.add("lastAccessedAt=" + l10);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return ie.j.L(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(boolean z10, boolean z11, c0 c0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        kotlin.jvm.internal.k.e(extras, "extras");
        this.f1228b = z10;
        this.f1229c = z11;
        this.f1230d = c0Var;
        this.f1231e = l10;
        this.f1232f = l11;
        this.f1233g = l12;
        this.f1234h = l13;
        this.f1235i = w.D(extras);
    }

    public /* synthetic */ e(boolean z10, boolean z11, c0 c0Var, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, c0Var, l10, l11, l12, l13, s.f6847x);
    }
}
