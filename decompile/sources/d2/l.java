package d2;

import a2.a1;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.p4;
import com.unity3d.services.core.device.MimeTypes;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o5.e0;
import r1.k0;
import r1.q;
import t2.s;
import u1.a0;
import u5.r;
import w1.v;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements r2.i {

    /* renamed from: a, reason: collision with root package name */
    public final u2.p f3741a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.h f3742b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3743c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3744d;

    /* renamed from: e, reason: collision with root package name */
    public final w1.h f3745e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3746f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3747g;

    /* renamed from: h, reason: collision with root package name */
    public final o f3748h;

    /* renamed from: i, reason: collision with root package name */
    public final j[] f3749i;
    public s j;

    /* renamed from: k, reason: collision with root package name */
    public e2.c f3750k;

    /* renamed from: l, reason: collision with root package name */
    public int f3751l;

    /* renamed from: m, reason: collision with root package name */
    public q2.b f3752m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3753n;

    /* JADX WARN: Type inference failed for: r0v0, types: [d2.l, java.lang.Object] */
    public l(p4 p4Var, u2.p pVar, e2.c cVar, c6.h hVar, int i6, int[] iArr, s sVar, int i10, w1.h hVar2, long j, int i11, boolean z10, ArrayList arrayList, o oVar) {
        j[] jVarArr;
        int i12;
        q qVar;
        e2.m mVar;
        y2.o jVar;
        r2.d dVar;
        ?? obj = new Object();
        obj.f3741a = pVar;
        obj.f3750k = cVar;
        obj.f3742b = hVar;
        obj.f3743c = iArr;
        obj.j = sVar;
        obj.f3744d = i10;
        obj.f3745e = hVar2;
        obj.f3751l = i6;
        obj.f3746f = j;
        obj.f3747g = i11;
        o oVar2 = oVar;
        obj.f3748h = oVar2;
        long d10 = cVar.d(i6);
        ArrayList i13 = obj.i();
        obj.f3749i = new j[sVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f3749i.length) {
            e2.m mVar2 = (e2.m) i13.get(sVar.j(i15));
            e2.b y9 = hVar.y(mVar2.f4258y);
            j[] jVarArr2 = lVar.f3749i;
            e2.b bVar = y9 == null ? (e2.b) mVar2.f4258y.get(i14) : y9;
            q qVar2 = mVar2.f4257x;
            p4Var.getClass();
            String str = qVar2.f11669m;
            if (k0.n(str)) {
                if (p4Var.f2388a) {
                    jVar = new v3.h(((p.l) p4Var.f2389b).c(qVar2), qVar2);
                } else {
                    dVar = null;
                    i12 = i15;
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    long j10 = d10;
                    jVarArr[i12] = new j(j10, mVar, bVar, dVar, 0L, mVar.d());
                    i15 = i12 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d10 = j10;
                    i14 = 0;
                }
            } else {
                if (str == null || (!str.startsWith(MimeTypes.VIDEO_WEBM) && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
                    if (Objects.equals(str, "image/jpeg")) {
                        jVar = new g3.a(1);
                    } else if (Objects.equals(str, "image/png")) {
                        jVar = new c3.a(1);
                    } else {
                        int i16 = z10 ? 4 : 0;
                        jVarArr = jVarArr2;
                        i12 = i15;
                        qVar = qVar2;
                        int i17 = p4Var.f2388a ? i16 : i16 | 32;
                        mVar = mVar2;
                        jVar = new s3.j((p.l) p4Var.f2389b, i17, null, null, arrayList, oVar2);
                    }
                } else {
                    i12 = i15;
                    mVar = mVar2;
                    qVar = qVar2;
                    jVarArr = jVarArr2;
                    jVar = new q3.d((p.l) p4Var.f2389b, p4Var.f2388a ? 1 : 3);
                }
                dVar = new r2.d(jVar, i10, qVar);
                long j102 = d10;
                jVarArr[i12] = new j(j102, mVar, bVar, dVar, 0L, mVar.d());
                i15 = i12 + 1;
                lVar = this;
                oVar2 = oVar;
                d10 = j102;
                i14 = 0;
            }
            i12 = i15;
            mVar = mVar2;
            qVar = qVar2;
            jVarArr = jVarArr2;
            dVar = new r2.d(jVar, i10, qVar);
            long j1022 = d10;
            jVarArr[i12] = new j(j1022, mVar, bVar, dVar, 0L, mVar.d());
            i15 = i12 + 1;
            lVar = this;
            oVar2 = oVar;
            d10 = j1022;
            i14 = 0;
        }
    }

    @Override // r2.i
    public final void a() {
        for (j jVar : this.f3749i) {
            r2.d dVar = (r2.d) jVar.f3737d;
            if (dVar != null) {
                dVar.f11782x.a();
            }
        }
    }

    @Override // r2.i
    public final void b() {
        q2.b bVar = this.f3752m;
        if (bVar == null) {
            this.f3741a.b();
            return;
        }
        throw bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r3 < (((r10.B() + r8) + r11) - 1)) goto L15;
     */
    @Override // r2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r20, a2.c2 r22) {
        /*
            r19 = this;
            r1 = r20
            r7 = r19
            d2.j[] r0 = r7.f3749i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L62
            r5 = r0[r4]
            java.lang.Object r6 = r5.f3740g
            d2.h r6 = (d2.h) r6
            long r8 = r5.f3736c
            java.lang.Object r10 = r5.f3740g
            d2.h r10 = (d2.h) r10
            if (r6 == 0) goto L5d
            long r11 = r5.d()
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L23
            goto L5d
        L23:
            u1.c.h(r10)
            long r3 = r5.f3735b
            long r3 = r10.s(r1, r3)
            long r3 = r3 + r8
            r13 = r3
            long r3 = r5.f(r13)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L56
            r15 = -1
            r17 = 1
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L4d
            u1.c.h(r10)
            long r15 = r10.B()
            long r15 = r15 + r8
            long r15 = r15 + r11
            long r15 = r15 - r17
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4d:
            long r8 = r13 + r17
            long r5 = r5.f(r8)
        L53:
            r0 = r22
            goto L58
        L56:
            r5 = r3
            goto L53
        L58:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5d:
            int r4 = r4 + 1
            r1 = r20
            goto L8
        L62:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.l.c(long, a2.c2):long");
    }

    @Override // r2.i
    public final void d(r2.e eVar) {
        y2.k kVar;
        if (eVar instanceof r2.k) {
            int g10 = this.j.g(((r2.k) eVar).A);
            j[] jVarArr = this.f3749i;
            j jVar = jVarArr[g10];
            if (((h) jVar.f3740g) == null) {
                r2.d dVar = (r2.d) jVar.f3737d;
                u1.c.h(dVar);
                z zVar = dVar.E;
                if (zVar instanceof y2.k) {
                    kVar = (y2.k) zVar;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    e2.m mVar = (e2.m) jVar.f3738e;
                    jVarArr[g10] = new j(jVar.f3735b, mVar, (e2.b) jVar.f3739f, (r2.d) jVar.f3737d, jVar.f3736c, new i(kVar, mVar.f4259z, 0));
                }
            }
        }
        o oVar = this.f3748h;
        if (oVar != null) {
            long j = oVar.f3762d;
            if (j == -9223372036854775807L || eVar.E > j) {
                oVar.f3762d = eVar.E;
            }
            oVar.f3763e.D = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [q2.b, java.io.IOException] */
    @Override // r2.i
    public final void e(a1 a1Var, long j, List list, p4 p4Var) {
        long j10;
        long j11;
        long Q;
        List list2;
        r2.l lVar;
        j[] jVarArr;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        boolean z11;
        long j16;
        long j17;
        long j18;
        int i6;
        long j19;
        int i10;
        Object jVar;
        int i11;
        boolean z12;
        e2.j jVar2;
        long Q2;
        long j20;
        long j21;
        boolean z13;
        if (this.f3752m == null) {
            long j22 = a1Var.f158a;
            long j23 = j - j22;
            long Q3 = a0.Q(this.f3750k.b(this.f3751l).f4245b) + a0.Q(this.f3750k.f4214a) + j;
            o oVar = this.f3748h;
            if (oVar != null) {
                p pVar = oVar.f3763e;
                e2.c cVar = pVar.C;
                j11 = -9223372036854775807L;
                r rVar = pVar.f3765y;
                if (!cVar.f4217d) {
                    j10 = j22;
                    z13 = false;
                } else if (pVar.E) {
                    j10 = j22;
                    z13 = true;
                } else {
                    j10 = j22;
                    Map.Entry ceilingEntry = pVar.B.ceilingEntry(Long.valueOf(cVar.f4221h));
                    if (ceilingEntry != null && ((Long) ceilingEntry.getValue()).longValue() < Q3) {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        g gVar = (g) rVar.f12916y;
                        long j24 = gVar.f3728k0;
                        if (j24 == -9223372036854775807L || j24 < longValue) {
                            gVar.f3728k0 = longValue;
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 && pVar.D) {
                        pVar.E = true;
                        pVar.D = false;
                        g gVar2 = (g) rVar.f12916y;
                        gVar2.f3718a0.removeCallbacks(gVar2.T);
                        gVar2.E();
                    }
                }
                if (z13) {
                    return;
                }
            } else {
                j10 = j22;
                j11 = -9223372036854775807L;
            }
            long Q4 = a0.Q(a0.A(this.f3746f));
            e2.c cVar2 = this.f3750k;
            long j25 = cVar2.f4214a;
            if (j25 == j11) {
                Q = j11;
            } else {
                Q = Q4 - a0.Q(j25 + cVar2.b(this.f3751l).f4245b);
            }
            e2.j jVar3 = null;
            if (list.isEmpty()) {
                list2 = list;
                lVar = null;
            } else {
                list2 = list;
                lVar = (r2.l) list2.get(list.size() - 1);
            }
            int length = this.j.length();
            r2.m[] mVarArr = new r2.m[length];
            int i12 = 0;
            while (true) {
                jVarArr = this.f3749i;
                if (i12 >= length) {
                    break;
                }
                j jVar4 = jVarArr[i12];
                h hVar = (h) jVar4.f3740g;
                ob.a aVar = r2.m.f11794q;
                if (hVar == null) {
                    mVarArr[i12] = aVar;
                    j20 = Q;
                } else {
                    long b10 = jVar4.b(Q4);
                    long c10 = jVar4.c(Q4);
                    if (lVar != null) {
                        j21 = lVar.a();
                        j20 = Q;
                    } else {
                        h hVar2 = (h) jVar4.f3740g;
                        u1.c.h(hVar2);
                        j20 = Q;
                        j21 = a0.j(hVar2.s(j, jVar4.f3735b) + jVar4.f3736c, b10, c10);
                    }
                    long j26 = j21;
                    if (j26 < b10) {
                        mVarArr[i12] = aVar;
                    } else {
                        mVarArr[i12] = new k(j(i12), j26, c10);
                    }
                }
                i12++;
                Q = j20;
            }
            long j27 = Q;
            if (!this.f3750k.f4217d || jVarArr[0].d() == 0) {
                j12 = j23;
                j13 = 0;
                j14 = j11;
            } else {
                long e10 = jVarArr[0].e(jVarArr[0].c(Q4));
                e2.c cVar3 = this.f3750k;
                long j28 = cVar3.f4214a;
                if (j28 == j11) {
                    j12 = j23;
                    Q2 = j11;
                } else {
                    j12 = j23;
                    Q2 = Q4 - a0.Q(j28 + cVar3.b(this.f3751l).f4245b);
                }
                long min = Math.min(Q2, e10) - j10;
                j13 = 0;
                j14 = Math.max(0L, min);
            }
            long j29 = j13;
            this.j.b(j10, j12, j14, list2, mVarArr);
            int d10 = this.j.d();
            SystemClock.elapsedRealtime();
            j j30 = j(d10);
            long j31 = j30.f3735b;
            long j32 = j30.f3736c;
            h hVar3 = (h) j30.f3740g;
            e2.b bVar = (e2.b) j30.f3739f;
            r2.d dVar = (r2.d) j30.f3737d;
            e2.m mVar = (e2.m) j30.f3738e;
            if (dVar != null) {
                if (dVar.F == null) {
                    jVar2 = mVar.D;
                } else {
                    jVar2 = null;
                }
                if (hVar3 == null) {
                    jVar3 = mVar.e();
                }
                j15 = j32;
                e2.j jVar5 = jVar3;
                if (jVar2 != null || jVar5 != null) {
                    q n10 = this.j.n();
                    int o10 = this.j.o();
                    Object r10 = this.j.r();
                    if (jVar2 != null) {
                        e2.j a10 = jVar2.a(jVar5, bVar.f4210a);
                        if (a10 != null) {
                            jVar2 = a10;
                        }
                    } else {
                        jVar5.getClass();
                        jVar2 = jVar5;
                    }
                    p4Var.f2389b = new r2.k(this.f3745e, a4.c(mVar, bVar.f4210a, jVar2, 0), n10, o10, r10, (r2.d) j30.f3737d);
                    return;
                }
            } else {
                j15 = j32;
            }
            if (this.f3750k.f4217d && this.f3751l == r8.f4225m.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && j31 == j11) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (j30.d() == j29) {
                p4Var.f2388a = z11;
                return;
            }
            long b11 = j30.b(Q4);
            long c11 = j30.c(Q4);
            if (z10) {
                long e11 = j30.e(c11);
                if ((e11 - j30.f(c11)) + e11 >= j31) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z11 &= z12;
            }
            if (lVar != null) {
                j17 = lVar.a();
                j16 = c11;
            } else {
                u1.c.h(hVar3);
                j16 = c11;
                j17 = a0.j(hVar3.s(j, j31) + j15, b11, j16);
            }
            long j33 = j17;
            if (j33 < b11) {
                this.f3752m = new IOException();
                return;
            }
            if (j33 <= j16 && (!this.f3753n || j33 < j16)) {
                if (z11 && j30.f(j33) >= j31) {
                    p4Var.f2388a = true;
                    return;
                }
                int min2 = (int) Math.min(this.f3747g, (j16 - j33) + 1);
                int i13 = (j31 > j11 ? 1 : (j31 == j11 ? 0 : -1));
                int i14 = 1;
                if (i13 != 0) {
                    while (min2 > 1 && j30.f((min2 + j33) - 1) >= j31) {
                        min2--;
                    }
                }
                if (list.isEmpty()) {
                    j18 = j;
                } else {
                    j18 = j11;
                }
                q n11 = this.j.n();
                int o11 = this.j.o();
                Object r11 = this.j.r();
                long f3 = j30.f(j33);
                u1.c.h(hVar3);
                e2.j h4 = hVar3.h(j33 - j15);
                w1.h hVar4 = this.f3745e;
                if (dVar == null) {
                    long e12 = j30.e(j33);
                    if (j30.g(j33, j27)) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    jVar = new r2.n(hVar4, a4.c(mVar, bVar.f4210a, h4, i11), n11, o11, r11, f3, e12, j33, this.f3744d, n11);
                } else {
                    e2.j jVar6 = h4;
                    int i15 = 1;
                    while (true) {
                        i6 = i13;
                        if (i14 >= min2) {
                            break;
                        }
                        u1.c.h(hVar3);
                        e2.j a11 = jVar6.a(hVar3.h((j33 + i14) - j15), bVar.f4210a);
                        if (a11 == null) {
                            break;
                        }
                        i15++;
                        i14++;
                        i13 = i6;
                        jVar6 = a11;
                    }
                    long j34 = (j33 + i15) - 1;
                    long e13 = j30.e(j34);
                    if (i6 != 0 && j31 <= e13) {
                        j19 = j31;
                    } else {
                        j19 = j11;
                    }
                    if (j30.g(j34, j27)) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w1.l c12 = a4.c(mVar, bVar.f4210a, jVar6, i10);
                    long j35 = -mVar.f4259z;
                    if (k0.m(n11.f11670n)) {
                        j35 += f3;
                    }
                    jVar = new r2.j(hVar4, c12, n11, o11, r11, f3, e13, j18, j19, j33, i15, j35, (r2.d) j30.f3737d);
                }
                p4Var.f2389b = jVar;
                return;
            }
            p4Var.f2388a = z11;
        }
    }

    @Override // r2.i
    public final int f(long j, List list) {
        if (this.f3752m == null && this.j.length() >= 2) {
            return this.j.k(j, list);
        }
        return list.size();
    }

    @Override // r2.i
    public final boolean g(long j, r2.e eVar, List list) {
        if (this.f3752m != null) {
            return false;
        }
        return this.j.e(j, eVar, list);
    }

    @Override // r2.i
    public final boolean h(r2.e eVar, boolean z10, y yVar, e0 e0Var) {
        long j;
        boolean z11;
        if (z10) {
            o oVar = this.f3748h;
            if (oVar != null) {
                long j10 = oVar.f3762d;
                if (j10 != -9223372036854775807L && j10 < eVar.D) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p pVar = oVar.f3763e;
                if (pVar.C.f4217d) {
                    if (!pVar.E) {
                        if (z11) {
                            if (pVar.D) {
                                pVar.E = true;
                                pVar.D = false;
                                g gVar = (g) pVar.f3765y.f12916y;
                                gVar.f3718a0.removeCallbacks(gVar.T);
                                gVar.E();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z12 = this.f3750k.f4217d;
            j[] jVarArr = this.f3749i;
            if (!z12 && (eVar instanceof r2.l)) {
                IOException iOException = (IOException) yVar.f7145z;
                if ((iOException instanceof v) && ((v) iOException).A == 404) {
                    j jVar = jVarArr[this.j.g(eVar.A)];
                    long d10 = jVar.d();
                    if (d10 != -1 && d10 != 0) {
                        h hVar = (h) jVar.f3740g;
                        u1.c.h(hVar);
                        if (((r2.l) eVar).a() > ((hVar.B() + jVar.f3736c) + d10) - 1) {
                            this.f3753n = true;
                            return true;
                        }
                    }
                }
            }
            j jVar2 = jVarArr[this.j.g(eVar.A)];
            e2.m mVar = (e2.m) jVar2.f3738e;
            e2.b bVar = (e2.b) jVar2.f3739f;
            db.k0 k0Var = mVar.f4258y;
            c6.h hVar2 = this.f3742b;
            e2.b y9 = hVar2.y(k0Var);
            if (y9 == null || bVar.equals(y9)) {
                s sVar = this.j;
                db.k0 k0Var2 = ((e2.m) jVar2.f3738e).f4258y;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = sVar.length();
                int i6 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (sVar.a(i10, elapsedRealtime)) {
                        i6++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < k0Var2.size(); i11++) {
                    hashSet.add(Integer.valueOf(((e2.b) k0Var2.get(i11)).f4212c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList h4 = hVar2.h(k0Var2);
                for (int i12 = 0; i12 < h4.size(); i12++) {
                    hashSet2.add(Integer.valueOf(((e2.b) h4.get(i12)).f4212c));
                }
                u2.h hVar3 = new u2.h(size, size - hashSet2.size(), length, i6);
                if (hVar3.a(2) || hVar3.a(1)) {
                    e0Var.getClass();
                    ef.g e10 = e0.e(hVar3, yVar);
                    if (e10 != null) {
                        long j11 = e10.f4581b;
                        int i13 = e10.f4580a;
                        if (hVar3.a(i13)) {
                            if (i13 == 2) {
                                s sVar2 = this.j;
                                return sVar2.p(sVar2.g(eVar.A), j11);
                            }
                            if (i13 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j11;
                                String str = bVar.f4211b;
                                HashMap hashMap = (HashMap) hVar2.f1981x;
                                if (hashMap.containsKey(str)) {
                                    Long l10 = (Long) hashMap.get(str);
                                    String str2 = a0.f12750a;
                                    j = Math.max(elapsedRealtime2, l10.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i14 = bVar.f4212c;
                                if (i14 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i14);
                                    HashMap hashMap2 = (HashMap) hVar2.f1982y;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l11 = (Long) hashMap2.get(valueOf);
                                        String str3 = a0.f12750a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList i() {
        List list = this.f3750k.b(this.f3751l).f4246c;
        ArrayList arrayList = new ArrayList();
        for (int i6 : this.f3743c) {
            arrayList.addAll(((e2.a) list.get(i6)).f4206c);
        }
        return arrayList;
    }

    public final j j(int i6) {
        j[] jVarArr = this.f3749i;
        j jVar = jVarArr[i6];
        e2.b y9 = this.f3742b.y(((e2.m) jVar.f3738e).f4258y);
        if (y9 != null && !y9.equals((e2.b) jVar.f3739f)) {
            j jVar2 = new j(jVar.f3735b, (e2.m) jVar.f3738e, y9, (r2.d) jVar.f3737d, jVar.f3736c, (h) jVar.f3740g);
            jVarArr[i6] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
